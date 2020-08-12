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

import dev.android.playground.nova.appcompat.appCompatTheme
import dev.android.playground.nova.core.base.parentCondition
import dev.android.playground.nova.core.framework.generated.android
import dev.android.playground.nova.core.framework.generated.primary_text_dark
import dev.android.playground.nova.core.framework.generated.primary_text_light

fun parentConditional() {

    appCompatTheme(name = "MyMainTheme",
            parent = parentCondition {
                baseline use "Theme.Material.Light"
                night use "Theme.Material"
            }) {

        actionMenuTextColor {
            baseline use android.color.primary_text_dark
            night use android.color.primary_text_light
        }

    }

}
