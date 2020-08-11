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

@ThemeMarker
abstract class Attribute<T>(val name: String) {
    var value: AttributeValue<*>? = null
    var useAndroidNamespace: Boolean = false
    var targetApiLevel: Int = -1

    private var themeAttributeName: String? = null

    var conditionalValue = arrayListOf<BaseCondition<out Any>>()
    var generatedConditionalResourceName: String? = null
    var conditionalResourcePrefix: String? = null

    fun isConditional(): Boolean {
        return conditionalValue.isNotEmpty()
    }

    fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent<item name=\"")
        if (useAndroidNamespace) {
            builder.append("android:")
        }
        builder.append("$name\"")
        if (targetApiLevel > 0) {
            builder.append(" tools:targetApi=\"")
            builder.append(targetApiLevel)
            builder.append("\"")
        }
        builder.append(">")
        when {
            value != null -> value?.render(builder)
            themeAttributeName != null -> builder.append("?attr/" + themeAttributeName)
            else -> builder.append(conditionalResourcePrefix + "/" + generatedConditionalResourceName)
        }
        builder.append("</item>\n")
    }
}

open class AttributeValue<out T>(private val value: T?) {
    var resourceRef : String? = null
    constructor(resourceReference: String): this(null) {
        resourceRef = resourceReference
    }

//    var enumVal : Enum<*>? = null
//    constructor(enum: Enum<*>): this(null) {
//        enumVal = enum
//    }

    open fun render(builder: StringBuilder) {
        if (resourceRef != null) {
            builder.append(resourceRef)
//        } else if (enumVal != null) {
//            builder.append(enumVal!!.name)
        } else {
            builder.append(value)
        }
    }

    fun getValue(): T? {
        return value
    }

    fun getResourceReference(): String? {
        return resourceRef
    }
}

open class BooleanAttribute(name: String) : Attribute<Boolean>(name) {
    private fun initCondition(condition: BooleanCondition, init: (BooleanCondition.() -> Unit)? = null): BooleanCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (BooleanCondition.() -> Unit)? = null, vararg conditions: BooleanCondition): BooleanCondition {
        val combined = BooleanCondition(*conditions.map(BooleanCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: BooleanCondition, init: (BooleanCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (BooleanCondition.() -> Unit)? = null)
            = initCondition(BooleanCondition(SmallestWidth(value)), init)

    val night : BooleanCondition get() = initCondition(BooleanCondition(Night()), null)

    val landscape : BooleanCondition get() = initCondition(BooleanCondition(Landscape()), null)

    val small : BooleanCondition get() = initCondition(BooleanCondition(Small()), null)

    val normal : BooleanCondition get() = initCondition(BooleanCondition(Normal()), null)

    val large : BooleanCondition get() = initCondition(BooleanCondition(Large()), null)

    val extralarge : BooleanCondition get() = initCondition(BooleanCondition(ExtraLarge()), null)

    fun version(value: Int, init: (BooleanCondition.() -> Unit)? = null)
            = initCondition(BooleanCondition(PlatformVersion(value)), init)

    val baseline : BooleanCondition get() = initCondition(BooleanCondition(), null)
}

open class FloatAttribute(name: String) : Attribute<Float>(name) {
    private fun initCondition(condition: FloatCondition, init: (FloatCondition.() -> Unit)? = null): FloatCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (FloatCondition.() -> Unit)? = null, vararg conditions: FloatCondition): FloatCondition {
        val combined = FloatCondition(*conditions.map(FloatCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: FloatCondition, init: (FloatCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (FloatCondition.() -> Unit)? = null)
            = initCondition(FloatCondition(SmallestWidth(value)), init)

    val night : FloatCondition get() = initCondition(FloatCondition(Night()), null)

    val landscape : FloatCondition get() = initCondition(FloatCondition(Landscape()), null)

    val small : FloatCondition get() = initCondition(FloatCondition(Small()), null)

    val normal : FloatCondition get() = initCondition(FloatCondition(Normal()), null)

    val large : FloatCondition get() = initCondition(FloatCondition(Large()), null)

    val extralarge : FloatCondition get() = initCondition(FloatCondition(ExtraLarge()), null)

    fun version(value: Int, init: (FloatCondition.() -> Unit)? = null)
            = initCondition(FloatCondition(PlatformVersion(value)), init)

    val baseline : FloatCondition get() = initCondition(FloatCondition(), null)
}

open class StringAttribute(name: String) : Attribute<String>(name) {
    private fun initCondition(condition: StringCondition, init: (StringCondition.() -> Unit)?): StringCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (StringCondition.() -> Unit)? = null, vararg conditions: StringCondition): StringCondition {
        val combined = StringCondition(*conditions.map(StringCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: StringCondition, init: (StringCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (StringCondition.() -> Unit)? = null)
            = initCondition(StringCondition(SmallestWidth(value)), init)

    val night : StringCondition get() = initCondition(StringCondition(Night()), null)

    val landscape : StringCondition get() = initCondition(StringCondition(Landscape()), null)

    val small : StringCondition get() = initCondition(StringCondition(Small()), null)

    val normal : StringCondition get() = initCondition(StringCondition(Normal()), null)

    val large : StringCondition get() = initCondition(StringCondition(Large()), null)

    val extralarge : StringCondition get() = initCondition(StringCondition(ExtraLarge()), null)

    fun version(value: Int, init: (StringCondition.() -> Unit)? = null)
            = initCondition(StringCondition(PlatformVersion(value)), init)

    val baseline : StringCondition get() = initCondition(StringCondition(), null)
}

open class IntegerAttribute(name: String) : Attribute<Int>(name) {
    private fun initCondition(condition: IntegerCondition, init: (IntegerCondition.() -> Unit)?): IntegerCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (IntegerCondition.() -> Unit)? = null, vararg conditions: IntegerCondition): IntegerCondition {
        val combined = IntegerCondition(*conditions.map(IntegerCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: IntegerCondition, init: (IntegerCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (IntegerCondition.() -> Unit)? = null)
            = initCondition(IntegerCondition(SmallestWidth(value)), init)

    val night : IntegerCondition get() = initCondition(IntegerCondition(Night()), null)

    val landscape : IntegerCondition get() = initCondition(IntegerCondition(Landscape()), null)

    val small : IntegerCondition get() = initCondition(IntegerCondition(Small()), null)

    val normal : IntegerCondition get() = initCondition(IntegerCondition(Normal()), null)

    val large : IntegerCondition get() = initCondition(IntegerCondition(Large()), null)

    val extralarge : IntegerCondition get() = initCondition(IntegerCondition(ExtraLarge()), null)

    fun version(value: Int, init: (IntegerCondition.() -> Unit)? = null)
            = initCondition(IntegerCondition(PlatformVersion(value)), init)

    val baseline : IntegerCondition get() = initCondition(IntegerCondition(), null)
}

open class ColorAttribute(name: String): StringAttribute(name)
open class LayoutAttribute(name: String): StringAttribute(name)
open class ThemeAttribute(name: String): StringAttribute(name)

open class DimensionAttribute(name: String) : Attribute<Dimension>(name) {
    private fun initCondition(condition: DimensionCondition, init: (DimensionCondition.() -> Unit)?): DimensionCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (DimensionCondition.() -> Unit)? = null, vararg conditions: DimensionCondition): DimensionCondition {
        val combined = DimensionCondition(*conditions.map(DimensionCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: DimensionCondition, init: (DimensionCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (DimensionCondition.() -> Unit)? = null)
            = initCondition(DimensionCondition(SmallestWidth(value)), init)

    val night : DimensionCondition get() = initCondition(DimensionCondition(Night()), null)

    val landscape : DimensionCondition get() = initCondition(DimensionCondition(Landscape()), null)

    val small : DimensionCondition get() = initCondition(DimensionCondition(Small()), null)

    val normal : DimensionCondition get() = initCondition(DimensionCondition(Normal()), null)

    val large : DimensionCondition get() = initCondition(DimensionCondition(Large()), null)

    val extralarge : DimensionCondition get() = initCondition(DimensionCondition(ExtraLarge()), null)

    fun version(value: Int, init: (DimensionCondition.() -> Unit)? = null)
            = initCondition(DimensionCondition(PlatformVersion(value)), init)

    val baseline : DimensionCondition get() = initCondition(DimensionCondition(), null)
}

open class StyleableEnumAttribute(name: String) : Attribute<Enum<*>>(name) {
    private fun initCondition(condition: StyleableEnumCondition, init: (StyleableEnumCondition.() -> Unit)?):
            StyleableEnumCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (StyleableEnumCondition.() -> Unit)? = null,
                                      vararg conditions: StyleableEnumCondition): StyleableEnumCondition {
        val combined = StyleableEnumCondition(*conditions.map(StyleableEnumCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: StyleableEnumCondition, init: (StyleableEnumCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (StyleableEnumCondition.() -> Unit)? = null)
            = initCondition(StyleableEnumCondition(SmallestWidth(value)), init)

    val night : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(Night()), null)

    val landscape : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(Landscape()), null)

    val small : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(Small()), null)

    val normal : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(Normal()), null)

    val large : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(Large()), null)

    val extralarge : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(ExtraLarge()), null)

    fun version(value: Int, init: (StyleableEnumCondition.() -> Unit)? = null)
            = initCondition(StyleableEnumCondition(PlatformVersion(value)), init)

    val baseline : StyleableEnumCondition get() = initCondition(StyleableEnumCondition(), null)
}

open class StyleableFlagAttribute(name: String) : Attribute<Enum<*>>(name) {
    private fun initCondition(condition: StyleableFlagCondition, init: (StyleableFlagCondition.() -> Unit)?):
            StyleableFlagCondition {
        if (init != null) {
            condition.init()
        }
        conditionalValue.add(condition)
        return condition
    }

    private fun initCombinedCondition(init: (StyleableFlagCondition.() -> Unit)? = null,
                                      vararg conditions: StyleableFlagCondition): StyleableFlagCondition {
        val combined = StyleableFlagCondition(*conditions.map(StyleableFlagCondition::getFirstCondition).toTypedArray())
        if (init != null) {
            combined.init()
        }
        // This is to prevent child conditions in allOf to be treated as top-level conditions
        // that will contribute to the output files
        for (condition in conditions) {
            conditionalValue.remove(condition)
        }
        conditionalValue.add(combined)
        return combined
    }

    fun allOf(vararg conditions: StyleableFlagCondition, init: (StyleableFlagCondition.() -> Unit)? = null)
            = initCombinedCondition(init, *conditions)

    fun smallestWidth(value: Int, init: (StyleableFlagCondition.() -> Unit)? = null)
            = initCondition(StyleableFlagCondition(SmallestWidth(value)), init)

    val night : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(Night()), null)

    val landscape : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(Landscape()), null)

    val small : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(Small()), null)

    val normal : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(Normal()), null)

    val large : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(Large()), null)

    val extralarge : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(ExtraLarge()), null)

    fun version(value: Int, init: (StyleableFlagCondition.() -> Unit)? = null)
            = initCondition(StyleableFlagCondition(PlatformVersion(value)), init)

    val baseline : StyleableFlagCondition get() = initCondition(StyleableFlagCondition(), null)
}
