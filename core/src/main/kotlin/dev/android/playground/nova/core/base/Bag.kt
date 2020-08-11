/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.android.playground.nova.core.base

import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.isSubclassOf

@ThemeMarker
abstract class Bag(var xmlTag: String) {
    var attributes = arrayListOf<Attribute<out Any>>()
    var styles = arrayListOf<InlineStyle>()
    var nullStyles = arrayListOf<String>()

    protected fun <T : Attribute<out Any>> initAttr(tag: T, init: T.() -> Unit): T {
        tag.init()
        attributes.add(tag)
        return tag
    }

    protected fun <T : Attribute<out Any>> initAttr(klass: KClass<*>,
                                                    init: T.() -> Unit): T {
        var tag: T?
        if (klass.findAnnotation<DimensionValue>() != null) {
            tag = (::DimensionAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<BooleanValue>() != null) {
            tag = (::BooleanAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<IntegerValue>() != null) {
            tag = (::IntegerAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<FloatValue>() != null) {
            tag = (::FloatAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<EnumValue>() != null) {
            tag = (::StyleableEnumAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<ColorValue>() != null) {
            tag = (::ColorAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<LayoutValue>() != null) {
            tag = (::LayoutAttribute)(klass.simpleName!!) as T
        } else if (klass.findAnnotation<ThemeValue>() != null) {
            tag = (::ThemeAttribute)(klass.simpleName!!) as T
        } else {
            tag = (::StringAttribute)(klass.simpleName!!) as T

        }
        tag.init()
        if (klass.findAnnotation<UseAndroidNamespace>() != null) {
            tag.useAndroidNamespace = true
        }
        val targetApi = klass.findAnnotation<RequiresApiLevel>()
        if (targetApi != null) {
            tag.targetApiLevel = targetApi.apiLevel
        }
        attributes.add(tag)
        return tag
    }

    protected fun <T : InlineStyle> initInlineStyle(tag: T, xmlTag: String, init: T.() -> Unit): T {
        tag.init()
        tag.xmlTag = xmlTag
        styles.add(tag)
        return tag
    }

    fun getInlineStyle(styleName: String): InlineStyle? {
        return styles.firstOrNull { styleName == it.xmlTag }
    }

    fun resetAttributes() {
        attributes = arrayListOf()
    }

    fun hasAndroidAnnotation(property: KProperty<*>): Boolean {
        val definedBy = property.findAnnotation<DefinedBy>()
        if (definedBy == null) {
            return false
        }
        var definedByKlass = definedBy.klass
        val reuse = definedByKlass.findAnnotation<Reuse>()
        if (reuse != null) {
            definedByKlass = reuse.klass
        }
        return definedByKlass.findAnnotation<UseAndroidNamespace>() != null
    }

    fun getTargetApiLevel(property: KProperty<*>): Int {
        val definedBy = property.findAnnotation<DefinedBy>()
        if (definedBy == null) {
            return -1
        }
        var definedByKlass = definedBy.klass
        val reuse = definedByKlass.findAnnotation<Reuse>()
        if (reuse != null) {
            definedByKlass = reuse.klass
        }
        return definedByKlass.findAnnotation<RequiresApiLevel>()?.apiLevel ?: -1
    }

    fun wrapValueAsAttribute(value: Any?, propertyName: String): Attribute<Any>? {
        var attr: Any? = null
        when (value!!) {
            is Boolean -> {
                attr = (::BooleanAttribute)(propertyName)
                attr.value = BooleanContainer(value as Boolean)
            }
            is BooleanContainer -> {
                attr = (::BooleanAttribute)(propertyName)
                attr.value = value as BooleanContainer
            }
            is String -> {
                attr = (::StringAttribute)(propertyName)
                attr.value = StringContainer(value as String)
            }
            is StringContainer -> {
                attr = (::StringAttribute)(propertyName)
                attr.value = value as StringContainer
            }
            is Int -> {
                attr = (::IntegerAttribute)(propertyName)
                attr.value = IntegerContainer(value as Int)
            }
            is Float -> {
                attr = (::FloatAttribute)(propertyName)
                attr.value = FloatContainer(value as Float)
            }
            is Dimension -> {
                attr = (::DimensionAttribute)(propertyName)
                attr.value = DimensionContainer(value as Dimension)
            }
        }
        return attr as Attribute<Any>
    }

    inner class GenericDelegate(vararg val supportedType: KClass<*>) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Any? {
            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Any?) {
            var attr: Any? = null
            for (candidateType in supportedType) {
                if (value!!::class.isSubclassOf(candidateType)) {
                    attr = wrapValueAsAttribute(value, property.name)
                    if (attr != null) {
                        break
                    }
                }
            }

            if (attr == null) {
                throw IllegalStateException("Passed value $value is of unsupported type for ${property.name}")
            }

            (attr as Attribute<Any>).useAndroidNamespace = hasAndroidAnnotation(property)
            (attr as Attribute<Any>).targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class GenericEnumDelegate<T : Enum<*>>(val enumClass: KClass<T>, vararg val supportedType: KClass<*>) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Any? {
            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Any?) {
            var attr: Any? = null
            if (value!!::class == enumClass) {
                attr = (::StyleableEnumAttribute)(property.name)
                attr.value = StyleableEnumContainer(value as Enum<*>)
            } else {
                for (candidateType in supportedType) {
                    if (value!!::class.isSubclassOf(candidateType)) {
                        attr = wrapValueAsAttribute(value, property.name)
                    }
                    if (attr != null) {
                        break
                    }
                }
            }

            if (attr == null) {
                throw IllegalStateException("Passed value $value is of unsupported type for ${property.name}")
            }

            (attr as Attribute<Any>).useAndroidNamespace = hasAndroidAnnotation(property)
            (attr as Attribute<Any>).targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class GenericFlagDelegate<T : Enum<*>>(val enumClass: KClass<T>) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Any? {
            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Any?) {
            var attr: StyleableFlagAttribute? = null
            if (value!!::class.isSubclassOf(List::class)) {
                val flagList = value as List<*>
                if (!flagList.all { it!!::class == enumClass }) {
                    throw IllegalStateException("Expecting all entries to be " + enumClass)
                }
                attr = (::StyleableFlagAttribute)(property.name)
                attr.value = StyleableFlagContainer(flagList as List<Enum<*>>)
            } else {
                throw IllegalStateException("Expecting the value to be a List")
            }

            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class BooleanDelegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Boolean? {
            for (attribute in attributes) {
                if (attribute::class == BooleanAttribute::class && attribute.name == property.name) {
                    return (attribute.value as BooleanAttribute).value!!.getValue() as Boolean?
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Boolean?) {
            val attr = (::BooleanAttribute)(property.name)
            attr.value = BooleanContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class FloatDelegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Float? {
            for (attribute in attributes) {
                if (attribute::class == FloatAttribute::class && attribute.name == property.name) {
                    return (attribute.value as FloatAttribute).value!!.getValue() as Float?
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Float?) {
            val attr = (::FloatAttribute)(property.name)
            attr.value = FloatContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class StringDelegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String? {
            for (attribute in attributes) {
                if (attribute::class == StringAttribute::class && attribute.name == property.name) {
                    return (attribute.value as StringAttribute).value!!.getValue() as String?
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
            val attr = (::StringAttribute)(property.name)
            attr.value = StringContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class StringValueDelegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): StringContainer? {
            for (attribute in attributes) {
                if (attribute::class == StringAttribute::class && attribute.name == property.name) {
                    return attribute.value as StringContainer
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: StringContainer?) {
            val attr = (::StringAttribute)(property.name)
            attr.value = value
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class DimensionValueDelegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Dimension? {
            for (attribute in attributes) {
                if (attribute::class == DimensionAttribute::class && attribute.name == property.name) {
                    return attribute.value as Dimension
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Dimension?) {
            val attr = (::DimensionAttribute)(property.name)
            attr.value = DimensionContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class StyleableEnumDelegate<T : Enum<*>> {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
            for (attribute in attributes) {
                if (attribute::class == StyleableEnumAttribute::class && attribute.name == property.name) {
                    return attribute.value as T
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
            val attr = (::StyleableEnumAttribute)(property.name)
            attr.value = StyleableEnumContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class StyleableFlagDelegate<T : List<Enum<*>>> {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
            for (attribute in attributes) {
                if (attribute::class == StyleableFlagAttribute::class && attribute.name == property.name) {
                    return attribute.value as T
                }
            }

            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
            val attr = (::StyleableFlagAttribute)(property.name)
            attr.value = StyleableFlagContainer(value!!)
            attr.useAndroidNamespace = hasAndroidAnnotation(property)
            attr.targetApiLevel = getTargetApiLevel(property)
            attributes.add(attr)
        }
    }

    inner class InlineStyleDelegate<T : InlineStyle> {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
            return null
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
            nullStyles.add(property.name)
        }
    }
}

open class BaseBag(name: String) : Bag(name), Cloneable {
    var myName: String? = null
    var parentName: String? = null
    var conditionalParentName: String? = null
    var parentCondition: ParentCondition? = null

    var conditionalBags = hashMapOf<ResourceQualifier, BaseBag>()

    fun <T : BaseBag> conditionalBag(
            resourceQualifier: ResourceQualifier, init: T.() -> Unit) {
        val style = this::class.java.newInstance()
        (style as T).init()
        this.conditionalBags[resourceQualifier] = style
    }

    open fun shouldGoIntoThemesXml(): Boolean {
        return false
    }

    private fun getParentNameInXml(): String? {
        return parentName ?: conditionalParentName
    }

    fun isParentConditional(): Boolean {
        return parentCondition != null
    }

    fun hasConditionalBags(): Boolean {
        return !conditionalBags.isEmpty()
    }

    fun getConditionalBags(): Map<ResourceQualifier, BaseBag> {
        return conditionalBags
    }

    fun clearConditionalBags() {
        conditionalBags.clear()
    }

    fun addAttributesFrom(baseBag: BaseBag) {
        for (attr in baseBag.attributes) {
            if (attr.isConditional()) {
                throw IllegalStateException("Cannot use conditional attributes in conditional blocks");
            }
        }
        attributes.addAll(baseBag.attributes);
    }

    private fun hasRenderableStyles(): Boolean {
        for (c in styles) {
            if (!c.shouldSkipRender) {
                return true
            }
        }
        return false
    }

    private fun renderBag(builder: StringBuilder, indent: String) {
        val noContent = attributes.isEmpty() && !hasRenderableStyles() && nullStyles.isEmpty()

        val parentName = getParentNameInXml()
        val parentThemeDefinition =
                if (parentName != null) ThemeDictionary.getThemeDefinition("", parentName!!) else null
        val isParentInAndroidNamespace =
                if (parentThemeDefinition != null) parentThemeDefinition!!.hasAndroidNamespace else false
        val stylePrefix = if (isParentInAndroidNamespace) "@android:style" else "@style"

        val parentBlurb = if (parentName == null) "" else " parent=\"" + stylePrefix + "/${getParentNameInXml()}\""
        if (noContent) {
            builder.append("$indent<$xmlTag name=\"${this.myName}\"${parentBlurb} />\n")
        } else {
            builder.append("$indent<$xmlTag name=\"${this.myName}\"${parentBlurb}>\n")
            for (c in attributes) {
                c.render(builder, "$indent    ")
            }
            for (c in styles) {
                if (!c.shouldSkipRender) {
                    builder.append("$indent    <item name=\"${c.xmlTag}\">")
                    builder.append("@style/${this.myName}_${c.xmlTag}")
                    builder.append("</item>\n")
                }
            }
            for (c in nullStyles) {
                builder.append("$indent    <item name=\"${c}\">")
                builder.append("@null")
                builder.append("</item>\n")
            }
            builder.append("$indent</$xmlTag>\n")
        }
    }

    private fun renderStyles(builder: StringBuilder, indent: String) {
        for (style in styles) {
            // Get the style definition for this style and its parent
            val myStyle = ThemeDictionary.getThemeDefinition("", this.myName!!)?.getChildStyleDefinition(style.xmlTag)
            val parentStyle = ThemeDictionary.getThemeDefinition("", getParentNameInXml()!!)?.getChildStyleDefinition(style.xmlTag)
            // Get the generated name for this style
            val myGeneratedName = (myStyle as AppWidgetStyleDefinition).generatedName
            // If the parent is from another app-defined theme, use the generated name
            // from that parent. Otherwise use parent's name directly
            val parentStyleName = if (parentStyle is AppWidgetStyleDefinition)
                parentStyle.generatedName else parentStyle?.name
            val isParentInAndroidNamespace =
                    if (parentStyleName != null) parentStyle!!.hasAndroidNamespace else false
            val parentStylePrefix = if (isParentInAndroidNamespace) "@android:style" else "@style"
            val parentStyleBlock = if (parentStyleName != null) parentStylePrefix + "/" + parentStyleName else null
            style.render(builder, indent, myGeneratedName, parentStyleBlock)

            for (nested in style.styles) {
                // Get the style definition for this style and its parent
                val myNestedStyle = ThemeDictionary.getThemeDefinition("", this.myName!!)?.
                        getNestedStyleDefinition(style.xmlTag, nested.xmlTag)
                val parentNestedStyle = ThemeDictionary.getThemeDefinition("", getParentNameInXml()!!)?.
                        getNestedStyleDefinition(style.xmlTag, nested.xmlTag)
                // Get the generated name for this style
                val myGeneratedNestedName = (myNestedStyle as AppWidgetStyleDefinition).generatedName
                // If the parent is from another app-defined theme, use the generated name
                // from that parent. Otherwise use parent's name directly
                val parentNestedStyleName = if (parentNestedStyle is AppWidgetStyleDefinition)
                    parentNestedStyle.generatedName else parentNestedStyle?.name
                val isParentNestedInAndroidNamespace =
                        if (parentNestedStyleName != null) parentNestedStyle!!.hasAndroidNamespace else false
                val parentNestedStylePrefix = if (isParentNestedInAndroidNamespace) "@android:style" else "@style"
                nested.render(builder, indent, myGeneratedNestedName,
                        parentNestedStylePrefix + "/" + parentNestedStyleName)
            }
        }
    }

    fun addToDictionary() {
        // Add this bag to our dictionary
        ThemeDictionary.putBag("", this)

        val appThemeDefinition = AppThemeDefinition(this.myName!!)
        appThemeDefinition.populateFromThemeStyles(this, this.myName)
        ThemeDictionary.putThemeDefinition("", appThemeDefinition)

        // If the parent of this theme is a conditional, we need to generate N parents
        // and add them to the dictionary
        if (this.isParentConditional()) {
            this.conditionalParentName = this.myName + "_GeneratedBase"
            for (parentCondition in this.parentCondition!!.conditionalValue) {
                val parentTheme = BaseBag("style")
                parentTheme.myName = this.conditionalParentName
                parentTheme.parentName = parentCondition.value?.getValue()
                if (parentTheme.parentName == null) {
                    parentTheme.parentName = parentCondition.value?.getResourceReference()
                }
                ThemeDictionary.putBag(parentCondition, parentTheme)

                val parentThemeDefinition = AppThemeDefinition(this.conditionalParentName!!)
                parentThemeDefinition.populateFromThemeStyles(this, this.conditionalParentName)
                ThemeDictionary.putThemeDefinition(parentCondition, parentThemeDefinition)
            }
        }
    }

    fun outputTheme(builder: StringBuilder, indent: String) {
        renderBag(builder, indent)
    }

    fun outputStyles(builder: StringBuilder, indent: String) {
        renderStyles(builder, indent)
    }

    override public fun clone(): Any {
        val result = super.clone() as BaseBag
        result.attributes = arrayListOf()
        result.attributes.addAll(attributes)
        result.styles = arrayListOf()
        result.styles.addAll(styles)
        result.conditionalBags = hashMapOf()
        result.conditionalBags.putAll(conditionalBags)
        return result
    }
}
