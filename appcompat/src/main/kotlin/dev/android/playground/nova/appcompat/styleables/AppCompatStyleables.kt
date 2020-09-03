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
package dev.android.playground.nova.appcompat.styleables

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.styleables.*

abstract class AppCompatBaseStyleable : BaseStyleable {
    @StringValue
    class title

    // Specifies a drawable to use for the 'home as up' indicator.
    @ReferenceValue
    class homeAsUpIndicator
}

abstract class AppCompatActionModeStyleable : BaseStyleable {
    // Specifies a style to use for title text.
    @Reuse(CoreActionBarStyleable.titleTextStyle::class)
    class titleTextStyle

    // Specifies a style to use for subtitle text.
    @Reuse(CoreActionBarStyleable.subtitleTextStyle::class)
    class subtitleTextStyle

    // Specifies a background for the action mode bar.
    @Reuse(CoreViewStyleable.background::class)
    class background

    // Specifies a background for the split action mode bar.
    @Reuse(CoreActionBarStyleable.backgroundSplit::class)
    class backgroundSplit

    // Specifies a fixed height for the action mode bar.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // Specifies a layout to use for the "close" item at the starting edge.
    @LayoutValue
    @UseAndroidNamespace
    class closeItemLayout
}

@UseAndroidNamespace
abstract class AppCompatActionBar_LayoutParamsStyleable : CoreViewGroup_MarginLayoutStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@LayoutStyleable(AppCompatActionBar_LayoutParamsStyleable::class)
@UseAndroidNamespace
abstract class AppCompatActionBarStyleable : CoreViewGroupStyleable() {
    enum class NavigationModeEnum(val value: Int) : StyleableEnum {
        normal(0),
        listMode(1),
        tabMode(2)
    }

    @EnumValue(NavigationModeEnum::class)
    class navigationMode

    enum class DisplayOptionsFlag(val value: Long) : StyleableFlag {
        none(0),
        useLogo(0x1),
        showHome(0x2),
        homeAsUp(0x4),
        showTitle(0x8),
        showCustom(0x10),
        disableHome(0x20)
    }

    @FlagValue(DisplayOptionsFlag::class)
    class displayOptions

    // Specifies title text used for navigationMode="normal".
    @Reuse(AppCompatBaseStyleable.title::class)
    class title

    // Specifies subtitle text used for navigationMode="normal".
    @StringValue
    class subtitle

    // Specifies a style to use for title text.
    @ReferenceValue
    class titleTextStyle

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    class subtitleTextStyle

    // Specifies the drawable used for the application icon.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // Specifies the drawable used for the application logo.
    @Reuse(ManifestStyleable.logo::class)
    class logo

    // Specifies the drawable used for item dividers.
    @Reuse(CoreListViewStyleable.divider::class)
    class divider

    // Specifies a background drawable for the action bar.
    @Reuse(CoreViewStyleable.background::class)
    class background

    // Specifies a background drawable for a second stacked row of the action bar.
    @StringValue
    class backgroundStacked

    // Specifies a background drawable for the bottom component of a split action bar.
    @StringValue
    class backgroundSplit

    // Specifies a layout for custom navigation. Overrides navigationMode.
    @LayoutValue
    class customNavigationLayout

    // Specifies a fixed height.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // Specifies a layout to use for the "home" section of the action bar.
    @LayoutValue
    class homeLayout

    // Specifies a style resource to use for an embedded progress bar.
    @Reuse(CoreThemeStyleable.progressBarStyle::class)
    class progressBarStyle

    // Specifies a style resource to use for an indeterminate progress spinner.
    @ReferenceValue
    class indeterminateProgressStyle

    // Specifies the horizontal padding on either end for an embedded progress bar.
    @DimensionValue
    class progressBarPadding

    // Up navigation glyph.
    @Reuse(AppCompatBaseStyleable.homeAsUpIndicator::class)
    class homeAsUpIndicator

    // Specifies padding that should be applied to the left and right sides of
    // system-provided items in the bar.
    @DimensionValue
    class itemPadding

    // Set true to hide the action bar on a vertical nested scroll of content.
    @BooleanValue
    class hideOnContentScroll

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

    // Elevation for the action bar itself.
    @Reuse(CoreViewStyleable.elevation::class)
    class elevation

    // Reference to a theme that should be used to inflate popups
    // shown by widgets in the action bar.
    @Reuse(CoreToolbarStyleable.popupTheme::class)
    class popupTheme
}

@UseAndroidNamespace
abstract class AppCompatToolbar_LayoutParamsStyleable : AppCompatActionBar_LayoutParamsStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@LayoutStyleable(AppCompatToolbar_LayoutParamsStyleable::class)
@UseAndroidNamespace
abstract class AppCompatToolbarStyleable : CoreViewGroupStyleable() {
    // Specifies a style to use for title text.
    @ReferenceValue
    @Inlineable(CoreTextAppearanceStyleable::class)
    class titleTextAppearance

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    @Inlineable(CoreTextAppearanceStyleable::class)
    class subtitleTextAppearance

    // Specifies title text.
    @Reuse(AppCompatBaseStyleable.title::class)
    class title

    // Specifies subtitle text.
    @Reuse(AppCompatActionBarStyleable.subtitle::class)
    class subtitle

    // Gravity
    @Reuse(CoreStyleable.gravity::class)
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

    @Reuse(AppCompatActionBarStyleable.contentInsetStart::class)
    class contentInsetStart

    @Reuse(AppCompatActionBarStyleable.contentInsetEnd::class)
    class contentInsetEnd

    @Reuse(AppCompatActionBarStyleable.contentInsetLeft::class)
    class contentInsetLeft

    @Reuse(AppCompatActionBarStyleable.contentInsetRight::class)
    class contentInsetRight

    @Reuse(AppCompatActionBarStyleable.contentInsetStartWithNavigation::class)
    class contentInsetStartWithNavigation

    @Reuse(AppCompatActionBarStyleable.contentInsetEndWithActions::class)
    class contentInsetEndWithActions

    @DimensionValue
    class maxButtonHeight

    // Enum for the button gravity
    enum class ButtonGravityFlag(val value: Long) : StyleableFlag {
        top(0x30),
        bottom(0x50)
    }

    // Button gravity
    @FlagValue(ButtonGravityFlag::class)
    class buttonGravity

    // Icon drawable to use for the collapse button.
    @StringValue
    class collapseIcon

    // Text to set as the content description for the collapse button.
    @StringValue
    class collapseContentDescription

    // Reference to a theme that should be used to inflate popups
    // shown by widgets in the toolbar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
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
    @Reuse(ManifestStyleable.logo::class)
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
}