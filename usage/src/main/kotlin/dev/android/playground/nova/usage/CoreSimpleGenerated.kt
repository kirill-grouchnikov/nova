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

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.generated.*
import dev.android.playground.nova.core.framework.styleables.*
import dev.android.playground.nova.core.framework.themes.*

fun simpleCoreGenerated() {

    theme(name = "MyMainTheme", parent = "Theme.Material") {
        // Simple attributes (can use primitive values or reference framework
        // application resources)
        windowActionModeOverlay = true
        windowActionBarOverlay = bool.action_bar_overlay
        actionMenuTextColor = android.color.background_light

        // Inline widget style (no need for a separate style object)
        actionModeStyle {
            background = color.action_mode_background
            height = 48.dp
        }

        // Deeper nesting of styles
        toolbarStyle {
            titleTextAppearance {
                textColor = android.color.holo_blue_dark
            }
        }

        // Note that there is no need to specify explicit parent for inline styles
        popupWindowStyle {
            popupElevation = 2.dp
            overlapAnchor = true
        }

        // Can specify only the specific attribute
        buttonStyle {
            backgroundTint = android.color.background_dark
        }

        // Can reference all resource types that are supported by the framework
        windowAnimationStyle {
            activityOpenEnterAnimation = android.anim.slide_in_left
            activityCloseEnterAnimation = android.anim.slide_out_right
        }

        // Inline nesting also works for attributes that point to themes
        dialogTheme {
            colorBackground = android.color.background_light
            windowMinWidthMinor = 600.dp
        }

        // Conditionals on attributes
        editTextColor {
            baseline use android.color.primary_text_dark
            landscape use android.color.primary_text_light
            allOf(landscape, night) use android.color.secondary_text_dark
        }
    }

    style(name = "MyStyle") {
        layout_width = 100.dp
        layout_height = CoreViewGroup_LayoutStyleable.LayoutHeightEnum.match_parent
    }

}

fun main() {
    initializeCoreDictionary()
    simpleCoreGenerated()
    for (entry in postInit()) {
        println("*** ${entry.key} ***")
        println(entry.value)
        println()
    }

}
