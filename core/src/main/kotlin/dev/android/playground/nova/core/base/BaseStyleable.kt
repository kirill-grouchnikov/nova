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

interface BaseStyleable
interface StyleableEnum
interface StyleableFlag

interface StyleableEnumAndBoolean: StyleableEnum
interface StyleableEnumAndDimension: StyleableEnum
interface StyleableEnumAndInteger: StyleableEnum

inline infix fun <reified T> T.and(other: T): List<T> where T: StyleableFlag, T: Enum<T>  {
    return arrayListOf(this, other)
}

inline infix fun <reified T> List<T>.and(other: T): List<T> where T: StyleableFlag, T: Enum<T>  {
    val result = arrayListOf<T>()
    result.addAll(this)
    result.add(other)
    return result
}

inline operator fun <reified T> T.unaryPlus(): List<T> where T: StyleableFlag, T: Enum<T> {
    return arrayListOf(this)
}

