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

import dev.android.playground.nova.appcompat.appCompatStyle
import dev.android.playground.nova.core.base.dp
import dev.android.playground.nova.core.framework.styleables.CoreViewGroup_LayoutStyleable

fun styles() {

    val simple = style(name = "SimpleStyle") {
        layout_width = 100.dp
        layout_height = CoreViewGroup_LayoutStyleable.LayoutHeightEnum.match_parent
    }

    val conditional = style(name = "ConditionalStyle", parentStyle = simple) {
        layout_height {
            baseline use CoreViewGroup_LayoutStyleable.LayoutWidthEnum.match_parent
            landscape use 600.dp
        }
    }

}
