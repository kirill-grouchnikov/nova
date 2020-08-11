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

import dev.android.playground.nova.core.base.*

fun initializeCoreDictionaryDeviceDefault() {
    // Text Appearance Styles
    val coreTextAppearance_DeviceDefault = WidgetStyleDefinition("TextAppearance.DeviceDefault", coreTextAppearance_Material)
    val coreTextAppearance_DeviceDefault_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Inverse", coreTextAppearance_Material_Inverse)
    val coreTextAppearance_DeviceDefault_Large = WidgetStyleDefinition("TextAppearance.DeviceDefault.Large", coreTextAppearance_Material_Large)
    val coreTextAppearance_DeviceDefault_Large_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Large.Inverse", coreTextAppearance_Material_Large_Inverse)
    val coreTextAppearance_DeviceDefault_Medium = WidgetStyleDefinition("TextAppearance.DeviceDefault.Medium", coreTextAppearance_Material_Medium)
    val coreTextAppearance_DeviceDefault_Medium_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Medium.Inverse", coreTextAppearance_Material_Medium_Inverse)
    val coreTextAppearance_DeviceDefault_Small = WidgetStyleDefinition("TextAppearance.DeviceDefault.Small", coreTextAppearance_Material_Small)
    val coreTextAppearance_DeviceDefault_Small_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Small.Inverse", coreTextAppearance_Material_Small_Inverse)
    val coreTextAppearance_DeviceDefault_SearchResult_Title = WidgetStyleDefinition("TextAppearance.DeviceDefault.SearchResult.Title", coreTextAppearance_Material_SearchResult_Title)
    val coreTextAppearance_DeviceDefault_SearchResult_Subtitle = WidgetStyleDefinition("TextAppearance.DeviceDefault.SearchResult.Subtitle", coreTextAppearance_Material_SearchResult_Subtitle)
    val coreTextAppearance_DeviceDefault_Widget = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget", coreTextAppearance_Material_Widget)
    val coreTextAppearance_DeviceDefault_Widget_Button = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.Button", coreTextAppearance_Material_Widget_Button)
    val coreTextAppearance_DeviceDefault_Widget_IconMenu_Item = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.IconMenu.Item", coreTextAppearance_Material_Widget_IconMenu_Item)
    val coreTextAppearance_DeviceDefault_Widget_TabWidget = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.TabWidget", coreTextAppearance_Material_Widget_TabWidget)
    val coreTextAppearance_DeviceDefault_Widget_TextView = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.TextView", coreTextAppearance_Material_Widget_TextView)
    val coreTextAppearance_DeviceDefault_Widget_TextView_PopupMenu = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.TextView.PopupMenu", coreTextAppearance_Material_Widget_TextView_PopupMenu)
    val coreTextAppearance_DeviceDefault_Widget_DropDownHint = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.DropDownHint", coreTextAppearance_Material_Widget_DropDownHint)
    val coreTextAppearance_DeviceDefault_Widget_DropDownItem = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.DropDownItem", coreTextAppearance_Material_Widget_DropDownItem)
    val coreTextAppearance_DeviceDefault_Widget_TextView_SpinnerItem = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.TextView.SpinnerItem", coreTextAppearance_Material_Widget_TextView_SpinnerItem)
    val coreTextAppearance_DeviceDefault_Widget_EditText = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.EditText", coreTextAppearance_Material_Widget_EditText)
    val coreTextAppearance_DeviceDefault_Widget_Button_Borderless_Colored = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.Button.Borderless.Colored", coreTextAppearance_DeviceDefault_Widget_Button)
    val coreTextAppearance_DeviceDefault_Widget_PopupMenu = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.PopupMenu", coreTextAppearance_Material_Widget_PopupMenu)
    val coreTextAppearance_DeviceDefault_Widget_PopupMenu_Large = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.PopupMenu.Large", coreTextAppearance_Material_Widget_PopupMenu_Large)
    val coreTextAppearance_DeviceDefault_Widget_PopupMenu_Small = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.PopupMenu.Small", coreTextAppearance_Material_Widget_PopupMenu_Small)
    val coreTextAppearance_DeviceDefault_Widget_ActionBar_Title = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionBar.Title", coreTextAppearance_Material_Widget_ActionBar_Title_Inverse)
    val coreTextAppearance_DeviceDefault_Widget_ActionBar_Subtitle = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionBar.Subtitle", coreTextAppearance_Material_Widget_ActionBar_Subtitle)
    val coreTextAppearance_DeviceDefault_Widget_ActionMode_Title = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionMode.Title", coreTextAppearance_Material_Widget_ActionMode_Title)
    val coreTextAppearance_DeviceDefault_Widget_ActionMode_Subtitle = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionMode.Subtitle", coreTextAppearance_Material_Widget_ActionMode_Subtitle)
    val coreTextAppearance_DeviceDefault_WindowTitle = WidgetStyleDefinition("TextAppearance.DeviceDefault.WindowTitle", coreTextAppearance_Material_WindowTitle)
    val coreTextAppearance_DeviceDefault_DialogWindowTitle = WidgetStyleDefinition("TextAppearance.DeviceDefault.DialogWindowTitle", coreTextAppearance_Material_DialogWindowTitle)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreTextAppearance_DeviceDefault_Widget_ActionBar_Title_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionBar.Title.Inverse", coreTextAppearance_Material_Widget_ActionBar_Title_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreTextAppearance_DeviceDefault_Widget_ActionBar_Subtitle_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionBar.Subtitle.Inverse", coreTextAppearance_Material_Widget_ActionBar_Subtitle_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreTextAppearance_DeviceDefault_Widget_ActionMode_Title_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionMode.Title.Inverse", coreTextAppearance_Material_Widget_ActionMode_Title_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreTextAppearance_DeviceDefault_Widget_ActionMode_Subtitle_Inverse = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionMode.Subtitle.Inverse", coreTextAppearance_Material_Widget_ActionMode_Subtitle_Inverse)
    val coreTextAppearance_DeviceDefault_Widget_ActionBar_Menu = WidgetStyleDefinition("TextAppearance.DeviceDefault.Widget.ActionBar.Menu", coreTextAppearance_Material_Widget_ActionBar_Menu)

    val coreWidget_DeviceDefault = WidgetStyleDefinition("Widget.DeviceDefault", coreWidget_Material)
    val coreWidget_DeviceDefault_Button = WidgetStyleDefinition("Widget.DeviceDefault.Button", coreWidget_Material_Button)
    val coreWidget_DeviceDefault_Button_Small = WidgetStyleDefinition("Widget.DeviceDefault.Button.Small", coreWidget_Material_Button_Small)
    val coreWidget_DeviceDefault_Button_Inset = WidgetStyleDefinition("Widget.DeviceDefault.Button.Inset", coreWidget_Material_Button_Inset)
    val coreWidget_DeviceDefault_Button_Toggle = WidgetStyleDefinition("Widget.DeviceDefault.Button.Toggle", coreWidget_Material_Button_Toggle)

    val coreWidget_DeviceDefault_Button_Colored = WidgetStyleDefinition("Widget.DeviceDefault.Button.Colored", coreWidget_Material_Button_Colored)
    coreWidget_DeviceDefault_Button_Colored.attrRedirectionStyles["textAppearance"] = "textAppearanceButton"

    val coreWidget_DeviceDefault_TextView = WidgetStyleDefinition("Widget.DeviceDefault.TextView", coreWidget_Material_TextView)
    val coreWidget_DeviceDefault_CheckedTextView = WidgetStyleDefinition("Widget.DeviceDefault.CheckedTextView", coreWidget_Material_CheckedTextView)
    val coreWidget_DeviceDefault_AutoCompleteTextView = WidgetStyleDefinition("Widget.DeviceDefault.AutoCompleteTextView", coreWidget_Material_AutoCompleteTextView)
    val coreWidget_DeviceDefault_CompoundButton_CheckBox = WidgetStyleDefinition("Widget.DeviceDefault.CompoundButton.CheckBox", coreWidget_Material_CompoundButton_CheckBox)
    val coreWidget_DeviceDefault_ListView_DropDown = WidgetStyleDefinition("Widget.DeviceDefault.ListView.DropDown", coreWidget_Material_ListView_DropDown)
    val coreWidget_DeviceDefault_EditText = WidgetStyleDefinition("Widget.DeviceDefault.EditText", coreWidget_Material_EditText)
    val coreWidget_DeviceDefault_ExpandableListView = WidgetStyleDefinition("Widget.DeviceDefault.ExpandableListView", coreWidget_Material_ExpandableListView)
    val coreWidget_DeviceDefault_GridView = WidgetStyleDefinition("Widget.DeviceDefault.GridView", coreWidget_Material_GridView)
    val coreWidget_DeviceDefault_ImageButton = WidgetStyleDefinition("Widget.DeviceDefault.ImageButton", coreWidget_Material_ImageButton)
    val coreWidget_DeviceDefault_ListView = WidgetStyleDefinition("Widget.DeviceDefault.ListView", coreWidget_Material_ListView)
    val coreWidget_DeviceDefault_PopupWindow = WidgetStyleDefinition("Widget.DeviceDefault.PopupWindow", coreWidget_Material_PopupWindow)
    val coreWidget_DeviceDefault_ProgressBar = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar", coreWidget_Material_ProgressBar)
    val coreWidget_DeviceDefault_ProgressBar_Horizontal = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Horizontal", coreWidget_Material_ProgressBar_Horizontal)
    val coreWidget_DeviceDefault_ProgressBar_Small = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Small", coreWidget_Material_ProgressBar_Small)
    val coreWidget_DeviceDefault_ProgressBar_Small_Title = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Small.Title", coreWidget_Material_ProgressBar_Small_Title)
    val coreWidget_DeviceDefault_ProgressBar_Large = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Large", coreWidget_Material_ProgressBar_Large)
    val coreWidget_DeviceDefault_SeekBar = WidgetStyleDefinition("Widget.DeviceDefault.SeekBar", coreWidget_Material_SeekBar)
    val coreWidget_DeviceDefault_RatingBar = WidgetStyleDefinition("Widget.DeviceDefault.RatingBar", coreWidget_Material_RatingBar)
    val coreWidget_DeviceDefault_RatingBar_Indicator = WidgetStyleDefinition("Widget.DeviceDefault.RatingBar.Indicator", coreWidget_Material_RatingBar_Indicator)
    val coreWidget_DeviceDefault_RatingBar_Small = WidgetStyleDefinition("Widget.DeviceDefault.RatingBar.Small", coreWidget_Material_RatingBar_Small)
    val coreWidget_DeviceDefault_CompoundButton_RadioButton = WidgetStyleDefinition("Widget.DeviceDefault.CompoundButton.RadioButton", coreWidget_Material_CompoundButton_RadioButton)
    val coreWidget_DeviceDefault_ScrollView = WidgetStyleDefinition("Widget.DeviceDefault.ScrollView", coreWidget_Material_ScrollView)
    val coreWidget_DeviceDefault_HorizontalScrollView = WidgetStyleDefinition("Widget.DeviceDefault.HorizontalScrollView", coreWidget_Material_HorizontalScrollView)
    val coreWidget_DeviceDefault_Spinner = WidgetStyleDefinition("Widget.DeviceDefault.Spinner", coreWidget_Material_Spinner)
    val coreWidget_DeviceDefault_CompoundButton_Star = WidgetStyleDefinition("Widget.DeviceDefault.CompoundButton.Star", coreWidget_Material_CompoundButton_Star)
    val coreWidget_DeviceDefault_TabWidget = WidgetStyleDefinition("Widget.DeviceDefault.TabWidget", coreWidget_Material_TabWidget)
    val coreWidget_DeviceDefault_WebTextView = WidgetStyleDefinition("Widget.DeviceDefault.WebTextView", coreWidget_Material_WebTextView)
    val coreWidget_DeviceDefault_WebView = WidgetStyleDefinition("Widget.DeviceDefault.WebView", coreWidget_Material_WebView)
    val coreWidget_DeviceDefault_DropDownItem = WidgetStyleDefinition("Widget.DeviceDefault.DropDownItem", coreWidget_Material_DropDownItem)
    val coreWidget_DeviceDefault_DropDownItem_Spinner = WidgetStyleDefinition("Widget.DeviceDefault.DropDownItem.Spinner", coreWidget_Material_DropDownItem_Spinner)
    val coreWidget_DeviceDefault_TextView_SpinnerItem = WidgetStyleDefinition("Widget.DeviceDefault.TextView.SpinnerItem", coreWidget_Material_TextView_SpinnerItem)
    val coreWidget_DeviceDefault_ListPopupWindow = WidgetStyleDefinition("Widget.DeviceDefault.ListPopupWindow", coreWidget_Material_ListPopupWindow)
    val coreWidget_DeviceDefault_PopupMenu = WidgetStyleDefinition("Widget.DeviceDefault.PopupMenu", coreWidget_Material_PopupMenu)
    val coreWidget_DeviceDefault_ActionButton = WidgetStyleDefinition("Widget.DeviceDefault.ActionButton", coreWidget_Material_ActionButton)
    val coreWidget_DeviceDefault_ActionButton_Overflow = WidgetStyleDefinition("Widget.DeviceDefault.ActionButton.Overflow", coreWidget_Material_ActionButton_Overflow)
    val coreWidget_DeviceDefault_ActionButton_TextButton = WidgetStyleDefinition("Widget.DeviceDefault.ActionButton.TextButton", coreWidget_Material_ActionButton)
    val coreWidget_DeviceDefault_ActionMode = WidgetStyleDefinition("Widget.DeviceDefault.ActionMode", coreWidget_Material_ActionMode)
    val coreWidget_DeviceDefault_ActionButton_CloseMode = WidgetStyleDefinition("Widget.DeviceDefault.ActionButton.CloseMode", coreWidget_Material_ActionButton_CloseMode)
    val coreWidget_DeviceDefault_ActionBar = WidgetStyleDefinition("Widget.DeviceDefault.ActionBar", coreWidget_Material_ActionBar)
    val coreWidget_DeviceDefault_Button_Borderless = WidgetStyleDefinition("Widget.DeviceDefault.Button.Borderless", coreWidget_Material_Button_Borderless)

    val coreWidget_DeviceDefault_Button_Borderless_Colored = WidgetStyleDefinition("Widget.DeviceDefault.Button.Borderless.Colored", coreWidget_Material_Button_Borderless_Colored)
    coreWidget_DeviceDefault_Button_Borderless_Colored.styles["textAppearance"] = coreTextAppearance_DeviceDefault_Widget_Button_Borderless_Colored

    val coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog = WidgetStyleDefinition("Widget.DeviceDefault.Button.ButtonBar.AlertDialog", coreWidget_DeviceDefault_Button_Borderless_Colored)
    val coreWidget_DeviceDefault_Tab = WidgetStyleDefinition("Widget.DeviceDefault.Tab", coreWidget_Material_Tab)
    val coreWidget_DeviceDefault_CalendarView = WidgetStyleDefinition("Widget.DeviceDefault.CalendarView", coreWidget_Material_CalendarView)
    val coreWidget_DeviceDefault_DatePicker = WidgetStyleDefinition("Widget.DeviceDefault.DatePicker", coreWidget_Material_DatePicker)
    val coreWidget_DeviceDefault_ActionBar_TabView = WidgetStyleDefinition("Widget.DeviceDefault.ActionBar.TabView", coreWidget_Material_ActionBar_TabView)
    val coreWidget_DeviceDefault_ActionBar_TabText = WidgetStyleDefinition("Widget.DeviceDefault.ActionBar.TabText", coreWidget_Material_ActionBar_TabText)
    val coreWidget_DeviceDefault_ActionBar_TabBar = WidgetStyleDefinition("Widget.DeviceDefault.ActionBar.TabBar", coreWidget_Material_ActionBar_TabBar)
    val coreWidget_DeviceDefault_ActionBar_Solid = WidgetStyleDefinition("Widget.DeviceDefault.ActionBar.Solid", coreWidget_Material_ActionBar_Solid)
    val coreWidget_DeviceDefault_Button_Borderless_Small = WidgetStyleDefinition("Widget.DeviceDefault.", coreWidget_Material_Button_Borderless_Small)
    val coreWidget_DeviceDefault_AbsListView = WidgetStyleDefinition("Widget.DeviceDefault.AbsListView", coreWidget_Material_AbsListView)
    val coreWidget_DeviceDefault_Spinner_DropDown_ActionBar = WidgetStyleDefinition("Widget.DeviceDefault.Spinner.DropDown.ActionBar", coreWidget_Material_Spinner_DropDown_ActionBar)
    val coreWidget_DeviceDefault_PopupWindow_ActionMode = WidgetStyleDefinition("Widget.DeviceDefault.PopupWindow.ActionMode", coreWidget_Material_PopupWindow_ActionMode)
    val coreWidget_DeviceDefault_CompoundButton_Switch = WidgetStyleDefinition("Widget.DeviceDefault.CompoundButton.Switch", coreWidget_Material_CompoundButton_Switch)
    val coreWidget_DeviceDefault_ExpandableListView_White = WidgetStyleDefinition("Widget.DeviceDefault.ExpandableListView.White", coreWidget_Material_ExpandableListView_White)
    val coreWidget_DeviceDefault_FastScroll = WidgetStyleDefinition("Widget.DeviceDefault.FastScroll", coreWidget_Material_FastScroll)
    @ThemeDeprecated("The FragmentBreadCrumbs widget is deprecated starting in API level 21 ({@link android.os.Build.VERSION_CODES#.L}).")
    val coreWidget_DeviceDefault_FragmentBreadCrumbs = WidgetStyleDefinition("Widget.DeviceDefault.FragmentBreadCrumbs", coreWidget_Material_FragmentBreadCrumbs)
    val coreWidget_DeviceDefault_Gallery = WidgetStyleDefinition("Widget.DeviceDefault.Gallery", coreWidget_Material_Gallery)
    val coreWidget_DeviceDefault_GestureOverlayView = WidgetStyleDefinition("Widget.DeviceDefault.GestureOverlayView", coreWidget_Material_GestureOverlayView)
    val coreWidget_DeviceDefault_ImageWell = WidgetStyleDefinition("Widget.DeviceDefault.ImageWell", coreWidget_Material_ImageWell)
    val coreWidget_DeviceDefault_KeyboardView = WidgetStyleDefinition("Widget.DeviceDefault.KeyboardView", coreWidget_Material_KeyboardView)
    val coreWidget_DeviceDefault_ListView_White = WidgetStyleDefinition("Widget.DeviceDefault.ListView.White", coreWidget_Material_ListView_White)
    val coreWidget_DeviceDefault_MediaRouteButton = WidgetStyleDefinition("Widget.DeviceDefault.MediaRouteButton", coreWidget_Material_MediaRouteButton)
    val coreWidget_DeviceDefault_NumberPicker = WidgetStyleDefinition("Widget.DeviceDefault.NumberPicker", coreWidget_Material_NumberPicker)
    val coreWidget_DeviceDefault_PreferenceFrameLayout = WidgetStyleDefinition("Widget.DeviceDefault.PreferenceFrameLayout", coreWidget_Material_PreferenceFrameLayout)
    val coreWidget_DeviceDefault_ProgressBar_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Inverse", coreWidget_Material_ProgressBar_Inverse)
    val coreWidget_DeviceDefault_ProgressBar_Large_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Large.Inverse", coreWidget_Material_ProgressBar_Large_Inverse)
    val coreWidget_DeviceDefault_ProgressBar_Small_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.ProgressBar.Small.Inverse", coreWidget_Material_ProgressBar_Small_Inverse)
    val coreWidget_DeviceDefault_QuickContactBadge_WindowLarge = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadge.WindowLarge", coreWidget_Material_QuickContactBadge_WindowLarge)
    val coreWidget_DeviceDefault_QuickContactBadge_WindowMedium = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadge.WindowMedium", coreWidget_Material_QuickContactBadge_WindowMedium)
    val coreWidget_DeviceDefault_QuickContactBadge_WindowSmall = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadge.WindowSmall", coreWidget_Material_QuickContactBadge_WindowSmall)
    val coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowLarge = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadgeSmall.WindowLarge", coreWidget_Material_QuickContactBadgeSmall_WindowLarge)
    val coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowMedium = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadgeSmall.WindowMedium", coreWidget_Material_QuickContactBadgeSmall_WindowMedium)
    val coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowSmall = WidgetStyleDefinition("Widget.DeviceDefault.QuickContactBadgeSmall.WindowSmall", coreWidget_Material_QuickContactBadgeSmall_WindowSmall)
    val coreWidget_DeviceDefault_Spinner_DropDown = WidgetStyleDefinition("Widget.DeviceDefault.Spinner.DropDown", coreWidget_Material_Spinner_DropDown)
    val coreWidget_DeviceDefault_StackView = WidgetStyleDefinition("Widget.DeviceDefault.StackView", coreWidget_Material_StackView)
    val coreWidget_DeviceDefault_TextSelectHandle = WidgetStyleDefinition("Widget.DeviceDefault.TextSelectHandle", coreWidget_Material_TextSelectHandle)
    val coreWidget_DeviceDefault_TextView_ListSeparator = WidgetStyleDefinition("Widget.DeviceDefault.TextView.ListSeparator", coreWidget_Material_TextView_ListSeparator)
    val coreWidget_DeviceDefault_TimePicker = WidgetStyleDefinition("Widget.DeviceDefault.TimePicker", coreWidget_Material_TimePicker)

    val coreWidget_DeviceDefault_Light = WidgetStyleDefinition("Widget.DeviceDefault.Light", coreWidget_Material_Light)
    val coreWidget_DeviceDefault_Light_Button = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button", coreWidget_Material_Light_Button)
    val coreWidget_DeviceDefault_Light_Button_Small = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button.Small", coreWidget_Material_Light_Button_Small)
    val coreWidget_DeviceDefault_Light_Button_Inset = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button.Inset", coreWidget_Material_Light_Button_Inset)
    val coreWidget_DeviceDefault_Light_Button_Toggle = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button.Toggle", coreWidget_Material_Light_Button_Toggle)
    val coreWidget_DeviceDefault_Light_StackView = WidgetStyleDefinition("Widget.DeviceDefault.Light.StackView", coreWidget_Material_Light_StackView)
    val coreWidget_DeviceDefault_Light_TextView = WidgetStyleDefinition("Widget.DeviceDefault.Light.TextView", coreWidget_Material_Light_TextView)
    val coreWidget_DeviceDefault_Light_CheckedTextView = WidgetStyleDefinition("Widget.DeviceDefault.Light.CheckedTextView", coreWidget_Material_Light_CheckedTextView)
    val coreWidget_DeviceDefault_Light_AutoCompleteTextView = WidgetStyleDefinition("Widget.DeviceDefault.Light.AutoCompleteTextView", coreWidget_Material_Light_AutoCompleteTextView)
    val coreWidget_DeviceDefault_Light_CompoundButton_CheckBox = WidgetStyleDefinition("Widget.DeviceDefault.Light.CompoundButton.CheckBox", coreWidget_Material_Light_CompoundButton_CheckBox)
    val coreWidget_DeviceDefault_Light_ListView_DropDown = WidgetStyleDefinition("Widget.DeviceDefault.Light.ListView.DropDown", coreWidget_Material_Light_ListView_DropDown)
    val coreWidget_DeviceDefault_Light_EditText = WidgetStyleDefinition("Widget.DeviceDefault.Light.EditText", coreWidget_Material_Light_EditText)
    val coreWidget_DeviceDefault_Light_ExpandableListView = WidgetStyleDefinition("Widget.DeviceDefault.Light.ExpandableListView", coreWidget_Material_Light_ExpandableListView)
    val coreWidget_DeviceDefault_Light_FastScroll = WidgetStyleDefinition("Widget.DeviceDefault.Light.FastScroll", coreWidget_Material_Light_FastScroll)
    @ThemeDeprecated("The FragmentBreadCrumbs widget is deprecated starting in API level 21 ({@link android.os.Build.VERSION_CODES#.L}).")
    val coreWidget_DeviceDefault_Light_FragmentBreadCrumbs = WidgetStyleDefinition("Widget.DeviceDefault.Light.FragmentBreadCrumbs", coreWidget_Material_Light_FragmentBreadCrumbs)
    val coreWidget_DeviceDefault_Light_GridView = WidgetStyleDefinition("Widget.DeviceDefault.Light.GridView", coreWidget_Material_Light_GridView)
    val coreWidget_DeviceDefault_Light_ImageButton = WidgetStyleDefinition("Widget.DeviceDefault.Light.ImageButton", coreWidget_Material_Light_ImageButton)
    val coreWidget_DeviceDefault_Light_ListView = WidgetStyleDefinition("Widget.DeviceDefault.Light.ListView", coreWidget_Material_Light_ListView)
    val coreWidget_DeviceDefault_Light_MediaRouteButton = WidgetStyleDefinition("Widget.DeviceDefault.Light.MediaRouteButton", coreWidget_Material_Light_MediaRouteButton)
    val coreWidget_DeviceDefault_Light_PopupWindow = WidgetStyleDefinition("Widget.DeviceDefault.Light.PopupWindow", coreWidget_Material_Light_PopupWindow)
    val coreWidget_DeviceDefault_Light_ProgressBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar", coreWidget_Material_Light_ProgressBar)
    val coreWidget_DeviceDefault_Light_ProgressBar_Horizontal = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Horizontal", coreWidget_Material_Light_ProgressBar_Horizontal)
    val coreWidget_DeviceDefault_Light_ProgressBar_Small = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Small", coreWidget_Material_Light_ProgressBar_Small)
    val coreWidget_DeviceDefault_Light_ProgressBar_Small_Title = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Small.Title", coreWidget_Material_Light_ProgressBar_Small_Title)
    val coreWidget_DeviceDefault_Light_ProgressBar_Large = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Large", coreWidget_Material_Light_ProgressBar_Large)
    val coreWidget_DeviceDefault_Light_ProgressBar_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Inverse", coreWidget_Material_Light_ProgressBar_Inverse)
    val coreWidget_DeviceDefault_Light_ProgressBar_Small_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Small.Inverse", coreWidget_Material_Light_ProgressBar_Small_Inverse)
    val coreWidget_DeviceDefault_Light_ProgressBar_Large_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ProgressBar.Large.Inverse", coreWidget_Material_Light_ProgressBar_Large_Inverse)
    val coreWidget_DeviceDefault_Light_SeekBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.SeekBar", coreWidget_Material_Light_SeekBar)
    val coreWidget_DeviceDefault_Light_RatingBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.RatingBar", coreWidget_Material_Light_RatingBar)
    val coreWidget_DeviceDefault_Light_RatingBar_Indicator = WidgetStyleDefinition("Widget.DeviceDefault.Light.RatingBar.Indicator", coreWidget_Material_Light_RatingBar_Indicator)
    val coreWidget_DeviceDefault_Light_RatingBar_Small = WidgetStyleDefinition("Widget.DeviceDefault.Light.RatingBar.Small", coreWidget_Material_Light_RatingBar_Small)
    val coreWidget_DeviceDefault_Light_CompoundButton_RadioButton = WidgetStyleDefinition("Widget.DeviceDefault.Light.CompoundButton.RadioButton", coreWidget_Material_Light_CompoundButton_RadioButton)
    val coreWidget_DeviceDefault_Light_ScrollView = WidgetStyleDefinition("Widget.DeviceDefault.Light.ScrollView", coreWidget_Material_Light_ScrollView)
    val coreWidget_DeviceDefault_Light_HorizontalScrollView = WidgetStyleDefinition("Widget.DeviceDefault.Light.HorizontalScrollView", coreWidget_Material_Light_HorizontalScrollView)
    val coreWidget_DeviceDefault_Light_Spinner = WidgetStyleDefinition("Widget.DeviceDefault.Light.Spinner", coreWidget_Material_Light_Spinner)
    val coreWidget_DeviceDefault_Light_CompoundButton_Star = WidgetStyleDefinition("Widget.DeviceDefault.Light.CompoundButton.Star", coreWidget_Material_Light_CompoundButton_Star)
    val coreWidget_DeviceDefault_Light_TabWidget = WidgetStyleDefinition("Widget.DeviceDefault.Light.TabWidget", coreWidget_Material_Light_TabWidget)
    val coreWidget_DeviceDefault_Light_WebTextView = WidgetStyleDefinition("Widget.DeviceDefault.Light.WebTextView", coreWidget_Material_Light_WebTextView)
    val coreWidget_DeviceDefault_Light_WebView = WidgetStyleDefinition("Widget.DeviceDefault.Light.WebView", coreWidget_Material_Light_WebView)
    val coreWidget_DeviceDefault_Light_DropDownItem = WidgetStyleDefinition("Widget.DeviceDefault.Light.DropDownItem", coreWidget_Material_Light_DropDownItem)
    val coreWidget_DeviceDefault_Light_DropDownItem_Spinner = WidgetStyleDefinition("Widget.DeviceDefault.Light.DropDownItem.Spinner", coreWidget_Material_Light_DropDownItem_Spinner)
    val coreWidget_DeviceDefault_Light_TextView_SpinnerItem = WidgetStyleDefinition("Widget.DeviceDefault.Light.TextView.SpinnerItem", coreWidget_Material_Light_TextView_SpinnerItem)
    val coreWidget_DeviceDefault_Light_ListPopupWindow = WidgetStyleDefinition("Widget.DeviceDefault.Light.ListPopupWindow", coreWidget_Material_Light_ListPopupWindow)
    val coreWidget_DeviceDefault_Light_PopupMenu = WidgetStyleDefinition("Widget.DeviceDefault.Light.PopupMenu", coreWidget_Material_Light_PopupMenu)
    val coreWidget_DeviceDefault_Light_Tab = WidgetStyleDefinition("Widget.DeviceDefault.Light.Tab", coreWidget_Material_Light_Tab)
    val coreWidget_DeviceDefault_Light_CalendarView = WidgetStyleDefinition("Widget.DeviceDefault.Light.CalendarView", coreWidget_Material_Light_CalendarView)
    val coreWidget_DeviceDefault_Light_Button_Borderless_Small = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button.Borderless.Small", coreWidget_Material_Light_Button_Borderless_Small)
    val coreWidget_DeviceDefault_Light_ActionButton = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionButton", coreWidget_Material_Light_ActionButton)
    val coreWidget_DeviceDefault_Light_ActionButton_Overflow = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionButton.Overflow", coreWidget_Material_Light_ActionButton_Overflow)
    val coreWidget_DeviceDefault_Light_ActionMode = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionMode", coreWidget_Material_Light_ActionMode)
    val coreWidget_DeviceDefault_Light_ActionButton_CloseMode = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionButton.CloseMode", coreWidget_Material_Light_ActionButton_CloseMode)
    val coreWidget_DeviceDefault_Light_ActionBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar", coreWidget_Material_Light_ActionBar)
    val coreWidget_DeviceDefault_Light_ActionBar_TabView = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabView", coreWidget_Material_Light_ActionBar_TabView)
    val coreWidget_DeviceDefault_Light_ActionBar_TabText = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabText", coreWidget_Material_Light_ActionBar_TabText)
    val coreWidget_DeviceDefault_Light_ActionBar_TabBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabBar", coreWidget_Material_Light_ActionBar_TabBar)
    val coreWidget_DeviceDefault_Light_ActionBar_Solid = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.Solid", coreWidget_Material_Light_ActionBar_Solid)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreWidget_DeviceDefault_Light_ActionBar_Solid_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.Solid.Inverse", coreWidget_Holo_Light_ActionBar_Solid_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreWidget_DeviceDefault_Light_ActionBar_TabBar_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabBar.Inverse", coreWidget_Holo_Light_ActionBar_TabBar_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreWidget_DeviceDefault_Light_ActionBar_TabView_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabView.Inverse", coreWidget_Holo_Light_ActionBar_TabView_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreWidget_DeviceDefault_Light_ActionBar_TabText_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionBar.TabText.Inverse", coreWidget_Holo_Light_ActionBar_TabText_Inverse)
    @ThemeDeprecated("Action bars are now themed using the inheritable android:theme attribute.")
    val coreWidget_DeviceDefault_Light_ActionMode_Inverse = WidgetStyleDefinition("Widget.DeviceDefault.Light.ActionMode.Inverse", coreWidget_Holo_Light_ActionMode_Inverse)
    val coreWidget_DeviceDefault_Light_AbsListView = WidgetStyleDefinition("Widget.DeviceDefault.Light.AbsListView", coreWidget_Material_Light_AbsListView)
    val coreWidget_DeviceDefault_Light_Spinner_DropDown_ActionBar = WidgetStyleDefinition("Widget.DeviceDefault.Light.Spinner.DropDown.ActionBar", coreWidget_Material_Light_Spinner_DropDown_ActionBar)
    val coreWidget_DeviceDefault_Light_PopupWindow_ActionMode = WidgetStyleDefinition("Widget.DeviceDefault.Light.PopupWindow.ActionMode", coreWidget_Material_Light_PopupWindow_ActionMode)
    val coreWidget_DeviceDefault_Light_Button_Borderless = WidgetStyleDefinition("Widget.DeviceDefault.Light.Button.Borderless", coreWidget_Material_Light_Button_Borderless)
    val coreWidget_DeviceDefault_Light_DatePicker = WidgetStyleDefinition("Widget.DeviceDefault.Light.DatePicker", coreWidget_Material_Light_DatePicker)
    val coreWidget_DeviceDefault_Light_ExpandableListView_White = WidgetStyleDefinition("Widget.DeviceDefault.Light.ExpandableListView.White", coreWidget_Material_Light_ExpandableListView_White)
    val coreWidget_DeviceDefault_Light_Gallery = WidgetStyleDefinition("Widget.DeviceDefault.Light.Gallery", coreWidget_Material_Light_Gallery)
    val coreWidget_DeviceDefault_Light_GestureOverlayView = WidgetStyleDefinition("Widget.DeviceDefault.Light.GestureOverlayView", coreWidget_Material_Light_GestureOverlayView)
    val coreWidget_DeviceDefault_Light_ImageWell = WidgetStyleDefinition("Widget.DeviceDefault.Light.ImageWell", coreWidget_Material_Light_ImageWell)
    val coreWidget_DeviceDefault_Light_ListView_White = WidgetStyleDefinition("Widget.DeviceDefault.Light.ListView.White", coreWidget_Material_Light_ListView_White)
    val coreWidget_DeviceDefault_Light_NumberPicker = WidgetStyleDefinition("Widget.DeviceDefault.Light.NumberPicker", coreWidget_Material_Light_NumberPicker)
    val coreWidget_DeviceDefault_Light_Spinner_DropDown = WidgetStyleDefinition("Widget.DeviceDefault.Light.Spinner.DropDown", coreWidget_Material_Light_Spinner_DropDown)
    val coreWidget_DeviceDefault_Light_TextView_ListSeparator = WidgetStyleDefinition("Widget.DeviceDefault.Light.TextView.ListSeparator", coreWidget_Material_Light_TextView_ListSeparator)
    val coreWidget_DeviceDefault_Light_TimePicker = WidgetStyleDefinition("Widget.DeviceDefault.Light.TimePicker", coreWidget_Material_Light_TimePicker)

    // Preference Styles
    val corePreference_DeviceDefault = WidgetStyleDefinition("Preference.DeviceDefault", corePreference_Material)
    val corePreference_DeviceDefault_Category = WidgetStyleDefinition("Preference.DeviceDefault.Category", corePreference_Material_Category)
    val corePreference_DeviceDefault_CheckBoxPreference = WidgetStyleDefinition("Preference.DeviceDefault.CheckBoxPreference", corePreference_Material_CheckBoxPreference)
    val corePreference_DeviceDefault_DialogPreference = WidgetStyleDefinition("Preference.DeviceDefault.DialogPreference", corePreference_Material_DialogPreference)
    val corePreference_DeviceDefault_DialogPreference_EditTextPreference = WidgetStyleDefinition("Preference.DeviceDefault.DialogPreference.EditTextPreference", corePreference_Material_DialogPreference_EditTextPreference)
    val corePreference_DeviceDefault_DialogPreference_YesNoPreference = WidgetStyleDefinition("Preference.DeviceDefault.DialogPreference.YesNoPreference", corePreference_Material_DialogPreference_YesNoPreference)
    val corePreference_DeviceDefault_Information = WidgetStyleDefinition("Preference.DeviceDefault.Information", corePreference_Material_Information)
    val corePreference_DeviceDefault_PreferenceScreen = WidgetStyleDefinition("Preference.DeviceDefault.PreferenceScreen", corePreference_Material_PreferenceScreen)
    val corePreference_DeviceDefault_RingtonePreference = WidgetStyleDefinition("Preference.DeviceDefault.RingtonePreference", corePreference_Material_RingtonePreference)
    val corePreference_DeviceDefault_SwitchPreference = WidgetStyleDefinition("Preference.DeviceDefault.SwitchPreference", corePreference_Material_SwitchPreference)
    val corePreference_DeviceDefault_SeekBarPreference = WidgetStyleDefinition("Preference.DeviceDefault.SeekBarPreference", corePreference_Material_SeekBarPreference)

    // AlertDialog Styles
    val coreAlertDialog_DeviceDefault = WidgetStyleDefinition("AlertDialog.DeviceDefault", coreAlertDialog_Material)
    val coreAlertDialog_DeviceDefault_Light = WidgetStyleDefinition("AlertDialog.DeviceDefault.Light", coreAlertDialog_Material_Light)

    // Animation Styles
    val coreAnimation_DeviceDefault_Activity = WidgetStyleDefinition("Animation.DeviceDefault.Activity", coreAnimation_Material_Activity)
    val coreAnimation_DeviceDefault_Dialog = WidgetStyleDefinition("Animation.DeviceDefault.Dialog", coreAnimation_Material_Dialog)

    // DialogWindowTitle Styles
    val coreDialogWindowTitle_DeviceDefault = WidgetStyleDefinition("DialogWindowTitle.DeviceDefault", coreDialogWindowTitle_Material)
    val coreDialogWindowTitle_DeviceDefault_Light = WidgetStyleDefinition("DialogWindowTitle.DeviceDefault.Light", coreDialogWindowTitle_Material_Light)

    // WindowTitle Styles
    val coreWindowTitle_DeviceDefault = WidgetStyleDefinition("WindowTitle.DeviceDefault", coreWindowTitle_Material)
    val coreWindowTitleBackground_DeviceDefault = WidgetStyleDefinition("WindowTitleBackground.DeviceDefault", coreWindowTitleBackground_Material)

    // Other Styles
    val coreDeviceDefault_ButtonBar = WidgetStyleDefinition("DeviceDefault.ButtonBar", coreWidget_Material_ButtonBar)
    val coreDeviceDefault_ButtonBar_AlertDialog = WidgetStyleDefinition("DeviceDefault.ButtonBar.AlertDialog", coreWidget_Material_ButtonBar_AlertDialog)
    val coreDeviceDefault_SegmentedButton = WidgetStyleDefinition("DeviceDefault.SegmentedButton", coreWidget_Material_SegmentedButton)
    val coreDeviceDefault_Light_ButtonBar = WidgetStyleDefinition("DeviceDefault.Light.ButtonBar", coreWidget_Material_Light_ButtonBar)
    val coreDeviceDefault_Light_ButtonBar_AlertDialog = WidgetStyleDefinition("DeviceDefault.Light.ButtonBar.AlertDialog", coreWidget_Material_Light_ButtonBar_AlertDialog)
    val coreDeviceDefault_Light_SegmentedButton = WidgetStyleDefinition("DeviceDefault.Light.SegmentedButton", coreWidget_Material_Light_SegmentedButton)

    val coreTheme_DeviceDefault_Light_Dialog_Alert = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.Alert",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog.Alert"), true)

    val coreTheme_DeviceDefault_Dialog = ThemeDefinition("Theme.DeviceDefault.Dialog", coreTheme_Material_Dialog, true)
    val coreTheme_DeviceDefaultBase = ThemeDefinition("Theme.DeviceDefaultBase", coreTheme_Material, true)
    val coreTheme_DeviceDefault_Dialog_Alert = ThemeDefinition("Theme.DeviceDefault.Dialog.Alert",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Dialog.Alert"), true)
    val coreTheme_DeviceDefault_Dialog_Presentation = ThemeDefinition("Theme.DeviceDefault.Dialog.Presentation", coreTheme_Material_Dialog_Presentation, true)
    val coreTheme_DeviceDefault_SearchBar = ThemeDefinition("Theme.DeviceDefault.SearchBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.SearchBar"), true)
    val coreTheme_DeviceDefault_Light_Dialog = ThemeDefinition("Theme.DeviceDefault.Light.Dialog",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog"), true)
    val coreTheme_DeviceDefault_Light_SearchBar = ThemeDefinition("Theme.DeviceDefault.Light.SearchBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.SearchBar"), true)
    val coreTheme_DeviceDefault_Light_Dialog_Presentation = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.Presentation",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog.Presentation"), true)

    // Text styles
    coreTheme_DeviceDefaultBase.styles["textAppearance"] = coreTextAppearance_DeviceDefault
    coreTheme_DeviceDefaultBase.styles["textAppearanceInverse"] = coreTextAppearance_DeviceDefault_Inverse
    coreTheme_DeviceDefaultBase.styles["textAppearanceLarge"] = coreTextAppearance_DeviceDefault_Large
    coreTheme_DeviceDefaultBase.styles["textAppearanceMedium"] = coreTextAppearance_DeviceDefault_Medium
    coreTheme_DeviceDefaultBase.styles["textAppearanceSmall"] = coreTextAppearance_DeviceDefault_Small
    coreTheme_DeviceDefaultBase.styles["textAppearanceLargeInverse"] = coreTextAppearance_DeviceDefault_Large_Inverse
    coreTheme_DeviceDefaultBase.styles["textAppearanceMediumInverse"] = coreTextAppearance_DeviceDefault_Medium_Inverse
    coreTheme_DeviceDefaultBase.styles["textAppearanceSmallInverse"] = coreTextAppearance_DeviceDefault_Small_Inverse
    coreTheme_DeviceDefaultBase.styles["textAppearanceSearchResultTitle"] = coreTextAppearance_DeviceDefault_SearchResult_Title
    coreTheme_DeviceDefaultBase.styles["textAppearanceSearchResultSubtitle"] = coreTextAppearance_DeviceDefault_SearchResult_Subtitle
    coreTheme_DeviceDefaultBase.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    coreTheme_DeviceDefaultBase.styles["textAppearanceLargePopupMenu"] = coreTextAppearance_DeviceDefault_Widget_PopupMenu_Large
    coreTheme_DeviceDefaultBase.styles["textAppearanceSmallPopupMenu"] = coreTextAppearance_DeviceDefault_Widget_PopupMenu_Small
    // Button styles
    coreTheme_DeviceDefaultBase.styles["buttonStyle"] = coreWidget_DeviceDefault_Button
    coreTheme_DeviceDefaultBase.styles["buttonStyleSmall"] = coreWidget_DeviceDefault_Button_Small
    coreTheme_DeviceDefaultBase.styles["buttonStyleInset"] = coreWidget_DeviceDefault_Button_Inset
    coreTheme_DeviceDefaultBase.styles["buttonStyleToggle"] = coreWidget_DeviceDefault_Button_Toggle
    coreTheme_DeviceDefaultBase.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog
    coreTheme_DeviceDefaultBase.styles["switchStyle"] = coreWidget_DeviceDefault_CompoundButton_Switch
    coreTheme_DeviceDefaultBase.styles["borderlessButtonStyle"] = coreWidget_DeviceDefault_Button_Borderless
    coreTheme_DeviceDefaultBase.styles["listSeparatorTextViewStyle"] = coreWidget_DeviceDefault_TextView_ListSeparator
    // Window attributes
    coreTheme_DeviceDefaultBase.styles["windowTitleStyle"] = coreWindowTitle_DeviceDefault
    coreTheme_DeviceDefaultBase.styles["windowTitleBackgroundStyle"] = coreWindowTitleBackground_DeviceDefault
    coreTheme_DeviceDefaultBase.styles["windowAnimationStyle"] = coreAnimation_DeviceDefault_Activity
    // Dialog attributes
    coreTheme_DeviceDefaultBase.styles["dialogTheme"] = coreTheme_DeviceDefault_Dialog
    // AlertDialog attributes
    coreTheme_DeviceDefaultBase.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    coreTheme_DeviceDefaultBase.styles["alertDialogStyle"] = coreAlertDialog_DeviceDefault
    // Presentation attributes
    coreTheme_DeviceDefaultBase.styles["presentationTheme"] = coreTheme_DeviceDefault_Dialog_Presentation
    // Text selection handle attributes
    coreTheme_DeviceDefaultBase.styles["textSelectHandleWindowStyle"] = coreWidget_DeviceDefault_TextSelectHandle
    // Widget styles
    coreTheme_DeviceDefaultBase.styles["absListViewStyle"] = coreWidget_DeviceDefault_AbsListView
    coreTheme_DeviceDefaultBase.styles["autoCompleteTextViewStyle"] = coreWidget_DeviceDefault_AutoCompleteTextView
    coreTheme_DeviceDefaultBase.styles["checkboxStyle"] = coreWidget_DeviceDefault_CompoundButton_CheckBox
    coreTheme_DeviceDefaultBase.styles["checkedTextViewStyle"] = coreWidget_DeviceDefault_CheckedTextView
    coreTheme_DeviceDefaultBase.styles["dropDownListViewStyle"] = coreWidget_DeviceDefault_ListView_DropDown
    coreTheme_DeviceDefaultBase.styles["editTextStyle"] = coreWidget_DeviceDefault_EditText
    coreTheme_DeviceDefaultBase.styles["expandableListViewStyle"] = coreWidget_DeviceDefault_ExpandableListView
    coreTheme_DeviceDefaultBase.styles["expandableListViewWhiteStyle"] = coreWidget_DeviceDefault_ExpandableListView_White
    coreTheme_DeviceDefaultBase.styles["galleryStyle"] = coreWidget_DeviceDefault_Gallery
    coreTheme_DeviceDefaultBase.styles["gestureOverlayViewStyle"] = coreWidget_DeviceDefault_GestureOverlayView
    coreTheme_DeviceDefaultBase.styles["gridViewStyle"] = coreWidget_DeviceDefault_GridView
    coreTheme_DeviceDefaultBase.styles["imageButtonStyle"] = coreWidget_DeviceDefault_ImageButton
    coreTheme_DeviceDefaultBase.styles["imageWellStyle"] = coreWidget_DeviceDefault_ImageWell
    coreTheme_DeviceDefaultBase.styles["listViewStyle"] = coreWidget_DeviceDefault_ListView
    coreTheme_DeviceDefaultBase.styles["listViewWhiteStyle"] = coreWidget_DeviceDefault_ListView_White
    coreTheme_DeviceDefaultBase.styles["popupWindowStyle"] = coreWidget_DeviceDefault_PopupWindow
    coreTheme_DeviceDefaultBase.styles["progressBarStyle"] = coreWidget_DeviceDefault_ProgressBar
    coreTheme_DeviceDefaultBase.styles["progressBarStyleHorizontal"] = coreWidget_DeviceDefault_ProgressBar_Horizontal
    coreTheme_DeviceDefaultBase.styles["progressBarStyleSmall"] = coreWidget_DeviceDefault_ProgressBar_Small
    coreTheme_DeviceDefaultBase.styles["progressBarStyleSmallTitle"] = coreWidget_DeviceDefault_ProgressBar_Small_Title
    coreTheme_DeviceDefaultBase.styles["progressBarStyleLarge"] = coreWidget_DeviceDefault_ProgressBar_Large
    coreTheme_DeviceDefaultBase.styles["progressBarStyleInverse"] = coreWidget_DeviceDefault_ProgressBar_Inverse
    coreTheme_DeviceDefaultBase.styles["progressBarStyleSmallInverse"] = coreWidget_DeviceDefault_ProgressBar_Small_Inverse
    coreTheme_DeviceDefaultBase.styles["progressBarStyleLargeInverse"] = coreWidget_DeviceDefault_ProgressBar_Large_Inverse
    coreTheme_DeviceDefaultBase.styles["seekBarStyle"] = coreWidget_DeviceDefault_SeekBar
    coreTheme_DeviceDefaultBase.styles["ratingBarStyle"] = coreWidget_DeviceDefault_RatingBar
    coreTheme_DeviceDefaultBase.styles["ratingBarStyleIndicator"] = coreWidget_DeviceDefault_RatingBar_Indicator
    coreTheme_DeviceDefaultBase.styles["ratingBarStyleSmall"] = coreWidget_DeviceDefault_RatingBar_Small
    coreTheme_DeviceDefaultBase.styles["radioButtonStyle"] = coreWidget_DeviceDefault_CompoundButton_RadioButton
    coreTheme_DeviceDefaultBase.styles["scrollViewStyle"] = coreWidget_DeviceDefault_ScrollView
    coreTheme_DeviceDefaultBase.styles["horizontalScrollViewStyle"] = coreWidget_DeviceDefault_HorizontalScrollView
    coreTheme_DeviceDefaultBase.styles["dropDownSpinnerStyle"] = coreWidget_DeviceDefault_Spinner_DropDown
    coreTheme_DeviceDefaultBase.styles["starStyle"] = coreWidget_DeviceDefault_CompoundButton_Star
    coreTheme_DeviceDefaultBase.styles["tabWidgetStyle"] = coreWidget_DeviceDefault_TabWidget
    coreTheme_DeviceDefaultBase.styles["textViewStyle"] = coreWidget_DeviceDefault_TextView
    coreTheme_DeviceDefaultBase.styles["webTextViewStyle"] = coreWidget_DeviceDefault_WebTextView
    coreTheme_DeviceDefaultBase.styles["webViewStyle"] = coreWidget_DeviceDefault_WebView
    coreTheme_DeviceDefaultBase.styles["dropDownItemStyle"] = coreWidget_DeviceDefault_DropDownItem
    coreTheme_DeviceDefaultBase.styles["spinnerDropDownItemStyle"] = coreWidget_DeviceDefault_DropDownItem_Spinner
    coreTheme_DeviceDefaultBase.styles["spinnerItemStyle"] = coreWidget_DeviceDefault_TextView_SpinnerItem
    coreTheme_DeviceDefaultBase.styles["dropDownHintAppearance"] = coreTextAppearance_DeviceDefault_Widget_DropDownHint
    coreTheme_DeviceDefaultBase.styles["keyboardViewStyle"] = coreWidget_DeviceDefault_KeyboardView
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleWindowSmall"] = coreWidget_DeviceDefault_QuickContactBadge_WindowSmall
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleWindowMedium"] = coreWidget_DeviceDefault_QuickContactBadge_WindowMedium
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleWindowLarge"] = coreWidget_DeviceDefault_QuickContactBadge_WindowLarge
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleSmallWindowSmall"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowSmall
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleSmallWindowMedium"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowMedium
    coreTheme_DeviceDefaultBase.styles["quickContactBadgeStyleSmallWindowLarge"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowLarge
    coreTheme_DeviceDefaultBase.styles["listPopupWindowStyle"] = coreWidget_DeviceDefault_ListPopupWindow
    coreTheme_DeviceDefaultBase.styles["popupMenuStyle"] = coreWidget_DeviceDefault_PopupMenu
    coreTheme_DeviceDefaultBase.styles["stackViewStyle"] = coreWidget_DeviceDefault_StackView
    // Preference styles
    coreTheme_DeviceDefaultBase.styles["preferenceScreenStyle"] = corePreference_DeviceDefault_PreferenceScreen
    coreTheme_DeviceDefaultBase.styles["preferenceCategoryStyle"] = corePreference_DeviceDefault_Category
    coreTheme_DeviceDefaultBase.styles["preferenceStyle"] = corePreference_DeviceDefault
    coreTheme_DeviceDefaultBase.styles["preferenceInformationStyle"] = corePreference_DeviceDefault_Information
    coreTheme_DeviceDefaultBase.styles["checkBoxPreferenceStyle"] = corePreference_DeviceDefault_CheckBoxPreference
    coreTheme_DeviceDefaultBase.styles["switchPreferenceStyle"] = corePreference_DeviceDefault_SwitchPreference
    coreTheme_DeviceDefaultBase.styles["seekBarPreferenceStyle"] = corePreference_DeviceDefault_SeekBarPreference
    coreTheme_DeviceDefaultBase.styles["yesNoPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference_YesNoPreference
    coreTheme_DeviceDefaultBase.styles["dialogPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference
    coreTheme_DeviceDefaultBase.styles["editTextPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference_EditTextPreference
    coreTheme_DeviceDefaultBase.styles["ringtonePreferenceStyle"] = corePreference_DeviceDefault_RingtonePreference
    // Action bar styles
    coreTheme_DeviceDefaultBase.styles["actionDropDownStyle"] = coreWidget_DeviceDefault_Spinner_DropDown_ActionBar
    coreTheme_DeviceDefaultBase.styles["actionButtonStyle"] = coreWidget_DeviceDefault_ActionButton
    coreTheme_DeviceDefaultBase.styles["actionOverflowButtonStyle"] = coreWidget_DeviceDefault_ActionButton_Overflow
    coreTheme_DeviceDefaultBase.styles["actionBarTabStyle"] = coreWidget_DeviceDefault_ActionBar_TabView
    coreTheme_DeviceDefaultBase.styles["actionBarTabBarStyle"] = coreWidget_DeviceDefault_ActionBar_TabBar
    coreTheme_DeviceDefaultBase.styles["actionBarTabTextStyle"] = coreWidget_DeviceDefault_ActionBar_TabText
    coreTheme_DeviceDefaultBase.styles["actionModeStyle"] = coreWidget_DeviceDefault_ActionMode
    coreTheme_DeviceDefaultBase.styles["actionModeCloseButtonStyle"] = coreWidget_DeviceDefault_ActionButton_CloseMode
    coreTheme_DeviceDefaultBase.styles["actionBarStyle"] = coreWidget_DeviceDefault_ActionBar_Solid
    coreTheme_DeviceDefaultBase.styles["actionModePopupWindowStyle"] = coreWidget_DeviceDefault_PopupWindow_ActionMode
    coreTheme_DeviceDefaultBase.styles["buttonBarStyle"] = coreDeviceDefault_ButtonBar
    coreTheme_DeviceDefaultBase.styles["segmentedButtonStyle"] = coreDeviceDefault_SegmentedButton
    coreTheme_DeviceDefaultBase.styles["searchDialogTheme"] = coreTheme_DeviceDefault_SearchBar
    // PreferenceFrameLayout attributes
    coreTheme_DeviceDefaultBase.styles["preferenceFrameLayoutStyle"] = coreWidget_DeviceDefault_PreferenceFrameLayout
    // NumberPicker style-->
    coreTheme_DeviceDefaultBase.styles["numberPickerStyle"] = coreWidget_DeviceDefault_NumberPicker
    // CalendarView style-->
    coreTheme_DeviceDefaultBase.styles["calendarViewStyle"] = coreWidget_DeviceDefault_CalendarView
    // TimePicker style
    coreTheme_DeviceDefaultBase.styles["timePickerStyle"] = coreWidget_DeviceDefault_TimePicker
    // DatePicker style
    coreTheme_DeviceDefaultBase.styles["datePickerStyle"] = coreWidget_DeviceDefault_DatePicker
    coreTheme_DeviceDefaultBase.styles["mediaRouteButtonStyle"] = coreWidget_DeviceDefault_MediaRouteButton

    val coreTheme_DeviceDefault = ThemeDefinition("Theme.DeviceDefault", coreTheme_DeviceDefaultBase, true)

    // Variant of {@link #Theme_DeviceDefault} with no action bar
    val coreTheme_DeviceDefault_NoActionBar = ThemeDefinition("Theme.DeviceDefault.NoActionBar", coreTheme_Material_NoActionBar, true)
    // Dialog attributes
    coreTheme_DeviceDefault_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault} with no action bar and no status bar.  This theme
    // sets {@link android.R.attr#windowFullscreen} to true.
    val coreTheme_DeviceDefault_NoActionBar_Fullscreen = ThemeDefinition("Theme.DeviceDefault.NoActionBar.Fullscreen", coreTheme_Material_NoActionBar_Fullscreen, true)
    // Dialog attributes
    coreTheme_DeviceDefault_NoActionBar_Fullscreen.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_NoActionBar_Fullscreen.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_NoActionBar_Fullscreen.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault} with no action bar and no status bar and
    // extending in to overscan region.  This theme
    // sets {@link android.R.attr#windowFullscreen} and {@link android.R.attr#windowOverscan}
    // to true.
    val coreTheme_DeviceDefault_NoActionBar_Overscan = ThemeDefinition("Theme.DeviceDefault.NoActionBar.Overscan", coreTheme_Material_NoActionBar_Overscan, true)
    // Dialog attributes
    coreTheme_DeviceDefault_NoActionBar_Overscan.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_NoActionBar_Overscan.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_NoActionBar_Overscan.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault} that has no title bar and translucent
    // system decor.  This theme sets {@link android.R.attr#windowTranslucentStatus} and
    // {@link android.R.attr#windowTranslucentNavigation} to true.
    val coreTheme_DeviceDefault_NoActionBar_TranslucentDecor = ThemeDefinition("Theme.DeviceDefault.NoActionBar.TranslucentDecor", coreTheme_Material_NoActionBar_TranslucentDecor, true)
    // Dialog attributes
    coreTheme_DeviceDefault_NoActionBar_TranslucentDecor.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_NoActionBar_TranslucentDecor.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_NoActionBar_TranslucentDecor.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for dialog windows and activities. This changes the window to be
    // floating (not fill the entire screen), and puts a frame around its contents. You can set this
    // theme on an activity if you would like to make an activity that looks like a Dialog.
    coreTheme_DeviceDefault_Dialog.styles["windowTitleStyle"] = coreDialogWindowTitle_DeviceDefault
    coreTheme_DeviceDefault_Dialog.styles["windowAnimationStyle"] = coreAnimation_DeviceDefault_Dialog
    coreTheme_DeviceDefault_Dialog.styles["buttonBarStyle"] = coreDeviceDefault_ButtonBar_AlertDialog
    coreTheme_DeviceDefault_Dialog.styles["borderlessButtonStyle"] = coreWidget_DeviceDefault_Button_Borderless_Small
    // Text styles
    coreTheme_DeviceDefault_Dialog.styles["textAppearance"] = coreTextAppearance_DeviceDefault
    coreTheme_DeviceDefault_Dialog.styles["textAppearanceInverse"] = coreTextAppearance_DeviceDefault_Inverse
    coreTheme_DeviceDefault_Dialog.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert

    // Variant of {@link #Theme_DeviceDefault_Dialog} that has a nice minimum width for a
    // regular dialog.
    val coreTheme_DeviceDefault_Dialog_MinWidth = ThemeDefinition("Theme.DeviceDefault.Dialog.MinWidth", coreTheme_Material_Dialog_MinWidth, true)
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_MinWidth.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_MinWidth.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_MinWidth.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Dialog} without an action bar
    val coreTheme_DeviceDefault_Dialog_NoActionBar = ThemeDefinition("Theme.DeviceDefault.Dialog.NoActionBar", coreTheme_Material_Dialog_NoActionBar, true)
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Dialog_NoActionBar} that has a nice minimum width
    // for a regular dialog.
    val coreTheme_DeviceDefault_Dialog_NoActionBar_MinWidth = ThemeDefinition("Theme.DeviceDefault.Dialog.NoActionBar.MinWidth", coreTheme_Material_Dialog_NoActionBar_MinWidth, true)
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_NoActionBar_MinWidth.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_NoActionBar_MinWidth.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_NoActionBar_MinWidth.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of Theme.DeviceDefault.Dialog that has a fixed size.
    val coreTheme_DeviceDefault_Dialog_FixedSize = ThemeDefinition("Theme.DeviceDefault.Dialog.FixedSize", coreTheme_DeviceDefault_Dialog, true)

    // Variant of Theme.DeviceDefault.Dialog.NoActionBar that has a fixed size.
    val coreTheme_DeviceDefault_Dialog_NoActionBar_FixedSize = ThemeDefinition("Theme.DeviceDefault.Dialog.NoActionBar.FixedSize", coreTheme_DeviceDefault_Dialog_NoActionBar, true)

    // DeviceDefault theme for a window that will be displayed either full-screen on smaller
    // screens (small, normal) or as a dialog on larger screens (large, xlarge).
    val coreTheme_DeviceDefault_DialogWhenLarge = ThemeDefinition("Theme.DeviceDefault.DialogWhenLarge", coreTheme_Material_DialogWhenLarge, true)
    // Dialog attributes
    coreTheme_DeviceDefault_DialogWhenLarge.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_DialogWhenLarge.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_DialogWhenLarge.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for a window without an action bar that will be displayed either
    // full-screen on smaller screens (small, normal) or as a dialog on larger screens (large,
    // xlarge).
    val coreTheme_DeviceDefault_DialogWhenLarge_NoActionBar = ThemeDefinition("Theme.DeviceDefault.DialogWhenLarge.NoActionBar", coreTheme_Material_DialogWhenLarge_NoActionBar, true)
    // Dialog attributes
    coreTheme_DeviceDefault_DialogWhenLarge_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_DialogWhenLarge_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_DialogWhenLarge_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for a presentation window on a secondary display.
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_Presentation.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_Presentation.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_Presentation.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for panel windows. This removes all extraneous window
    // decorations, so you basically have an empty rectangle in which to place your content. It makes
    // the window floating, with a transparent background, and turns off dimming behind the window.
    val coreTheme_DeviceDefault_Panel = ThemeDefinition("Theme.DeviceDefault.Panel",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Panel"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Panel.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Panel.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Panel.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for windows that want to have the user's selected wallpaper appear
    // behind them.
    val coreTheme_DeviceDefault_Wallpaper = ThemeDefinition("Theme.DeviceDefault.Wallpaper",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Wallpaper"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Wallpaper.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Wallpaper.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Wallpaper.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault theme for windows that want to have the user's selected wallpaper appear
    // behind them and without an action bar.
    val coreTheme_DeviceDefault_Wallpaper_NoTitleBar = ThemeDefinition("Theme.DeviceDefault.Wallpaper.NoTitleBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Wallpaper.NoTitleBar"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Wallpaper_NoTitleBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Wallpaper_NoTitleBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Wallpaper_NoTitleBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault style for input methods, which is used by the
    // {@link android.inputmethodservice.InputMethodService} class.-->
    val coreTheme_DeviceDefault_InputMethod = ThemeDefinition("Theme.DeviceDefault.InputMethod",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.InputMethod"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_InputMethod.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_InputMethod.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_InputMethod.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault style for input methods, which is used by the
    // {@link android.service.voice.VoiceInteractionSession} class.-->
    val coreTheme_DeviceDefault_VoiceInteractionSession = ThemeDefinition("Theme.DeviceDefault.VoiceInteractionSession",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.VoiceInteractionSession"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_VoiceInteractionSession.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_VoiceInteractionSession.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_VoiceInteractionSession.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    coreTheme_DeviceDefault_Dialog_Alert.styles["windowTitleStyle"] = coreDialogWindowTitle_DeviceDefault
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_Alert.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_Alert.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_Alert.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Dialog attributes
    coreTheme_DeviceDefault_SearchBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_SearchBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_SearchBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    val coreTheme_DeviceDefault_Dialog_NoFrame = ThemeDefinition("Theme.DeviceDefault.Dialog.NoFrame",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Dialog.NoFrame"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Dialog_NoFrame.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Dialog_NoFrame.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Dialog_NoFrame.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault} with a light-colored style
    val coreTheme_DeviceDefault_Light = ThemeDefinition("Theme.DeviceDefault.Light",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light"), true)

    // Text styles
    coreTheme_DeviceDefault_Light.styles["textAppearance"] = coreTextAppearance_DeviceDefault
    coreTheme_DeviceDefault_Light.styles["textAppearanceInverse"] = coreTextAppearance_DeviceDefault_Inverse
    coreTheme_DeviceDefault_Light.styles["textAppearanceLarge"] = coreTextAppearance_DeviceDefault_Large
    coreTheme_DeviceDefault_Light.styles["textAppearanceMedium"] = coreTextAppearance_DeviceDefault_Medium
    coreTheme_DeviceDefault_Light.styles["textAppearanceSmall"] = coreTextAppearance_DeviceDefault_Small
    coreTheme_DeviceDefault_Light.styles["textAppearanceLargeInverse"] = coreTextAppearance_DeviceDefault_Large_Inverse
    coreTheme_DeviceDefault_Light.styles["textAppearanceMediumInverse"] = coreTextAppearance_DeviceDefault_Medium_Inverse
    coreTheme_DeviceDefault_Light.styles["textAppearanceSmallInverse"] = coreTextAppearance_DeviceDefault_Small_Inverse
    coreTheme_DeviceDefault_Light.styles["textAppearanceSearchResultTitle"] = coreTextAppearance_DeviceDefault_SearchResult_Title
    coreTheme_DeviceDefault_Light.styles["textAppearanceSearchResultSubtitle"] = coreTextAppearance_DeviceDefault_SearchResult_Subtitle
    coreTheme_DeviceDefault_Light.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    coreTheme_DeviceDefault_Light.styles["textAppearanceLargePopupMenu"] = coreTextAppearance_DeviceDefault_Widget_PopupMenu_Large
    coreTheme_DeviceDefault_Light.styles["textAppearanceSmallPopupMenu"] = coreTextAppearance_DeviceDefault_Widget_PopupMenu_Small
    // Button styles
    coreTheme_DeviceDefault_Light.styles["buttonStyle"] = coreWidget_DeviceDefault_Light_Button
    coreTheme_DeviceDefault_Light.styles["buttonStyleSmall"] = coreWidget_DeviceDefault_Light_Button_Small
    coreTheme_DeviceDefault_Light.styles["buttonStyleInset"] = coreWidget_DeviceDefault_Light_Button_Inset
    coreTheme_DeviceDefault_Light.styles["buttonStyleToggle"] = coreWidget_DeviceDefault_Light_Button_Toggle
    coreTheme_DeviceDefault_Light.styles["borderlessButtonStyle"] = coreWidget_DeviceDefault_Light_Button_Borderless
    coreTheme_DeviceDefault_Light.styles["listSeparatorTextViewStyle"] = coreWidget_DeviceDefault_Light_TextView_ListSeparator
    coreTheme_DeviceDefault_Light.styles["windowTitleStyle"] = coreWindowTitle_DeviceDefault
    coreTheme_DeviceDefault_Light.styles["windowTitleBackgroundStyle"] = coreWindowTitleBackground_DeviceDefault
    coreTheme_DeviceDefault_Light.styles["windowAnimationStyle"] = coreAnimation_DeviceDefault_Activity
    // Dialog attributes
    coreTheme_DeviceDefault_Light.styles["dialogTheme"] = coreTheme_DeviceDefault_Light_Dialog
    // AlertDialog attributes
    coreTheme_DeviceDefault_Light.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    coreTheme_DeviceDefault_Light.styles["alertDialogStyle"] = coreAlertDialog_DeviceDefault_Light
    // Presentation attributes
    coreTheme_DeviceDefault_Light.styles["presentationTheme"] = coreTheme_DeviceDefault_Light_Dialog_Presentation
    // Text selection handle attributes
    coreTheme_DeviceDefault_Light.styles["textSelectHandleWindowStyle"] = coreWidget_DeviceDefault_TextSelectHandle
    // Widget styles
    coreTheme_DeviceDefault_Light.styles["absListViewStyle"] = coreWidget_DeviceDefault_Light_AbsListView
    coreTheme_DeviceDefault_Light.styles["autoCompleteTextViewStyle"] = coreWidget_DeviceDefault_Light_AutoCompleteTextView
    coreTheme_DeviceDefault_Light.styles["checkboxStyle"] = coreWidget_DeviceDefault_Light_CompoundButton_CheckBox
    coreTheme_DeviceDefault_Light.styles["checkedTextViewStyle"] = coreWidget_DeviceDefault_Light_CheckedTextView
    coreTheme_DeviceDefault_Light.styles["dropDownListViewStyle"] = coreWidget_DeviceDefault_Light_ListView_DropDown
    coreTheme_DeviceDefault_Light.styles["editTextStyle"] = coreWidget_DeviceDefault_Light_EditText
    coreTheme_DeviceDefault_Light.styles["expandableListViewStyle"] = coreWidget_DeviceDefault_Light_ExpandableListView
    coreTheme_DeviceDefault_Light.styles["expandableListViewWhiteStyle"] = coreWidget_DeviceDefault_Light_ExpandableListView_White
    coreTheme_DeviceDefault_Light.styles["galleryStyle"] = coreWidget_DeviceDefault_Light_Gallery
    coreTheme_DeviceDefault_Light.styles["gestureOverlayViewStyle"] = coreWidget_DeviceDefault_Light_GestureOverlayView
    coreTheme_DeviceDefault_Light.styles["gridViewStyle"] = coreWidget_DeviceDefault_Light_GridView
    coreTheme_DeviceDefault_Light.styles["imageButtonStyle"] = coreWidget_DeviceDefault_Light_ImageButton
    coreTheme_DeviceDefault_Light.styles["imageWellStyle"] = coreWidget_DeviceDefault_Light_ImageWell
    coreTheme_DeviceDefault_Light.styles["listViewStyle"] = coreWidget_DeviceDefault_Light_ListView
    coreTheme_DeviceDefault_Light.styles["listViewWhiteStyle"] = coreWidget_DeviceDefault_Light_ListView_White
    coreTheme_DeviceDefault_Light.styles["popupWindowStyle"] = coreWidget_DeviceDefault_Light_PopupWindow
    coreTheme_DeviceDefault_Light.styles["progressBarStyle"] = coreWidget_DeviceDefault_Light_ProgressBar
    coreTheme_DeviceDefault_Light.styles["progressBarStyleHorizontal"] = coreWidget_DeviceDefault_Light_ProgressBar_Horizontal
    coreTheme_DeviceDefault_Light.styles["progressBarStyleSmall"] = coreWidget_DeviceDefault_Light_ProgressBar_Small
    coreTheme_DeviceDefault_Light.styles["progressBarStyleSmallTitle"] = coreWidget_DeviceDefault_Light_ProgressBar_Small_Title
    coreTheme_DeviceDefault_Light.styles["progressBarStyleLarge"] = coreWidget_DeviceDefault_Light_ProgressBar_Large
    coreTheme_DeviceDefault_Light.styles["progressBarStyleInverse"] = coreWidget_DeviceDefault_Light_ProgressBar_Inverse
    coreTheme_DeviceDefault_Light.styles["progressBarStyleSmallInverse"] = coreWidget_DeviceDefault_Light_ProgressBar_Small_Inverse
    coreTheme_DeviceDefault_Light.styles["progressBarStyleLargeInverse"] = coreWidget_DeviceDefault_Light_ProgressBar_Large_Inverse
    coreTheme_DeviceDefault_Light.styles["seekBarStyle"] = coreWidget_DeviceDefault_Light_SeekBar
    coreTheme_DeviceDefault_Light.styles["ratingBarStyle"] = coreWidget_DeviceDefault_Light_RatingBar
    coreTheme_DeviceDefault_Light.styles["ratingBarStyleIndicator"] = coreWidget_DeviceDefault_Light_RatingBar_Indicator
    coreTheme_DeviceDefault_Light.styles["ratingBarStyleSmall"] = coreWidget_DeviceDefault_Light_RatingBar_Small
    coreTheme_DeviceDefault_Light.styles["radioButtonStyle"] = coreWidget_DeviceDefault_Light_CompoundButton_RadioButton
    coreTheme_DeviceDefault_Light.styles["scrollViewStyle"] = coreWidget_DeviceDefault_Light_ScrollView
    coreTheme_DeviceDefault_Light.styles["horizontalScrollViewStyle"] = coreWidget_DeviceDefault_Light_HorizontalScrollView
    coreTheme_DeviceDefault_Light.styles["dropDownSpinnerStyle"] = coreWidget_DeviceDefault_Light_Spinner_DropDown
    coreTheme_DeviceDefault_Light.styles["starStyle"] = coreWidget_DeviceDefault_Light_CompoundButton_Star
    coreTheme_DeviceDefault_Light.styles["tabWidgetStyle"] = coreWidget_DeviceDefault_Light_TabWidget
    coreTheme_DeviceDefault_Light.styles["textViewStyle"] = coreWidget_DeviceDefault_Light_TextView
    coreTheme_DeviceDefault_Light.styles["webTextViewStyle"] = coreWidget_DeviceDefault_Light_WebTextView
    coreTheme_DeviceDefault_Light.styles["webViewStyle"] = coreWidget_DeviceDefault_Light_WebView
    coreTheme_DeviceDefault_Light.styles["dropDownItemStyle"] = coreWidget_DeviceDefault_Light_DropDownItem
    coreTheme_DeviceDefault_Light.styles["spinnerDropDownItemStyle"] = coreWidget_DeviceDefault_Light_DropDownItem_Spinner
    coreTheme_DeviceDefault_Light.styles["spinnerItemStyle"] = coreWidget_DeviceDefault_Light_TextView_SpinnerItem
    coreTheme_DeviceDefault_Light.styles["dropDownHintAppearance"] = coreTextAppearance_DeviceDefault_Widget_DropDownHint
    coreTheme_DeviceDefault_Light.styles["keyboardViewStyle"] = coreWidget_DeviceDefault_KeyboardView
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleWindowSmall"] = coreWidget_DeviceDefault_QuickContactBadge_WindowSmall
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleWindowMedium"] = coreWidget_DeviceDefault_QuickContactBadge_WindowMedium
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleWindowLarge"] = coreWidget_DeviceDefault_QuickContactBadge_WindowLarge
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleSmallWindowSmall"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowSmall
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleSmallWindowMedium"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowMedium
    coreTheme_DeviceDefault_Light.styles["quickContactBadgeStyleSmallWindowLarge"] = coreWidget_DeviceDefault_QuickContactBadgeSmall_WindowLarge
    coreTheme_DeviceDefault_Light.styles["listPopupWindowStyle"] = coreWidget_DeviceDefault_Light_ListPopupWindow
    coreTheme_DeviceDefault_Light.styles["popupMenuStyle"] = coreWidget_DeviceDefault_Light_PopupMenu
    coreTheme_DeviceDefault_Light.styles["stackViewStyle"] = coreWidget_DeviceDefault_Light_StackView
    // Preference styles
    coreTheme_DeviceDefault_Light.styles["preferenceScreenStyle"] = corePreference_DeviceDefault_PreferenceScreen
    coreTheme_DeviceDefault_Light.styles["preferenceCategoryStyle"] = corePreference_DeviceDefault_Category
    coreTheme_DeviceDefault_Light.styles["preferenceStyle"] = corePreference_DeviceDefault
    coreTheme_DeviceDefault_Light.styles["preferenceInformationStyle"] = corePreference_DeviceDefault_Information
    coreTheme_DeviceDefault_Light.styles["checkBoxPreferenceStyle"] = corePreference_DeviceDefault_CheckBoxPreference
    coreTheme_DeviceDefault_Light.styles["switchPreferenceStyle"] = corePreference_DeviceDefault_SwitchPreference
    coreTheme_DeviceDefault_Light.styles["seekBarPreferenceStyle"] = corePreference_DeviceDefault_SeekBarPreference
    coreTheme_DeviceDefault_Light.styles["yesNoPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference_YesNoPreference
    coreTheme_DeviceDefault_Light.styles["dialogPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference
    coreTheme_DeviceDefault_Light.styles["editTextPreferenceStyle"] = corePreference_DeviceDefault_DialogPreference_EditTextPreference
    coreTheme_DeviceDefault_Light.styles["ringtonePreferenceStyle"] = corePreference_DeviceDefault_RingtonePreference
    // Action bar styles
    coreTheme_DeviceDefault_Light.styles["actionDropDownStyle"] = coreWidget_DeviceDefault_Light_Spinner_DropDown_ActionBar
    coreTheme_DeviceDefault_Light.styles["actionButtonStyle"] = coreWidget_DeviceDefault_Light_ActionButton
    coreTheme_DeviceDefault_Light.styles["actionOverflowButtonStyle"] = coreWidget_DeviceDefault_Light_ActionButton_Overflow
    coreTheme_DeviceDefault_Light.styles["actionBarTabStyle"] = coreWidget_DeviceDefault_Light_ActionBar_TabView
    coreTheme_DeviceDefault_Light.styles["actionBarTabBarStyle"] = coreWidget_DeviceDefault_Light_ActionBar_TabBar
    coreTheme_DeviceDefault_Light.styles["actionBarTabTextStyle"] = coreWidget_DeviceDefault_Light_ActionBar_TabText
    coreTheme_DeviceDefault_Light.styles["actionModeStyle"] = coreWidget_DeviceDefault_Light_ActionMode
    coreTheme_DeviceDefault_Light.styles["actionModeCloseButtonStyle"] = coreWidget_DeviceDefault_Light_ActionButton_CloseMode
    coreTheme_DeviceDefault_Light.styles["actionBarStyle"] = coreWidget_DeviceDefault_Light_ActionBar_Solid
    coreTheme_DeviceDefault_Light.styles["actionModePopupWindowStyle"] = coreWidget_DeviceDefault_Light_PopupWindow_ActionMode
    coreTheme_DeviceDefault_Light.styles["buttonBarStyle"] = coreDeviceDefault_Light_ButtonBar
    coreTheme_DeviceDefault_Light.styles["segmentedButtonStyle"] = coreDeviceDefault_Light_SegmentedButton
    coreTheme_DeviceDefault_Light.styles["searchDialogTheme"] = coreTheme_DeviceDefault_Light_SearchBar
    // NumberPicker style
    coreTheme_DeviceDefault_Light.styles["numberPickerStyle"] = coreWidget_DeviceDefault_Light_NumberPicker
    // CalendarView style-->
    coreTheme_DeviceDefault_Light.styles["calendarViewStyle"] = coreWidget_DeviceDefault_Light_CalendarView
    // TimePicker style
    coreTheme_DeviceDefault_Light.styles["timePickerStyle"] = coreWidget_DeviceDefault_Light_TimePicker
    // DatePicker style
    coreTheme_DeviceDefault_Light.styles["datePickerStyle"] = coreWidget_DeviceDefault_Light_DatePicker
    coreTheme_DeviceDefault_Light.styles["mediaRouteButtonStyle"] = coreWidget_DeviceDefault_Light_MediaRouteButton

    // Variant of the DeviceDefault (light) theme that has a solid (opaque) action bar with an
    // inverse color profile.
    val coreTheme_DeviceDefault_Light_DarkActionBar = ThemeDefinition("Theme.DeviceDefault.Light.DarkActionBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.DarkActionBar"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_DarkActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_DarkActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_DarkActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light} with no action bar
    val coreTheme_DeviceDefault_Light_NoActionBar = ThemeDefinition("Theme.DeviceDefault.Light.NoActionBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.NoActionBar"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light} with no action bar and no status bar.
    // This theme sets {@link android.R.attr#windowFullscreen} to true.
    val coreTheme_DeviceDefault_Light_NoActionBar_Fullscreen = ThemeDefinition("Theme.DeviceDefault.Light.NoActionBar.Fullscreen",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.NoActionBar.Fullscreen"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_NoActionBar_Fullscreen.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_NoActionBar_Fullscreen.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_NoActionBar_Fullscreen.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light} with no action bar and no status bar
    // and extending in to overscan region.  This theme
    // sets {@link android.R.attr#windowFullscreen} and {@link android.R.attr#windowOverscan}
    // to true.
    val coreTheme_DeviceDefault_Light_NoActionBar_Overscan = ThemeDefinition("Theme.DeviceDefault.Light.NoActionBar.Overscan",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.NoActionBar.Overscan"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_NoActionBar_Overscan.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_NoActionBar_Overscan.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_NoActionBar_Overscan.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light} that has no title bar and translucent
    // system decor.  This theme sets {@link android.R.attr#windowTranslucentStatus} and
    // {@link android.R.attr#windowTranslucentNavigation} to true.
    val coreTheme_DeviceDefault_Light_NoActionBar_TranslucentDecor = ThemeDefinition("Theme.DeviceDefault.Light.NoActionBar.TranslucentDecor",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.NoActionBar.TranslucentDecor"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_NoActionBar_TranslucentDecor.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_NoActionBar_TranslucentDecor.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_NoActionBar_TranslucentDecor.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault light theme for dialog windows and activities. This changes the window to be
    // floating (not fill the entire screen), and puts a frame around its contents. You can set this
    // theme on an activity if you would like to make an activity that looks like a Dialog.-->
    coreTheme_DeviceDefault_Light_Dialog.styles["windowTitleStyle"] = coreDialogWindowTitle_DeviceDefault_Light
    coreTheme_DeviceDefault_Light_Dialog.styles["windowAnimationStyle"] = coreAnimation_DeviceDefault_Dialog
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog.styles["textAppearance"] = coreTextAppearance_DeviceDefault
    coreTheme_DeviceDefault_Light_Dialog.styles["textAppearanceInverse"] = coreTextAppearance_DeviceDefault_Inverse
    coreTheme_DeviceDefault_Light_Dialog.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog.styles["buttonBarStyle"] = coreDeviceDefault_Light_ButtonBar_AlertDialog
    coreTheme_DeviceDefault_Light_Dialog.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog
    coreTheme_DeviceDefault_Light_Dialog.styles["borderlessButtonStyle"] = coreWidget_DeviceDefault_Light_Button_Borderless_Small

    // Variant of {@link #Theme_DeviceDefault_Light_Dialog} that has a nice minimum width for a
    // regular dialog.
    val coreTheme_DeviceDefault_Light_Dialog_MinWidth = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.MinWidth",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog.MinWidth"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog_MinWidth.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog_MinWidth.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog_MinWidth.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light_Dialog} without an action bar
    val coreTheme_DeviceDefault_Light_Dialog_NoActionBar = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.NoActionBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog.NoActionBar"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of {@link #Theme_DeviceDefault_Light_Dialog_NoActionBar} that has a nice minimum
    // width for a regular dialog.
    val coreTheme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Dialog.NoActionBar.MinWidth"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Variant of Theme.DeviceDefault.Dialog that has a fixed size.
    val coreTheme_DeviceDefault_Light_Dialog_FixedSize = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.FixedSize", coreTheme_DeviceDefault_Light_Dialog, true)

    // Variant of Theme.DeviceDefault.Dialog.NoActionBar that has a fixed size.
    val coreTheme_DeviceDefault_Light_Dialog_NoActionBar_FixedSize = ThemeDefinition("Theme.DeviceDefault.Light.Dialog.NoActionBar.FixedSize", coreTheme_DeviceDefault_Light_Dialog_NoActionBar, true)

    // DeviceDefault light theme for a window that will be displayed either full-screen on smaller
    // screens (small, normal) or as a dialog on larger screens (large, xlarge).
    val coreTheme_DeviceDefault_Light_DialogWhenLarge = ThemeDefinition("Theme.DeviceDefault.Light.DialogWhenLarge",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.DialogWhenLarge"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_DialogWhenLarge.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_DialogWhenLarge.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_DialogWhenLarge.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault light theme for a window without an action bar that will be displayed either
    // full-screen on smaller screens (small, normal) or as a dialog on larger screens (large,
    // xlarge).
    val coreTheme_DeviceDefault_Light_DialogWhenLarge_NoActionBar = ThemeDefinition("Theme.DeviceDefault.Light.DialogWhenLarge.NoActionBar",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.DialogWhenLarge.NoActionBar"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_DialogWhenLarge_NoActionBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_DialogWhenLarge_NoActionBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_DialogWhenLarge_NoActionBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault light theme for a presentation window on a secondary display.
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog_Presentation.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog_Presentation.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog_Presentation.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // DeviceDefault light theme for panel windows. This removes all extraneous window
    // decorations, so you basically have an empty rectangle in which to place your content. It makes
    // the window floating, with a transparent background, and turns off dimming behind the window.
    val coreTheme_DeviceDefault_Light_Panel = ThemeDefinition("Theme.DeviceDefault.Light.Panel",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Panel"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Panel.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Panel.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Panel.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Dialog attributes
    coreTheme_DeviceDefault_Light_Dialog_Alert.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Dialog_Alert.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Dialog_Alert.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    // Dialog attributes
    coreTheme_DeviceDefault_Light_SearchBar.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_SearchBar.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_SearchBar.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    val coreTheme_DeviceDefault_Light_Voice = ThemeDefinition("Theme.DeviceDefault.Light.Voice",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Light.Voice"), true)
    // Dialog attributes
    coreTheme_DeviceDefault_Light_Voice.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Light_Voice.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Light_Voice.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    @Hide("""Theme overlay that inherits from material actionbar, and use accent color for
    primary text""")
    val coreThemeOverlay_DeviceDefault_ActionBar_Accent = ThemeDefinition("ThemeOverlay.DeviceDefault.ActionBar.Accent",
            ThemeDictionary.getThemeDefinition("", "ThemeOverlay.Material.ActionBar"), true)

    @Hide("Theme overlay for a light popup in action bar")
    val coreThemeOverlay_DeviceDefault_Popup_Light = ThemeDefinition("ThemeOverlay.DeviceDefault.Popup.Light",
            ThemeDictionary.getThemeDefinition("", "ThemeOverlay.Material.Light"), true)

    // DeviceDefault theme for a window that should look like the Settings app.
    val coreTheme_DeviceDefault_Settings = ThemeDefinition("Theme.DeviceDefault.Settings",
            ThemeDictionary.getThemeDefinition("", "Theme.Material.Settings"), true)
    // action bar
    coreTheme_DeviceDefault_Settings.styles["actionBarTheme"] = coreThemeOverlay_DeviceDefault_ActionBar_Accent
    coreTheme_DeviceDefault_Settings.styles["popupTheme"] = coreThemeOverlay_DeviceDefault_Popup_Light
    // Dialog attributes
    coreTheme_DeviceDefault_Settings.styles["alertDialogTheme"] = coreTheme_DeviceDefault_Light_Dialog_Alert
    // Text styles
    coreTheme_DeviceDefault_Settings.styles["textAppearanceButton"] = coreTextAppearance_DeviceDefault_Widget_Button
    // Button styles
    coreTheme_DeviceDefault_Settings.styles["buttonBarButtonStyle"] = coreWidget_DeviceDefault_Button_ButtonBar_AlertDialog

    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Dialog)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_DialogWhenLarge)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_DialogWhenLarge_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Dialog_Alert)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Dialog_MinWidth)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Dialog_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Dialog_NoActionBar_MinWidth)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_InputMethod)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_DarkActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Dialog)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_DialogWhenLarge)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_DialogWhenLarge_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Dialog_Alert)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Dialog_MinWidth)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Dialog_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_NoActionBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_NoActionBar_Overscan)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_NoActionBar_TranslucentDecor)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Light_Panel)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_NoActionBar)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_NoActionBar_Fullscreen)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_NoActionBar_Overscan)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_NoActionBar_TranslucentDecor)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Panel)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Settings)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Wallpaper)
    ThemeDictionary.putThemeDefinition("", coreTheme_DeviceDefault_Wallpaper_NoTitleBar)

}
