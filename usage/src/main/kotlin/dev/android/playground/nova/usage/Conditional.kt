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
import dev.android.playground.nova.core.base.color

fun conditional() {

    appCompatTheme(name = "MyMainTheme", parent = "Theme.Material.Light") {
        // This attribute is a conditional with multiple selectors on one of the conditions.
        // The output will have <string> resources in the matching values.xml in -sw600dp-land,
        // -sw600dp and default.
        navigationBarColor {
            baseline use color.nav_bar
            smallestWidth(600) use color.nav_bar_wide
            allOf(smallestWidth(600), landscape) use color.nav_bar_wide_land
        }
    }

}
