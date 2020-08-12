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
import dev.android.playground.nova.core.framework.manual.version

fun versionedAttrs() {

    appCompatTheme(name="MainTheme.CustomToolbar", parent="Theme.AppCompat.Light") {
        toolbarStyle {
            background = color.toolbar_background
        }
    }

    // This theme uses versioned blocks that allow specifying that a certain set
    // of attributes be used only on a certain version of the platform. The output
    // will have three entries for the same theme under the same name. The default
    // one will not have any attribute, the -v21 will have only windowTranslucentStatus
    // and -v23 will have only windowLightStatusBar
    appCompatTheme(name="MainTheme.CustomToolbar.LightStatusBar", parent="MainTheme.CustomToolbar") {
        version(21) {
            windowTranslucentStatus = true
        }
        version(23) {
            windowLightStatusBar = true
        }
    }

}
