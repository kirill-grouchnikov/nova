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
package dev.android.playground.nova.appcompat.themes

import dev.android.playground.nova.core.base.ThemeDefinition
import dev.android.playground.nova.core.base.WidgetStyleDefinition
import dev.android.playground.nova.core.framework.styleables.CoreToolbarStyleable
import dev.android.playground.nova.core.framework.themes.coreTheme
import dev.android.playground.nova.core.framework.themes.coreWidget

val appCompatWidget_Toolbar = WidgetStyleDefinition("Widget.AppCompat.Toolbar",
        coreWidget, CoreToolbarStyleable::class)
val appCompatTheme_Material = ThemeDefinition("Theme.AppCompat.Material", coreTheme, true)

fun initializeAppCompatDictionary() {
    appCompatTheme_Material.styles["toolbarStyle"] = appCompatWidget_Toolbar
}