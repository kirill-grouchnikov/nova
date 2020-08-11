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
abstract class BaseCondition<T>(vararg val conditions: ResourceQualifier) {
    var value: AttributeValue<T>? = null
}

open class StringCondition(vararg conditions: ResourceQualifier) : BaseCondition<String>(*conditions) {
    infix fun use(inValue: StringContainer) {
        value = inValue
    }

    infix fun use(inValue: String) {
        value = StringContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class IntegerCondition(vararg conditions: ResourceQualifier) : BaseCondition<Int>(*conditions) {
    infix fun use(inValue: Int) {
        value = IntegerContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class DimensionCondition(vararg conditions: ResourceQualifier) : BaseCondition<Dimension>(*conditions) {
    infix fun use(inValue: Dimension) {
        value = DimensionContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class StyleableEnumCondition(vararg conditions: ResourceQualifier) : BaseCondition<Enum<*>>(*conditions) {
    infix fun use(inValue: Enum<*>) {
        value = StyleableEnumContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class StyleableFlagCondition(vararg conditions: ResourceQualifier) : BaseCondition<List<Enum<*>>>(*conditions) {
    infix fun use(inValue: ArrayList<Enum<*>>) {
        value = StyleableFlagContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class BooleanCondition(vararg conditions: ResourceQualifier) : BaseCondition<Boolean>(*conditions) {
    infix fun use(inValue: BooleanContainer) {
        value = inValue
    }

    infix fun use(inValue: Boolean) {
        value = BooleanContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

open class FloatCondition(vararg conditions: ResourceQualifier) : BaseCondition<Float>(*conditions) {
    infix fun use(inValue: FloatContainer) {
        value = inValue
    }

    infix fun use(inValue: Float) {
        value = FloatContainer(inValue)
    }

    fun getFirstCondition(): ResourceQualifier {
        return conditions[0]
    }
}

@ThemeMarker
class ParentCondition {
    var conditionalValue = arrayListOf<StringCondition>()

    private fun initCondition(condition: StringCondition, init: (StringCondition.() -> Unit)? = null): StringCondition {
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

    fun version(value: Int, init: (StringCondition.() -> Unit)? = null)
            = initCondition(StringCondition(PlatformVersion(value)), init)

    val baseline : StringCondition get() = initCondition(StringCondition(), null)

    val landscape : StringCondition get() = initCondition(StringCondition(Landscape()), null)

    val small : StringCondition get() = initCondition(StringCondition(Small()), null)

    val normal : StringCondition get() = initCondition(StringCondition(Normal()), null)

    val large : StringCondition get() = initCondition(StringCondition(Large()), null)

    val extralarge : StringCondition get() = initCondition(StringCondition(ExtraLarge()), null)
}


