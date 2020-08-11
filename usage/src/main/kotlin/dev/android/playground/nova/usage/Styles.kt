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
package dev.android.playground.nova.usage

import dev.android.playground.nova.appcompat.style
import dev.android.playground.nova.core.base.dp
import dev.android.playground.nova.core.base.matchParent

fun styles() {

    val simple = style(name = "SimpleStyle") {
        layoutWidth = 100.dp
        layoutHeight = matchParent
    }

    val conditional = style(name = "ConditionalStyle", parentStyle = simple) {
        layoutHeight {
            baseline use matchParent
            landscape use 600.dp
        }
    }

}
