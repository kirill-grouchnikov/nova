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
import dev.android.playground.nova.core.framework.Gravity
import dev.android.playground.nova.core.framework.Orientation
import dev.android.playground.nova.core.framework.generated.*
import dev.android.playground.nova.core.framework.styleables.CoreViewGroup_LayoutStyleable
import dev.android.playground.nova.core.framework.themes.initializeCoreDictionary

fun style2(name: String, parentName: String? = null, parentStyle: CoreStyle2? = null,
           init: CoreStyle2.() -> Unit): CoreStyle2 {
    val style = CoreStyle2()
    style.init()
    style.myName = name
    if ((parentName != null) && (parentStyle != null)) {
        throw IllegalArgumentException("Should only specify one parent")
    }
    if (parentName != null) {
        style.parentName = parentName
    } else if (parentStyle != null) {
        style.parentName = parentStyle.myName
    }
    style.addToDictionary()
    return style
}

fun theme2(name: String, parent: String, init: CoreThemeStyle2.() -> Unit): CoreThemeStyle2 {
    val theme = CoreThemeStyle2()
    theme.init()
    theme.myName = name
    theme.parentName = parent
    theme.addToDictionary()
    return theme
}

fun theme2(name: String, parent: ParentCondition, init: CoreThemeStyle2.() -> Unit): CoreThemeStyle2 {
    val theme = CoreThemeStyle2()
    theme.init()
    theme.myName = name
    theme.parentCondition = parent
    theme.addToDictionary()
    return theme
}

fun simpleCoreGenerated() {

    theme2(name = "MyMainTheme", parent = "Theme.Material") {
        // Simple attributes (can use primitive values or reference framework
        // application resources)
        windowActionModeOverlay = true
        windowActionBarOverlay = bool.action_bar_overlay
        actionMenuTextColor = android.color.background_light

        // Inline widget style (no need for a separate style object)
        actionModeStyle {
            background = color.action_mode_background
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

    style2(name = "MyStyle") {
        // Enum field
        orientation = Orientation.horizontal
        // Flag field with one flag value
        gravity = +Gravity.end
        // Flag field with multiple flag values
        layout_gravity = Gravity.start and Gravity.top
        // Hybrid enum field - core dimension value
        layout_width = 100.dp
        // Hybrid enum field - enum value
        layout_height = CoreViewGroup_LayoutStyleable.LayoutHeightEnum.match_parent
    }

}

fun main(args: Array<String>) {
    initializeCoreDictionary()
    simple()
    for (entry in postInit()) {
        System.out.println("*** " + entry.key + " ***")
        System.out.println(entry.value)
        System.out.println()
    }

}
