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
package dev.android.playground.nova.core.framework.themes

import dev.android.playground.nova.core.base.ThemeDefinition
import dev.android.playground.nova.core.base.ThemeDictionary
import dev.android.playground.nova.core.base.WidgetStyleDefinition
import dev.android.playground.nova.core.framework.styleables.*

val coreTextAppearance = WidgetStyleDefinition("TextAppearance", null, CoreTextAppearanceStyleable::class)
val coreTextAppearance_Inverse = WidgetStyleDefinition("TextAppearance.Inverse", coreTextAppearance)
val coreTextAppearance_Theme = WidgetStyleDefinition("TextAppearance.Theme", coreTextAppearance)
val coreTextAppearance_DialogWindowTitle = WidgetStyleDefinition("TextAppearance.DialogWindowTitle", coreTextAppearance)
val coreTextAppearance_Large = WidgetStyleDefinition("TextAppearance.Large", coreTextAppearance)
val coreTextAppearance_Large_Inverse = WidgetStyleDefinition("TextAppearance.Large.Inverse", coreTextAppearance_Large)
val coreTextAppearance_Medium = WidgetStyleDefinition("TextAppearance.Medium", coreTextAppearance)
val coreTextAppearance_Medium_Inverse = WidgetStyleDefinition("TextAppearance.Medium.Inverse", coreTextAppearance_Medium)
val coreTextAppearance_Small = WidgetStyleDefinition("TextAppearance.Small", coreTextAppearance)
val coreTextAppearance_Small_Inverse = WidgetStyleDefinition("TextAppearance.Small.Inverse", coreTextAppearance_Small)
val coreTextAppearance_Theme_Dialog = WidgetStyleDefinition("TextAppearance.Theme.Dialog", coreTextAppearance_Theme)
val coreTextAppearance_Widget = WidgetStyleDefinition("TextAppearance.Widget", coreTextAppearance)
val coreTextAppearance_Widget_Button = WidgetStyleDefinition("TextAppearance.Widget.Button", coreTextAppearance_Small_Inverse)
val coreTextAppearance_Widget_IconMenu_Item = WidgetStyleDefinition("TextAppearance.Widget.IconMenu.Item", coreTextAppearance_Small)
val coreTextAppearance_Widget_EditText = WidgetStyleDefinition("TextAppearance.Widget.EditText", coreTextAppearance_Widget)
val coreTextAppearance_Widget_TabWidget = WidgetStyleDefinition("TextAppearance.Widget.TabWidget", coreTextAppearance_Widget)
val coreTextAppearance_Widget_TextView = WidgetStyleDefinition("TextAppearance.Widget.TextView", coreTextAppearance_Widget)
val coreTextAppearance_Widget_TextView_PopupMenu = WidgetStyleDefinition("TextAppearance.Widget.TextView.PopupMenu", coreTextAppearance_Widget_TextView)
val coreTextAppearance_Widget_DropDownHint = WidgetStyleDefinition("TextAppearance.Widget.DropDownHint", coreTextAppearance_Widget)
val coreTextAppearance_Widget_DropDownItem = WidgetStyleDefinition("TextAppearance.Widget.DropDownItem", coreTextAppearance_Widget)
val coreTextAppearance_Widget_TextView_SpinnerItem = WidgetStyleDefinition("TextAppearance.Widget.TextView.SpinnerItem", coreTextAppearance_Widget_TextView)
val coreTextAppearance_SlidingTabNormal = WidgetStyleDefinition("TextAppearance.SlidingTabNormal", coreTextAppearance_Medium)
val coreTextAppearance_SlidingTabActive = WidgetStyleDefinition("TextAppearance.SlidingTabActive", coreTextAppearance_Medium)
val coreTextAppearance_SearchResult = WidgetStyleDefinition("TextAppearance.SearchResult", coreTextAppearance)
val coreTextAppearance_SearchResult_Title = WidgetStyleDefinition("TextAppearance.SearchResult.Title", coreTextAppearance_SearchResult)
val coreTextAppearance_SearchResult_Subtitle = WidgetStyleDefinition("TextAppearance.SearchResult.Subtitle", coreTextAppearance_SearchResult)
val coreTextAppearance_WindowTitle = WidgetStyleDefinition("TextAppearance.WindowTitle", coreTextAppearance)
val coreTextAppearance_Large_Inverse_NumberPickerInputText = WidgetStyleDefinition("TextAppearance.Large.Inverse.NumberPickerInputText", coreTextAppearance_Large_Inverse)
val coreTextAppearance_Toast = WidgetStyleDefinition("TextAppearance.Toast", coreTextAppearance)
val coreTextAppearance_Tooltip = WidgetStyleDefinition("TextAppearance.Tooltip", coreTextAppearance)
val coreTextAppearance_SuggestionHighlight = WidgetStyleDefinition("TextAppearance.SuggestionHighlight", coreTextAppearance)
val coreTextAppearance_StatusBar = WidgetStyleDefinition("TextAppearance.StatusBar", coreTextAppearance)
val coreTextAppearance_StatusBar_Ticker = WidgetStyleDefinition("TextAppearance.StatusBar.Ticker", coreTextAppearance_StatusBar)
val coreTextAppearance_StatusBar_Title = WidgetStyleDefinition("TextAppearance.StatusBar.Title", coreTextAppearance_StatusBar)
val coreTextAppearance_StatusBar_Icon = WidgetStyleDefinition("TextAppearance.StatusBar.Icon", coreTextAppearance_StatusBar)
val coreTextAppearance_StatusBar_EventContent = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent", coreTextAppearance_StatusBar)
val coreTextAppearance_StatusBar_EventContent_Title = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent.Title", coreTextAppearance_StatusBar_EventContent)
val coreTextAppearance_StatusBar_EventContent_Line2 = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent.Line2", coreTextAppearance_StatusBar_EventContent)
val coreTextAppearance_StatusBar_EventContent_Info = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent.Info", coreTextAppearance_StatusBar_EventContent)
val coreTextAppearance_StatusBar_EventContent_Time = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent.Time", coreTextAppearance_StatusBar_EventContent)
val coreTextAppearance_StatusBar_EventContent_Emphasis = WidgetStyleDefinition("TextAppearance.StatusBar.EventContent.Emphasis", coreTextAppearance_StatusBar_EventContent)
val coreTextAppearance_Small_CalendarViewWeekDayView = WidgetStyleDefinition("TextAppearance.Small.CalendarViewWeekDayView", coreTextAppearance_Small)
val coreTextAppearance_Suggestion = WidgetStyleDefinition("TextAppearance.Suggestion", coreTextAppearance)
val coreTextAppearance_EasyCorrectSuggestion = WidgetStyleDefinition("TextAppearance.EasyCorrectSuggestion", coreTextAppearance_Suggestion)
val coreTextAppearance_MisspelledSuggestion = WidgetStyleDefinition("TextAppearance.MisspelledSuggestion", coreTextAppearance_Suggestion)
val coreTextAppearance_AutoCorrectionSuggestion = WidgetStyleDefinition("TextAppearance.AutoCorrectionSuggestion", coreTextAppearance_Suggestion)
val coreTextAppearance_Widget_PopupMenu = WidgetStyleDefinition("TextAppearance.Widget.PopupMenu", coreTextAppearance_Widget)
val coreTextAppearance_Widget_PopupMenu_Large = WidgetStyleDefinition("TextAppearance.Widget.PopupMenu.Large", coreTextAppearance_Widget_PopupMenu)
val coreTextAppearance_Widget_PopupMenu_Small = WidgetStyleDefinition("TextAppearance.Widget.PopupMenu.Small", coreTextAppearance_Widget_PopupMenu)
val coreTextAppearance_Widget_ActionBar_Title = WidgetStyleDefinition("TextAppearance.Widget.ActionBar.Title", coreTextAppearance_Medium)
val coreTextAppearance_Widget_ActionBar_Subtitle = WidgetStyleDefinition("TextAppearance.Widget.ActionBar.Subtitle", coreTextAppearance_Small)
val coreTextAppearance_Widget_ActionMode_Title = WidgetStyleDefinition("TextAppearance.Widget.ActionMode.Title", coreTextAppearance_Medium)
val coreTextAppearance_Widget_ActionMode_Subtitle = WidgetStyleDefinition("TextAppearance.Widget.ActionMode.Subtitle", coreTextAppearance_Small)
val coreTextAppearance_Widget_Toolbar_Title = WidgetStyleDefinition("TextAppearance.Widget.Toolbar.Title", coreTextAppearance_Widget_ActionBar_Title)
val coreTextAppearance_Widget_Toolbar_Subtitle = WidgetStyleDefinition("TextAppearance.Widget.Toolbar.Subtitle", coreTextAppearance_Widget_ActionBar_Subtitle)

val coreAnimation = WidgetStyleDefinition("Animation", null, CoreWindowAnimationStyleable::class)
val coreAnimation_Activity = WidgetStyleDefinition("Animation.Activity", coreAnimation)
val coreAnimation_Dialog = WidgetStyleDefinition("Animation.Dialog", coreAnimation)
val coreAnimation_Translucent = WidgetStyleDefinition("Animation.Translucent", coreAnimation)
val coreAnimation_LockScreen = WidgetStyleDefinition("Animation.LockScreen", coreAnimation)
val coreAnimation_OptionsPanel = WidgetStyleDefinition("Animation.OptionsPanel", coreAnimation)
val coreAnimation_SubMenuPanel = WidgetStyleDefinition("Animation.SubMenuPanel", coreAnimation)
val coreAnimation_TypingFilter = WidgetStyleDefinition("Animation.TypingFilter", coreAnimation)
val coreAnimation_TypingFilterRestore = WidgetStyleDefinition("Animation.TypingFilterRestore", coreAnimation)
val coreAnimation_Toast = WidgetStyleDefinition("Animation.Toast", coreAnimation)
val coreAnimation_Tooltip = WidgetStyleDefinition("Animation.Tooltip", coreAnimation)
val coreAnimation_DropDownDown = WidgetStyleDefinition("Animation.DropDownDown", coreAnimation)
val coreAnimation_DropDownUp = WidgetStyleDefinition("Animation.DropDownUp", coreAnimation)
val coreAnimation_InputMethod = WidgetStyleDefinition("Animation.InputMethod", coreAnimation)
val coreAnimation_VoiceActivity = WidgetStyleDefinition("Animation.VoiceActivity", coreAnimation)
val coreAnimation_VoiceInteractionSession = WidgetStyleDefinition("Animation.VoiceInteractionSession", coreAnimation)
val coreAnimation_InputMethodFancy = WidgetStyleDefinition("Animation.InputMethodFancy", coreAnimation)
val coreAnimation_SearchBar = WidgetStyleDefinition("Animation.SearchBar", coreAnimation)
val coreAnimation_ZoomButtons = WidgetStyleDefinition("Animation.ZoomButtons", coreAnimation)
val coreAnimation_Wallpaper = WidgetStyleDefinition("Animation.Wallpaper", coreAnimation)
val coreAnimation_RecentApplications = WidgetStyleDefinition("Animation.RecentApplications", coreAnimation)
val coreAnimation_PopupWindow = WidgetStyleDefinition("Animation.PopupWindow", coreAnimation)
val coreAnimation_PopupWindow_ActionMode = WidgetStyleDefinition("Animation.PopupWindow.ActionMode", coreAnimation_PopupWindow)
val coreAnimation_VolumePanel = WidgetStyleDefinition("Animation.VolumePanel", coreAnimation)
val coreAnimation_ImmersiveModeConfirmation = WidgetStyleDefinition("Animation.ImmersiveModeConfirmation", coreAnimation)
val coreAnimation_Dream = WidgetStyleDefinition("Animation.Dream", coreAnimation)

val coreWidget = WidgetStyleDefinition("Widget", null, CoreViewStyleable::class)
val coreWidget_Button = WidgetStyleDefinition("Widget.Button", coreWidget, CoreButtonStyleable::class)
val coreButtonBar = WidgetStyleDefinition("ButtonBar", coreWidget, CoreViewStyleable::class)
val coreSegmentedButton = WidgetStyleDefinition("SegmentedButton", coreWidget, CoreViewStyleable::class)
val coreWidget_TextView = WidgetStyleDefinition("Widget.TextView", coreWidget, CoreTextViewStyleable::class)
val coreWidget_CheckedTextView = WidgetStyleDefinition("Widget.CheckedTextView", coreWidget, CoreCheckedTextViewStyleable::class)
val coreWidget_TextView_ListSeparator = WidgetStyleDefinition("Widget.TextView.ListSeparator", coreWidget_TextView)
val coreWidget_CompoundButton = WidgetStyleDefinition("Widget.Button.CompoundButton", coreWidget, CoreCompoundButtonStyleable::class)
val coreWidget_CompoundButton_CheckBox = WidgetStyleDefinition("Widget.CompoundButton.CheckBox", coreWidget_CompoundButton)
val coreWidget_CompoundButton_RadioButton = WidgetStyleDefinition("Widget.CompoundButton.RadioButton", coreWidget_CompoundButton)
val coreWidget_CompoundButton_Star = WidgetStyleDefinition("Widget.CompoundButton.Star", coreWidget_CompoundButton)
val coreWidget_CompoundButton_Switch = WidgetStyleDefinition("Widget.CompoundButton.Switch", coreWidget_CompoundButton)
val coreWidget_TextSelectHandle = WidgetStyleDefinition("Widget.TextSelectHandle", coreWidget, CorePopupWindowStyleable::class)
val coreWidget_AbsListView = WidgetStyleDefinition("Widget.AbsListView", coreWidget, CoreAbsListViewStyleable::class)
val coreWidget_EditText = WidgetStyleDefinition("Widget.EditText", coreWidget, CoreEditTextViewStyleable::class)
val coreWidget_AutoCompleteTextView = WidgetStyleDefinition("Widget.AutoCompleteTextView", coreWidget_EditText, CoreAutoCompleteTextViewStyleable::class)
val coreWidget_Button_Toggle = WidgetStyleDefinition("Widget.Button.Toggle", coreWidget_Button)
val coreWidget_FragmentBreadCrumbs = WidgetStyleDefinition("Widget.FragmentBreadCrumbs", coreWidget, CoreViewStyleable::class)
val coreWidget_Gallery = WidgetStyleDefinition("Widget.Gallery", coreWidget, CoreGalleryStyleable::class)
val coreWidget_GestureOverlayView = WidgetStyleDefinition("Widget.GestureOverlayView", coreWidget, CoreGestureOverlayViewStyleable::class)
val coreWidget_GridView = WidgetStyleDefinition("Widget.GridView", coreWidget_AbsListView, CoreGridViewStyleable::class)
val coreWidget_ImageWell = WidgetStyleDefinition("Widget.ImageWell", coreWidget, CoreViewStyleable::class)
val coreWidget_CalendarView = WidgetStyleDefinition("Widget.CalendarView", coreWidget, CoreCalendarViewStyleable::class)
val coreWidget_ImageButton = WidgetStyleDefinition("Widget.ImageButton", coreWidget, CoreImageViewStyleable::class)
val coreWidget_NumberPicker = WidgetStyleDefinition("Widget.NumberPicker", coreWidget, CoreNumberPickerStyleable::class)
val coreWidget_TimePicker = WidgetStyleDefinition("Widget.TimePicker", coreWidget, CoreTimePickerStyleable::class)
val coreWidget_DatePicker = WidgetStyleDefinition("Widget.DatePicker", coreWidget, CoreDatePickerStyleable::class)
val coreWidget_ActivityChooserView = WidgetStyleDefinition("Widget.ActivityChooserView", coreWidget, CoreViewStyleable::class)
val coreWidget_ListView = WidgetStyleDefinition("Widget.ListView", coreWidget_AbsListView, CoreListViewStyleable::class)
val coreWidget_PopupWindow = WidgetStyleDefinition("Widget.PopupWindow", coreWidget, CorePopupWindowStyleable::class)
val coreWidget_ProgressBar = WidgetStyleDefinition("Widget.ProgressBar", coreWidget, CoreProgressBarStyleable::class)
val coreWidget_ProgressBar_Large = WidgetStyleDefinition("Widget.ProgressBar.Large", coreWidget_ProgressBar)
val coreWidget_ProgressBar_Small = WidgetStyleDefinition("Widget.ProgressBar.Small", coreWidget_ProgressBar)
val coreWidget_ProgressBar_Horizontal = WidgetStyleDefinition("Widget.ProgressBar.Horizontal", coreWidget_ProgressBar)
val coreWidget_RatingBar = WidgetStyleDefinition("Widget.RatingBar", coreWidget, CoreRatingBarStyleable::class)
val coreWidget_RatingBar_Indicator = WidgetStyleDefinition("Widget.RatingBar.Indicator", coreWidget_RatingBar)
val coreWidget_RatingBar_Small = WidgetStyleDefinition("Widget.RatingBar.Small", coreWidget_RatingBar)
val coreWidget_ScrollView = WidgetStyleDefinition("Widget.ScrollView", coreWidget, CoreScrollViewStyleable::class)
val coreWidget_HorizontalScrollView = WidgetStyleDefinition("Widget.HorizontalScrollView", coreWidget, CoreHorizontalScrollViewStyleable::class)
val coreWidget_Spinner = WidgetStyleDefinition("Widget.Spinner", coreWidget, CoreSpinnerStyleable::class)
val coreWidget_Spinner_DropDown = WidgetStyleDefinition("Widget.Spinner.DropDown", coreWidget_Spinner)
val coreWidget_TabWidget = WidgetStyleDefinition("Widget.TabWidget", coreWidget, CoreTabWidgetStyleable::class)
val coreWidget_WebView = WidgetStyleDefinition("Widget.WebView", coreWidget, CoreViewStyleable::class)
val coreWidget_WebTextView = WidgetStyleDefinition("Widget.WebTextView", coreWidget, CoreViewStyleable::class)
val coreWidget_DropDownItem = WidgetStyleDefinition("Widget.DropDownItem", coreWidget, CoreViewStyleable::class)
val coreWidget_TextView_PopupMenu = WidgetStyleDefinition("Widget.TextView.PopupMenu", coreWidget_TextView)
val coreWidget_TextView_SpinnerItem = WidgetStyleDefinition("Widget.TextView.SpinnerItem", coreWidget_TextView)
val coreWidget_KeyboardView = WidgetStyleDefinition("Widget.KeyboardView", coreWidget, CoreKeyboardViewStyleable::class)
val coreWidget_GenericQuickContactBadge = WidgetStyleDefinition("Widget.GenericQuickContactBadge", coreWidget, CoreQuickContactBadgeStyleable::class)
val coreWidget_QuickContactBadge = WidgetStyleDefinition("Widget.QuickContactBadge", coreWidget_GenericQuickContactBadge)
val coreWidget_QuickContactBadgeSmall = WidgetStyleDefinition("Widget.QuickContactBadgeSmall", coreWidget_GenericQuickContactBadge)
val coreWidget_QuickContactBadge_WindowSmall = WidgetStyleDefinition("Widget.QuickContactBadge.WindowSmall", coreWidget_QuickContactBadge)
val coreWidget_QuickContactBadge_WindowMedium = WidgetStyleDefinition("Widget.QuickContactBadge.WindowMedium", coreWidget_QuickContactBadge)
val coreWidget_QuickContactBadge_WindowLarge = WidgetStyleDefinition("Widget.QuickContactBadge.WindowLarge", coreWidget_QuickContactBadge)
val coreWidget_QuickContactBadgeSmall_WindowSmall = WidgetStyleDefinition("Widget.QuickContactBadgeSmall.WindowSmall", coreWidget_QuickContactBadge_WindowSmall)
val coreWidget_QuickContactBadgeSmall_WindowMedium = WidgetStyleDefinition("Widget.QuickContactBadgeSmall.WindowMedium", coreWidget_QuickContactBadge_WindowSmall)
val coreWidget_QuickContactBadgeSmall_WindowLarge = WidgetStyleDefinition("Widget.QuickContactBadgeSmall.WindowLarge", coreWidget_QuickContactBadge_WindowSmall)
val coreWidget_ListPopupWindow = WidgetStyleDefinition("Widget.ListPopupWindow", coreWidget, CoreListPopupWindowStyleable::class)
val coreWidget_ActionButton = WidgetStyleDefinition("Widget.ActionButton", coreWidget, CoreButtonStyleable::class)
val coreWidget_ActionBar_TabView = WidgetStyleDefinition("Widget.ActionBar.TabView", coreWidget, CoreViewStyleable::class)
val coreWidget_ActionBar_TabBar = WidgetStyleDefinition("Widget.ActionBar.TabBar", coreWidget, CoreViewStyleable::class)
val coreWidget_ActionBar_TabText = WidgetStyleDefinition("Widget.ActionBar.TabText", coreWidget, CoreViewStyleable::class)
val coreWidget_Button_Small = WidgetStyleDefinition("Widget.Button.Small", coreWidget_Button)
val coreWidget_Button_Inset = WidgetStyleDefinition("Widget.Button.Inset", coreWidget_Button)
val coreWidget_Button_Transparent = WidgetStyleDefinition("Widget.Button.Transparent", coreWidget_Button)
val coreWidget_TextView_ListSeparator_White = WidgetStyleDefinition("Widget.TextView.ListSeparator.White", coreWidget_TextView_ListSeparator)
val coreWidget_ListView_White = WidgetStyleDefinition("Widget.ListView.White", coreWidget_AbsListView, CoreListViewStyleable::class)
val coreWidget_ListView_DropDown = WidgetStyleDefinition("Widget.ListView.DropDown", coreWidget_ListView)
val coreWidget_ListView_Menu = WidgetStyleDefinition("Widget.ListView.Menu", coreWidget_Holo_ListView)
val coreWidget_ExpandableListView = WidgetStyleDefinition("Widget.ExpandableListView", coreWidget_ListView, CoreExpandableListViewStyleable::class)
val coreWidget_ExpandableListView_White = WidgetStyleDefinition("Widget.ExpandableListView.White", coreWidget_ExpandableListView)
val coreWidget_FastScroll = WidgetStyleDefinition("Widget.FastScroll", coreWidget, CoreFastScrollStyleable::class)
val coreWidget_GestureOverlayView_White = WidgetStyleDefinition("Widget.GestureOverlayView.White", coreWidget_GestureOverlayView)
val coreWidget_ProgressBar_Inverse = WidgetStyleDefinition("Widget.ProgressBar.Inverse", coreWidget_ProgressBar)
val coreWidget_ProgressBar_Large_Inverse = WidgetStyleDefinition("Widget.ProgressBar.Large.Inverse", coreWidget_ProgressBar_Large)
val coreWidget_ProgressBar_Small_Inverse = WidgetStyleDefinition("Widget.ProgressBar.Small.Inverse", coreWidget_ProgressBar_Small)
val coreWidget_ProgressBar_Small_Title = WidgetStyleDefinition("Widget.ProgressBar.Small.Title", coreWidget_ProgressBar_Small)
val coreWidget_SeekBar = WidgetStyleDefinition("Widget.SeekBar", coreWidget, CoreSeekBarStyleable::class)
val coreWidget_DropDownItem_Spinner = WidgetStyleDefinition("Widget.DropDownItem.Spinner", coreWidget_DropDownItem)
val coreWidget_PopupMenu = WidgetStyleDefinition("Widget.PopupMenu", coreWidget_ListPopupWindow)
val coreWidget_ActionButton_Overflow = WidgetStyleDefinition("Widget.ActionButton.Overflow", coreWidget_ActionButton)
val coreWidget_ActionButton_CloseMode = WidgetStyleDefinition("Widget.ActionButton.CloseMode", coreWidget_ActionButton)
val coreWidget_ActionBar = WidgetStyleDefinition("Widget.ActionBar", coreWidget, CoreActionBarStyleable::class)
val coreWidget_ActionMode = WidgetStyleDefinition("Widget.ActionMode", coreWidget, CoreActionModeStyleable::class)
val coreWidget_Toolbar_Button_Navigation = WidgetStyleDefinition("Widget.Toolbar.Button.Navigation", coreWidget, CoreButtonStyleable::class)
val coreWidget_Toolbar = WidgetStyleDefinition("Widget.Toolbar", coreWidget, CoreToolbarStyleable::class)
val coreWidget_PreferenceFrameLayout = WidgetStyleDefinition("Widget.PreferenceFrameLayout", null, CorePreferenceFrameLayoutStyleable::class)

val coreAlertDialog = WidgetStyleDefinition("AlertDialog", null, CoreAlertDialogStyleable::class)
val coreWindowTitleBackground = WidgetStyleDefinition("WindowTitleBackground", null, CoreViewStyleable::class)
val coreWindowTitle = WidgetStyleDefinition("WindowTitle", null, CoreTextViewStyleable::class)
val coreDialogWindowTitle = WidgetStyleDefinition("DialogWindowTitle", null, CoreTextViewStyleable::class)
val coreDialogWindowTitleBackground = WidgetStyleDefinition("DialogWindowTitleBackground", null, CoreViewStyleable::class)

val corePreference = WidgetStyleDefinition("Preference", null, CorePreferenceStyleable::class)
val corePreferenceFragment = WidgetStyleDefinition("PreferenceFragment", null, CorePreferenceFragmentStyleable::class)
val corePreferenceActivity = WidgetStyleDefinition("PreferenceActivity", null, CorePreferenceActivityStyleable::class)
val corePreference_Information = WidgetStyleDefinition("Preference.Information", corePreference)
val corePreference_Category = WidgetStyleDefinition("Preference.Category", corePreference)
val corePreference_CheckBoxPreference = WidgetStyleDefinition("Preference.CheckBoxPreference", corePreference, CoreCheckBoxPreferenceStyleable::class)
val corePreference_SwitchPreference = WidgetStyleDefinition("Preference.SwitchPreference", corePreference, CoreSwitchPreferenceStyleable::class)
val corePreference_SeekBarPreference = WidgetStyleDefinition("Preference.SeekBarPreference", corePreference, CoreSeekBarPreferenceStyleable::class)
val corePreference_PreferenceScreen = WidgetStyleDefinition("Preference.PreferenceScreen", corePreference, CorePreferenceScreenStyleable::class)
val corePreference_DialogPreference = WidgetStyleDefinition("Preference.DialogPreference", corePreference, CoreDialogPreferenceStyleable::class)
val corePreference_DialogPreference_YesNoPreference = WidgetStyleDefinition("Preference.DialogPreference.YesNoPreference", corePreference_DialogPreference)
val corePreference_DialogPreference_SeekBarPreference = WidgetStyleDefinition("Preference.DialogPreference.SeekBarPreference", corePreference_DialogPreference)
val corePreference_DialogPreference_EditTextPreference = WidgetStyleDefinition("Preference.DialogPreference.EditTextPreference", corePreference_DialogPreference)
val corePreference_RingtonePreference = WidgetStyleDefinition("Preference.RingtonePreference", corePreference, CoreRingtonePreferenceStyleable::class)

val corePreferencePanel = WidgetStyleDefinition("PreferencePanel", null, CoreViewStyleable::class)
val corePreferencePanel_Dialog = WidgetStyleDefinition("PreferencePanel.Dialog", corePreferencePanel)
val corePreferenceHeaderPanel = WidgetStyleDefinition("PreferenceHeaderPanel", null, CoreViewStyleable::class)
val corePreferenceHeaderList = WidgetStyleDefinition("PreferenceHeaderList", null, CoreViewStyleable::class)
val corePreferenceFragmentList = WidgetStyleDefinition("PreferenceFragmentList", null, CoreViewStyleable::class)

val coreTheme = ThemeDefinition("Theme", null, true)
val coreTheme_Dialog = ThemeDefinition("Theme.Dialog", coreTheme, true)
val coreTheme_Light = ThemeDefinition("Theme.Light", coreTheme, true)
val coreTheme_Dialog_Alert = ThemeDefinition("Theme.Dialog.Alert", coreTheme_Dialog, true)

fun initializeCoreDictionaryBase() {

    coreWindowTitle.styles["textAppearance"] = coreTextAppearance_WindowTitle

    coreDialogWindowTitle.styles["textAppearance"] = coreTextAppearance_DialogWindowTitle

    coreTheme_Dialog.styles["windowTitleStyle"] = coreDialogWindowTitle
    coreTheme_Dialog.styles["windowAnimationStyle"] = coreAnimation_Dialog
    coreTheme_Dialog.styles["textAppearance"] = coreTextAppearance
    coreTheme_Dialog.styles["textAppearanceInverse"] = coreTextAppearance_Inverse
    coreTheme_Dialog.styles["textAppearanceLarge"] = coreTextAppearance_Large
    coreTheme_Dialog.styles["textAppearanceMedium"] = coreTextAppearance_Medium
    coreTheme_Dialog.styles["textAppearanceSmall"] = coreTextAppearance_Small
    coreTheme_Dialog.styles["textAppearanceLargeInverse"] = coreTextAppearance_Large_Inverse
    coreTheme_Dialog.styles["textAppearanceMediumInverse"] = coreTextAppearance_Medium_Inverse
    coreTheme_Dialog.styles["textAppearanceSmallInverse"] = coreTextAppearance_Small_Inverse
    coreTheme_Dialog.styles["preferencePanelStyle"] = corePreferencePanel_Dialog

    coreTheme.styles["textAppearance"] = coreTextAppearance
    coreTheme.styles["textAppearanceInverse"] = coreTextAppearance_Inverse
    coreTheme.styles["textAppearanceLarge"] = coreTextAppearance_Large
    coreTheme.styles["textAppearanceMedium"] = coreTextAppearance_Medium
    coreTheme.styles["textAppearanceSmall"] = coreTextAppearance_Small
    coreTheme.styles["textAppearanceLargeInverse"] = coreTextAppearance_Large_Inverse
    coreTheme.styles["textAppearanceMediumInverse"] = coreTextAppearance_Medium_Inverse
    coreTheme.styles["textAppearanceSmallInverse"] = coreTextAppearance_Small_Inverse
    coreTheme.styles["textAppearanceSearchResultTitle"] = coreTextAppearance_SearchResult_Title
    coreTheme.styles["textAppearanceSearchResultSubtitle"] = coreTextAppearance_SearchResult_Subtitle
    coreTheme.styles["textAppearanceEasyCorrectSuggestion"] = coreTextAppearance_EasyCorrectSuggestion
    coreTheme.styles["textAppearanceMisspelledSuggestion"] = coreTextAppearance_MisspelledSuggestion
    coreTheme.styles["textAppearanceAutoCorrectionSuggestion"] = coreTextAppearance_AutoCorrectionSuggestion
    coreTheme.styles["textAppearanceButton"] = coreTextAppearance_Widget_Button
    coreTheme.styles["textAppearanceLargePopupMenu"] = coreTextAppearance_Widget_PopupMenu_Large
    coreTheme.styles["textAppearanceSmallPopupMenu"] = coreTextAppearance_Widget_PopupMenu_Small

    coreWidget_Button.attrRedirectionStyles["textAppearance"] = "textAppearanceSmallInverse"
    coreWidget_Button_Transparent.attrRedirectionStyles["textAppearance"] = "textAppearanceSmall"
    coreWidget_CompoundButton.attrRedirectionStyles["textAppearance"] = "textAppearance"
    coreWidget_TextView.attrRedirectionStyles["textAppearance"] = "textAppearanceSmall"
    coreWidget_AbsListView.attrRedirectionStyles["fastScrollStyle"] = "fastScrollStyle"

    coreWidget_CalendarView.styles["weekDayTextAppearance"] = coreTextAppearance_Small_CalendarViewWeekDayView
    coreWidget_CalendarView.attrRedirectionStyles["dateTextAppearance"] = "textAppearanceSmall"

    coreWidget_PopupWindow.styles["popupAnimationStyle"] = coreAnimation_PopupWindow
    coreWidget_WebTextView.styles["textAppearance"] = coreTextAppearance_Large_Inverse
    coreWidget_TabWidget.styles["textAppearance"] = coreTextAppearance_Widget_TabWidget
    coreWidget_DropDownItem.styles["textAppearance"] = coreTextAppearance_Widget_DropDownItem

    coreWidget_ActionBar.styles["titleTextStyle"] = coreTextAppearance_Widget_ActionBar_Title
    coreWidget_ActionBar.styles["subtitleTextStyle"] = coreTextAppearance_Widget_ActionBar_Subtitle
    coreWidget_ActionBar.styles["progressBarStyle"] = coreWidget_ProgressBar_Horizontal
    coreWidget_ActionBar.styles["indeterminateProgressStyle"] = coreWidget_ProgressBar_Small

    coreWidget_ActionMode.styles["titleTextStyle"] = coreTextAppearance_Widget_ActionMode_Title
    coreWidget_ActionMode.styles["subtitleTextStyle"] = coreTextAppearance_Widget_ActionMode_Subtitle

    coreWidget_Toolbar.styles["titleTextStyle"] = coreTextAppearance_Widget_Toolbar_Title
    coreWidget_Toolbar.styles["subtitleTextStyle"] = coreTextAppearance_Widget_Toolbar_Subtitle
    coreWidget_Toolbar.styles["navigationButtonStyle"] = coreWidget_Toolbar_Button_Navigation

    coreWidget_ActionBar_TabText.styles["textAppearance"] = coreTextAppearance_Widget_TextView_PopupMenu

    coreWidget_TextView_PopupMenu.styles["textAppearance"] = coreTextAppearance_Widget_TextView_PopupMenu
    coreWidget_TextView_SpinnerItem.styles["textAppearance"] = coreTextAppearance_Widget_TextView_SpinnerItem

    // Button styles
    coreTheme.styles["buttonStyle"] = coreWidget_Button
    coreTheme.styles["buttonStyleSmall"] = coreWidget_Button_Small
    coreTheme.styles["buttonStyleInset"] = coreWidget_Button_Inset
    coreTheme.styles["buttonStyleToggle"] = coreWidget_Button_Toggle
    coreTheme.styles["switchStyle"] = coreWidget_CompoundButton_Switch
    coreTheme.attrRedirectionStyles["borderlessButtonStyle"] = "buttonStyle"

    // List attributes
    coreTheme.attrRedirectionStyles["textAppearanceListItem"] = "textAppearanceLarge"
    coreTheme.attrRedirectionStyles["textAppearanceListItemSmall"] = "textAppearanceLarge"
    coreTheme.attrRedirectionStyles["textAppearanceListItemSecondary"] = "textAppearanceSmall"
    coreTheme.styles["listSeparatorTextViewStyle"] = coreWidget_TextView_ListSeparator

    // Window attributes
    coreTheme.styles["windowTitleStyle"] = coreWindowTitle
    coreTheme.styles["windowTitleBackgroundStyle"] = coreWindowTitleBackground
    coreTheme.styles["windowAnimationStyle"] = coreAnimation_Activity

    // Dialog attributes
    coreTheme.styles["dialogTheme"] = coreTheme_Dialog

    //  AlertDialog attributes
    coreTheme.styles["alertDialogTheme"] = coreTheme_Dialog_Alert
    coreTheme.styles["alertDialogStyle"] = coreAlertDialog

    // Text selection handle attributes
    coreTheme.styles["textSelectHandleWindowStyle"] = coreWidget_TextSelectHandle

    // Widget styles
    coreTheme.styles["absListViewStyle"] = coreWidget_AbsListView
    coreTheme.styles["autoCompleteTextViewStyle"] = coreWidget_AutoCompleteTextView
    coreTheme.styles["checkboxStyle"] = coreWidget_CompoundButton_CheckBox
    coreTheme.styles["checkedTextViewStyle"] = coreWidget_CheckedTextView
    coreTheme.styles["dropDownListViewStyle"] = coreWidget_ListView_DropDown
    coreTheme.styles["editTextStyle"] = coreWidget_EditText
    coreTheme.styles["expandableListViewStyle"] = coreWidget_ExpandableListView
    coreTheme.styles["expandableListViewWhiteStyle"] = coreWidget_ExpandableListView_White
    coreTheme.styles["fastScrollStyle"] = coreWidget_FastScroll
    coreTheme.styles["galleryStyle"] = coreWidget_Gallery
    coreTheme.styles["gestureOverlayViewStyle"] = coreWidget_GestureOverlayView
    coreTheme.styles["gridViewStyle"] = coreWidget_GridView
    coreTheme.styles["imageButtonStyle"] = coreWidget_ImageButton
    coreTheme.styles["imageWellStyle"] = coreWidget_ImageWell
    coreTheme.styles["listViewStyle"] = coreWidget_ListView
    coreTheme.styles["listViewWhiteStyle"] = coreWidget_ListView_White
    coreTheme.styles["popupWindowStyle"] = coreWidget_PopupWindow
    coreTheme.styles["progressBarStyle"] = coreWidget_ProgressBar
    coreTheme.styles["progressBarStyleHorizontal"] = coreWidget_ProgressBar_Horizontal
    coreTheme.styles["progressBarStyleSmall"] = coreWidget_ProgressBar_Small
    coreTheme.styles["progressBarStyleSmallTitle"] = coreWidget_ProgressBar_Small_Title
    coreTheme.styles["progressBarStyleLarge"] = coreWidget_ProgressBar_Large
    coreTheme.styles["progressBarStyleInverse"] = coreWidget_ProgressBar_Inverse
    coreTheme.styles["progressBarStyleSmallInverse"] = coreWidget_ProgressBar_Small_Inverse
    coreTheme.styles["progressBarStyleLargeInverse"] = coreWidget_ProgressBar_Large_Inverse
    coreTheme.styles["seekBarStyle"] = coreWidget_SeekBar
    coreTheme.styles["ratingBarStyle"] = coreWidget_RatingBar
    coreTheme.styles["ratingBarStyleIndicator"] = coreWidget_RatingBar_Indicator
    coreTheme.styles["ratingBarStyleSmall"] = coreWidget_RatingBar_Small
    coreTheme.styles["radioButtonStyle"] = coreWidget_CompoundButton_RadioButton
    coreTheme.styles["scrollViewStyle"] = coreWidget_ScrollView
    coreTheme.styles["horizontalScrollViewStyle"] = coreWidget_HorizontalScrollView
    coreTheme.styles["spinnerStyle"] = coreWidget_Spinner
    coreTheme.styles["dropDownSpinnerStyle"] = coreWidget_Spinner_DropDown
    coreTheme.styles["starStyle"] = coreWidget_CompoundButton_Star
    coreTheme.styles["tabWidgetStyle"] = coreWidget_TabWidget
    coreTheme.styles["textViewStyle"] = coreWidget_TextView
    coreTheme.styles["webTextViewStyle"] = coreWidget_WebTextView
    coreTheme.styles["webViewStyle"] = coreWidget_WebView
    coreTheme.styles["dropDownItemStyle"] = coreWidget_DropDownItem
    coreTheme.styles["spinnerDropDownItemStyle"] = coreWidget_DropDownItem_Spinner
    coreTheme.styles["spinnerItemStyle"] = coreTextAppearance_Widget_TextView_SpinnerItem
    coreTheme.styles["dropDownHintAppearance"] = coreTextAppearance_Widget_DropDownHint
    coreTheme.styles["keyboardViewStyle"] = coreWidget_KeyboardView
    coreTheme.styles["quickContactBadgeStyleWindowSmall"] = coreWidget_QuickContactBadge_WindowSmall
    coreTheme.styles["quickContactBadgeStyleWindowMedium"] = coreWidget_QuickContactBadge_WindowMedium
    coreTheme.styles["quickContactBadgeStyleWindowLarge"] = coreWidget_QuickContactBadge_WindowLarge
    coreTheme.styles["quickContactBadgeStyleSmallWindowSmall"] = coreWidget_QuickContactBadgeSmall_WindowSmall
    coreTheme.styles["quickContactBadgeStyleSmallWindowMedium"] = coreWidget_QuickContactBadgeSmall_WindowMedium
    coreTheme.styles["quickContactBadgeStyleSmallWindowLarge"] = coreWidget_QuickContactBadgeSmall_WindowLarge
    coreTheme.styles["listPopupWindowStyle"] = coreWidget_ListPopupWindow
    coreTheme.styles["popupMenuStyle"] = coreWidget_PopupMenu
    coreTheme.styles["activityChooserViewStyle"] = coreWidget_ActivityChooserView
    // TODO
    //    <item name="mediaRouteButtonStyle">@style/Widget.DeviceDefault.MediaRouteButton</item>
    coreTheme.styles["fragmentBreadCrumbsStyle"] = coreWidget_FragmentBreadCrumbs
    coreTheme.styles["fragmentBreadCrumbsStyle"] = coreWidget_FragmentBreadCrumbs
    coreTheme.attrRedirectionStyles["contextPopupMenuStyle"] = "popupMenuStyle"

    // Preference styles
    coreTheme.styles["preferenceScreenStyle"] = corePreference_PreferenceScreen
    coreTheme.styles["preferenceActivityStyle"] = corePreferenceActivity
    coreTheme.styles["preferenceFragmentStyle"] = corePreferenceFragment
    coreTheme.styles["preferenceCategoryStyle"] = corePreference_Category
    coreTheme.styles["preferenceStyle"] = corePreference
    coreTheme.styles["preferenceInformationStyle"] = corePreference_Information
    coreTheme.styles["checkBoxPreferenceStyle"] = corePreference_CheckBoxPreference
    coreTheme.styles["switchPreferenceStyle"] = corePreference_SwitchPreference
    coreTheme.styles["seekBarPreferenceStyle"] = corePreference_SeekBarPreference
    coreTheme.styles["yesNoPreferenceStyle"] = corePreference_DialogPreference_YesNoPreference
    coreTheme.styles["dialogPreferenceStyle"] = corePreference_DialogPreference
    coreTheme.styles["seekBarDialogPreferenceStyle"] = corePreference_DialogPreference_SeekBarPreference
    coreTheme.styles["editTextPreferenceStyle"] = corePreference_DialogPreference_EditTextPreference
    coreTheme.styles["ringtonePreferenceStyle"] = corePreference_RingtonePreference
    coreTheme.styles["preferencePanelStyle"] = corePreferencePanel
    coreTheme.styles["preferenceHeaderPanelStyle"] = corePreferenceHeaderPanel
    coreTheme.styles["preferenceListStyle"] = corePreferenceHeaderList
    coreTheme.styles["preferenceFragmentListStyle"] = corePreferenceFragment

    // Action bar styles
    coreTheme.styles["actionDropDownStyle"] = coreWidget_Spinner_DropDown
    coreTheme.styles["actionButtonStyle"] = coreWidget_ActionButton
    coreTheme.styles["actionOverflowButtonStyle"] = coreWidget_ActionButton_Overflow
    coreTheme.attrRedirectionStyles["actionOverflowMenuStyle"] = "popupMenuStyle"
    coreTheme.styles["actionBarTabStyle"] = coreWidget_ActionBar_TabView
    coreTheme.styles["actionBarTabBarStyle"] = coreWidget_ActionBar_TabBar
    coreTheme.styles["actionBarTabTextStyle"] = coreWidget_ActionBar_TabText
    coreTheme.styles["actionModeStyle"] = coreWidget_ActionMode
    coreTheme.styles["actionModeCloseButtonStyle"] = coreWidget_ActionButton_CloseMode
    coreTheme.styles["actionBarStyle"] = coreWidget_ActionBar
    coreTheme.attrRedirectionStyles["actionBarSplitStyle"] = "actionBarStyle"
    coreTheme.attrRedirectionStyles["actionModePopupWindowStyle"] = "popupWindowStyle"
    coreTheme.styles["actionMenuTextAppearance"] = coreTextAppearance_Holo_Widget_ActionBar_Menu
    coreTheme.nullStyles.add("actionBarWidgetTheme")
    coreTheme.nullStyles.add("actionBarPopupTheme")
    coreTheme.nullStyles.add("actionBarTheme")
    coreTheme.styles["toolbarStyle"] = coreWidget_Toolbar
    coreTheme.styles["buttonBarStyle"] = coreButtonBar
    coreTheme.attrRedirectionStyles["buttonBarButtonStyle"] = "buttonStyle"
    coreTheme.attrRedirectionStyles["buttonBarPositiveButtonStyle"] = "buttonBarButtonStyle"
    coreTheme.attrRedirectionStyles["buttonBarNegativeButtonStyle"] = "buttonBarButtonStyle"
    coreTheme.attrRedirectionStyles["buttonBarNeutralButtonStyle"] = "buttonBarButtonStyle"
    coreTheme.styles["segmentedButtonStyle"] = coreSegmentedButton

    // SearchView attributes
    coreTheme.styles["searchViewStyle"] = coreWidget_Holo_SearchView
    // TODO
    //    <item name="searchDialogTheme">@style/Theme.SearchBar</item>

    //  PreferenceFrameLayout attributes
    coreTheme.styles["preferenceFrameLayoutStyle"] = coreWidget_PreferenceFrameLayout

    coreTheme.styles["numberPickerStyle"] = coreWidget_NumberPicker
    coreTheme.styles["calendarViewStyle"] = coreWidget_CalendarView
    coreTheme.styles["timePickerStyle"] = coreWidget_TimePicker
    coreTheme.attrRedirectionStyles["timePickerDialogTheme"] = "alertDialogTheme"
    coreTheme.styles["datePickerStyle"] = coreWidget_DatePicker
    coreTheme.attrRedirectionStyles["datePickerDialogTheme"] = "alertDialogTheme"

    // Variant of {@link #Theme} with no title bar
    val coreTheme_NoTitleBar = ThemeDefinition("Theme.NoTitleBar", coreTheme, true)

    // Variant of {@link #Theme} that has no title bar and no status bar.  This theme
    // sets {@link android.R.attr#windowFullscreen} to true.
    val coreTheme_NoTitleBar_Fullscreen = ThemeDefinition("Theme.NoTitleBar.Fullscreen", coreTheme_NoTitleBar, true)

    // No title bar, but Action Mode bars will overlay application content
    // instead of pushing it down to make room.
    val coreTheme_NoTitleBar_OverlayActionModes = ThemeDefinition("Theme.NoTitleBar.OverlayActionModes", coreTheme_NoTitleBar, true)

    // Default theme with an Action Bar.
    val coreTheme_WithActionBar = ThemeDefinition("Theme.WithActionBar", coreTheme, true)

    // Theme for a light background with dark text on top.  Set your activity
    // to this theme if you would like such an appearance.  As with the
    // default theme, you should try to assume little more than that the
    // background will be a light color.
    // This is designed for API level 10 and lower.
    coreTheme_Light.styles["popupWindowStyle"] = coreWidget_PopupWindow
    coreTheme_Light.styles["gestureOverlayViewStyle"] = coreWidget_GestureOverlayView_White
    coreTheme_Light.styles["expandableListViewStyle"] = coreWidget_ExpandableListView_White
    coreTheme_Light.styles["listViewStyle"] = coreWidget_ListView_White
    coreTheme_Light.styles["listSeparatorTextViewStyle"] = coreWidget_TextView_ListSeparator_White
    coreTheme_Light.styles["progressBarStyle"] = coreWidget_ProgressBar_Inverse
    coreTheme_Light.styles["progressBarStyleSmall"] = coreWidget_ProgressBar_Small_Inverse
    coreTheme_Light.styles["progressBarStyleLarge"] = coreWidget_ProgressBar_Large_Inverse
    coreTheme_Light.styles["progressBarStyleInverse"] = coreWidget_ProgressBar
    coreTheme_Light.styles["progressBarStyleSmallInverse"] = coreWidget_ProgressBar_Small
    coreTheme_Light.styles["progressBarStyleLargeInverse"] = coreWidget_ProgressBar_Large
    coreTheme_Light.styles["searchViewStyle"] = coreWidget_Holo_Light_SearchView
    // TODO
    //coreTheme.styles["mediaRouteButtonStyle"] = coreWidgetPopupWindowStyle
    //<item name="mediaRouteButtonStyle">@style/Widget.DeviceDefault.Light.MediaRouteButton</item>

    // Variant of {@link #Theme_Light} with no title bar
    val coreTheme_Light_NoTitleBar = ThemeDefinition("Theme.Light.NoTitleBar", coreTheme_Light, true)

    // Variant of {@link #Theme_Light} that has no title bar and
    // no status bar.  This theme sets {@link android.R.attr#windowFullscreen} to true.
    val coreTheme_Light_NoTitleBar_Fullscreen = ThemeDefinition("Theme.Light.NoTitleBar.Fullscreen", coreTheme_Light_NoTitleBar, true)

    // Variant on {@link #Theme} that ensures the background is
    // completely black.  This is useful for things like image viewers and
    // media players.   If you want the normal (dark background) theme
    // do <em>not</em> use this, use {@link #Theme}.
    val coreTheme_Black = ThemeDefinition("Theme.Black", coreTheme, true)

    // Variant of {@link #Theme_Black} with no title bar
    val coreTheme_Black_NoTitleBar = ThemeDefinition("Theme.Black.NoTitleBar", coreTheme_Black, true)

    // Variant of {@link #Theme_Black} that has no title bar and
    // no status bar.  This theme sets {@link android.R.attr#windowFullscreen} to true.
    val coreTheme_Black_NoTitleBar_Fullscreen = ThemeDefinition("Theme.Black.NoTitleBar.Fullscreen", coreTheme_Black_NoTitleBar, true)

    // Theme for windows that want to have the user's selected
    // wallpaper appear behind them (for API level 10 and lower).
    val coreTheme_Wallpaper = ThemeDefinition("Theme.Wallpaper", coreTheme, true)

    // Variant of {@link #Theme_Wallpaper} that has no title bar
    val coreTheme_Wallpaper_NoTitleBar = ThemeDefinition("Theme.Wallpaper.NoTitleBar", coreTheme_Wallpaper, true)

    // Variant of {@link #Theme_Wallpaper} that has no title bar or status bar.
    val coreTheme_Wallpaper_NoTitleBar_Fullscreen = ThemeDefinition("Theme.Wallpaper.NoTitleBar.Fullscreen", coreTheme_Wallpaper_NoTitleBar, true)

    // Theme for a wallpaper's setting activity, which is designed to be a transparent
    // background with a dark shade, so the previous Activity is visible in the background.
    val coreTheme_WallpaperSettings = ThemeDefinition("Theme.WallpaperSettings", coreTheme, true)
    coreTheme_WallpaperSettings.styles["windowAnimationStyle"] = coreAnimation_Translucent

    // Theme for a wallpaper's setting activity, which is designed to be a transparent
    // background with a light shade, so the previous Activity is visible in the background.
    val coreTheme_Light_WallpaperSettings = ThemeDefinition("Theme.Light.WallpaperSettings", coreTheme_Light, true)
    coreTheme_Light_WallpaperSettings.styles["windowAnimationStyle"] = coreAnimation_Translucent

    // Theme for translucent activities (on API level 10 and lower). That is, windows
    // that allow you to see through them to the windows behind.  This sets up the translucent
    // flag and appropriate animations for your windows.
    val coreTheme_Translucent = ThemeDefinition("Theme.Translucent", coreTheme, true)
    coreTheme_Translucent.styles["windowAnimationStyle"] = coreAnimation

    // Variant of {@link #Theme_Translucent} with no title bar
    val coreTheme_Translucent_NoTitleBar = ThemeDefinition("Theme.Translucent.NoTitleBar", coreTheme_Translucent, true)

    // Variant of {@link #Theme_Translucent} that has no title bar and
    // no status bar
    val coreTheme_Translucent_NoTitleBar_Fullscreen = ThemeDefinition("Theme.Translucent.NoTitleBar.Fullscreen", coreTheme_Translucent_NoTitleBar, true)

    // Default theme for activities that don't actually display a UI; that
    // is, they finish themselves before being resumed.
    val coreTheme_NoDisplay = ThemeDefinition("Theme.NoDisplay", coreTheme, true)
    coreTheme_NoDisplay.nullStyles.add("windowAnimationStyle")

    // Default theme for dialog windows and activities (on API level 10 and lower),
    // which is used by the {@link android.app.Dialog} class.  This changes the window to be
    // floating (not fill the entire screen), and puts a frame around its
    // contents.  You can set this theme on an activity if you would like to
    // make an activity that looks like a Dialog.
    val coreTheme_Dialog = ThemeDefinition("Theme.Dialog", coreTheme, true)
    coreTheme_Dialog.styles["windowTitleStyle"] = coreDialogWindowTitle
    coreTheme_Dialog.styles["windowAnimationStyle"] = coreAnimation_Dialog
    coreTheme_Dialog.styles["textAppearance"] = coreTextAppearance
    coreTheme_Dialog.styles["textAppearanceInverse"] = coreTextAppearance_Inverse
    coreTheme_Dialog.styles["textAppearanceLarge"] = coreTextAppearance_Large
    coreTheme_Dialog.styles["textAppearanceMedium"] = coreTextAppearance_Medium
    coreTheme_Dialog.styles["textAppearanceSmall"] = coreTextAppearance_Small
    coreTheme_Dialog.styles["textAppearanceLargeInverse"] = coreTextAppearance_Large_Inverse
    coreTheme_Dialog.styles["textAppearanceMediumInverse"] = coreTextAppearance_Medium_Inverse
    coreTheme_Dialog.styles["textAppearanceSmallInverse"] = coreTextAppearance_Small_Inverse
    coreTheme_Dialog.styles["preferencePanelStyle"] = corePreferencePanel_Dialog

    // Variant of {@link Theme_Dialog} that does not include a frame (or background).
    // The view hierarchy of the dialog is responsible for drawing all of
    // its pixels.
    val coreTheme_Dialog_NoFrame = ThemeDefinition("Theme.Dialog.NoFrame", coreTheme_Dialog, true)
    coreTheme_Dialog_NoFrame.nullStyles.add("windowAnimationStyle")

    // Default theme for alert dialog windows (on API level 10 and lower), which is used by the
    // {@link android.app.AlertDialog} class.  This is basically a dialog
    // but sets the background to empty so it can do two-tone backgrounds.
    coreTheme_Dialog_Alert.styles["windowTitleStyle"] = coreDialogWindowTitle
    coreTheme_Dialog_Alert.styles["itemTextAppearance"] = coreTextAppearance_Large_Inverse
    coreTheme_Dialog_Alert.styles["textAppearanceListItem"] = coreTextAppearance_Large_Inverse
    coreTheme_Dialog_Alert.styles["textAppearanceListItemSmall"] = coreTextAppearance_Large_Inverse
    coreTheme_Dialog_Alert.styles["textAppearanceListItemSecondary"] = coreTextAppearance_Small_Inverse

    // Default dark theme for panel windows (on API level 10 and lower).  This removes all
    // extraneous window decorations, so you basically have an empty rectangle in which
    // to place your content.  It makes the window floating, with a transparent
    // background, and turns off dimming behind the window.
    val coreTheme_Panel = ThemeDefinition("Theme.Panel", coreTheme, true)
    coreTheme_Panel.nullStyles.add("windowAnimationStyle")

    // Default light theme for panel windows (on API level 10 and lower).  This removes all
    // extraneous window decorations, so you basically have an empty rectangle in which
    // to place your content.  It makes the window floating, with a transparent
    // background, and turns off dimming behind the window.
    val coreTheme_Light_Panel = ThemeDefinition("Theme.Light.Panel", coreTheme_Light, true)
    coreTheme_Light_Panel.nullStyles.add("windowAnimationStyle")

    // Default theme for input methods (on API level 10 and lower), which is used by the
    // {@link android.inputmethodservice.InputMethodService} class.
    // this inherits from Theme.Panel, but sets up IME appropriate animations
    // and a few custom attributes.
    val coreTheme_InputMethod = ThemeDefinition("Theme.InputMethod", coreTheme_Panel, true)
    coreTheme_InputMethod.styles["windowAnimationStyle"] = coreAnimation_InputMethod

    // Add all the themes to the dictionary
    ThemeDictionary.putThemeDefinition("", coreTheme)
    ThemeDictionary.putThemeDefinition("", coreTheme_NoTitleBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_NoTitleBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_NoTitleBar_OverlayActionModes)
    ThemeDictionary.putThemeDefinition("", coreTheme_NoDisplay)
    ThemeDictionary.putThemeDefinition("", coreTheme_Black)
    ThemeDictionary.putThemeDefinition("", coreTheme_Black_NoTitleBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_Black_NoTitleBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_Light)
    ThemeDictionary.putThemeDefinition("", coreTheme_Light_NoTitleBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_Light_NoTitleBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_Dialog)
    ThemeDictionary.putThemeDefinition("", coreTheme_InputMethod)
    ThemeDictionary.putThemeDefinition("", coreTheme_Light_Panel)
    ThemeDictionary.putThemeDefinition("", coreTheme_Wallpaper)
    ThemeDictionary.putThemeDefinition("", coreTheme_Wallpaper_NoTitleBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_Wallpaper_NoTitleBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_WallpaperSettings)
    ThemeDictionary.putThemeDefinition("", coreTheme_Light_WallpaperSettings)
    ThemeDictionary.putThemeDefinition("", coreTheme_Translucent)
    ThemeDictionary.putThemeDefinition("", coreTheme_Translucent_NoTitleBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_Translucent_NoTitleBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_WithActionBar)
}
