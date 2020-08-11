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
package dev.android.playground.nova.core.framework.styleables

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.*

@UseAndroidNamespace
abstract class CoreStyleable : BaseStyleable {
    // Size of text. Recommended dimension type for text is "sp" for scaled-pixels (example: 15sp).
    @DimensionValue
    @UseAndroidNamespace
    class textSize

    // Default font family.
    @StringValue
    @UseAndroidNamespace
    class fontFamily

    // Default text typeface.
    @EnumValue(Typeface::class)
    @UseAndroidNamespace
    class typeface

    // Default text typeface style.
    @FlagValue(TextStyle::class)
    @UseAndroidNamespace
    class textStyle

    // Color of text (usually same as colorForeground).
    @ColorValue
    @UseAndroidNamespace
    class textColor

    // Color of highlighted text.
    @ColorValue
    @UseAndroidNamespace
    class textColorHighlight

    // Color of hint text (displayed when the field is empty).
    @ColorValue
    @UseAndroidNamespace
    class textColorHint

    // Color of link text (URLs).
    @ColorValue
    @UseAndroidNamespace
    class textColorLink

    // Reference to a drawable that will be drawn under the insertion cursor.
    @ReferenceValue
    @UseAndroidNamespace
    class textCursorDrawable

    // Indicates that the content of a non-editable TextView can be selected.
    // Default value is false. EditText content is always selectable.
    @BooleanValue
    @UseAndroidNamespace
    class textIsSelectable

    // Where to ellipsize text.
    @EnumValue(Ellipsize::class)
    @UseAndroidNamespace
    class ellipsize

    // The type of data being placed in a text field, used to help an
    // input method decide how to let the user enter text.  The constants
    // here correspond to those defined by
    // {@link android.text.InputType}.  Generally you can select
    // a single value, though some can be combined together as
    // indicated.  Setting this attribute to anything besides
    // <var>none</var> also implies that the text is editable.
    @FlagValue(InputType::class)
    @UseAndroidNamespace
    class inputType

    // Additional features you can enable in an IME associated with an editor
    // to improve the integration with your application.  The constants
    // here correspond to those defined by
    // {@link android.view.inputmethod.EditorInfo#imeOptions}.
    @FlagValue(ImeOptions::class)
    @UseAndroidNamespace
    class imeOptions

    // A coordinate in the X dimension.
    @DimensionValue
    @UseAndroidNamespace
    class x

    // A coordinate in the Y dimension.
    @DimensionValue
    @UseAndroidNamespace
    class y

    // Specifies how an object should position its content, on both the X and Y axes,
    // within its own bounds.
    @FlagValue(Gravity::class)
    @UseAndroidNamespace
    class gravity

    // Controls whether links such as urls and email addresses are
    // automatically found and converted to clickable links.  The default
    // value is "none", disabling this feature.
    @FlagValue(AutoLink::class)
    @UseAndroidNamespace
    class autoLink

    // Reference to an array resource that will populate a list/adapter.
    @ReferenceValue
    @UseAndroidNamespace
    class entries

    // Standard gravity constant that a child supplies to its parent.
    // Defines how the child view should be positioned, on both the X and Y axes, within its enclosing layout.
    @FlagValue(LayoutGravity::class)
    @UseAndroidNamespace
    class layoutGravity

    // Standard orientation constant.
    @EnumValue(Orientation::class)
    @UseAndroidNamespace
    class orientation

    // Alignment constants.
    @EnumValue(AlignmentMode::class)
    @UseAndroidNamespace
    class alignmentMode

    // Some child types have special behavior.
    @EnumValue(Layout_ChildType::class)
    @UseAndroidNamespace
    class layout_childType

    @ReferenceValue
    @UseAndroidNamespace
    class lockPatternStyle
}

@SkipForDSL
@UseAndroidNamespace
abstract class CoreWidgetStyleable : BaseStyleable {
}

@UseAndroidNamespace
abstract class CoreThemeStyleable : CoreWindowStyleable() {
    // Specifies that a theme has a light background with dark text on top.
    @BooleanValue
    @UseAndroidNamespace
    class isLightTheme

    // Default color of foreground imagery.
    @ColorValue
    @UseAndroidNamespace
    class colorForeground

    // Default color of foreground imagery on an inverted background.
    @ColorValue
    @UseAndroidNamespace
    class colorForegroundInverse

    // Default color of background imagery, ex. full-screen windows.
    @ColorValue
    @UseAndroidNamespace
    class colorBackground

    // Default color of background imagery for floating components, ex. dialogs, popups, and cards.
    @ColorValue
    @UseAndroidNamespace
    class colorBackgroundFloating

    // This is a hint for a solid color that can be used for caching
    // rendered views.  This should be the color of the background when
    // there is a solid background color; it should be null when the
    // background is a texture or translucent.  When a device is able
    // to use accelerated drawing (thus setting state_accelerated), the
    // cache hint is ignored and always assumed to be transparent.
    @ColorValue
    @UseAndroidNamespace
    class colorBackgroundCacheHint

    // Default highlight color for items that are pressed.
    @ColorValue
    @UseAndroidNamespace
    class colorPressedHighlight

    // Default highlight color for items that are long-pressed.
    @ColorValue
    @UseAndroidNamespace
    class colorLongPressedHighlight

    // Default highlight color for items that are
    // focused. (Focused meaning cursor-based selection.)
    @ColorValue
    @UseAndroidNamespace
    class colorFocusedHighlight

    // Default highlight color for items that are
    // activated. (Activated meaning persistent selection.)
    @ColorValue
    @UseAndroidNamespace
    class colorActivatedHighlight

    // Default highlight color for items in multiple selection
    // mode.
    @ColorValue
    @UseAndroidNamespace
    class colorMultiSelectHighlight

    // Drawable to be drawn over the view to mark it as autofilled
    @ReferenceValue
    @UseAndroidNamespace
    class autofilledHighlight

    // Max width of the autofill data set picker as a fraction of the screen width
    @ReferenceValue
    @UseAndroidNamespace
    class autofillDatasetPickerMaxWidth

    // Max height of the autofill data set picker as a fraction of the screen height
    @ReferenceValue
    @UseAndroidNamespace
    class autofillDatasetPickerMaxHeight

    // Max height of the the autofill save custom subtitle as a fraction of the screen width/height
    @ReferenceValue
    @UseAndroidNamespace
    class autofillSaveCustomSubtitleMaxHeight

    // Default disabled alpha for widgets that set enabled/disabled alpha programmatically.
    @FloatValue
    @UseAndroidNamespace
    class disabledAlpha

    // The alpha applied to the foreground color to create the primary text color.
    @FloatValue
    @UseAndroidNamespace
    class primaryContentAlpha

    // The alpha applied to the foreground color to create the secondary text color.
    @FloatValue
    @UseAndroidNamespace
    class secondaryContentAlpha

    // Color used for error states and things that need to be drawn to
    // the users attention..
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class colorError

    // Default background dim amount when a menu, dialog, or something similar pops up.
    @FloatValue
    @UseAndroidNamespace
    class backgroundDimAmount

    // Control whether dimming behind the window is enabled.  The default
    // theme does not set this value, meaning it is based on whether the
    // window is floating.
    @BooleanValue
    @UseAndroidNamespace
    class backgroundDimEnabled

    // ===========
    // Text styles
    // ===========
    // Default appearance of text: color, typeface, size, and style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearance

    // Default appearance of text against an inverted background:
    // color, typeface, size, and style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceInverse

    // The most prominent text color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimary

    // Secondary text color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSecondary

    // Tertiary text color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorTertiary

    // Primary inverse text color, useful for inverted backgrounds.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryInverse

    // Secondary inverse text color, useful for inverted backgrounds.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSecondaryInverse

    // Tertiary inverse text color, useful for inverted backgrounds.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorTertiaryInverse

    // Inverse hint text color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorHintInverse

    // Bright text color. Only differentiates based on the disabled state.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryDisableOnly

    // Bright inverse text color. Only differentiates based on the disabled state.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryInverseDisableOnly

    // Bright text color. This does not differentiate the disabled state. As an example,
    // buttons use this since they display the disabled state via the background and not the
    // foreground text color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryNoDisable

    // Dim text color. This does not differentiate the disabled state.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSecondaryNoDisable

    // Bright inverse text color. This does not differentiate the disabled state.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryInverseNoDisable

    // Dim inverse text color. This does not differentiate the disabled state.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSecondaryInverseNoDisable

    // Bright text color for use over activated backgrounds.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorPrimaryActivated

    // Dim text color for use over activated backgrounds.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSecondaryActivated

    // Text color for urls in search suggestions, used by things like global search and the browser. @hide
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorSearchUrl

    // Color of highlighted text, when used in a light theme.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorHighlightInverse

    // Color of link text (URLs), when used in a light theme.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorLinkInverse

    // Color of list item text in alert dialogs.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textColorAlertDialogListItem

    // Search widget more corpus result item background.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class searchWidgetCorpusItemBackground

    // Text color, typeface, size, and style for "large" text. Defaults to primary text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceLarge

    // Text color, typeface, size, and style for "medium" text. Defaults to primary text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceMedium

    // Text color, typeface, size, and style for "small" text. Defaults to secondary text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceSmall

    // Text color, typeface, size, and style for "large" inverse text. Defaults to primary inverse text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceLargeInverse

    // Text color, typeface, size, and style for "medium" inverse text. Defaults to primary inverse text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceMediumInverse

    // Text color, typeface, size, and style for "small" inverse text. Defaults to secondary inverse text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceSmallInverse

    // Text color, typeface, size, and style for system search result title. Defaults to primary inverse text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceSearchResultTitle

    // Text color, typeface, size, and style for system search result subtitle. Defaults to primary inverse text color.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceSearchResultSubtitle

    // Text color, typeface, size, and style for the text inside of a button.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceButton

    // Text color, typeface, size, and style for the text inside of a popup menu.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceLargePopupMenu

    // Text color, typeface, size, and style for small text inside of a popup menu.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceSmallPopupMenu

    // Text color, typeface, size, and style for header text inside of a popup menu.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearancePopupMenuHeader

    // The underline color and thickness for easy correct suggestion
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceEasyCorrectSuggestion

    // The underline color and thickness for misspelled suggestion
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceMisspelledSuggestion

    // The underline color and thickness for auto correction suggestion
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceAutoCorrectionSuggestion

    //  The underline color
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class textUnderlineColor

    //  The underline thickness
    @ReferenceValue
    @DimensionValue
    @UseAndroidNamespace
    class textUnderlineThickness

    // EditText text foreground color.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class editTextColor

    // EditText background drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class editTextBackground

    // Popup text displayed in TextView when setError is used.
    @ReferenceValue
    @UseAndroidNamespace
    class errorMessageBackground

    // Background used instead of errorMessageBackground when the popup has to be above.
    @ReferenceValue
    @UseAndroidNamespace
    class errorMessageAboveBackground

    // A styled string, specifying the style to be used for showing
    // inline candidate text when composing with an input method.  The
    // text itself will be ignored, but the style spans will be applied
    // to the candidate text as it is edited.
    @ReferenceValue
    @StringValue
    @UseAndroidNamespace
    class candidatesTextStyleSpans

    // Drawable to use for check marks.
    @ReferenceValue
    @UseAndroidNamespace
    class textCheckMark

    @ReferenceValue
    @UseAndroidNamespace
    class textCheckMarkInverse

    // Drawable to use for multiple choice indicators.
    @ReferenceValue
    @UseAndroidNamespace
    class listChoiceIndicatorMultiple

    // Drawable to use for single choice indicators.
    @ReferenceValue
    @UseAndroidNamespace
    class listChoiceIndicatorSingle

    // Drawable used as a background for selected list items.
    @ReferenceValue
    @UseAndroidNamespace
    class listChoiceBackgroundIndicator

    // Drawable used as a background for activated items.
    @ReferenceValue
    @UseAndroidNamespace
    class activatedBackgroundIndicator

    // =============
    // Button styles
    // =============
    // Normal Button style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreButtonStyleable::class)
    class buttonStyle

    // Small Button style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreButtonStyleable::class)
    class buttonStyleSmall

    // Button style to inset into an EditText.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreButtonStyleable::class)
    class buttonStyleInset

    // ToggleButton style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreToggleButtonStyleable::class)
    class buttonStyleToggle

    // ==============
    // Gallery styles
    // ==============
    // The preferred background for gallery items. This should be set
    // as the background of any Views you provide from the Adapter.
    @ReferenceValue
    @UseAndroidNamespace
    class galleryItemBackground

    // ===========
    // List styles
    // ===========
    // The preferred list item height.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemHeight

    // A smaller, sleeker list item height.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemHeightSmall

    // A larger, more robust list item height.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemHeightLarge

    // The list item height for search results. @hide
    @DimensionValue
    @UseAndroidNamespace
    class searchResultListItemHeight

    // The preferred padding along the left edge of list items.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemPaddingLeft

    // The preferred padding along the right edge of list items.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemPaddingRight

    // The preferred TextAppearance for the primary text of list items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceListItem

    // The preferred TextAppearance for the secondary text of list items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceListItemSecondary

    // The preferred TextAppearance for the primary text of small list items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearanceListItemSmall

    // The drawable for the list divider.
    @ReferenceValue
    @UseAndroidNamespace
    class listDivider

    // The list divider used in alert dialogs.
    @ReferenceValue
    @UseAndroidNamespace
    class listDividerAlertDialog

    // TextView style for list separators.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextViewStyleable::class)
    class listSeparatorTextViewStyle

    // The preferred left padding for an expandable list item (for child-specific layouts,
    // use expandableListPreferredChildPaddingLeft). This takes into account
    // the indicator that will be shown to next to the item.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredItemPaddingLeft

    // The preferred left padding for an expandable list item that is a child.
    // If this is not provided, it defaults to the expandableListPreferredItemPaddingLeft.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredChildPaddingLeft

    // The preferred left bound for an expandable list item's indicator. For a child-specific
    // indicator, use expandableListPreferredChildIndicatorLeft.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredItemIndicatorLeft

    // The preferred right bound for an expandable list item's indicator. For a child-specific
    // indicator, use expandableListPreferredChildIndicatorRight.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredItemIndicatorRight

    // The preferred left bound for an expandable list child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredChildIndicatorLeft

    // The preferred right bound for an expandable list child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class expandableListPreferredChildIndicatorRight

    // The preferred item height for dropdown lists.
    @DimensionValue
    @UseAndroidNamespace
    class dropdownListPreferredItemHeight

    // The preferred padding along the start edge of list items.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemPaddingStart

    // The preferred padding along the end edge of list items.
    @DimensionValue
    @UseAndroidNamespace
    class listPreferredItemPaddingEnd

    // =============
    // Window styles
    // =============
    // Drawable to use as the overall window background.  As of
    // {@link android.os.Build.VERSION_CODES#HONEYCOMB}, this may
    // be a selector that uses state_accelerated to pick a non-solid
    // color when running on devices that can draw such a bitmap
    // with complex compositing on top at 60fps.
    // <p>There are a few special considerations to use when setting this
    // drawable:
    // <ul>
    // <li> This information will be used to infer the pixel format
    // for your window's surface.  If the drawable has any
    // non-opaque pixels, your window will be translucent
    // (32 bpp).
    // <li> If you want to draw the entire background
    // yourself, you should set this drawable to some solid
    // color that closely matches that background (so the
    // system's preview of your window will match), and
    // then in code manually set your window's background to
    // null so it will not be drawn.
    // </ul>
    @ReferenceValue
    @UseAndroidNamespace
    class windowBackground

    // Drawable to draw selectively within the inset areas when the windowBackground
    // has been set to null. This protects against seeing visual garbage in the
    // surface when the app has not drawn any content into this area. One example is
    // when the user is resizing a window of an activity that has
    // {@link android.R.attr#resizeableActivity} set for multi-window mode.
    @ReferenceValue
    @UseAndroidNamespace
    class windowBackgroundFallback

    // Drawable to use as a frame around the window.
    @ReferenceValue
    @UseAndroidNamespace
    class windowFrame

    // Flag indicating whether there should be no title on this window.
    @BooleanValue
    @UseAndroidNamespace
    class windowNoTitle

    // Flag indicating whether this window should fill the entire screen.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#FLAG_FULLSCREEN}.
    @BooleanValue
    @UseAndroidNamespace
    class windowFullscreen

    // Flag indicating whether this window should extend into overscan region.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#FLAG_LAYOUT_IN_OVERSCAN}.
    @BooleanValue
    @UseAndroidNamespace
    class windowOverscan

    // Flag indicating whether this is a floating window.
    @BooleanValue
    @UseAndroidNamespace
    class windowIsFloating

    // Flag indicating whether this is a translucent window. If this attribute is unset (but
    // not if set to false), the window might still be considered translucent, if
    // windowSwipeToDismiss is set to true.
    @BooleanValue
    @UseAndroidNamespace
    class windowIsTranslucent

    // Flag indicating that this window's background should be the
    // user's current wallpaper.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#FLAG_SHOW_WALLPAPER}.
    @BooleanValue
    @UseAndroidNamespace
    class windowShowWallpaper

    // This Drawable is overlaid over the foreground of the Window's content area, usually
    // to place a shadow below the title.
    @ReferenceValue
    @UseAndroidNamespace
    class windowContentOverlay

    // The style resource to use for a window's title bar height.
    @DimensionValue
    @UseAndroidNamespace
    class windowTitleSize

    // The style resource to use for a window's title text.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class windowTitleStyle

    // The style resource to use for a window's title area.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class windowTitleBackgroundStyle

    // Reference to a style resource holding
    // the set of window animations to use, which can be
    // any of the attributes defined by
    // {@link android.R.styleable#WindowAnimation}.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreWindowAnimationStyleable::class)
    class windowAnimationStyle

    // Flag indicating whether this window should have an Action Bar
    // in place of the usual title bar.
    @BooleanValue
    @UseAndroidNamespace
    class windowActionBar

    // Flag indicating whether this window's Action Bar should overlay
    // application content. Does nothing if the window would not
    // have an Action Bar.
    @BooleanValue
    @UseAndroidNamespace
    class windowActionBarOverlay

    // Flag indicating whether action modes should overlay window content
    // when there is not reserved space for their UI (such as an Action Bar).
    @BooleanValue
    @UseAndroidNamespace
    class windowActionModeOverlay

    // Soft input state
    enum class WindowSoftInputModeFlag(val value: Long) : StyleableFlag {
        // Not specified, use what the system thinks is best.  This
        // is the default.
        stateUnspecified(0),
        // Leave the soft input window as-is, in whatever state it
        // last was.
        stateUnchanged(1),
        //  Make the soft input area hidden when normally appropriate
        // (when the user is navigating forward to your window).
        stateHidden(2),
        //  Always make the soft input area hidden when this window
        // has input focus.
        stateAlwaysHidden(3),
        //  Make the soft input area visible when normally appropriate
        // (when the user is navigating forward to your window).
        stateVisible(4),
        //  Always make the soft input area visible when this window
        // has input focus.
        stateAlwaysVisible(5),
        //  The window resize/pan adjustment has not been specified,
        // the system will automatically select between resize and pan
        // modes, depending
        // on whether the content of the window has any layout views
        // that can scroll their contents.  If there is such a view,
        // then the window will be resized, with the assumption being
        // that the resizeable area can be reduced to make room for
        // the input UI.
        adjustUnspecified(0x00),
        //  Always resize the window: the content area of the window is
        // reduced to make room for the soft input area.
        adjustResize(0x10),
        //  Don't resize the window to make room for the soft input area;
        // instead pan the contents of the window as focus moves inside
        // of it so that the user can see what they are typing.  This is
        // generally less desireable than panning because the user may
        // need to close the input area to get at and interact with
        // parts of the window.
        adjustPan(0x20),
        //  Don't resize <em>or</em> pan the window to make room for the
        // soft input area; the window is never adjusted for it.
        adjustNothing(0x30)

    }

    // Defines the default soft input state that this window would
    // like when it is displayed.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#softInputMode}.
    @FlagValue(WindowSoftInputModeFlag::class)
    @UseAndroidNamespace
    class windowSoftInputMode

    // Flag allowing you to disable the splash screen for a window. The default value is
    // false; if set to true, the system can never use the window's theme to show a splash
    // screen before your actual instance is shown to the user.
    @BooleanValue
    @UseAndroidNamespace
    class windowDisablePreview

    // Flag indicating that this window should not be displayed at all.
    // The default value is false; if set to true, and this window is
    // the main window of an Activity, then it will never actually
    // be added to the window manager.  This means that your activity
    // must immediately quit without waiting for user interaction,
    // because there will be no such interaction coming.
    @BooleanValue
    @UseAndroidNamespace
    class windowNoDisplay

    // Flag indicating that this window should allow touches to be split
    // across other windows that also support split touch.
    // The default value is true for applications with a targetSdkVersion
    // of Honeycomb or newer; false otherwise.
    // When this flag is false, the first pointer that goes down determines
    // the window to which all subsequent touches go until all pointers go up.
    // When this flag is true, each pointer (not necessarily the first) that
    // goes down determines the window to which all subsequent touches of that
    // pointer will go until that pointers go up thereby enabling touches
    // with multiple pointers to be split across multiple windows.
    @BooleanValue
    @UseAndroidNamespace
    class windowEnableSplitTouch

    // Control whether a container should automatically close itself if
    // the user touches outside of it.  This only applies to activities
    // and dialogs.
    // <p>Note: this attribute will only be respected for applications
    // that are targeting {@link android.os.Build.VERSION_CODES#HONEYCOMB}
    // or later.
    @BooleanValue
    @UseAndroidNamespace
    class windowCloseOnTouchOutside

    // Flag indicating whether this window requests a translucent status bar.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#FLAG_TRANSLUCENT_STATUS}.
    @BooleanValue
    @UseAndroidNamespace
    class windowTranslucentStatus

    // Flag indicating whether this window requests a translucent navigation bar.  Corresponds
    // to {@link android.view.WindowManager.LayoutParams#FLAG_TRANSLUCENT_NAVIGATION}.
    @BooleanValue
    @UseAndroidNamespace
    class windowTranslucentNavigation

    // Flag to indicate that a window can be swiped away to be dismissed.
    // Corresponds to {@link android.view.Window#FEATURE_SWIPE_TO_DISMISS}. It will also
    // dynamically change translucency of the window, if the windowIsTranslucent is not set.
    // If windowIsTranslucent is set (to either true or false) it will obey that setting.
    @BooleanValue
    @UseAndroidNamespace
    class windowSwipeToDismiss

    // Flag indicating whether this window requests that content changes be performed
    // as scene changes with transitions. Corresponds to
    // {@link android.view.Window#FEATURE_CONTENT_TRANSITIONS}.
    @BooleanValue
    @UseAndroidNamespace
    class windowContentTransitions

    // Reference to a TransitionManager XML resource defining the desired
    // transitions between different window content.
    @ReferenceValue
    @UseAndroidNamespace
    class windowContentTransitionManager

    // Flag indicating whether this window allows Activity Transitions.
    // Corresponds to {@link android.view.Window#FEATURE_ACTIVITY_TRANSITIONS}.
    @BooleanValue
    @UseAndroidNamespace
    class windowActivityTransitions

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views into the initial Window's content Scene. Corresponds to
    // {@link android.view.Window#setEnterTransition(android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowEnterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views out of the scene when the Window is
    // preparing to close. Corresponds to
    // {@link android.view.Window#setReturnTransition(android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowReturnTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views out of the Window's content Scene when launching a new Activity.
    // Corresponds to
    // {@link android.view.Window#setExitTransition(android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowExitTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views in to the scene when returning from a previously-started Activity.
    // Corresponds to
    // {@link android.view.Window#setReenterTransition(android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowReenterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move shared elements transferred into the Window's initial content Scene.
    //Corresponds to {@link android.view.Window#setSharedElementEnterTransition(
    //    android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowSharedElementEnterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move shared elements transferred back to a calling Activity.
    // Corresponds to {@link android.view.Window#setSharedElementReturnTransition(
    //        android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowSharedElementReturnTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used when starting a new Activity to move shared elements prior to transferring
    // to the called Activity.
    // Corresponds to {@link android.view.Window#setSharedElementExitTransition(
    //        android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowSharedElementExitTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used for shared elements transferred back to a calling Activity.
    // Corresponds to {@link android.view.Window#setSharedElementReenterTransition(
    //    android.transition.Transition)}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowSharedElementReenterTransition

    // Flag indicating whether this Window's transition should overlap with
    // the exiting transition of the calling Activity. Corresponds to
    // {@link android.view.Window#setAllowEnterTransitionOverlap(boolean)}.
    // The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class windowAllowEnterTransitionOverlap

    // Flag indicating whether this Window's transition should overlap with
    // the exiting transition of the called Activity when the called Activity
    // finishes. Corresponds to
    // {@link android.view.Window#setAllowReturnTransitionOverlap(boolean)}.
    // The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class windowAllowReturnTransitionOverlap

    // Indicates whether or not shared elements should use an overlay
    // during transitions. The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class windowSharedElementsUseOverlay

    // Internal layout used internally for window decor
    @ReferenceValue
    @UseAndroidNamespace
    class windowActionBarFullscreenDecorLayout

    // The duration, in milliseconds, of the window background fade duration
    // when transitioning into or away from an Activity when called with an
    // Activity Transition. Corresponds to
    // {@link android.view.Window#setTransitionBackgroundFadeDuration(long)}.
    @IntegerValue
    @UseAndroidNamespace
    class windowTransitionBackgroundFadeDuration

    // ============
    // Floating toolbar styles
    // ============
    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarCloseDrawable

    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class floatingToolbarForegroundColor

    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarItemBackgroundBorderlessDrawable

    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarItemBackgroundDrawable

    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarOpenDrawable

    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarPopupBackgroundDrawable

    @ReferenceValue
    @UseAndroidNamespace
    class floatingToolbarDividerColor

    // ============
    // Alert Dialog styles
    // ============
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreAlertDialogStyleable::class)
    class alertDialogStyle

    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class alertDialogButtonGroupStyle

    @BooleanValue
    @UseAndroidNamespace
    class alertDialogCenterButtons

    // ==============
    // Image elements
    // ==============
    // Background that can be used behind parts of a UI that provide
    // details on data the user is selecting.  For example, this is
    // the background element of PreferenceActivity's embedded
    // preference fragment.
    @ReferenceValue
    @UseAndroidNamespace
    class detailsElementBackground

    // Icon that should be used to indicate that an app is waiting for a fingerprint scan.
    // This should be used whenever an app is requesting the user to place a finger on the
    // fingerprint sensor. It can be combined with other drawables such as colored circles, so
    // the appearance matches the branding of the app requesting the fingerprint scan.
    @ReferenceValue
    @UseAndroidNamespace
    class fingerprintAuthDrawable

    // ============
    // Panel styles
    // ============
    // The background of a panel when it is inset from the left and right edges of the screen.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class panelBackground

    // The background of a panel when it extends to the left and right edges of the screen.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class panelFullBackground

    // Default color of foreground panel imagery.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class panelColorForeground

    // Color that matches (as closely as possible) the panel background.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class panelColorBackground

    // Default appearance of panel text.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class panelTextAppearance

    @BooleanValue
    @UseAndroidNamespace
    class panelMenuIsCompact

    @DimensionValue
    @UseAndroidNamespace
    class panelMenuListWidth

    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable((CoreThemeStyleable::class))
    class panelMenuListTheme

    // ===================
    // Other widget styles
    // ===================
    // Default AbsListView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreAbsListViewStyleable::class)
    class absListViewStyle

    // Default AutoCompleteTextView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreAutoCompleteTextViewStyleable::class)
    class autoCompleteTextViewStyle

    // Default Checkbox style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class checkboxStyle

    // Default CheckedTextView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreCheckedTextViewStyleable::class)
    class checkedTextViewStyle

    // Default ListView style for drop downs.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class dropDownListViewStyle

    // Default EditText style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreEditTextViewStyleable::class)
    class editTextStyle

    // Default ExpandableListView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreExpandableListViewStyleable::class)
    class expandableListViewStyle

    // ExpandableListView with white background.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreExpandableListViewStyleable::class)
    class expandableListViewWhiteStyle

    // Default Gallery style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreGalleryStyleable::class)
    class galleryStyle

    // Default GestureOverlayView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreGestureOverlayViewStyleable::class)
    class gestureOverlayViewStyle

    // Default GridView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreGridViewStyleable::class)
    class gridViewStyle

    // The style resource to use for an ImageButton.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class imageButtonStyle

    // The style resource to use for an ImageButton that is an image well.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class imageWellStyle

    // Default menu-style ListView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class listMenuViewStyle

    // Default ListView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreListViewStyleable::class)
    class listViewStyle

    // ListView with white background.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class listViewWhiteStyle

    // Default PopupWindow style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePopupWindowStyleable::class)
    class popupWindowStyle

    // Default ProgressBar style. This is a medium circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreProgressBarStyleable::class)
    class progressBarStyle

    // Horizontal ProgressBar style. This is a horizontal progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleHorizontal

    // Small ProgressBar style. This is a small circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleSmall

    // Small ProgressBar in title style. This is a small circular progress bar that will be placed in title bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleSmallTitle

    // Large ProgressBar style. This is a large circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleLarge

    // Inverse ProgressBar style. This is a medium circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleInverse

    // Small inverse ProgressBar style. This is a small circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleSmallInverse

    // Large inverse ProgressBar style. This is a large circular progress bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class progressBarStyleLargeInverse

    // Default SeekBar style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSeekBarStyleable::class)
    class seekBarStyle

    // Default RatingBar style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreRatingBarStyleable::class)
    class ratingBarStyle

    // Indicator RatingBar style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreRatingBarStyleable::class)
    class ratingBarStyleIndicator

    // Small indicator RatingBar style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreRatingBarStyleable::class)
    class ratingBarStyleSmall

    // Default RadioButton style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class radioButtonStyle

    // Default ScrollView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreScrollViewStyleable::class)
    class scrollViewStyle

    // Default HorizontalScrollView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreHorizontalScrollViewStyleable::class)
    class horizontalScrollViewStyle

    // Default Spinner style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSpinnerStyleable::class)
    class spinnerStyle

    // Default dropdown Spinner style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class dropDownSpinnerStyle

    // Default ActionBar dropdown style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionDropDownStyle

    // Default action button style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionButtonStyle

    // Default Star style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class starStyle

    // Default TabWidget style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTabWidgetStyleable::class)
    class tabWidgetStyle

    // Default TextView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextViewStyleable::class)
    class textViewStyle

    // Default WebTextView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class webTextViewStyle

    // Default WebView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class webViewStyle

    // Default style for drop down items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class dropDownItemStyle

    // Default style for spinner drop down items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class spinnerDropDownItemStyle

    // Default style for drop down hints.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class dropDownHintAppearance

    // Default spinner item style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class spinnerItemStyle

    // Default MapView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreMapViewStyleable::class)
    class mapViewStyle

    // Drawable used as an overlay on top of quickcontact photos.
    @ReferenceValue
    @UseAndroidNamespace
    class quickContactBadgeOverlay

    // Default quickcontact badge style with small quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleWindowSmall

    // Default quickcontact badge style with medium quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleWindowMedium

    // Default quickcontact badge style with large quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleWindowLarge

    // Default quickcontact badge style with small quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleSmallWindowSmall

    // Default quickcontact badge style with medium quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleSmallWindowMedium

    // Default quickcontact badge style with large quickcontact window.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreQuickContactBadgeStyleable::class)
    class quickContactBadgeStyleSmallWindowLarge

    // Reference to a style that will be used for the window containing a text
    // selection anchor.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePopupWindowStyleable::class)
    class textSelectHandleWindowStyle

    // Reference to a style that will be used for the window containing a list of possible
    // text suggestions in an EditText.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreWindowStyleable::class)
    class textSuggestionsWindowStyle

    // Default ListPopupWindow style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreListPopupWindowStyleable::class)
    class listPopupWindowStyle

    // Default PopupMenu style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class popupMenuStyle

    // Default context menu PopupMenu style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class contextPopupMenuStyle

    // Default StackView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreStackViewStyleable::class)
    class stackViewStyle

    // Default style for the FragmentBreadCrumbs widget. This widget is deprecated
    // starting in API level 21 ({@link android.os.Build.VERSION_CODES#.L}).
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreFragmentBreadCrumbsStyleable::class)
    class fragmentBreadCrumbsStyle

    // NumberPicker style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreNumberPickerStyleable::class)
    class numberPickerStyle

    // The CalendarView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreCalendarViewStyleable::class)
    class calendarViewStyle

    // The TimePicker style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTimePickerStyleable::class)
    class timePickerStyle

    // The TimePicker dialog theme.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class timePickerDialogTheme

    // The DatePicker style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreDatePickerStyleable::class)
    class datePickerStyle

    // The DatePicker dialog theme.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class datePickerDialogTheme

    // Default ActivityChooserView style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreActivityChooserViewStyleable::class)
    class activityChooserViewStyle

    // Default Toolbar style.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreToolbarStyleable::class)
    class toolbarStyle

    // Fast scroller styles
    // Drawable to use as the fast scroll thumb.
    @ReferenceValue
    @UseAndroidNamespace
    class fastScrollThumbDrawable

    // Drawable to use as the fast scroll index preview window background
    // when shown on the right.
    @ReferenceValue
    @UseAndroidNamespace
    class fastScrollPreviewBackgroundRight

    // Drawable to use as the fast scroll index preview window background
    // when shown on the left.
    @ReferenceValue
    @UseAndroidNamespace
    class fastScrollPreviewBackgroundLeft

    // Drawable to use as the track for the fast scroll thumb.
    // This may be null.
    @ReferenceValue
    @UseAndroidNamespace
    class fastScrollTrackDrawable

    enum class FastScrollOverlayPositionEnum(val value: Int) : StyleableEnum {
        floating(0),
        atThumb(1),
        aboveThumb(2)
    }

    // Position of the fast scroll index overlay window.
    @EnumValue(FastScrollOverlayPositionEnum::class)
    @UseAndroidNamespace
    class fastScrollOverlayPosition

    // Text color for the fast scroll index overlay. Make sure it
    // plays nicely with fastScrollPreviewBackground[Left|Right].
    @ColorValue
    @UseAndroidNamespace
    class fastScrollTextColor

    // ===================
    // Action bar styles
    // ===================
    // Default style for tabs within an action bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionBarTabStyle

    // Reference to a style for the Action Bar Tab Bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionBarTabBarStyle

    // Reference to a style for the Action Bar Tab text.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionBarTabTextStyle

    // Reference to a style for Action Bar overflow buttons.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionOverflowButtonStyle

    // Reference to a style for the Action Bar menu.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionOverflowMenuStyle

    // Reference to a theme that should be used to inflate popups
    // shown by widgets in the action bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class actionBarPopupTheme

    // Reference to a style for the Action Bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreActionBarStyleable::class)
    class actionBarStyle

    // Reference to a style for the split Action Bar. This style
    // controls the split component that holds the menu/action
    // buttons. actionBarStyle is still used for the primary
    // bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionBarSplitStyle

    // Reference to a theme that should be used to inflate the
    // action bar. This will be inherited by any widget inflated
    // into the action bar.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class actionBarTheme

    // Reference to a theme that should be used to inflate widgets
    // and layouts destined for the action bar. Most of the time
    // this will be a reference to the current theme, but when
    // the action bar has a significantly different contrast
    // profile than the rest of the activity the difference
    // can become important. If this is set to @null the current
    // theme will be used.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class actionBarWidgetTheme

    // Size of the Action Bar, including the contextual
    // bar used to present Action Modes.
    @DimensionValue
    @UseAndroidNamespace
    class actionBarSize

    // Custom divider drawable to use for elements in the action bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionBarDivider

    // Custom item state list drawable background for action bar items.
    @ReferenceValue
    @UseAndroidNamespace
    class actionBarItemBackground

    // TextAppearance style that will be applied to text that
    // appears within action menu items.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class actionMenuTextAppearance

    // Color for text that appears within action menu items.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class actionMenuTextColor

    // ===================
    // Action mode styles
    // ===================
    // Reference to a style for the Action Mode.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreActionModeStyleable::class)
    class actionModeStyle

    // Reference to a style for the Action Mode close button.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class actionModeCloseButtonStyle

    // Background drawable to use for action mode UI.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeBackground

    // Background drawable to use for action mode UI in the lower split bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeSplitBackground

    // Drawable to use for the close action mode button.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeCloseDrawable

    // Drawable to use for the Cut action button in Contextual Action Bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeCutDrawable

    // Drawable to use for the Copy action button in Contextual Action Bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeCopyDrawable

    // Drawable to use for the Paste action button in Contextual Action Bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModePasteDrawable

    // Drawable to use for the Select all action button in Contextual Action Bar.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeSelectAllDrawable

    // Drawable to use for the Share action button in WebView selection action modes.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeShareDrawable

    // Drawable to use for the Find action button in WebView selection action modes.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeFindDrawable

    // Drawable to use for the Web Search action button in WebView selection action modes.
    @ReferenceValue
    @UseAndroidNamespace
    class actionModeWebSearchDrawable

    // PopupWindow style to use for action modes when showing as a window overlay.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreWindowStyleable::class)
    class actionModePopupWindowStyle

    // ===================
    // Preference styles
    // ===================
    // Default style for PreferenceScreen.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePreferenceScreenStyleable::class)
    class preferenceScreenStyle

    // Default style for the PreferenceActivity.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePreferenceActivityStyleable::class)
    class preferenceActivityStyle

    // Default style for Headers pane in PreferenceActivity.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePreferenceFragmentStyleable::class)
    class preferenceFragmentStyle

    // Default style for PreferenceCategory.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class preferenceCategoryStyle

    // Default style for Preference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePreferenceStyleable::class)
    class preferenceStyle

    // Default style for informational Preference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class preferenceInformationStyle

    // Default style for CheckBoxPreference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreCheckBoxPreferenceStyleable::class)
    class checkBoxPreferenceStyle

    // Default style for YesNoPreference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class yesNoPreferenceStyle

    // Default style for DialogPreference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreDialogPreferenceStyleable::class)
    class dialogPreferenceStyle

    // Default style for EditTextPreference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class editTextPreferenceStyle

    // Default style for SeekBarDialogPreference.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class seekBarDialogPreferenceStyle

    // Default style for RingtonePreference.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreRingtonePreferenceStyleable::class)
    class ringtonePreferenceStyle

    // The preference layout that has the child/tabbed effect.
    @ReferenceValue
    @UseAndroidNamespace
    class preferenceLayoutChild

    // Preference panel style
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class preferencePanelStyle

    // Preference headers panel style
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class preferenceHeaderPanelStyle

    // Preference list style
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreListPreferenceStyleable::class)
    class preferenceListStyle

    // Preference fragment list style
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class preferenceFragmentListStyle

    // Preference fragment padding side
    @DimensionValue
    @UseAndroidNamespace
    @Inlineable
    class preferenceFragmentPaddingSide

    // Default style for switch preferences.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSwitchPreferenceStyleable::class)
    class switchPreferenceStyle

    // Default style for seekbar preferences.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSeekBarPreferenceStyleable::class)
    class seekBarPreferenceStyle

    // ============================
    // Text selection handle styles
    // ============================
    // Reference to a drawable that will be used to display a text selection
    // anchor on the left side of a selection region.
    @ReferenceValue
    @UseAndroidNamespace
    class textSelectHandleLeft

    // Reference to a drawable that will be used to display a text selection
    // anchor on the right side of a selection region.
    @ReferenceValue
    @UseAndroidNamespace
    class textSelectHandleRight

    // Reference to a drawable that will be used to display a text selection
    // anchor for positioning the cursor within text.
    @ReferenceValue
    @UseAndroidNamespace
    class textSelectHandle

    // The layout of the view that is displayed on top of the cursor to paste inside a
    // TextEdit field.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditPasteWindowLayout

    // Variation of textEditPasteWindowLayout displayed when the clipboard is empty.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditNoPasteWindowLayout

    // Used instead of textEditPasteWindowLayout when the window is moved on the side of the
    // insertion cursor because it would be clipped if it were positioned on top.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditSidePasteWindowLayout

    // Variation of textEditSidePasteWindowLayout displayed when the clipboard is empty.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditSideNoPasteWindowLayout

    // Layout of the TextView item that will populate the suggestion popup window.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditSuggestionItemLayout

    // Layout of the container of the suggestion popup window.
    @ReferenceValue
    @UseAndroidNamespace
    class textEditSuggestionContainerLayout

    // Text appearance of the focused words to be replaced by suggested word.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class textEditSuggestionHighlightStyle

    // Theme to use for dialogs spawned from this theme.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class dialogTheme

    // Window decor layout to use in dialog mode with icons.
    @ReferenceValue
    @UseAndroidNamespace
    class dialogTitleIconsDecorLayout

    // Window decor layout to use in dialog mode with custom titles.
    @ReferenceValue
    @UseAndroidNamespace
    class dialogCustomTitleDecorLayout

    // Window decor layout to use in dialog mode with title only.
    @ReferenceValue
    @UseAndroidNamespace
    class dialogTitleDecorLayout

    // Preferred padding for dialog content.
    @DimensionValue
    @UseAndroidNamespace
    class dialogPreferredPadding

    // Corner radius of dialogs.
    @DimensionValue
    @UseAndroidNamespace
    class dialogCornerRadius

    // Theme to use for alert dialogs spawned from this theme.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class alertDialogTheme

    // Icon drawable to use for alerts.
    @ReferenceValue
    @UseAndroidNamespace
    class alertDialogIcon

    // Theme to use for presentations spawned from this theme.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class presentationTheme

    // Drawable to use for generic vertical dividers.
    @ReferenceValue
    @UseAndroidNamespace
    class dividerVertical

    // Drawable to use for generic horizontal dividers.
    @ReferenceValue
    @UseAndroidNamespace
    class dividerHorizontal

    // Style for button bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class buttonBarStyle

    // Style for buttons within button bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class buttonBarButtonStyle

    // Style for the "positive" buttons within button bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class buttonBarPositiveButtonStyle

    // Style for the "negative" buttons within button bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class buttonBarNegativeButtonStyle

    // Style for the "neutral" buttons within button bars.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class buttonBarNeutralButtonStyle

    // Style for the search query widget.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSearchViewStyleable::class)
    class searchViewStyle

    // Style for segmented buttons - a container that houses several buttons
    // with the appearance of a singel button broken into segments.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable
    class segmentedButtonStyle

    // Background drawable for bordered standalone items that need focus/pressed states.
    @ReferenceValue
    @UseAndroidNamespace
    class selectableItemBackground

    // Background drawable for borderless standalone items that need focus/pressed states.
    @ReferenceValue
    @UseAndroidNamespace
    class selectableItemBackgroundBorderless

    // Style for buttons without an explicit border, often used in groups.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreButtonStyleable::class)
    class borderlessButtonStyle

    // Background to use for toasts.
    @ReferenceValue
    @UseAndroidNamespace
    class toastFrameBackground

    // Background to use for tooltip popups.
    @ReferenceValue
    @UseAndroidNamespace
    class tooltipFrameBackground

    // Foreground color to use for tooltip popups.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class tooltipForegroundColor

    // Background color to use for tooltip popups.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class tooltipBackgroundColor

    // Theme to use for Search Dialogs.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreThemeStyleable::class)
    class searchDialogTheme

    // Specifies a drawable to use for the 'home as up' indicator.
    @ReferenceValue
    @UseAndroidNamespace
    class homeAsUpIndicator

    // Preference frame layout styles.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CorePreferenceFrameLayoutStyleable::class)
    class preferenceFrameLayoutStyle

    // Default style for the Switch widget.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreSwitchStyleable::class)
    class switchStyle

    // Default style for the MediaRouteButton widget.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreMediaRouteButtonStyleable::class)
    class mediaRouteButtonStyle

    // ==============
    // Pointer styles
    // ==============
    // The drawable for accessibility focused views.
    @ReferenceValue
    @UseAndroidNamespace
    class accessibilityFocusedDrawable

    // Drawable for WebView find-on-page dialogue's "next" button. @hide
    @ReferenceValue
    @UseAndroidNamespace
    class findOnPageNextDrawable

    // Drawable for WebView find-on-page dialogue's "previous" button. @hide
    @ReferenceValue
    @UseAndroidNamespace
    class findOnPagePreviousDrawable

    // =============
    // Color palette
    // =============
    // The primary branding color for the app. By default, this is the color applied to the
    // action bar background.
    @ColorValue
    @UseAndroidNamespace
    class colorPrimary

    // Dark variant of the primary branding color. By default, this is the color applied to
    // the status bar (via statusBarColor) and navigation bar (via navigationBarColor).
    @ColorValue
    @UseAndroidNamespace
    class colorPrimaryDark

    // The secondary branding color for the app.
    @ColorValue
    @UseAndroidNamespace
    class colorSecondary

    // Bright complement to the primary branding color. By default, this is the color applied
    // to framework controls (via colorControlActivated).
    @ColorValue
    @UseAndroidNamespace
    class colorAccent

    // The color applied to framework controls in their normal state.
    @ColorValue
    @UseAndroidNamespace
    class colorControlNormal

    // The color applied to framework controls in their activated (ex. checked) state.
    @ColorValue
    @UseAndroidNamespace
    class colorControlActivated

    // The color applied to framework control highlights (ex. ripples, list selectors).
    @ColorValue
    @UseAndroidNamespace
    class colorControlHighlight

    // The color applied to framework buttons in their normal state.
    @ColorValue
    @UseAndroidNamespace
    class colorButtonNormal

    // The color applied to framework switch thumbs in their normal state.
    @ColorValue
    @UseAndroidNamespace
    class colorSwitchThumbNormal

    // The color applied to the edge effect on scrolling containers.
    @ColorValue
    @UseAndroidNamespace
    class colorEdgeEffect

    // ===================
    // Lighting properties
    // ===================
    // The default Y position of the light used to project view shadows.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class lightY

    // The default Z position of the light used to project view shadows.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class lightZ

    // The default radius of the light used to project view shadows.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class lightRadius

    // Alpha value of the ambient shadow projected by elevated views, between 0 and 1.
    @FloatValue
    @UseAndroidNamespace
    class ambientShadowAlpha

    // Alpha value of the spot shadow projected by elevated views, between 0 and 1.
    @FloatValue
    @UseAndroidNamespace
    class spotShadowAlpha
}

@UseAndroidNamespace
abstract class CoreWindowStyleable : BaseStyleable {
    @Reuse(CoreThemeStyleable.windowBackground::class)
    class windowBackground

    @Reuse(CoreThemeStyleable.windowBackgroundFallback::class)
    class windowBackgroundFallback

    @Reuse(CoreThemeStyleable.windowContentOverlay::class)
    class windowContentOverlay

    @Reuse(CoreThemeStyleable.windowFrame::class)
    class windowFrame

    @Reuse(CoreThemeStyleable.windowNoTitle::class)
    class windowNoTitle

    @Reuse(CoreThemeStyleable.windowFullscreen::class)
    class windowFullscreen

    @Reuse(CoreThemeStyleable.windowOverscan::class)
    class windowOverscan

    @Reuse(CoreThemeStyleable.windowIsFloating::class)
    class windowIsFloating

    @Reuse(CoreThemeStyleable.windowIsTranslucent::class)
    class windowIsTranslucent

    @Reuse(CoreThemeStyleable.windowShowWallpaper::class)
    class windowShowWallpaper

    @Reuse(CoreThemeStyleable.windowAnimationStyle::class)
    class windowAnimationStyle

    @Reuse(CoreThemeStyleable.windowSoftInputMode::class)
    class windowSoftInputMode

    @Reuse(CoreThemeStyleable.windowDisablePreview::class)
    class windowDisablePreview

    @Reuse(CoreThemeStyleable.windowNoDisplay::class)
    class windowNoDisplay

    @Reuse(CoreStyleable.textColor::class)
    class textColor

    @Reuse(CoreThemeStyleable.backgroundDimEnabled::class)
    class backgroundDimEnabled

    @Reuse(CoreThemeStyleable.backgroundDimAmount::class)
    class backgroundDimAmount

    @Reuse(CoreThemeStyleable.windowActionBar::class)
    class windowActionBar

    @Reuse(CoreThemeStyleable.windowActionModeOverlay::class)
    class windowActionModeOverlay

    @Reuse(CoreThemeStyleable.windowActionBarOverlay::class)
    class windowActionBarOverlay

    @Reuse(CoreThemeStyleable.windowEnableSplitTouch::class)
    class windowEnableSplitTouch

    @Reuse(CoreThemeStyleable.windowCloseOnTouchOutside::class)
    class windowCloseOnTouchOutside

    @Reuse(CoreThemeStyleable.windowTranslucentStatus::class)
    class windowTranslucentStatus

    @Reuse(CoreThemeStyleable.windowTranslucentNavigation::class)
    class windowTranslucentNavigation

    @Reuse(CoreThemeStyleable.windowSwipeToDismiss::class)
    class windowSwipeToDismiss

    @Reuse(CoreThemeStyleable.windowContentTransitions::class)
    class windowContentTransitions

    @Reuse(CoreThemeStyleable.windowActivityTransitions::class)
    class windowActivityTransitions

    @Reuse(CoreThemeStyleable.windowContentTransitionManager::class)
    class windowContentTransitionManager

    @Reuse(CoreThemeStyleable.windowActionBarFullscreenDecorLayout::class)
    class windowActionBarFullscreenDecorLayout

    // The minimum width the window is allowed to be, along the major
    // axis of the screen.  That is, when in landscape.  Can be either
    // an absolute dimension or a fraction of the screen size in that
    // dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowMinWidthMajor

    // The minimum width the window is allowed to be, along the minor
    // axis of the screen.  That is, when in portrait.  Can be either
    // an absolute dimension or a fraction of the screen size in that
    // dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowMinWidthMinor

    // A fixed width for the window along the major axis of the screen,
    // that is, when in landscape. Can be either an absolute dimension
    // or a fraction of the screen size in that dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowFixedWidthMajor

    // A fixed height for the window along the minor axis of the screen,
    // that is, when in landscape. Can be either an absolute dimension
    // or a fraction of the screen size in that dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowFixedHeightMinor

    // A fixed width for the window along the minor axis of the screen,
    // that is, when in portrait. Can be either an absolute dimension
    // or a fraction of the screen size in that dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowFixedWidthMinor

    // A fixed height for the window along the major axis of the screen,
    // that is, when in portrait. Can be either an absolute dimension
    // or a fraction of the screen size in that dimension.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class windowFixedHeightMajor

    @DimensionValue
    @UseAndroidNamespace
    class windowOutsetBottom

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views into the initial Window's content Scene. Corresponds to
    // {@link android.view.Window#setEnterTransition(android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowEnterTransition::class)
    class windowEnterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views out of the scene when the Window is
    // preparing to close. Corresponds to
    // {@link android.view.Window#setReturnTransition(android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowReturnTransition::class)
    class windowReturnTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views out of the Window's content Scene when launching a new Activity.
    // Corresponds to
    // {@link android.view.Window#setExitTransition(android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowExitTransition::class)
    class windowExitTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move Views in to the scene when returning from a previously-started Activity.
    // Corresponds to
    // {@link android.view.Window#setReenterTransition(android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowReenterTransition::class)
    class windowReenterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move shared elements transferred into the Window's initial content Scene.
    // Corresponds to {@link android.view.Window#setSharedElementEnterTransition(
    //     android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowSharedElementEnterTransition::class)
    class windowSharedElementEnterTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used to move shared elements transferred back to a calling Activity.
    // Corresponds to {@link android.view.Window#setSharedElementReturnTransition(
    //     android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowSharedElementReturnTransition::class)
    class windowSharedElementReturnTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used when starting a new Activity to move shared elements prior to transferring
    // to the called Activity.
    // Corresponds to {@link android.view.Window#setSharedElementExitTransition(
    //     android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowSharedElementExitTransition::class)
    class windowSharedElementExitTransition

    // Reference to a Transition XML resource defining the desired Transition
    // used for shared elements transferred back to a calling Activity.
    // Corresponds to {@link android.view.Window#setSharedElementReenterTransition(
    //     android.transition.Transition)}.
    @Reuse(CoreThemeStyleable.windowSharedElementReenterTransition::class)
    class windowSharedElementReenterTransition

    // Flag indicating whether this Window's transition should overlap with
    // the exiting transition of the calling Activity. Corresponds to
    // {@link android.view.Window#setAllowEnterTransitionOverlap(boolean)}.
    @Reuse(CoreThemeStyleable.windowAllowEnterTransitionOverlap::class)
    class windowAllowEnterTransitionOverlap

    // Flag indicating whether this Window's transition should overlap with
    // the exiting transition of the called Activity when the called Activity
    // finishes. Corresponds to
    // {@link android.view.Window#setAllowReturnTransitionOverlap(boolean)}.
    @Reuse(CoreThemeStyleable.windowAllowReturnTransitionOverlap::class)
    class windowAllowReturnTransitionOverlap

    // Indicates whether or not shared elements should use an overlay
    // during transitions. The default value is true.
    @Reuse(CoreThemeStyleable.windowSharedElementsUseOverlay::class)
    class windowSharedElementsUseOverlay

    // Flag indicating whether this Window is responsible for drawing the background for the
    // system bars. If true and the window is not floating, the system bars are drawn with a
    // transparent background and the corresponding areas in this window are filled with the
    // colors specified in {@link android.R.attr#statusBarColor} and
    // {@link android.R.attr#navigationBarColor}. Corresponds to
    // {@link android.view.WindowManager.LayoutParams#FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS}.
    @BooleanValue
    @UseAndroidNamespace
    class windowDrawsSystemBarBackgrounds

    // The color for the status bar. If the color is not opaque, consider setting
    // {@link android.view.View#SYSTEM_UI_FLAG_LAYOUT_STABLE} and
    // {@link android.view.View#SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN}.
    // For this to take effect, the window must be drawing the system bar backgrounds with
    // {@link android.R.attr#windowDrawsSystemBarBackgrounds} and the status bar must not
    // have been requested to be translucent with
    // {@link android.R.attr#windowTranslucentStatus}.
    // Corresponds to {@link android.view.Window#setStatusBarColor(int)}.
    @ColorValue
    @RequiresApiLevel(21)
    @UseAndroidNamespace
    class statusBarColor

    // The color for the navigation bar. If the color is not opaque, consider setting
    // {@link android.view.View#SYSTEM_UI_FLAG_LAYOUT_STABLE} and
    // {@link android.view.View#SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION}.
    // For this to take effect, the window must be drawing the system bar backgrounds with
    // {@link android.R.attr#windowDrawsSystemBarBackgrounds} and the navigation bar must not
    // have been requested to be translucent with
    // {@link android.R.attr#windowTranslucentNavigation}.
    // Corresponds to {@link android.view.Window#setNavigationBarColor(int)}.
    @ColorValue
    @RequiresApiLevel(21)
    @UseAndroidNamespace
    class navigationBarColor

    // Shows a thin line of the specified color between the navigation bar and the app
    // content.
    // <p>For this to take effect, the window must be drawing the system bar backgrounds with
    // {@link android.R.attr#windowDrawsSystemBarBackgrounds} and the navigation bar must not
    // have been requested to be translucent with
    // {@link android.R.attr#windowTranslucentNavigation}.
    @ColorValue
    @UseAndroidNamespace
    class navigationBarDividerColor

    // The duration, in milliseconds, of the window background fade duration
    // when transitioning into or away from an Activity when called with an
    // Activity Transition. Corresponds to
    // {@link android.view.Window#setTransitionBackgroundFadeDuration(long)}.
    @Reuse(CoreThemeStyleable.windowTransitionBackgroundFadeDuration::class)
    @UseAndroidNamespace
    class windowTransitionBackgroundFadeDuration

    // Elevation to use for the window.
    @DimensionValue
    @UseAndroidNamespace
    class windowElevation

    // Whether to clip window content to the outline of the window background.
    @BooleanValue
    @UseAndroidNamespace
    class windowClipToOutline

    // If set, the status bar will be drawn such that it is compatible with a light
    // status bar background.
    // <p>For this to take effect, the window must be drawing the system bar backgrounds with
    // {@link android.R.attr#windowDrawsSystemBarBackgrounds} and the status bar must not
    // have been requested to be translucent with
    // {@link android.R.attr#windowTranslucentStatus}.
    // Corresponds to setting {@link android.view.View#SYSTEM_UI_FLAG_LIGHT_STATUS_BAR} on
    // the decor view.
    @BooleanValue
    @UseAndroidNamespace
    class windowLightStatusBar

    // Reference to a drawable to be used as the splash screen content of the window. This
    // drawable will be placed on top of the {@link android.R.attr#windowBackground} with its
    // bounds inset by the system bars. If the drawable should not be inset by the system
    // bars, use a fullscreen theme.
    // <p>
    // Note that even if no splashscreen content is set on the theme, the system may still
    // show a splash screen using the other attributes on the theme, like the
    // {@link android.R.attr#windowBackground}.
    @ReferenceValue
    @UseAndroidNamespace
    class windowSplashscreenContent

    // If set, the navigation bar will be drawn such that it is compatible with a light
    // navigation bar background.
    // <p>For this to take effect, the window must be drawing the system bar backgrounds with
    // {@link android.R.attr#windowDrawsSystemBarBackgrounds} and the navigation bar must not
    // have been requested to be translucent with
    // {@link android.R.attr#windowTranslucentNavigation}.
    // Corresponds to setting {@link android.view.View#SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR} on
    // the decor view.
    @BooleanValue
    @UseAndroidNamespace
    class windowLightNavigationBar
}

// The set of attributes that describe a AlertDialog's theme.
@UseAndroidNamespace
abstract class CoreAlertDialogStyleable : BaseStyleable {
    @ReferenceValue
    @ColorValue
    class fullDark

    @ReferenceValue
    @ColorValue
    class topDark

    @ReferenceValue
    @ColorValue
    class centerDark

    @ReferenceValue
    @ColorValue
    class bottomDark

    @ReferenceValue
    @ColorValue
    class fullBright

    @ReferenceValue
    @ColorValue
    class topBright

    @ReferenceValue
    @ColorValue
    class centerBright

    @ReferenceValue
    @ColorValue
    class bottomBright

    @ReferenceValue
    @ColorValue
    class bottomMedium

    @ReferenceValue
    @ColorValue
    class centerMedium

    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    @ReferenceValue
    class buttonPanelSideLayout

    @ReferenceValue
    class listLayout

    @ReferenceValue
    class multiChoiceItemLayout

    @ReferenceValue
    class singleChoiceItemLayout

    @ReferenceValue
    class listItemLayout

    @ReferenceValue
    class progressLayout

    @ReferenceValue
    class horizontalProgressLayout

    //  @hide Not ready for public use.
    @BooleanValue
    class showTitle

    //  @hide Whether fullDark, etc. should use default values if null.
    @BooleanValue
    class needsDefaultBackgrounds

    enum class ControllerTypeEnum(val value: Int) : StyleableEnum {
        // The default controller.
        normal(0),
        // Controller for micro specific layout.
        micro(1)
    }

    // Workaround until we replace AlertController with custom layout.
    @Hide
    @EnumValue(ControllerTypeEnum::class)
    @UseAndroidNamespace
    class controllerType

    // Offset when scrolling to a selection.
    @Hide
    @DimensionValue
    class selectionScrollOffset
}

@Hide
@UseAndroidNamespace
abstract class CoreButtonBarLayoutStyleable : CoreLinearLayoutStyleable() {
    // Whether to automatically stack the buttons when there is not
    // enough space to lay them out side-by-side.
    @BooleanValue
    @UseAndroidNamespace
    class allowStacking
}

// Fragment animation class attributes.
@UseAndroidNamespace
abstract class CoreFragmentAnimationStyleable : BaseStyleable {
    @ReferenceValue
    class fragmentOpenEnterAnimation

    @ReferenceValue
    class fragmentOpenExitAnimation

    @ReferenceValue
    class fragmentCloseEnterAnimation

    @ReferenceValue
    class fragmentCloseExitAnimation

    @ReferenceValue
    class fragmentFadeEnterAnimation

    @ReferenceValue
    class fragmentFadeExitAnimation
}

// Window animation class attributes.
@UseAndroidNamespace
abstract class CoreWindowAnimationStyleable : BaseStyleable {
    // The animation used when a window is being added.
    @ReferenceValue
    class windowEnterAnimation

    // The animation used when a window is being removed.
    @ReferenceValue
    class windowExitAnimation

    // The animation used when a window is going from INVISIBLE to VISIBLE.
    @ReferenceValue
    class windowShowAnimation

    // The animation used when a window is going from VISIBLE to INVISIBLE.
    @ReferenceValue
    class windowHideAnimation

    //  When opening a new activity, this is the animation that is
    // run on the next activity (which is entering the screen).
    @ReferenceValue
    class activityOpenEnterAnimation

    //  When opening a new activity, this is the animation that is
    // run on the previous activity (which is exiting the screen).
    @ReferenceValue
    class activityOpenExitAnimation

    //  When closing the current activity, this is the animation that is
    // run on the next activity (which is entering the screen).
    @ReferenceValue
    class activityCloseEnterAnimation

    //  When closing the current activity, this is the animation that is
    // run on the current activity (which is exiting the screen).
    @ReferenceValue
    class activityCloseExitAnimation

    //  When opening an activity in a new task, this is the animation that is
    // run on the activity of the new task (which is entering the screen).
    @ReferenceValue
    class taskOpenEnterAnimation

    //  When opening an activity in a new task, this is the animation that is
    // run on the activity of the old task (which is exiting the screen).
    @ReferenceValue
    class taskOpenExitAnimation

    //  When opening an activity in a new task using Intent/FLAG_ACTIVITY_LAUNCH_BEHIND,
    // this is the animation that is run on the activity of the new task (which is
    // entering the screen and then leaving).
    @ReferenceValue
    class launchTaskBehindTargetAnimation

    //  When opening an activity in a new task using Intent.FLAG_ACTIVITY_LAUNCH_BEHIND,
    // this is the animation that is run on the activity of the old task (which is
    // already on the screen and then stays on).
    @ReferenceValue
    class launchTaskBehindSourceAnimation

    //  When closing the last activity of a task, this is the animation that is
    // run on the activity of the next task (which is entering the screen).
    @ReferenceValue
    class taskCloseEnterAnimation

    //  When opening an activity in a new task, this is the animation that is
    // run on the activity of the old task (which is exiting the screen).
    @ReferenceValue
    class taskCloseExitAnimation

    //  When bringing an existing task to the foreground, this is the
    // animation that is run on the top activity of the task being brought
    // to the foreground (which is entering the screen).
    @ReferenceValue
    class taskToFrontEnterAnimation

    //  When bringing an existing task to the foreground, this is the
    // animation that is run on the current foreground activity
    // (which is exiting the screen).
    @ReferenceValue
    class taskToFrontExitAnimation

    //  When sending the current task to the background, this is the
    // animation that is run on the top activity of the task behind
    // it (which is entering the screen).
    @ReferenceValue
    class taskToBackEnterAnimation

    //  When sending the current task to the background, this is the
    // animation that is run on the top activity of the current task
    // (which is exiting the screen).
    @ReferenceValue
    class taskToBackExitAnimation

    //  When opening a new activity that shows the wallpaper, while
    // currently not showing the wallpaper, this is the animation that
    // is run on the new wallpaper activity (which is entering the screen).
    @ReferenceValue
    class wallpaperOpenEnterAnimation

    //  When opening a new activity that shows the wallpaper, while
    // currently not showing the wallpaper, this is the animation that
    // is run on the current activity (which is exiting the screen).
    @ReferenceValue
    class wallpaperOpenExitAnimation

    //  When opening a new activity that hides the wallpaper, while
    // currently showing the wallpaper, this is the animation that
    // is run on the new activity (which is entering the screen).
    @ReferenceValue
    class wallpaperCloseEnterAnimation

    //  When opening a new activity that hides the wallpaper, while
    // currently showing the wallpaper, this is the animation that
    // is run on the old wallpaper activity (which is exiting the screen).
    @ReferenceValue
    class wallpaperCloseExitAnimation

    //  When opening a new activity that is on top of the wallpaper
    // when the current activity is also on top of the wallpaper,
    // this is the animation that is run on the new activity
    // (which is entering the screen).  The wallpaper remains
    // static behind the animation.
    @ReferenceValue
    class wallpaperIntraOpenEnterAnimation

    //  When opening a new activity that is on top of the wallpaper
    // when the current activity is also on top of the wallpaper,
    // this is the animation that is run on the current activity
    // (which is exiting the screen).  The wallpaper remains
    // static behind the animation.
    @ReferenceValue
    class wallpaperIntraOpenExitAnimation

    //  When closing a foreround activity that is on top of the wallpaper
    // when the previous activity is also on top of the wallpaper,
    // this is the animation that is run on the previous activity
    // (which is entering the screen).  The wallpaper remains
    // static behind the animation.
    @ReferenceValue
    class wallpaperIntraCloseEnterAnimation

    //  When closing a foreround activity that is on top of the wallpaper
    // when the previous activity is also on top of the wallpaper,
    // this is the animation that is run on the current activity
    // (which is exiting the screen).  The wallpaper remains
    // static behind the animation.
    @ReferenceValue
    class wallpaperIntraCloseExitAnimation

    //  When opening a new activity from a RemoteViews, this is the
    // animation that is run on the next activity (which is entering the
    // screen). Requires config_overrideRemoteViewsActivityTransition to
    // be true.
    @ReferenceValue
    class activityOpenRemoteViewsEnterAnimation
}

// A {@link android.view.ViewStub} lets you lazily include other XML layouts
// inside your application at runtime.
@UseAndroidNamespace
abstract class CoreViewStubStyleable : BaseStyleable {
    // Supply an identifier name for this view.
    @Reuse(CoreViewStyleable.id::class)
    class id

    // Supply an identifier for the layout resource to inflate when the ViewStub
    // becomes visible or when forced to do so. The layout resource must be a
    // valid reference to a layout.
    @ReferenceValue
    @UseAndroidNamespace
    class layout

    // Overrides the id of the inflated View with this value.
    @ReferenceValue
    @UseAndroidNamespace
    class inflatedId
}


// Attributes that can be used with {@link androidC.view.View} or
// any of its subclasses.  Also see {@link #ViewGroup_Layout} for
// attributes that are processed by the view's parent.
@UseAndroidNamespace
abstract class CoreViewStyleable : CoreWidgetStyleable() {
    // Supply an identifier name for this view, to later retrieve it
    // with {@link android.view.View#findViewById View.findViewById()} or
    // {@link android.app.Activity#findViewById Activity.findViewById()}.
    // This must be a
    // resource reference; typically you set this using the
    // <code>@+</code> syntax to create a new ID resources.
    // For example: <code>android:id="@+id/my_id"</code> which
    // allows you to later retrieve the view
    // with <code>findViewById(R.id.my_id)</code>.
    @ReferenceValue
    @UseAndroidNamespace
    class id

    // Supply a tag for this view containing a String, to be retrieved
    // later with {@link android.view.View#getTag View.getTag()} or
    // searched for with {@link android.view.View#findViewWithTag
    //         View.findViewWithTag()}.  It is generally preferable to use
    //  IDs (through the android:id attribute) instead of tags because
    // they are faster and allow for compile-time type checking.
    @StringValue
    @UseAndroidNamespace
    class tag

    // The initial horizontal scroll offset, in pixels.
    @DimensionValue
    @UseAndroidNamespace
    class scrollX

    // The initial vertical scroll offset, in pixels.
    @DimensionValue
    @UseAndroidNamespace
    class scrollY

    // A drawable to use as the background.  This can be either a reference
    // to a full drawable resource (such as a PNG image, 9-patch,
    // XML state list description, etc), or a solid color such as "#ff000000"
    // (black).
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class background

    // Sets the padding, in pixels, of all four edges. Padding is defined as
    // space between the edges of the view and the view's content. This value will take
    // precedence over any of the edge-specific values (paddingLeft, paddingTop,
    // paddingRight, paddingBottom, paddingHorizontal and paddingVertical), but will
    // not override paddingStart or paddingEnd, if set. A view's size
    // will include its padding. If a {@link android.R.attr#background}
    // is provided, the padding will initially be set to that (0 if the
    // drawable does not have padding). Explicitly setting a padding value
    // will override the corresponding padding found in the background.
    @DimensionValue
    @UseAndroidNamespace
    class padding

    // Sets the padding, in pixels, of the left and right edges; see
    // {@link android.R.attr#padding}. This value will take precedence over
    // paddingLeft and paddingRight, but not paddingStart or paddingEnd (if set).
    @DimensionValue
    @UseAndroidNamespace
    class paddingHorizontal

    // Sets the padding, in pixels, of the top and bottom edges; see
    // {@link android.R.attr#padding}. This value will take precedence over
    // paddingTop and paddingBottom, if set.
    @DimensionValue
    @UseAndroidNamespace
    class paddingVertical

    // Sets the padding, in pixels, of the left edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingLeft

    // Sets the padding, in pixels, of the top edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingTop

    // Sets the padding, in pixels, of the right edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingRight

    // Sets the padding, in pixels, of the bottom edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingBottom

    // Sets the padding, in pixels, of the start edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingStart

    // Sets the padding, in pixels, of the end edge; see {@link android.R.attr#padding}.
    @DimensionValue
    @UseAndroidNamespace
    class paddingEnd

    enum class FocusableEnum(val value: Int) : StyleableEnumAndBoolean {
        auto(0x00000010)
    }

    // Controls whether a view can take focus.  By default, this is "auto" which lets the
    // framework determine whether a user can move focus to a view.  By setting this attribute
    // to true the view is allowed to take focus. By setting it to "false" the view will not
    // take focus. This value does not impact the behavior of
    // directly calling {@link android.view.View#requestFocus}, which will
    // always request focus regardless of this view.  It only impacts where
    // focus navigation will try to move focus.
    @EnumAndBooleanValue(FocusableEnum::class)
    @UseAndroidNamespace
    class focusable

    @SkipForDSL
    class __removed3

    // Describes the content of a view so that a autofill service can fill in the appropriate
    // data. Multiple hints can be combined in a comma separated list or an array of strings
    // to mean e.g. emailAddress or postalAddress.
    @ReferenceValue
    @StringValue
    @UseAndroidNamespace
    class autofillHints

    enum class ImportantForAutofillFlag(val value: Long) : StyleableFlag {
        // Let the Android System use its heuristics to determine if the view is important for autofill.
        auto(0),
        // Hint the Android System that this view is important for autofill,
        // and its children (if any) will be traversed..
        yes(0x1),
        // Hint the Android System that this view is *not* important for autofill,
        // but its children (if any) will be traversed..
        no(0x2),
        // Hint the Android System that this view is important for autofill,
        // but its children (if any) will not be traversed.
        yesExcludeDescendants(0x4),
        // Hint the Android System that this view is *not* important for autofill,
        // and its children (if any) will not be traversed.
        noExcludeDescendants(0x8)
    }

    // Hints the Android System whether the view node associated with this View should be
    // included in a view structure used for autofill purposes.
    @FlagValue(ImportantForAutofillFlag::class)
    @UseAndroidNamespace
    class importantForAutofill

    // Boolean that controls whether a view can take focus while in touch mode.
    // If this is true for a view, that view can gain focus when clicked on, and can keep
    // focus if another view is clicked on that doesn't have this attribute set to true.
    @BooleanValue
    @UseAndroidNamespace
    class focusableInTouchMode

    enum class VisibilityEnum(val value: Int) : StyleableEnum {
        // Visible on screen; the default value.
        visible(0),
        // Not displayed, but taken into account during layout (space is left for it).
        invisible(1),
        // Completely hidden, as if the view had not been added.
        gone(2),
    }

    // Controls the initial visibility of the view.
    @EnumValue(VisibilityEnum::class)
    @UseAndroidNamespace
    class visibility

    // Boolean internal attribute to adjust view layout based on
    // system windows such as the status bar.
    // If true, adjusts the padding of this view to leave space for the system windows.
    // Will only take effect if this view is in a non-embedded activity.
    @BooleanValue
    @UseAndroidNamespace
    class fitsSystemWindows

    enum class ScrollbarsFlag(val value: Long) : StyleableFlag {
        // No scrollbar is displayed.
        none(0x00000000),
        // Displays horizontal scrollbar only.
        horizontal(0x00000100),
        // Displays vertical scrollbar only.
        vertical(0x00000200)
    }

    // Defines which scrollbars should be displayed on scrolling or not.
    @FlagValue(ScrollbarsFlag::class)
    @UseAndroidNamespace
    class scrollbars

    enum class ScrollbarStyleEnum(val value: Int) : StyleableEnum {
        // Inside the padding and overlaid.
        insideOverlay(0x0),
        // Inside the padding and inset.
        insideInset(0x01000000),
        // Edge of the view and overlaid.
        outsideOverlay(0x02000000),
        // Edge of the view and inset.
        outsideInset(0x03000000),
    }

    // Controls the scrollbar style and position. The scrollbars can be overlaid or
    // inset. When inset, they add to the padding of the view. And the
    // scrollbars can be drawn inside the padding area or on the edge of
    // the view. For example, if a view has a background drawable and you
    // want to draw the scrollbars inside the padding specified by the
    // drawable, you can use insideOverlay or insideInset. If you want them
    // to appear at the edge of the view, ignoring the padding, then you can
    // use outsideOverlay or outsideInset.
    @EnumValue(ScrollbarStyleEnum::class)
    @UseAndroidNamespace
    class scrollbarStyle

    // Set this if the view will serve as a scrolling container, meaning
    // that it can be resized to shrink its overall window so that there
    // will be space for an input method.  If not set, the default
    // value will be true if "scrollbars" has the vertical scrollbar
    // set, else it will be false.
    @BooleanValue
    @UseAndroidNamespace
    class isScrollContainer

    // Defines whether to fade out scrollbars when they are not in use.
    @BooleanValue
    @UseAndroidNamespace
    class fadeScrollbars

    // Defines the delay in milliseconds that a scrollbar takes to fade out.
    @IntegerValue
    @UseAndroidNamespace
    class scrollbarFadeDuration

    // Defines the delay in milliseconds that a scrollbar waits before fade out.
    @IntegerValue
    @UseAndroidNamespace
    class scrollbarDefaultDelayBeforeFade

    // Sets the width of vertical scrollbars and height of horizontal scrollbars.
    @DimensionValue
    @UseAndroidNamespace
    class scrollbarSize

    // Defines the horizontal scrollbar thumb drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class scrollbarThumbHorizontal

    // Defines the vertical scrollbar thumb drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class scrollbarThumbVertical

    // Defines the horizontal scrollbar track drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class scrollbarTrackHorizontal

    // Defines the vertical scrollbar track drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class scrollbarTrackVertical

    // Defines whether the horizontal scrollbar track should always be drawn.
    @BooleanValue
    @UseAndroidNamespace
    class scrollbarAlwaysDrawHorizontalTrack

    // Defines whether the vertical scrollbar track should always be drawn.
    @BooleanValue
    @UseAndroidNamespace
    class scrollbarAlwaysDrawVerticalTrack

    enum class FadingEdgeFlag(val value: Long) : StyleableFlag {
        // No edge is faded.
        none(0x00000000),
        // Fades horizontal edges only.
        horizontal(0x00001000),
        // Fades vertical edges only.
        vertical(0x00002000)
    }

    // This attribute is ignored in API level 14
    // ({@link android.os.Build.VERSION_CODES#ICE_CREAM_SANDWICH}) and higher.
    // Using fading edges may introduce noticeable performance
    // degradations and should be used only when required by the application's
    // visual design. To request fading edges with API level 14 and above,
    // use the <code>android:requiresFadingEdge</code> attribute instead.
    @FlagValue(FadingEdgeFlag::class)
    @UseAndroidNamespace
    class fadingEdge

    enum class RequiresFadingEdgeFlag(val value: Long) : StyleableFlag {
        // No edge is faded.
        none(0x00000000),
        // Fades horizontal edges only.
        horizontal(0x00001000),
        // Fades vertical edges only.
        vertical(0x00002000)
    }

    // Defines which edges should be faded on scrolling.
    @FlagValue(RequiresFadingEdgeFlag::class)
    @UseAndroidNamespace
    class requiresFadingEdge

    // Defines the length of the fading edges.
    @DimensionValue
    @UseAndroidNamespace
    class fadingEdgeLength

    // Defines the next view to give focus to when the next focus is
    // {@link android.view.View#FOCUS_LEFT}.
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextFocusLeft

    // Defines the next view to give focus to when the next focus is
    // {@link android.view.View#FOCUS_RIGHT}
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextFocusRight

    // Defines the next view to give focus to when the next focus is
    // {@link android.view.View#FOCUS_UP}
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextFocusUp

    // Defines the next view to give focus to when the next focus is
    // {@link android.view.View#FOCUS_DOWN}
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextFocusDown

    // Defines the next view to give focus to when the next focus is
    // {@link android.view.View#FOCUS_FORWARD}
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextFocusForward

    // Defines whether this view reacts to click events.
    @BooleanValue
    @UseAndroidNamespace
    class clickable

    // Defines whether this view reacts to long click events.
    @BooleanValue
    @UseAndroidNamespace
    class longClickable

    //  Defines whether this view reacts to context click events.
    @BooleanValue
    @UseAndroidNamespace
    class contextClickable

    // If false, no state will be saved for this view when it is being
    // frozen. The default is true, allowing the view to be saved
    // (however it also must have an ID assigned to it for its
    // state to be saved).  Setting this to false only disables the
    // state for this view, not for its children which may still
    // be saved.
    @BooleanValue
    @UseAndroidNamespace
    class saveEnabled

    // Specifies whether to filter touches when the view's window is obscured by
    // another visible window.  When set to true, the view will not receive touches
    // whenever a toast, dialog or other window appears above the view's window.
    // Refer to the {@link android.view.View} security documentation for more details.
    @BooleanValue
    @UseAndroidNamespace
    class filterTouchesWhenObscured

    enum class DrawingCacheQualityEnum(val value: Int) : StyleableEnum {
        // Lets the framework decide what quality level should be used
        // for the drawing cache.
        // Deprecated: The view drawing cache was largely made obsolete with the introduction
        // of hardware-accelerated rendering in API 11.
        auto(0),
        // Low quality. When set to low quality, the drawing cache uses a lower color
        // depth, thus losing precision in rendering gradients, but uses less memory.
        // Deprecated: The view drawing cache was largely made obsolete with the introduction
        // of hardware-accelerated rendering in API 11.
        low(1),
        // High quality. When set to high quality, the drawing cache uses a higher
        // color depth but uses more memory.
        // Deprecated: The view drawing cache was largely made obsolete with the introduction
        // of hardware-accelerated rendering in API 11.
        high(2),
    }

    // Defines the quality of translucent drawing caches. This property is used
    // only when the drawing cache is enabled and translucent. The default value is auto.
    // Deprecated: The view drawing cache was largely made obsolete with the introduction of
    // hardware-accelerated rendering in API 11.
    @EnumValue(DrawingCacheQualityEnum::class)
    @UseAndroidNamespace
    class drawingCacheQuality

    // Controls whether the view's window should keep the screen on
    // while visible.
    @BooleanValue
    @UseAndroidNamespace
    class keepScreenOn

    // When this attribute is set to true, the view gets its drawable state
    // (focused, pressed, etc.) from its direct parent rather than from itself.
    @BooleanValue
    @UseAndroidNamespace
    class duplicateParentState

    // Defines the minimum height of the view. It is not guaranteed
    // the view will be able to achieve this minimum height (for example,
    // if its parent layout constrains it with less available height).
    @Reuse(CoreProgressBarStyleable.minHeight::class)
    class minHeight

    // Defines the minimum width of the view. It is not guaranteed
    // the view will be able to achieve this minimum width (for example,
    // if its parent layout constrains it with less available width).
    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth

    // Boolean that controls whether a view should have sound effects
    // enabled for events such as clicking and touching.
    @BooleanValue
    @UseAndroidNamespace
    class soundEffectsEnabled

    // Boolean that controls whether a view should have haptic feedback
    // enabled for events such as long presses.
    @BooleanValue
    @UseAndroidNamespace
    class hapticFeedbackEnabled

    // Defines text that briefly describes content of the view. This property is used
    // primarily for accessibility. Since some views do not have textual
    // representation this attribute can be used for providing such.
    @StringValue
    @LocalizationSuggested
    @UseAndroidNamespace
    class contentDescription

    // Sets the id of a view before which this one is visited in accessibility traversal.
    // A screen-reader must visit the content of this view before the content of the one
    // it precedes.
    // {@see android.view.View#setAccessibilityTraversalBefore(int)}
    @IntegerValue
    @UseAndroidNamespace
    class accessibilityTraversalBefore

    // Sets the id of a view after which this one is visited in accessibility traversal.
    // A screen-reader must visit the content of the other view before the content of
    // this one.
    // {@see android.view.View#setAccessibilityTraversalAfter(int)}
    @IntegerValue
    @UseAndroidNamespace
    class accessibilityTraversalAfter

    // Name of the method in this View's context to invoke when the view is
    // clicked. This name must correspond to a public method that takes
    // exactly one parameter of type View. For instance, if you specify
    // <code>android:onClick="sayHello"</code>, you must declare a
    // <code>public void sayHello(View v)</code> method of your context
    // (typically, your Activity).
    @StringValue
    @UseAndroidNamespace
    class onClick

    enum class OverScrollModeEnum(val value: Int) : StyleableEnum {
        // Always show over-scroll effects, even if the content fits entirely
        // within the available space.
        always(0),
        // Only show over-scroll effects if the content is large
        // enough to meaningfully scroll.
        ifContentScrolls(1),
        // Never show over-scroll effects.
        never(2),
    }

    // Defines over-scrolling behavior. This property is used only if the
    // View is scrollable. Over-scrolling is the ability for the user to
    // receive feedback when attempting to scroll beyond meaningful content.
    @EnumValue(OverScrollModeEnum::class)
    @UseAndroidNamespace
    class overScrollMode

    // alpha property of the view, as a value between 0 (completely transparent) and 1
    // (completely opaque).
    @FloatValue
    @UseAndroidNamespace
    class alpha

    // base z depth of the view.
    @DimensionValue
    @UseAndroidNamespace
    class elevation

    // translation in x of the view. This value is added post-layout to the left
    // property of the view, which is set by its layout.
    @DimensionValue
    @UseAndroidNamespace
    class translationX

    // translation in y of the view. This value is added post-layout to the top
    // property of the view, which is set by its layout.
    @DimensionValue
    @UseAndroidNamespace
    class translationY

    // translation in z of the view. This value is added to its elevation.
    @DimensionValue
    @UseAndroidNamespace
    class translationZ

    // x location of the pivot point around which the view will rotate and scale.
    // This xml attribute sets the pivotX property of the View.
    @DimensionValue
    @UseAndroidNamespace
    class transformPivotX

    // y location of the pivot point around which the view will rotate and scale.
    // This xml attribute sets the pivotY property of the View.
    @DimensionValue
    @UseAndroidNamespace
    class transformPivotY

    // rotation of the view, in degrees.
    @FloatValue
    @UseAndroidNamespace
    class rotation

    // rotation of the view around the x axis, in degrees.
    @FloatValue
    @UseAndroidNamespace
    class rotationX

    // rotation of the view around the y axis, in degrees.
    @FloatValue
    @UseAndroidNamespace
    class rotationY

    // scale of the view in the x direction.
    @FloatValue
    @UseAndroidNamespace
    class scaleX

    // scale of the view in the y direction.
    @FloatValue
    @UseAndroidNamespace
    class scaleY

    enum class VerticalScrollbarPositionEnum(val value: Int) : StyleableEnum {
        // Place the scroll bar wherever the system default determines.
        defaultPosition(0),
        // Place the scroll bar on the left.
        left(1),
        // Place the scroll bar on the right.
        right(2),
    }

    // Determines which side the vertical scroll bar should be placed on.
    @EnumValue(VerticalScrollbarPositionEnum::class)
    @UseAndroidNamespace
    class verticalScrollbarPosition

    enum class LayerTypeEnum(val value: Int) : StyleableEnum {
        // Don't use a layer.
        none(0),
        // Use a software layer. Refer to
        // {@link android.view.View#setLayerType(int, android.graphics.Paint)} for
        // more information.
        software(1),
        // Use a hardware layer. Refer to
        // {@link android.view.View#setLayerType(int, android.graphics.Paint)} for
        // more information.
        hardware(2),
    }

    // Specifies the type of layer backing this view. The default value is none.
    // Refer to {@link android.view.View#setLayerType(int, android.graphics.Paint)}
    // for more information.
    @EnumValue(LayerTypeEnum::class)
    @UseAndroidNamespace
    class layerType

    enum class LayoutDirectionEnum(val value: Int) : StyleableEnum {
        // Left-to-Right.
        ltr(0),
        // Right-to-Left.
        rtl(1),
        // Inherit from parent.
        inherit(2),
        // Locale.
        locale(3),
    }

    // Defines the direction of layout drawing. This typically is associated with writing
    // direction of the language script used. The possible values are "ltr" for Left-to-Right,
    // "rtl" for Right-to-Left, "locale", and "inherit" from parent view. If there is nothing
    // to inherit, "locale" is used. "locale" falls back to "en-US". "ltr" is the direction
    // used in "en-US". The default for this attribute is "inherit".
    @EnumValue(LayoutDirectionEnum::class)
    @UseAndroidNamespace
    class layoutDirection

    enum class TextDirectionEnum(val value: Int) : StyleableEnum {
        // Default.
        inherit(0),
        // Default for the root view. The first strong directional character determines the
        // paragraph direction.  If there is no strong directional character, the paragraph
        // direction is the view’s resolved layout direction.
        firstStrong(1),
        // The paragraph direction is RTL if it contains any strong RTL character, otherwise
        // it is LTR if it contains any strong LTR characters.  If there are neither, the
        // paragraph direction is the view’s resolved layout direction.
        anyRtl(2),
        // The paragraph direction is left to right.
        ltr(3),
        // The paragraph direction is right to left.
        rtl(4),
        // The paragraph direction is coming from the system Locale.
        locale(5),
        // The first strong directional character determines the paragraph direction. If
        // there is no strong directional character, the paragraph direction is LTR.
        firstStrongLtr(6),
        // The first strong directional character determines the paragraph direction. If
        // there is no strong directional character, the paragraph direction is RTL.
        firstStrongRtl(7),
    }

    // Defines the direction of the text.
    @EnumValue(TextDirectionEnum::class)
    @UseAndroidNamespace
    class textDirection

    enum class TextAlignmentEnum(val value: Int) : StyleableEnum {
        // Default.
        inherit(0),
        // Default for the root view. The gravity determines the alignment, ALIGN_NORMAL,
        // ALIGN_CENTER, or ALIGN_OPPOSITE, which are relative to each paragraph’s
        // text direction.
        gravity(1),
        // Align to the start of the paragraph, for example: ALIGN_NORMAL.
        textStart(2),
        // Align to the end of the paragraph, for example: ALIGN_OPPOSITE.
        textEnd(3),
        // Center the paragraph, for example: ALIGN_CENTER.
        center(4),
        // Align to the start of the view, which is ALIGN_LEFT if the view’s resolved
        // layoutDirection is LTR, and ALIGN_RIGHT otherwise.
        viewStart(5),
        // Align to the end of the view, which is ALIGN_RIGHT if the view’s resolved
        // layoutDirection is LTR, and ALIGN_LEFT otherwise.
        viewEnd(6),
    }

    // Defines the alignment of the text.
    @EnumValue(TextAlignmentEnum::class)
    @UseAndroidNamespace
    class textAlignment

    enum class ImportantForAccessibilityEnum(val value: Int) : StyleableEnum {
        // The system determines whether the view is important for accessibility - default
        // (recommended).
        auto(0),
        // The view is important for accessibility.
        yes(1),
        // The view is not important for accessibility.
        no(2),
        // The view is not important for accessibility, nor are any of its descendant
        // views.
        noHideDescendants(4),
    }

    // Describes whether or not this view is important for accessibility.
    // If it is important, the view fires accessibility events and is
    // reported to accessibility services that query the screen. Note:
    // While not recommended, an accessibility service may decide to
    // ignore this attribute and operate on all views in the view tree.
    @EnumValue(ImportantForAccessibilityEnum::class)
    @UseAndroidNamespace
    class importantForAccessibility

    enum class AccessibilityLiveRegionEnum(val value: Int) : StyleableEnum {
        // Accessibility services should not announce changes to this view.
        none(0),
        // Accessibility services should announce changes to this view.
        polite(1),
        // Accessibility services should interrupt ongoing speech to immediately
        // announce changes to this view.
        assertive(2),
    }

    // Indicates to accessibility services whether the user should be notified when
    // this view changes.
    @EnumValue(AccessibilityLiveRegionEnum::class)
    @UseAndroidNamespace
    class accessibilityLiveRegion

    // Specifies the id of a view for which this view serves as a label for
    // accessibility purposes. For example, a TextView before an EditText in
    // the UI usually specifies what infomation is contained in the EditText.
    // Hence, the TextView is a label for the EditText.
    @ReferenceValue
    @UseAndroidNamespace
    class labelFor

    // Specifies a theme override for a view. When a theme override is set, the
    // view will be inflated using a {@link android.content.Context} themed with
    // the specified resource. During XML inflation, any child views under the
    // view with a theme override will inherit the themed context.
    @Reuse(ManifestStyleable.theme::class)
    @UseAndroidNamespace
    class theme

    // Names a View such that it can be identified for Transitions. Names should be
    // unique in the View hierarchy.
    @StringValue
    @UseAndroidNamespace
    class transitionName

    // Specifies that this view should permit nested scrolling within a compatible
    // ancestor view.
    @BooleanValue
    @UseAndroidNamespace
    class nestedScrollingEnabled

    // Sets the state-based animator for the View.
    @ReferenceValue
    @UseAndroidNamespace
    class stateListAnimator

    // Tint to apply to the background.
    @ColorValue
    @UseAndroidNamespace
    class backgroundTint

    enum class BackgroundTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the background tint.
    @EnumValue(BackgroundTintModeEnum::class)
    @UseAndroidNamespace
    class backgroundTintMode

    enum class OutlineProviderEnum(val value: Int) : StyleableEnum {
        // Default, background drawable-driven outline.
        background(0),
        // No outline provider.
        none(1),
        // Generates an opaque outline for the bounds of the view.
        bounds(2),
        // Generates an opaque outline for the padded bounds of the view.
        paddedBounds(3),
    }

    // ViewOutlineProvider used to determine the View's Outline.
    @EnumValue(OutlineProviderEnum::class)
    @UseAndroidNamespace
    class outlineProvider

    // Defines the drawable to draw over the content. This can be used as an overlay.
    // The foreground drawable participates in the padding of the content if the gravity
    // is set to fill.
    @ReferenceValue
    @ColorValue
    class foreground

    enum class ForegroundGravityFlag(val value: Int) : StyleableFlag {
        // Push object to the top of its container, not changing its size.
        top(0x30),
        // Push object to the bottom of its container, not changing its size.
        bottom(0x50),
        // Push object to the left of its container, not changing its size.
        left(0x03),
        // Push object to the right of its container, not changing its size.
        right(0x05),
        // Place object in the vertical center of its container, not changing its size.
        center_vertical(0x10),
        // Grow the vertical size of the object if needed so it completely fills its container.
        fill_vertical(0x70),
        // Place object in the horizontal center of its container, not changing its size.
        center_horizontal(0x01),
        // Grow the horizontal size of the object if needed so it completely fills its container.
        fill_horizontal(0x07),
        // Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
        center(0x11),
        // Grow the horizontal and vertical size of the object if needed so it completely fills its container.
        fill(0x77),
        // Additional option that can be set to have the top and/or bottom edges of
        // the child clipped to its container's bounds.
        // The clip will be based on the vertical gravity: a top gravity will clip the bottom
        // edge, a bottom gravity will clip the top edge, and neither will clip both edges.
        clip_vertical(0x80),
        // Additional option that can be set to have the left and/or right edges of
        // the child clipped to its container's bounds.
        // The clip will be based on the horizontal gravity: a left gravity will clip the right
        // edge, a right gravity will clip the left edge, and neither will clip both edges.
        clip_horizontal(0x08),
    }

    // Defines the gravity to apply to the foreground drawable. The gravity defaults
    // to fill.
    @FlagValue(ForegroundGravityFlag::class)
    @UseAndroidNamespace
    class foregroundGravity

    // Defines whether the foreground drawable should be drawn inside the padding.
    // This property is turned on by default.
    @BooleanValue
    @UseAndroidNamespace
    class foregroundInsidePadding

    // Tint to apply to the foreground.
    @ColorValue
    @UseAndroidNamespace
    class foregroundTint

    enum class ForegroundTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the foreground tint.
    @EnumValue(ForegroundTintModeEnum::class)
    @UseAndroidNamespace
    class foregroundTintMode

    enum class ScrollIndicatorsFlag(val value: Int) : StyleableFlag {
        // No scroll indicators are displayed.
        none(0x00),
        // Displays top scroll indicator when view can be scrolled up.
        top(0x01),
        // Displays bottom scroll indicator when vew can be scrolled down.
        bottom(0x02),
        // Displays left scroll indicator when vew can be scrolled left.
        left(0x04),
        // Displays right scroll indicator when vew can be scrolled right.
        right(0x08),
        // Displays right scroll indicator when vew can be scrolled in the
        // start direction.
        start(0x10),
        // Displays right scroll indicator when vew can be scrolled in the
        // end direction.
        end(0x20),
    }

    // Defines which scroll indicators should be displayed when the view
    // can be scrolled. Multiple values may be combined using logical OR,
    // for example "top|bottom".
    @FlagValue(ScrollIndicatorsFlag::class)
    @UseAndroidNamespace
    class scrollIndicators

    enum class PointerIconEnum(val value: Int) : StyleableEnum {
        // Null icon, pointer becomes invisible.
        none(0),
        // The default icon of arrow pointer.
        arrow(1000),
        // Pointer icon indicating context-menu will appear.
        context_menu(1001),
        // Pointer icon of a hand with the index finger.
        hand(1002),
        // Pointer icon indicating help.
        help(1003),
        // Pointer icon indicating something is going on and waiting.
        wait(1004),
        // Pointer icon for cell and grid.
        cell(1006),
        // Pointer icon of crosshair, indicating to spot a location.
        crosshair(1007),
        // Pointer icon of I-beam, usually for text.
        text(1008),
        // Pointer icon of I-beam with 90-degree rotated, for vertical text.
        vertical_text(1009),
        // Pointer icon of 'alias', indicating an alias of/shortcut to something is to be
        // created.
        alias(1010),
        // Pointer icon of 'copy', used for drag/drop.
        copy(1011),
        // Pointer icon of 'no-drop', indicating the drop will not be accepted at the
        // current location.
        no_drop(1012),
        // Pointer icon of four-way arrows, indicating scrolling all direction.
        all_scroll(1013),
        // Pointer icon of horizontal double arrow, indicating horizontal resize.
        horizontal_double_arrow(1014),
        // Pointer icon of vertical double arrow, indicating vertical resize.
        vertical_double_arrow(1015),
        // Pointer icon of diagonal double arrow, starting from top-right to bottom-left.
        // Indicating freeform resize.
        top_right_diagonal_double_arrow(1016),
        // Pointer icon of diagonal double arrow, starting from top-left to bottom-right.
        // Indicating freeform resize.
        top_left_diagonal_double_arrow(1017),
        // Pointer icon indicating zoom-in.
        zoom_in(1018),
        // Pointer icon indicating zoom-out.
        zoom_out(1019),
        // Pointer icon of a hand sign to grab something.
        grab(1020),
        // Pointer icon of a hand sign while grabbing something.
        grabbing(1021),
    }

    @EnumValue(PointerIconEnum::class)
    @UseAndroidNamespace
    class pointerIcon

    // Whether this view has elements that may overlap when drawn. See
    // {@link android.view.View#forceHasOverlappingRendering(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class forceHasOverlappingRendering

    // Defines text displayed in a small popup window on hover or long press.
    @StringValue
    @LocalizationSuggested
    @UseAndroidNamespace
    class tooltipText

    // Whether this view is a root of a keyboard navigation cluster.
    // See {@link android.view.View#setKeyboardNavigationCluster(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class keyboardNavigationCluster

    @SkipForDSL
    @BooleanValue
    class __removed0

    // Defines the next keyboard navigation cluster.
    // If the reference refers to a view that does not exist or is part
    // of a hierarchy that is invisible, a {@link java.lang.RuntimeException}
    // will result when the reference is accessed.
    @ReferenceValue
    @UseAndroidNamespace
    class nextClusterForward

    @SkipForDSL
    @ReferenceValue
    class __removed1

    // Whether this view is a default-focus view.
    // Only one view per keyboard navigation cluster can have this attribute set to true.
    // See {@link android.view.View#setFocusedByDefault(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class focusedByDefault

    // Whether this View should use a default focus highlight when it gets focused but
    // doesn't have {@link android.R.attr#state_focused} defined in its background.
    @BooleanValue
    @UseAndroidNamespace
    class defaultFocusHighlightEnabled

    // Whether this view should be treated as a focusable unit by screen reader accessibility
    // tools. See {@link android.view.View#setScreenReaderFocusable(boolean)}. The default
    // value, {@code false}, leaves the screen reader to consider other signals, such as
    // focusability or the presence of text, to decide what it focus.
    @BooleanValue
    @UseAndroidNamespace
    class screenReaderFocusable
}

// Attributes that can be assigned to a tag for a particular View.
@UseAndroidNamespace
abstract class CoreViewTagStyleable : BaseStyleable {
    // Specifies the key identifying a tag. This must be a resource reference.
    @Reuse(CoreViewStyleable.id::class)
    class id

    // Specifies the value with which to tag the view.
    @Reuse(ManifestStyleable.name::class)
    class value
}

// Attributes that can be assigned to an &lt;include&gt; tag.
@Hide
@UseAndroidNamespace
abstract class CoreIncludeStyleable : BaseStyleable {
    @Reuse(CoreViewStyleable.id::class)
    class id

    @Reuse(CoreViewStyleable.visibility::class)
    class visibility
}

// Attributes that can be used with a {@link android.view.ViewGroup} or any
// of its subclasses.  Also see {@link #ViewGroup_Layout} for
// attributes that this class processes in its children.
@LayoutStyleable(CoreViewGroup_LayoutStyleable::class)
@UseAndroidNamespace
abstract class CoreViewGroupStyleable : CoreViewStyleable() {
    // Defines whether changes in layout (caused by adding and removing items) should
    // cause a LayoutTransition to run. When this flag is set to true, a default
    // LayoutTransition
    // object will be set on the ViewGroup container and default
    // animations will run when these layout changes occur.
    @BooleanValue
    @UseAndroidNamespace
    class animateLayoutChanges

    // Defines whether a child is limited to draw inside of its bounds or not.
    // This is useful with animations that scale the size of the children to more
    // than 100% for instance. In such a case, this property should be set to false
    // to allow the children to draw outside of their bounds. The default value of
    // this property is true.
    @BooleanValue
    @UseAndroidNamespace
    class clipChildren

    // Defines whether the ViewGroup will clip its children and resize (but not clip) any
    // EdgeEffect to its padding, if padding is not zero. This property is set to true by
    // default.
    @BooleanValue
    @UseAndroidNamespace
    class clipToPadding

    // Defines the layout animation to use the first time the ViewGroup is laid out .
    // Layout animations can also be started manually after the first layout.
    @ReferenceValue
    @UseAndroidNamespace
    class layoutAnimation

    // Defines whether layout animations should create a drawing cache for their
    // children. Enabling the animation cache consumes more memory and requires
    // a longer initialization but provides better performance. The animation
    // cache is enabled by default.
    @BooleanValue
    @UseAndroidNamespace
    class animationCache

    enum class PersistentDrawingCacheFlag(val value: Long) : StyleableFlag {
        // The drawing cache is not persisted after use.
        none(0x0),
        // The drawing cache is persisted after a layout animation.
        animation(0x1),
        // The drawing cache is persisted after a scroll.
        scrolling(0x2),
        // The drawing cache is always persisted.
        all(0x3)
    }

    // Defines the persistence of the drawing cache. The drawing cache might be
    // enabled by a ViewGroup for all its children in specific situations (for
    // instance during a scrolling.) This property lets you persist the cache
    // in memory after its initial usage. Persisting the cache consumes more
    // memory but may prevent frequent garbage collection is the cache is created
    // over and over again. By default the persistence is set to scrolling.
    // Deprecated: The view drawing cache was largely made obsolete with the introduction of
    // hardware-accelerated rendering in API 11.
    @FlagValue(PersistentDrawingCacheFlag::class)
    @UseAndroidNamespace
    class persistentDrawingCache

    // Defines whether the ViewGroup should always draw its children using their
    // drawing cache or not. The default value is true.
    // Deprecated: The view drawing cache was largely made obsolete with the introduction of
    // hardware-accelerated rendering in API 11.
    @BooleanValue
    @UseAndroidNamespace
    class alwaysDrawnWithCache

    // Sets whether this ViewGroup's drawable states also include
    // its children's drawable states.  This is used, for example, to
    // make a group appear to be focused when its child EditText or button
    // is focused.
    @BooleanValue
    @UseAndroidNamespace
    class addStatesFromChildren

    enum class DescendantFocusabilityFlag(val value: Int) : StyleableEnum {
        // The ViewGroup will get focus before any of its descendants.
        beforeDescendants(0),
        // The ViewGroup will get focus only if none of its descendants want it.
        afterDescendants(1),
        // The ViewGroup will block its descendants from receiving focus.
        blocksDescendants(2)
    }

    // Defines the relationship between the ViewGroup and its descendants
    // when looking for a View to take focus.
    @EnumValue(DescendantFocusabilityFlag::class)
    @UseAndroidNamespace
    class descendantFocusability

    // Set to true if this ViewGroup blocks focus in the presence of a touchscreen.
    @BooleanValue
    @UseAndroidNamespace
    class touchscreenBlocksFocus

    // Sets whether this ViewGroup should split MotionEvents
    // to separate child views during touch event dispatch.
    // If false (default), touch events will be dispatched to
    // the child view where the first pointer went down until
    // the last pointer goes up.
    // If true, touch events may be dispatched to multiple children.
    // MotionEvents for each pointer will be dispatched to the child
    // view where the initial ACTION_DOWN event happened.
    // See
    // {@link android.view.ViewGroup#setMotionEventSplittingEnabled(boolean) }
    // for more information.
    @BooleanValue
    @UseAndroidNamespace
    class splitMotionEvents

    enum class LayoutModeFlag(val value: Int) : StyleableEnum {
        // Use the children's clip bounds when laying out this container.
        clipBounds(0),
        // Use the children's optical bounds when laying out this container.
        opticalBounds(1)
    }

    // Defines the layout mode of this ViewGroup.
    @EnumValue(LayoutModeFlag::class)
    @UseAndroidNamespace
    class layoutMode

    // Sets whether or not this ViewGroup should be treated as a single entity
    // when doing an Activity transition. Typically, the elements inside a
    // ViewGroup are each transitioned from the scene individually. The default
    // for a ViewGroup is false unless it has a background. See
    // {
    //     @link android.app.ActivityOptions#makeSceneTransitionAnimation(android.app.Activity,
    //     android.view.View, String)
    // } for more information. Corresponds to
    // {@link android.view.ViewGroup#setTransitionGroup(boolean) }.
    @BooleanValue
    @UseAndroidNamespace
    class transitionGroup
}

@UseAndroidNamespace
abstract class CoreActionModeStyleable : BaseStyleable {
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

@LayoutStyleable(CoreActionBar_LayoutParamsStyleable::class)
@UseAndroidNamespace
abstract class CoreActionBarStyleable : CoreViewGroupStyleable() {
    enum class NavigationModeEnum(val value: Int) : StyleableEnum {
        normal(0),
        listMode(1),
        tabMode(2)
    }

    @EnumValue(NavigationModeEnum::class)
    @UseAndroidNamespace
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
    @UseAndroidNamespace
    class displayOptions

    // Specifies title text used for navigationMode="normal".
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // Specifies subtitle text used for navigationMode="normal".
    @StringValue
    @UseAndroidNamespace
    class subtitle

    // Specifies a style to use for title text.
    @ReferenceValue
    @UseAndroidNamespace
    class titleTextStyle

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    @UseAndroidNamespace
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
    @UseAndroidNamespace
    class backgroundStacked

    // Specifies a background drawable for the bottom component of a split action bar.
    @StringValue
    @UseAndroidNamespace
    class backgroundSplit

    // Specifies a layout for custom navigation. Overrides navigationMode.
    @LayoutValue
    @UseAndroidNamespace
    class customNavigationLayout

    // Specifies a fixed height.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // Specifies a layout to use for the "home" section of the action bar.
    @LayoutValue
    @UseAndroidNamespace
    class homeLayout

    // Specifies a style resource to use for an embedded progress bar.
    @Reuse(CoreThemeStyleable.progressBarStyle::class)
    class progressBarStyle

    // Specifies a style resource to use for an indeterminate progress spinner.
    @ReferenceValue
    @UseAndroidNamespace
    class indeterminateProgressStyle

    // Specifies the horizontal padding on either end for an embedded progress bar.
    @DimensionValue
    @UseAndroidNamespace
    class progressBarPadding

    // Up navigation glyph.
    @Reuse(CoreThemeStyleable.homeAsUpIndicator::class)
    class homeAsUpIndicator

    // Specifies padding that should be applied to the left and right sides of
    // system-provided items in the bar.
    @DimensionValue
    @UseAndroidNamespace
    class itemPadding

    // Set true to hide the action bar on a vertical nested scroll of content.
    @BooleanValue
    @UseAndroidNamespace
    class hideOnContentScroll

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetStart

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetEnd

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetLeft

    // Minimum inset for content views within a bar. Navigation buttons and
    // menu views are excepted. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetRight

    // Minimum inset for content views within a bar when a navigation button
    // is present, such as the Up button. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetStartWithNavigation

    // Minimum inset for content views within a bar when actions from a menu
    // are present. Only valid for some themes and configurations.
    @DimensionValue
    @UseAndroidNamespace
    class contentInsetEndWithActions

    // Elevation for the action bar itself.
    @Reuse(CoreViewStyleable.elevation::class)
    class elevation

    // Reference to a theme that should be used to inflate popups
    // shown by widgets in the action bar.
    @Reuse(CoreToolbarStyleable.popupTheme::class)
    class popupTheme
}

@LayoutStyleable(CoreToolbar_LayoutParamsStyleable::class)
@UseAndroidNamespace
abstract class CoreToolbarStyleable : CoreViewGroupStyleable() {
    // Specifies a style to use for title text.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class titleTextAppearance

    // Specifies a style to use for subtitle text.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class subtitleTextAppearance

    // Specifies title text.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // Specifies subtitle text.
    @Reuse(CoreActionBarStyleable.subtitle::class)
    class subtitle

    // Gravity
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Specifies extra space on the left, start, right and end sides
    // of the toolbar's title. Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class titleMargin

    // Specifies extra space on the start side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class titleMarginStart

    // Specifies extra space on the end side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class titleMarginEnd

    // Specifies extra space on the top side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class titleMarginTop

    // Specifies extra space on the bottom side of the toolbar's title.
    // If both this attribute and titleMargin are specified, then this
    // attribute takes precedence. Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class titleMarginBottom

    @Reuse(CoreActionBarStyleable.contentInsetStart::class)
    class contentInsetStart

    @Reuse(CoreActionBarStyleable.contentInsetEnd::class)
    class contentInsetEnd

    @Reuse(CoreActionBarStyleable.contentInsetLeft::class)
    class contentInsetLeft

    @Reuse(CoreActionBarStyleable.contentInsetRight::class)
    class contentInsetRight

    @Reuse(CoreActionBarStyleable.contentInsetStartWithNavigation::class)
    class contentInsetStartWithNavigation

    @Reuse(CoreActionBarStyleable.contentInsetEndWithActions::class)
    class contentInsetEndWithActions

    @DimensionValue
    @UseAndroidNamespace
    class maxButtonHeight

    // Enum for the button gravity
    enum class ButtonGravityFlag(val value: Long) : StyleableFlag {
        top(0x30),
        bottom(0x50)
    }

    // Button gravity
    @FlagValue(ButtonGravityFlag::class)
    @UseAndroidNamespace
    class buttonGravity

    // Icon drawable to use for the collapse button.
    @StringValue
    @UseAndroidNamespace
    class collapseIcon

    // Text to set as the content description for the collapse button.
    @StringValue
    @UseAndroidNamespace
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
    @UseAndroidNamespace
    class navigationIcon

    // Text to set as the content description for the navigation button
    // located at the start of the toolbar.
    @StringValue
    @UseAndroidNamespace
    class navigationContentDescription

    // Drawable to set as the logo that appears at the starting side of
    // the Toolbar, just after the navigation button.
    @Reuse(ManifestStyleable.logo::class)
    class logo

    // A content description string to describe the appearance of the
    // associated logo image.
    @StringValue
    @UseAndroidNamespace
    class logoDescription

    // A color to apply to the title string.
    @StringValue
    @UseAndroidNamespace
    class titleTextColor

    // A color to apply to the subtitle string.
    @StringValue
    @UseAndroidNamespace
    class subtitleTextColor
}

@UseAndroidNamespace
abstract class CoreTextAppearanceStyleable : BaseStyleable {
    // Text color.
    @Reuse(CoreStyleable.textColor::class)
    class textColor

    // Size of the text. Recommended dimension type for text is "sp" for scaled-pixels (example: 15sp).
    @Reuse(CoreStyleable.textSize::class)
    class textSize

    // Style (bold, italic, bolditalic) for the text.
    @Reuse(CoreStyleable.textStyle::class)
    class textStyle

    // Typeface (normal, sans, serif, monospace) for the text.
    @Reuse(CoreStyleable.typeface::class)
    class typeface

    // Font family (named by string or as a font resource reference) for the text.
    @Reuse(CoreStyleable.fontFamily::class)
    class fontFamily

    // Color of the text selection highlight.
    @Reuse(CoreStyleable.textColorHighlight::class)
    class textColorHighlight

    // Color of the hint text.
    @Reuse(CoreStyleable.textColorHint::class)
    class textColorHint

    // Color of the links.
    @Reuse(CoreStyleable.textColorLink::class)
    class textColorLink

    // Present the text in ALL CAPS. This may use a small-caps form when available.
    @BooleanValue
    @UseAndroidNamespace
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

    // Elegant text height, especially for less compacted complex script text.
    @BooleanValue
    @UseAndroidNamespace
    class elegantTextHeight

    // Text letter-spacing.
    @FloatValue
    @UseAndroidNamespace
    class letterSpacing

    // Font feature settings.
    @StringValue
    @UseAndroidNamespace
    class fontFeatureSettings
}

@UseAndroidNamespace
abstract class CoreListViewStyleable : CoreAbsListViewStyleable() {
    // Reference to an array resource that will populate the ListView.  For static content,
    // this is simpler than populating the ListView programmatically.
    @Reuse(CoreStyleable.entries::class)
    class entries

    // Drawable or color to draw between list items.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class divider

    // Height of the divider. Will use the intrinsic height of the divider if this
    // is not specified.
    @DimensionValue
    @UseAndroidNamespace
    class dividerHeight

    // When set to false, the ListView will not draw the divider after each header view.
    // The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class headerDividersEnabled

    // When set to false, the ListView will not draw the divider before each footer view.
    // The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class footerDividersEnabled

    // Drawable to draw above list content.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class overScrollHeader

    // Drawable to draw below list content.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class overScrollFooter
}


// Use <code>input-method</code> as the root tag of the XML resource that
// describes an
// {@link android.view.inputmethod.InputMethod} service, which is
// referenced from its
// {@link android.view.inputmethod.InputMethod#SERVICE_META_DATA}
// meta-data entry.  Described here are the attributes that can be
// included in that tag.
@InnerStyleable(CoreInputMethod_SubtypeStyleable::class)
@UseAndroidNamespace
abstract class CoreInputMethodStyleable : BaseStyleable {
    // Component name of an activity that allows the user to modify
    // the settings for this service.
    @StringValue
    @UseAndroidNamespace
    class settingsActivity

    // Component name of an activity that allows the user to modify
    // the settings for this service.
    // class settingsActivity
    // Set to true in all of the configurations for which this input
    // method should be considered an option as the default.
    @BooleanValue
    @UseAndroidNamespace
    class isDefault

    // Set to true if this input method supports ways to switch to
    // a next input method (for example, a globe key.). When this is true and
    // InputMethodManager#shouldOfferSwitchingToNextInputMethod() returns true,
    // the IME has to offer ways to invoke InputMethodManager#switchToNextInputMethod()
    // accordingly.
    // <p> Note that the system determines the most appropriate next input method
    // and subtype in order to provide the consistent user experience in switching
    // between IMEs and subtypes.
    @BooleanValue
    @UseAndroidNamespace
    class supportsSwitchingToNextInputMethod

    // Specifies if an IME can only be used while a device is in VR mode or on a dedicated
    // device
    @BooleanValue
    @UseAndroidNamespace
    class isVrOnly

    @BooleanValue
    @UseAndroidNamespace
    @SkipForDSL
    class __removed2
}

// This is the subtype of InputMethod. Subtype can describe locales (for example, en_US and
// fr_FR) and modes (for example, voice and keyboard), and is used for IME switch. This
// subtype allows the system to call the specified subtype of the IME directly.
@UseAndroidNamespace
abstract class CoreInputMethod_SubtypeStyleable : BaseStyleable {
    // The name of the subtype.
    @Reuse(ManifestStyleable.label::class)
    class label

    // The icon of the subtype.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // The locale of the subtype. This string should be a locale (for example en_US and fr_FR)
    // and will be passed to the IME when the framework calls the IME
    // with the subtype. This is also used by the framework to know the supported locales
    // of the IME.
    @StringValue
    @UseAndroidNamespace
    class imeSubtypeLocale

    // The mode of the subtype. This string can be a mode (for example, voice and keyboard)
    // and this string will be passed to the IME when the framework calls the IME with the
    // subtype.  {@link android.view.inputmethod.InputMethodSubtype#getLocale()} returns the
    // value specified in this attribute.
    @StringValue
    @UseAndroidNamespace
    class imeSubtypeMode

    // Set true if the subtype is auxiliary.  An auxiliary subtype won't be shown in the
    // input method selection list in the settings app.
    // InputMethodManager#switchToLastInputMethod will ignore auxiliary subtypes when it
    // chooses a target subtype.
    @BooleanValue
    @UseAndroidNamespace
    class isAuxiliary

    // Set true when this subtype should be selected by default if no other subtypes are
    // selected explicitly. Note that a subtype with this parameter being true will
    // not be shown in the subtypes list.
    @BooleanValue
    @UseAndroidNamespace
    class overridesImplicitlyEnabledSubtype

    // The extra value of the subtype. This string can be any string and will be passed to
    // the IME when the framework calls the IME with the subtype.
    @StringValue
    @UseAndroidNamespace
    class imeSubtypeExtraValue

    // The unique id for the subtype. The input method framework keeps track of enabled
    // subtypes by ID. When the IME package gets upgraded, enabled IDs will stay enabled even
    // if other attributes are different. If the ID is unspecified (by calling the other
    // constructor or 0. Arrays.hashCode(new Object[] {locale, mode, extraValue,
    // isAuxiliary, overridesImplicitlyEnabledSubtype}) will be used instead.
    @IntegerValue
    @UseAndroidNamespace
    class subtypeId

    // Set to true if this subtype is ASCII capable. If the subtype is ASCII
    // capable, it should guarantee that the user can input ASCII characters with
    // this subtype. This is important because many password fields only allow
    // ASCII-characters.
    @BooleanValue
    @UseAndroidNamespace
    class isAsciiCapable

    // The BCP-47 Language Tag of the subtype.  This replaces
    // {@link android.R.styleable#InputMethod_Subtype_imeSubtypeLocale}.
    @StringValue
    @UseAndroidNamespace
    class languageTag
}

// Use <code>spell-checker</code> as the root tag of the XML resource that
// describes an
// {@link android.service.textservice.SpellCheckerService} service, which is
// referenced from its
// {@link android.view.textservice.SpellCheckerSession#SERVICE_META_DATA}
// meta-data entry.  Described here are the attributes that can be
// included in that tag.
@InnerStyleable(CoreSpellChecker_SubtypeStyleable::class)
@UseAndroidNamespace
abstract class CoreSpellCheckerStyleable : BaseStyleable {
    // The name of the spell checker.
    @Reuse(ManifestStyleable.label::class)
    class label

    // Component name of an activity that allows the user to modify
    // the settings for this service.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// This is the subtype of the spell checker. Subtype can describe locales (for example,
// en_US and fr_FR).
@UseAndroidNamespace
abstract class CoreSpellChecker_SubtypeStyleable : BaseStyleable {
    // The name of the subtype.
    @Reuse(ManifestStyleable.label::class)
    class label

    // The locale of the subtype. This string should be a locale (for example, en_US and
    // fr_FR). This is also used by the framework to know the supported locales
    // of the spell checker.
    // {@link android.view.textservice.SpellCheckerSubtype#getLocale() }
    // returns the value specified in this attribute.
    @StringValue
    @UseAndroidNamespace
    class subtypeLocale

    // The extra value of the subtype. This string can be any string and will be passed to
    // the SpellChecker.
    // class subtypeExtraValue
    // The unique id for the subtype. The text service (spell checker) framework keeps track
    // of enabled subtypes by ID. When the spell checker package gets upgraded, enabled IDs
    // will stay enabled even if other attributes are different. If the ID is unspecified or
    // explicitly specified to 0 in XML resources,
    // { @code Arrays.hashCode(new Object [] { subtypeLocale, extraValue }) } will be used instead.
    @Reuse(CoreInputMethod_SubtypeStyleable.subtypeId::class)
    class subtypeId

    // The BCP-47 Language Tag of the subtype.  This replaces
    // {@link android.R.styleable#SpellChecker_Subtype_subtypeLocale }.
    @Reuse(CoreInputMethod_SubtypeStyleable.languageTag::class)
    class languageTag
}

@UseAndroidNamespace
abstract class CoreActionMenuItemViewStyleable : BaseStyleable {
    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth
}

@UseAndroidNamespace
abstract class CoreAbsListViewStyleable : CoreViewGroupStyleable() {
    // Drawable used to indicate the currently selected item in the list.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class listSelector

    // When set to true, the selector will be drawn over the selected item.
    // Otherwise the selector is drawn behind the selected item. The default
    // value is false.
    @BooleanValue
    @UseAndroidNamespace
    class drawSelectorOnTop

    // Used by ListView and GridView to stack their content from the bottom.
    @BooleanValue
    @UseAndroidNamespace
    class stackFromBottom

    // When set to true, the list uses a drawing cache during scrolling.
    // This makes the rendering faster but uses more memory. The default
    // value is true.
    @BooleanValue
    @UseAndroidNamespace
    class scrollingCache

    // When set to true, the list will filter results as the user types. The
    // List's adapter must support the Filterable interface for this to work.
    @BooleanValue
    @UseAndroidNamespace
    class textFilterEnabled

    enum class TranscriptModeEnum(val value: Int) : StyleableEnum {
        // Disables transcript mode. This is the default value.
        disabled(0),
        // The list will automatically scroll to the bottom when
        // a data set change notification is received and only if the last item is
        // already visible on screen.
        normal(1),
        // The list will automatically scroll to the bottom, no matter what items
        // are currently visible.
        alwaysScroll(2)
    }

    // Sets the transcript mode for the list. In transcript mode, the list
    // scrolls to the bottom to make new items visible when they are added.
    @EnumValue(TranscriptModeEnum::class)
    @UseAndroidNamespace
    class transcriptMode

    // Indicates that this list will always be drawn on top of solid, single-color
    // opaque background. This allows the list to optimize drawing.
    @ColorValue
    @UseAndroidNamespace
    class cacheColorHint

    // Enables the fast scroll thumb that can be dragged to quickly scroll through
    // the list.
    @BooleanValue
    @UseAndroidNamespace
    class fastScrollEnabled

    // Specifies the style of the fast scroll decorations.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreFastScrollStyleable::class)
    class fastScrollStyle

    // When set to true, the list will use a more refined calculation
    // method based on the pixels height of the items visible on screen. This
    // property is set to true by default but should be set to false if your adapter
    // will display items of varying heights. When this property is set to true and
    // your adapter displays items of varying heights, the scrollbar thumb will
    // change size as the user scrolls through the list. When set to false, the list
    // will use only the number of items in the adapter and the number of items visible
    // on screen to determine the scrollbar's properties.
    @BooleanValue
    @UseAndroidNamespace
    class smoothScrollbar

    enum class ChoiceModeEnum(val value: Int) : StyleableEnum {
        // Normal list that does not indicate choices.
        none(0),
        // The list allows up to one choice.
        singleChoice(1),
        // The list allows multiple choices.
        multipleChoice(2),
        // The list allows multiple choices in a custom selection mode.
        multipleChoiceModal(3)
    }

    // Defines the choice behavior for the view. By default, lists do not have
    // any choice behavior. By setting the choiceMode to singleChoice, the list
    // allows up to one item to be in a chosen state. By setting the choiceMode to
    // multipleChoice, the list allows any number of items to be chosen.
    // Finally, by setting the choiceMode to multipleChoiceModal the list allows
    // any number of items to be chosen in a special selection mode.
    // The application will supply a
    // {@link android.widget.AbsListView.MultiChoiceModeListener } using
    // {@link android.widget.AbsListView#setMultiChoiceModeListener } to control the
    // selection mode. This uses the
    // {@link android.view.ActionMode } API.
    @EnumValue(ChoiceModeEnum::class)
    @UseAndroidNamespace
    class choiceMode

    // When set to true, the list will always show the fast scroll
    // interface.
    // This setting implies fastScrollEnabled.
    @BooleanValue
    @UseAndroidNamespace
    class fastScrollAlwaysVisible
}

@Hide
@UseAndroidNamespace
abstract class CoreRecycleListViewStyleable : CoreViewGroupStyleable() {
    // Bottom padding to use when no buttons are present.
    @DimensionValue
    @UseAndroidNamespace
    class paddingBottomNoButtonsclass

    // Top padding to use when no title is present.
    @DimensionValue
    @UseAndroidNamespace
    class paddingTopNoTitleclass
}

@UseAndroidNamespace
abstract class CoreAbsSpinnerStyleable : CoreViewGroupStyleable() {
    // Reference to an array resource that will populate the Spinner.  For static content,
    // this is simpler than populating the Spinner programmatically.
    @Reuse(CoreStyleable.entries::class)
    class entries
}

@UseAndroidNamespace
abstract class CoreAnalogClockStyleable : CoreViewStyleable() {
    @ReferenceValue
    @UseAndroidNamespace
    class dial

    @ReferenceValue
    @UseAndroidNamespace
    class hand_hour

    @ReferenceValue
    @UseAndroidNamespace
    class hand_minute
}

@UseAndroidNamespace
abstract class CoreButtonStyleable : CoreTextViewStyleable()

@UseAndroidNamespace
abstract class CoreChronometerStyleable : CoreTextViewStyleable() {

    // Format string: if specified, the Chronometer will display this
    // string, with the first "%s" replaced by the current timer value
    // in "MM:SS" or "H:MM:SS" form.
    // If no format string is specified, the Chronometer will simply display
    // "MM:SS" or "H:MM:SS".
    @StringValue
    @LocalizationSuggested
    @UseAndroidNamespace
    class format

    // Specifies whether this Chronometer counts down or counts up from the base.
    // If not specified this is false and the Chronometer counts up.
    @BooleanValue
    @UseAndroidNamespace
    class countDown
}

@UseAndroidNamespace
abstract class CoreCompoundButtonStyleable : CoreButtonStyleable() {
    // Indicates the initial checked state of this button.
    @BooleanValue
    @UseAndroidNamespace
    class checked

    // Drawable used for the button graphic (for example, checkbox and radio button).
    @ReferenceValue
    @UseAndroidNamespace
    class button

    // Tint to apply to the button graphic.
    @ColorValue
    @UseAndroidNamespace
    class buttonTint

    enum class ButtonTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the button graphic tint.
    @EnumValue(ButtonTintModeEnum::class)
    @UseAndroidNamespace
    class buttonTintMode
}

@UseAndroidNamespace
abstract class CoreCheckedTextViewStyleable : CoreTextViewStyleable() {
    // Indicates the initial checked state of this text.
    @Reuse(CoreCompoundButtonStyleable.checked::class)
    class checked

    // Drawable used for the check mark graphic.
    @ReferenceValue
    @UseAndroidNamespace
    class checkMark

    // Tint to apply to the check mark.
    @ColorValue
    @UseAndroidNamespace
    class checkMarkTint

    enum class CheckMarkTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the check mark tint.
    @EnumValue(CheckMarkTintModeEnum::class)
    @UseAndroidNamespace
    class checkMarkTintMode

    enum class CheckMarkGravityFlag(val value: Int) : StyleableFlag {
        // Push object to the left of its container, not changing its size.
        left(0x03),
        // Push object to the right of its container, not changing its size.
        right(0x05),
        // Push object to the beginning of its container, not changing its size.
        start(0x00800003),
        // Push object to the end of its container, not changing its size.
        end(0x00800005)
    }

    // Gravity for aligning a CheckedTextView's checkmark to one side or the other.
    @FlagValue(CheckMarkGravityFlag::class)
    @UseAndroidNamespace
    class checkMarkGravity
}

@UseAndroidNamespace
abstract class CoreEditTextViewStyleable : CoreTextViewStyleable()

@UseAndroidNamespace
abstract class CoreFastScrollStyleable : BaseStyleable {
    // Drawable used for the scroll bar thumb.
    @ReferenceValue
    @UseAndroidNamespace
    class thumbDrawable

    // Minimum width of the thumb.
    @DimensionValue
    @UseAndroidNamespace
    class thumbMinWidth

    // Minimum height of the thumb.
    @DimensionValue
    @UseAndroidNamespace
    class thumbMinHeight

    // Drawable used for the scroll bar track.
    @ReferenceValue
    @UseAndroidNamespace
    class trackDrawable

    // Drawable used for the section header preview when right-aligned.
    @ReferenceValue
    @UseAndroidNamespace
    class backgroundRight

    // Drawable used for the section header preview when left-aligned.
    @ReferenceValue
    @UseAndroidNamespace
    class backgroundLeft

    enum class PositionEnum(val value: Int) : StyleableEnum {
        // Floating at the top of the content.
        floating(0),
        // Pinned to the thumb, vertically centered with the middle of the thumb.
        atThumb(1),
        // Pinned to the thumb, vertically centered with the top edge of the thumb.
        aboveThumb(2)
    }

    // Position of section header preview.
    @EnumValue(PositionEnum::class)
    @UseAndroidNamespace
    class position

    @Reuse(CoreTextViewStyleable.textAppearance::class)
    class textAppearance

    @Reuse(CoreStyleable.textColor::class)
    class textColor

    @Reuse(CoreStyleable.textSize::class)
    class textSize

    // Minimum width of the section header preview.
    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth

    // Minimum height of the section header preview.
    @Reuse(CoreProgressBarStyleable.minHeight::class)
    class minHeight

    // Padding for the section header preview.
    @Reuse(CoreViewStyleable.padding::class)
    class padding

    enum class ThumbPositionEnum(val value: Int) : StyleableEnum {
        // The thumb's midpoint is anchored to the track. At its
        // extremes, the thumb will extend half-way outside the
        // track.
        midpoint(0),
        // The thumb is entirely inside the track. At its extremes,
        // the thumb will be contained entirely within the track.
        inside(1)
    }

    // Position of thumb in relation to the track.
    @EnumValue(ThumbPositionEnum::class)
    @UseAndroidNamespace
    class thumbPosition
}

@LayoutStyleable(CoreFrameLayout_LayoutStyleable::class)
@UseAndroidNamespace
abstract class CoreFrameLayoutStyleable : CoreViewGroupStyleable() {
    // Determines whether to measure all children or just those in
    // the VISIBLE or INVISIBLE state when measuring. Defaults to false.
    @BooleanValue
    @UseAndroidNamespace
    class measureAllChildren
}

@UseAndroidNamespace
abstract class CoreExpandableListViewStyleable : CoreListViewStyleable() {
    // Indicator shown beside the group View. This can be a stateful Drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class groupIndicator

    // Indicator shown beside the child View. This can be a stateful Drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class childIndicator

    // The left bound for an item's indicator. To specify a left bound specific to children,
    // use childIndicatorLeft.
    @DimensionValue
    @UseAndroidNamespace
    class indicatorLeft

    // The right bound for an item's indicator. To specify a right bound specific to children,
    // use childIndicatorRight.
    @DimensionValue
    @UseAndroidNamespace
    class indicatorRight

    // The left bound for a child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class childIndicatorLeft

    // The right bound for a child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class childIndicatorRight

    // Drawable or color that is used as a divider for children. (It will drawn
    // below and above child items.) The height of this will be the same as
    // the height of the normal list item divider.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class childDivider

    // The start bound for an item's indicator. To specify a start bound specific to children,
    // use childIndicatorStart.
    @DimensionValue
    @UseAndroidNamespace
    class indicatorStart

    // The end bound for an item's indicator. To specify a right bound specific to children,
    // use childIndicatorEnd.
    @DimensionValue
    @UseAndroidNamespace
    class indicatorEnd

    // The start bound for a child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class childIndicatorStart

    // The end bound for a child's indicator.
    @DimensionValue
    @UseAndroidNamespace
    class childIndicatorEnd
}

@UseAndroidNamespace
abstract class CoreGalleryStyleable : CoreAbsSpinnerStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Sets how long a transition animation should run (in milliseconds)
    // when layout has changed.  Only relevant if animation is turned on.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class animationDuration

    @DimensionValue
    @UseAndroidNamespace
    class spacing

    // Sets the alpha on the items that are not selected.
    @FloatValue
    @UseAndroidNamespace
    class unselectedAlpha
}

@UseAndroidNamespace
abstract class CoreGridViewStyleable : CoreAbsListViewStyleable() {
    // Defines the default horizontal spacing between columns.
    @DimensionValue
    @UseAndroidNamespace
    class horizontalSpacing

    // Defines the default vertical spacing between rows.
    @DimensionValue
    @UseAndroidNamespace
    class verticalSpacing

    enum class StretchModeEnum(val value: Int) : StyleableEnum {
        // Stretching is disabled.
        none(0),
        // The spacing between each column is stretched.
        spacingWidth(1),
        // Each column is stretched equally.
        columnWidth(2),
        // The spacing between each column is uniformly stretched..
        spacingWidthUniform(3)
    }

    // Defines how columns should stretch to fill the available empty space, if any.
    @EnumValue(StretchModeEnum::class)
    @UseAndroidNamespace
    class stretchMode

    // Specifies the fixed width for each column.
    @DimensionValue
    @UseAndroidNamespace
    class columnWidth

    enum class NumColumnsEnum(val value: Int) : StyleableEnumAndInteger {
        // Display as many columns as possible to fill the available space.
        auto_fit(-1)
    }

    // Defines how many columns to show.
    @EnumAndIntegerValue(NumColumnsEnum::class)
    @UseAndroidNamespace
    class numColumns

    // Specifies the gravity within each cell.
    @Reuse(CoreStyleable.gravity::class)
    class gravity
}

@UseAndroidNamespace
abstract class CoreImageSwitcherStyleable : CoreViewSwitcherStyleable()

@UseAndroidNamespace
abstract class CoreImageViewStyleable : CoreViewStyleable() {
    // Sets a drawable as the content of this ImageView.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class src

    enum class ScaleTypeEnum(val value: Int) : StyleableEnum {
        // Scale using the image matrix when drawing. See
        // {@link android.widget.ImageView#setImageMatrix(Matrix)}.
        matrix(0),
        // Scale the image using {@link android.graphics.Matrix.ScaleToFit#FILL}.
        fitXY(1),
        // Scale the image using {@link android.graphics.Matrix.ScaleToFit#START}.
        fitStart(2),
        // Scale the image using {@link android.graphics.Matrix.ScaleToFit#CENTER}.
        fitCenter(3),
        // Scale the image using {@link android.graphics.Matrix.ScaleToFit#END}.
        fitEnd(4),
        // Center the image in the view, but perform no scaling.
        center(5),
        // Scale the image uniformly (maintain the image's aspect ratio) so both dimensions
        // (width and height) of the image will be equal to or larger than the corresponding
        // dimension of the view (minus padding). The image is then centered in the view.
        centerCrop(6),
        // Scale the image uniformly (maintain the image's aspect ratio) so that both
        // dimensions (width and height) of the image will be equal to or less than the
        // corresponding dimension of the view (minus padding). The image is then centered in
        // the view.
        centerInside(7)
    }

    // Controls how the image should be resized or moved to match the size
    // of this ImageView.  See {@link android.widget.ImageView.ScaleType}
    @EnumValue(ScaleTypeEnum::class)
    @UseAndroidNamespace
    class scaleType

    // Set this to true if you want the ImageView to adjust its bounds
    // to preserve the aspect ratio of its drawable.
    @BooleanValue
    @UseAndroidNamespace
    class adjustViewBounds

    // An optional argument to supply a maximum width for this view.
    // See {see android.widget.ImageView#setMaxWidth} for details.
    @DimensionValue
    @UseAndroidNamespace
    class maxWidth

    // An optional argument to supply a maximum height for this view.
    // See {see android.widget.ImageView#setMaxHeight} for details.
    @DimensionValue
    @UseAndroidNamespace
    class maxHeight

    // The tinting color for the image. By default, the tint will blend using SRC_ATOP mode.
    // Please note that for compatibility reasons, this is NOT consistent with the default
    // SRC_IN tint mode used by {@link android.widget.ImageView#setImageTintList} and by
    // similar tint attributes on other views.
    @ColorValue
    @UseAndroidNamespace
    class tint

    // If true, the image view will be baseline aligned with based on its
    // bottom edge.
    @BooleanValue
    @UseAndroidNamespace
    class baselineAlignBottom

    // If true, the image will be cropped to fit within its padding.
    @BooleanValue
    @UseAndroidNamespace
    class cropToPadding

    // The offset of the baseline within this view. See {see android.view.View#getBaseline}
    // for details
    @DimensionValue
    @UseAndroidNamespace
    class baseline

    // The alpha value (0-255) set on the ImageView's drawable. Equivalent
    // to calling ImageView.setAlpha(int), not the same as View.setAlpha(float).
    @Hide
    @IntegerValue
    @UseAndroidNamespace
    class drawableAlpha

    // Blending mode used to apply the image tint.
    @Reuse(CoreBitmapDrawableStyleable.tintMode::class)
    class tintMode
}

@UseAndroidNamespace
abstract class CoreToggleButtonStyleable : CoreCompoundButtonStyleable() {
    // The text for the button when it is checked.
    @StringValue
    @UseAndroidNamespace
    class textOn

    // The text for the button when it is not checked.
    @StringValue
    @UseAndroidNamespace
    class textOff

    // The alpha to apply to the indicator when disabled.
    @Reuse(CoreThemeStyleable.disabledAlpha::class)
    class disabledAlpha
}

@LayoutStyleable(CoreRelativeLayout_LayoutStyleable::class)
@UseAndroidNamespace
abstract class CoreRelativeLayoutStyleable : CoreViewGroupStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Indicates what view should not be affected by gravity.
    @ReferenceValue
    @UseAndroidNamespace
    class ignoreGravity
}

@LayoutStyleable(CoreLinearLayout_LayoutStyleable::class)
@UseAndroidNamespace
abstract class CoreLinearLayoutStyleable : CoreViewGroupStyleable() {
    // Should the layout be a column or a row?  Use "horizontal"
    // for a row, "vertical" for a column.  The default is
    // horizontal.
    @Reuse(CoreStyleable.orientation::class)
    class orientation

    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // When set to false, prevents the layout from aligning its children's
    // baselines. This attribute is particularly useful when the children
    // use different values for gravity. The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class baselineAligned

    // When a linear layout is part of another layout that is baseline
    // aligned, it can specify which of its children to baseline align to
    // (that is, which child TextView).
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class baselineAlignedChildIndex

    // Defines the maximum weight sum. If unspecified, the sum is computed
    // by adding the layout_weight of all of the children. This can be
    // used for instance to give a single child 50% of the total available
    // space by giving it a layout_weight of 0.5 and setting the weightSum
    // to 1.0.
    @FloatValue
    @UseAndroidNamespace
    class weightSum

    // When set to true, all children with a weight will be considered having
    // the minimum size of the largest child. If false, all children are
    // measured normally.
    @BooleanValue
    @UseAndroidNamespace
    class measureWithLargestChild

    // Drawable to use as a vertical divider between buttons.
    @Reuse(CoreListViewStyleable.divider::class)
    class divider

    enum class ShowDividersFlag(val value: Int) : StyleableFlag {
        none(0),
        beginning(1),
        middle(2),
        end(4)
    }

    // Setting for which dividers to show.
    @FlagValue(ShowDividersFlag::class)
    @UseAndroidNamespace
    class showDividers

    // Size of padding on either end of a divider.
    @DimensionValue
    @UseAndroidNamespace
    class dividerPadding
}

@LayoutStyleable(CoreGridLayout_LayoutStyleable::class)
@UseAndroidNamespace
abstract class CoreGridLayoutStyleable : CoreViewGroupStyleable() {

    // The orientation property is not used during layout. It is only used to
    // allocate row and column parameters when they are not specified by its children's
    // layout paramters. GridLayout works like LinearLayout in this case;
    // putting all the components either in a single row or in a single column -
    // depending on the value of this flag. In the horizontal case, a columnCount
    // property may be additionally supplied to force new rows to be created when a
    // row is full. The rowCount attribute may be used similarly in the vertical case.
    // The default is horizontal.
    @Reuse(CoreStyleable.orientation::class)
    class orientation

    // The maxmimum number of rows to create when automatically positioning children.
    @IntegerValue
    @UseAndroidNamespace
    class rowCount

    // The maxmimum number of columns to create when automatically positioning children.
    @IntegerValue
    @UseAndroidNamespace
    class columnCount

    // When set to true, tells GridLayout to use default margins when none are specified
    // in a view's layout parameters.
    // The default value is false.
    // See {@link android.widget.GridLayout#setUseDefaultMargins(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class useDefaultMargins

    // When set to alignMargins, causes alignment to take place between the outer
    // boundary of a view, as defined by its margins. When set to alignBounds,
    // causes alignment to take place between the edges of the view.
    // The default is alignMargins.
    // See {@link android.widget.GridLayout#setAlignmentMode(int)}.
    @Reuse(CoreStyleable.alignmentMode::class)
    class alignmentMode

    // When set to true, forces row boundaries to appear in the same order
    // as row indices.
    // The default is true.
    // See {@link android.widget.GridLayout#setRowOrderPreserved(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class rowOrderPreserved

    // When set to true, forces column boundaries to appear in the same order
    // as column indices.
    // The default is true.
    // See {@link android.widget.GridLayout#setColumnOrderPreserved(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class columnOrderPreserved
}

@UseAndroidNamespace
abstract class CoreMenuViewStyleable : BaseStyleable {
    // Default appearance of menu item text.
    @ReferenceValue
    @UseAndroidNamespace
    class itemTextAppearance

    // Default horizontal divider between rows of menu items.
    @ReferenceValue
    @UseAndroidNamespace
    class horizontalDivider

    // Default vertical divider between menu items.
    @ReferenceValue
    @UseAndroidNamespace
    class verticalDivider

    // Default background for the menu header .
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class headerBackground

    // Default background for each menu item.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class itemBackground

    // Default animations for the menu.
    @Reuse(CoreThemeStyleable.windowAnimationStyle::class)
    class windowAnimationStyle

    // Default disabled icon alpha for each menu item that shows an icon.
    @FloatValue
    @UseAndroidNamespace
    class itemIconDisabledAlpha

    // Whether space should be reserved in layout when an icon is missing.
    class preserveIconSpacing

    // Drawable for the arrow icon indicating a particular item is a submenu.
    @ReferenceValue
    @UseAndroidNamespace
    class subMenuArrow
}

@UseAndroidNamespace
abstract class CoreIconMenuViewStyleable : CoreMenuViewStyleable() {

    // Defines the height of each row.
    @DimensionValue
    @UseAndroidNamespace
    class rowHeight

    // Defines the maximum number of rows displayed.
    @IntegerValue
    @UseAndroidNamespace
    class maxRows

    // Defines the maximum number of items per row.
    @IntegerValue
    @UseAndroidNamespace
    class maxItemsPerRow

    // Defines the maximum number of items to show.
    @IntegerValue
    @UseAndroidNamespace
    class maxItems

    // 'More' icon.
    @ReferenceValue
    @UseAndroidNamespace
    class moreIcon
}

@UseAndroidNamespace
abstract class CoreProgressBarStyleable : CoreViewStyleable() {
    // Defines the minimum value.
    @IntegerValue
    @UseAndroidNamespace
    class min

    // Defines the maximum value.
    @IntegerValue
    @UseAndroidNamespace
    class max

    // Defines the default progress value, between 0 and max.
    @IntegerValue
    @UseAndroidNamespace
    class progress

    // Defines the secondary progress value, between 0 and max. This progress is drawn between
    // the primary progress and the background.  It can be ideal for media scenarios such as
    // showing the buffering progress while the default progress shows the play progress.
    @IntegerValue
    @UseAndroidNamespace
    class secondaryProgress

    // Allows to enable the indeterminate mode. In this mode the progress
    // bar plays an infinite looping animation.
    @BooleanValue
    @UseAndroidNamespace
    class indeterminate

    // Restricts to ONLY indeterminate mode (state-keeping progress mode will not work).
    @BooleanValue
    @UseAndroidNamespace
    class indeterminateOnly

    // Drawable used for the indeterminate mode.
    @ReferenceValue
    @UseAndroidNamespace
    class indeterminateDrawable

    // Drawable used for the progress mode.
    @ReferenceValue
    @UseAndroidNamespace
    class progressDrawable

    // Duration of the indeterminate animation.
    @IntegerValue
    @IntegerMinValue(1)
    @UseAndroidNamespace
    class indeterminateDuration

    enum class IndeterminateBehaviorEnum(val value: Int) : StyleableEnum {
        // Progress starts over from 0.
        repeat(1),
        // Progress keeps the current value and goes back to 0.
        cycle(2)
    }

    // Defines how the indeterminate mode should behave when the progress
    // reaches max.
    @EnumValue(IndeterminateBehaviorEnum::class)
    @UseAndroidNamespace
    class indeterminateBehavior

    @DimensionValue
    @UseAndroidNamespace
    class minWidth

    @Reuse(CoreImageViewStyleable.maxWidth::class)
    class maxWidth

    @DimensionValue
    @UseAndroidNamespace
    class minHeight

    @Reuse(CoreImageViewStyleable.maxHeight::class)
    class maxHeight

    @ReferenceValue
    @UseAndroidNamespace
    class interpolator

    // Timeout between frames of animation in milliseconds.
    @Deprecated("Not used by the framework")
    @IntegerValue
    @UseAndroidNamespace
    class animationResolution

    // Defines if the associated drawables need to be mirrored when in RTL mode.
    // Default is false.
    @BooleanValue
    @UseAndroidNamespace
    class mirrorForRtl

    // Tint to apply to the progress indicator.
    @ColorValue
    @UseAndroidNamespace
    class progressTint

    enum class ProgressTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the progress indicator tint.
    @EnumValue(ProgressTintModeEnum::class)
    @UseAndroidNamespace
    class progressTintMode

    // Tint to apply to the progress indicator background.
    @ColorValue
    @UseAndroidNamespace
    class progressBackgroundTint

    enum class ProgressBackgroundTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the progress indicator background tint.
    @EnumValue(ProgressBackgroundTintModeEnum::class)
    @UseAndroidNamespace
    class progressBackgroundTintMode

    // Tint to apply to the secondary progress indicator.
    @ColorValue
    @UseAndroidNamespace
    class secondaryProgressTint

    enum class SecondaryProgressTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the secondary progress indicator tint.
    @EnumValue(SecondaryProgressTintModeEnum::class)
    @UseAndroidNamespace
    class secondaryProgressTintMode

    // Tint to apply to the indeterminate progress indicator.
    @ColorValue
    @UseAndroidNamespace
    class indeterminateTint

    enum class IndeterminateTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the indeterminate progress indicator tint.
    @EnumValue(IndeterminateTintModeEnum::class)
    @UseAndroidNamespace
    class indeterminateTintMode

    // Tint to apply to the background.
    @Reuse(CoreViewStyleable.backgroundTint::class)
    class backgroundTint

    // Blending mode used to apply the background tint.
    @Reuse(CoreViewStyleable.backgroundTintMode::class)
    class backgroundTintMode
}

@UseAndroidNamespace
abstract class CoreSeekBarStyleable : CoreProgressBarStyleable() {

    // Draws the thumb on a seekbar.
    @ReferenceValue
    @UseAndroidNamespace
    class thumb

    // An offset for the thumb that allows it to extend out of the range of the track.
    @DimensionValue
    @UseAndroidNamespace
    class thumbOffset

    // Whether to split the track and leave a gap for the thumb drawable.
    @BooleanValue
    @UseAndroidNamespace
    class splitTrack

    // Whether to force the track's alpha to ?android:attr/disabledAlpha
    // when disabled. This is required for Holo and Gingerbread, but
    // should always be false for Material and  beyond.
    // Developers shouldn't need to change this.
    @Hide
    @BooleanValue
    @UseAndroidNamespace
    class useDisabledAlpha

    // Tint to apply to the thumb drawable.
    @ColorValue
    @UseAndroidNamespace
    class thumbTint

    enum class ThumbTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the thumb tint.
    @EnumValue(ThumbTintModeEnum::class)
    @UseAndroidNamespace
    class thumbTintMode

    // Drawable displayed at each progress position on a seekbar.
    @ReferenceValue
    @UseAndroidNamespace
    class tickMark

    // Tint to apply to the tick mark drawable.
    @ColorValue
    @UseAndroidNamespace
    class tickMarkTint

    enum class TickMarkTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the tick mark tint.
    @EnumValue(TickMarkTintModeEnum::class)
    @UseAndroidNamespace
    class tickMarkTintMode
}

@UseAndroidNamespace
abstract class CoreStackViewStyleable : CoreAdapterViewAnimatorStyleable() {
    // Color of the res-out outline.
    @ColorValue
    @UseAndroidNamespace
    class resOutColor

    // Color of the outline of click feedback.
    @ColorValue
    @UseAndroidNamespace
    class clickColor
}

@UseAndroidNamespace
abstract class CoreRatingBarStyleable : CoreProgressBarStyleable() {
    // The number of stars (or rating items) to show.
    @IntegerValue
    @UseAndroidNamespace
    class numStars

    // The rating to set by default.
    @FloatValue
    @UseAndroidNamespace
    class rating

    // The step size of the rating.
    @FloatValue
    @UseAndroidNamespace
    class stepSize

    // Whether this rating bar is an indicator (and non-changeable by the user).
    @BooleanValue
    @UseAndroidNamespace
    class isIndicator
}

@UseAndroidNamespace
abstract class CoreRadioGroupStyleable : CoreLinearLayoutStyleable() {
    // The id of the child radio button that should be checked by default
    // within this radio group.
    @IntegerValue
    @UseAndroidNamespace
    class checkedButton

    // Should the radio group be a column or a row?  Use "horizontal"
    // for a row, "vertical" for a column.  The default is
    // vertical.
    @Reuse(CoreStyleable.orientation::class)
    class orientation
}

@UseAndroidNamespace
abstract class CoreTableLayoutStyleable : CoreLinearLayoutStyleable() {
    // The zero-based index of the columns to stretch. The column indices
    // must be separated by a comma: 1, 2, 5. Illegal and duplicate
    // indices are ignored. You can stretch all columns by using the
    // value "*" instead. Note that a column can be marked stretchable
    // and shrinkable at the same time.
    @StringValue
    @UseAndroidNamespace
    class stretchColumns

    // The zero-based index of the columns to shrink. The column indices
    // must be separated by a comma: 1, 2, 5. Illegal and duplicate
    // indices are ignored. You can shrink all columns by using the
    // value "*" instead. Note that a column can be marked stretchable
    // and shrinkable at the same time.
    @StringValue
    @UseAndroidNamespace
    class shrinkColumns

    // The zero-based index of the columns to collapse. The column indices
    // must be separated by a comma: 1, 2, 5. Illegal and duplicate
    // indices are ignored.
    @StringValue
    @UseAndroidNamespace
    class collapseColumns
}

@UseAndroidNamespace
abstract class CoreTableRowStyleable : CoreLinearLayoutStyleable()

@UseAndroidNamespace
abstract class CoreTableRow_CellStyleable : BaseStyleable {
    // The index of the column in which this child should be.
    @IntegerValue
    @UseAndroidNamespace
    class layout_column

    // Defines how many columns this child should span.  Must be >= 1.
    @IntegerValue
    @UseAndroidNamespace
    class layout_span
}

@UseAndroidNamespace
abstract class CoreTabWidgetStyleable : CoreLinearLayoutStyleable() {
    // Drawable used to draw the divider between tabs.
    @Reuse(CoreListViewStyleable.divider::class)
    class divider

    // Determines whether the strip under the tab indicators is drawn or not.
    @BooleanValue
    @UseAndroidNamespace
    class tabStripEnabled

    // Drawable used to draw the left part of the strip underneath the tabs.
    @ReferenceValue
    @UseAndroidNamespace
    class tabStripLeft

    // Drawable used to draw the right part of the strip underneath the tabs.
    @ReferenceValue
    @UseAndroidNamespace
    class tabStripRight

    // Layout used to organize each tab's content.
    @ReferenceValue
    @UseAndroidNamespace
    class tabLayout
}

@UseAndroidNamespace
abstract class CoreTextClockStyleable : CoreTextViewStyleable() {
    // Specifies the formatting pattern used to show the time and/or date
    // in 12-hour mode. Please refer to {@link android.text.format.DateFormat}
    // for a complete description of accepted formatting patterns.
    // The default pattern is a locale-appropriate equivalent of "h:mm a".
    @StringValue
    @UseAndroidNamespace
    class format12Hour

    // Specifies the formatting pattern used to show the time and/or date
    // in 24-hour mode. Please refer to {@link android.text.format.DateFormat}
    // for a complete description of accepted formatting patterns.
    // The default pattern is a locale-appropriate equivalent of "H:mm".
    @StringValue
    @UseAndroidNamespace
    class format24Hour

    // Specifies the time zone to use. When this attribute is specified, the
    // TextClock will ignore the time zone of the system. To use the user's
    // time zone, do not specify this attribute. The default value is the
    // user's time zone. Please refer to {@link java.util.TimeZone} for more
    // information about time zone ids.
    @StringValue
    @UseAndroidNamespace
    class timeZone
}

@UseAndroidNamespace
abstract class CoreTextSwitcherStyleable : CoreViewSwitcherStyleable()

@UseAndroidNamespace
abstract class CoreTextViewStyleable : CoreViewStyleable() {

    enum class BufferTypeEnum(val value: Int) : StyleableEnum {
        // Can return any CharSequence, possibly a
        // Spanned one if the source text was Spanned.
        normal(0),
        // Can only return Spannable.
        spannable(1),
        // Can only return Spannable and Editable.
        editable(2),
    }

    // Determines the minimum type that getText() will return.
    // The default is "normal".
    // Note that EditText and LogTextBox always return Editable,
    // even if you specify something less powerful here.
    @EnumValue(BufferTypeEnum::class)
    @UseAndroidNamespace
    class bufferType

    // Text to display.
    @StringValue
    @LocalizationSuggested
    @UseAndroidNamespace
    class text

    // Hint text to display when the text is empty.
    @StringValue
    @UseAndroidNamespace
    class hint

    // Text color.
    @Reuse(CoreStyleable.textColor::class)
    class textColor

    // Color of the text selection highlight.
    @Reuse(CoreStyleable.textColorHighlight::class)
    class textColorHighlight

    // Color of the hint text.
    @Reuse(CoreStyleable.textColorHint::class)
    class textColorHint

    // Base text color, typeface, size, and style.
    @Inlineable(CoreTextAppearanceStyleable::class)
    class textAppearance

    // Size of the text. Recommended dimension type for text is "sp" for scaled-pixels (example: 15sp).
    @Reuse(CoreStyleable.textSize::class)
    class textSize

    // Sets the horizontal scaling factor for the text.
    @FloatValue
    @UseAndroidNamespace
    class textScaleX

    // Typeface (normal, sans, serif, monospace) for the text.
    @Reuse(CoreStyleable.typeface::class)
    class typeface

    // Style (bold, italic, bolditalic) for the text.
    @Reuse(CoreStyleable.textStyle::class)
    class textStyle

    // Font family (named by string or as a font resource reference) for the text.
    @Reuse(CoreStyleable.fontFamily::class)
    class fontFamily

    // Text color for links.
    @Reuse(CoreStyleable.textColorLink::class)
    class textColorLink

    // Makes the cursor visible (the default) or invisible.
    @BooleanValue
    @UseAndroidNamespace
    class cursorVisible

    // Makes the TextView be at most this many lines tall.
    // When used on an editable text, the <code>inputType</code> attribute's value must be
    // combined with the <code>textMultiLine</code> flag for the maxLines attribute to apply.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class maxLines

    // Makes the TextView be at most this many pixels tall.
    @Reuse(CoreImageViewStyleable.maxHeight::class)
    class maxHeight

    // Makes the TextView be exactly this many lines tall.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class lines

    // Makes the TextView be exactly this tall.
    // You could get the same effect by specifying this number in the
    // layout parameters.
    @DimensionValue
    @UseAndroidNamespace
    class height

    // Makes the TextView be at least this many lines tall.
    // When used on an editable text, the <code>inputType</code> attribute's value must be
    // combined with the <code>textMultiLine</code> flag for the minLines attribute to apply.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class minLines

    // Makes the TextView be at least this many pixels tall.
    @Reuse(CoreProgressBarStyleable.minHeight::class)
    class minHeight

    // Makes the TextView be at most this many ems wide.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class maxEms

    // Makes the TextView be at most this many pixels wide.
    @Reuse(CoreImageViewStyleable.maxWidth::class)
    class maxWidth

    // Makes the TextView be exactly this many ems wide.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class ems

    // Makes the TextView be exactly this wide.
    // You could get the same effect by specifying this number in the
    // layout parameters.
    @DimensionValue
    @UseAndroidNamespace
    class width

    // Makes the TextView be at least this many ems wide.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class minEms

    // Makes the TextView be at least this many pixels wide.
    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth

    // Specifies how to align the text by the view's x- and/or y-axis
    // when the text is smaller than the view.
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Whether the text is allowed to be wider than the view (and
    // therefore can be scrolled horizontally).
    @BooleanValue
    @UseAndroidNamespace
    class scrollHorizontally

    // Whether the characters of the field are displayed as
    // password dots instead of themselves.
    @Deprecated("Use inputType instead.")
    @BooleanValue
    @UseAndroidNamespace
    class password

    // Constrains the text to a single horizontally scrolling line
    // instead of letting it wrap onto multiple lines, and advances
    // focus instead of inserting a newline when you press the
    // enter key.
    // The default value is false (multi-line wrapped text mode) for non-editable text, but if
    // you specify any value for inputType, the default is true (single-line input field mode).
    @Deprecated("""This attribute is deprecated. Use <code>maxLines</code> instead to change
        the layout of a static text, and use the <code>textMultiLine</code> flag in the
        inputType attribute instead for editable text views (if both singleLine and inputType
            are supplied, the inputType flags will override the value of singleLine""")
    @BooleanValue
    @UseAndroidNamespace
    class singleLine

    // Specifies whether the widget is enabled. The interpretation of the enabled state varies by subclass.
    // For example, a non-enabled EditText prevents the user from editing the contained text, and
    // a non-enabled Button prevents the user from tapping the button.
    // The appearance of enabled and non-enabled widgets may differ, if the drawables referenced
    // from evaluating state_enabled differ.
    @BooleanValue
    @UseAndroidNamespace
    class enabled

    // If the text is selectable, select it all when the view takes
    // focus.
    @BooleanValue
    @UseAndroidNamespace
    class selectAllOnFocus

    // Leave enough room for ascenders and descenders instead of
    // using the font ascent and descent strictly.  (Normally true).
    @BooleanValue
    @UseAndroidNamespace
    class includeFontPadding

    // Set an input filter to constrain the text length to the
    // specified number.
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class maxLength

    // Place a blurred shadow of text underneath the text, drawn with the
    // specified color. The text shadow produced does not interact with
    // properties on View that are responsible for real time shadows,
    // {@link android.R.styleable#View_elevation elevation} and
    // {@link android.R.styleable#View_translationZ translationZ}.
    @Reuse(CoreTextAppearanceStyleable.shadowColor::class)
    class shadowColor

    // Horizontal offset of the text shadow.
    @Reuse(CoreTextAppearanceStyleable.shadowDx::class)
    class shadowDx

    // Vertical offset of the text shadow.
    @Reuse(CoreTextAppearanceStyleable.shadowDy::class)
    class shadowDy

    // Blur radius of the text shadow.
    @Reuse(CoreTextAppearanceStyleable.shadowRadius::class)
    class shadowRadius

    @Reuse(CoreStyleable.autoLink::class)
    class autoLink

    // If set to false, keeps the movement method from being set
    // to the link movement method even if autoLink causes links
    // to be found.
    @BooleanValue
    @UseAndroidNamespace
    class linksClickable

    enum class NumericFlag(val value: Int) : StyleableFlag {
        // Input is numeric.
        integer(0x01),
        // Input is numeric, with sign allowed.
        signed(0x03),
        // Input is numeric, with decimals allowed.
        decimal(0x05)
    }

    // If set, specifies that this TextView has a numeric input method.
    // The default is false.
    @Deprecated("Use inputType instead.")
    @FlagValue(NumericFlag::class)
    @UseAndroidNamespace
    class numeric

    // If set, specifies that this TextView has a numeric input method
    // and that these specific characters are the ones that it will
    // accept.
    // If this is set, numeric is implied to be true.
    // The default is false.
    @StringValue
    @UseAndroidNamespace
    class digits

    // If set, specifies that this TextView has a phone number input
    // method. The default is false.
    @Deprecated("Use inputType instead.")
    @BooleanValue
    @UseAndroidNamespace
    class phoneNumber

    // If set, specifies that this TextView should use the specified
    // input method (specified by fully-qualified
    // class name).
    @Deprecated("Use inputType instead.")
    @StringValue
    @UseAndroidNamespace
    class inputMethod


    enum class CapitalizeEnum(val value: Int) : StyleableEnum {
        // Don't automatically capitalize anything.
        none(0),
        // Capitalize the first word of each sentence.
        sentences(1),
        // Capitalize the first letter of every word.
        words(2),
        // Capitalize every character.
        characters(3),
    }

    // If set, specifies that this TextView has a textual input method
    // and should automatically capitalize what the user types.
    // The default is "none".
    @Deprecated("Use inputType instead.")
    @EnumValue(CapitalizeEnum::class)
    @UseAndroidNamespace
    class capitalize

    // If set, specifies that this TextView has a textual input method
    // and automatically corrects some common spelling errors.
    // The default is "false".
    @Deprecated("Use inputType instead.")
    @BooleanValue
    @UseAndroidNamespace
    class autoText

    // If set, specifies that this TextView has an input method.
    // It will be a textual one unless it has otherwise been specified.
    // For TextView, this is false by default.  For EditText, it is
    // true by default.
    @Deprecated("Use inputType instead.")
    @BooleanValue
    @UseAndroidNamespace
    class editable

    // If set, the text view will include its current complete text
    // inside of its frozen icicle in addition to meta-data such as
    // the current cursor position.  By default this is disabled;
    // it can be useful when the contents of a text view is not stored
    // in a persistent place such as a content provider. For
    // {@link android.widget.EditText} it is always enabled, regardless
    // of the value of the attribute.
    @BooleanValue
    @UseAndroidNamespace
    class freezesText

    // If set, causes words that are longer than the view is wide
    // to be ellipsized instead of broken in the middle.
    // You will often also want to set scrollHorizontally or singleLine
    // as well so that the text as a whole is also constrained to
    // a single line instead of still allowed to be broken onto
    // multiple lines.
    @Reuse(CoreStyleable.ellipsize::class)
    class ellipsize

    // The drawable to be drawn above the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableTop

    // The drawable to be drawn below the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableBottom

    // The drawable to be drawn to the left of the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableLeft

    // The drawable to be drawn to the right of the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableRight

    // The drawable to be drawn to the start of the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableStart

    // The drawable to be drawn to the end of the text.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class drawableEnd

    // The padding between the drawables and the text.
    @DimensionValue
    @UseAndroidNamespace
    class drawablePaddingclass

    // Tint to apply to the compound (left, top, etc.) drawables.
    @ColorValue
    @UseAndroidNamespace
    class drawableTint


    enum class DrawableTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the compound (left, top, etc.) drawables tint.
    @EnumValue(DrawableTintModeEnum::class)
    @UseAndroidNamespace
    class drawableTintMode


    // Extra spacing between lines of text. The value will not be applied for the last
    // line of text.
    @DimensionValue
    @UseAndroidNamespace
    class lineSpacingExtra

    // Extra spacing between lines of text, as a multiplier. The value will not be applied
    // for the last line of text.
    @FloatValue
    @UseAndroidNamespace
    class lineSpacingMultiplier

    enum class MarqueeRepeatLimitEnum(val value: Int) : StyleableEnumAndInteger {
        // Indicates that marquee should repeat indefinitely.
        marquee_forever(-1),
    }

    // The number of times to repeat the marquee animation. Only applied if the
    // TextView has marquee enabled.
    @EnumAndIntegerValue(MarqueeRepeatLimitEnum::class)
    @UseAndroidNamespace
    class marqueeRepeatLimit

    @Reuse(CoreStyleable.inputType::class)
    class inputType

    // Whether undo should be allowed for editable text. Defaults to true.
    @BooleanValue
    @UseAndroidNamespace
    class allowUndo

    @Reuse(CoreStyleable.imeOptions::class)
    class imeOptions

    // An addition content type description to supply to the input
    // method attached to the text view, which is private to the
    // implementation of the input method.  This simply fills in
    // the {@link android.view.inputmethod.EditorInfo#privateImeOptions
    //     EditorInfo.privateImeOptions} field when the input
    // method is connected.
    @StringValue
    @UseAndroidNamespace
    class privateImeOptions

    // Supply a value for
    // {@link android.view.inputmethod.EditorInfo#actionLabel EditorInfo.actionLabel}
    // used when an input method is connected to the text view.
    @StringValue
    @UseAndroidNamespace
    class imeActionLabel

    // Supply a value for
    // {@link android.view.inputmethod.EditorInfo#actionId EditorInfo.actionId}
    // used when an input method is connected to the text view.
    @IntegerValue
    @UseAndroidNamespace
    class imeActionId

    // Reference to an
    // {@link android.R.styleable#InputExtras &lt;input-extras&gt;}
    // XML resource containing additional data to
    // supply to an input method, which is private to the implementation
    // of the input method.  This simply fills in
    // the {@link android.view.inputmethod.EditorInfo#extras
    //     EditorInfo.extras} field when the input
    // method is connected.
    @ReferenceValue
    @UseAndroidNamespace
    class editorExtras

    // Reference to a drawable that will be used to display a text selection
    // anchor on the left side of a selection region.
    @Reuse(CoreThemeStyleable.textSelectHandleLeft::class)
    class textSelectHandleLeft

    // Reference to a drawable that will be used to display a text selection
    // anchor on the right side of a selection region.
    @Reuse(CoreThemeStyleable.textSelectHandleRight::class)
    class textSelectHandleRight

    // Reference to a drawable that will be used to display a text selection
    // anchor for positioning the cursor within text.
    @Reuse(CoreThemeStyleable.textSelectHandle::class)
    class textSelectHandle

    // The layout of the view that is displayed on top of the cursor to paste inside a
    // TextEdit field.
    @Reuse(CoreThemeStyleable.textEditPasteWindowLayout::class)
    class textEditPasteWindowLayout

    // Variation of textEditPasteWindowLayout displayed when the clipboard is empty.
    @Reuse(CoreThemeStyleable.textEditNoPasteWindowLayout::class)
    class textEditNoPasteWindowLayout

    // Used instead of textEditPasteWindowLayout when the window is moved on the side of the
    // insertion cursor because it would be clipped if it were positioned on top.
    @Reuse(CoreThemeStyleable.textEditSidePasteWindowLayout::class)
    class textEditSidePasteWindowLayout

    // Variation of textEditSidePasteWindowLayout displayed when the clipboard is empty.
    @Reuse(CoreThemeStyleable.textEditSideNoPasteWindowLayout::class)
    class textEditSideNoPasteWindowLayout

    // Layout of the TextView item that will populate the suggestion popup window.
    @Reuse(CoreThemeStyleable.textEditSuggestionItemLayout::class)
    class textEditSuggestionItemLayout

    // Layout of the container of the suggestion popup window.
    @Reuse(CoreThemeStyleable.textEditSuggestionContainerLayout::class)
    class textEditSuggestionContainerLayout

    // Style of the highlighted string in the suggestion popup window.
    @Reuse(CoreThemeStyleable.textEditSuggestionHighlightStyle::class)
    class textEditSuggestionHighlightStyle

    // Reference to a drawable that will be drawn under the insertion cursor.
    @Reuse(CoreStyleable.textCursorDrawable::class)
    class textCursorDrawable

    // Indicates that the content of a non-editable text can be selected.
    @Reuse(CoreStyleable.textIsSelectable::class)
    class textIsSelectable

    // Present the text in ALL CAPS. This may use a small-caps form when available.
    @Reuse(CoreTextAppearanceStyleable.textAllCaps::class)
    class textAllCaps

    // Elegant text height, especially for less compacted complex script text.
    @Reuse(CoreTextAppearanceStyleable.elegantTextHeight::class)
    class elegantTextHeight

    // Text letter-spacing.
    @Reuse(CoreTextAppearanceStyleable.letterSpacing::class)
    class letterSpacing

    // Font feature settings.
    @Reuse(CoreTextAppearanceStyleable.fontFeatureSettings::class)
    class fontFeatureSettings

    enum class BreakStrategyEnum(val value: Int) : StyleableEnum {
        // Line breaking uses simple strategy.
        simple(0),
        // Line breaking uses high-quality strategy, including hyphenation.
        high_quality(1),
        // Line breaking strategy balances line lengths.
        balanced(2),
    }

    // Break strategy (control over paragraph layout).
    @EnumValue(BreakStrategyEnum::class)
    @UseAndroidNamespace
    class breakStrategy

    enum class HyphenationFrequencyEnum(val value: Int) : StyleableEnum {
        // No hyphenation.
        none(0),
        // Less frequent hyphenation, useful for informal use cases, such
        // as chat messages.
        normal(1),
        // Standard amount of hyphenation, useful for running text and for
        // screens with limited space for text.
        full(2),
    }

    // Frequency of automatic hyphenation.
    @EnumValue(HyphenationFrequencyEnum::class)
    @UseAndroidNamespace
    class hyphenationFrequency

    enum class AutoSizeTextTypeEnum(val value: Int) : StyleableEnum {
        // No auto-sizing (default).
        none(0),
        // Uniform horizontal and vertical text size scaling to fit within the
        // container.
        uniform(1),
    }

    // Specify the type of auto-size. Note that this feature is not supported by EditText,
    // works only for TextView.
    @EnumValue(AutoSizeTextTypeEnum::class)
    @UseAndroidNamespace
    class autoSizeTextType

    // Specify the auto-size step size if <code>autoSizeTextType</code> is set to
    // <code>uniform</code>. The default is 1px. Overwrites
    // <code>autoSizePresetSizes</code> if set.
    @DimensionValue
    @UseAndroidNamespace
    class autoSizeStepGranularity

    // Resource array of dimensions to be used in conjunction with
    // <code>autoSizeTextType</code> set to <code>uniform</code>. Overrides
    // <code>autoSizeStepGranularity</code> if set.
    class autoSizePresetSizes

    // The minimum text size constraint to be used when auto-sizing text.
    @DimensionValue
    @UseAndroidNamespace
    class autoSizeMinTextSize

    // The maximum text size constraint to be used when auto-sizing text.
    @DimensionValue
    @UseAndroidNamespace
    class autoSizeMaxTextSize

    enum class JustificationModeEnum(val value: Int) : StyleableEnum {
        // No justification.
        none(0),
        // Justification by stretching word spacing.
        inter_word(1)
    }

    // Mode for justification.
    @EnumValue(JustificationModeEnum::class)
    @UseAndroidNamespace
    class justificationMode
}

@UseAndroidNamespace
abstract class CoreTextViewAppearanceStyleable : BaseStyleable {
    // Base text color, typeface, size, and style.
    @Reuse(CoreTextViewStyleable.textAppearance::class)
    class textAppearance
}

@UseAndroidNamespace
abstract class CoreSelectionModeDrawablesStyleable : BaseStyleable {
    @Reuse(CoreThemeStyleable.actionModeSelectAllDrawable::class)
    class actionModeSelectAllDrawable

    @Reuse(CoreThemeStyleable.actionModeCutDrawable::class)
    class actionModeCutDrawable

    @Reuse(CoreThemeStyleable.actionModeCopyDrawable::class)
    class actionModeCopyDrawable

    @Reuse(CoreThemeStyleable.actionModePasteDrawable::class)
    class actionModePasteDrawable
}

@UseAndroidNamespace
abstract class CoreSuggestionSpanStyleable : BaseStyleable {
    @Reuse(CoreThemeStyleable.textUnderlineColor::class)
    class textUnderlineColor

    @Reuse(CoreThemeStyleable.textUnderlineThickness::class)
    class textUnderlineThickness
}

// An <code>input-extras</code> is a container for extra data to supply to
// an input method.  Contains
// one more more {@link #Extra <extra>} tags.
@UseAndroidNamespace
abstract class CoreInputExtrasStyleable : BaseStyleable

@UseAndroidNamespace
abstract class CoreAutoCompleteTextViewStyleable : CoreEditTextViewStyleable() {
    // Defines the hint displayed in the drop down menu.
    @StringValue
    @UseAndroidNamespace
    class completionHint

    // Defines the hint view displayed in the drop down menu.
    @ReferenceValue
    @UseAndroidNamespace
    class completionHintView

    // Defines the number of characters that the user must type before
    // completion suggestions are displayed in a drop down menu.
    @IntegerValue
    @IntegerMinValue(1)
    @UseAndroidNamespace
    class completionThreshold

    // Selector in a drop down list.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class dropDownSelector

    // View to anchor the auto-complete dropdown to. If not specified, the text view itself
    // is used.
    @ReferenceValue
    @UseAndroidNamespace
    class dropDownAnchor

    enum class DropDownWidthEnum(val value: Int) : StyleableEnumAndDimension {
        // The dropdown should fill the width of the screen.
        // This constant is deprecated starting from API Level 8 and
        // is replaced by {@code match_parent}.
        fill_parent(-1),
        // The dropdown should fit the width of the screen.
        // Introduced in API Level 8.
        match_parent(-1),
        // The dropdown should fit the width of its anchor.
        wrap_content(-2)
    }

    // Specifies the basic width of the dropdown. Its value may
    // be a dimension (such as "12dip") for a constant width,
    // fill_parent or match_parent to match the width of the
    // screen, or wrap_content to match the width of
    // the anchored view.
    @EnumAndDimensionValue(DropDownWidthEnum::class)
    @UseAndroidNamespace
    class dropDownWidth

    enum class DropDownHeightEnum(val value: Int) : StyleableEnumAndDimension {
        // The dropdown should fit the height of the screen.
        // This constant is deprecated starting from API Level 8 and
        // is replaced by {@code match_parent}.
        fill_parent(-1),
        // The dropdown should fit the height of the screen.
        // Introduced in API Level 8.
        match_parent(-1),
        // The dropdown should fit the height of the content.
        wrap_content(-2)
    }

    // Specifies the basic height of the dropdown. Its value may
    // be a dimension (such as "12dip") for a constant height,
    // fill_parent or match_parent to fill the height of the
    // screen, or wrap_content to match the height of
    // the content of the drop down.
    @EnumAndDimensionValue(DropDownHeightEnum::class)
    @UseAndroidNamespace
    class dropDownHeight

    @Reuse(CoreStyleable.inputType::class)
    class inputType

    // Theme to use for the completion popup window.
    @Reuse(CoreToolbarStyleable.popupTheme::class)
    class popupTheme
}

@UseAndroidNamespace
abstract class CorePopupWindowStyleable : BaseStyleable {
    // The background to use for the popup window.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class popupBackground

    // Window elevation to use for the popup window.
    @DimensionValue
    @UseAndroidNamespace
    class popupElevation

    // The animation style to use for the popup window.
    @ReferenceValue
    @UseAndroidNamespace
    class popupAnimationStyle

    // Whether the popup window should overlap its anchor view.
    @BooleanValue
    @UseAndroidNamespace
    class overlapAnchor

    // Transition used to move views into the popup window.
    @ReferenceValue
    @UseAndroidNamespace
    class popupEnterTransition

    // Transition used to move views out of the popup window.
    @ReferenceValue
    @UseAndroidNamespace
    class popupExitTransition
}

@UseAndroidNamespace
abstract class CoreListPopupWindowStyleable : BaseStyleable {
    // Amount of pixels by which the drop down should be offset vertically.
    @DimensionValue
    @UseAndroidNamespace
    class dropDownVerticalOffset

    // Amount of pixels by which the drop down should be offset horizontally.
    @DimensionValue
    @UseAndroidNamespace
    class dropDownHorizontalOffset
}

@UseAndroidNamespace
abstract class CoreViewAnimatorStyleable : CoreFrameLayoutStyleable() {
    // Identifier for the animation to use when a view is shown.
    @ReferenceValue
    @UseAndroidNamespace
    class inAnimation

    // Identifier for the animation to use when a view is hidden.
    @ReferenceValue
    @UseAndroidNamespace
    class outAnimation

    // Defines whether to animate the current View when the ViewAnimation
    // is first displayed.
    @BooleanValue
    @UseAndroidNamespace
    class animateFirstView
}

@UseAndroidNamespace
abstract class CoreViewFlipperStyleable : CoreViewAnimatorStyleable() {
    @IntegerValue
    @IntegerMinValue(0)
    @UseAndroidNamespace
    class flipInterval

    // When true, automatically start animating.
    @BooleanValue
    @UseAndroidNamespace
    class autoStart
}

@UseAndroidNamespace
abstract class CoreAdapterViewAnimatorStyleable : CoreViewGroupStyleable() {
    // Identifier for the animation to use when a view is shown.
    @Reuse(CoreViewAnimatorStyleable.inAnimation::class)
    class inAnimation

    // Identifier for the animation to use when a view is hidden.
    @Reuse(CoreViewAnimatorStyleable.outAnimation::class)
    class outAnimation

    // Defines whether the animator loops to the first view once it
    //has reached the end of the list.
    @BooleanValue
    @UseAndroidNamespace
    class loopViews

    // Defines whether to animate the current View when the ViewAnimation
    // is first displayed.
    @Reuse(CoreViewAnimatorStyleable.animateFirstView::class)
    class animateFirstView
}

@UseAndroidNamespace
abstract class CoreAdapterViewFlipperStyleable : CoreAdapterViewAnimatorStyleable() {
    @Reuse(CoreViewFlipperStyleable.flipInterval::class)
    class flipInterval

    // When true, automatically start animating.
    @Reuse(CoreViewFlipperStyleable.autoStart::class)
    class autoStart
}

@UseAndroidNamespace
abstract class CoreViewSwitcherStyleable : CoreViewAnimatorStyleable()

@UseAndroidNamespace
abstract class CoreScrollViewStyleable : CoreFrameLayoutStyleable() {
    // Defines whether the scrollview should stretch its content to fill the viewport.
    @BooleanValue
    @UseAndroidNamespace
    class fillViewport
}

@UseAndroidNamespace
abstract class CoreHorizontalScrollViewStyleable : CoreFrameLayoutStyleable() {
    // Defines whether the scrollview should stretch its content to fill the viewport.
    @BooleanValue
    @UseAndroidNamespace
    class fillViewport
}

@UseAndroidNamespace
abstract class CoreSpinnerStyleable : CoreAbsSpinnerStyleable() {
    // The prompt to display when the spinner's dialog is shown.
    @ReferenceValue
    @UseAndroidNamespace
    class prompt


    enum class SpinnerModeEnum(val value: Int) : StyleableEnum {
        // Spinner options will be presented to the user as a dialog window.
        dialog(0),
        // Spinner options will be presented to the user as an inline dropdown
        // anchored to the spinner widget itself.
        dropdown(1),
    }

    // Display mode for spinner options.
    @EnumValue(SpinnerModeEnum::class)
    @UseAndroidNamespace
    class spinnerMode

    // List selector to use for spinnerMode="dropdown" display.
    @Reuse(CoreAutoCompleteTextViewStyleable.dropDownSelector::class)
    class dropDownSelector

    // Theme to use for the drop-down or dialog popup window.
    @Reuse(CoreToolbarStyleable.popupTheme::class)
    class popupTheme

    // Background drawable to use for the dropdown in spinnerMode="dropdown".
    @Reuse(CorePopupWindowStyleable.popupBackground::class)
    class popupBackground

    // Window elevation to use for the dropdown in spinnerMode="dropdown".
    @Reuse(CorePopupWindowStyleable.popupElevation::class)
    class popupElevation

    // Width of the dropdown in spinnerMode="dropdown".
    @Reuse(CoreAutoCompleteTextViewStyleable.dropDownWidth::class)
    class dropDownWidth

    // Reference to a layout to use for displaying a prompt in the dropdown for
    // spinnerMode="dropdown". This layout must contain a TextView with the id
    // {@code @android:id/text1} to be populated with the prompt text.
    @ReferenceValue
    @UseAndroidNamespace
    class popupPromptView

    // Gravity setting for positioning the currently selected item.
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Whether this spinner should mark child views as enabled/disabled when
    // the spinner itself is enabled/disabled.
    @BooleanValue
    @UseAndroidNamespace
    class disableChildrenWhenDisabled
}

@UseAndroidNamespace
abstract class CoreDatePickerStyleable : CoreFrameLayoutStyleable() {
    // The first day of week according to {@link java.util.Calendar}.
    @Reuse(CoreCalendarViewStyleable.firstDayOfWeek::class)
    class firstDayOfWeek

    // The minimal date shown by this calendar view in mm/dd/yyyy format.
    @StringValue
    @UseAndroidNamespace
    class minDate

    // The maximal date shown by this calendar view in mm/dd/yyyy format.
    @StringValue
    @UseAndroidNamespace
    class maxDate

    // Whether the spinners are shown. Only valid for "spinner" mode.
    class spinnersShown

    // Whether the calendar view is shown. Only valid for "spinner" mode.
    @BooleanValue
    @UseAndroidNamespace
    class calendarViewShown

    // The layout of the date picker.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    class internalLayout

    // The layout of the legacy DatePicker.
    @Hide
    @Reuse(CoreTimePickerStyleable.legacyLayout::class)
    class legacyLayout

    // The text color for the selected date header text, ex. "2014" or
    // "Tue, Mar 18". This should be a color state list where the
    // activated state will be used when the year picker or day picker is
    // active.
    @ColorValue
    @UseAndroidNamespace
    class headerTextColor

    // The background for the selected date header.
    @Reuse(CoreMenuViewStyleable.headerBackground::class)
    class headerBackground

    // The list year's text appearance in the list.
    @Deprecated("Use yearListTextColor.")
    @ReferenceValue
    @UseAndroidNamespace
    class yearListItemTextAppearance

    // The list year's text appearance in the list when activated.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class yearListItemActivatedTextAppearance

    // The text color list of the calendar.
    @ColorValue
    @UseAndroidNamespace
    class calendarTextColor


    enum class DatePickerModeEnum(val value: Int) : StyleableEnum {
        // Date picker with spinner controls to select the date.
        spinner(1),
        // Date picker with calendar to select the date.
        calendar(2)
    }

    // Defines the look of the widget. Prior to the L release, the only choice was
    // spinner. As of L, with the Material theme selected, the default layout is calendar,
    // but this attribute can be used to force spinner to be used instead.
    @EnumValue(DatePickerModeEnum::class)
    @UseAndroidNamespace
    class datePickerMode

    // The first year (inclusive), for example "1940".
    @Deprecated("Use minDate instead.")
    @IntegerValue
    @UseAndroidNamespace
    class startYear

    // The last year (inclusive), for example "2010".
    @Deprecated("Use maxDate instead.")
    @IntegerValue
    @UseAndroidNamespace
    class endYear

    // The text appearance for the month (ex. May) in the selected date header.
    @Deprecated("Use headerTextColor instead.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class headerMonthTextAppearance

    // The text appearance for the day of month (ex. 28) in the selected date header.
    @Deprecated("Use headerTextColor instead.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class headerDayOfMonthTextAppearance

    // The text appearance for the year (ex. 2014) in the selected date header.
    @Deprecated("Use headerTextColor instead.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class headerYearTextAppearance

    // The background color for the header's day of week.
    @Deprecated("No longer displayed.")
    @ColorValue
    @UseAndroidNamespace
    class dayOfWeekBackground

    // The text color for the header's day of week.
    @Deprecated("No longer displayed.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class dayOfWeekTextAppearance

    // The list year's selected circle color in the list.
    @Deprecated("No longer displayed.")
    @ColorValue
    @UseAndroidNamespace
    class yearListSelectorColor

    // Whether this time picker is being displayed within a dialog,
    // in which case it may ignore the requested time picker mode due to
    // space considerations.
    @Hide
    @BooleanValue
    @UseAndroidNamespace
    class dialogMode
}

@Deprecated("""
        This class was deprecated in API level 17.
    This class can be implemented easily by apps using a RelativeLayout or a LinearLayout.""")
@UseAndroidNamespace
abstract class CoreTwoLineListItemStyleable : CoreRelativeLayoutStyleable() {

    enum class ModeEnum(val value: Int) : StyleableEnum {
        // Always show only the first line.
        oneLine(1),
        // When selected show both lines, otherwise show only the first line.
        // This is the default mode.
        collapsing(2),
        // Always show both lines.
        twoLine(3)
    }

    @EnumValue(ModeEnum::class)
    @UseAndroidNamespace
    class mode
}

// SlidingDrawer specific attributes. These attributes are used to configure
// a SlidingDrawer from XML.
@Deprecated("""
        This class was deprecated in API level 17.
    This class is not supported anymore. It is recommended you base your own implementation on the source code for the Android Open Source Project if you must use it in your application.
    """)
@UseAndroidNamespace
abstract class CoreSlidingDrawerStyleable : CoreViewGroupStyleable() {
    // Identifier for the child that represents the drawer's handle.
    @ReferenceValue
    @UseAndroidNamespace
    class handle

    // Identifier for the child that represents the drawer's content.
    @ReferenceValue
    @UseAndroidNamespace
    class content

    // Orientation of the SlidingDrawer.
    @Reuse(CoreStyleable.orientation::class)
    class orientation

    // Extra offset for the handle at the bottom of the SlidingDrawer.
    @DimensionValue
    @UseAndroidNamespace
    class bottomOffset

    // Extra offset for the handle at the top of the SlidingDrawer.
    @DimensionValue
    @UseAndroidNamespace
    class topOffset

    // Indicates whether the drawer can be opened/closed by a single tap
    // on the handle.  (If false, the user must drag or fling, or click
    // using the trackball, to open/close the drawer.)  Default is true.
    @BooleanValue
    @UseAndroidNamespace
    class allowSingleTap

    // Indicates whether the drawer should be opened/closed with an animation
    // when the user clicks the handle. Default is true.
    @BooleanValue
    @UseAndroidNamespace
    class animateOnClick
}

// GestureOverlayView specific attributes. These attributes are used to configure
// a GestureOverlayView from XML.
@UseAndroidNamespace
abstract class CoreGestureOverlayViewStyleable : CoreFrameLayoutStyleable() {
    // Width of the stroke used to draw the gesture.
    @FloatValue
    @UseAndroidNamespace
    class gestureStrokeWidth

    // Color used to draw a gesture.
    @ColorValue
    @UseAndroidNamespace
    class gestureColor

    // Color used to draw the user's strokes until we are sure it's a gesture.
    @ColorValue
    @UseAndroidNamespace
    class uncertainGestureColor

    // Time, in milliseconds, to wait before the gesture fades out after the user
    // is done drawing it.
    @IntegerValue
    @UseAndroidNamespace
    class fadeOffset

    // Duration, in milliseconds, of the fade out effect after the user is done
    // drawing a gesture.
    @IntegerValue
    @UseAndroidNamespace
    class fadeDuration

    enum class GestureStrokeTypeEnum(val value: Int) : StyleableEnum {
        // A gesture is made of only one stroke.
        single(0),
        // A gesture is made of multiple strokes.
        multiple(1)
    }

    // Defines the type of strokes that define a gesture.
    @EnumValue(GestureStrokeTypeEnum::class)
    @UseAndroidNamespace
    class gestureStrokeType

    // Minimum length of a stroke before it is recognized as a gesture.
    @FloatValue
    @UseAndroidNamespace
    class gestureStrokeLengthThreshold

    // Squareness threshold of a stroke before it is recognized as a gesture.
    @FloatValue
    @UseAndroidNamespace
    class gestureStrokeSquarenessThreshold

    // Minimum curve angle a stroke must contain before it is recognized as a gesture.
    @FloatValue
    @UseAndroidNamespace
    class gestureStrokeAngleThreshold

    // Defines whether the overlay should intercept the motion events when a gesture
    // is recognized.
    @BooleanValue
    @UseAndroidNamespace
    class eventsInterceptionEnabled

    // Defines whether the gesture will automatically fade out after being recognized.
    @BooleanValue
    @UseAndroidNamespace
    class fadeEnabled

    // Indicates whether horizontal (when the orientation is vertical) or vertical
    // (when orientation is horizontal) strokes automatically define a gesture.
    @Reuse(CoreStyleable.orientation::class)
    class orientation
}

@UseAndroidNamespace
abstract class CoreQuickContactBadgeStyleable : CoreImageViewStyleable() {

    enum class QuickContactWindowSizeEnum(val value: Int) : StyleableEnum {
        modeSmall(1),
        modeMedium(2),
        modeLarge(3)
    }

    @EnumValue(QuickContactWindowSizeEnum::class)
    @UseAndroidNamespace
    class quickContactWindowSize
}

@Hide
@UseAndroidNamespace
abstract class CoreWeightedLinearLayoutStyleable : CoreLinearLayoutStyleable() {
    @FloatValue
    @UseAndroidNamespace
    class majorWeightMin

    @FloatValue
    @UseAndroidNamespace
    class minorWeightMin

    @FloatValue
    @UseAndroidNamespace
    class majorWeightMax

    @FloatValue
    @UseAndroidNamespace
    class minorWeightMax
}

@UseAndroidNamespace
abstract class CoreCalendarViewStyleable : CoreFrameLayoutStyleable() {
    // The first day of week according to {@link java.util.Calendar}.
    @IntegerValue
    @UseAndroidNamespace
    class firstDayOfWeek

    // The minimal date shown by this calendar view in mm/dd/yyyy format.
    @Reuse(CoreDatePickerStyleable.minDate::class)
    class minDate

    // The maximal date shown by this calendar view in mm/dd/yyyy format.
    @Reuse(CoreDatePickerStyleable.maxDate::class)
    class maxDate

    // The text appearance for the month and year in the calendar header.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class monthTextAppearance

    // The text appearance for the week day abbreviation in the calendar header.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class weekDayTextAppearance

    // The text appearance for the day numbers in the calendar grid.
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class dateTextAppearance

    // The background color used for the day selection indicator.
    @Hide
    @ColorValue
    @UseAndroidNamespace
    class daySelectorColor

    // The background color used for the day highlight indicator.
    @Hide
    @ColorValue
    @UseAndroidNamespace
    class dayHighlightColor

    enum class CalendarViewModeEnum(val value: Int) : StyleableEnum {
        holo(0),
        material(1)
    }

    // Which style of calendar delegate to use.
    @EnumValue(CalendarViewModeEnum::class)
    @UseAndroidNamespace
    class calendarViewMode

    @Deprecated("Whether do show week numbers.")
    @BooleanValue
    @UseAndroidNamespace
    class showWeekNumber

    @Deprecated("The number of weeks to be shown.")
    @IntegerValue
    @UseAndroidNamespace
    class shownWeekCount

    @Deprecated("The background color for the selected week.")
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class selectedWeekBackgroundColor

    @Deprecated("The color for the dates of the focused month.")
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class focusedMonthDateColor

    @Deprecated("The color for the dates of an unfocused month.")
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class unfocusedMonthDateColor

    @Deprecated("The color for the week numbers.")
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class weekNumberColor

    @Deprecated("The color for the separator line between weeks.")
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class weekSeparatorLineColor

    @Deprecated("Drawable for the vertical bar shown at the beginning and at the end of the selected date.")
    @ReferenceValue
    @UseAndroidNamespace
    class selectedDateVerticalBar
}

@UseAndroidNamespace
abstract class CoreNumberPickerStyleable : CoreLinearLayoutStyleable() {
    // Color for the solid color background if such for optimized rendering.
    @Hide
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class solidColor

    // The divider for making the selection area.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    class selectionDivider

    // The height of the selection divider.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class selectionDividerHeight

    // The distance between the two selection dividers.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class selectionDividersDistance

    // The min height of the NumberPicker.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class internalMinHeight

    // The max height of the NumberPicker.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class internalMaxHeight

    // The min width of the NumberPicker.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class internalMinWidth

    // The max width of the NumberPicker.
    @Hide
    @DimensionValue
    @UseAndroidNamespace
    class internalMaxWidth

    // The layout of the number picker.
    @Hide
    @Reuse(CoreDatePickerStyleable.internalLayout::class)
    class internalLayout

    // The drawable for pressed virtual (increment/decrement) buttons.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    class virtualButtonPressedDrawable

    // If true then the selector wheel is hidden until the picker has focus.
    @Hide
    @BooleanValue
    @UseAndroidNamespace
    class hideWheelUntilFocused
}

@UseAndroidNamespace
abstract class CoreTimePickerStyleable : CoreFrameLayoutStyleable() {
    // The layout of the legacy time picker.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    class legacyLayout

    // The layout of the time picker.
    @Hide
    @Reuse(CoreDatePickerStyleable.internalLayout::class)
    class internalLayout

    // The text color for the selected time header text, ex. "12" or
    // "PM". This should be a color state list where the activated state
    // will be used when the minute picker or hour picker is active.
    @Reuse(CoreDatePickerStyleable.headerTextColor::class)
    class headerTextColor

    // The background for the header containing the currently selected time.
    @Reuse(CoreDatePickerStyleable.headerBackground::class)
    class headerBackground

    // The color for the hours/minutes numbers. This should be a color
    // state list where the activated state will be used when the number
    // is active.
    @ColorValue
    @UseAndroidNamespace
    class numbersTextColor

    // The color for the inner hours numbers used in 24-hour mode. This
    // should be a color state list where the activated state will be
    // used when the number is active.
    @ColorValue
    @UseAndroidNamespace
    class numbersInnerTextColor

    // The background color for the hours/minutes numbers.
    @ColorValue
    @UseAndroidNamespace
    class numbersBackgroundColor

    // The color for the hours/minutes selector.
    @ColorValue
    @UseAndroidNamespace
    class numbersSelectorColor

    enum class TimePickerModeEnum(val value: Int) : StyleableEnum {
        // Time picker with spinner controls to select the time.
        spinner(1),
        // Time picker with clock face to select the time.
        clock(2)
    }

    // Defines the look of the widget. Prior to the L release, the only choice was
    // spinner. As of L, with the Material theme selected, the default layout is clock,
    // but this attribute can be used to force spinner to be used instead.
    @EnumValue(TimePickerModeEnum::class)
    @UseAndroidNamespace
    class timePickerMode

    // The text appearance for the AM/PM header.
    @Deprecated("Use headerTextColor instead.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class headerAmPmTextAppearance

    // The text appearance for the time header.
    @Deprecated("Use headerTextColor instead.")
    @ReferenceValue
    @UseAndroidNamespace
    @Inlineable(CoreTextAppearanceStyleable::class)
    class headerTimeTextAppearance

    // The color for the AM/PM selectors.
    @Deprecated("Use headerTextColor instead.")
    @ColorValue
    @UseAndroidNamespace
    class amPmTextColor

    // The background color state list for the AM/PM selectors.
    @Deprecated("Use headerBackground instead.")
    @ColorValue
    @UseAndroidNamespace
    class amPmBackgroundColor

    // Whether this time picker is being displayed within a dialog,
    // in which case it may ignore the requested time picker mode due to
    // space considerations.
    @Reuse(CoreDatePickerStyleable.dialogMode::class)
    class dialogMode
}

// *****************************************************************
// Support for MapView.
// *****************************************************************

// The set of attributes for a MapView.
@UseAndroidNamespace
abstract class CoreMapViewStyleable : CoreViewGroupStyleable() {
    // Value is a string that specifies the Maps API Key to use.
    @StringValue
    @UseAndroidNamespace
    class apiKey
}

// Attributes for a ActivityChooserView.
@UseAndroidNamespace
abstract class CoreActivityChooserViewStyleable : CoreViewGroupStyleable() {
    // The maximal number of items initially shown in the activity list.
    @StringValue
    @UseAndroidNamespace
    class initialActivityCount

    // The drawable to show in the button for expanding the activities overflow popup.
    // <strong>Note:</strong> Clients would like to set this drawable
    // as a clue about the action the chosen activity will perform. For
    // example, if share activity is to be chosen the drawable should
    // give a clue that sharing is to be performed.
    @ReferenceValue
    @UseAndroidNamespace
    class expandActivityOverflowButtonDrawable
}

@UseAndroidNamespace
abstract class CoreVoiceInteractionSessionStyleable : BaseStyleable

@InnerStyleable(CoreKeyboardViewPreviewStateStyleable::class,
        CoreKeyboardStyleable::class,
        CoreKeyboard_RowStyleable::class,
        CoreKeyboard_KeyStyleable::class)
@UseAndroidNamespace
abstract class CoreKeyboardViewStyleable : CoreViewStyleable() {
    // Default KeyboardView style.
    @ReferenceValue
    @UseAndroidNamespace
    class keyboardViewStyle

    // Image for the key. This image needs to be a StateListDrawable, with the following
    // possible states: normal, pressed, checkable, checkable+pressed, checkable+checked,
    // checkable+checked+pressed.
    @ReferenceValue
    @UseAndroidNamespace
    class keyBackground

    // Size of the text for character keys.
    @DimensionValue
    @UseAndroidNamespace
    class keyTextSize

    // Size of the text for custom keys with some text and no icon.
    @DimensionValue
    @UseAndroidNamespace
    class labelTextSize

    // Color to use for the label in a key.
    @ColorValue
    @UseAndroidNamespace
    class keyTextColor

    // Layout resource for key press feedback.
    @ReferenceValue
    @UseAndroidNamespace
    class keyPreviewLayout

    // Vertical offset of the key press feedback from the key.
    @DimensionValue
    @UseAndroidNamespace
    class keyPreviewOffset

    // Height of the key press feedback popup.
    @DimensionValue
    @UseAndroidNamespace
    class keyPreviewHeight

    // Amount to offset the touch Y coordinate by, for bias correction.
    @DimensionValue
    @UseAndroidNamespace
    class verticalCorrection

    // Layout resource for popup keyboards.
    @ReferenceValue
    @UseAndroidNamespace
    class popupLayout

    @Reuse(CoreTextAppearanceStyleable.shadowColor::class)
    class shadowColor

    @Reuse(CoreTextAppearanceStyleable.shadowRadius::class)
    class shadowRadius
}

@UseAndroidNamespace
abstract class CoreKeyboardViewPreviewStateStyleable : BaseStyleable {
    // State for {@link android.inputmethodservice.KeyboardView KeyboardView}
    // key preview background.
    @BooleanValue
    @UseAndroidNamespace
    class state_long_pressable
}

@UseAndroidNamespace
abstract class CoreKeyboardStyleable : BaseStyleable {
    // Default width of a key, in pixels or percentage of display width.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class keyWidth

    // Default height of a key, in pixels or percentage of display width.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class keyHeight

    // Default horizontal gap between keys.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class horizontalGap

    // Default vertical gap between rows of keys.
    @DimensionValue
    @FractionValue
    @UseAndroidNamespace
    class verticalGap
}

@UseAndroidNamespace
abstract class CoreKeyboard_RowStyleable : BaseStyleable {
    enum class RowEdgeFlagsFlag(val value: Long) : StyleableFlag {
        // Row is anchored to the top of the keyboard.
        top(4),
        // Row is anchored to the bottom of the keyboard.
        bottom(8)
    }

    // Row edge flags.
    @FlagValue(RowEdgeFlagsFlag::class)
    @UseAndroidNamespace
    class rowEdgeFlags

    // Mode of the keyboard. If the mode doesn't match the
    // requested keyboard mode, the row will be skipped.
    @ReferenceValue
    @UseAndroidNamespace
    class keyboardMode
}

@UseAndroidNamespace
abstract class CoreKeyboard_KeyStyleable : BaseStyleable {
    // The unicode value or comma-separated values that this key outputs.
    @IntegerValue
    @StringValue
    @UseAndroidNamespace
    class codes

    // The XML keyboard layout of any popup keyboard.
    @ReferenceValue
    @UseAndroidNamespace
    class popupKeyboard

    // The characters to display in the popup keyboard.
    @StringValue
    @UseAndroidNamespace
    class popupCharacters

    enum class KeyEdgeFlagsFlag(val value: Long) : StyleableFlag {
        // Key is anchored to the left of the keyboard.
        left(1),
        // Key is anchored to the right of the keyboard.
        right(2)
    }

    // Key edge flags.
    @FlagValue(KeyEdgeFlagsFlag::class)
    @UseAndroidNamespace
    class keyEdgeFlags

    // Whether this is a modifier key such as Alt or Shift.
    @BooleanValue
    @UseAndroidNamespace
    class isModifier

    // Whether this is a toggle key.
    @BooleanValue
    @UseAndroidNamespace
    class isSticky

    // Whether long-pressing on this key will make it repeat.
    @BooleanValue
    @UseAndroidNamespace
    class isRepeatable

    // The icon to show in the popup preview.
    @ReferenceValue
    @UseAndroidNamespace
    class iconPreview

    // The string of characters to output when this key is pressed.
    @StringValue
    @UseAndroidNamespace
    class keyOutputText

    // The label to display on the key.
    @StringValue
    @UseAndroidNamespace
    class keyLabel

    // The icon to display on the key instead of the label.
    @ReferenceValue
    @UseAndroidNamespace
    class keyIcon

    // Mode of the keyboard. If the mode doesn't match the
    // requested keyboard mode, the key will be skipped.
    @Reuse(CoreKeyboard_RowStyleable.keyboardMode::class)
    class keyboardMode
}

// ===============================
// AppWidget package class attributes
// ===============================

// Use <code>appwidget-provider</code> as the root tag of the XML resource that
// describes an AppWidget provider.  See {@link android.appwidget android.appwidget}
// package for more info.
@UseAndroidNamespace
abstract class CoreAppWidgetProviderInfoStyleable : BaseStyleable {
    // Minimum width of the AppWidget.
    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth

    // Minimum height of the AppWidget.
    @Reuse(CoreProgressBarStyleable.minHeight::class)
    class minHeight

    // Minimum width that the AppWidget can be resized to.
    @DimensionValue
    @UseAndroidNamespace
    class minResizeWidthclass

    // Minimum height that the AppWidget can be resized to.
    @DimensionValue
    @UseAndroidNamespace
    class minResizeHeightclass

    // Update period in milliseconds, or 0 if the AppWidget will update itself.
    @IntegerValue
    @UseAndroidNamespace
    class updatePeriodMillis

    // A resource id of a layout.
    @ReferenceValue
    @UseAndroidNamespace
    class initialLayout

    // A resource id of a layout.
    @ReferenceValue
    @UseAndroidNamespace
    class initialKeyguardLayout

    // A class name in the AppWidget's package to be launched to configure.
    // If not supplied, then no activity will be launched.
    @StringValue
    @UseAndroidNamespace
    class configure

    // A preview of what the AppWidget will look like after it's configured.
    // If not supplied, the AppWidget's icon will be used.
    @ReferenceValue
    @UseAndroidNamespace
    class previewImage

    // The view id of the AppWidget subview which should be auto-advanced.
    // by the widget's host.
    @ReferenceValue
    @UseAndroidNamespace
    class autoAdvanceViewId

    enum class ResizeModeFlag(val value: Int) : StyleableFlag {
        none(0x0),
        horizontal(0x1),
        vertical(0x2)
    }

    // Optional parameter which indicates if and how this widget can be
    // resized. Supports combined values using | operator.
    @FlagValue(ResizeModeFlag::class)
    @UseAndroidNamespace
    class resizeMode

    enum class WidgetCategoryFlag(val value: Int) : StyleableFlag {
        home_screen(0x1),
        keyguard(0x2),
        searchbox(0x4)
    }

    // Optional parameter which indicates where this widget can be shown,
    // ie. home screen, keyguard, search bar or any combination thereof.
    // Supports combined values using | operator.
    @FlagValue(WidgetCategoryFlag::class)
    @UseAndroidNamespace
    class widgetCategory

    enum class WidgetFeaturesFlag(val value: Int) : StyleableFlag {
        // The widget can be reconfigured anytime after it is bound
        reconfigurable(0x1),
        // The widget is added directly by the app, and does not need to appear in
        // the global list of available widgets
        hide_from_picker(0x2)
    }

    // Flags indicating various features supported by the widget. These are hints to the
    // widget host, and do not actually change the behavior of the widget.
    @FlagValue(WidgetFeaturesFlag::class)
    @UseAndroidNamespace
    class widgetFeatures
}

// ===============================
// Wallpaper preview attributes   
// ===============================
// Use <code>wallpaper-preview</code> as the root tag of the XML resource that
// describes a wallpaper preview.
@UseAndroidNamespace
abstract class CoreWallpaperPreviewInfoStyleable : BaseStyleable {
    // A resource id of a static drawable.
    @ReferenceValue
    @UseAndroidNamespace
    class staticWallpaperPreview
}

// Attributes that can be used with <code>&lt;fragment&gt;</code>
// tags inside of the layout of an Activity.  This instantiates
// the given {@link android.app.Fragment} and inserts its content
// view into the current location in the layout.
@UseAndroidNamespace
abstract class CoreFragmentStyleable : BaseStyleable {
    // Supply the name of the fragment class to instantiate.
    @Reuse(ManifestStyleable.name::class)
    class name

    // Supply an identifier name for the top-level view, to later retrieve it
    // with {@link android.view.View#findViewById View.findViewById()} or
    // {@link android.app.Activity#findViewById Activity.findViewById()}.
    // This must be a
    // resource reference; typically you set this using the
    // <code>@+</code> syntax to create a new ID resources.
    // For example: <code>android:id="@+id/my_id"</code> which
    // allows you to later retrieve the view
    // with <code>findViewById(R.id.my_id)</code>.
    @Reuse(CoreViewStyleable.id::class)
    class id

    // Supply a tag for the top-level view containing a String, to be retrieved
    // later with {@link android.view.View#getTag View.getTag()} or
    // searched for with {@link android.view.View#findViewWithTag
    //     View.findViewWithTag()}.  It is generally preferable to use
    // IDs (through the android:id attribute) instead of tags because
    // they are faster and allow for compile-time type checking.
    @Reuse(CoreViewStyleable.tag::class)
    class tag

    // The Transition that will be used to move Views out of the scene when the
    // fragment is removed, hidden, or detached when not popping the back stack.
    // Corresponds to {@link android.app.Fragment#setExitTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentExitTransitionclass

    // The Transition that will be used to move Views into the initial scene.
    // Corresponds to {@link android.app.Fragment#setEnterTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentEnterTransitionclass

    // The Transition that will be used for shared elements transferred into the content
    // Scene.
    // Corresponds to {@link android.app.Fragment#setSharedElementEnterTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentSharedElementEnterTransitionclass

    // The Transition that will be used to move Views out of the scene when the Fragment is
    // preparing to be removed, hidden, or detached because of popping the back stack.
    // Corresponds to {@link android.app.Fragment#setReturnTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentReturnTransitionclass

    // The Transition that will be used for shared elements transferred back during a
    // pop of the back stack. This Transition acts in the leaving Fragment.
    // Corresponds to {@link android.app.Fragment#setSharedElementReturnTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentSharedElementReturnTransitionclass

    // The Transition that will be used to move Views in to the scene when returning due
    // to popping a back stack.
    // Corresponds to {@link android.app.Fragment#setReenterTransition(
    //     android.transition.Transition)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentReenterTransitionclass

    // Sets whether the enter and exit transitions should overlap when transitioning
    // forward.
    // Corresponds to {@link android.app.Fragment#setAllowEnterTransitionOverlap(
    //     boolean)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentAllowEnterTransitionOverlapclass

    // Sets whether the enter and exit transitions should overlap when transitioning
    // because of popping the back stack.
    // Corresponds to {@link android.app.Fragment#setAllowReturnTransitionOverlap(
    //     boolean)}
    @ReferenceValue
    @UseAndroidNamespace
    class fragmentAllowReturnTransitionOverlapclass
}

// Use <code>device-admin</code> as the root tag of the XML resource that
// describes a
// {@link android.app.admin.DeviceAdminReceiver}, which is
// referenced from its
// {@link android.app.admin.DeviceAdminReceiver#DEVICE_ADMIN_META_DATA}
// meta-data entry.  Described here are the attributes that can be
// included in that tag.
@UseAndroidNamespace
abstract class CoreDeviceAdminStyleable : BaseStyleable {
    // Control whether the admin is visible to the user, even when it
    // is not enabled.  This is true by default.  You may want to make
    // it false if your admin does not make sense to be turned on
    // unless some explicit action happens in your app.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible
}

// ===============================
// Accounts package class attributes
// ===============================

// Use <code>account-authenticator</code> as the root tag of the XML resource that
// describes an account authenticator.
@UseAndroidNamespace
abstract class CoreAccountAuthenticatorStyleable : BaseStyleable {
    // The account type this authenticator handles.
    @StringValue
    @UseAndroidNamespace
    class accountType

    // The user-visible name of the authenticator.
    @Reuse(ManifestStyleable.label::class)
    class label

    // The icon of the authenticator.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // Smaller icon of the authenticator.
    @ReferenceValue
    @UseAndroidNamespace
    class smallIconclass

    // A preferences.xml file for authenticator-specific settings.
    @ReferenceValue
    @UseAndroidNamespace
    class accountPreferencesclass

    // Account handles its own token storage and permissions.
    // Default to false
    @BooleanValue
    @UseAndroidNamespace
    class customTokensclass
}

// ===============================
// Accounts package class attributes
// ===============================
// Use <code>account-authenticator</code> as the root tag of the XML resource that
// describes an account authenticator.
@UseAndroidNamespace
abstract class CoreSyncAdapterStyleable : BaseStyleable {
    // the authority of a content provider.
    @StringValue
    @UseAndroidNamespace
    class contentAuthority

    @Reuse(CoreAccountAuthenticatorStyleable.accountType::class)
    class accountType

    @BooleanValue
    @UseAndroidNamespace
    class userVisibleclass

    @BooleanValue
    @UseAndroidNamespace
    class supportsUploadingclass

    // Set to true to tell the SyncManager that this SyncAdapter supports
    // multiple simultaneous syncs for the same account type and authority.
    // Otherwise the SyncManager will be sure not to issue a start sync request
    // to this SyncAdapter if the SyncAdapter is already syncing another account.
    // Defaults to false.
    @BooleanValue
    @UseAndroidNamespace
    class allowParallelSyncsclass

    // Set to true to tell the SyncManager to automatically call setIsSyncable(..., ..., 1)
    // for the SyncAdapter instead of issuaing an initialization sync to the SyncAdapter.
    // Defaults to false.
    @BooleanValue
    @UseAndroidNamespace
    class isAlwaysSyncableclass

    // If provided, specifies the action of the settings
    // activity for this SyncAdapter.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

@Deprecated("TODO: remove this deprecated styleable.")
@UseAndroidNamespace
abstract class CoreIconStyleable : BaseStyleable {
    @Reuse(ManifestStyleable.icon::class)
    class icon

    @Reuse(AndroidManifestDataStyleable.mimeType::class)
    class mimeType
}

@Deprecated("TODO: remove this deprecated styleable.")
@UseAndroidNamespace
abstract class CoreIconDefaultStyleable : BaseStyleable {
    @Reuse(ManifestStyleable.icon::class)
    class icon
}

// Maps a specific contact data MIME-type to styling information.
@UseAndroidNamespace
abstract class CoreContactsDataKindStyleable : BaseStyleable {
    // Mime-type handled by this mapping.
    @Reuse(AndroidManifestDataStyleable.mimeType::class)
    class mimeType

    // Icon used to represent data of this kind.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // Column in data table that summarizes this data.
    @StringValue
    @UseAndroidNamespace
    class summaryColumn

    // Column in data table that contains details for this data.
    @StringValue
    @UseAndroidNamespace
    class detailColumn

    // Flag indicating that detail should be built from SocialProvider.
    @BooleanValue
    @UseAndroidNamespace
    class detailSocialSummary

    // Resource representing the term "All Contacts" (for example, "All Friends" or
    // "All connections"). Optional (Default is "All Contacts").
    @StringValue
    @UseAndroidNamespace
    class allContactsName
}

// ===============================
// TabSelector class attributes
// ===============================
@UseAndroidNamespace
abstract class CoreSlidingTabStyleable : BaseStyleable {
    // Use "horizontal" for a row, "vertical" for a column.  The default is horizontal.
    @Reuse(CoreStyleable.orientation::class)
    class orientation
}

// ===============================
// GlowPadView class attributes
// ===============================
@UseAndroidNamespace
abstract class CoreGlowPadViewStyleable : BaseStyleable {
    // Reference to an array resource that be used as description for the targets around the circle.
    @Deprecated("Removed.")
    @ReferenceValue
    @UseAndroidNamespace
    class targetDescriptions

    // Reference to an array resource that be used to announce the directions with targets around the circle.
    @Deprecated("Removed.")
    @ReferenceValue
    @UseAndroidNamespace
    class directionDescriptions
}

// ===============================
// LockPatternView class attributes
// ===============================
@UseAndroidNamespace
abstract class CoreLockPatternViewStyleable : BaseStyleable {
    // Aspect to use when drawing LockPatternView. Choices are "square"(default), "lock_width"
    // or "lock_height"
    @StringValue
    @UseAndroidNamespace
    class aspect

    // Color to use when drawing LockPatternView paths.
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class pathColor

    // The regular pattern color
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class regularColor

    // The error color
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class errorColor

    // The success color
    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class successColor
}

// Use <code>voice-enrollment-application</code>
// as the root tag of the XML resource that describes the supported keyphrases (hotwords)
// by the enrollment application.
// Described here are the attributes that can be included in that tag.
@Hide
@SystemApi
@UseAndroidNamespace
abstract class CoreVoiceEnrollmentApplicationStyleable : BaseStyleable {
    // A globally unique ID for the keyphrase.
    @Hide
    @SystemApi
    @IntegerValue
    @UseAndroidNamespace
    class searchKeyphraseId

    // The actual keyphrase/hint text, or empty if not keyphrase dependent.
    @Hide
    @SystemApi
    @StringValue
    @UseAndroidNamespace
    class searchKeyphrase

    // A comma separated list of BCP-47 language tag for locales that are supported
    // for this keyphrase, or empty if not locale dependent.
    @Hide
    @SystemApi
    @StringValue
    @UseAndroidNamespace
    class searchKeyphraseSupportedLocales

    enum class SearchKeyphraseRecognitionFlagsFlag(val value: Long) : StyleableFlag {
        none(0),
        voiceTrigger(0x1),
        userIdentification(0x2)
    }

    // Flags for supported recognition modes.
    // Defines which scrollbars should be displayed on scrolling or not.
    @Hide
    @SystemApi
    @FlagValue(SearchKeyphraseRecognitionFlagsFlag::class)
    @UseAndroidNamespace
    class searchKeyphraseRecognitionFlags
}

@UseAndroidNamespace
abstract class CoreSearchViewStyleable : CoreLinearLayoutStyleable() {
    // The layout to use for the search view.
    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    // The default state of the SearchView. If true, it will be iconified when not in
    // use and expanded when clicked.
    @BooleanValue
    @UseAndroidNamespace
    class iconifiedByDefault

    // An optional maximum width of the SearchView.
    @Reuse(CoreImageViewStyleable.maxWidth::class)
    class maxWidth

    // An optional query hint string to be displayed in the empty query field.
    @StringValue
    @UseAndroidNamespace
    class queryHint

    // Default query hint used when {@code queryHint} is undefined and
    // the search view's {@code SearchableInfo} does not provide a hint.
    @Hide
    @StringValue
    @UseAndroidNamespace
    class defaultQueryHint

    // The IME options to set on the query text field.
    @Reuse(CoreStyleable.imeOptions::class)
    class imeOptions

    // The input type to set on the query text field.
    @Reuse(CoreStyleable.inputType::class)
    class inputType

    // Close button icon.
    @ReferenceValue
    @UseAndroidNamespace
    class closeIcon

    // Go button icon.
    @ReferenceValue
    @UseAndroidNamespace
    class goIcon

    // Search icon.
    @ReferenceValue
    @UseAndroidNamespace
    class searchIcon

    // Search icon displayed as a text field hint.
    @ReferenceValue
    @UseAndroidNamespace
    class searchHintIcon

    // Voice button icon.
    @ReferenceValue
    @UseAndroidNamespace
    class voiceIcon

    // Commit icon shown in the query suggestion row.
    @ReferenceValue
    @UseAndroidNamespace
    class commitIcon

    // Layout for query suggestion rows.
    @ReferenceValue
    @UseAndroidNamespace
    class suggestionRowLayout

    // Background for the section containing the search query.
    @ReferenceValue
    @UseAndroidNamespace
    class queryBackground

    // Background for the section containing the action (for example, voice search).
    @ReferenceValue
    @UseAndroidNamespace
    class submitBackground
}

@UseAndroidNamespace
abstract class CoreSwitchStyleable : CoreCompoundButtonStyleable() {
    // Drawable to use as the "thumb" that switches back and forth.
    @Reuse(CoreSeekBarStyleable.thumb::class)
    class thumb

    // Tint to apply to the thumb.
    @Reuse(CoreSeekBarStyleable.thumbTint::class)
    class thumbTint

    // Blending mode used to apply the thumb tint.
    @Reuse(CoreSeekBarStyleable.thumbTintMode::class)
    class thumbTintMode

    // Drawable to use as the "track" that the switch thumb slides within.
    @ReferenceValue
    @UseAndroidNamespace
    class track

    @ColorValue
    @UseAndroidNamespace
    class trackTint

    enum class TrackTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // Blending mode used to apply the track tint.
    @EnumValue(TrackTintModeEnum::class)
    @UseAndroidNamespace
    class trackTintMode

    // Text to use when the switch is in the checked/"on" state.
    @Reuse(CoreToggleButtonStyleable.textOn::class)
    class textOn

    // Text to use when the switch is in the unchecked/"off" state.
    @Reuse(CoreToggleButtonStyleable.textOff::class)
    class textOff

    // Amount of padding on either side of text within the switch thumb.
    @DimensionValue
    @UseAndroidNamespace
    class thumbTextPadding

    // TextAppearance style for text displayed on the switch thumb.
    @ReferenceValue
    @UseAndroidNamespace
    class switchTextAppearance

    // Minimum width for the switch component.
    @DimensionValue
    @UseAndroidNamespace
    class switchMinWidth

    // Minimum space between the switch and caption text.
    @DimensionValue
    @UseAndroidNamespace
    class switchPadding

    // Whether to split the track and leave a gap for the thumb drawable.
    @Reuse(CoreSeekBarStyleable.splitTrack::class)
    class splitTrack

    // Whether to draw on/off text.
    @BooleanValue
    @UseAndroidNamespace
    class showText
}

@InnerStyleable(CorePointerIconStyleable::class)
@UseAndroidNamespace
abstract class CorePointerStyleable : BaseStyleable {
    // Reference to a pointer icon drawable with STYLE_ARROW.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconArrow

    // Reference to a pointer icon drawable with STYLE_SPOT_HOVER.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconSpotHover

    // Reference to a pointer icon drawable with STYLE_SPOT_TOUCH.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconSpotTouch

    // Reference to a pointer icon drawable with STYLE_SPOT_ANCHOR.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconSpotAnchor

    // Reference to a pointer drawable with STYLE_CONTEXT_MENU.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconContextMenu

    // Reference to a pointer drawable with STYLE_HAND.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconHand

    // Reference to a pointer drawable with STYLE_HELP.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconHelp

    // Reference to a pointer drawable with STYLE_WAIT.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconWait

    // Reference to a pointer drawable with STYLE_CELL.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconCell

    // Reference to a pointer drawable with STYLE_CROSSHAIR.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconCrosshair

    // Reference to a pointer drawable with STYLE_TEXT.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconText

    // Reference to a pointer drawable with STYLE_VERTICAL_TEXT.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconVerticalText

    // Reference to a pointer drawable with STYLE_ALIAS.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconAlias

    // Reference to a pointer drawable with STYLE_COPY.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconCopy

    // Reference to a pointer drawable with STYLE_NODROP.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconNodrop

    // Reference to a pointer drawable with STYLE_ALL_SCROLL.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconAllScroll

    // Reference to a pointer drawable with STYLE_HORIZONTAL_DOUBLE_ARROW.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconHorizontalDoubleArrow

    // Reference to a pointer drawable with STYLE_VERTICAL_DOUBLE_ARROW.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconVerticalDoubleArrow

    // Reference to a pointer drawable with STYLE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconTopRightDiagonalDoubleArrow

    // Reference to a pointer drawable with STYLE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconTopLeftDiagonalDoubleArrow

    // Reference to a pointer drawable with STYLE_ZOOM_IN.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconZoomIn

    // Reference to a pointer drawable with STYLE_ZOOM_OUT.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconZoomOut

    // Reference to a pointer drawable with STYLE_GRAB.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconGrab

    // Reference to a pointer drawable with STYLE_GRABBING.
    @ReferenceValue
    @UseAndroidNamespace
    class pointerIconGrabbing
}

@UseAndroidNamespace
abstract class CorePointerIconStyleable : BaseStyleable {
    // Drawable to use as the icon bitmap.
    @ReferenceValue
    @UseAndroidNamespace
    class bitmap

    // X coordinate of the icon hot spot.
    @DimensionValue
    @UseAndroidNamespace
    class hotSpotX

    // Y coordinate of the icon hot spot.
    @DimensionValue
    @UseAndroidNamespace
    class hotSpotY
}

@UseAndroidNamespace
abstract class CoreStorageStyleable : BaseStyleable {
    // path to mount point for the storage.
    @StringValue
    @UseAndroidNamespace
    class mountPoint

    // user visible description of the storage.
    @StringValue
    @UseAndroidNamespace
    class storageDescription

    // true if the storage is the primary external storage.
    @BooleanValue
    @UseAndroidNamespace
    class primary

    // true if the storage is removable.
    @BooleanValue
    @UseAndroidNamespace
    class removable

    // true if the storage is emulated via the FUSE sdcard daemon.
    @BooleanValue
    @UseAndroidNamespace
    class emulated

    // number of megabytes of storage MTP should reserve for free storage
    // (used for emulated storage that is shared with system's data partition).
    @IntegerValue
    @UseAndroidNamespace
    class mtpReserve

    // true if the storage can be shared via USB mass storage.
    @BooleanValue
    @UseAndroidNamespace
    class allowMassStorage

    // maximum file size for the volume in megabytes, zero or unspecified if it is unbounded.
    @IntegerValue
    @UseAndroidNamespace
    class maxFileSize
}

// Use <code>keyboard-layouts</code> as the root tag of the XML resource that
// describes a collection of keyboard layouts provided by an application.
// Each keyboard layout is declared by a <code>keyboard-layout</code> tag
// with these attributes.
// The XML resource that contains the keyboard layouts must be referenced from its
// {@link android.hardware.input.InputManager#META_DATA_KEYBOARD_LAYOUTS}
// meta-data entry used with broadcast receivers for
// {@link android.hardware.input.InputManager#ACTION_QUERY_KEYBOARD_LAYOUTS}. 
@UseAndroidNamespace
abstract class CoreKeyboardLayoutStyleable : BaseStyleable {
    // The name of the keyboard layout, must be unique in the receiver. 
    @Reuse(ManifestStyleable.name::class)
    class name

    // The display label of the keyboard layout. 
    @Reuse(ManifestStyleable.label::class)
    class label

    // The key character map file resource. 
    @ReferenceValue
    @UseAndroidNamespace
    class keyboardLayout

    // The locales the given keyboard layout corresponds to. 
    @StringValue
    @UseAndroidNamespace
    class locale

    // The vendor ID of the hardware the given layout corresponds to. @hide
    @IntegerValue
    @UseAndroidNamespace
    class vendorId

    // The product ID of the hardware the given layout corresponds to. @hide
    @IntegerValue
    @UseAndroidNamespace
    class productId
}

@UseAndroidNamespace
abstract class CoreMediaRouteButtonStyleable : CoreViewStyleable() {
    // This drawable is a state list where the "activated" state
    // indicates active media routing. Non-activated indicates
    // that media is playing to the local device only.
    @Hide
    @ReferenceValue
    @UseAndroidNamespace
    class externalRouteEnabledDrawable

    enum class MediaRouteTypesEnum(val value: Int) : StyleableEnumAndInteger {
        // Allow selection of live audio routes. 
        liveAudio(0x1),
        // Allow selection of user (app-specified) routes. 
        user(0x800000)
    }

    // The types of media routes the button and its resulting
    //chooser will filter by. 
    @EnumAndIntegerValue(MediaRouteTypesEnum::class)
    @UseAndroidNamespace
    class mediaRouteTypes

    @Reuse(CoreProgressBarStyleable.minWidth::class)
    class minWidth

    @Reuse(CoreProgressBarStyleable.minHeight::class)
    class minHeight
}

// PagedView specific attributes. These attributes are used to customize
// a PagedView view in XML files. 
@UseAndroidNamespace
abstract class CorePagedViewStyleable : BaseStyleable {
    // The space between adjacent pages of the PagedView. 
    @DimensionValue
    @UseAndroidNamespace
    class pageSpacing

    // The padding for the scroll indicator area.
    @DimensionValue
    @UseAndroidNamespace
    class scrollIndicatorPaddingLeft

    @DimensionValue
    @UseAndroidNamespace
    class scrollIndicatorPaddingRight
}

@UseAndroidNamespace
abstract class CoreKeyguardGlowStripViewStyleable : BaseStyleable {
    @DimensionValue
    @UseAndroidNamespace
    class dotSize

    @IntegerValue
    @UseAndroidNamespace
    class numDots

    @ReferenceValue
    @UseAndroidNamespace
    class glowDot

    @BooleanValue
    @UseAndroidNamespace
    class leftToRight
}

// Attributes that can be used with <code>&lt;FragmentBreadCrumbs&gt;</code>
// tags. 
@UseAndroidNamespace
abstract class CoreFragmentBreadCrumbsStyleable : CoreViewGroupStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    @ReferenceValue
    @UseAndroidNamespace
    class itemLayout

    @ColorValue
    @ReferenceValue
    @UseAndroidNamespace
    class itemColor
}

// Used as a filter array on the theme to pull out only the EdgeEffect-relevant bits. 
@UseAndroidNamespace
abstract class CoreEdgeEffectStyleable : BaseStyleable {
    @Reuse(CoreThemeStyleable.colorEdgeEffect::class)
    class colorEdgeEffect
}

@LayoutStyleable(CoreResolverDrawerLayout_LayoutParamsStyleable::class)
@UseAndroidNamespace
abstract class CoreResolverDrawerLayoutStyleable : CoreViewGroupStyleable() {
    @Reuse(CoreImageViewStyleable.maxWidth::class)
    class maxWidth

    @DimensionValue
    @UseAndroidNamespace
    class maxCollapsedHeight

    @DimensionValue
    @UseAndroidNamespace
    class maxCollapsedHeightSmall

    // Whether the Drawer should be positioned at the top rather than at the bottom.
    @BooleanValue
    @UseAndroidNamespace
    class showAtTop
}

@UseAndroidNamespace
abstract class CoreMessagingLinearLayoutStyleable : CoreViewGroupStyleable() {
    @Reuse(CoreGalleryStyleable.spacing::class)
    class spacing
}

@UseAndroidNamespace
abstract class CoreDateTimeViewStyleable : CoreTextViewStyleable() {
    @BooleanValue
    @UseAndroidNamespace
    class showRelative
}

@Hide
@UseAndroidNamespace
abstract class CoreLightingStyleable : BaseStyleable {
    @Reuse(CoreThemeStyleable.lightY::class)
    class lightY

    @Reuse(CoreThemeStyleable.lightZ::class)
    class lightZ

    @Reuse(CoreThemeStyleable.lightRadius::class)
    class lightRadius

    @Reuse(CoreThemeStyleable.ambientShadowAlpha::class)
    class ambientShadowAlpha

    @Reuse(CoreThemeStyleable.spotShadowAlpha::class)
    class spotShadowAlpha
}

@UseAndroidNamespace
abstract class CoreRestrictionEntryStyleable : BaseStyleable {
    @Reuse(CorePreferenceStyleable.key::class)
    class key

    enum class RestrictionTypeEnum(val value: Int) : StyleableEnum {
        hidden(0),
        bool(1),
        choice(2),
        multi_select(4),
        integer(5),
        string(6),
        bundle(7),
        bundle_array(8)
    }

    @EnumValue(RestrictionTypeEnum::class)
    @UseAndroidNamespace
    class restrictionType

    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    @Reuse(ManifestStyleable.description::class)
    class description

    @Reuse(CorePreferenceStyleable.defaultValue::class)
    class defaultValue

    @Reuse(CoreStyleable.entries::class)
    class entries

    @Reuse(CoreListPreferenceStyleable.entryValues::class)
    class entryValues
}

// Attributes which will be read by the Activity to intialize the
// base activity TaskDescription. 
@Hide
@UseAndroidNamespace
abstract class CoreActivityTaskDescriptionStyleable : BaseStyleable {
    // From Theme.colorPrimary, used for the TaskDescription primary color.
    @Hide
    @Reuse(CoreThemeStyleable.colorPrimary::class)
    class colorPrimary

    // From Theme.colorBackground, used for the TaskDescription background color.
    @Hide
    @Reuse(CoreThemeStyleable.colorBackground::class)
    class colorBackground

    // From Theme.statusBarColor, used for the TaskDescription status bar color.
    @Hide
    @Reuse(CoreWindowStyleable.statusBarColor::class)
    class statusBarColor

    // From Theme.navigationBarColor, used for the TaskDescription navigation bar color.
    @Hide
    @Reuse(CoreWindowStyleable.navigationBarColor::class)
    class navigationBarColor
}

@UseAndroidNamespace
abstract class CoreShortcutStyleable : BaseStyleable {
    @StringValue
    @UseAndroidNamespace
    class shortcutId

    @Reuse(CoreTextViewStyleable.enabled::class)
    class enabled

    @Reuse(ManifestStyleable.icon::class)
    class icon

    @ReferenceValue
    @UseAndroidNamespace
    class shortcutShortLabel

    @ReferenceValue
    @UseAndroidNamespace
    class shortcutLongLabel

    @ReferenceValue
    @UseAndroidNamespace
    class shortcutDisabledMessage
}

@UseAndroidNamespace
abstract class CoreShortcutCategoriesStyleable : BaseStyleable {
    @Reuse(ManifestStyleable.name::class)
    class name
}

// Attributes that are read when parsing a <font> tag, which is a child of
// <font-family>. This represents an actual font file and its attributes.
@UseAndroidNamespace
abstract class CoreFontFamilyFontStyleable : BaseStyleable {

    enum class FontStyleEnum(val value: Int) : StyleableEnum {
        normal(0),
        italic(1)
    }

    // The style of the given font file. This will be used when the font is being loaded into
    // the font stack and will override any style information in the font's header tables. If
    // unspecified, the value in the font's header tables will be used.
    @EnumValue(FontStyleEnum::class)
    @UseAndroidNamespace
    class fontStyle

    // The reference to the font file to be used. This should be a file in the res/font folder
    // and should therefore have an R reference value. E.g. @font/myfont
    @ReferenceValue
    @UseAndroidNamespace
    class font

    // The weight of the given font file. This will be used when the font is being loaded into
    // the font stack and will override any weight information in the font's header tables. Must
    // be a positive number, a multiple of 100, and between 100 and 900, inclusive. The most
    // common values are 400 for regular weight and 700 for bold weight. If unspecified, the value
    // in the font's header tables will be used.
    @IntegerValue
    @UseAndroidNamespace
    class fontWeight

    // The index of the font in the tcc font file. If the font file referenced is not in the
    // tcc format, this attribute needs not be specified.
    @IntegerValue
    @UseAndroidNamespace
    class ttcIndex

    // The variation settings to be applied to the font. The string should be in the following
    // format: "'tag1' value1, 'tag2' value2, ...". If the default variation settings should be
    // used, or the font used does not support variation settings, this attribute needs not be
    // specified.
    @StringValue
    @UseAndroidNamespace
    class fontVariationSettings
}

// Attributes that are read when parsing a <fontfamily> tag.
@UseAndroidNamespace
abstract class CoreFontFamilyStyleable : BaseStyleable {
    // The authority of the Font Provider to be used for the request.
    @StringValue
    @UseAndroidNamespace
    class fontProviderAuthority

    // The package for the Font Provider to be used for the request. This is used to verify
    // the identity of the provider.
    @StringValue
    @UseAndroidNamespace
    class fontProviderPackage

    // The query to be sent over to the provider. Refer to your font provider's documentation
    // on the format of this string.
    @StringValue
    @UseAndroidNamespace
    class fontProviderQuery

    // The sets of hashes for the certificates the provider should be signed with. This is
    // used to verify the identity of the provider, and is only required if the provider is not
    // part of the system image. This value may point to one list or a list of lists, where each
    // individual list represents one collection of signature hashes. Refer to your font provider's
    // documentation for these values.
    @ReferenceValue
    @UseAndroidNamespace
    class fontProviderCerts
}

@Hide
@UseAndroidNamespace
abstract class CoreRecyclerViewStyleable : CoreViewGroupStyleable() {
    @StringValue
    @UseAndroidNamespace
    class layoutManager

    @Reuse(CoreStyleable.orientation::class)
    class orientation

    @Reuse(CoreViewGroupStyleable.descendantFocusability::class)
    class descendantFocusability

    @IntegerValue
    @UseAndroidNamespace
    class spanCount

    @BooleanValue
    @UseAndroidNamespace
    class reverseLayout

    @BooleanValue
    @UseAndroidNamespace
    class stackFromEnd
}

@Hide
@UseAndroidNamespace
abstract class CoreNotificationThemeStyleable : BaseStyleable {
    @ReferenceValue
    @UseAndroidNamespace
    class notificationHeaderStyle

    @ReferenceValue
    @UseAndroidNamespace
    class notificationHeaderTextAppearance

    @DimensionValue
    @UseAndroidNamespace
    class notificationHeaderIconSize

    enum class NotificationHeaderAppNameVisibilityEnum(val value: Int) : StyleableEnum {
        // Visible on screen; the default value.
        visible(0),
        // Not displayed, but taken into account during layout (space is left for it).
        invisible(1),
        // Completely hidden, as if the view had not been added.
        gone(2)
    }

    @EnumValue(NotificationHeaderAppNameVisibilityEnum::class)
    @UseAndroidNamespace
    class notificationHeaderAppNameVisibility
}