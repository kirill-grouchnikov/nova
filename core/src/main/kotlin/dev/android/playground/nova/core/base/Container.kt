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

open class BooleanContainer : AttributeValue<Boolean> {
    constructor(flag: Boolean) : super(flag)
    constructor(resourceReference: String) : super(resourceReference)
}

class FloatContainer : AttributeValue<Float> {
    constructor(value: Float) : super(value)
    constructor(resourceReference: String) : super(resourceReference)
}

class StringContainer : AttributeValue<String> {
    constructor(text: String) : super(text)
}

class IntegerContainer : AttributeValue<Int> {
    constructor(value: Int) : super(value)
    constructor(resourceReference: String) : super(resourceReference)
}

class DimensionContainer : AttributeValue<Dimension> {
    constructor(dimension: Dimension) : super(dimension)
    constructor(resourceReference: String) : super(resourceReference)

    override fun render(builder: StringBuilder) {
        builder.append(getValue()!!.render())
    }
}

class StyleableEnumContainer(styleableEnum: Enum<*>) : AttributeValue<Enum<*>>(styleableEnum)

class StyleableFlagContainer(styleableFlags: List<Enum<*>>) :
        AttributeValue<List<Enum<*>>>(styleableFlags) {
    override fun render(builder: StringBuilder) {
        builder.append(getValue()!!.joinToString(separator = "|", transform = {it.name}))
    }
}


