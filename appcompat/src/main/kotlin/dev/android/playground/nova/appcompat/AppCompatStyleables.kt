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
package dev.android.playground.nova.appcompat

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.Gravity
import dev.android.playground.nova.core.framework.TextStyle
import dev.android.playground.nova.core.framework.Typeface


abstract class AppCompatThemeStyleable : BaseStyleable {
    @BooleanValue
    class windowActionModeOverlay

    @StringValue
    class actionMenuTextColor
}

abstract class AppCompatToolbarStyleable : BaseStyleable {
    @ReferenceValue
    class titleTextAppearance
}

abstract class AppCompatTextAppearanceStyleable : BaseStyleable {
    // Text color.
    @StringValue
    @UseAndroidNamespace
    class textColor

    // Size of the text. Recommended dimension type for text is "sp" for scaled-pixels (example: 15sp).
    @DimensionValue
    @UseAndroidNamespace
    class textSize

    // Color of the hint text.
    @StringValue
    @UseAndroidNamespace
    class textColorHint

    // Color of the links.
    @StringValue
    @UseAndroidNamespace
    class textColorLink

    // Style (bold, italic, bolditalic) for the text.
    @FlagValue(TextStyle::class)
    @UseAndroidNamespace
    class textStyle

    // Typeface (normal, sans, serif, monospace) for the text.
    @EnumValue(Typeface::class)
    @UseAndroidNamespace
    class typeface

    // Font family (named by string or as a font resource reference) for the text.
    @StringValue
    class fontFamily

    // Present the text in ALL CAPS. This may use a small-caps form when available.
    @BooleanValue
    class textAllCaps

    // Place a blurred shadow of text underneath the text, drawn with the
    // specified color. The text shadow produced does not interact with
    // properties on View that are responsible for real time shadows,
    // {@link android.R.styleable#View_elevation elevation} and
    // {@link android.R.styleable#View_translationZ translationZ}.
    @StringValue
    @UseAndroidNamespace
    class shadowColor

    // Horizontal offset of the text shadow.
    @FloatValue
    @UseAndroidNamespace
    class shadowDx

    // Vertical offset of the text shadow.
    @FloatValue
    @UseAndroidNamespace
    class shadowDy

    // Blur radius of the text shadow.
    @FloatValue
    @UseAndroidNamespace
    class shadowRadius
}

abstract class ActionModeStyleable : BaseStyleable {
    // Specifies a style to use for title text.
    @ReferenceValue
    class titleTextStyle

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    class subtitleTextStyle

    // Specifies a background for the action mode bar.
    @StringValue
    class background

    // Specifies a background for the split action mode bar.
    @StringValue
    class backgroundSplit

    // Specifies a fixed height for the action mode bar.
    @DimensionValue
    class height

    // Specifies a layout to use for the "close" item at the starting edge.
    @ReferenceValue
    class closeItemLayout
}

abstract class ToolbarStyleable : BaseStyleable {
    // Specifies a style to use for title text.
    @ReferenceValue
    class titleTextAppearance

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    class subtitleTextAppearance

    // Specifies title text.
    @StringValue
    class title

    // Specifies subtitle text.
    @StringValue
    class subtitle

    // Gravity
    @FlagValue(Gravity::class)
    @UseAndroidNamespace
    class gravity

    // Specifies extra space on the left, start, right and end sides
    // of the toolbar's title. Margin values should be positive.
    @DimensionValue
    class titleMargin

    // Specifies extra space on the start side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    class titleMarginStart

    // Specifies extra space on the end side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    class titleMarginEnd

    // Specifies extra space on the top side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    class titleMarginTop

    // Specifies extra space on the bottom side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    class titleMarginBottom

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetStart

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetEnd

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetLeft

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetRight

    // Minimum inset for content views within a bar when a navigation button
    // is present, such as the Up button. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetStartWithNavigation

    // Minimum inset for content views within a bar when actions from a menu
    // are present. Only valid for some themes and configurations.
    @DimensionValue
    class contentInsetEndWithActions

    @DimensionValue
    class maxButtonHeight

    // Enum for the button gravity
    enum class ButtonGravityMode(val value: Long) : StyleableFlag {
        top(0x30),
        bottom(0x50)
    }

    // Button gravity
    @FlagValue(ButtonGravityMode::class)
    class buttonGravity

    // Icon drawable to use for the collapse button.
    @StringValue
    class collapseIcon

    // Text to set as the content description for the collapse button. -->
    @StringValue
    class collapseContentDescription

    // Reference to a theme that should be used to inflate popups
    // shown by widgets in the toolbar.
    @ReferenceValue
    class popupTheme

    // Icon drawable to use for the navigation button located at
    // the start of the toolbar.
    @StringValue
    class navigationIcon

    // Text to set as the content description for the navigation button
    // located at the start of the toolbar.
    @StringValue
    class navigationContentDescription

    // Drawable to set as the logo that appears at the starting side of
    // the Toolbar, just after the navigation button.
    @StringValue
    class logo

    // A content description string to describe the appearance of the
    // associated logo image.
    @StringValue
    class logoDescription

    // A color to apply to the title string.
    @StringValue
    class titleTextColor

    // A color to apply to the subtitle string.
    @StringValue
    class subtitleTextColor

    @DimensionValue
    @UseAndroidNamespace
    class minHeight
}


