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
import kotlin.reflect.full.findAnnotation

@DslMarker
annotation class ThemeMarker

// **************************************************************
// Dealing with attributes in general
// **************************************************************


// We will need to support all resource types
interface DimenRes

interface LayoutRes
interface IdRes
interface StringRes
interface BooleanRes
interface FloatRes
interface ColorRes
interface FontRes

open class Dimension constructor(value: Int, unit: String) {
    private val rendered = "" + value + unit
    open fun render(): String {
        return rendered
    }
}

// **************************************************************
// Dealing with parsing themes
// **************************************************************

annotation class AttributeClass(val klass: KClass<*>)

class NoStyleable : BaseStyleable

@Target(AnnotationTarget.CLASS)
annotation class Inlineable(vararg val klass: KClass<out BaseStyleable>)

@Target(AnnotationTarget.CLASS)
annotation class SkipForDSL

@Target(AnnotationTarget.CLASS)
annotation class LocalizationSuggested

@Target(AnnotationTarget.CLASS)
annotation class UseAndroidNamespace

@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class RequiresApiLevel(val apiLevel: Int)

annotation class DefinedBy(val klass: KClass<*>)

annotation class Value

annotation class Reuse(val klass: KClass<*>)

annotation class Mandatory

annotation class Hide(vararg val klass: String)

annotation class ThemeDeprecated(val explanation: String)

annotation class IntegerMinValue(val min: Int)

annotation class LayoutStyleable(val klass: KClass<out BaseStyleable>)

annotation class InnerStyleable(vararg val klass: KClass<out BaseStyleable>)

annotation class SystemApi

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.CLASS)
@Value annotation class ReferenceValue

@Value annotation class BooleanValue
@Value annotation class IntegerValue
@Value annotation class FloatValue
@Value annotation class ColorValue
@Value annotation class LayoutValue
@Value annotation class ThemeValue
@Value annotation class StringValue
@Value annotation class DimensionValue
@Value annotation class FractionValue
@Value annotation class EnumValue(val klass: KClass<out StyleableEnum>)
@Value annotation class FlagValue(val klass: KClass<out StyleableFlag>)
@Value annotation class EnumAndBooleanValue(val klass: KClass<out StyleableEnumAndBoolean>)
@Value annotation class EnumAndDimensionValue(val klass: KClass<out StyleableEnumAndDimension>)
@Value annotation class EnumAndIntegerValue(val klass: KClass<out StyleableEnumAndInteger>)

class StyleAttribute

abstract class InlineStyle(name: String) : BaseBag(name), Cloneable {
    var shouldSkipRender: Boolean = false

    fun render(builder: StringBuilder, indent: String, generatedName: String?, parentName: String?) {
        val isEmpty = attributes.isEmpty() && styles.isEmpty()
        val parentBlock = if (parentName != null) " parent=\"$parentName\"" else ""
        if (isEmpty) {
            builder.append("$indent<style name=\"$generatedName\"$parentBlock />\n")
        } else {
            builder.append("$indent<style name=\"$generatedName\"$parentBlock>\n")
            for (c in attributes) {
                c.render(builder, "$indent    ")
            }
            for (nested in styles) {
                if (!nested.shouldSkipRender) {
                    builder.append("$indent    <item name=\"${nested.xmlTag}\">")
                    builder.append("@style/${generatedName}_${nested.xmlTag}")
                    builder.append("</item>\n")
                }
            }
            builder.append("$indent</style>\n")
        }
    }

    override fun clone(): Any {
        return super<BaseBag>.clone()
    }
}

fun parentCondition(init: ParentCondition.() -> Unit): ParentCondition {
    val parentCondition = ParentCondition()
    parentCondition.init()
    return parentCondition
}

// **************************************************************
// Dealing with what base themes (in appcompat for now) declare
// as style widgets and attributes
// **************************************************************

open class WidgetStyleDefinition(open val name: String, var parent: WidgetStyleDefinition?,
                                 val styleable: KClass<out BaseStyleable>? = null) {
    private val supportedAttributes = hashMapOf<String, KClass<*>>()
    val styles = hashMapOf<String, WidgetStyleDefinition>()
    val nullStyles = hashSetOf<String>()
    val attrRedirectionStyles = hashMapOf<String, String>()
    var hasAndroidNamespace : Boolean = false

    init {
        val styleableForAttrs = styleable ?: retrieveStyleable()

        if (styleableForAttrs != null) {
            for (nestedClass in styleableForAttrs.nestedClasses) {
                for (nestedClassAnnotation in nestedClass.annotations) {
                    if (nestedClassAnnotation.annotationClass.findAnnotation<Value>() != null) {
                        supportedAttributes[nestedClass.simpleName!!] =
                                nestedClassAnnotation.annotationClass::class
                    }
                }
            }
            hasAndroidNamespace = (styleableForAttrs.findAnnotation<UseAndroidNamespace>() != null)
        }
    }

    fun getStyleDefinition(styleName: String): WidgetStyleDefinition? {
        val fromHere = styles[styleName]
        if (fromHere != null) {
            return fromHere
        }
        return parent?.getStyleDefinition(styleName)
    }

    fun addStyle(style: WidgetStyleDefinition) {
        styles[style.name] = style
    }

    private fun retrieveStyleable(): KClass<out BaseStyleable>? {
        if (styleable != null) {
            return styleable
        }
        return parent?.retrieveStyleable()
    }
}

data class AppWidgetStyleDefinition(override val name: String) : WidgetStyleDefinition(name, null) {
    var generatedName: String? = null
}

data class ResourceDefinition(val tag: String, val name: String, val prefix: String,
                              val value: AttributeValue<Any>?)


// **************************************************************
// Sample code that illustrates what app developer would be doing
// **************************************************************

//object android {
//    object anim
//    object animator
//    object array
//    object attr
//    object bool
//    object color
//    object dimen
//    object drawable
//    object fraction
//    object id
//    object integer
//    object interpolator
//    object layout
//    object menu
//    object mipmap
//    object plurals
//    object raw
//    object string
//    object style
//    object styleable
//    object transition
//    object xml
//}

object anim
object animator
object array
object attr
object bool
object color
object dimen
object drawable
object fraction
object id
object integer
object interpolator
object layout
object menu
object mipmap
object plurals
object raw
object string
object style
object styleable
object transition
object xml

object font

fun hex(hexValue: String): StringContainer {
    return StringContainer(hexValue)
}

val Int.dp : Dimension get() = Dimension(toInt(), "dp")
val Int.px : Dimension get() = Dimension(toInt(), "px")
val Int.sp : Dimension get() = Dimension(toInt(), "sp")

//fun Int.dp(): Dimension {
//    return Dimension(toInt(), "dp")
//}
//
//fun Int.px(): Dimension {
//    return Dimension(toInt(), "px")
//}
//
//fun Int.sp(): Dimension {
//    return Dimension(toInt(), "sp")
//}

object matchParent : Dimension(0, "") {
    override fun render(): String {
        return "match_parent"
    }
}

object wrapContent : Dimension(0, "") {
    override fun render(): String {
        return "wrap_content"
    }
}

