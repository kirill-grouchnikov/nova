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
package dev.android.playground.nova.core.framework.generated

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.*
import dev.android.playground.nova.core.framework.styleables.*

open class CoreThemeStyle2 : CoreWindowStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.absListViewStyle::class)
	open var absListViewStyle: CoreAbsListViewStyle2? by InlineStyleDelegate()
	open fun absListViewStyle(init: CoreAbsListViewStyle2.() -> Unit)
		= initInlineStyle(CoreAbsListViewStyle2(), "absListViewStyle", init)

	@DefinedBy(CoreThemeStyleable.accessibilityFocusedDrawable::class)
	open var accessibilityFocusedDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun accessibilityFocusedDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.accessibilityFocusedDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionBarDivider::class)
	open var actionBarDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionBarDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionBarDivider::class, init)

	@DefinedBy(CoreThemeStyleable.actionBarItemBackground::class)
	open var actionBarItemBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionBarItemBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionBarItemBackground::class, init)

	@DefinedBy(CoreThemeStyleable.actionBarPopupTheme::class)
	open var actionBarPopupTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun actionBarPopupTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "actionBarPopupTheme", init)

	@DefinedBy(CoreThemeStyleable.actionBarSize::class)
	open var actionBarSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun actionBarSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionBarSize::class, init)


	@DefinedBy(CoreThemeStyleable.actionBarStyle::class)
	open var actionBarStyle: CoreActionBarStyle2? by InlineStyleDelegate()
	open fun actionBarStyle(init: CoreActionBarStyle2.() -> Unit)
		= initInlineStyle(CoreActionBarStyle2(), "actionBarStyle", init)




	@DefinedBy(CoreThemeStyleable.actionBarTheme::class)
	open var actionBarTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun actionBarTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "actionBarTheme", init)

	@DefinedBy(CoreThemeStyleable.actionBarWidgetTheme::class)
	open var actionBarWidgetTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun actionBarWidgetTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "actionBarWidgetTheme", init)



	@DefinedBy(CoreThemeStyleable.actionMenuTextAppearance::class)
	open var actionMenuTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun actionMenuTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "actionMenuTextAppearance", init)

	@DefinedBy(CoreThemeStyleable.actionMenuTextColor::class)
	open var actionMenuTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionMenuTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionMenuTextColor::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeBackground::class)
	open var actionModeBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeBackground::class, init)


	@DefinedBy(CoreThemeStyleable.actionModeCloseDrawable::class)
	open var actionModeCloseDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeCloseDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeCloseDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeCopyDrawable::class)
	open var actionModeCopyDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeCopyDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeCopyDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeCutDrawable::class)
	open var actionModeCutDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeCutDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeCutDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeFindDrawable::class)
	open var actionModeFindDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeFindDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeFindDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModePasteDrawable::class)
	open var actionModePasteDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModePasteDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModePasteDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModePopupWindowStyle::class)
	open var actionModePopupWindowStyle: CoreWindowStyle2? by InlineStyleDelegate()
	open fun actionModePopupWindowStyle(init: CoreWindowStyle2.() -> Unit)
		= initInlineStyle(CoreWindowStyle2(), "actionModePopupWindowStyle", init)

	@DefinedBy(CoreThemeStyleable.actionModeSelectAllDrawable::class)
	open var actionModeSelectAllDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeSelectAllDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeSelectAllDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeShareDrawable::class)
	open var actionModeShareDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeShareDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeShareDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeSplitBackground::class)
	open var actionModeSplitBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeSplitBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeSplitBackground::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeStyle::class)
	open var actionModeStyle: CoreActionModeStyle2? by InlineStyleDelegate()
	open fun actionModeStyle(init: CoreActionModeStyle2.() -> Unit)
		= initInlineStyle(CoreActionModeStyle2(), "actionModeStyle", init)

	@DefinedBy(CoreThemeStyleable.actionModeWebSearchDrawable::class)
	open var actionModeWebSearchDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeWebSearchDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeWebSearchDrawable::class, init)



	@DefinedBy(CoreThemeStyleable.activatedBackgroundIndicator::class)
	open var activatedBackgroundIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activatedBackgroundIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.activatedBackgroundIndicator::class, init)

	@DefinedBy(CoreThemeStyleable.activityChooserViewStyle::class)
	open var activityChooserViewStyle: CoreActivityChooserViewStyle2? by InlineStyleDelegate()
	open fun activityChooserViewStyle(init: CoreActivityChooserViewStyle2.() -> Unit)
		= initInlineStyle(CoreActivityChooserViewStyle2(), "activityChooserViewStyle", init)


	@DefinedBy(CoreThemeStyleable.alertDialogCenterButtons::class)
	open var alertDialogCenterButtons: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun alertDialogCenterButtons(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.alertDialogCenterButtons::class, init)

	@DefinedBy(CoreThemeStyleable.alertDialogIcon::class)
	open var alertDialogIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun alertDialogIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.alertDialogIcon::class, init)

	@DefinedBy(CoreThemeStyleable.alertDialogStyle::class)
	open var alertDialogStyle: CoreAlertDialogStyle2? by InlineStyleDelegate()
	open fun alertDialogStyle(init: CoreAlertDialogStyle2.() -> Unit)
		= initInlineStyle(CoreAlertDialogStyle2(), "alertDialogStyle", init)

	@DefinedBy(CoreThemeStyleable.alertDialogTheme::class)
	open var alertDialogTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun alertDialogTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "alertDialogTheme", init)

	@DefinedBy(CoreThemeStyleable.ambientShadowAlpha::class)
	open var ambientShadowAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun ambientShadowAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.ambientShadowAlpha::class, init)

	@DefinedBy(CoreThemeStyleable.autoCompleteTextViewStyle::class)
	open var autoCompleteTextViewStyle: CoreAutoCompleteTextViewStyle2? by InlineStyleDelegate()
	open fun autoCompleteTextViewStyle(init: CoreAutoCompleteTextViewStyle2.() -> Unit)
		= initInlineStyle(CoreAutoCompleteTextViewStyle2(), "autoCompleteTextViewStyle", init)

	@DefinedBy(CoreThemeStyleable.autofillDatasetPickerMaxHeight::class)
	open var autofillDatasetPickerMaxHeight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autofillDatasetPickerMaxHeight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.autofillDatasetPickerMaxHeight::class, init)

	@DefinedBy(CoreThemeStyleable.autofillDatasetPickerMaxWidth::class)
	open var autofillDatasetPickerMaxWidth: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autofillDatasetPickerMaxWidth(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.autofillDatasetPickerMaxWidth::class, init)

	@DefinedBy(CoreThemeStyleable.autofillSaveCustomSubtitleMaxHeight::class)
	open var autofillSaveCustomSubtitleMaxHeight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autofillSaveCustomSubtitleMaxHeight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.autofillSaveCustomSubtitleMaxHeight::class, init)

	@DefinedBy(CoreThemeStyleable.autofilledHighlight::class)
	open var autofilledHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autofilledHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.autofilledHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.backgroundDimAmount::class)
	open override var backgroundDimAmount: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open override fun backgroundDimAmount(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.backgroundDimAmount::class, init)

	@DefinedBy(CoreThemeStyleable.backgroundDimEnabled::class)
	open override var backgroundDimEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun backgroundDimEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.backgroundDimEnabled::class, init)

	@DefinedBy(CoreThemeStyleable.borderlessButtonStyle::class)
	open var borderlessButtonStyle: CoreButtonStyle2? by InlineStyleDelegate()
	open fun borderlessButtonStyle(init: CoreButtonStyle2.() -> Unit)
		= initInlineStyle(CoreButtonStyle2(), "borderlessButtonStyle", init)






	@DefinedBy(CoreThemeStyleable.buttonStyle::class)
	open var buttonStyle: CoreButtonStyle2? by InlineStyleDelegate()
	open fun buttonStyle(init: CoreButtonStyle2.() -> Unit)
		= initInlineStyle(CoreButtonStyle2(), "buttonStyle", init)

	@DefinedBy(CoreThemeStyleable.buttonStyleInset::class)
	open var buttonStyleInset: CoreButtonStyle2? by InlineStyleDelegate()
	open fun buttonStyleInset(init: CoreButtonStyle2.() -> Unit)
		= initInlineStyle(CoreButtonStyle2(), "buttonStyleInset", init)

	@DefinedBy(CoreThemeStyleable.buttonStyleSmall::class)
	open var buttonStyleSmall: CoreButtonStyle2? by InlineStyleDelegate()
	open fun buttonStyleSmall(init: CoreButtonStyle2.() -> Unit)
		= initInlineStyle(CoreButtonStyle2(), "buttonStyleSmall", init)

	@DefinedBy(CoreThemeStyleable.buttonStyleToggle::class)
	open var buttonStyleToggle: CoreToggleButtonStyle2? by InlineStyleDelegate()
	open fun buttonStyleToggle(init: CoreToggleButtonStyle2.() -> Unit)
		= initInlineStyle(CoreToggleButtonStyle2(), "buttonStyleToggle", init)

	@DefinedBy(CoreThemeStyleable.calendarViewStyle::class)
	open var calendarViewStyle: CoreCalendarViewStyle2? by InlineStyleDelegate()
	open fun calendarViewStyle(init: CoreCalendarViewStyle2.() -> Unit)
		= initInlineStyle(CoreCalendarViewStyle2(), "calendarViewStyle", init)

	@DefinedBy(CoreThemeStyleable.candidatesTextStyleSpans::class)
	open var candidatesTextStyleSpans: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun candidatesTextStyleSpans(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.candidatesTextStyleSpans::class, init)

	@DefinedBy(CoreThemeStyleable.checkBoxPreferenceStyle::class)
	open var checkBoxPreferenceStyle: CoreCheckBoxPreferenceStyle2? by InlineStyleDelegate()
	open fun checkBoxPreferenceStyle(init: CoreCheckBoxPreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreCheckBoxPreferenceStyle2(), "checkBoxPreferenceStyle", init)


	@DefinedBy(CoreThemeStyleable.checkedTextViewStyle::class)
	open var checkedTextViewStyle: CoreCheckedTextViewStyle2? by InlineStyleDelegate()
	open fun checkedTextViewStyle(init: CoreCheckedTextViewStyle2.() -> Unit)
		= initInlineStyle(CoreCheckedTextViewStyle2(), "checkedTextViewStyle", init)

	@DefinedBy(CoreThemeStyleable.colorAccent::class)
	open var colorAccent: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorAccent(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorAccent::class, init)

	@DefinedBy(CoreThemeStyleable.colorActivatedHighlight::class)
	open var colorActivatedHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorActivatedHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorActivatedHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorBackground::class)
	open var colorBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorBackground::class, init)

	@DefinedBy(CoreThemeStyleable.colorBackgroundCacheHint::class)
	open var colorBackgroundCacheHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorBackgroundCacheHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorBackgroundCacheHint::class, init)

	@DefinedBy(CoreThemeStyleable.colorBackgroundFloating::class)
	open var colorBackgroundFloating: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorBackgroundFloating(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorBackgroundFloating::class, init)

	@DefinedBy(CoreThemeStyleable.colorButtonNormal::class)
	open var colorButtonNormal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorButtonNormal(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorButtonNormal::class, init)

	@DefinedBy(CoreThemeStyleable.colorControlActivated::class)
	open var colorControlActivated: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorControlActivated(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorControlActivated::class, init)

	@DefinedBy(CoreThemeStyleable.colorControlHighlight::class)
	open var colorControlHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorControlHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorControlHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorControlNormal::class)
	open var colorControlNormal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorControlNormal(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorControlNormal::class, init)

	@DefinedBy(CoreThemeStyleable.colorEdgeEffect::class)
	open var colorEdgeEffect: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorEdgeEffect(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorEdgeEffect::class, init)

	@DefinedBy(CoreThemeStyleable.colorError::class)
	open var colorError: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorError(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorError::class, init)

	@DefinedBy(CoreThemeStyleable.colorFocusedHighlight::class)
	open var colorFocusedHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorFocusedHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorFocusedHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorForeground::class)
	open var colorForeground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorForeground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorForeground::class, init)

	@DefinedBy(CoreThemeStyleable.colorForegroundInverse::class)
	open var colorForegroundInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorForegroundInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorForegroundInverse::class, init)

	@DefinedBy(CoreThemeStyleable.colorLongPressedHighlight::class)
	open var colorLongPressedHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorLongPressedHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorLongPressedHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorMultiSelectHighlight::class)
	open var colorMultiSelectHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorMultiSelectHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorMultiSelectHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorPressedHighlight::class)
	open var colorPressedHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorPressedHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorPressedHighlight::class, init)

	@DefinedBy(CoreThemeStyleable.colorPrimary::class)
	open var colorPrimary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorPrimary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorPrimary::class, init)

	@DefinedBy(CoreThemeStyleable.colorPrimaryDark::class)
	open var colorPrimaryDark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorPrimaryDark(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorPrimaryDark::class, init)

	@DefinedBy(CoreThemeStyleable.colorSecondary::class)
	open var colorSecondary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorSecondary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorSecondary::class, init)

	@DefinedBy(CoreThemeStyleable.colorSwitchThumbNormal::class)
	open var colorSwitchThumbNormal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorSwitchThumbNormal(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorSwitchThumbNormal::class, init)


	@DefinedBy(CoreThemeStyleable.datePickerDialogTheme::class)
	open var datePickerDialogTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun datePickerDialogTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "datePickerDialogTheme", init)

	@DefinedBy(CoreThemeStyleable.datePickerStyle::class)
	open var datePickerStyle: CoreDatePickerStyle2? by InlineStyleDelegate()
	open fun datePickerStyle(init: CoreDatePickerStyle2.() -> Unit)
		= initInlineStyle(CoreDatePickerStyle2(), "datePickerStyle", init)

	@DefinedBy(CoreThemeStyleable.detailsElementBackground::class)
	open var detailsElementBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun detailsElementBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.detailsElementBackground::class, init)

	@DefinedBy(CoreThemeStyleable.dialogCornerRadius::class)
	open var dialogCornerRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dialogCornerRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dialogCornerRadius::class, init)

	@DefinedBy(CoreThemeStyleable.dialogCustomTitleDecorLayout::class)
	open var dialogCustomTitleDecorLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogCustomTitleDecorLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dialogCustomTitleDecorLayout::class, init)

	@DefinedBy(CoreThemeStyleable.dialogPreferenceStyle::class)
	open var dialogPreferenceStyle: CoreDialogPreferenceStyle2? by InlineStyleDelegate()
	open fun dialogPreferenceStyle(init: CoreDialogPreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreDialogPreferenceStyle2(), "dialogPreferenceStyle", init)

	@DefinedBy(CoreThemeStyleable.dialogPreferredPadding::class)
	open var dialogPreferredPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dialogPreferredPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dialogPreferredPadding::class, init)

	@DefinedBy(CoreThemeStyleable.dialogTheme::class)
	open var dialogTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun dialogTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "dialogTheme", init)

	@DefinedBy(CoreThemeStyleable.dialogTitleDecorLayout::class)
	open var dialogTitleDecorLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogTitleDecorLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dialogTitleDecorLayout::class, init)

	@DefinedBy(CoreThemeStyleable.dialogTitleIconsDecorLayout::class)
	open var dialogTitleIconsDecorLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogTitleIconsDecorLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dialogTitleIconsDecorLayout::class, init)

	@DefinedBy(CoreThemeStyleable.disabledAlpha::class)
	open var disabledAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun disabledAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.disabledAlpha::class, init)

	@DefinedBy(CoreThemeStyleable.dividerHorizontal::class)
	open var dividerHorizontal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dividerHorizontal(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dividerHorizontal::class, init)

	@DefinedBy(CoreThemeStyleable.dividerVertical::class)
	open var dividerVertical: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dividerVertical(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dividerVertical::class, init)





	@DefinedBy(CoreThemeStyleable.dropdownListPreferredItemHeight::class)
	open var dropdownListPreferredItemHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dropdownListPreferredItemHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.dropdownListPreferredItemHeight::class, init)

	@DefinedBy(CoreThemeStyleable.editTextBackground::class)
	open var editTextBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun editTextBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.editTextBackground::class, init)

	@DefinedBy(CoreThemeStyleable.editTextColor::class)
	open var editTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun editTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.editTextColor::class, init)


	@DefinedBy(CoreThemeStyleable.editTextStyle::class)
	open var editTextStyle: CoreEditTextViewStyle2? by InlineStyleDelegate()
	open fun editTextStyle(init: CoreEditTextViewStyle2.() -> Unit)
		= initInlineStyle(CoreEditTextViewStyle2(), "editTextStyle", init)

	@DefinedBy(CoreThemeStyleable.errorMessageAboveBackground::class)
	open var errorMessageAboveBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun errorMessageAboveBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.errorMessageAboveBackground::class, init)

	@DefinedBy(CoreThemeStyleable.errorMessageBackground::class)
	open var errorMessageBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun errorMessageBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.errorMessageBackground::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredChildIndicatorLeft::class)
	open var expandableListPreferredChildIndicatorLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredChildIndicatorLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredChildIndicatorLeft::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredChildIndicatorRight::class)
	open var expandableListPreferredChildIndicatorRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredChildIndicatorRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredChildIndicatorRight::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredChildPaddingLeft::class)
	open var expandableListPreferredChildPaddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredChildPaddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredChildPaddingLeft::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredItemIndicatorLeft::class)
	open var expandableListPreferredItemIndicatorLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredItemIndicatorLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredItemIndicatorLeft::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredItemIndicatorRight::class)
	open var expandableListPreferredItemIndicatorRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredItemIndicatorRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredItemIndicatorRight::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListPreferredItemPaddingLeft::class)
	open var expandableListPreferredItemPaddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun expandableListPreferredItemPaddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.expandableListPreferredItemPaddingLeft::class, init)

	@DefinedBy(CoreThemeStyleable.expandableListViewStyle::class)
	open var expandableListViewStyle: CoreExpandableListViewStyle2? by InlineStyleDelegate()
	open fun expandableListViewStyle(init: CoreExpandableListViewStyle2.() -> Unit)
		= initInlineStyle(CoreExpandableListViewStyle2(), "expandableListViewStyle", init)

	@DefinedBy(CoreThemeStyleable.expandableListViewWhiteStyle::class)
	open var expandableListViewWhiteStyle: CoreExpandableListViewStyle2? by InlineStyleDelegate()
	open fun expandableListViewWhiteStyle(init: CoreExpandableListViewStyle2.() -> Unit)
		= initInlineStyle(CoreExpandableListViewStyle2(), "expandableListViewWhiteStyle", init)

	@DefinedBy(CoreThemeStyleable.fastScrollOverlayPosition::class)
	open var fastScrollOverlayPosition: Any? by GenericEnumDelegate<CoreThemeStyleable.FastScrollOverlayPositionEnum>(CoreThemeStyleable.FastScrollOverlayPositionEnum::class)

	@DefinedBy(CoreThemeStyleable.fastScrollPreviewBackgroundLeft::class)
	open var fastScrollPreviewBackgroundLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fastScrollPreviewBackgroundLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fastScrollPreviewBackgroundLeft::class, init)

	@DefinedBy(CoreThemeStyleable.fastScrollPreviewBackgroundRight::class)
	open var fastScrollPreviewBackgroundRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fastScrollPreviewBackgroundRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fastScrollPreviewBackgroundRight::class, init)

	@DefinedBy(CoreThemeStyleable.fastScrollTextColor::class)
	open var fastScrollTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fastScrollTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fastScrollTextColor::class, init)

	@DefinedBy(CoreThemeStyleable.fastScrollThumbDrawable::class)
	open var fastScrollThumbDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fastScrollThumbDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fastScrollThumbDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.fastScrollTrackDrawable::class)
	open var fastScrollTrackDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fastScrollTrackDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fastScrollTrackDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.findOnPageNextDrawable::class)
	open var findOnPageNextDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun findOnPageNextDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.findOnPageNextDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.findOnPagePreviousDrawable::class)
	open var findOnPagePreviousDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun findOnPagePreviousDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.findOnPagePreviousDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.fingerprintAuthDrawable::class)
	open var fingerprintAuthDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fingerprintAuthDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.fingerprintAuthDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarCloseDrawable::class)
	open var floatingToolbarCloseDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarCloseDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarCloseDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarDividerColor::class)
	open var floatingToolbarDividerColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarDividerColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarDividerColor::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarForegroundColor::class)
	open var floatingToolbarForegroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarForegroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarForegroundColor::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarItemBackgroundBorderlessDrawable::class)
	open var floatingToolbarItemBackgroundBorderlessDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarItemBackgroundBorderlessDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarItemBackgroundBorderlessDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarItemBackgroundDrawable::class)
	open var floatingToolbarItemBackgroundDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarItemBackgroundDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarItemBackgroundDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarOpenDrawable::class)
	open var floatingToolbarOpenDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarOpenDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarOpenDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.floatingToolbarPopupBackgroundDrawable::class)
	open var floatingToolbarPopupBackgroundDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun floatingToolbarPopupBackgroundDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.floatingToolbarPopupBackgroundDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.fragmentBreadCrumbsStyle::class)
	open var fragmentBreadCrumbsStyle: CoreFragmentBreadCrumbsStyle2? by InlineStyleDelegate()
	open fun fragmentBreadCrumbsStyle(init: CoreFragmentBreadCrumbsStyle2.() -> Unit)
		= initInlineStyle(CoreFragmentBreadCrumbsStyle2(), "fragmentBreadCrumbsStyle", init)

	@DefinedBy(CoreThemeStyleable.galleryItemBackground::class)
	open var galleryItemBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun galleryItemBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.galleryItemBackground::class, init)

	@DefinedBy(CoreThemeStyleable.galleryStyle::class)
	open var galleryStyle: CoreGalleryStyle2? by InlineStyleDelegate()
	open fun galleryStyle(init: CoreGalleryStyle2.() -> Unit)
		= initInlineStyle(CoreGalleryStyle2(), "galleryStyle", init)

	@DefinedBy(CoreThemeStyleable.gestureOverlayViewStyle::class)
	open var gestureOverlayViewStyle: CoreGestureOverlayViewStyle2? by InlineStyleDelegate()
	open fun gestureOverlayViewStyle(init: CoreGestureOverlayViewStyle2.() -> Unit)
		= initInlineStyle(CoreGestureOverlayViewStyle2(), "gestureOverlayViewStyle", init)

	@DefinedBy(CoreThemeStyleable.gridViewStyle::class)
	open var gridViewStyle: CoreGridViewStyle2? by InlineStyleDelegate()
	open fun gridViewStyle(init: CoreGridViewStyle2.() -> Unit)
		= initInlineStyle(CoreGridViewStyle2(), "gridViewStyle", init)

	@DefinedBy(CoreThemeStyleable.homeAsUpIndicator::class)
	open var homeAsUpIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeAsUpIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.homeAsUpIndicator::class, init)

	@DefinedBy(CoreThemeStyleable.horizontalScrollViewStyle::class)
	open var horizontalScrollViewStyle: CoreHorizontalScrollViewStyle2? by InlineStyleDelegate()
	open fun horizontalScrollViewStyle(init: CoreHorizontalScrollViewStyle2.() -> Unit)
		= initInlineStyle(CoreHorizontalScrollViewStyle2(), "horizontalScrollViewStyle", init)



	@DefinedBy(CoreThemeStyleable.isLightTheme::class)
	open var isLightTheme: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isLightTheme(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.isLightTheme::class, init)

	@DefinedBy(CoreThemeStyleable.lightRadius::class)
	open var lightRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightRadius::class, init)

	@DefinedBy(CoreThemeStyleable.lightY::class)
	open var lightY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightY::class, init)

	@DefinedBy(CoreThemeStyleable.lightZ::class)
	open var lightZ: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightZ(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightZ::class, init)

	@DefinedBy(CoreThemeStyleable.listChoiceBackgroundIndicator::class)
	open var listChoiceBackgroundIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listChoiceBackgroundIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listChoiceBackgroundIndicator::class, init)

	@DefinedBy(CoreThemeStyleable.listChoiceIndicatorMultiple::class)
	open var listChoiceIndicatorMultiple: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listChoiceIndicatorMultiple(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listChoiceIndicatorMultiple::class, init)

	@DefinedBy(CoreThemeStyleable.listChoiceIndicatorSingle::class)
	open var listChoiceIndicatorSingle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listChoiceIndicatorSingle(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listChoiceIndicatorSingle::class, init)

	@DefinedBy(CoreThemeStyleable.listDivider::class)
	open var listDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listDivider::class, init)

	@DefinedBy(CoreThemeStyleable.listDividerAlertDialog::class)
	open var listDividerAlertDialog: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listDividerAlertDialog(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listDividerAlertDialog::class, init)


	@DefinedBy(CoreThemeStyleable.listPopupWindowStyle::class)
	open var listPopupWindowStyle: CoreListPopupWindowStyle2? by InlineStyleDelegate()
	open fun listPopupWindowStyle(init: CoreListPopupWindowStyle2.() -> Unit)
		= initInlineStyle(CoreListPopupWindowStyle2(), "listPopupWindowStyle", init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemHeight::class)
	open var listPreferredItemHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemHeight::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemHeightLarge::class)
	open var listPreferredItemHeightLarge: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemHeightLarge(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemHeightLarge::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemHeightSmall::class)
	open var listPreferredItemHeightSmall: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemHeightSmall(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemHeightSmall::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemPaddingEnd::class)
	open var listPreferredItemPaddingEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemPaddingEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemPaddingEnd::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemPaddingLeft::class)
	open var listPreferredItemPaddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemPaddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemPaddingLeft::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemPaddingRight::class)
	open var listPreferredItemPaddingRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemPaddingRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemPaddingRight::class, init)

	@DefinedBy(CoreThemeStyleable.listPreferredItemPaddingStart::class)
	open var listPreferredItemPaddingStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun listPreferredItemPaddingStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.listPreferredItemPaddingStart::class, init)

	@DefinedBy(CoreThemeStyleable.listSeparatorTextViewStyle::class)
	open var listSeparatorTextViewStyle: CoreTextViewStyle2? by InlineStyleDelegate()
	open fun listSeparatorTextViewStyle(init: CoreTextViewStyle2.() -> Unit)
		= initInlineStyle(CoreTextViewStyle2(), "listSeparatorTextViewStyle", init)

	@DefinedBy(CoreThemeStyleable.listViewStyle::class)
	open var listViewStyle: CoreListViewStyle2? by InlineStyleDelegate()
	open fun listViewStyle(init: CoreListViewStyle2.() -> Unit)
		= initInlineStyle(CoreListViewStyle2(), "listViewStyle", init)


	@DefinedBy(CoreThemeStyleable.mapViewStyle::class)
	open var mapViewStyle: CoreMapViewStyle2? by InlineStyleDelegate()
	open fun mapViewStyle(init: CoreMapViewStyle2.() -> Unit)
		= initInlineStyle(CoreMapViewStyle2(), "mapViewStyle", init)

	@DefinedBy(CoreThemeStyleable.mediaRouteButtonStyle::class)
	open var mediaRouteButtonStyle: CoreMediaRouteButtonStyle2? by InlineStyleDelegate()
	open fun mediaRouteButtonStyle(init: CoreMediaRouteButtonStyle2.() -> Unit)
		= initInlineStyle(CoreMediaRouteButtonStyle2(), "mediaRouteButtonStyle", init)

	@DefinedBy(CoreThemeStyleable.numberPickerStyle::class)
	open var numberPickerStyle: CoreNumberPickerStyle2? by InlineStyleDelegate()
	open fun numberPickerStyle(init: CoreNumberPickerStyle2.() -> Unit)
		= initInlineStyle(CoreNumberPickerStyle2(), "numberPickerStyle", init)

	@DefinedBy(CoreThemeStyleable.panelBackground::class)
	open var panelBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun panelBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelBackground::class, init)

	@DefinedBy(CoreThemeStyleable.panelColorBackground::class)
	open var panelColorBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun panelColorBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelColorBackground::class, init)

	@DefinedBy(CoreThemeStyleable.panelColorForeground::class)
	open var panelColorForeground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun panelColorForeground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelColorForeground::class, init)

	@DefinedBy(CoreThemeStyleable.panelFullBackground::class)
	open var panelFullBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun panelFullBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelFullBackground::class, init)

	@DefinedBy(CoreThemeStyleable.panelMenuIsCompact::class)
	open var panelMenuIsCompact: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun panelMenuIsCompact(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelMenuIsCompact::class, init)

	@DefinedBy(CoreThemeStyleable.panelMenuListTheme::class)
	open var panelMenuListTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun panelMenuListTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "panelMenuListTheme", init)

	@DefinedBy(CoreThemeStyleable.panelMenuListWidth::class)
	open var panelMenuListWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun panelMenuListWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.panelMenuListWidth::class, init)

	@DefinedBy(CoreThemeStyleable.panelTextAppearance::class)
	open var panelTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun panelTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "panelTextAppearance", init)


	@DefinedBy(CoreThemeStyleable.popupWindowStyle::class)
	open var popupWindowStyle: CorePopupWindowStyle2? by InlineStyleDelegate()
	open fun popupWindowStyle(init: CorePopupWindowStyle2.() -> Unit)
		= initInlineStyle(CorePopupWindowStyle2(), "popupWindowStyle", init)

	@DefinedBy(CoreThemeStyleable.preferenceActivityStyle::class)
	open var preferenceActivityStyle: CorePreferenceActivityStyle2? by InlineStyleDelegate()
	open fun preferenceActivityStyle(init: CorePreferenceActivityStyle2.() -> Unit)
		= initInlineStyle(CorePreferenceActivityStyle2(), "preferenceActivityStyle", init)




	@DefinedBy(CoreThemeStyleable.preferenceFragmentStyle::class)
	open var preferenceFragmentStyle: CorePreferenceFragmentStyle2? by InlineStyleDelegate()
	open fun preferenceFragmentStyle(init: CorePreferenceFragmentStyle2.() -> Unit)
		= initInlineStyle(CorePreferenceFragmentStyle2(), "preferenceFragmentStyle", init)

	@DefinedBy(CoreThemeStyleable.preferenceFrameLayoutStyle::class)
	open var preferenceFrameLayoutStyle: CorePreferenceFrameLayoutStyle2? by InlineStyleDelegate()
	open fun preferenceFrameLayoutStyle(init: CorePreferenceFrameLayoutStyle2.() -> Unit)
		= initInlineStyle(CorePreferenceFrameLayoutStyle2(), "preferenceFrameLayoutStyle", init)



	@DefinedBy(CoreThemeStyleable.preferenceLayoutChild::class)
	open var preferenceLayoutChild: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun preferenceLayoutChild(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.preferenceLayoutChild::class, init)

	@DefinedBy(CoreThemeStyleable.preferenceListStyle::class)
	open var preferenceListStyle: CoreListPreferenceStyle2? by InlineStyleDelegate()
	open fun preferenceListStyle(init: CoreListPreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreListPreferenceStyle2(), "preferenceListStyle", init)


	@DefinedBy(CoreThemeStyleable.preferenceScreenStyle::class)
	open var preferenceScreenStyle: CorePreferenceScreenStyle2? by InlineStyleDelegate()
	open fun preferenceScreenStyle(init: CorePreferenceScreenStyle2.() -> Unit)
		= initInlineStyle(CorePreferenceScreenStyle2(), "preferenceScreenStyle", init)

	@DefinedBy(CoreThemeStyleable.preferenceStyle::class)
	open var preferenceStyle: CorePreferenceStyle2? by InlineStyleDelegate()
	open fun preferenceStyle(init: CorePreferenceStyle2.() -> Unit)
		= initInlineStyle(CorePreferenceStyle2(), "preferenceStyle", init)

	@DefinedBy(CoreThemeStyleable.presentationTheme::class)
	open var presentationTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun presentationTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "presentationTheme", init)

	@DefinedBy(CoreThemeStyleable.primaryContentAlpha::class)
	open var primaryContentAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun primaryContentAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.primaryContentAlpha::class, init)

	@DefinedBy(CoreThemeStyleable.progressBarStyle::class)
	open var progressBarStyle: CoreProgressBarStyle2? by InlineStyleDelegate()
	open fun progressBarStyle(init: CoreProgressBarStyle2.() -> Unit)
		= initInlineStyle(CoreProgressBarStyle2(), "progressBarStyle", init)








	@DefinedBy(CoreThemeStyleable.quickContactBadgeOverlay::class)
	open var quickContactBadgeOverlay: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun quickContactBadgeOverlay(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.quickContactBadgeOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleSmallWindowLarge::class)
	open var quickContactBadgeStyleSmallWindowLarge: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleSmallWindowLarge(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleSmallWindowLarge", init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleSmallWindowMedium::class)
	open var quickContactBadgeStyleSmallWindowMedium: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleSmallWindowMedium(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleSmallWindowMedium", init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleSmallWindowSmall::class)
	open var quickContactBadgeStyleSmallWindowSmall: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleSmallWindowSmall(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleSmallWindowSmall", init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleWindowLarge::class)
	open var quickContactBadgeStyleWindowLarge: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleWindowLarge(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleWindowLarge", init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleWindowMedium::class)
	open var quickContactBadgeStyleWindowMedium: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleWindowMedium(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleWindowMedium", init)

	@DefinedBy(CoreThemeStyleable.quickContactBadgeStyleWindowSmall::class)
	open var quickContactBadgeStyleWindowSmall: CoreQuickContactBadgeStyle2? by InlineStyleDelegate()
	open fun quickContactBadgeStyleWindowSmall(init: CoreQuickContactBadgeStyle2.() -> Unit)
		= initInlineStyle(CoreQuickContactBadgeStyle2(), "quickContactBadgeStyleWindowSmall", init)


	@DefinedBy(CoreThemeStyleable.ratingBarStyle::class)
	open var ratingBarStyle: CoreRatingBarStyle2? by InlineStyleDelegate()
	open fun ratingBarStyle(init: CoreRatingBarStyle2.() -> Unit)
		= initInlineStyle(CoreRatingBarStyle2(), "ratingBarStyle", init)

	@DefinedBy(CoreThemeStyleable.ratingBarStyleIndicator::class)
	open var ratingBarStyleIndicator: CoreRatingBarStyle2? by InlineStyleDelegate()
	open fun ratingBarStyleIndicator(init: CoreRatingBarStyle2.() -> Unit)
		= initInlineStyle(CoreRatingBarStyle2(), "ratingBarStyleIndicator", init)

	@DefinedBy(CoreThemeStyleable.ratingBarStyleSmall::class)
	open var ratingBarStyleSmall: CoreRatingBarStyle2? by InlineStyleDelegate()
	open fun ratingBarStyleSmall(init: CoreRatingBarStyle2.() -> Unit)
		= initInlineStyle(CoreRatingBarStyle2(), "ratingBarStyleSmall", init)

	@DefinedBy(CoreThemeStyleable.ringtonePreferenceStyle::class)
	open var ringtonePreferenceStyle: CoreRingtonePreferenceStyle2? by InlineStyleDelegate()
	open fun ringtonePreferenceStyle(init: CoreRingtonePreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreRingtonePreferenceStyle2(), "ringtonePreferenceStyle", init)

	@DefinedBy(CoreThemeStyleable.scrollViewStyle::class)
	open var scrollViewStyle: CoreScrollViewStyle2? by InlineStyleDelegate()
	open fun scrollViewStyle(init: CoreScrollViewStyle2.() -> Unit)
		= initInlineStyle(CoreScrollViewStyle2(), "scrollViewStyle", init)

	@DefinedBy(CoreThemeStyleable.searchDialogTheme::class)
	open var searchDialogTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun searchDialogTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "searchDialogTheme", init)

	@DefinedBy(CoreThemeStyleable.searchResultListItemHeight::class)
	open var searchResultListItemHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun searchResultListItemHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.searchResultListItemHeight::class, init)

	@DefinedBy(CoreThemeStyleable.searchViewStyle::class)
	open var searchViewStyle: CoreSearchViewStyle2? by InlineStyleDelegate()
	open fun searchViewStyle(init: CoreSearchViewStyle2.() -> Unit)
		= initInlineStyle(CoreSearchViewStyle2(), "searchViewStyle", init)

	@DefinedBy(CoreThemeStyleable.searchWidgetCorpusItemBackground::class)
	open var searchWidgetCorpusItemBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchWidgetCorpusItemBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.searchWidgetCorpusItemBackground::class, init)

	@DefinedBy(CoreThemeStyleable.secondaryContentAlpha::class)
	open var secondaryContentAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun secondaryContentAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.secondaryContentAlpha::class, init)


	@DefinedBy(CoreThemeStyleable.seekBarPreferenceStyle::class)
	open var seekBarPreferenceStyle: CoreSeekBarPreferenceStyle2? by InlineStyleDelegate()
	open fun seekBarPreferenceStyle(init: CoreSeekBarPreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreSeekBarPreferenceStyle2(), "seekBarPreferenceStyle", init)

	@DefinedBy(CoreThemeStyleable.seekBarStyle::class)
	open var seekBarStyle: CoreSeekBarStyle2? by InlineStyleDelegate()
	open fun seekBarStyle(init: CoreSeekBarStyle2.() -> Unit)
		= initInlineStyle(CoreSeekBarStyle2(), "seekBarStyle", init)


	@DefinedBy(CoreThemeStyleable.selectableItemBackground::class)
	open var selectableItemBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun selectableItemBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.selectableItemBackground::class, init)

	@DefinedBy(CoreThemeStyleable.selectableItemBackgroundBorderless::class)
	open var selectableItemBackgroundBorderless: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun selectableItemBackgroundBorderless(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.selectableItemBackgroundBorderless::class, init)



	@DefinedBy(CoreThemeStyleable.spinnerStyle::class)
	open var spinnerStyle: CoreSpinnerStyle2? by InlineStyleDelegate()
	open fun spinnerStyle(init: CoreSpinnerStyle2.() -> Unit)
		= initInlineStyle(CoreSpinnerStyle2(), "spinnerStyle", init)

	@DefinedBy(CoreThemeStyleable.spotShadowAlpha::class)
	open var spotShadowAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun spotShadowAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.spotShadowAlpha::class, init)

	@DefinedBy(CoreThemeStyleable.stackViewStyle::class)
	open var stackViewStyle: CoreStackViewStyle2? by InlineStyleDelegate()
	open fun stackViewStyle(init: CoreStackViewStyle2.() -> Unit)
		= initInlineStyle(CoreStackViewStyle2(), "stackViewStyle", init)


	@DefinedBy(CoreThemeStyleable.switchPreferenceStyle::class)
	open var switchPreferenceStyle: CoreSwitchPreferenceStyle2? by InlineStyleDelegate()
	open fun switchPreferenceStyle(init: CoreSwitchPreferenceStyle2.() -> Unit)
		= initInlineStyle(CoreSwitchPreferenceStyle2(), "switchPreferenceStyle", init)

	@DefinedBy(CoreThemeStyleable.switchStyle::class)
	open var switchStyle: CoreSwitchStyle2? by InlineStyleDelegate()
	open fun switchStyle(init: CoreSwitchStyle2.() -> Unit)
		= initInlineStyle(CoreSwitchStyle2(), "switchStyle", init)

	@DefinedBy(CoreThemeStyleable.tabWidgetStyle::class)
	open var tabWidgetStyle: CoreTabWidgetStyle2? by InlineStyleDelegate()
	open fun tabWidgetStyle(init: CoreTabWidgetStyle2.() -> Unit)
		= initInlineStyle(CoreTabWidgetStyle2(), "tabWidgetStyle", init)

	@DefinedBy(CoreThemeStyleable.textAppearance::class)
	open var textAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearance", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceAutoCorrectionSuggestion::class)
	open var textAppearanceAutoCorrectionSuggestion: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceAutoCorrectionSuggestion(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceAutoCorrectionSuggestion", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceButton::class)
	open var textAppearanceButton: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceButton(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceButton", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceEasyCorrectSuggestion::class)
	open var textAppearanceEasyCorrectSuggestion: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceEasyCorrectSuggestion(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceEasyCorrectSuggestion", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceInverse::class)
	open var textAppearanceInverse: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceInverse(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceInverse", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceLarge::class)
	open var textAppearanceLarge: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceLarge(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceLarge", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceLargeInverse::class)
	open var textAppearanceLargeInverse: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceLargeInverse(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceLargeInverse", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceLargePopupMenu::class)
	open var textAppearanceLargePopupMenu: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceLargePopupMenu(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceLargePopupMenu", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceListItem::class)
	open var textAppearanceListItem: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceListItem(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceListItem", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceListItemSecondary::class)
	open var textAppearanceListItemSecondary: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceListItemSecondary(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceListItemSecondary", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceListItemSmall::class)
	open var textAppearanceListItemSmall: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceListItemSmall(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceListItemSmall", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceMedium::class)
	open var textAppearanceMedium: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceMedium(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceMedium", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceMediumInverse::class)
	open var textAppearanceMediumInverse: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceMediumInverse(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceMediumInverse", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceMisspelledSuggestion::class)
	open var textAppearanceMisspelledSuggestion: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceMisspelledSuggestion(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceMisspelledSuggestion", init)

	@DefinedBy(CoreThemeStyleable.textAppearancePopupMenuHeader::class)
	open var textAppearancePopupMenuHeader: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearancePopupMenuHeader(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearancePopupMenuHeader", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceSearchResultSubtitle::class)
	open var textAppearanceSearchResultSubtitle: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceSearchResultSubtitle(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceSearchResultSubtitle", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceSearchResultTitle::class)
	open var textAppearanceSearchResultTitle: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceSearchResultTitle(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceSearchResultTitle", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceSmall::class)
	open var textAppearanceSmall: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceSmall(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceSmall", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceSmallInverse::class)
	open var textAppearanceSmallInverse: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceSmallInverse(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceSmallInverse", init)

	@DefinedBy(CoreThemeStyleable.textAppearanceSmallPopupMenu::class)
	open var textAppearanceSmallPopupMenu: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearanceSmallPopupMenu(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearanceSmallPopupMenu", init)

	@DefinedBy(CoreThemeStyleable.textCheckMark::class)
	open var textCheckMark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textCheckMark(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textCheckMark::class, init)

	@DefinedBy(CoreThemeStyleable.textCheckMarkInverse::class)
	open var textCheckMarkInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textCheckMarkInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textCheckMarkInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorAlertDialogListItem::class)
	open var textColorAlertDialogListItem: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorAlertDialogListItem(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorAlertDialogListItem::class, init)

	@DefinedBy(CoreThemeStyleable.textColorHighlightInverse::class)
	open var textColorHighlightInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHighlightInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorHighlightInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorHintInverse::class)
	open var textColorHintInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHintInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorHintInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorLinkInverse::class)
	open var textColorLinkInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorLinkInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorLinkInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimary::class)
	open var textColorPrimary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimary::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryActivated::class)
	open var textColorPrimaryActivated: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryActivated(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryActivated::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryDisableOnly::class)
	open var textColorPrimaryDisableOnly: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryDisableOnly(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryDisableOnly::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryInverse::class)
	open var textColorPrimaryInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryInverseDisableOnly::class)
	open var textColorPrimaryInverseDisableOnly: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryInverseDisableOnly(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryInverseDisableOnly::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryInverseNoDisable::class)
	open var textColorPrimaryInverseNoDisable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryInverseNoDisable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryInverseNoDisable::class, init)

	@DefinedBy(CoreThemeStyleable.textColorPrimaryNoDisable::class)
	open var textColorPrimaryNoDisable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorPrimaryNoDisable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorPrimaryNoDisable::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSearchUrl::class)
	open var textColorSearchUrl: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSearchUrl(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSearchUrl::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSecondary::class)
	open var textColorSecondary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSecondary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSecondary::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSecondaryActivated::class)
	open var textColorSecondaryActivated: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSecondaryActivated(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSecondaryActivated::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSecondaryInverse::class)
	open var textColorSecondaryInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSecondaryInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSecondaryInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSecondaryInverseNoDisable::class)
	open var textColorSecondaryInverseNoDisable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSecondaryInverseNoDisable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSecondaryInverseNoDisable::class, init)

	@DefinedBy(CoreThemeStyleable.textColorSecondaryNoDisable::class)
	open var textColorSecondaryNoDisable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorSecondaryNoDisable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorSecondaryNoDisable::class, init)

	@DefinedBy(CoreThemeStyleable.textColorTertiary::class)
	open var textColorTertiary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorTertiary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorTertiary::class, init)

	@DefinedBy(CoreThemeStyleable.textColorTertiaryInverse::class)
	open var textColorTertiaryInverse: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorTertiaryInverse(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textColorTertiaryInverse::class, init)

	@DefinedBy(CoreThemeStyleable.textEditNoPasteWindowLayout::class)
	open var textEditNoPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditNoPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditNoPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditPasteWindowLayout::class)
	open var textEditPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSideNoPasteWindowLayout::class)
	open var textEditSideNoPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSideNoPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSideNoPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSidePasteWindowLayout::class)
	open var textEditSidePasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSidePasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSidePasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSuggestionContainerLayout::class)
	open var textEditSuggestionContainerLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSuggestionContainerLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSuggestionContainerLayout::class, init)


	@DefinedBy(CoreThemeStyleable.textEditSuggestionItemLayout::class)
	open var textEditSuggestionItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSuggestionItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSuggestionItemLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandle::class)
	open var textSelectHandle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandle(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandle::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandleLeft::class)
	open var textSelectHandleLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandleLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandleLeft::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandleRight::class)
	open var textSelectHandleRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandleRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandleRight::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandleWindowStyle::class)
	open var textSelectHandleWindowStyle: CorePopupWindowStyle2? by InlineStyleDelegate()
	open fun textSelectHandleWindowStyle(init: CorePopupWindowStyle2.() -> Unit)
		= initInlineStyle(CorePopupWindowStyle2(), "textSelectHandleWindowStyle", init)

	@DefinedBy(CoreThemeStyleable.textSuggestionsWindowStyle::class)
	open var textSuggestionsWindowStyle: CoreWindowStyle2? by InlineStyleDelegate()
	open fun textSuggestionsWindowStyle(init: CoreWindowStyle2.() -> Unit)
		= initInlineStyle(CoreWindowStyle2(), "textSuggestionsWindowStyle", init)

	@DefinedBy(CoreThemeStyleable.textUnderlineColor::class)
	open var textUnderlineColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textUnderlineColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textUnderlineColor::class, init)

	@DefinedBy(CoreThemeStyleable.textUnderlineThickness::class)
	open var textUnderlineThickness: Any? by GenericDelegate(String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun textUnderlineThickness(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textUnderlineThickness::class, init)

	@DefinedBy(CoreThemeStyleable.textViewStyle::class)
	open var textViewStyle: CoreTextViewStyle2? by InlineStyleDelegate()
	open fun textViewStyle(init: CoreTextViewStyle2.() -> Unit)
		= initInlineStyle(CoreTextViewStyle2(), "textViewStyle", init)

	@DefinedBy(CoreThemeStyleable.timePickerDialogTheme::class)
	open var timePickerDialogTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun timePickerDialogTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "timePickerDialogTheme", init)

	@DefinedBy(CoreThemeStyleable.timePickerStyle::class)
	open var timePickerStyle: CoreTimePickerStyle2? by InlineStyleDelegate()
	open fun timePickerStyle(init: CoreTimePickerStyle2.() -> Unit)
		= initInlineStyle(CoreTimePickerStyle2(), "timePickerStyle", init)

	@DefinedBy(CoreThemeStyleable.toastFrameBackground::class)
	open var toastFrameBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun toastFrameBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.toastFrameBackground::class, init)

	@DefinedBy(CoreThemeStyleable.toolbarStyle::class)
	open var toolbarStyle: CoreToolbarStyle2? by InlineStyleDelegate()
	open fun toolbarStyle(init: CoreToolbarStyle2.() -> Unit)
		= initInlineStyle(CoreToolbarStyle2(), "toolbarStyle", init)

	@DefinedBy(CoreThemeStyleable.tooltipBackgroundColor::class)
	open var tooltipBackgroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipBackgroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.tooltipBackgroundColor::class, init)

	@DefinedBy(CoreThemeStyleable.tooltipForegroundColor::class)
	open var tooltipForegroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipForegroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.tooltipForegroundColor::class, init)

	@DefinedBy(CoreThemeStyleable.tooltipFrameBackground::class)
	open var tooltipFrameBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipFrameBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.tooltipFrameBackground::class, init)



	@DefinedBy(CoreThemeStyleable.windowActionBar::class)
	open override var windowActionBar: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowActionBar(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBar::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionBarFullscreenDecorLayout::class)
	open override var windowActionBarFullscreenDecorLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowActionBarFullscreenDecorLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBarFullscreenDecorLayout::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionBarOverlay::class)
	open override var windowActionBarOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowActionBarOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBarOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionModeOverlay::class)
	open override var windowActionModeOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionModeOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowActivityTransitions::class)
	open override var windowActivityTransitions: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowActivityTransitions(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActivityTransitions::class, init)

	@DefinedBy(CoreThemeStyleable.windowAllowEnterTransitionOverlap::class)
	open override var windowAllowEnterTransitionOverlap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowAllowEnterTransitionOverlap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowAllowEnterTransitionOverlap::class, init)

	@DefinedBy(CoreThemeStyleable.windowAllowReturnTransitionOverlap::class)
	open override var windowAllowReturnTransitionOverlap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowAllowReturnTransitionOverlap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowAllowReturnTransitionOverlap::class, init)

	@DefinedBy(CoreThemeStyleable.windowAnimationStyle::class)
	open override var windowAnimationStyle: CoreWindowAnimationStyle2? by InlineStyleDelegate()
	open override fun windowAnimationStyle(init: CoreWindowAnimationStyle2.() -> Unit)
		= initInlineStyle(CoreWindowAnimationStyle2(), "windowAnimationStyle", init)

	@DefinedBy(CoreThemeStyleable.windowBackground::class)
	open override var windowBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowBackground::class, init)

	@DefinedBy(CoreThemeStyleable.windowBackgroundFallback::class)
	open override var windowBackgroundFallback: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowBackgroundFallback(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowBackgroundFallback::class, init)

	@DefinedBy(CoreThemeStyleable.windowCloseOnTouchOutside::class)
	open override var windowCloseOnTouchOutside: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowCloseOnTouchOutside(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowCloseOnTouchOutside::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentOverlay::class)
	open override var windowContentOverlay: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowContentOverlay(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentTransitionManager::class)
	open override var windowContentTransitionManager: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowContentTransitionManager(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentTransitionManager::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentTransitions::class)
	open override var windowContentTransitions: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowContentTransitions(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentTransitions::class, init)

	@DefinedBy(CoreThemeStyleable.windowDisablePreview::class)
	open override var windowDisablePreview: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowDisablePreview(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowDisablePreview::class, init)

	@DefinedBy(CoreThemeStyleable.windowEnableSplitTouch::class)
	open override var windowEnableSplitTouch: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowEnableSplitTouch(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowEnableSplitTouch::class, init)

	@DefinedBy(CoreThemeStyleable.windowEnterTransition::class)
	open override var windowEnterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowEnterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowEnterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowExitTransition::class)
	open override var windowExitTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowExitTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowExitTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowFrame::class)
	open override var windowFrame: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowFrame(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowFrame::class, init)

	@DefinedBy(CoreThemeStyleable.windowFullscreen::class)
	open override var windowFullscreen: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowFullscreen(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowFullscreen::class, init)

	@DefinedBy(CoreThemeStyleable.windowIsFloating::class)
	open override var windowIsFloating: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowIsFloating(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowIsFloating::class, init)

	@DefinedBy(CoreThemeStyleable.windowIsTranslucent::class)
	open override var windowIsTranslucent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowIsTranslucent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowIsTranslucent::class, init)

	@DefinedBy(CoreThemeStyleable.windowNoDisplay::class)
	open override var windowNoDisplay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowNoDisplay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowNoDisplay::class, init)

	@DefinedBy(CoreThemeStyleable.windowNoTitle::class)
	open override var windowNoTitle: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowNoTitle(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowNoTitle::class, init)

	@DefinedBy(CoreThemeStyleable.windowOverscan::class)
	open override var windowOverscan: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowOverscan(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowOverscan::class, init)

	@DefinedBy(CoreThemeStyleable.windowReenterTransition::class)
	open override var windowReenterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowReenterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowReenterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowReturnTransition::class)
	open override var windowReturnTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowReturnTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowReturnTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementEnterTransition::class)
	open override var windowSharedElementEnterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowSharedElementEnterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementEnterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementExitTransition::class)
	open override var windowSharedElementExitTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowSharedElementExitTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementExitTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementReenterTransition::class)
	open override var windowSharedElementReenterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowSharedElementReenterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementReenterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementReturnTransition::class)
	open override var windowSharedElementReturnTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun windowSharedElementReturnTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementReturnTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementsUseOverlay::class)
	open override var windowSharedElementsUseOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowSharedElementsUseOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementsUseOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowShowWallpaper::class)
	open override var windowShowWallpaper: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowShowWallpaper(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowShowWallpaper::class, init)

	@DefinedBy(CoreThemeStyleable.windowSoftInputMode::class)
	open override var windowSoftInputMode: Any? by GenericFlagDelegate<CoreThemeStyleable.WindowSoftInputModeFlag>(CoreThemeStyleable.WindowSoftInputModeFlag::class)

	@DefinedBy(CoreThemeStyleable.windowSwipeToDismiss::class)
	open override var windowSwipeToDismiss: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowSwipeToDismiss(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSwipeToDismiss::class, init)


	@DefinedBy(CoreThemeStyleable.windowTitleSize::class)
	open var windowTitleSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowTitleSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTitleSize::class, init)

	@DefinedBy(CoreThemeStyleable.windowTitleStyle::class)
	open var windowTitleStyle: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun windowTitleStyle(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "windowTitleStyle", init)

	@DefinedBy(CoreThemeStyleable.windowTransitionBackgroundFadeDuration::class)
	open override var windowTransitionBackgroundFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open override fun windowTransitionBackgroundFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTransitionBackgroundFadeDuration::class, init)

	@DefinedBy(CoreThemeStyleable.windowTranslucentNavigation::class)
	open override var windowTranslucentNavigation: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowTranslucentNavigation(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTranslucentNavigation::class, init)

	@DefinedBy(CoreThemeStyleable.windowTranslucentStatus::class)
	open override var windowTranslucentStatus: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun windowTranslucentStatus(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTranslucentStatus::class, init)


}

open class CorePreferenceActivityStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceActivityStyleable.headerLayout::class)
	open var headerLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerLayout(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceActivityStyleable.headerLayout::class, init)

	@DefinedBy(CorePreferenceActivityStyleable.headerRemoveIconIfEmpty::class)
	open var headerRemoveIconIfEmpty: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun headerRemoveIconIfEmpty(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceActivityStyleable.headerRemoveIconIfEmpty::class, init)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

}

open class CoreSpinnerStyle2 : CoreAbsSpinnerStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSpinnerStyleable.disableChildrenWhenDisabled::class)
	open var disableChildrenWhenDisabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun disableChildrenWhenDisabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSpinnerStyleable.disableChildrenWhenDisabled::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownSelector::class)
	open var dropDownSelector: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dropDownSelector(init: StringAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.dropDownSelector::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownWidth::class)
	open var dropDownWidth: Any? by GenericEnumDelegate<CoreAutoCompleteTextViewStyleable.DropDownWidthEnum>(CoreAutoCompleteTextViewStyleable.DropDownWidthEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CorePopupWindowStyleable.popupBackground::class)
	open var popupBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupBackground(init: StringAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupBackground::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupElevation::class)
	open var popupElevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun popupElevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupElevation::class, init)

	@DefinedBy(CoreSpinnerStyleable.popupPromptView::class)
	open var popupPromptView: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupPromptView(init: StringAttribute.() -> Unit)
		= initAttr(CoreSpinnerStyleable.popupPromptView::class, init)

	@DefinedBy(CoreToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "popupTheme", init)

	@DefinedBy(CoreSpinnerStyleable.prompt::class)
	open var prompt: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun prompt(init: StringAttribute.() -> Unit)
		= initAttr(CoreSpinnerStyleable.prompt::class, init)

	@DefinedBy(CoreSpinnerStyleable.spinnerMode::class)
	open var spinnerMode: Any? by GenericEnumDelegate<CoreSpinnerStyleable.SpinnerModeEnum>(CoreSpinnerStyleable.SpinnerModeEnum::class)

}

open class CoreAbsSpinnerStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.entries::class)
	open var entries: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entries(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.entries::class, init)

}

open class CoreViewGroupStyle2 : CoreViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroupStyleable.addStatesFromChildren::class)
	open var addStatesFromChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun addStatesFromChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.addStatesFromChildren::class, init)

	@DefinedBy(CoreViewGroupStyleable.alwaysDrawnWithCache::class)
	open var alwaysDrawnWithCache: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun alwaysDrawnWithCache(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.alwaysDrawnWithCache::class, init)

	@DefinedBy(CoreViewGroupStyleable.animateLayoutChanges::class)
	open var animateLayoutChanges: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateLayoutChanges(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.animateLayoutChanges::class, init)

	@DefinedBy(CoreViewGroupStyleable.animationCache::class)
	open var animationCache: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animationCache(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.animationCache::class, init)

	@DefinedBy(CoreViewGroupStyleable.clipChildren::class)
	open var clipChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clipChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.clipChildren::class, init)

	@DefinedBy(CoreViewGroupStyleable.clipToPadding::class)
	open var clipToPadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clipToPadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.clipToPadding::class, init)

	@DefinedBy(CoreViewGroupStyleable.descendantFocusability::class)
	open var descendantFocusability: Any? by GenericEnumDelegate<CoreViewGroupStyleable.DescendantFocusabilityFlag>(CoreViewGroupStyleable.DescendantFocusabilityFlag::class)

	@DefinedBy(CoreViewGroupStyleable.layoutAnimation::class)
	open var layoutAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layoutAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.layoutAnimation::class, init)

	@DefinedBy(CoreViewGroupStyleable.layoutMode::class)
	open var layoutMode: Any? by GenericEnumDelegate<CoreViewGroupStyleable.LayoutModeFlag>(CoreViewGroupStyleable.LayoutModeFlag::class)

	@DefinedBy(CoreViewGroupStyleable.persistentDrawingCache::class)
	open var persistentDrawingCache: Any? by GenericFlagDelegate<CoreViewGroupStyleable.PersistentDrawingCacheFlag>(CoreViewGroupStyleable.PersistentDrawingCacheFlag::class)

	@DefinedBy(CoreViewGroupStyleable.splitMotionEvents::class)
	open var splitMotionEvents: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun splitMotionEvents(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.splitMotionEvents::class, init)

	@DefinedBy(CoreViewGroupStyleable.touchscreenBlocksFocus::class)
	open var touchscreenBlocksFocus: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun touchscreenBlocksFocus(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.touchscreenBlocksFocus::class, init)

	@DefinedBy(CoreViewGroupStyleable.transitionGroup::class)
	open var transitionGroup: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun transitionGroup(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.transitionGroup::class, init)

}

open class CoreViewStyle2 : CoreWidgetStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.accessibilityLiveRegion::class)
	open var accessibilityLiveRegion: Any? by GenericEnumDelegate<CoreViewStyleable.AccessibilityLiveRegionEnum>(CoreViewStyleable.AccessibilityLiveRegionEnum::class)

	@DefinedBy(CoreViewStyleable.accessibilityTraversalAfter::class)
	open var accessibilityTraversalAfter: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun accessibilityTraversalAfter(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.accessibilityTraversalAfter::class, init)

	@DefinedBy(CoreViewStyleable.accessibilityTraversalBefore::class)
	open var accessibilityTraversalBefore: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun accessibilityTraversalBefore(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.accessibilityTraversalBefore::class, init)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreViewStyleable.autofillHints::class)
	open var autofillHints: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autofillHints(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.autofillHints::class, init)

	@DefinedBy(CoreViewStyleable.background::class)
	open var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(CoreViewStyleable.backgroundTint::class)
	open var backgroundTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.backgroundTint::class, init)

	@DefinedBy(CoreViewStyleable.backgroundTintMode::class)
	open var backgroundTintMode: Any? by GenericEnumDelegate<CoreViewStyleable.BackgroundTintModeEnum>(CoreViewStyleable.BackgroundTintModeEnum::class)

	@DefinedBy(CoreViewStyleable.clickable::class)
	open var clickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.clickable::class, init)

	@DefinedBy(CoreViewStyleable.contentDescription::class)
	open var contentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contentDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.contentDescription::class, init)

	@DefinedBy(CoreViewStyleable.contextClickable::class)
	open var contextClickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun contextClickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.contextClickable::class, init)

	@DefinedBy(CoreViewStyleable.defaultFocusHighlightEnabled::class)
	open var defaultFocusHighlightEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun defaultFocusHighlightEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.defaultFocusHighlightEnabled::class, init)

	@DefinedBy(CoreViewStyleable.drawingCacheQuality::class)
	open var drawingCacheQuality: Any? by GenericEnumDelegate<CoreViewStyleable.DrawingCacheQualityEnum>(CoreViewStyleable.DrawingCacheQualityEnum::class)

	@DefinedBy(CoreViewStyleable.duplicateParentState::class)
	open var duplicateParentState: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun duplicateParentState(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.duplicateParentState::class, init)

	@DefinedBy(CoreViewStyleable.elevation::class)
	open var elevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun elevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.elevation::class, init)

	@DefinedBy(CoreViewStyleable.fadeScrollbars::class)
	open var fadeScrollbars: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fadeScrollbars(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.fadeScrollbars::class, init)

	@DefinedBy(CoreViewStyleable.fadingEdge::class)
	open var fadingEdge: Any? by GenericFlagDelegate<CoreViewStyleable.FadingEdgeFlag>(CoreViewStyleable.FadingEdgeFlag::class)

	@DefinedBy(CoreViewStyleable.fadingEdgeLength::class)
	open var fadingEdgeLength: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun fadingEdgeLength(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.fadingEdgeLength::class, init)

	@DefinedBy(CoreViewStyleable.filterTouchesWhenObscured::class)
	open var filterTouchesWhenObscured: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun filterTouchesWhenObscured(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.filterTouchesWhenObscured::class, init)

	@DefinedBy(CoreViewStyleable.fitsSystemWindows::class)
	open var fitsSystemWindows: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fitsSystemWindows(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.fitsSystemWindows::class, init)

	@DefinedBy(CoreViewStyleable.focusable::class)
	open var focusable: Any? by GenericEnumDelegate<CoreViewStyleable.FocusableEnum>(CoreViewStyleable.FocusableEnum::class, Boolean::class, BooleanContainer::class)

	@DefinedBy(CoreViewStyleable.focusableInTouchMode::class)
	open var focusableInTouchMode: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun focusableInTouchMode(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.focusableInTouchMode::class, init)

	@DefinedBy(CoreViewStyleable.focusedByDefault::class)
	open var focusedByDefault: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun focusedByDefault(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.focusedByDefault::class, init)

	@DefinedBy(CoreViewStyleable.forceHasOverlappingRendering::class)
	open var forceHasOverlappingRendering: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun forceHasOverlappingRendering(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.forceHasOverlappingRendering::class, init)

	@DefinedBy(CoreViewStyleable.foreground::class)
	open var foreground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun foreground(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.foreground::class, init)

	@DefinedBy(CoreViewStyleable.foregroundGravity::class)
	open var foregroundGravity: Any? by GenericFlagDelegate<CoreViewStyleable.ForegroundGravityFlag>(CoreViewStyleable.ForegroundGravityFlag::class)

	@DefinedBy(CoreViewStyleable.foregroundInsidePadding::class)
	open var foregroundInsidePadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun foregroundInsidePadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.foregroundInsidePadding::class, init)

	@DefinedBy(CoreViewStyleable.foregroundTint::class)
	open var foregroundTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun foregroundTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.foregroundTint::class, init)

	@DefinedBy(CoreViewStyleable.foregroundTintMode::class)
	open var foregroundTintMode: Any? by GenericEnumDelegate<CoreViewStyleable.ForegroundTintModeEnum>(CoreViewStyleable.ForegroundTintModeEnum::class)

	@DefinedBy(CoreViewStyleable.hapticFeedbackEnabled::class)
	open var hapticFeedbackEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun hapticFeedbackEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.hapticFeedbackEnabled::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreViewStyleable.importantForAccessibility::class)
	open var importantForAccessibility: Any? by GenericEnumDelegate<CoreViewStyleable.ImportantForAccessibilityEnum>(CoreViewStyleable.ImportantForAccessibilityEnum::class)

	@DefinedBy(CoreViewStyleable.importantForAutofill::class)
	open var importantForAutofill: Any? by GenericFlagDelegate<CoreViewStyleable.ImportantForAutofillFlag>(CoreViewStyleable.ImportantForAutofillFlag::class)

	@DefinedBy(CoreViewStyleable.isScrollContainer::class)
	open var isScrollContainer: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isScrollContainer(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.isScrollContainer::class, init)

	@DefinedBy(CoreViewStyleable.keepScreenOn::class)
	open var keepScreenOn: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun keepScreenOn(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.keepScreenOn::class, init)

	@DefinedBy(CoreViewStyleable.keyboardNavigationCluster::class)
	open var keyboardNavigationCluster: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun keyboardNavigationCluster(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.keyboardNavigationCluster::class, init)

	@DefinedBy(CoreViewStyleable.labelFor::class)
	open var labelFor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun labelFor(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.labelFor::class, init)

	@DefinedBy(CoreViewStyleable.layerType::class)
	open var layerType: Any? by GenericEnumDelegate<CoreViewStyleable.LayerTypeEnum>(CoreViewStyleable.LayerTypeEnum::class)

	@DefinedBy(CoreViewStyleable.layoutDirection::class)
	open var layoutDirection: Any? by GenericEnumDelegate<CoreViewStyleable.LayoutDirectionEnum>(CoreViewStyleable.LayoutDirectionEnum::class)

	@DefinedBy(CoreViewStyleable.longClickable::class)
	open var longClickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun longClickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.longClickable::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreViewStyleable.nestedScrollingEnabled::class)
	open var nestedScrollingEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun nestedScrollingEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nestedScrollingEnabled::class, init)

	@DefinedBy(CoreViewStyleable.nextClusterForward::class)
	open var nextClusterForward: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextClusterForward(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextClusterForward::class, init)

	@DefinedBy(CoreViewStyleable.nextFocusDown::class)
	open var nextFocusDown: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextFocusDown(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextFocusDown::class, init)

	@DefinedBy(CoreViewStyleable.nextFocusForward::class)
	open var nextFocusForward: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextFocusForward(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextFocusForward::class, init)

	@DefinedBy(CoreViewStyleable.nextFocusLeft::class)
	open var nextFocusLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextFocusLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextFocusLeft::class, init)

	@DefinedBy(CoreViewStyleable.nextFocusRight::class)
	open var nextFocusRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextFocusRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextFocusRight::class, init)

	@DefinedBy(CoreViewStyleable.nextFocusUp::class)
	open var nextFocusUp: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun nextFocusUp(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.nextFocusUp::class, init)

	@DefinedBy(CoreViewStyleable.onClick::class)
	open var onClick: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun onClick(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.onClick::class, init)

	@DefinedBy(CoreViewStyleable.outlineProvider::class)
	open var outlineProvider: Any? by GenericEnumDelegate<CoreViewStyleable.OutlineProviderEnum>(CoreViewStyleable.OutlineProviderEnum::class)

	@DefinedBy(CoreViewStyleable.overScrollMode::class)
	open var overScrollMode: Any? by GenericEnumDelegate<CoreViewStyleable.OverScrollModeEnum>(CoreViewStyleable.OverScrollModeEnum::class)

	@DefinedBy(CoreViewStyleable.padding::class)
	open var padding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun padding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.padding::class, init)

	@DefinedBy(CoreViewStyleable.paddingBottom::class)
	open var paddingBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingBottom::class, init)

	@DefinedBy(CoreViewStyleable.paddingEnd::class)
	open var paddingEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingEnd::class, init)

	@DefinedBy(CoreViewStyleable.paddingHorizontal::class)
	open var paddingHorizontal: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingHorizontal(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingHorizontal::class, init)

	@DefinedBy(CoreViewStyleable.paddingLeft::class)
	open var paddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingLeft::class, init)

	@DefinedBy(CoreViewStyleable.paddingRight::class)
	open var paddingRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingRight::class, init)

	@DefinedBy(CoreViewStyleable.paddingStart::class)
	open var paddingStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingStart::class, init)

	@DefinedBy(CoreViewStyleable.paddingTop::class)
	open var paddingTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingTop::class, init)

	@DefinedBy(CoreViewStyleable.paddingVertical::class)
	open var paddingVertical: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingVertical(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingVertical::class, init)

	@DefinedBy(CoreViewStyleable.pointerIcon::class)
	open var pointerIcon: Any? by GenericEnumDelegate<CoreViewStyleable.PointerIconEnum>(CoreViewStyleable.PointerIconEnum::class)

	@DefinedBy(CoreViewStyleable.requiresFadingEdge::class)
	open var requiresFadingEdge: Any? by GenericFlagDelegate<CoreViewStyleable.RequiresFadingEdgeFlag>(CoreViewStyleable.RequiresFadingEdgeFlag::class)

	@DefinedBy(CoreViewStyleable.rotation::class)
	open var rotation: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rotation(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.rotation::class, init)

	@DefinedBy(CoreViewStyleable.rotationX::class)
	open var rotationX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rotationX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.rotationX::class, init)

	@DefinedBy(CoreViewStyleable.rotationY::class)
	open var rotationY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rotationY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.rotationY::class, init)

	@DefinedBy(CoreViewStyleable.saveEnabled::class)
	open var saveEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun saveEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.saveEnabled::class, init)

	@DefinedBy(CoreViewStyleable.scaleX::class)
	open var scaleX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun scaleX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scaleX::class, init)

	@DefinedBy(CoreViewStyleable.scaleY::class)
	open var scaleY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun scaleY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scaleY::class, init)

	@DefinedBy(CoreViewStyleable.screenReaderFocusable::class)
	open var screenReaderFocusable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun screenReaderFocusable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.screenReaderFocusable::class, init)

	@DefinedBy(CoreViewStyleable.scrollIndicators::class)
	open var scrollIndicators: Any? by GenericFlagDelegate<CoreViewStyleable.ScrollIndicatorsFlag>(CoreViewStyleable.ScrollIndicatorsFlag::class)

	@DefinedBy(CoreViewStyleable.scrollX::class)
	open var scrollX: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun scrollX(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollX::class, init)

	@DefinedBy(CoreViewStyleable.scrollY::class)
	open var scrollY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun scrollY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollY::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarAlwaysDrawHorizontalTrack::class)
	open var scrollbarAlwaysDrawHorizontalTrack: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun scrollbarAlwaysDrawHorizontalTrack(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarAlwaysDrawHorizontalTrack::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarAlwaysDrawVerticalTrack::class)
	open var scrollbarAlwaysDrawVerticalTrack: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun scrollbarAlwaysDrawVerticalTrack(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarAlwaysDrawVerticalTrack::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarDefaultDelayBeforeFade::class)
	open var scrollbarDefaultDelayBeforeFade: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun scrollbarDefaultDelayBeforeFade(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarDefaultDelayBeforeFade::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarFadeDuration::class)
	open var scrollbarFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun scrollbarFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarFadeDuration::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarSize::class)
	open var scrollbarSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun scrollbarSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarSize::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarStyle::class)
	open var scrollbarStyle: Any? by GenericEnumDelegate<CoreViewStyleable.ScrollbarStyleEnum>(CoreViewStyleable.ScrollbarStyleEnum::class)

	@DefinedBy(CoreViewStyleable.scrollbarThumbHorizontal::class)
	open var scrollbarThumbHorizontal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scrollbarThumbHorizontal(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarThumbHorizontal::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarThumbVertical::class)
	open var scrollbarThumbVertical: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scrollbarThumbVertical(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarThumbVertical::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarTrackHorizontal::class)
	open var scrollbarTrackHorizontal: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scrollbarTrackHorizontal(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarTrackHorizontal::class, init)

	@DefinedBy(CoreViewStyleable.scrollbarTrackVertical::class)
	open var scrollbarTrackVertical: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scrollbarTrackVertical(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scrollbarTrackVertical::class, init)

	@DefinedBy(CoreViewStyleable.scrollbars::class)
	open var scrollbars: Any? by GenericFlagDelegate<CoreViewStyleable.ScrollbarsFlag>(CoreViewStyleable.ScrollbarsFlag::class)

	@DefinedBy(CoreViewStyleable.soundEffectsEnabled::class)
	open var soundEffectsEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun soundEffectsEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.soundEffectsEnabled::class, init)

	@DefinedBy(CoreViewStyleable.stateListAnimator::class)
	open var stateListAnimator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun stateListAnimator(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.stateListAnimator::class, init)

	@DefinedBy(CoreViewStyleable.tag::class)
	open var tag: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tag(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.tag::class, init)

	@DefinedBy(CoreViewStyleable.textAlignment::class)
	open var textAlignment: Any? by GenericEnumDelegate<CoreViewStyleable.TextAlignmentEnum>(CoreViewStyleable.TextAlignmentEnum::class)

	@DefinedBy(CoreViewStyleable.textDirection::class)
	open var textDirection: Any? by GenericEnumDelegate<CoreViewStyleable.TextDirectionEnum>(CoreViewStyleable.TextDirectionEnum::class)

	@DefinedBy(ManifestStyleable.theme::class)
	open var theme: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun theme(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.theme::class, init)

	@DefinedBy(CoreViewStyleable.tooltipText::class)
	open var tooltipText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipText(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.tooltipText::class, init)

	@DefinedBy(CoreViewStyleable.transformPivotX::class)
	open var transformPivotX: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun transformPivotX(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.transformPivotX::class, init)

	@DefinedBy(CoreViewStyleable.transformPivotY::class)
	open var transformPivotY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun transformPivotY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.transformPivotY::class, init)

	@DefinedBy(CoreViewStyleable.transitionName::class)
	open var transitionName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun transitionName(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.transitionName::class, init)

	@DefinedBy(CoreViewStyleable.translationX::class)
	open var translationX: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun translationX(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.translationX::class, init)

	@DefinedBy(CoreViewStyleable.translationY::class)
	open var translationY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun translationY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.translationY::class, init)

	@DefinedBy(CoreViewStyleable.translationZ::class)
	open var translationZ: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun translationZ(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.translationZ::class, init)

	@DefinedBy(CoreViewStyleable.verticalScrollbarPosition::class)
	open var verticalScrollbarPosition: Any? by GenericEnumDelegate<CoreViewStyleable.VerticalScrollbarPositionEnum>(CoreViewStyleable.VerticalScrollbarPositionEnum::class)

	@DefinedBy(CoreViewStyleable.visibility::class)
	open var visibility: Any? by GenericEnumDelegate<CoreViewStyleable.VisibilityEnum>(CoreViewStyleable.VisibilityEnum::class)

}

open class CoreWidgetStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

}

open class CoreViewGroup_LayoutStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
	open var layout_width: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutWidthEnum>(CoreViewGroup_LayoutStyleable.LayoutWidthEnum::class, Dimension::class, DimensionContainer::class)

}

open class CoreProgressBarStyle2 : CoreViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreProgressBarStyleable.animationResolution::class)
	open var animationResolution: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun animationResolution(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.animationResolution::class, init)

	@DefinedBy(CoreViewStyleable.backgroundTint::class)
	open override var backgroundTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun backgroundTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.backgroundTint::class, init)

	@DefinedBy(CoreViewStyleable.backgroundTintMode::class)
	open override var backgroundTintMode: Any? by GenericEnumDelegate<CoreViewStyleable.BackgroundTintModeEnum>(CoreViewStyleable.BackgroundTintModeEnum::class)

	@DefinedBy(CoreProgressBarStyleable.indeterminate::class)
	open var indeterminate: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun indeterminate(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.indeterminate::class, init)

	@DefinedBy(CoreProgressBarStyleable.indeterminateBehavior::class)
	open var indeterminateBehavior: Any? by GenericEnumDelegate<CoreProgressBarStyleable.IndeterminateBehaviorEnum>(CoreProgressBarStyleable.IndeterminateBehaviorEnum::class)

	@DefinedBy(CoreProgressBarStyleable.indeterminateDrawable::class)
	open var indeterminateDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun indeterminateDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.indeterminateDrawable::class, init)

	@DefinedBy(CoreProgressBarStyleable.indeterminateDuration::class)
	open var indeterminateDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun indeterminateDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.indeterminateDuration::class, init)

	@DefinedBy(CoreProgressBarStyleable.indeterminateOnly::class)
	open var indeterminateOnly: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun indeterminateOnly(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.indeterminateOnly::class, init)

	@DefinedBy(CoreProgressBarStyleable.indeterminateTint::class)
	open var indeterminateTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun indeterminateTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.indeterminateTint::class, init)

	@DefinedBy(CoreProgressBarStyleable.indeterminateTintMode::class)
	open var indeterminateTintMode: Any? by GenericEnumDelegate<CoreProgressBarStyleable.IndeterminateTintModeEnum>(CoreProgressBarStyleable.IndeterminateTintModeEnum::class)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

	@DefinedBy(CoreProgressBarStyleable.max::class)
	open var max: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun max(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.max::class, init)

	@DefinedBy(CoreImageViewStyleable.maxHeight::class)
	open var maxHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxHeight::class, init)

	@DefinedBy(CoreImageViewStyleable.maxWidth::class)
	open var maxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxWidth::class, init)

	@DefinedBy(CoreProgressBarStyleable.min::class)
	open var min: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun min(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.min::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open override var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open override var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreProgressBarStyleable.mirrorForRtl::class)
	open var mirrorForRtl: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun mirrorForRtl(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.mirrorForRtl::class, init)

	@DefinedBy(CoreProgressBarStyleable.progress::class)
	open var progress: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun progress(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.progress::class, init)

	@DefinedBy(CoreProgressBarStyleable.progressBackgroundTint::class)
	open var progressBackgroundTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun progressBackgroundTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.progressBackgroundTint::class, init)

	@DefinedBy(CoreProgressBarStyleable.progressBackgroundTintMode::class)
	open var progressBackgroundTintMode: Any? by GenericEnumDelegate<CoreProgressBarStyleable.ProgressBackgroundTintModeEnum>(CoreProgressBarStyleable.ProgressBackgroundTintModeEnum::class)

	@DefinedBy(CoreProgressBarStyleable.progressDrawable::class)
	open var progressDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun progressDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.progressDrawable::class, init)

	@DefinedBy(CoreProgressBarStyleable.progressTint::class)
	open var progressTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun progressTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.progressTint::class, init)

	@DefinedBy(CoreProgressBarStyleable.progressTintMode::class)
	open var progressTintMode: Any? by GenericEnumDelegate<CoreProgressBarStyleable.ProgressTintModeEnum>(CoreProgressBarStyleable.ProgressTintModeEnum::class)

	@DefinedBy(CoreProgressBarStyleable.secondaryProgress::class)
	open var secondaryProgress: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun secondaryProgress(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.secondaryProgress::class, init)

	@DefinedBy(CoreProgressBarStyleable.secondaryProgressTint::class)
	open var secondaryProgressTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun secondaryProgressTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.secondaryProgressTint::class, init)

	@DefinedBy(CoreProgressBarStyleable.secondaryProgressTintMode::class)
	open var secondaryProgressTintMode: Any? by GenericEnumDelegate<CoreProgressBarStyleable.SecondaryProgressTintModeEnum>(CoreProgressBarStyleable.SecondaryProgressTintModeEnum::class)

}

open class CoreTextAppearanceStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextAppearanceStyleable.elegantTextHeight::class)
	open var elegantTextHeight: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun elegantTextHeight(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.elegantTextHeight::class, init)

	@DefinedBy(CoreStyleable.fontFamily::class)
	open var fontFamily: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFamily(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.fontFamily::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.fontFeatureSettings::class)
	open var fontFeatureSettings: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFeatureSettings(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.fontFeatureSettings::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.letterSpacing::class)
	open var letterSpacing: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun letterSpacing(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.letterSpacing::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowColor::class)
	open var shadowColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shadowColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowColor::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowDx::class)
	open var shadowDx: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowDx(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowDx::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowDy::class)
	open var shadowDy: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowDy(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowDy::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowRadius::class)
	open var shadowRadius: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowRadius(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowRadius::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.textAllCaps::class)
	open var textAllCaps: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun textAllCaps(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.textAllCaps::class, init)

	@DefinedBy(CoreStyleable.textColor::class)
	open var textColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColor::class, init)

	@DefinedBy(CoreStyleable.textColorHighlight::class)
	open var textColorHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorHighlight::class, init)

	@DefinedBy(CoreStyleable.textColorHint::class)
	open var textColorHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorHint::class, init)

	@DefinedBy(CoreStyleable.textColorLink::class)
	open var textColorLink: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorLink(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorLink::class, init)

	@DefinedBy(CoreStyleable.textSize::class)
	open var textSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun textSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreStyleable.textSize::class, init)

	@DefinedBy(CoreStyleable.textStyle::class)
	open var textStyle: Any? by GenericFlagDelegate<TextStyle>(TextStyle::class)

	@DefinedBy(CoreStyleable.typeface::class)
	open var typeface: Any? by GenericEnumDelegate<Typeface>(Typeface::class)

}

open class CoreGridViewStyle2 : CoreAbsListViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGridViewStyleable.columnWidth::class)
	open var columnWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun columnWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGridViewStyleable.columnWidth::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreGridViewStyleable.horizontalSpacing::class)
	open var horizontalSpacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun horizontalSpacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGridViewStyleable.horizontalSpacing::class, init)

	@DefinedBy(CoreGridViewStyleable.numColumns::class)
	open var numColumns: Any? by GenericEnumDelegate<CoreGridViewStyleable.NumColumnsEnum>(CoreGridViewStyleable.NumColumnsEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreGridViewStyleable.stretchMode::class)
	open var stretchMode: Any? by GenericEnumDelegate<CoreGridViewStyleable.StretchModeEnum>(CoreGridViewStyleable.StretchModeEnum::class)

	@DefinedBy(CoreGridViewStyleable.verticalSpacing::class)
	open var verticalSpacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun verticalSpacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGridViewStyleable.verticalSpacing::class, init)

}

open class CoreAbsListViewStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAbsListViewStyleable.cacheColorHint::class)
	open var cacheColorHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun cacheColorHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.cacheColorHint::class, init)

	@DefinedBy(CoreAbsListViewStyleable.choiceMode::class)
	open var choiceMode: Any? by GenericEnumDelegate<CoreAbsListViewStyleable.ChoiceModeEnum>(CoreAbsListViewStyleable.ChoiceModeEnum::class)

	@DefinedBy(CoreAbsListViewStyleable.drawSelectorOnTop::class)
	open var drawSelectorOnTop: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun drawSelectorOnTop(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.drawSelectorOnTop::class, init)

	@DefinedBy(CoreAbsListViewStyleable.fastScrollAlwaysVisible::class)
	open var fastScrollAlwaysVisible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fastScrollAlwaysVisible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.fastScrollAlwaysVisible::class, init)

	@DefinedBy(CoreAbsListViewStyleable.fastScrollEnabled::class)
	open var fastScrollEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fastScrollEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.fastScrollEnabled::class, init)

	@DefinedBy(CoreAbsListViewStyleable.fastScrollStyle::class)
	open var fastScrollStyle: CoreFastScrollStyle2? by InlineStyleDelegate()
	open fun fastScrollStyle(init: CoreFastScrollStyle2.() -> Unit)
		= initInlineStyle(CoreFastScrollStyle2(), "fastScrollStyle", init)

	@DefinedBy(CoreAbsListViewStyleable.listSelector::class)
	open var listSelector: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listSelector(init: StringAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.listSelector::class, init)

	@DefinedBy(CoreAbsListViewStyleable.scrollingCache::class)
	open var scrollingCache: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun scrollingCache(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.scrollingCache::class, init)

	@DefinedBy(CoreAbsListViewStyleable.smoothScrollbar::class)
	open var smoothScrollbar: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun smoothScrollbar(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.smoothScrollbar::class, init)

	@DefinedBy(CoreAbsListViewStyleable.stackFromBottom::class)
	open var stackFromBottom: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun stackFromBottom(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.stackFromBottom::class, init)

	@DefinedBy(CoreAbsListViewStyleable.textFilterEnabled::class)
	open var textFilterEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun textFilterEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAbsListViewStyleable.textFilterEnabled::class, init)

	@DefinedBy(CoreAbsListViewStyleable.transcriptMode::class)
	open var transcriptMode: Any? by GenericEnumDelegate<CoreAbsListViewStyleable.TranscriptModeEnum>(CoreAbsListViewStyleable.TranscriptModeEnum::class)

}

open class CoreFastScrollStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFastScrollStyleable.backgroundLeft::class)
	open var backgroundLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.backgroundLeft::class, init)

	@DefinedBy(CoreFastScrollStyleable.backgroundRight::class)
	open var backgroundRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.backgroundRight::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreViewStyleable.padding::class)
	open var padding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun padding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.padding::class, init)

	@DefinedBy(CoreFastScrollStyleable.position::class)
	open var position: Any? by GenericEnumDelegate<CoreFastScrollStyleable.PositionEnum>(CoreFastScrollStyleable.PositionEnum::class)

	@DefinedBy(CoreTextViewStyleable.textAppearance::class)
	open var textAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearance", init)

	@DefinedBy(CoreStyleable.textColor::class)
	open var textColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColor::class, init)

	@DefinedBy(CoreStyleable.textSize::class)
	open var textSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun textSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreStyleable.textSize::class, init)

	@DefinedBy(CoreFastScrollStyleable.thumbDrawable::class)
	open var thumbDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumbDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.thumbDrawable::class, init)

	@DefinedBy(CoreFastScrollStyleable.thumbMinHeight::class)
	open var thumbMinHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thumbMinHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.thumbMinHeight::class, init)

	@DefinedBy(CoreFastScrollStyleable.thumbMinWidth::class)
	open var thumbMinWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thumbMinWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.thumbMinWidth::class, init)

	@DefinedBy(CoreFastScrollStyleable.thumbPosition::class)
	open var thumbPosition: Any? by GenericEnumDelegate<CoreFastScrollStyleable.ThumbPositionEnum>(CoreFastScrollStyleable.ThumbPositionEnum::class)

	@DefinedBy(CoreFastScrollStyleable.trackDrawable::class)
	open var trackDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun trackDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreFastScrollStyleable.trackDrawable::class, init)

}

open class CorePreferenceStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceStyleable.defaultValue::class)
	open var defaultValue: Any? by GenericDelegate(Boolean::class,BooleanContainer::class,Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class)
	open fun defaultValue(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.defaultValue::class, init)

	@DefinedBy(CorePreferenceStyleable.dependency::class)
	open var dependency: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dependency(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.dependency::class, init)

	@DefinedBy(CoreTextViewStyleable.enabled::class)
	open var enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.enabled::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.fragment::class)
	open var fragment: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragment(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.fragment::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CorePreferenceStyleable.iconSpaceReserved::class)
	open var iconSpaceReserved: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun iconSpaceReserved(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.iconSpaceReserved::class, init)

	@DefinedBy(CorePreferenceStyleable.key::class)
	open var key: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun key(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.key::class, init)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

	@DefinedBy(CorePreferenceStyleable.order::class)
	open var order: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun order(init: IntegerAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.order::class, init)

	@DefinedBy(ManifestStyleable.persistent::class)
	open var persistent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun persistent(init: BooleanAttribute.() -> Unit)
		= initAttr(ManifestStyleable.persistent::class, init)

	@DefinedBy(CorePreferenceStyleable.recycleEnabled::class)
	open var recycleEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun recycleEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.recycleEnabled::class, init)

	@DefinedBy(CorePreferenceStyleable.selectable::class)
	open var selectable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun selectable(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.selectable::class, init)

	@DefinedBy(CorePreferenceStyleable.shouldDisableView::class)
	open var shouldDisableView: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun shouldDisableView(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.shouldDisableView::class, init)

	@DefinedBy(CorePreferenceStyleable.singleLineTitle::class)
	open var singleLineTitle: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun singleLineTitle(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.singleLineTitle::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.summary::class)
	open var summary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summary(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.summary::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

	@DefinedBy(CorePreferenceStyleable.widgetLayout::class)
	open var widgetLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun widgetLayout(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.widgetLayout::class, init)

}

open class CoreCheckBoxPreferenceStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.disableDependentsState::class)
	open var disableDependentsState: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun disableDependentsState(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.disableDependentsState::class, init)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.summaryOff::class)
	open var summaryOff: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summaryOff(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.summaryOff::class, init)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.summaryOn::class)
	open var summaryOn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summaryOn(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.summaryOn::class, init)

}

open class CoreFragmentBreadCrumbsStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreFragmentBreadCrumbsStyleable.itemColor::class)
	open var itemColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun itemColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentBreadCrumbsStyleable.itemColor::class, init)

	@DefinedBy(CoreFragmentBreadCrumbsStyleable.itemLayout::class)
	open var itemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun itemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentBreadCrumbsStyleable.itemLayout::class, init)

}

open class CorePreferenceFragmentStyle2 : CoreFragmentStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

}

open class CoreFragmentStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFragmentStyleable.fragmentAllowEnterTransitionOverlapclass::class)
	open var fragmentAllowEnterTransitionOverlapclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentAllowEnterTransitionOverlapclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentAllowEnterTransitionOverlapclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentAllowReturnTransitionOverlapclass::class)
	open var fragmentAllowReturnTransitionOverlapclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentAllowReturnTransitionOverlapclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentAllowReturnTransitionOverlapclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentEnterTransitionclass::class)
	open var fragmentEnterTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentEnterTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentEnterTransitionclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentExitTransitionclass::class)
	open var fragmentExitTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentExitTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentExitTransitionclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentReenterTransitionclass::class)
	open var fragmentReenterTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentReenterTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentReenterTransitionclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentReturnTransitionclass::class)
	open var fragmentReturnTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentReturnTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentReturnTransitionclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentSharedElementEnterTransitionclass::class)
	open var fragmentSharedElementEnterTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentSharedElementEnterTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentSharedElementEnterTransitionclass::class, init)

	@DefinedBy(CoreFragmentStyleable.fragmentSharedElementReturnTransitionclass::class)
	open var fragmentSharedElementReturnTransitionclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentSharedElementReturnTransitionclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentStyleable.fragmentSharedElementReturnTransitionclass::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreViewStyleable.tag::class)
	open var tag: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tag(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.tag::class, init)

}

open class CoreDatePickerStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDatePickerStyleable.calendarTextColor::class)
	open var calendarTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun calendarTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.calendarTextColor::class, init)

	@DefinedBy(CoreDatePickerStyleable.calendarViewShown::class)
	open var calendarViewShown: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun calendarViewShown(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.calendarViewShown::class, init)

	@DefinedBy(CoreDatePickerStyleable.datePickerMode::class)
	open var datePickerMode: Any? by GenericEnumDelegate<CoreDatePickerStyleable.DatePickerModeEnum>(CoreDatePickerStyleable.DatePickerModeEnum::class)

	@DefinedBy(CoreDatePickerStyleable.dayOfWeekBackground::class)
	open var dayOfWeekBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dayOfWeekBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.dayOfWeekBackground::class, init)

	@DefinedBy(CoreDatePickerStyleable.dayOfWeekTextAppearance::class)
	open var dayOfWeekTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun dayOfWeekTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "dayOfWeekTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.dialogMode::class)
	open var dialogMode: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dialogMode(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.dialogMode::class, init)

	@DefinedBy(CoreDatePickerStyleable.endYear::class)
	open var endYear: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun endYear(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.endYear::class, init)

	@DefinedBy(CoreCalendarViewStyleable.firstDayOfWeek::class)
	open var firstDayOfWeek: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun firstDayOfWeek(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.firstDayOfWeek::class, init)

	@DefinedBy(CoreMenuViewStyleable.headerBackground::class)
	open var headerBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.headerBackground::class, init)

	@DefinedBy(CoreDatePickerStyleable.headerDayOfMonthTextAppearance::class)
	open var headerDayOfMonthTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun headerDayOfMonthTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "headerDayOfMonthTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.headerMonthTextAppearance::class)
	open var headerMonthTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun headerMonthTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "headerMonthTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.headerTextColor::class)
	open var headerTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.headerTextColor::class, init)

	@DefinedBy(CoreDatePickerStyleable.headerYearTextAppearance::class)
	open var headerYearTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun headerYearTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "headerYearTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.internalLayout::class)
	open var internalLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun internalLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.internalLayout::class, init)

	@DefinedBy(CoreTimePickerStyleable.legacyLayout::class)
	open var legacyLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun legacyLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.legacyLayout::class, init)

	@DefinedBy(CoreDatePickerStyleable.maxDate::class)
	open var maxDate: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun maxDate(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.maxDate::class, init)

	@DefinedBy(CoreDatePickerStyleable.minDate::class)
	open var minDate: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun minDate(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.minDate::class, init)

// SKIPPING spinnersShown

	@DefinedBy(CoreDatePickerStyleable.startYear::class)
	open var startYear: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun startYear(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.startYear::class, init)

	@DefinedBy(CoreDatePickerStyleable.yearListItemActivatedTextAppearance::class)
	open var yearListItemActivatedTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun yearListItemActivatedTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "yearListItemActivatedTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.yearListItemTextAppearance::class)
	open var yearListItemTextAppearance: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun yearListItemTextAppearance(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.yearListItemTextAppearance::class, init)

	@DefinedBy(CoreDatePickerStyleable.yearListSelectorColor::class)
	open var yearListSelectorColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun yearListSelectorColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.yearListSelectorColor::class, init)

}

open class CoreFrameLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFrameLayoutStyleable.measureAllChildren::class)
	open var measureAllChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun measureAllChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreFrameLayoutStyleable.measureAllChildren::class, init)

}

open class CoreFrameLayout_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

open class CoreNumberPickerStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreNumberPickerStyleable.hideWheelUntilFocused::class)
	open var hideWheelUntilFocused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun hideWheelUntilFocused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.hideWheelUntilFocused::class, init)

	@DefinedBy(CoreDatePickerStyleable.internalLayout::class)
	open var internalLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun internalLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.internalLayout::class, init)

	@DefinedBy(CoreNumberPickerStyleable.internalMaxHeight::class)
	open var internalMaxHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun internalMaxHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.internalMaxHeight::class, init)

	@DefinedBy(CoreNumberPickerStyleable.internalMaxWidth::class)
	open var internalMaxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun internalMaxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.internalMaxWidth::class, init)

	@DefinedBy(CoreNumberPickerStyleable.internalMinHeight::class)
	open var internalMinHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun internalMinHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.internalMinHeight::class, init)

	@DefinedBy(CoreNumberPickerStyleable.internalMinWidth::class)
	open var internalMinWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun internalMinWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.internalMinWidth::class, init)

	@DefinedBy(CoreNumberPickerStyleable.selectionDivider::class)
	open var selectionDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun selectionDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.selectionDivider::class, init)

	@DefinedBy(CoreNumberPickerStyleable.selectionDividerHeight::class)
	open var selectionDividerHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun selectionDividerHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.selectionDividerHeight::class, init)

	@DefinedBy(CoreNumberPickerStyleable.selectionDividersDistance::class)
	open var selectionDividersDistance: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun selectionDividersDistance(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.selectionDividersDistance::class, init)

	@DefinedBy(CoreNumberPickerStyleable.solidColor::class)
	open var solidColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun solidColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.solidColor::class, init)

	@DefinedBy(CoreNumberPickerStyleable.virtualButtonPressedDrawable::class)
	open var virtualButtonPressedDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun virtualButtonPressedDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreNumberPickerStyleable.virtualButtonPressedDrawable::class, init)

}

open class CoreLinearLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreLinearLayoutStyleable.baselineAligned::class)
	open var baselineAligned: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun baselineAligned(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.baselineAligned::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.baselineAlignedChildIndex::class)
	open var baselineAlignedChildIndex: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun baselineAlignedChildIndex(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.baselineAlignedChildIndex::class, init)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.dividerPadding::class)
	open var dividerPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dividerPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.dividerPadding::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreLinearLayoutStyleable.measureWithLargestChild::class)
	open var measureWithLargestChild: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun measureWithLargestChild(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.measureWithLargestChild::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreLinearLayoutStyleable.showDividers::class)
	open var showDividers: Any? by GenericFlagDelegate<CoreLinearLayoutStyleable.ShowDividersFlag>(CoreLinearLayoutStyleable.ShowDividersFlag::class)

	@DefinedBy(CoreLinearLayoutStyleable.weightSum::class)
	open var weightSum: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun weightSum(init: FloatAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.weightSum::class, init)

}

open class CoreLinearLayout_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open override var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreLinearLayout_LayoutStyleable.layout_weight::class)
	open var layout_weight: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun layout_weight(init: FloatAttribute.() -> Unit)
		= initAttr(CoreLinearLayout_LayoutStyleable.layout_weight::class, init)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
	open override var layout_width: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutWidthEnum>(CoreViewGroup_LayoutStyleable.LayoutWidthEnum::class, Dimension::class, DimensionContainer::class)

}

open class CoreScrollViewStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreScrollViewStyleable.fillViewport::class)
	open var fillViewport: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillViewport(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreScrollViewStyleable.fillViewport::class, init)

}

open class CoreQuickContactBadgeStyle2 : CoreImageViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreQuickContactBadgeStyleable.quickContactWindowSize::class)
	open var quickContactWindowSize: Any? by GenericEnumDelegate<CoreQuickContactBadgeStyleable.QuickContactWindowSizeEnum>(CoreQuickContactBadgeStyleable.QuickContactWindowSizeEnum::class)

}

open class CoreImageViewStyle2 : CoreViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreImageViewStyleable.adjustViewBounds::class)
	open var adjustViewBounds: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun adjustViewBounds(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.adjustViewBounds::class, init)

	@DefinedBy(CoreImageViewStyleable.baseline::class)
	open var baseline: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun baseline(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.baseline::class, init)

	@DefinedBy(CoreImageViewStyleable.baselineAlignBottom::class)
	open var baselineAlignBottom: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun baselineAlignBottom(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.baselineAlignBottom::class, init)

	@DefinedBy(CoreImageViewStyleable.cropToPadding::class)
	open var cropToPadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun cropToPadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.cropToPadding::class, init)

	@DefinedBy(CoreImageViewStyleable.drawableAlpha::class)
	open var drawableAlpha: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun drawableAlpha(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.drawableAlpha::class, init)

	@DefinedBy(CoreImageViewStyleable.maxHeight::class)
	open var maxHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxHeight::class, init)

	@DefinedBy(CoreImageViewStyleable.maxWidth::class)
	open var maxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxWidth::class, init)

	@DefinedBy(CoreImageViewStyleable.scaleType::class)
	open var scaleType: Any? by GenericEnumDelegate<CoreImageViewStyleable.ScaleTypeEnum>(CoreImageViewStyleable.ScaleTypeEnum::class)

	@DefinedBy(CoreImageViewStyleable.src::class)
	open var src: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun src(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.src::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tintMode::class)
	open var tintMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TintModeEnum>(CoreBitmapDrawableStyleable.TintModeEnum::class)

}

open class CoreMapViewStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreMapViewStyleable.apiKey::class)
	open var apiKey: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun apiKey(init: StringAttribute.() -> Unit)
		= initAttr(CoreMapViewStyleable.apiKey::class, init)

}

open class CoreActivityChooserViewStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreActivityChooserViewStyleable.expandActivityOverflowButtonDrawable::class)
	open var expandActivityOverflowButtonDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun expandActivityOverflowButtonDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreActivityChooserViewStyleable.expandActivityOverflowButtonDrawable::class, init)

	@DefinedBy(CoreActivityChooserViewStyleable.initialActivityCount::class)
	open var initialActivityCount: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun initialActivityCount(init: StringAttribute.() -> Unit)
		= initAttr(CoreActivityChooserViewStyleable.initialActivityCount::class, init)

}

open class CoreAutoCompleteTextViewStyle2 : CoreEditTextViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.completionHint::class)
	open var completionHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun completionHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.completionHint::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.completionHintView::class)
	open var completionHintView: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun completionHintView(init: StringAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.completionHintView::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.completionThreshold::class)
	open var completionThreshold: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun completionThreshold(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.completionThreshold::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownAnchor::class)
	open var dropDownAnchor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dropDownAnchor(init: StringAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.dropDownAnchor::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownHeight::class)
	open var dropDownHeight: Any? by GenericEnumDelegate<CoreAutoCompleteTextViewStyleable.DropDownHeightEnum>(CoreAutoCompleteTextViewStyleable.DropDownHeightEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownSelector::class)
	open var dropDownSelector: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dropDownSelector(init: StringAttribute.() -> Unit)
		= initAttr(CoreAutoCompleteTextViewStyleable.dropDownSelector::class, init)

	@DefinedBy(CoreAutoCompleteTextViewStyleable.dropDownWidth::class)
	open var dropDownWidth: Any? by GenericEnumDelegate<CoreAutoCompleteTextViewStyleable.DropDownWidthEnum>(CoreAutoCompleteTextViewStyleable.DropDownWidthEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreStyleable.inputType::class)
	open override var inputType: Any? by GenericFlagDelegate<InputType>(InputType::class)

	@DefinedBy(CoreToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "popupTheme", init)

}

open class CoreEditTextViewStyle2 : CoreTextViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

}

open class CoreTextViewStyle2 : CoreViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextViewStyleable.allowUndo::class)
	open var allowUndo: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowUndo(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.allowUndo::class, init)

	@DefinedBy(CoreStyleable.autoLink::class)
	open var autoLink: Any? by GenericFlagDelegate<AutoLink>(AutoLink::class)

	@DefinedBy(CoreTextViewStyleable.autoSizeMaxTextSize::class)
	open var autoSizeMaxTextSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun autoSizeMaxTextSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.autoSizeMaxTextSize::class, init)

	@DefinedBy(CoreTextViewStyleable.autoSizeMinTextSize::class)
	open var autoSizeMinTextSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun autoSizeMinTextSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.autoSizeMinTextSize::class, init)

// SKIPPING autoSizePresetSizes

	@DefinedBy(CoreTextViewStyleable.autoSizeStepGranularity::class)
	open var autoSizeStepGranularity: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun autoSizeStepGranularity(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.autoSizeStepGranularity::class, init)

	@DefinedBy(CoreTextViewStyleable.autoSizeTextType::class)
	open var autoSizeTextType: Any? by GenericEnumDelegate<CoreTextViewStyleable.AutoSizeTextTypeEnum>(CoreTextViewStyleable.AutoSizeTextTypeEnum::class)

	@DefinedBy(CoreTextViewStyleable.autoText::class)
	open var autoText: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoText(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.autoText::class, init)

	@DefinedBy(CoreTextViewStyleable.breakStrategy::class)
	open var breakStrategy: Any? by GenericEnumDelegate<CoreTextViewStyleable.BreakStrategyEnum>(CoreTextViewStyleable.BreakStrategyEnum::class)

	@DefinedBy(CoreTextViewStyleable.bufferType::class)
	open var bufferType: Any? by GenericEnumDelegate<CoreTextViewStyleable.BufferTypeEnum>(CoreTextViewStyleable.BufferTypeEnum::class)

	@DefinedBy(CoreTextViewStyleable.capitalize::class)
	open var capitalize: Any? by GenericEnumDelegate<CoreTextViewStyleable.CapitalizeEnum>(CoreTextViewStyleable.CapitalizeEnum::class)

	@DefinedBy(CoreTextViewStyleable.cursorVisible::class)
	open var cursorVisible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun cursorVisible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.cursorVisible::class, init)

	@DefinedBy(CoreTextViewStyleable.digits::class)
	open var digits: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun digits(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.digits::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableBottom::class)
	open var drawableBottom: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableBottom(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableBottom::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableEnd::class)
	open var drawableEnd: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableEnd(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableEnd::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableLeft::class)
	open var drawableLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableLeft::class, init)

	@DefinedBy(CoreTextViewStyleable.drawablePaddingclass::class)
	open var drawablePaddingclass: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun drawablePaddingclass(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawablePaddingclass::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableRight::class)
	open var drawableRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableRight::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableStart::class)
	open var drawableStart: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableStart(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableStart::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableTint::class)
	open var drawableTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableTint::class, init)

	@DefinedBy(CoreTextViewStyleable.drawableTintMode::class)
	open var drawableTintMode: Any? by GenericEnumDelegate<CoreTextViewStyleable.DrawableTintModeEnum>(CoreTextViewStyleable.DrawableTintModeEnum::class)

	@DefinedBy(CoreTextViewStyleable.drawableTop::class)
	open var drawableTop: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawableTop(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.drawableTop::class, init)

	@DefinedBy(CoreTextViewStyleable.editable::class)
	open var editable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun editable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.editable::class, init)

	@DefinedBy(CoreTextViewStyleable.editorExtras::class)
	open var editorExtras: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun editorExtras(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.editorExtras::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.elegantTextHeight::class)
	open var elegantTextHeight: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun elegantTextHeight(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.elegantTextHeight::class, init)

	@DefinedBy(CoreStyleable.ellipsize::class)
	open var ellipsize: Any? by GenericEnumDelegate<Ellipsize>(Ellipsize::class)

	@DefinedBy(CoreTextViewStyleable.ems::class)
	open var ems: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun ems(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.ems::class, init)

	@DefinedBy(CoreTextViewStyleable.enabled::class)
	open var enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.enabled::class, init)

	@DefinedBy(CoreStyleable.fontFamily::class)
	open var fontFamily: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFamily(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.fontFamily::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.fontFeatureSettings::class)
	open var fontFeatureSettings: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFeatureSettings(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.fontFeatureSettings::class, init)

	@DefinedBy(CoreTextViewStyleable.freezesText::class)
	open var freezesText: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun freezesText(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.freezesText::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreTextViewStyleable.hint::class)
	open var hint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun hint(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.hint::class, init)

	@DefinedBy(CoreTextViewStyleable.hyphenationFrequency::class)
	open var hyphenationFrequency: Any? by GenericEnumDelegate<CoreTextViewStyleable.HyphenationFrequencyEnum>(CoreTextViewStyleable.HyphenationFrequencyEnum::class)

	@DefinedBy(CoreTextViewStyleable.imeActionId::class)
	open var imeActionId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun imeActionId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.imeActionId::class, init)

	@DefinedBy(CoreTextViewStyleable.imeActionLabel::class)
	open var imeActionLabel: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeActionLabel(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.imeActionLabel::class, init)

	@DefinedBy(CoreStyleable.imeOptions::class)
	open var imeOptions: Any? by GenericFlagDelegate<ImeOptions>(ImeOptions::class)

	@DefinedBy(CoreTextViewStyleable.includeFontPadding::class)
	open var includeFontPadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun includeFontPadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.includeFontPadding::class, init)

	@DefinedBy(CoreTextViewStyleable.inputMethod::class)
	open var inputMethod: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun inputMethod(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.inputMethod::class, init)

	@DefinedBy(CoreStyleable.inputType::class)
	open var inputType: Any? by GenericFlagDelegate<InputType>(InputType::class)

	@DefinedBy(CoreTextViewStyleable.justificationMode::class)
	open var justificationMode: Any? by GenericEnumDelegate<CoreTextViewStyleable.JustificationModeEnum>(CoreTextViewStyleable.JustificationModeEnum::class)

	@DefinedBy(CoreTextAppearanceStyleable.letterSpacing::class)
	open var letterSpacing: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun letterSpacing(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.letterSpacing::class, init)

	@DefinedBy(CoreTextViewStyleable.lineSpacingExtra::class)
	open var lineSpacingExtra: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lineSpacingExtra(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.lineSpacingExtra::class, init)

	@DefinedBy(CoreTextViewStyleable.lineSpacingMultiplier::class)
	open var lineSpacingMultiplier: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun lineSpacingMultiplier(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.lineSpacingMultiplier::class, init)

	@DefinedBy(CoreTextViewStyleable.lines::class)
	open var lines: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun lines(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.lines::class, init)

	@DefinedBy(CoreTextViewStyleable.linksClickable::class)
	open var linksClickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun linksClickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.linksClickable::class, init)

	@DefinedBy(CoreTextViewStyleable.marqueeRepeatLimit::class)
	open var marqueeRepeatLimit: Any? by GenericEnumDelegate<CoreTextViewStyleable.MarqueeRepeatLimitEnum>(CoreTextViewStyleable.MarqueeRepeatLimitEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreTextViewStyleable.maxEms::class)
	open var maxEms: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxEms(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.maxEms::class, init)

	@DefinedBy(CoreImageViewStyleable.maxHeight::class)
	open var maxHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxHeight::class, init)

	@DefinedBy(CoreTextViewStyleable.maxLength::class)
	open var maxLength: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxLength(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.maxLength::class, init)

	@DefinedBy(CoreTextViewStyleable.maxLines::class)
	open var maxLines: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxLines(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.maxLines::class, init)

	@DefinedBy(CoreImageViewStyleable.maxWidth::class)
	open var maxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxWidth::class, init)

	@DefinedBy(CoreTextViewStyleable.minEms::class)
	open var minEms: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun minEms(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.minEms::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open override var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreTextViewStyleable.minLines::class)
	open var minLines: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun minLines(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.minLines::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open override var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreTextViewStyleable.numeric::class)
	open var numeric: Any? by GenericFlagDelegate<CoreTextViewStyleable.NumericFlag>(CoreTextViewStyleable.NumericFlag::class)

	@DefinedBy(CoreTextViewStyleable.password::class)
	open var password: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun password(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.password::class, init)

	@DefinedBy(CoreTextViewStyleable.phoneNumber::class)
	open var phoneNumber: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun phoneNumber(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.phoneNumber::class, init)

	@DefinedBy(CoreTextViewStyleable.privateImeOptions::class)
	open var privateImeOptions: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun privateImeOptions(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.privateImeOptions::class, init)

	@DefinedBy(CoreTextViewStyleable.scrollHorizontally::class)
	open var scrollHorizontally: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun scrollHorizontally(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.scrollHorizontally::class, init)

	@DefinedBy(CoreTextViewStyleable.selectAllOnFocus::class)
	open var selectAllOnFocus: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun selectAllOnFocus(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.selectAllOnFocus::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowColor::class)
	open var shadowColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shadowColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowColor::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowDx::class)
	open var shadowDx: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowDx(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowDx::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowDy::class)
	open var shadowDy: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowDy(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowDy::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowRadius::class)
	open var shadowRadius: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowRadius(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowRadius::class, init)

	@DefinedBy(CoreTextViewStyleable.singleLine::class)
	open var singleLine: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun singleLine(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.singleLine::class, init)

	@DefinedBy(CoreTextViewStyleable.text::class)
	open var text: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun text(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.text::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.textAllCaps::class)
	open var textAllCaps: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun textAllCaps(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.textAllCaps::class, init)

	@DefinedBy(CoreTextViewStyleable.textAppearance::class)
	open var textAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearance", init)

	@DefinedBy(CoreStyleable.textColor::class)
	open var textColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColor::class, init)

	@DefinedBy(CoreStyleable.textColorHighlight::class)
	open var textColorHighlight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHighlight(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorHighlight::class, init)

	@DefinedBy(CoreStyleable.textColorHint::class)
	open var textColorHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorHint::class, init)

	@DefinedBy(CoreStyleable.textColorLink::class)
	open var textColorLink: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColorLink(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColorLink::class, init)

	@DefinedBy(CoreStyleable.textCursorDrawable::class)
	open var textCursorDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textCursorDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textCursorDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.textEditNoPasteWindowLayout::class)
	open var textEditNoPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditNoPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditNoPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditPasteWindowLayout::class)
	open var textEditPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSideNoPasteWindowLayout::class)
	open var textEditSideNoPasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSideNoPasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSideNoPasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSidePasteWindowLayout::class)
	open var textEditSidePasteWindowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSidePasteWindowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSidePasteWindowLayout::class, init)

	@DefinedBy(CoreThemeStyleable.textEditSuggestionContainerLayout::class)
	open var textEditSuggestionContainerLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSuggestionContainerLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSuggestionContainerLayout::class, init)


	@DefinedBy(CoreThemeStyleable.textEditSuggestionItemLayout::class)
	open var textEditSuggestionItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSuggestionItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSuggestionItemLayout::class, init)

	@DefinedBy(CoreStyleable.textIsSelectable::class)
	open var textIsSelectable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun textIsSelectable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStyleable.textIsSelectable::class, init)

	@DefinedBy(CoreTextViewStyleable.textScaleX::class)
	open var textScaleX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun textScaleX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.textScaleX::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandle::class)
	open var textSelectHandle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandle(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandle::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandleLeft::class)
	open var textSelectHandleLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandleLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandleLeft::class, init)

	@DefinedBy(CoreThemeStyleable.textSelectHandleRight::class)
	open var textSelectHandleRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textSelectHandleRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textSelectHandleRight::class, init)

	@DefinedBy(CoreStyleable.textSize::class)
	open var textSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun textSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreStyleable.textSize::class, init)

	@DefinedBy(CoreStyleable.textStyle::class)
	open var textStyle: Any? by GenericFlagDelegate<TextStyle>(TextStyle::class)

	@DefinedBy(CoreStyleable.typeface::class)
	open var typeface: Any? by GenericEnumDelegate<Typeface>(Typeface::class)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreActionBarStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.background::class)
	open override var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(CoreActionBarStyleable.backgroundSplit::class)
	open var backgroundSplit: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundSplit(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.backgroundSplit::class, init)

	@DefinedBy(CoreActionBarStyleable.backgroundStacked::class)
	open var backgroundStacked: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundStacked(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.backgroundStacked::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetEnd::class)
	open var contentInsetEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetEnd::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetEndWithActions::class)
	open var contentInsetEndWithActions: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEndWithActions(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetEndWithActions::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetLeft::class)
	open var contentInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetLeft::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetRight::class)
	open var contentInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetRight::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetStart::class)
	open var contentInsetStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetStart::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetStartWithNavigation::class)
	open var contentInsetStartWithNavigation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStartWithNavigation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetStartWithNavigation::class, init)

	@DefinedBy(CoreActionBarStyleable.customNavigationLayout::class)
	open var customNavigationLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun customNavigationLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.customNavigationLayout::class, init)

	@DefinedBy(CoreActionBarStyleable.displayOptions::class)
	open var displayOptions: Any? by GenericFlagDelegate<CoreActionBarStyleable.DisplayOptionsFlag>(CoreActionBarStyleable.DisplayOptionsFlag::class)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreViewStyleable.elevation::class)
	open override var elevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun elevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.elevation::class, init)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreActionBarStyleable.hideOnContentScroll::class)
	open var hideOnContentScroll: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun hideOnContentScroll(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.hideOnContentScroll::class, init)

	@DefinedBy(CoreThemeStyleable.homeAsUpIndicator::class)
	open var homeAsUpIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeAsUpIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.homeAsUpIndicator::class, init)

	@DefinedBy(CoreActionBarStyleable.homeLayout::class)
	open var homeLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.homeLayout::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreActionBarStyleable.indeterminateProgressStyle::class)
	open var indeterminateProgressStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun indeterminateProgressStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.indeterminateProgressStyle::class, init)

	@DefinedBy(CoreActionBarStyleable.itemPadding::class)
	open var itemPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun itemPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.itemPadding::class, init)

	@DefinedBy(ManifestStyleable.logo::class)
	open var logo: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logo(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.logo::class, init)

	@DefinedBy(CoreActionBarStyleable.navigationMode::class)
	open var navigationMode: Any? by GenericEnumDelegate<CoreActionBarStyleable.NavigationModeEnum>(CoreActionBarStyleable.NavigationModeEnum::class)

	@DefinedBy(CoreToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "popupTheme", init)

	@DefinedBy(CoreActionBarStyleable.progressBarPadding::class)
	open var progressBarPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun progressBarPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.progressBarPadding::class, init)

	@DefinedBy(CoreThemeStyleable.progressBarStyle::class)
	open var progressBarStyle: CoreProgressBarStyle2? by InlineStyleDelegate()
	open fun progressBarStyle(init: CoreProgressBarStyle2.() -> Unit)
		= initInlineStyle(CoreProgressBarStyle2(), "progressBarStyle", init)

	@DefinedBy(CoreActionBarStyleable.subtitle::class)
	open var subtitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.subtitle::class, init)

	@DefinedBy(CoreActionBarStyleable.subtitleTextStyle::class)
	open var subtitleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.subtitleTextStyle::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

	@DefinedBy(CoreActionBarStyleable.titleTextStyle::class)
	open var titleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.titleTextStyle::class, init)

}

open class CoreActionBar_LayoutParamsStyle2 : CoreViewGroup_MarginLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

open class CoreViewGroup_MarginLayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open override var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_margin::class)
	open var layout_margin: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_margin(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_margin::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginBottom::class)
	open var layout_marginBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginBottom::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginEnd::class)
	open var layout_marginEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginEnd::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginHorizontal::class)
	open var layout_marginHorizontal: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginHorizontal(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginHorizontal::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginLeft::class)
	open var layout_marginLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginLeft::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginRight::class)
	open var layout_marginRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginRight::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginStart::class)
	open var layout_marginStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginStart::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginTop::class)
	open var layout_marginTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginTop::class, init)

	@DefinedBy(CoreViewGroup_MarginLayoutStyleable.layout_marginVertical::class)
	open var layout_marginVertical: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_marginVertical(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_MarginLayoutStyleable.layout_marginVertical::class, init)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
	open override var layout_width: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutWidthEnum>(CoreViewGroup_LayoutStyleable.LayoutWidthEnum::class, Dimension::class, DimensionContainer::class)

}

open class CoreGestureOverlayViewStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGestureOverlayViewStyleable.eventsInterceptionEnabled::class)
	open var eventsInterceptionEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun eventsInterceptionEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.eventsInterceptionEnabled::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.fadeDuration::class)
	open var fadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun fadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.fadeDuration::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.fadeEnabled::class)
	open var fadeEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fadeEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.fadeEnabled::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.fadeOffset::class)
	open var fadeOffset: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun fadeOffset(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.fadeOffset::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureColor::class)
	open var gestureColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun gestureColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.gestureColor::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureStrokeAngleThreshold::class)
	open var gestureStrokeAngleThreshold: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun gestureStrokeAngleThreshold(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.gestureStrokeAngleThreshold::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureStrokeLengthThreshold::class)
	open var gestureStrokeLengthThreshold: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun gestureStrokeLengthThreshold(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.gestureStrokeLengthThreshold::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureStrokeSquarenessThreshold::class)
	open var gestureStrokeSquarenessThreshold: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun gestureStrokeSquarenessThreshold(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.gestureStrokeSquarenessThreshold::class, init)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureStrokeType::class)
	open var gestureStrokeType: Any? by GenericEnumDelegate<CoreGestureOverlayViewStyleable.GestureStrokeTypeEnum>(CoreGestureOverlayViewStyleable.GestureStrokeTypeEnum::class)

	@DefinedBy(CoreGestureOverlayViewStyleable.gestureStrokeWidth::class)
	open var gestureStrokeWidth: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun gestureStrokeWidth(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.gestureStrokeWidth::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreGestureOverlayViewStyleable.uncertainGestureColor::class)
	open var uncertainGestureColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun uncertainGestureColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGestureOverlayViewStyleable.uncertainGestureColor::class, init)

}

open class CoreStackViewStyle2 : CoreAdapterViewAnimatorStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStackViewStyleable.clickColor::class)
	open var clickColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun clickColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStackViewStyleable.clickColor::class, init)

	@DefinedBy(CoreStackViewStyleable.resOutColor::class)
	open var resOutColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun resOutColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStackViewStyleable.resOutColor::class, init)

}

open class CoreAdapterViewAnimatorStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewAnimatorStyleable.animateFirstView::class)
	open var animateFirstView: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateFirstView(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.animateFirstView::class, init)

	@DefinedBy(CoreViewAnimatorStyleable.inAnimation::class)
	open var inAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun inAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.inAnimation::class, init)

	@DefinedBy(CoreAdapterViewAnimatorStyleable.loopViews::class)
	open var loopViews: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun loopViews(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAdapterViewAnimatorStyleable.loopViews::class, init)

	@DefinedBy(CoreViewAnimatorStyleable.outAnimation::class)
	open var outAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun outAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.outAnimation::class, init)

}

open class CoreButtonStyle2 : CoreTextViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

}

open class CoreActionModeStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.background::class)
	open var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(CoreActionBarStyleable.backgroundSplit::class)
	open var backgroundSplit: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundSplit(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.backgroundSplit::class, init)

	@DefinedBy(CoreActionModeStyleable.closeItemLayout::class)
	open var closeItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun closeItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionModeStyleable.closeItemLayout::class, init)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreActionBarStyleable.subtitleTextStyle::class)
	open var subtitleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.subtitleTextStyle::class, init)

	@DefinedBy(CoreActionBarStyleable.titleTextStyle::class)
	open var titleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.titleTextStyle::class, init)

}

open class CorePreferenceScreenStyle2 : CorePreferenceGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CorePreferenceScreenStyleable.screenLayout::class)
	open var screenLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun screenLayout(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceScreenStyleable.screenLayout::class, init)

}

open class CorePreferenceGroupStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceGroupStyleable.orderingFromXml::class)
	open var orderingFromXml: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun orderingFromXml(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceGroupStyleable.orderingFromXml::class, init)

}

open class CorePopupWindowStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePopupWindowStyleable.overlapAnchor::class)
	open var overlapAnchor: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun overlapAnchor(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.overlapAnchor::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupAnimationStyle::class)
	open var popupAnimationStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupAnimationStyle(init: StringAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupAnimationStyle::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupBackground::class)
	open var popupBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupBackground(init: StringAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupBackground::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupElevation::class)
	open var popupElevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun popupElevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupElevation::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupEnterTransition::class)
	open var popupEnterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupEnterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupEnterTransition::class, init)

	@DefinedBy(CorePopupWindowStyleable.popupExitTransition::class)
	open var popupExitTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupExitTransition(init: StringAttribute.() -> Unit)
		= initAttr(CorePopupWindowStyleable.popupExitTransition::class, init)

}

open class CoreSeekBarStyle2 : CoreProgressBarStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSeekBarStyleable.splitTrack::class)
	open var splitTrack: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun splitTrack(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.splitTrack::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumb::class)
	open var thumb: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumb(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.thumb::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumbOffset::class)
	open var thumbOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thumbOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.thumbOffset::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumbTint::class)
	open var thumbTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumbTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.thumbTint::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumbTintMode::class)
	open var thumbTintMode: Any? by GenericEnumDelegate<CoreSeekBarStyleable.ThumbTintModeEnum>(CoreSeekBarStyleable.ThumbTintModeEnum::class)

	@DefinedBy(CoreSeekBarStyleable.tickMark::class)
	open var tickMark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tickMark(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.tickMark::class, init)

	@DefinedBy(CoreSeekBarStyleable.tickMarkTint::class)
	open var tickMarkTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tickMarkTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.tickMarkTint::class, init)

	@DefinedBy(CoreSeekBarStyleable.tickMarkTintMode::class)
	open var tickMarkTintMode: Any? by GenericEnumDelegate<CoreSeekBarStyleable.TickMarkTintModeEnum>(CoreSeekBarStyleable.TickMarkTintModeEnum::class)

	@DefinedBy(CoreSeekBarStyleable.useDisabledAlpha::class)
	open var useDisabledAlpha: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useDisabledAlpha(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.useDisabledAlpha::class, init)

}

open class CoreTabWidgetStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open override var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreTabWidgetStyleable.tabLayout::class)
	open var tabLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tabLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreTabWidgetStyleable.tabLayout::class, init)

	@DefinedBy(CoreTabWidgetStyleable.tabStripEnabled::class)
	open var tabStripEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun tabStripEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTabWidgetStyleable.tabStripEnabled::class, init)

	@DefinedBy(CoreTabWidgetStyleable.tabStripLeft::class)
	open var tabStripLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tabStripLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreTabWidgetStyleable.tabStripLeft::class, init)

	@DefinedBy(CoreTabWidgetStyleable.tabStripRight::class)
	open var tabStripRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tabStripRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreTabWidgetStyleable.tabStripRight::class, init)

}

open class CoreListViewStyle2 : CoreAbsListViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreListViewStyleable.dividerHeight::class)
	open var dividerHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dividerHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.dividerHeight::class, init)

	@DefinedBy(CoreStyleable.entries::class)
	open var entries: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entries(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.entries::class, init)

	@DefinedBy(CoreListViewStyleable.footerDividersEnabled::class)
	open var footerDividersEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun footerDividersEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.footerDividersEnabled::class, init)

	@DefinedBy(CoreListViewStyleable.headerDividersEnabled::class)
	open var headerDividersEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun headerDividersEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.headerDividersEnabled::class, init)

	@DefinedBy(CoreListViewStyleable.overScrollFooter::class)
	open var overScrollFooter: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun overScrollFooter(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.overScrollFooter::class, init)

	@DefinedBy(CoreListViewStyleable.overScrollHeader::class)
	open var overScrollHeader: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun overScrollHeader(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.overScrollHeader::class, init)

}

open class CorePreferenceFrameLayoutStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceFrameLayoutStyleable.borderBottom::class)
	open var borderBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun borderBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePreferenceFrameLayoutStyleable.borderBottom::class, init)

	@DefinedBy(CorePreferenceFrameLayoutStyleable.borderLeft::class)
	open var borderLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun borderLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePreferenceFrameLayoutStyleable.borderLeft::class, init)

	@DefinedBy(CorePreferenceFrameLayoutStyleable.borderRight::class)
	open var borderRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun borderRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePreferenceFrameLayoutStyleable.borderRight::class, init)

	@DefinedBy(CorePreferenceFrameLayoutStyleable.borderTop::class)
	open var borderTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun borderTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePreferenceFrameLayoutStyleable.borderTop::class, init)

}

open class CoreSearchViewStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSearchViewStyleable.closeIcon::class)
	open var closeIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun closeIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.closeIcon::class, init)

	@DefinedBy(CoreSearchViewStyleable.commitIcon::class)
	open var commitIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun commitIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.commitIcon::class, init)

	@DefinedBy(CoreSearchViewStyleable.defaultQueryHint::class)
	open var defaultQueryHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun defaultQueryHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.defaultQueryHint::class, init)

	@DefinedBy(CoreSearchViewStyleable.goIcon::class)
	open var goIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun goIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.goIcon::class, init)

	@DefinedBy(CoreSearchViewStyleable.iconifiedByDefault::class)
	open var iconifiedByDefault: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun iconifiedByDefault(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.iconifiedByDefault::class, init)

	@DefinedBy(CoreStyleable.imeOptions::class)
	open var imeOptions: Any? by GenericFlagDelegate<ImeOptions>(ImeOptions::class)

	@DefinedBy(CoreStyleable.inputType::class)
	open var inputType: Any? by GenericFlagDelegate<InputType>(InputType::class)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

	@DefinedBy(CoreImageViewStyleable.maxWidth::class)
	open var maxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxWidth::class, init)

	@DefinedBy(CoreSearchViewStyleable.queryBackground::class)
	open var queryBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun queryBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.queryBackground::class, init)

	@DefinedBy(CoreSearchViewStyleable.queryHint::class)
	open var queryHint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun queryHint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.queryHint::class, init)

	@DefinedBy(CoreSearchViewStyleable.searchHintIcon::class)
	open var searchHintIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchHintIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.searchHintIcon::class, init)

	@DefinedBy(CoreSearchViewStyleable.searchIcon::class)
	open var searchIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.searchIcon::class, init)

	@DefinedBy(CoreSearchViewStyleable.submitBackground::class)
	open var submitBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun submitBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.submitBackground::class, init)

	@DefinedBy(CoreSearchViewStyleable.suggestionRowLayout::class)
	open var suggestionRowLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun suggestionRowLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.suggestionRowLayout::class, init)

	@DefinedBy(CoreSearchViewStyleable.voiceIcon::class)
	open var voiceIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun voiceIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchViewStyleable.voiceIcon::class, init)

}

open class CoreDialogPreferenceStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDialogPreferenceStyleable.dialogIcon::class)
	open var dialogIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.dialogIcon::class, init)

	@DefinedBy(CoreDialogPreferenceStyleable.dialogLayout::class)
	open var dialogLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.dialogLayout::class, init)

	@DefinedBy(CoreDialogPreferenceStyleable.dialogMessage::class)
	open var dialogMessage: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogMessage(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.dialogMessage::class, init)

	@DefinedBy(CoreDialogPreferenceStyleable.dialogTitle::class)
	open var dialogTitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dialogTitle(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.dialogTitle::class, init)

	@DefinedBy(CoreDialogPreferenceStyleable.negativeButtonText::class)
	open var negativeButtonText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun negativeButtonText(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.negativeButtonText::class, init)

	@DefinedBy(CoreDialogPreferenceStyleable.positiveButtonText::class)
	open var positiveButtonText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun positiveButtonText(init: StringAttribute.() -> Unit)
		= initAttr(CoreDialogPreferenceStyleable.positiveButtonText::class, init)

}

open class CoreRatingBarStyle2 : CoreProgressBarStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRatingBarStyleable.isIndicator::class)
	open var isIndicator: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isIndicator(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRatingBarStyleable.isIndicator::class, init)

	@DefinedBy(CoreRatingBarStyleable.numStars::class)
	open var numStars: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun numStars(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRatingBarStyleable.numStars::class, init)

	@DefinedBy(CoreRatingBarStyleable.rating::class)
	open var rating: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rating(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRatingBarStyleable.rating::class, init)

	@DefinedBy(CoreRatingBarStyleable.stepSize::class)
	open var stepSize: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun stepSize(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRatingBarStyleable.stepSize::class, init)

}

open class CoreTimePickerStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTimePickerStyleable.amPmBackgroundColor::class)
	open var amPmBackgroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun amPmBackgroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.amPmBackgroundColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.amPmTextColor::class)
	open var amPmTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun amPmTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.amPmTextColor::class, init)

	@DefinedBy(CoreDatePickerStyleable.dialogMode::class)
	open var dialogMode: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dialogMode(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.dialogMode::class, init)

	@DefinedBy(CoreTimePickerStyleable.headerAmPmTextAppearance::class)
	open var headerAmPmTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun headerAmPmTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "headerAmPmTextAppearance", init)

	@DefinedBy(CoreMenuViewStyleable.headerBackground::class)
	open var headerBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.headerBackground::class, init)

	@DefinedBy(CoreDatePickerStyleable.headerTextColor::class)
	open var headerTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.headerTextColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.headerTimeTextAppearance::class)
	open var headerTimeTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun headerTimeTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "headerTimeTextAppearance", init)

	@DefinedBy(CoreDatePickerStyleable.internalLayout::class)
	open var internalLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun internalLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.internalLayout::class, init)

	@DefinedBy(CoreTimePickerStyleable.legacyLayout::class)
	open var legacyLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun legacyLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.legacyLayout::class, init)

	@DefinedBy(CoreTimePickerStyleable.numbersBackgroundColor::class)
	open var numbersBackgroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun numbersBackgroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.numbersBackgroundColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.numbersInnerTextColor::class)
	open var numbersInnerTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun numbersInnerTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.numbersInnerTextColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.numbersSelectorColor::class)
	open var numbersSelectorColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun numbersSelectorColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.numbersSelectorColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.numbersTextColor::class)
	open var numbersTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun numbersTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTimePickerStyleable.numbersTextColor::class, init)

	@DefinedBy(CoreTimePickerStyleable.timePickerMode::class)
	open var timePickerMode: Any? by GenericEnumDelegate<CoreTimePickerStyleable.TimePickerModeEnum>(CoreTimePickerStyleable.TimePickerModeEnum::class)

}

open class CoreListPreferenceStyle2 : CoreDialogPreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.entries::class)
	open var entries: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entries(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.entries::class, init)

	@DefinedBy(CoreListPreferenceStyleable.entryValues::class)
	open var entryValues: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entryValues(init: StringAttribute.() -> Unit)
		= initAttr(CoreListPreferenceStyleable.entryValues::class, init)

}

open class CoreMediaRouteButtonStyle2 : CoreViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreMediaRouteButtonStyleable.externalRouteEnabledDrawable::class)
	open var externalRouteEnabledDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun externalRouteEnabledDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreMediaRouteButtonStyleable.externalRouteEnabledDrawable::class, init)

	@DefinedBy(CoreMediaRouteButtonStyleable.mediaRouteTypes::class)
	open var mediaRouteTypes: Any? by GenericEnumDelegate<CoreMediaRouteButtonStyleable.MediaRouteTypesEnum>(CoreMediaRouteButtonStyleable.MediaRouteTypesEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open override var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open override var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open override fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

}

open class CoreSeekBarPreferenceStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSeekBarPreferenceStyleable.adjustable::class)
	open var adjustable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun adjustable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSeekBarPreferenceStyleable.adjustable::class, init)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open override var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

	@DefinedBy(CoreSeekBarPreferenceStyleable.showSeekBarValue::class)
	open var showSeekBarValue: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showSeekBarValue(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSeekBarPreferenceStyleable.showSeekBarValue::class, init)

}

open class CoreHorizontalScrollViewStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreHorizontalScrollViewStyleable.fillViewport::class)
	open var fillViewport: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillViewport(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreHorizontalScrollViewStyleable.fillViewport::class, init)

}

open class CoreToolbarStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreToolbarStyleable.buttonGravity::class)
	open var buttonGravity: Any? by GenericFlagDelegate<CoreToolbarStyleable.ButtonGravityFlag>(CoreToolbarStyleable.ButtonGravityFlag::class)

	@DefinedBy(CoreToolbarStyleable.collapseContentDescription::class)
	open var collapseContentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseContentDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.collapseContentDescription::class, init)

	@DefinedBy(CoreToolbarStyleable.collapseIcon::class)
	open var collapseIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.collapseIcon::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetEnd::class)
	open var contentInsetEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetEnd::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetEndWithActions::class)
	open var contentInsetEndWithActions: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEndWithActions(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetEndWithActions::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetLeft::class)
	open var contentInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetLeft::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetRight::class)
	open var contentInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetRight::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetStart::class)
	open var contentInsetStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetStart::class, init)

	@DefinedBy(CoreActionBarStyleable.contentInsetStartWithNavigation::class)
	open var contentInsetStartWithNavigation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStartWithNavigation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.contentInsetStartWithNavigation::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(ManifestStyleable.logo::class)
	open var logo: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logo(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.logo::class, init)

	@DefinedBy(CoreToolbarStyleable.logoDescription::class)
	open var logoDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logoDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.logoDescription::class, init)

	@DefinedBy(CoreToolbarStyleable.maxButtonHeight::class)
	open var maxButtonHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxButtonHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.maxButtonHeight::class, init)

	@DefinedBy(CoreToolbarStyleable.navigationContentDescription::class)
	open var navigationContentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationContentDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.navigationContentDescription::class, init)

	@DefinedBy(CoreToolbarStyleable.navigationIcon::class)
	open var navigationIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.navigationIcon::class, init)

	@DefinedBy(CoreToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle2? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle2.() -> Unit)
		= initInlineStyle(CoreThemeStyle2(), "popupTheme", init)

	@DefinedBy(CoreActionBarStyleable.subtitle::class)
	open var subtitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitle(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.subtitle::class, init)

	@DefinedBy(CoreToolbarStyleable.subtitleTextAppearance::class)
	open var subtitleTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun subtitleTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "subtitleTextAppearance", init)

	@DefinedBy(CoreToolbarStyleable.subtitleTextColor::class)
	open var subtitleTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitleTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.subtitleTextColor::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

	@DefinedBy(CoreToolbarStyleable.titleMargin::class)
	open var titleMargin: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMargin(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleMargin::class, init)

	@DefinedBy(CoreToolbarStyleable.titleMarginBottom::class)
	open var titleMarginBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleMarginBottom::class, init)

	@DefinedBy(CoreToolbarStyleable.titleMarginEnd::class)
	open var titleMarginEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleMarginEnd::class, init)

	@DefinedBy(CoreToolbarStyleable.titleMarginStart::class)
	open var titleMarginStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleMarginStart::class, init)

	@DefinedBy(CoreToolbarStyleable.titleMarginTop::class)
	open var titleMarginTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleMarginTop::class, init)

	@DefinedBy(CoreToolbarStyleable.titleTextAppearance::class)
	open var titleTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun titleTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "titleTextAppearance", init)

	@DefinedBy(CoreToolbarStyleable.titleTextColor::class)
	open var titleTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreToolbarStyleable.titleTextColor::class, init)

}

open class CoreToolbar_LayoutParamsStyle2 : CoreActionBar_LayoutParamsStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open override var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

open class CoreWindowStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.backgroundDimAmount::class)
	open var backgroundDimAmount: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun backgroundDimAmount(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.backgroundDimAmount::class, init)

	@DefinedBy(CoreThemeStyleable.backgroundDimEnabled::class)
	open var backgroundDimEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun backgroundDimEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.backgroundDimEnabled::class, init)

	@DefinedBy(CoreWindowStyleable.navigationBarColor::class)
	open var navigationBarColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationBarColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.navigationBarColor::class, init)

	@DefinedBy(CoreWindowStyleable.navigationBarDividerColor::class)
	open var navigationBarDividerColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationBarDividerColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.navigationBarDividerColor::class, init)

	@DefinedBy(CoreWindowStyleable.statusBarColor::class)
	open var statusBarColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun statusBarColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.statusBarColor::class, init)

	@DefinedBy(CoreStyleable.textColor::class)
	open var textColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textColor::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionBar::class)
	open var windowActionBar: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowActionBar(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBar::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionBarFullscreenDecorLayout::class)
	open var windowActionBarFullscreenDecorLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowActionBarFullscreenDecorLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBarFullscreenDecorLayout::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionBarOverlay::class)
	open var windowActionBarOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowActionBarOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionBarOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowActionModeOverlay::class)
	open var windowActionModeOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActionModeOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowActivityTransitions::class)
	open var windowActivityTransitions: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowActivityTransitions(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowActivityTransitions::class, init)

	@DefinedBy(CoreThemeStyleable.windowAllowEnterTransitionOverlap::class)
	open var windowAllowEnterTransitionOverlap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowAllowEnterTransitionOverlap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowAllowEnterTransitionOverlap::class, init)

	@DefinedBy(CoreThemeStyleable.windowAllowReturnTransitionOverlap::class)
	open var windowAllowReturnTransitionOverlap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowAllowReturnTransitionOverlap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowAllowReturnTransitionOverlap::class, init)

	@DefinedBy(CoreThemeStyleable.windowAnimationStyle::class)
	open var windowAnimationStyle: CoreWindowAnimationStyle2? by InlineStyleDelegate()
	open fun windowAnimationStyle(init: CoreWindowAnimationStyle2.() -> Unit)
		= initInlineStyle(CoreWindowAnimationStyle2(), "windowAnimationStyle", init)

	@DefinedBy(CoreThemeStyleable.windowBackground::class)
	open var windowBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowBackground::class, init)

	@DefinedBy(CoreThemeStyleable.windowBackgroundFallback::class)
	open var windowBackgroundFallback: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowBackgroundFallback(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowBackgroundFallback::class, init)

	@DefinedBy(CoreWindowStyleable.windowClipToOutline::class)
	open var windowClipToOutline: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowClipToOutline(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowClipToOutline::class, init)

	@DefinedBy(CoreThemeStyleable.windowCloseOnTouchOutside::class)
	open var windowCloseOnTouchOutside: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowCloseOnTouchOutside(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowCloseOnTouchOutside::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentOverlay::class)
	open var windowContentOverlay: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowContentOverlay(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentTransitionManager::class)
	open var windowContentTransitionManager: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowContentTransitionManager(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentTransitionManager::class, init)

	@DefinedBy(CoreThemeStyleable.windowContentTransitions::class)
	open var windowContentTransitions: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowContentTransitions(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowContentTransitions::class, init)

	@DefinedBy(CoreThemeStyleable.windowDisablePreview::class)
	open var windowDisablePreview: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowDisablePreview(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowDisablePreview::class, init)

	@DefinedBy(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class)
	open var windowDrawsSystemBarBackgrounds: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowDrawsSystemBarBackgrounds(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class, init)

	@DefinedBy(CoreWindowStyleable.windowElevation::class)
	open var windowElevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowElevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowElevation::class, init)

	@DefinedBy(CoreThemeStyleable.windowEnableSplitTouch::class)
	open var windowEnableSplitTouch: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowEnableSplitTouch(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowEnableSplitTouch::class, init)

	@DefinedBy(CoreThemeStyleable.windowEnterTransition::class)
	open var windowEnterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowEnterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowEnterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowExitTransition::class)
	open var windowExitTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowExitTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowExitTransition::class, init)

	@DefinedBy(CoreWindowStyleable.windowFixedHeightMajor::class)
	open var windowFixedHeightMajor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowFixedHeightMajor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowFixedHeightMajor::class, init)

	@DefinedBy(CoreWindowStyleable.windowFixedHeightMinor::class)
	open var windowFixedHeightMinor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowFixedHeightMinor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowFixedHeightMinor::class, init)

	@DefinedBy(CoreWindowStyleable.windowFixedWidthMajor::class)
	open var windowFixedWidthMajor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowFixedWidthMajor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowFixedWidthMajor::class, init)

	@DefinedBy(CoreWindowStyleable.windowFixedWidthMinor::class)
	open var windowFixedWidthMinor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowFixedWidthMinor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowFixedWidthMinor::class, init)

	@DefinedBy(CoreThemeStyleable.windowFrame::class)
	open var windowFrame: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowFrame(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowFrame::class, init)

	@DefinedBy(CoreThemeStyleable.windowFullscreen::class)
	open var windowFullscreen: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowFullscreen(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowFullscreen::class, init)

	@DefinedBy(CoreThemeStyleable.windowIsFloating::class)
	open var windowIsFloating: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowIsFloating(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowIsFloating::class, init)

	@DefinedBy(CoreThemeStyleable.windowIsTranslucent::class)
	open var windowIsTranslucent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowIsTranslucent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowIsTranslucent::class, init)

	@DefinedBy(CoreWindowStyleable.windowLightNavigationBar::class)
	open var windowLightNavigationBar: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowLightNavigationBar(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowLightNavigationBar::class, init)

	@DefinedBy(CoreWindowStyleable.windowLightStatusBar::class)
	open var windowLightStatusBar: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowLightStatusBar(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowLightStatusBar::class, init)

	@DefinedBy(CoreWindowStyleable.windowMinWidthMajor::class)
	open var windowMinWidthMajor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowMinWidthMajor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowMinWidthMajor::class, init)

	@DefinedBy(CoreWindowStyleable.windowMinWidthMinor::class)
	open var windowMinWidthMinor: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowMinWidthMinor(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowMinWidthMinor::class, init)

	@DefinedBy(CoreThemeStyleable.windowNoDisplay::class)
	open var windowNoDisplay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowNoDisplay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowNoDisplay::class, init)

	@DefinedBy(CoreThemeStyleable.windowNoTitle::class)
	open var windowNoTitle: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowNoTitle(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowNoTitle::class, init)

	@DefinedBy(CoreWindowStyleable.windowOutsetBottom::class)
	open var windowOutsetBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun windowOutsetBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowOutsetBottom::class, init)

	@DefinedBy(CoreThemeStyleable.windowOverscan::class)
	open var windowOverscan: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowOverscan(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowOverscan::class, init)

	@DefinedBy(CoreThemeStyleable.windowReenterTransition::class)
	open var windowReenterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowReenterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowReenterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowReturnTransition::class)
	open var windowReturnTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowReturnTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowReturnTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementEnterTransition::class)
	open var windowSharedElementEnterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowSharedElementEnterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementEnterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementExitTransition::class)
	open var windowSharedElementExitTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowSharedElementExitTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementExitTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementReenterTransition::class)
	open var windowSharedElementReenterTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowSharedElementReenterTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementReenterTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementReturnTransition::class)
	open var windowSharedElementReturnTransition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowSharedElementReturnTransition(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementReturnTransition::class, init)

	@DefinedBy(CoreThemeStyleable.windowSharedElementsUseOverlay::class)
	open var windowSharedElementsUseOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowSharedElementsUseOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSharedElementsUseOverlay::class, init)

	@DefinedBy(CoreThemeStyleable.windowShowWallpaper::class)
	open var windowShowWallpaper: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowShowWallpaper(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowShowWallpaper::class, init)

	@DefinedBy(CoreThemeStyleable.windowSoftInputMode::class)
	open var windowSoftInputMode: Any? by GenericFlagDelegate<CoreThemeStyleable.WindowSoftInputModeFlag>(CoreThemeStyleable.WindowSoftInputModeFlag::class)

	@DefinedBy(CoreWindowStyleable.windowSplashscreenContent::class)
	open var windowSplashscreenContent: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowSplashscreenContent(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.windowSplashscreenContent::class, init)

	@DefinedBy(CoreThemeStyleable.windowSwipeToDismiss::class)
	open var windowSwipeToDismiss: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowSwipeToDismiss(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowSwipeToDismiss::class, init)

	@DefinedBy(CoreThemeStyleable.windowTransitionBackgroundFadeDuration::class)
	open var windowTransitionBackgroundFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun windowTransitionBackgroundFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTransitionBackgroundFadeDuration::class, init)

	@DefinedBy(CoreThemeStyleable.windowTranslucentNavigation::class)
	open var windowTranslucentNavigation: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowTranslucentNavigation(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTranslucentNavigation::class, init)

	@DefinedBy(CoreThemeStyleable.windowTranslucentStatus::class)
	open var windowTranslucentStatus: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun windowTranslucentStatus(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.windowTranslucentStatus::class, init)

}

open class CoreWindowAnimationStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreWindowAnimationStyleable.activityCloseEnterAnimation::class)
	open var activityCloseEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activityCloseEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.activityCloseEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.activityCloseExitAnimation::class)
	open var activityCloseExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activityCloseExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.activityCloseExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.activityOpenEnterAnimation::class)
	open var activityOpenEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activityOpenEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.activityOpenEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.activityOpenExitAnimation::class)
	open var activityOpenExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activityOpenExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.activityOpenExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.activityOpenRemoteViewsEnterAnimation::class)
	open var activityOpenRemoteViewsEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun activityOpenRemoteViewsEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.activityOpenRemoteViewsEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.launchTaskBehindSourceAnimation::class)
	open var launchTaskBehindSourceAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun launchTaskBehindSourceAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.launchTaskBehindSourceAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.launchTaskBehindTargetAnimation::class)
	open var launchTaskBehindTargetAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun launchTaskBehindTargetAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.launchTaskBehindTargetAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskCloseEnterAnimation::class)
	open var taskCloseEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskCloseEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskCloseEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskCloseExitAnimation::class)
	open var taskCloseExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskCloseExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskCloseExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskOpenEnterAnimation::class)
	open var taskOpenEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskOpenEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskOpenEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskOpenExitAnimation::class)
	open var taskOpenExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskOpenExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskOpenExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskToBackEnterAnimation::class)
	open var taskToBackEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskToBackEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskToBackEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskToBackExitAnimation::class)
	open var taskToBackExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskToBackExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskToBackExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskToFrontEnterAnimation::class)
	open var taskToFrontEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskToFrontEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskToFrontEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.taskToFrontExitAnimation::class)
	open var taskToFrontExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun taskToFrontExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.taskToFrontExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperCloseEnterAnimation::class)
	open var wallpaperCloseEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperCloseEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperCloseEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperCloseExitAnimation::class)
	open var wallpaperCloseExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperCloseExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperCloseExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperIntraCloseEnterAnimation::class)
	open var wallpaperIntraCloseEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperIntraCloseEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperIntraCloseEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperIntraCloseExitAnimation::class)
	open var wallpaperIntraCloseExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperIntraCloseExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperIntraCloseExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperIntraOpenEnterAnimation::class)
	open var wallpaperIntraOpenEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperIntraOpenEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperIntraOpenEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperIntraOpenExitAnimation::class)
	open var wallpaperIntraOpenExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperIntraOpenExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperIntraOpenExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperOpenEnterAnimation::class)
	open var wallpaperOpenEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperOpenEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperOpenEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.wallpaperOpenExitAnimation::class)
	open var wallpaperOpenExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun wallpaperOpenExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.wallpaperOpenExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.windowEnterAnimation::class)
	open var windowEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.windowEnterAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.windowExitAnimation::class)
	open var windowExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.windowExitAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.windowHideAnimation::class)
	open var windowHideAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowHideAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.windowHideAnimation::class, init)

	@DefinedBy(CoreWindowAnimationStyleable.windowShowAnimation::class)
	open var windowShowAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun windowShowAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowAnimationStyleable.windowShowAnimation::class, init)

}

open class CoreRingtonePreferenceStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRingtonePreferenceStyleable.ringtoneType::class)
	open var ringtoneType: Any? by GenericFlagDelegate<CoreRingtonePreferenceStyleable.RingtoneTypeFlag>(CoreRingtonePreferenceStyleable.RingtoneTypeFlag::class)

	@DefinedBy(CoreRingtonePreferenceStyleable.showDefault::class)
	open var showDefault: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showDefault(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRingtonePreferenceStyleable.showDefault::class, init)

	@DefinedBy(CoreRingtonePreferenceStyleable.showSilent::class)
	open var showSilent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showSilent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRingtonePreferenceStyleable.showSilent::class, init)

}

open class CoreExpandableListViewStyle2 : CoreListViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreExpandableListViewStyleable.childDivider::class)
	open var childDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun childDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childDivider::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.childIndicator::class)
	open var childIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun childIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childIndicator::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.childIndicatorEnd::class)
	open var childIndicatorEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun childIndicatorEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childIndicatorEnd::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.childIndicatorLeft::class)
	open var childIndicatorLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun childIndicatorLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childIndicatorLeft::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.childIndicatorRight::class)
	open var childIndicatorRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun childIndicatorRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childIndicatorRight::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.childIndicatorStart::class)
	open var childIndicatorStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun childIndicatorStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.childIndicatorStart::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.groupIndicator::class)
	open var groupIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun groupIndicator(init: StringAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.groupIndicator::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.indicatorEnd::class)
	open var indicatorEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun indicatorEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.indicatorEnd::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.indicatorLeft::class)
	open var indicatorLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun indicatorLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.indicatorLeft::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.indicatorRight::class)
	open var indicatorRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun indicatorRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.indicatorRight::class, init)

	@DefinedBy(CoreExpandableListViewStyleable.indicatorStart::class)
	open var indicatorStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun indicatorStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreExpandableListViewStyleable.indicatorStart::class, init)

}

open class CoreCheckedTextViewStyle2 : CoreTextViewStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCheckedTextViewStyleable.checkMark::class)
	open var checkMark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun checkMark(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckedTextViewStyleable.checkMark::class, init)

	@DefinedBy(CoreCheckedTextViewStyleable.checkMarkGravity::class)
	open var checkMarkGravity: Any? by GenericFlagDelegate<CoreCheckedTextViewStyleable.CheckMarkGravityFlag>(CoreCheckedTextViewStyleable.CheckMarkGravityFlag::class)

	@DefinedBy(CoreCheckedTextViewStyleable.checkMarkTint::class)
	open var checkMarkTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun checkMarkTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckedTextViewStyleable.checkMarkTint::class, init)

	@DefinedBy(CoreCheckedTextViewStyleable.checkMarkTintMode::class)
	open var checkMarkTintMode: Any? by GenericEnumDelegate<CoreCheckedTextViewStyleable.CheckMarkTintModeEnum>(CoreCheckedTextViewStyleable.CheckMarkTintModeEnum::class)

	@DefinedBy(CoreCompoundButtonStyleable.checked::class)
	open var checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCompoundButtonStyleable.checked::class, init)

}

open class CoreSwitchStyle2 : CoreCompoundButtonStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSwitchStyleable.showText::class)
	open var showText: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showText(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.showText::class, init)

	@DefinedBy(CoreSeekBarStyleable.splitTrack::class)
	open var splitTrack: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun splitTrack(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.splitTrack::class, init)

	@DefinedBy(CoreSwitchStyleable.switchMinWidth::class)
	open var switchMinWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun switchMinWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.switchMinWidth::class, init)

	@DefinedBy(CoreSwitchStyleable.switchPadding::class)
	open var switchPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun switchPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.switchPadding::class, init)

	@DefinedBy(CoreSwitchStyleable.switchTextAppearance::class)
	open var switchTextAppearance: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun switchTextAppearance(init: StringAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.switchTextAppearance::class, init)

	@DefinedBy(CoreToggleButtonStyleable.textOff::class)
	open var textOff: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textOff(init: StringAttribute.() -> Unit)
		= initAttr(CoreToggleButtonStyleable.textOff::class, init)

	@DefinedBy(CoreToggleButtonStyleable.textOn::class)
	open var textOn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textOn(init: StringAttribute.() -> Unit)
		= initAttr(CoreToggleButtonStyleable.textOn::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumb::class)
	open var thumb: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumb(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.thumb::class, init)

	@DefinedBy(CoreSwitchStyleable.thumbTextPadding::class)
	open var thumbTextPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thumbTextPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.thumbTextPadding::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumbTint::class)
	open var thumbTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumbTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSeekBarStyleable.thumbTint::class, init)

	@DefinedBy(CoreSeekBarStyleable.thumbTintMode::class)
	open var thumbTintMode: Any? by GenericEnumDelegate<CoreSeekBarStyleable.ThumbTintModeEnum>(CoreSeekBarStyleable.ThumbTintModeEnum::class)

	@DefinedBy(CoreSwitchStyleable.track::class)
	open var track: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun track(init: StringAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.track::class, init)

	@DefinedBy(CoreSwitchStyleable.trackTint::class)
	open var trackTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun trackTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreSwitchStyleable.trackTint::class, init)

	@DefinedBy(CoreSwitchStyleable.trackTintMode::class)
	open var trackTintMode: Any? by GenericEnumDelegate<CoreSwitchStyleable.TrackTintModeEnum>(CoreSwitchStyleable.TrackTintModeEnum::class)

}

open class CoreCompoundButtonStyle2 : CoreButtonStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCompoundButtonStyleable.button::class)
	open var button: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun button(init: StringAttribute.() -> Unit)
		= initAttr(CoreCompoundButtonStyleable.button::class, init)

	@DefinedBy(CoreCompoundButtonStyleable.buttonTint::class)
	open var buttonTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun buttonTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreCompoundButtonStyleable.buttonTint::class, init)

	@DefinedBy(CoreCompoundButtonStyleable.buttonTintMode::class)
	open var buttonTintMode: Any? by GenericEnumDelegate<CoreCompoundButtonStyleable.ButtonTintModeEnum>(CoreCompoundButtonStyleable.ButtonTintModeEnum::class)

	@DefinedBy(CoreCompoundButtonStyleable.checked::class)
	open var checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCompoundButtonStyleable.checked::class, init)

}

open class CoreCalendarViewStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCalendarViewStyleable.calendarViewMode::class)
	open var calendarViewMode: Any? by GenericEnumDelegate<CoreCalendarViewStyleable.CalendarViewModeEnum>(CoreCalendarViewStyleable.CalendarViewModeEnum::class)

	@DefinedBy(CoreCalendarViewStyleable.dateTextAppearance::class)
	open var dateTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun dateTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "dateTextAppearance", init)

	@DefinedBy(CoreCalendarViewStyleable.dayHighlightColor::class)
	open var dayHighlightColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun dayHighlightColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.dayHighlightColor::class, init)

	@DefinedBy(CoreCalendarViewStyleable.daySelectorColor::class)
	open var daySelectorColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun daySelectorColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.daySelectorColor::class, init)

	@DefinedBy(CoreCalendarViewStyleable.firstDayOfWeek::class)
	open var firstDayOfWeek: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun firstDayOfWeek(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.firstDayOfWeek::class, init)

	@DefinedBy(CoreCalendarViewStyleable.focusedMonthDateColor::class)
	open var focusedMonthDateColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun focusedMonthDateColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.focusedMonthDateColor::class, init)

	@DefinedBy(CoreDatePickerStyleable.maxDate::class)
	open var maxDate: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun maxDate(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.maxDate::class, init)

	@DefinedBy(CoreDatePickerStyleable.minDate::class)
	open var minDate: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun minDate(init: StringAttribute.() -> Unit)
		= initAttr(CoreDatePickerStyleable.minDate::class, init)

	@DefinedBy(CoreCalendarViewStyleable.monthTextAppearance::class)
	open var monthTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun monthTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "monthTextAppearance", init)

	@DefinedBy(CoreCalendarViewStyleable.selectedDateVerticalBar::class)
	open var selectedDateVerticalBar: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun selectedDateVerticalBar(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.selectedDateVerticalBar::class, init)

	@DefinedBy(CoreCalendarViewStyleable.selectedWeekBackgroundColor::class)
	open var selectedWeekBackgroundColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun selectedWeekBackgroundColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.selectedWeekBackgroundColor::class, init)

	@DefinedBy(CoreCalendarViewStyleable.showWeekNumber::class)
	open var showWeekNumber: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showWeekNumber(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.showWeekNumber::class, init)

	@DefinedBy(CoreCalendarViewStyleable.shownWeekCount::class)
	open var shownWeekCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun shownWeekCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.shownWeekCount::class, init)

	@DefinedBy(CoreCalendarViewStyleable.unfocusedMonthDateColor::class)
	open var unfocusedMonthDateColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun unfocusedMonthDateColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.unfocusedMonthDateColor::class, init)

	@DefinedBy(CoreCalendarViewStyleable.weekDayTextAppearance::class)
	open var weekDayTextAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun weekDayTextAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "weekDayTextAppearance", init)

	@DefinedBy(CoreCalendarViewStyleable.weekNumberColor::class)
	open var weekNumberColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun weekNumberColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.weekNumberColor::class, init)

	@DefinedBy(CoreCalendarViewStyleable.weekSeparatorLineColor::class)
	open var weekSeparatorLineColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun weekSeparatorLineColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreCalendarViewStyleable.weekSeparatorLineColor::class, init)

}

open class CoreListPopupWindowStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreListPopupWindowStyleable.dropDownHorizontalOffset::class)
	open var dropDownHorizontalOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dropDownHorizontalOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreListPopupWindowStyleable.dropDownHorizontalOffset::class, init)

	@DefinedBy(CoreListPopupWindowStyleable.dropDownVerticalOffset::class)
	open var dropDownVerticalOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dropDownVerticalOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreListPopupWindowStyleable.dropDownVerticalOffset::class, init)

}

open class CoreAlertDialogStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAlertDialogStyleable.bottomBright::class)
	open var bottomBright: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun bottomBright(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.bottomBright::class, init)

	@DefinedBy(CoreAlertDialogStyleable.bottomDark::class)
	open var bottomDark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun bottomDark(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.bottomDark::class, init)

	@DefinedBy(CoreAlertDialogStyleable.bottomMedium::class)
	open var bottomMedium: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun bottomMedium(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.bottomMedium::class, init)

	@DefinedBy(CoreAlertDialogStyleable.buttonPanelSideLayout::class)
	open var buttonPanelSideLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun buttonPanelSideLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.buttonPanelSideLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.centerBright::class)
	open var centerBright: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun centerBright(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.centerBright::class, init)

	@DefinedBy(CoreAlertDialogStyleable.centerDark::class)
	open var centerDark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun centerDark(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.centerDark::class, init)

	@DefinedBy(CoreAlertDialogStyleable.centerMedium::class)
	open var centerMedium: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun centerMedium(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.centerMedium::class, init)

	@DefinedBy(CoreAlertDialogStyleable.controllerType::class)
	open var controllerType: Any? by GenericEnumDelegate<CoreAlertDialogStyleable.ControllerTypeEnum>(CoreAlertDialogStyleable.ControllerTypeEnum::class)

	@DefinedBy(CoreAlertDialogStyleable.fullBright::class)
	open var fullBright: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fullBright(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.fullBright::class, init)

	@DefinedBy(CoreAlertDialogStyleable.fullDark::class)
	open var fullDark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fullDark(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.fullDark::class, init)

	@DefinedBy(CoreAlertDialogStyleable.horizontalProgressLayout::class)
	open var horizontalProgressLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun horizontalProgressLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.horizontalProgressLayout::class, init)

	@DefinedBy(CoreViewStubStyleable.layout::class)
	open var layout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStubStyleable.layout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.listItemLayout::class)
	open var listItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.listItemLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.listLayout::class)
	open var listLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun listLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.listLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.multiChoiceItemLayout::class)
	open var multiChoiceItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun multiChoiceItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.multiChoiceItemLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.needsDefaultBackgrounds::class)
	open var needsDefaultBackgrounds: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun needsDefaultBackgrounds(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.needsDefaultBackgrounds::class, init)

	@DefinedBy(CoreAlertDialogStyleable.progressLayout::class)
	open var progressLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun progressLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.progressLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.selectionScrollOffset::class)
	open var selectionScrollOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun selectionScrollOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.selectionScrollOffset::class, init)

	@DefinedBy(CoreAlertDialogStyleable.showTitle::class)
	open var showTitle: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showTitle(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.showTitle::class, init)

	@DefinedBy(CoreAlertDialogStyleable.singleChoiceItemLayout::class)
	open var singleChoiceItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun singleChoiceItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.singleChoiceItemLayout::class, init)

	@DefinedBy(CoreAlertDialogStyleable.topBright::class)
	open var topBright: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun topBright(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.topBright::class, init)

	@DefinedBy(CoreAlertDialogStyleable.topDark::class)
	open var topDark: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun topDark(init: StringAttribute.() -> Unit)
		= initAttr(CoreAlertDialogStyleable.topDark::class, init)

}

open class CoreToggleButtonStyle2 : CoreCompoundButtonStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.disabledAlpha::class)
	open var disabledAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun disabledAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.disabledAlpha::class, init)

	@DefinedBy(CoreToggleButtonStyleable.textOff::class)
	open var textOff: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textOff(init: StringAttribute.() -> Unit)
		= initAttr(CoreToggleButtonStyleable.textOff::class, init)

	@DefinedBy(CoreToggleButtonStyleable.textOn::class)
	open var textOn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textOn(init: StringAttribute.() -> Unit)
		= initAttr(CoreToggleButtonStyleable.textOn::class, init)

}

open class CoreGalleryStyle2 : CoreAbsSpinnerStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGalleryStyleable.animationDuration::class)
	open var animationDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun animationDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGalleryStyleable.animationDuration::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreGalleryStyleable.spacing::class)
	open var spacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun spacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGalleryStyleable.spacing::class, init)

	@DefinedBy(CoreGalleryStyleable.unselectedAlpha::class)
	open var unselectedAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun unselectedAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGalleryStyleable.unselectedAlpha::class, init)

}

open class CoreSwitchPreferenceStyle2 : CorePreferenceStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.disableDependentsState::class)
	open var disableDependentsState: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun disableDependentsState(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.disableDependentsState::class, init)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.summaryOff::class)
	open var summaryOff: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summaryOff(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.summaryOff::class, init)

	@DefinedBy(CoreCheckBoxPreferenceStyleable.summaryOn::class)
	open var summaryOn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summaryOn(init: StringAttribute.() -> Unit)
		= initAttr(CoreCheckBoxPreferenceStyleable.summaryOn::class, init)

	@DefinedBy(CoreSwitchPreferenceStyleable.switchTextOff::class)
	open var switchTextOff: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun switchTextOff(init: StringAttribute.() -> Unit)
		= initAttr(CoreSwitchPreferenceStyleable.switchTextOff::class, init)

	@DefinedBy(CoreSwitchPreferenceStyleable.switchTextOn::class)
	open var switchTextOn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun switchTextOn(init: StringAttribute.() -> Unit)
		= initAttr(CoreSwitchPreferenceStyleable.switchTextOn::class, init)

}

open class CoreFragmentAnimationStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentCloseEnterAnimation::class)
	open var fragmentCloseEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentCloseEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentCloseEnterAnimation::class, init)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentCloseExitAnimation::class)
	open var fragmentCloseExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentCloseExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentCloseExitAnimation::class, init)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentFadeEnterAnimation::class)
	open var fragmentFadeEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentFadeEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentFadeEnterAnimation::class, init)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentFadeExitAnimation::class)
	open var fragmentFadeExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentFadeExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentFadeExitAnimation::class, init)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentOpenEnterAnimation::class)
	open var fragmentOpenEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentOpenEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentOpenEnterAnimation::class, init)

	@DefinedBy(CoreFragmentAnimationStyleable.fragmentOpenExitAnimation::class)
	open var fragmentOpenExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragmentOpenExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreFragmentAnimationStyleable.fragmentOpenExitAnimation::class, init)

}

open class CoreButtonBarLayoutStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreButtonBarLayoutStyleable.allowStacking::class)
	open var allowStacking: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowStacking(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreButtonBarLayoutStyleable.allowStacking::class, init)

}

open class CoreViewTagStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var value: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun value(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

}

open class CoreIncludeStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreViewStyleable.visibility::class)
	open var visibility: Any? by GenericEnumDelegate<CoreViewStyleable.VisibilityEnum>(CoreViewStyleable.VisibilityEnum::class)

}

open class CoreActionMenuItemViewStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

}

open class CoreImageSwitcherStyle2 : CoreViewSwitcherStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreViewSwitcherStyle2 : CoreViewAnimatorStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

}

open class CoreViewAnimatorStyle2 : CoreFrameLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewAnimatorStyleable.animateFirstView::class)
	open var animateFirstView: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateFirstView(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.animateFirstView::class, init)

	@DefinedBy(CoreViewAnimatorStyleable.inAnimation::class)
	open var inAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun inAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.inAnimation::class, init)

	@DefinedBy(CoreViewAnimatorStyleable.outAnimation::class)
	open var outAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun outAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.outAnimation::class, init)

}

open class CoreTextClockStyle2 : CoreTextViewStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextClockStyleable.format12Hour::class)
	open var format12Hour: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun format12Hour(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.format12Hour::class, init)

	@DefinedBy(CoreTextClockStyleable.format24Hour::class)
	open var format24Hour: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun format24Hour(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.format24Hour::class, init)

	@DefinedBy(CoreTextClockStyleable.timeZone::class)
	open var timeZone: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun timeZone(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.timeZone::class, init)

}

open class CoreGridLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.alignmentMode::class)
	open var alignmentMode: Any? by GenericEnumDelegate<AlignmentMode>(AlignmentMode::class)

	@DefinedBy(CoreGridLayoutStyleable.columnCount::class)
	open var columnCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun columnCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.columnCount::class, init)

	@DefinedBy(CoreGridLayoutStyleable.columnOrderPreserved::class)
	open var columnOrderPreserved: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun columnOrderPreserved(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.columnOrderPreserved::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreGridLayoutStyleable.rowCount::class)
	open var rowCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun rowCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.rowCount::class, init)

	@DefinedBy(CoreGridLayoutStyleable.rowOrderPreserved::class)
	open var rowOrderPreserved: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun rowOrderPreserved(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.rowOrderPreserved::class, init)

	@DefinedBy(CoreGridLayoutStyleable.useDefaultMargins::class)
	open var useDefaultMargins: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useDefaultMargins(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.useDefaultMargins::class, init)

}

open class CoreGridLayout_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTableRow_CellStyleable.layout_column::class)
	open var layout_column: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_column(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTableRow_CellStyleable.layout_column::class, init)

	@DefinedBy(CoreGridLayout_LayoutStyleable.layout_columnSpan::class)
	open var layout_columnSpan: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_columnSpan(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayout_LayoutStyleable.layout_columnSpan::class, init)

	@DefinedBy(CoreGridLayout_LayoutStyleable.layout_columnWeight::class)
	open var layout_columnWeight: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun layout_columnWeight(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGridLayout_LayoutStyleable.layout_columnWeight::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreGridLayout_LayoutStyleable.layout_row::class)
	open var layout_row: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_row(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayout_LayoutStyleable.layout_row::class, init)

	@DefinedBy(CoreGridLayout_LayoutStyleable.layout_rowSpan::class)
	open var layout_rowSpan: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_rowSpan(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayout_LayoutStyleable.layout_rowSpan::class, init)

	@DefinedBy(CoreGridLayout_LayoutStyleable.layout_rowWeight::class)
	open var layout_rowWeight: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun layout_rowWeight(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGridLayout_LayoutStyleable.layout_rowWeight::class, init)

}

open class CoreViewFlipperStyle2 : CoreViewAnimatorStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewFlipperStyleable.autoStart::class)
	open var autoStart: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoStart(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.autoStart::class, init)

	@DefinedBy(CoreViewFlipperStyleable.flipInterval::class)
	open var flipInterval: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun flipInterval(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.flipInterval::class, init)

}

open class CoreAdapterViewFlipperStyle2 : CoreAdapterViewAnimatorStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewFlipperStyleable.autoStart::class)
	open var autoStart: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoStart(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.autoStart::class, init)

	@DefinedBy(CoreViewFlipperStyleable.flipInterval::class)
	open var flipInterval: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun flipInterval(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.flipInterval::class, init)

}

open class CoreRadioGroupStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRadioGroupStyleable.checkedButton::class)
	open var checkedButton: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun checkedButton(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRadioGroupStyleable.checkedButton::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open override var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

}

open class CoreTableLayoutStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTableLayoutStyleable.collapseColumns::class)
	open var collapseColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.collapseColumns::class, init)

	@DefinedBy(CoreTableLayoutStyleable.shrinkColumns::class)
	open var shrinkColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shrinkColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.shrinkColumns::class, init)

	@DefinedBy(CoreTableLayoutStyleable.stretchColumns::class)
	open var stretchColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun stretchColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.stretchColumns::class, init)

}

open class CoreTableRowStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreTableRow_CellStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTableRow_CellStyleable.layout_column::class)
	open var layout_column: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_column(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTableRow_CellStyleable.layout_column::class, init)

	@DefinedBy(CoreTableRow_CellStyleable.layout_span::class)
	open var layout_span: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun layout_span(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTableRow_CellStyleable.layout_span::class, init)

}

open class CoreTextSwitcherStyle2 : CoreViewSwitcherStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreTwoLineListItemStyle2 : CoreRelativeLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTwoLineListItemStyleable.mode::class)
	open var mode: Any? by GenericEnumDelegate<CoreTwoLineListItemStyleable.ModeEnum>(CoreTwoLineListItemStyleable.ModeEnum::class)

}

open class CoreRelativeLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreRelativeLayoutStyleable.ignoreGravity::class)
	open var ignoreGravity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun ignoreGravity(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayoutStyleable.ignoreGravity::class, init)

}

open class CoreRelativeLayout_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_above::class)
	open var layout_above: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_above(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_above::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignBaseline::class)
	open var layout_alignBaseline: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignBaseline(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignBaseline::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignBottom::class)
	open var layout_alignBottom: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignBottom(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignBottom::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignEnd::class)
	open var layout_alignEnd: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignEnd(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignEnd::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignLeft::class)
	open var layout_alignLeft: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignLeft(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignLeft::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentBottom::class)
	open var layout_alignParentBottom: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentBottom(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentBottom::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentEnd::class)
	open var layout_alignParentEnd: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentEnd(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentEnd::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentLeft::class)
	open var layout_alignParentLeft: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentLeft(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentLeft::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentRight::class)
	open var layout_alignParentRight: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentRight(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentRight::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentStart::class)
	open var layout_alignParentStart: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentStart(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentStart::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignParentTop::class)
	open var layout_alignParentTop: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignParentTop(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignParentTop::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignRight::class)
	open var layout_alignRight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignRight(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignRight::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignStart::class)
	open var layout_alignStart: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignStart(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignStart::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignTop::class)
	open var layout_alignTop: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_alignTop(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignTop::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_alignWithParentIfMissing::class)
	open var layout_alignWithParentIfMissing: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alignWithParentIfMissing(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_alignWithParentIfMissing::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_below::class)
	open var layout_below: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_below(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_below::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_centerHorizontal::class)
	open var layout_centerHorizontal: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_centerHorizontal(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_centerHorizontal::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_centerInParent::class)
	open var layout_centerInParent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_centerInParent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_centerInParent::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_centerVertical::class)
	open var layout_centerVertical: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_centerVertical(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_centerVertical::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_toEndOf::class)
	open var layout_toEndOf: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_toEndOf(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_toEndOf::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_toLeftOf::class)
	open var layout_toLeftOf: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_toLeftOf(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_toLeftOf::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_toRightOf::class)
	open var layout_toRightOf: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_toRightOf(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_toRightOf::class, init)

	@DefinedBy(CoreRelativeLayout_LayoutStyleable.layout_toStartOf::class)
	open var layout_toStartOf: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layout_toStartOf(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayout_LayoutStyleable.layout_toStartOf::class, init)

}

open class CoreSlidingDrawerStyle2 : CoreViewGroupStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSlidingDrawerStyleable.allowSingleTap::class)
	open var allowSingleTap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowSingleTap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.allowSingleTap::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.animateOnClick::class)
	open var animateOnClick: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateOnClick(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.animateOnClick::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.bottomOffset::class)
	open var bottomOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottomOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.bottomOffset::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.content::class)
	open var content: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun content(init: StringAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.content::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.handle::class)
	open var handle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun handle(init: StringAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.handle::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreSlidingDrawerStyleable.topOffset::class)
	open var topOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun topOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.topOffset::class, init)

}

open class CorePreferenceFrameLayout_LayoutStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceFrameLayout_LayoutStyleable.layout_removeBorders::class)
	open var layout_removeBorders: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_removeBorders(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceFrameLayout_LayoutStyleable.layout_removeBorders::class, init)

}

open class CorePreferenceHeaderStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceHeaderStyleable.breadCrumbShortTitle::class)
	open var breadCrumbShortTitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun breadCrumbShortTitle(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.breadCrumbShortTitle::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.breadCrumbTitle::class)
	open var breadCrumbTitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun breadCrumbTitle(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.breadCrumbTitle::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.fragment::class)
	open var fragment: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fragment(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.fragment::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.summary::class)
	open var summary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summary(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.summary::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

}

open class CoreMultiSelectListPreferenceStyle2 : CoreDialogPreferenceStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.entries::class)
	open var entries: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entries(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.entries::class, init)

	@DefinedBy(CoreListPreferenceStyleable.entryValues::class)
	open var entryValues: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entryValues(init: StringAttribute.() -> Unit)
		= initAttr(CoreListPreferenceStyleable.entryValues::class, init)

}

open class CoreVolumePreferenceStyle2 : CoreDialogPreferenceStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVolumePreferenceStyleable.streamType::class)
	open var streamType: Any? by GenericEnumDelegate<CoreVolumePreferenceStyleable.StreamTypeEnum>(CoreVolumePreferenceStyleable.StreamTypeEnum::class)

}

open class CoreIconMenuViewStyle2 : CoreMenuViewStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreIconMenuViewStyleable.maxItems::class)
	open var maxItems: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxItems(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreIconMenuViewStyleable.maxItems::class, init)

	@DefinedBy(CoreIconMenuViewStyleable.maxItemsPerRow::class)
	open var maxItemsPerRow: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxItemsPerRow(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreIconMenuViewStyleable.maxItemsPerRow::class, init)

	@DefinedBy(CoreIconMenuViewStyleable.maxRows::class)
	open var maxRows: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxRows(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreIconMenuViewStyleable.maxRows::class, init)

	@DefinedBy(CoreIconMenuViewStyleable.moreIcon::class)
	open var moreIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun moreIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreIconMenuViewStyleable.moreIcon::class, init)

	@DefinedBy(CoreIconMenuViewStyleable.rowHeight::class)
	open var rowHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun rowHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreIconMenuViewStyleable.rowHeight::class, init)

}

open class CoreMenuViewStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreMenuViewStyleable.headerBackground::class)
	open var headerBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun headerBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.headerBackground::class, init)

	@DefinedBy(CoreMenuViewStyleable.horizontalDivider::class)
	open var horizontalDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun horizontalDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.horizontalDivider::class, init)

	@DefinedBy(CoreMenuViewStyleable.itemBackground::class)
	open var itemBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun itemBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.itemBackground::class, init)

	@DefinedBy(CoreMenuViewStyleable.itemIconDisabledAlpha::class)
	open var itemIconDisabledAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun itemIconDisabledAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.itemIconDisabledAlpha::class, init)

	@DefinedBy(CoreMenuViewStyleable.itemTextAppearance::class)
	open var itemTextAppearance: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun itemTextAppearance(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.itemTextAppearance::class, init)

// SKIPPING preserveIconSpacing

	@DefinedBy(CoreMenuViewStyleable.subMenuArrow::class)
	open var subMenuArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subMenuArrow(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.subMenuArrow::class, init)

	@DefinedBy(CoreMenuViewStyleable.verticalDivider::class)
	open var verticalDivider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun verticalDivider(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuViewStyleable.verticalDivider::class, init)

	@DefinedBy(CoreThemeStyleable.windowAnimationStyle::class)
	open var windowAnimationStyle: CoreWindowAnimationStyle2? by InlineStyleDelegate()
	open fun windowAnimationStyle(init: CoreWindowAnimationStyle2.() -> Unit)
		= initInlineStyle(CoreWindowAnimationStyle2(), "windowAnimationStyle", init)

}

open class CoreAbsoluteLayout_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAbsoluteLayout_LayoutStyleable.layout_x::class)
	open var layout_x: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_x(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreAbsoluteLayout_LayoutStyleable.layout_x::class, init)

	@DefinedBy(CoreAbsoluteLayout_LayoutStyleable.layout_y::class)
	open var layout_y: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun layout_y(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreAbsoluteLayout_LayoutStyleable.layout_y::class, init)

}

open class CoreVerticalSlider_LayoutStyle2 : CoreViewGroup_LayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVerticalSlider_LayoutStyleable.layout_scale::class)
	open var layout_scale: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun layout_scale(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVerticalSlider_LayoutStyleable.layout_scale::class, init)

}

open class CoreWeightedLinearLayoutStyle2 : CoreLinearLayoutStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.majorWeightMax::class)
	open var majorWeightMax: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun majorWeightMax(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.majorWeightMax::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.majorWeightMin::class)
	open var majorWeightMin: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun majorWeightMin(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.majorWeightMin::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.minorWeightMax::class)
	open var minorWeightMax: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minorWeightMax(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.minorWeightMax::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.minorWeightMin::class)
	open var minorWeightMin: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minorWeightMin(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.minorWeightMin::class, init)

}

open class CoreVoiceInteractionSessionStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreKeyboardViewStyle2 : CoreViewStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboardViewStyleable.keyBackground::class)
	open var keyBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyBackground::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyPreviewHeight::class)
	open var keyPreviewHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun keyPreviewHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyPreviewHeight::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyPreviewLayout::class)
	open var keyPreviewLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyPreviewLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyPreviewLayout::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyPreviewOffset::class)
	open var keyPreviewOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun keyPreviewOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyPreviewOffset::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyTextColor::class)
	open var keyTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyTextColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyTextColor::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyTextSize::class)
	open var keyTextSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun keyTextSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyTextSize::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyboardViewStyle::class)
	open var keyboardViewStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyboardViewStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyboardViewStyle::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.labelTextSize::class)
	open var labelTextSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun labelTextSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.labelTextSize::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.popupLayout::class)
	open var popupLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.popupLayout::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowColor::class)
	open var shadowColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shadowColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowColor::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.shadowRadius::class)
	open var shadowRadius: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun shadowRadius(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.shadowRadius::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.verticalCorrection::class)
	open var verticalCorrection: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun verticalCorrection(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.verticalCorrection::class, init)

}

open class CoreKeyboardViewPreviewStateStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboardViewPreviewStateStyleable.state_long_pressable::class)
	open var state_long_pressable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_long_pressable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewPreviewStateStyleable.state_long_pressable::class, init)

}

open class CoreKeyboardStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboardStyleable.horizontalGap::class)
	open var horizontalGap: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun horizontalGap(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardStyleable.horizontalGap::class, init)

	@DefinedBy(CoreKeyboardStyleable.keyHeight::class)
	open var keyHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun keyHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardStyleable.keyHeight::class, init)

	@DefinedBy(CoreKeyboardStyleable.keyWidth::class)
	open var keyWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun keyWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardStyleable.keyWidth::class, init)

	@DefinedBy(CoreKeyboardStyleable.verticalGap::class)
	open var verticalGap: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun verticalGap(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardStyleable.verticalGap::class, init)

}

open class CoreKeyboard_RowStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboard_RowStyleable.keyboardMode::class)
	open var keyboardMode: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyboardMode(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_RowStyleable.keyboardMode::class, init)

	@DefinedBy(CoreKeyboard_RowStyleable.rowEdgeFlags::class)
	open var rowEdgeFlags: Any? by GenericFlagDelegate<CoreKeyboard_RowStyleable.RowEdgeFlagsFlag>(CoreKeyboard_RowStyleable.RowEdgeFlagsFlag::class)

}

open class CoreKeyboard_KeyStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboard_KeyStyleable.codes::class)
	open var codes: Any? by GenericDelegate(Int::class,IntegerContainer::class,String::class,StringContainer::class)
	open fun codes(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.codes::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.iconPreview::class)
	open var iconPreview: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun iconPreview(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.iconPreview::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.isModifier::class)
	open var isModifier: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isModifier(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.isModifier::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.isRepeatable::class)
	open var isRepeatable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isRepeatable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.isRepeatable::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.isSticky::class)
	open var isSticky: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isSticky(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.isSticky::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.keyEdgeFlags::class)
	open var keyEdgeFlags: Any? by GenericFlagDelegate<CoreKeyboard_KeyStyleable.KeyEdgeFlagsFlag>(CoreKeyboard_KeyStyleable.KeyEdgeFlagsFlag::class)

	@DefinedBy(CoreKeyboard_KeyStyleable.keyIcon::class)
	open var keyIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyIcon(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.keyIcon::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.keyLabel::class)
	open var keyLabel: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyLabel(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.keyLabel::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.keyOutputText::class)
	open var keyOutputText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyOutputText(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.keyOutputText::class, init)

	@DefinedBy(CoreKeyboard_RowStyleable.keyboardMode::class)
	open var keyboardMode: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyboardMode(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_RowStyleable.keyboardMode::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.popupCharacters::class)
	open var popupCharacters: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupCharacters(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.popupCharacters::class, init)

	@DefinedBy(CoreKeyboard_KeyStyleable.popupKeyboard::class)
	open var popupKeyboard: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupKeyboard(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboard_KeyStyleable.popupKeyboard::class, init)

}

open class CoreInputMethodStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.isDefault::class)
	open var isDefault: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isDefault(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.isDefault::class, init)

	@DefinedBy(CoreInputMethodStyleable.isVrOnly::class)
	open var isVrOnly: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isVrOnly(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.isVrOnly::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreInputMethodStyleable.supportsSwitchingToNextInputMethod::class)
	open var supportsSwitchingToNextInputMethod: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun supportsSwitchingToNextInputMethod(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.supportsSwitchingToNextInputMethod::class, init)

}

open class CoreInputMethod_SubtypeStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.imeSubtypeExtraValue::class)
	open var imeSubtypeExtraValue: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeSubtypeExtraValue(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.imeSubtypeExtraValue::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.imeSubtypeLocale::class)
	open var imeSubtypeLocale: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeSubtypeLocale(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.imeSubtypeLocale::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.imeSubtypeMode::class)
	open var imeSubtypeMode: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeSubtypeMode(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.imeSubtypeMode::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.isAsciiCapable::class)
	open var isAsciiCapable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isAsciiCapable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.isAsciiCapable::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.isAuxiliary::class)
	open var isAuxiliary: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isAuxiliary(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.isAuxiliary::class, init)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.languageTag::class)
	open var languageTag: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun languageTag(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.languageTag::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.overridesImplicitlyEnabledSubtype::class)
	open var overridesImplicitlyEnabledSubtype: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun overridesImplicitlyEnabledSubtype(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.overridesImplicitlyEnabledSubtype::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.subtypeId::class)
	open var subtypeId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun subtypeId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.subtypeId::class, init)

}

open class CoreSpellCheckerStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreSpellChecker_SubtypeStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.languageTag::class)
	open var languageTag: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun languageTag(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.languageTag::class, init)

	@DefinedBy(CoreInputMethod_SubtypeStyleable.subtypeId::class)
	open var subtypeId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun subtypeId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreInputMethod_SubtypeStyleable.subtypeId::class, init)

	@DefinedBy(CoreSpellChecker_SubtypeStyleable.subtypeLocale::class)
	open var subtypeLocale: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtypeLocale(init: StringAttribute.() -> Unit)
		= initAttr(CoreSpellChecker_SubtypeStyleable.subtypeLocale::class, init)

}

open class CoreAccessibilityServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAccessibilityServiceStyleable.accessibilityEventTypes::class)
	open var accessibilityEventTypes: Any? by GenericFlagDelegate<CoreAccessibilityServiceStyleable.AccessibilityEventTypesFlag>(CoreAccessibilityServiceStyleable.AccessibilityEventTypesFlag::class)

	@DefinedBy(CoreAccessibilityServiceStyleable.accessibilityFeedbackType::class)
	open var accessibilityFeedbackType: Any? by GenericFlagDelegate<CoreAccessibilityServiceStyleable.AccessibilityFeedbackTypeFlag>(CoreAccessibilityServiceStyleable.AccessibilityFeedbackTypeFlag::class)

	@DefinedBy(CoreAccessibilityServiceStyleable.accessibilityFlags::class)
	open var accessibilityFlags: Any? by GenericFlagDelegate<CoreAccessibilityServiceStyleable.AccessibilityFlagsFlag>(CoreAccessibilityServiceStyleable.AccessibilityFlagsFlag::class)

	@DefinedBy(CoreAccessibilityServiceStyleable.canControlMagnification::class)
	open var canControlMagnification: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canControlMagnification(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canControlMagnification::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canPerformGestures::class)
	open var canPerformGestures: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canPerformGestures(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canPerformGestures::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canRequestEnhancedWebAccessibility::class)
	open var canRequestEnhancedWebAccessibility: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRequestEnhancedWebAccessibility(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canRequestEnhancedWebAccessibility::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canRequestFilterKeyEvents::class)
	open var canRequestFilterKeyEvents: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRequestFilterKeyEvents(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canRequestFilterKeyEvents::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canRequestFingerprintGestures::class)
	open var canRequestFingerprintGestures: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRequestFingerprintGestures(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canRequestFingerprintGestures::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canRequestTouchExplorationMode::class)
	open var canRequestTouchExplorationMode: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRequestTouchExplorationMode(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canRequestTouchExplorationMode::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.canRetrieveWindowContent::class)
	open var canRetrieveWindowContent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRetrieveWindowContent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.canRetrieveWindowContent::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.notificationTimeout::class)
	open var notificationTimeout: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun notificationTimeout(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.notificationTimeout::class, init)

	@DefinedBy(CoreAccessibilityServiceStyleable.packageNames::class)
	open var packageNames: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun packageNames(init: StringAttribute.() -> Unit)
		= initAttr(CoreAccessibilityServiceStyleable.packageNames::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.summary::class)
	open var summary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summary(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.summary::class, init)

}

open class CorePrintServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePrintServiceStyleable.addPrintersActivity::class)
	open var addPrintersActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun addPrintersActivity(init: StringAttribute.() -> Unit)
		= initAttr(CorePrintServiceStyleable.addPrintersActivity::class, init)

	@DefinedBy(CorePrintServiceStyleable.advancedPrintOptionsActivity::class)
	open var advancedPrintOptionsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun advancedPrintOptionsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CorePrintServiceStyleable.advancedPrintOptionsActivity::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CorePrintServiceStyleable.vendor::class)
	open var vendor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun vendor(init: StringAttribute.() -> Unit)
		= initAttr(CorePrintServiceStyleable.vendor::class, init)

}

open class CoreHostApduServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreHostApduServiceStyleable.apduServiceBanner::class)
	open var apduServiceBanner: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun apduServiceBanner(init: StringAttribute.() -> Unit)
		= initAttr(CoreHostApduServiceStyleable.apduServiceBanner::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(CoreHostApduServiceStyleable.requireDeviceUnlock::class)
	open var requireDeviceUnlock: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun requireDeviceUnlock(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreHostApduServiceStyleable.requireDeviceUnlock::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreAidGroupStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAidGroupStyleable.category::class)
	open var category: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun category(init: StringAttribute.() -> Unit)
		= initAttr(CoreAidGroupStyleable.category::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

}

open class CoreOffHostApduServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreHostApduServiceStyleable.apduServiceBanner::class)
	open var apduServiceBanner: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun apduServiceBanner(init: StringAttribute.() -> Unit)
		= initAttr(CoreHostApduServiceStyleable.apduServiceBanner::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreHostNfcFServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

}

open class CoreNfcid2FilterStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

}

open class CoreSystemCodeFilterStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

}

open class CoreT3tPmmFilterStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

}

open class CoreInputMethodServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodServiceStyleable.imeExtractEnterAnimation::class)
	open var imeExtractEnterAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeExtractEnterAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodServiceStyleable.imeExtractEnterAnimation::class, init)

	@DefinedBy(CoreInputMethodServiceStyleable.imeExtractExitAnimation::class)
	open var imeExtractExitAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeExtractExitAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodServiceStyleable.imeExtractExitAnimation::class, init)

	@DefinedBy(CoreInputMethodServiceStyleable.imeFullscreenBackground::class)
	open var imeFullscreenBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun imeFullscreenBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodServiceStyleable.imeFullscreenBackground::class, init)

}

open class CoreWallpaperStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreWallpaperStyleable.author::class)
	open var author: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun author(init: StringAttribute.() -> Unit)
		= initAttr(CoreWallpaperStyleable.author::class, init)

	@DefinedBy(CoreWallpaperStyleable.contextDescription::class)
	open var contextDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contextDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreWallpaperStyleable.contextDescription::class, init)

	@DefinedBy(CoreWallpaperStyleable.contextUri::class)
	open var contextUri: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contextUri(init: StringAttribute.() -> Unit)
		= initAttr(CoreWallpaperStyleable.contextUri::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreWallpaperStyleable.showMetadataInPreview::class)
	open var showMetadataInPreview: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showMetadataInPreview(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreWallpaperStyleable.showMetadataInPreview::class, init)

	@DefinedBy(CoreWallpaperStyleable.thumbnail::class)
	open var thumbnail: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun thumbnail(init: StringAttribute.() -> Unit)
		= initAttr(CoreWallpaperStyleable.thumbnail::class, init)

}

open class CoreDreamStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreTrustAgentStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CorePreferenceHeaderStyleable.summary::class)
	open var summary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summary(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceHeaderStyleable.summary::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

	@DefinedBy(CoreTrustAgentStyleable.unlockProfile::class)
	open var unlockProfile: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun unlockProfile(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTrustAgentStyleable.unlockProfile::class, init)

}

open class CoreAutofillServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreSettingInjectorServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

}

open class CoreRecognitionServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreVoiceInteractionServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVoiceInteractionServiceStyleable.recognitionService::class)
	open var recognitionService: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun recognitionService(init: StringAttribute.() -> Unit)
		= initAttr(CoreVoiceInteractionServiceStyleable.recognitionService::class, init)

	@DefinedBy(CoreVoiceInteractionServiceStyleable.sessionService::class)
	open var sessionService: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun sessionService(init: StringAttribute.() -> Unit)
		= initAttr(CoreVoiceInteractionServiceStyleable.sessionService::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreVoiceInteractionServiceStyleable.supportsAssist::class)
	open var supportsAssist: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun supportsAssist(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreVoiceInteractionServiceStyleable.supportsAssist::class, init)

	@DefinedBy(CoreVoiceInteractionServiceStyleable.supportsLaunchVoiceAssistFromKeyguard::class)
	open var supportsLaunchVoiceAssistFromKeyguard: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun supportsLaunchVoiceAssistFromKeyguard(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreVoiceInteractionServiceStyleable.supportsLaunchVoiceAssistFromKeyguard::class, init)

	@DefinedBy(CoreVoiceInteractionServiceStyleable.supportsLocalInteraction::class)
	open var supportsLocalInteraction: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun supportsLocalInteraction(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreVoiceInteractionServiceStyleable.supportsLocalInteraction::class, init)

}

open class CoreTextToSpeechEngineStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

}

open class CoreTvInputServiceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTvInputServiceStyleable.canRecord::class)
	open var canRecord: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun canRecord(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTvInputServiceStyleable.canRecord::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreTvInputServiceStyleable.setupActivity::class)
	open var setupActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun setupActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreTvInputServiceStyleable.setupActivity::class, init)

	@DefinedBy(CoreTvInputServiceStyleable.tunerCount::class)
	open var tunerCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun tunerCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTvInputServiceStyleable.tunerCount::class, init)

}

open class CoreRatingSystemDefinitionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRatingSystemDefinitionStyleable.country::class)
	open var country: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun country(init: StringAttribute.() -> Unit)
		= initAttr(CoreRatingSystemDefinitionStyleable.country::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

}

open class CoreRatingDefinitionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRatingDefinitionStyleable.contentAgeHint::class)
	open var contentAgeHint: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun contentAgeHint(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRatingDefinitionStyleable.contentAgeHint::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

}

open class CoreStateListDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.constantSize::class)
	open var constantSize: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun constantSize(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.constantSize::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.enterFadeDuration::class)
	open var enterFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun enterFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.enterFadeDuration::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.exitFadeDuration::class)
	open var exitFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun exitFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.exitFadeDuration::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.variablePadding::class)
	open var variablePadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun variablePadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.variablePadding::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreDrawableStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreDrawableStatesStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_accelerated::class)
	open var state_accelerated: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_accelerated(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_accelerated::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_accessibility_focused::class)
	open var state_accessibility_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_accessibility_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_accessibility_focused::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_activated::class)
	open var state_activated: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_activated(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_activated::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_active::class)
	open var state_active: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_active(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_active::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_checkable::class)
	open var state_checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checkable::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_checked::class)
	open var state_checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checked::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_drag_can_accept::class)
	open var state_drag_can_accept: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_drag_can_accept(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_drag_can_accept::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_drag_hovered::class)
	open var state_drag_hovered: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_drag_hovered(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_drag_hovered::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_enabled::class)
	open var state_enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_enabled::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_first::class)
	open var state_first: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_first(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_first::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_focused::class)
	open var state_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_focused::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_hovered::class)
	open var state_hovered: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_hovered(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_hovered::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_last::class)
	open var state_last: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_last(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_last::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_middle::class)
	open var state_middle: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_middle(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_middle::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_pressed::class)
	open var state_pressed: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_pressed(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_pressed::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_selected::class)
	open var state_selected: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_selected(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_selected::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_single::class)
	open var state_single: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_single(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_single::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_window_focused::class)
	open var state_window_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_window_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_window_focused::class, init)

}

open class CoreStateListDrawableItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

}

open class CoreStateListAnimatorItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreLayoutAnimationStyleable.animation::class)
	open var animation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun animation(init: StringAttribute.() -> Unit)
		= initAttr(CoreLayoutAnimationStyleable.animation::class, init)

}

open class CoreBitmapDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.antialias::class)
	open var antialias: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun antialias(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreBitmapDrawableStyleable.antialias::class, init)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.filter::class)
	open var filter: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun filter(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreBitmapDrawableStyleable.filter::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreBitmapDrawableStyleable.mipMap::class)
	open var mipMap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun mipMap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreBitmapDrawableStyleable.mipMap::class, init)

	@DefinedBy(CoreImageViewStyleable.src::class)
	open var src: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun src(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.src::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tileMode::class)
	open var tileMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TileModeEnum>(CoreBitmapDrawableStyleable.TileModeEnum::class)

	@DefinedBy(CoreBitmapDrawableStyleable.tileModeX::class)
	open var tileModeX: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TileModeXEnum>(CoreBitmapDrawableStyleable.TileModeXEnum::class)

	@DefinedBy(CoreBitmapDrawableStyleable.tileModeY::class)
	open var tileModeY: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TileModeYEnum>(CoreBitmapDrawableStyleable.TileModeYEnum::class)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tintMode::class)
	open var tintMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TintModeEnum>(CoreBitmapDrawableStyleable.TintModeEnum::class)

}

open class CoreAnimatedStateListDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.constantSize::class)
	open var constantSize: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun constantSize(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.constantSize::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.enterFadeDuration::class)
	open var enterFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun enterFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.enterFadeDuration::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.exitFadeDuration::class)
	open var exitFadeDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun exitFadeDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.exitFadeDuration::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.variablePadding::class)
	open var variablePadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun variablePadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.variablePadding::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreAnimatedStateListDrawableTransitionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreAnimatedStateListDrawableTransitionStyleable.fromId::class)
	open var fromId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fromId(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimatedStateListDrawableTransitionStyleable.fromId::class, init)

	@DefinedBy(CoreAnimatedStateListDrawableTransitionStyleable.reversible::class)
	open var reversible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun reversible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimatedStateListDrawableTransitionStyleable.reversible::class, init)

	@DefinedBy(CoreAnimatedStateListDrawableTransitionStyleable.toId::class)
	open var toId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun toId(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimatedStateListDrawableTransitionStyleable.toId::class, init)

}

open class CoreAnimatedStateListDrawableItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

}

open class CoreAnimationDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableStyleable.oneshot::class)
	open var oneshot: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun oneshot(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableStyleable.oneshot::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.variablePadding::class)
	open var variablePadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun variablePadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.variablePadding::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreAnimationDrawableItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreAnimationDrawableItemStyleable.duration::class)
	open var duration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun duration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.duration::class, init)

}

open class CoreAnimationScaleListDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreAnimationScaleListDrawableItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

}

open class CoreGradientDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.innerRadius::class)
	open var innerRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun innerRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.innerRadius::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.innerRadiusRatio::class)
	open var innerRadiusRatio: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun innerRadiusRatio(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.innerRadiusRatio::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetBottom::class)
	open var opticalInsetBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetBottom::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetLeft::class)
	open var opticalInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetLeft::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetRight::class)
	open var opticalInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetRight::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetTop::class)
	open var opticalInsetTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetTop::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.shape::class)
	open var shape: Any? by GenericEnumDelegate<CoreGradientDrawableStyleable.ShapeEnum>(CoreGradientDrawableStyleable.ShapeEnum::class)

	@DefinedBy(CoreGradientDrawableStyleable.thickness::class)
	open var thickness: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thickness(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.thickness::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.thicknessRatio::class)
	open var thicknessRatio: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun thicknessRatio(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.thicknessRatio::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tintMode::class)
	open var tintMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TintModeEnum>(CoreBitmapDrawableStyleable.TintModeEnum::class)

	@DefinedBy(CoreGradientDrawableGradientStyleable.useLevel::class)
	open var useLevel: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useLevel(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.useLevel::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreGradientDrawableSizeStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreGradientDrawableGradientStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableGradientStyleable.angle::class)
	open var angle: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun angle(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.angle::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerColor::class)
	open var centerColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun centerColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerColor::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerX::class)
	open var centerX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun centerX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerX::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerY::class)
	open var centerY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun centerY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerY::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.endColor::class)
	open var endColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun endColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.endColor::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.gradientRadius::class)
	open var gradientRadius: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun gradientRadius(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.gradientRadius::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.startColor::class)
	open var startColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun startColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.startColor::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.type::class)
	open var type: Any? by GenericEnumDelegate<CoreGradientDrawableGradientStyleable.TypeEnum>(CoreGradientDrawableGradientStyleable.TypeEnum::class)

	@DefinedBy(CoreGradientDrawableGradientStyleable.useLevel::class)
	open var useLevel: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useLevel(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.useLevel::class, init)

}

open class CoreGradientDrawableStrokeStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

	@DefinedBy(CoreGradientDrawableStrokeStyleable.dashGap::class)
	open var dashGap: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dashGap(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStrokeStyleable.dashGap::class, init)

	@DefinedBy(CoreGradientDrawableStrokeStyleable.dashWidth::class)
	open var dashWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dashWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStrokeStyleable.dashWidth::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreDrawableCornersStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableCornersStyleable.bottomLeftRadius::class)
	open var bottomLeftRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottomLeftRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.bottomLeftRadius::class, init)

	@DefinedBy(CoreDrawableCornersStyleable.bottomRightRadius::class)
	open var bottomRightRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottomRightRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.bottomRightRadius::class, init)

	@DefinedBy(CoreDrawableCornersStyleable.radius::class)
	open var radius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun radius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.radius::class, init)

	@DefinedBy(CoreDrawableCornersStyleable.topLeftRadius::class)
	open var topLeftRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun topLeftRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.topLeftRadius::class, init)

	@DefinedBy(CoreDrawableCornersStyleable.topRightRadius::class)
	open var topRightRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun topRightRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.topRightRadius::class, init)

}

open class CoreGradientDrawablePaddingStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.bottom::class)
	open var bottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.bottom::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.left::class)
	open var left: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun left(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.left::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.right::class)
	open var right: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun right(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.right::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.top::class)
	open var top: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun top(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.top::class, init)

}

open class CoreGradientDrawableSolidStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

}

open class CoreLayerDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreLayerDrawableStyleable.opacity::class)
	open var opacity: Any? by GenericEnumDelegate<CoreLayerDrawableStyleable.OpacityEnum>(CoreLayerDrawableStyleable.OpacityEnum::class)

	@DefinedBy(CoreViewStyleable.paddingBottom::class)
	open var paddingBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingBottom::class, init)

	@DefinedBy(CoreViewStyleable.paddingEnd::class)
	open var paddingEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingEnd::class, init)

	@DefinedBy(CoreViewStyleable.paddingLeft::class)
	open var paddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingLeft::class, init)

	@DefinedBy(CoreLayerDrawableStyleable.paddingMode::class)
	open var paddingMode: Any? by GenericEnumDelegate<CoreLayerDrawableStyleable.PaddingModeEnum>(CoreLayerDrawableStyleable.PaddingModeEnum::class)

	@DefinedBy(CoreViewStyleable.paddingRight::class)
	open var paddingRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingRight::class, init)

	@DefinedBy(CoreViewStyleable.paddingStart::class)
	open var paddingStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingStart(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingStart::class, init)

	@DefinedBy(CoreViewStyleable.paddingTop::class)
	open var paddingTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun paddingTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.paddingTop::class, init)

}

open class CoreLayerDrawableItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.bottom::class)
	open var bottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.bottom::class, init)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreLayerDrawableItemStyleable.end::class)
	open var end: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun end(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreLayerDrawableItemStyleable.end::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.left::class)
	open var left: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun left(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.left::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.right::class)
	open var right: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun right(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.right::class, init)

	@DefinedBy(CoreLayerDrawableItemStyleable.start::class)
	open var start: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun start(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreLayerDrawableItemStyleable.start::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.top::class)
	open var top: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun top(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.top::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreRotateDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.fromDegrees::class)
	open var fromDegrees: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fromDegrees(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.fromDegrees::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotX::class)
	open var pivotX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotX::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotY::class)
	open var pivotY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotY::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.toDegrees::class)
	open var toDegrees: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun toDegrees(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.toDegrees::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreAnimatedRotateDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreAnimatedRotateDrawableStyleable.frameDuration::class)
	open var frameDuration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun frameDuration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimatedRotateDrawableStyleable.frameDuration::class, init)

	@DefinedBy(CoreAnimatedRotateDrawableStyleable.framesCount::class)
	open var framesCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun framesCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimatedRotateDrawableStyleable.framesCount::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotX::class)
	open var pivotX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotX::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotY::class)
	open var pivotY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotY::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreMaterialProgressDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.innerRadius::class)
	open var innerRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun innerRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.innerRadius::class, init)

	@DefinedBy(CoreGradientDrawableStyleable.thickness::class)
	open var thickness: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun thickness(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableStyleable.thickness::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreInsetDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreInsetDrawableStyleable.inset::class)
	open var inset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun inset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreInsetDrawableStyleable.inset::class, init)

	@DefinedBy(CoreInsetDrawableStyleable.insetBottom::class)
	open var insetBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun insetBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreInsetDrawableStyleable.insetBottom::class, init)

	@DefinedBy(CoreInsetDrawableStyleable.insetLeft::class)
	open var insetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun insetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreInsetDrawableStyleable.insetLeft::class, init)

	@DefinedBy(CoreInsetDrawableStyleable.insetRight::class)
	open var insetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun insetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreInsetDrawableStyleable.insetRight::class, init)

	@DefinedBy(CoreInsetDrawableStyleable.insetTop::class)
	open var insetTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun insetTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreInsetDrawableStyleable.insetTop::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open override var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreNinePatchDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreImageViewStyleable.src::class)
	open var src: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun src(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.src::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tintMode: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tintMode(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

}

open class CoreColorDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

}

open class CoreRippleDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

	@DefinedBy(CoreDrawableCornersStyleable.radius::class)
	open var radius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun radius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreDrawableCornersStyleable.radius::class, init)

}

open class CoreScaleDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreScaleDrawableStyleable.level::class)
	open var level: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun level(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreScaleDrawableStyleable.level::class, init)

	@DefinedBy(CoreScaleDrawableStyleable.scaleGravity::class)
	open var scaleGravity: Any? by GenericFlagDelegate<CoreScaleDrawableStyleable.ScaleGravityFlag>(CoreScaleDrawableStyleable.ScaleGravityFlag::class)

	@DefinedBy(CoreScaleDrawableStyleable.scaleHeight::class)
	open var scaleHeight: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scaleHeight(init: StringAttribute.() -> Unit)
		= initAttr(CoreScaleDrawableStyleable.scaleHeight::class, init)

	@DefinedBy(CoreScaleDrawableStyleable.scaleWidth::class)
	open var scaleWidth: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun scaleWidth(init: StringAttribute.() -> Unit)
		= initAttr(CoreScaleDrawableStyleable.scaleWidth::class, init)

	@DefinedBy(CoreScaleDrawableStyleable.useIntrinsicSizeAsMinimum::class)
	open var useIntrinsicSizeAsMinimum: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useIntrinsicSizeAsMinimum(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreScaleDrawableStyleable.useIntrinsicSizeAsMinimum::class, init)

}

open class CoreClipDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreClipDrawableStyleable.clipOrientation::class)
	open var clipOrientation: Any? by GenericFlagDelegate<CoreClipDrawableStyleable.ClipOrientationFlag>(CoreClipDrawableStyleable.ClipOrientationFlag::class)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

open class CoreShapeDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

	@DefinedBy(CoreStateListDrawableStyleable.dither::class)
	open var dither: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun dither(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStateListDrawableStyleable.dither::class, init)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tintMode: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tintMode(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreShapeDrawablePaddingStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.bottom::class)
	open var bottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.bottom::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.left::class)
	open var left: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun left(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.left::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.right::class)
	open var right: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun right(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.right::class, init)

	@DefinedBy(CoreGradientDrawablePaddingStyleable.top::class)
	open var top: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun top(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGradientDrawablePaddingStyleable.top::class, init)

}

open class CoreVectorDrawableStyle2 : CoreDrawableStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreDrawableStyleable.autoMirrored::class)
	open override var autoMirrored: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open override fun autoMirrored(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.autoMirrored::class, init)

	@DefinedBy(CoreTextViewStyleable.height::class)
	open var height: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun height(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.height::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetBottom::class)
	open var opticalInsetBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetBottom::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetLeft::class)
	open var opticalInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetLeft::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetRight::class)
	open var opticalInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetRight::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.opticalInsetTop::class)
	open var opticalInsetTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun opticalInsetTop(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.opticalInsetTop::class, init)

	@DefinedBy(CoreImageViewStyleable.tint::class)
	open var tint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tint(init: StringAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.tint::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tintMode::class)
	open var tintMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TintModeEnum>(CoreBitmapDrawableStyleable.TintModeEnum::class)

	@DefinedBy(CoreVectorDrawableStyleable.viewportHeight::class)
	open var viewportHeight: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun viewportHeight(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.viewportHeight::class, init)

	@DefinedBy(CoreVectorDrawableStyleable.viewportWidth::class)
	open var viewportWidth: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun viewportWidth(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableStyleable.viewportWidth::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

open class CoreVectorDrawableClipPathStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.pathData::class)
	open var pathData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pathData(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.pathData::class, init)

}

open class CoreVectorDrawablePathStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVectorDrawablePathStyleable.fillAlpha::class)
	open var fillAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fillAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.fillAlpha::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.fillColor::class)
	open var fillColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fillColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.fillColor::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.fillType::class)
	open var fillType: Any? by GenericEnumDelegate<CoreVectorDrawablePathStyleable.FillTypeEnum>(CoreVectorDrawablePathStyleable.FillTypeEnum::class)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.pathData::class)
	open var pathData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pathData(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.pathData::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeAlpha::class)
	open var strokeAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun strokeAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.strokeAlpha::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeColor::class)
	open var strokeColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun strokeColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.strokeColor::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeLineCap::class)
	open var strokeLineCap: Any? by GenericEnumDelegate<CoreVectorDrawablePathStyleable.StrokeLineCapEnum>(CoreVectorDrawablePathStyleable.StrokeLineCapEnum::class)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeLineJoin::class)
	open var strokeLineJoin: Any? by GenericEnumDelegate<CoreVectorDrawablePathStyleable.StrokeLineJoinEnum>(CoreVectorDrawablePathStyleable.StrokeLineJoinEnum::class)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeMiterLimit::class)
	open var strokeMiterLimit: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun strokeMiterLimit(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.strokeMiterLimit::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.strokeWidth::class)
	open var strokeWidth: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun strokeWidth(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.strokeWidth::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.trimPathEnd::class)
	open var trimPathEnd: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun trimPathEnd(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.trimPathEnd::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.trimPathOffset::class)
	open var trimPathOffset: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun trimPathOffset(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.trimPathOffset::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.trimPathStart::class)
	open var trimPathStart: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun trimPathStart(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.trimPathStart::class, init)

}

open class CoreVectorDrawableGroupStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotX::class)
	open var pivotX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotX::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotY::class)
	open var pivotY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotY::class, init)

	@DefinedBy(CoreViewStyleable.rotation::class)
	open var rotation: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rotation(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.rotation::class, init)

	@DefinedBy(CoreViewStyleable.scaleX::class)
	open var scaleX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun scaleX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scaleX::class, init)

	@DefinedBy(CoreViewStyleable.scaleY::class)
	open var scaleY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun scaleY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.scaleY::class, init)

	@DefinedBy(CoreVectorDrawableGroupStyleable.translateX::class)
	open var translateX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun translateX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableGroupStyleable.translateX::class, init)

	@DefinedBy(CoreVectorDrawableGroupStyleable.translateY::class)
	open var translateY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun translateY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreVectorDrawableGroupStyleable.translateY::class, init)

}

open class CoreGradientColorStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerColor::class)
	open var centerColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun centerColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerColor::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerX::class)
	open var centerX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun centerX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerX::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.centerY::class)
	open var centerY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun centerY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.centerY::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.endColor::class)
	open var endColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun endColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.endColor::class, init)

	@DefinedBy(CoreGradientColorStyleable.endX::class)
	open var endX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun endX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientColorStyleable.endX::class, init)

	@DefinedBy(CoreGradientColorStyleable.endY::class)
	open var endY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun endY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientColorStyleable.endY::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.gradientRadius::class)
	open var gradientRadius: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun gradientRadius(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.gradientRadius::class, init)

	@DefinedBy(CoreGradientDrawableGradientStyleable.startColor::class)
	open var startColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun startColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableGradientStyleable.startColor::class, init)

	@DefinedBy(CoreGradientColorStyleable.startX::class)
	open var startX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun startX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientColorStyleable.startX::class, init)

	@DefinedBy(CoreGradientColorStyleable.startY::class)
	open var startY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun startY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientColorStyleable.startY::class, init)

	@DefinedBy(CoreBitmapDrawableStyleable.tileMode::class)
	open var tileMode: Any? by GenericEnumDelegate<CoreBitmapDrawableStyleable.TileModeEnum>(CoreBitmapDrawableStyleable.TileModeEnum::class)

	@DefinedBy(CoreGradientDrawableGradientStyleable.type::class)
	open var type: Any? by GenericEnumDelegate<CoreGradientDrawableGradientStyleable.TypeEnum>(CoreGradientDrawableGradientStyleable.TypeEnum::class)

}

open class CoreGradientColorItemStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

	@DefinedBy(CoreGradientColorItemStyleable.offset::class)
	open var offset: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun offset(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGradientColorItemStyleable.offset::class, init)

}

open class CoreLayoutAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreLayoutAnimationStyleable.animation::class)
	open var animation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun animation(init: StringAttribute.() -> Unit)
		= initAttr(CoreLayoutAnimationStyleable.animation::class, init)

	@DefinedBy(CoreLayoutAnimationStyleable.animationOrder::class)
	open var animationOrder: Any? by GenericEnumDelegate<CoreLayoutAnimationStyleable.AnimationOrderEnum>(CoreLayoutAnimationStyleable.AnimationOrderEnum::class)

	@DefinedBy(CoreLayoutAnimationStyleable.delay::class)
	open var delay: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun delay(init: FloatAttribute.() -> Unit)
		= initAttr(CoreLayoutAnimationStyleable.delay::class, init)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open override var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

}

open class CoreAnimationStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.background::class)
	open var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(CoreAnimationStyleable.detachWallpaper::class)
	open var detachWallpaper: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun detachWallpaper(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.detachWallpaper::class, init)

	@DefinedBy(CoreAnimationDrawableItemStyleable.duration::class)
	open var duration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun duration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.duration::class, init)

	@DefinedBy(CoreAnimationStyleable.fillAfter::class)
	open var fillAfter: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillAfter(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.fillAfter::class, init)

	@DefinedBy(CoreAnimationStyleable.fillBefore::class)
	open var fillBefore: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillBefore(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.fillBefore::class, init)

	@DefinedBy(CoreAnimationStyleable.fillEnabled::class)
	open var fillEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.fillEnabled::class, init)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

	@DefinedBy(CoreAnimationStyleable.repeatCount::class)
	open var repeatCount: Any? by GenericEnumDelegate<CoreAnimationStyleable.RepeatCountEnum>(CoreAnimationStyleable.RepeatCountEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreAnimationStyleable.repeatMode::class)
	open var repeatMode: Any? by GenericEnumDelegate<CoreAnimationStyleable.RepeatModeEnum>(CoreAnimationStyleable.RepeatModeEnum::class)

	@DefinedBy(CoreAnimationStyleable.startOffset::class)
	open var startOffset: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun startOffset(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.startOffset::class, init)

	@DefinedBy(CoreAnimationStyleable.zAdjustment::class)
	open var zAdjustment: Any? by GenericEnumDelegate<CoreAnimationStyleable.ZAdjustmentEnum>(CoreAnimationStyleable.ZAdjustmentEnum::class)

}

open class CoreRotateAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreRotateDrawableStyleable.fromDegrees::class)
	open var fromDegrees: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fromDegrees(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.fromDegrees::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotX::class)
	open var pivotX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotX::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotY::class)
	open var pivotY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotY::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.toDegrees::class)
	open var toDegrees: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun toDegrees(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.toDegrees::class, init)

}

open class CoreScaleAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreScaleAnimationStyleable.fromXScale::class)
	open var fromXScale: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun fromXScale(init: FloatAttribute.() -> Unit)
		= initAttr(CoreScaleAnimationStyleable.fromXScale::class, init)

	@DefinedBy(CoreScaleAnimationStyleable.fromYScale::class)
	open var fromYScale: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun fromYScale(init: FloatAttribute.() -> Unit)
		= initAttr(CoreScaleAnimationStyleable.fromYScale::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotX::class)
	open var pivotX: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotX(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotX::class, init)

	@DefinedBy(CoreRotateDrawableStyleable.pivotY::class)
	open var pivotY: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun pivotY(init: FloatAttribute.() -> Unit)
		= initAttr(CoreRotateDrawableStyleable.pivotY::class, init)

	@DefinedBy(CoreScaleAnimationStyleable.toXScale::class)
	open var toXScale: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun toXScale(init: FloatAttribute.() -> Unit)
		= initAttr(CoreScaleAnimationStyleable.toXScale::class, init)

	@DefinedBy(CoreScaleAnimationStyleable.toYScale::class)
	open var toYScale: Any? by GenericDelegate(Float::class,FloatContainer::class,Dimension::class,DimensionContainer::class)
	open fun toYScale(init: FloatAttribute.() -> Unit)
		= initAttr(CoreScaleAnimationStyleable.toYScale::class, init)

}

open class CoreTranslateAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTranslateAnimationStyleable.fromXDelta::class)
	open var fromXDelta: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fromXDelta(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTranslateAnimationStyleable.fromXDelta::class, init)

	@DefinedBy(CoreTranslateAnimationStyleable.fromYDelta::class)
	open var fromYDelta: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fromYDelta(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTranslateAnimationStyleable.fromYDelta::class, init)

	@DefinedBy(CoreTranslateAnimationStyleable.toXDelta::class)
	open var toXDelta: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun toXDelta(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTranslateAnimationStyleable.toXDelta::class, init)

	@DefinedBy(CoreTranslateAnimationStyleable.toYDelta::class)
	open var toYDelta: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun toYDelta(init: FloatAttribute.() -> Unit)
		= initAttr(CoreTranslateAnimationStyleable.toYDelta::class, init)

}

open class CoreAlphaAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAlphaAnimationStyleable.fromAlpha::class)
	open var fromAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fromAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAlphaAnimationStyleable.fromAlpha::class, init)

	@DefinedBy(CoreAlphaAnimationStyleable.toAlpha::class)
	open var toAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun toAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAlphaAnimationStyleable.toAlpha::class, init)

}

open class CoreGridLayoutAnimationStyle2 : CoreAnimationStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGridLayoutAnimationStyleable.columnDelay::class)
	open var columnDelay: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun columnDelay(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGridLayoutAnimationStyleable.columnDelay::class, init)

	@DefinedBy(CoreGridLayoutAnimationStyleable.direction::class)
	open var direction: Any? by GenericFlagDelegate<CoreGridLayoutAnimationStyleable.DirectionFlag>(CoreGridLayoutAnimationStyleable.DirectionFlag::class)

	@DefinedBy(CoreGridLayoutAnimationStyleable.directionPriority::class)
	open var directionPriority: Any? by GenericEnumDelegate<CoreGridLayoutAnimationStyleable.DirectionPriorityEnum>(CoreGridLayoutAnimationStyleable.DirectionPriorityEnum::class)

	@DefinedBy(CoreGridLayoutAnimationStyleable.rowDelay::class)
	open var rowDelay: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun rowDelay(init: FloatAttribute.() -> Unit)
		= initAttr(CoreGridLayoutAnimationStyleable.rowDelay::class, init)

}

open class CoreAnimationSetStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.duration::class)
	open var duration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun duration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.duration::class, init)

	@DefinedBy(CoreAnimationStyleable.fillAfter::class)
	open var fillAfter: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillAfter(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.fillAfter::class, init)

	@DefinedBy(CoreAnimationStyleable.fillBefore::class)
	open var fillBefore: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun fillBefore(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.fillBefore::class, init)

	@DefinedBy(CoreAnimationStyleable.repeatMode::class)
	open var repeatMode: Any? by GenericEnumDelegate<CoreAnimationStyleable.RepeatModeEnum>(CoreAnimationStyleable.RepeatModeEnum::class)

	@DefinedBy(CoreAnimationSetStyleable.shareInterpolator::class)
	open var shareInterpolator: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun shareInterpolator(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAnimationSetStyleable.shareInterpolator::class, init)

	@DefinedBy(CoreAnimationStyleable.startOffset::class)
	open var startOffset: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun startOffset(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.startOffset::class, init)

}

open class CoreAccelerateInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAccelerateInterpolatorStyleable.factor::class)
	open var factor: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun factor(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAccelerateInterpolatorStyleable.factor::class, init)

}

open class CoreDecelerateInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAccelerateInterpolatorStyleable.factor::class)
	open var factor: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun factor(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAccelerateInterpolatorStyleable.factor::class, init)

}

open class CoreCycleInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreCycleInterpolatorStyleable.cycles::class)
	open var cycles: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun cycles(init: FloatAttribute.() -> Unit)
		= initAttr(CoreCycleInterpolatorStyleable.cycles::class, init)

}

open class CoreAnticipateInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnticipateInterpolatorStyleable.tension::class)
	open var tension: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun tension(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnticipateInterpolatorStyleable.tension::class, init)

}

open class CoreOvershootInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnticipateInterpolatorStyleable.tension::class)
	open var tension: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun tension(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnticipateInterpolatorStyleable.tension::class, init)

}

open class CoreAnticipateOvershootInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnticipateOvershootInterpolatorStyleable.extraTension::class)
	open var extraTension: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun extraTension(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnticipateOvershootInterpolatorStyleable.extraTension::class, init)

	@DefinedBy(CoreAnticipateInterpolatorStyleable.tension::class)
	open var tension: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun tension(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnticipateInterpolatorStyleable.tension::class, init)

}

open class CorePathInterpolatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePathInterpolatorStyleable.controlX1::class)
	open var controlX1: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun controlX1(init: FloatAttribute.() -> Unit)
		= initAttr(CorePathInterpolatorStyleable.controlX1::class, init)

	@DefinedBy(CorePathInterpolatorStyleable.controlX2::class)
	open var controlX2: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun controlX2(init: FloatAttribute.() -> Unit)
		= initAttr(CorePathInterpolatorStyleable.controlX2::class, init)

	@DefinedBy(CorePathInterpolatorStyleable.controlY1::class)
	open var controlY1: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun controlY1(init: FloatAttribute.() -> Unit)
		= initAttr(CorePathInterpolatorStyleable.controlY1::class, init)

	@DefinedBy(CorePathInterpolatorStyleable.controlY2::class)
	open var controlY2: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun controlY2(init: FloatAttribute.() -> Unit)
		= initAttr(CorePathInterpolatorStyleable.controlY2::class, init)

	@DefinedBy(CoreVectorDrawablePathStyleable.pathData::class)
	open var pathData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pathData(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.pathData::class, init)

}

open class CoreDrawableWrapperStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

}

open class CoreColorStateListItemStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreGradientDrawableSolidStyleable.color::class)
	open var color: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun color(init: StringAttribute.() -> Unit)
		= initAttr(CoreGradientDrawableSolidStyleable.color::class, init)

}

open class CoreLevelListDrawableItemStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

	@DefinedBy(CoreLevelListDrawableItemStyleable.maxLevel::class)
	open var maxLevel: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxLevel(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreLevelListDrawableItemStyleable.maxLevel::class, init)

	@DefinedBy(CoreLevelListDrawableItemStyleable.minLevel::class)
	open var minLevel: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun minLevel(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreLevelListDrawableItemStyleable.minLevel::class, init)

}

open class CoreAdaptiveIconDrawableLayerStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.drawable::class)
	open var drawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun drawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.drawable::class, init)

}

open class CoreTextViewAppearanceStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextViewStyleable.textAppearance::class)
	open var textAppearance: CoreTextAppearanceStyle2? by InlineStyleDelegate()
	open fun textAppearance(init: CoreTextAppearanceStyle2.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle2(), "textAppearance", init)

}

open class CoreSelectionModeDrawablesStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.actionModeCopyDrawable::class)
	open var actionModeCopyDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeCopyDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeCopyDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeCutDrawable::class)
	open var actionModeCutDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeCutDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeCutDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModePasteDrawable::class)
	open var actionModePasteDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModePasteDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModePasteDrawable::class, init)

	@DefinedBy(CoreThemeStyleable.actionModeSelectAllDrawable::class)
	open var actionModeSelectAllDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionModeSelectAllDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.actionModeSelectAllDrawable::class, init)

}

open class CoreSuggestionSpanStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.textUnderlineColor::class)
	open var textUnderlineColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textUnderlineColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textUnderlineColor::class, init)

	@DefinedBy(CoreThemeStyleable.textUnderlineThickness::class)
	open var textUnderlineThickness: Any? by GenericDelegate(String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun textUnderlineThickness(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textUnderlineThickness::class, init)

}

open class CoreInputExtrasStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreEpicenterTranslateClipRevealStyle2 : CoreVisibilityTransitionStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreEpicenterTranslateClipRevealStyleable.interpolatorX::class)
	open var interpolatorX: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolatorX(init: StringAttribute.() -> Unit)
		= initAttr(CoreEpicenterTranslateClipRevealStyleable.interpolatorX::class, init)

	@DefinedBy(CoreEpicenterTranslateClipRevealStyleable.interpolatorY::class)
	open var interpolatorY: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolatorY(init: StringAttribute.() -> Unit)
		= initAttr(CoreEpicenterTranslateClipRevealStyleable.interpolatorY::class, init)

	@DefinedBy(CoreEpicenterTranslateClipRevealStyleable.interpolatorZ::class)
	open var interpolatorZ: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolatorZ(init: StringAttribute.() -> Unit)
		= initAttr(CoreEpicenterTranslateClipRevealStyleable.interpolatorZ::class, init)

}

open class CoreVisibilityTransitionStyle2 : CoreTransitionStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVisibilityTransitionStyleable.transitionVisibilityMode::class)
	open var transitionVisibilityMode: Any? by GenericFlagDelegate<CoreVisibilityTransitionStyleable.TransitionVisibilityModeFlag>(CoreVisibilityTransitionStyleable.TransitionVisibilityModeFlag::class)

}

open class CoreTransitionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.duration::class)
	open var duration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun duration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.duration::class, init)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

	@DefinedBy(CoreTransitionStyleable.matchOrder::class)
	open var matchOrder: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun matchOrder(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionStyleable.matchOrder::class, init)

	@DefinedBy(CoreTransitionStyleable.startDelay::class)
	open var startDelay: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun startDelay(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTransitionStyleable.startDelay::class, init)

}

open class CoreArcMotionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreArcMotionStyleable.maximumAngle::class)
	open var maximumAngle: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun maximumAngle(init: FloatAttribute.() -> Unit)
		= initAttr(CoreArcMotionStyleable.maximumAngle::class, init)

	@DefinedBy(CoreArcMotionStyleable.minimumHorizontalAngle::class)
	open var minimumHorizontalAngle: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minimumHorizontalAngle(init: FloatAttribute.() -> Unit)
		= initAttr(CoreArcMotionStyleable.minimumHorizontalAngle::class, init)

	@DefinedBy(CoreArcMotionStyleable.minimumVerticalAngle::class)
	open var minimumVerticalAngle: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minimumVerticalAngle(init: FloatAttribute.() -> Unit)
		= initAttr(CoreArcMotionStyleable.minimumVerticalAngle::class, init)

}

open class CoreTransitionTargetStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTransitionTargetStyleable.excludeClass::class)
	open var excludeClass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun excludeClass(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionTargetStyleable.excludeClass::class, init)

	@DefinedBy(CoreTransitionTargetStyleable.excludeId::class)
	open var excludeId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun excludeId(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionTargetStyleable.excludeId::class, init)

	@DefinedBy(CoreTransitionTargetStyleable.excludeName::class)
	open var excludeName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun excludeName(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionTargetStyleable.excludeName::class, init)

	@DefinedBy(ManifestIntentStyleable.targetClass::class)
	open var targetClass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun targetClass(init: StringAttribute.() -> Unit)
		= initAttr(ManifestIntentStyleable.targetClass::class, init)

	@DefinedBy(CoreTransitionTargetStyleable.targetId::class)
	open var targetId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun targetId(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionTargetStyleable.targetId::class, init)

	@DefinedBy(CoreTransitionTargetStyleable.targetName::class)
	open var targetName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun targetName(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionTargetStyleable.targetName::class, init)

}

open class CorePatternPathMotionStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePatternPathMotionStyleable.patternPathData::class)
	open var patternPathData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun patternPathData(init: StringAttribute.() -> Unit)
		= initAttr(CorePatternPathMotionStyleable.patternPathData::class, init)

}

open class CoreFadeStyle2 : CoreVisibilityTransitionStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFadeStyleable.fadingMode::class)
	open var fadingMode: Any? by GenericEnumDelegate<CoreFadeStyleable.FadingModeEnum>(CoreFadeStyleable.FadingModeEnum::class)

}

open class CoreSlideStyle2 : CoreVisibilityTransitionStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSlideStyleable.slideEdge::class)
	open var slideEdge: Any? by GenericEnumDelegate<CoreSlideStyleable.SlideEdgeEnum>(CoreSlideStyleable.SlideEdgeEnum::class)

}

open class CoreTransitionSetStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTransitionSetStyleable.transitionOrdering::class)
	open var transitionOrdering: Any? by GenericEnumDelegate<CoreTransitionSetStyleable.TransitionOrderingEnum>(CoreTransitionSetStyleable.TransitionOrderingEnum::class)

}

open class CoreChangeTransformStyle2 : CoreTransitionStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreChangeTransformStyleable.reparent::class)
	open var reparent: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun reparent(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreChangeTransformStyleable.reparent::class, init)

	@DefinedBy(CoreChangeTransformStyleable.reparentWithOverlay::class)
	open var reparentWithOverlay: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun reparentWithOverlay(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreChangeTransformStyleable.reparentWithOverlay::class, init)

}

open class CoreChangeBoundsStyle2 : CoreTransitionStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreChangeBoundsStyleable.resizeClip::class)
	open var resizeClip: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun resizeClip(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreChangeBoundsStyleable.resizeClip::class, init)

}

open class CoreTransitionManagerStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTransitionManagerStyleable.fromScene::class)
	open var fromScene: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fromScene(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionManagerStyleable.fromScene::class, init)

	@DefinedBy(CoreTransitionManagerStyleable.toScene::class)
	open var toScene: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun toScene(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionManagerStyleable.toScene::class, init)

	@DefinedBy(CoreTransitionManagerStyleable.transition::class)
	open var transition: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun transition(init: StringAttribute.() -> Unit)
		= initAttr(CoreTransitionManagerStyleable.transition::class, init)

}

open class CoreAnimatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimationDrawableItemStyleable.duration::class)
	open var duration: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun duration(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationDrawableItemStyleable.duration::class, init)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

	@DefinedBy(CoreAnimationStyleable.repeatCount::class)
	open var repeatCount: Any? by GenericEnumDelegate<CoreAnimationStyleable.RepeatCountEnum>(CoreAnimationStyleable.RepeatCountEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreAnimationStyleable.repeatMode::class)
	open var repeatMode: Any? by GenericEnumDelegate<CoreAnimationStyleable.RepeatModeEnum>(CoreAnimationStyleable.RepeatModeEnum::class)

	@DefinedBy(CoreAnimationStyleable.startOffset::class)
	open var startOffset: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun startOffset(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAnimationStyleable.startOffset::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueFrom::class)
	open var valueFrom: Any? by GenericDelegate(Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun valueFrom(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnimatorStyleable.valueFrom::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueTo::class)
	open var valueTo: Any? by GenericDelegate(Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun valueTo(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnimatorStyleable.valueTo::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueType::class)
	open var valueType: Any? by GenericEnumDelegate<CoreAnimatorStyleable.ValueTypeEnum>(CoreAnimatorStyleable.ValueTypeEnum::class)

}

open class CorePropertyValuesHolderStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePropertyAnimatorStyleable.propertyName::class)
	open var propertyName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun propertyName(init: StringAttribute.() -> Unit)
		= initAttr(CorePropertyAnimatorStyleable.propertyName::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueFrom::class)
	open var valueFrom: Any? by GenericDelegate(Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun valueFrom(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnimatorStyleable.valueFrom::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueTo::class)
	open var valueTo: Any? by GenericDelegate(Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class,Dimension::class,DimensionContainer::class)
	open fun valueTo(init: FloatAttribute.() -> Unit)
		= initAttr(CoreAnimatorStyleable.valueTo::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueType::class)
	open var valueType: Any? by GenericEnumDelegate<CoreAnimatorStyleable.ValueTypeEnum>(CoreAnimatorStyleable.ValueTypeEnum::class)

}

open class CoreKeyframeStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyframeStyleable.fraction::class)
	open var fraction: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun fraction(init: FloatAttribute.() -> Unit)
		= initAttr(CoreKeyframeStyleable.fraction::class, init)

	@DefinedBy(CoreProgressBarStyleable.interpolator::class)
	open var interpolator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun interpolator(init: StringAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.interpolator::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var value: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun value(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreAnimatorStyleable.valueType::class)
	open var valueType: Any? by GenericEnumDelegate<CoreAnimatorStyleable.ValueTypeEnum>(CoreAnimatorStyleable.ValueTypeEnum::class)

}

open class CorePropertyAnimatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVectorDrawablePathStyleable.pathData::class)
	open var pathData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pathData(init: StringAttribute.() -> Unit)
		= initAttr(CoreVectorDrawablePathStyleable.pathData::class, init)

	@DefinedBy(CorePropertyAnimatorStyleable.propertyName::class)
	open var propertyName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun propertyName(init: StringAttribute.() -> Unit)
		= initAttr(CorePropertyAnimatorStyleable.propertyName::class, init)

	@DefinedBy(CorePropertyAnimatorStyleable.propertyXName::class)
	open var propertyXName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun propertyXName(init: StringAttribute.() -> Unit)
		= initAttr(CorePropertyAnimatorStyleable.propertyXName::class, init)

	@DefinedBy(CorePropertyAnimatorStyleable.propertyYName::class)
	open var propertyYName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun propertyYName(init: StringAttribute.() -> Unit)
		= initAttr(CorePropertyAnimatorStyleable.propertyYName::class, init)

}

open class CoreAnimatorSetStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAnimatorSetStyleable.ordering::class)
	open var ordering: Any? by GenericEnumDelegate<CoreAnimatorSetStyleable.OrderingEnum>(CoreAnimatorSetStyleable.OrderingEnum::class)

}

open class CoreViewDrawableStatesStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_accelerated::class)
	open var state_accelerated: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_accelerated(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_accelerated::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_activated::class)
	open var state_activated: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_activated(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_activated::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_drag_can_accept::class)
	open var state_drag_can_accept: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_drag_can_accept(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_drag_can_accept::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_drag_hovered::class)
	open var state_drag_hovered: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_drag_hovered(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_drag_hovered::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_enabled::class)
	open var state_enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_enabled::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_focused::class)
	open var state_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_focused::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_hovered::class)
	open var state_hovered: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_hovered(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_hovered::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_pressed::class)
	open var state_pressed: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_pressed(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_pressed::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_selected::class)
	open var state_selected: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_selected(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_selected::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_window_focused::class)
	open var state_window_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_window_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_window_focused::class, init)

}

open class CoreMenuItemCheckedStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_checkable::class)
	open var state_checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checkable::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_checked::class)
	open var state_checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checked::class, init)

}

open class CoreMenuItemUncheckedStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_checkable::class)
	open var state_checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checkable::class, init)

}

open class CoreMenuItemCheckedFocusedStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_checkable::class)
	open var state_checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checkable::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_checked::class)
	open var state_checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checked::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_focused::class)
	open var state_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_focused::class, init)

}

open class CoreMenuItemUncheckedFocusedStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_checkable::class)
	open var state_checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_checkable::class, init)

	@DefinedBy(CoreDrawableStatesStyleable.state_focused::class)
	open var state_focused: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_focused(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_focused::class, init)

}

open class CoreExpandableListChildIndicatorStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStatesStyleable.state_last::class)
	open var state_last: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_last(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStatesStyleable.state_last::class, init)

}

open class CoreExpandableListGroupIndicatorStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreExpandableListGroupIndicatorStateStyleable.state_empty::class)
	open var state_empty: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_empty(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreExpandableListGroupIndicatorStateStyleable.state_empty::class, init)

	@DefinedBy(CoreExpandableListGroupIndicatorStateStyleable.state_expanded::class)
	open var state_expanded: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_expanded(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreExpandableListGroupIndicatorStateStyleable.state_expanded::class, init)

}

open class CorePopupWindowBackgroundStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePopupWindowBackgroundStateStyleable.state_above_anchor::class)
	open var state_above_anchor: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_above_anchor(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePopupWindowBackgroundStateStyleable.state_above_anchor::class, init)

}

open class CoreTextViewMultiLineBackgroundStateStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextViewMultiLineBackgroundStateStyleable.state_multiline::class)
	open var state_multiline: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun state_multiline(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewMultiLineBackgroundStateStyleable.state_multiline::class, init)

}

open class CoreSearchableStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreSearchableStyleable.autoUrlDetect::class)
	open var autoUrlDetect: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoUrlDetect(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.autoUrlDetect::class, init)

	@DefinedBy(CoreTextViewStyleable.hint::class)
	open var hint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun hint(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.hint::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreStyleable.imeOptions::class)
	open var imeOptions: Any? by GenericFlagDelegate<ImeOptions>(ImeOptions::class)

	@DefinedBy(CoreSearchableStyleable.includeInGlobalSearch::class)
	open var includeInGlobalSearch: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun includeInGlobalSearch(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.includeInGlobalSearch::class, init)

	@DefinedBy(CoreStyleable.inputType::class)
	open var inputType: Any? by GenericFlagDelegate<InputType>(InputType::class)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreSearchableStyleable.queryAfterZeroResults::class)
	open var queryAfterZeroResults: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun queryAfterZeroResults(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.queryAfterZeroResults::class, init)

	@DefinedBy(CoreSearchableStyleable.searchButtonText::class)
	open var searchButtonText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchButtonText(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchButtonText::class, init)

	@DefinedBy(CoreSearchableStyleable.searchMode::class)
	open var searchMode: Any? by GenericFlagDelegate<CoreSearchableStyleable.SearchModeFlag>(CoreSearchableStyleable.SearchModeFlag::class)

	@DefinedBy(CoreSearchableStyleable.searchSettingsDescription::class)
	open var searchSettingsDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSettingsDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSettingsDescription::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestAuthority::class)
	open var searchSuggestAuthority: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSuggestAuthority(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestAuthority::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestIntentAction::class)
	open var searchSuggestIntentAction: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSuggestIntentAction(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestIntentAction::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestIntentData::class)
	open var searchSuggestIntentData: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSuggestIntentData(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestIntentData::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestPath::class)
	open var searchSuggestPath: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSuggestPath(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestPath::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestSelection::class)
	open var searchSuggestSelection: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchSuggestSelection(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestSelection::class, init)

	@DefinedBy(CoreSearchableStyleable.searchSuggestThreshold::class)
	open var searchSuggestThreshold: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun searchSuggestThreshold(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.searchSuggestThreshold::class, init)

	@DefinedBy(CoreSearchableStyleable.voiceLanguage::class)
	open var voiceLanguage: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun voiceLanguage(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.voiceLanguage::class, init)

	@DefinedBy(CoreSearchableStyleable.voiceLanguageModel::class)
	open var voiceLanguageModel: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun voiceLanguageModel(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.voiceLanguageModel::class, init)

	@DefinedBy(CoreSearchableStyleable.voiceMaxResults::class)
	open var voiceMaxResults: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun voiceMaxResults(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.voiceMaxResults::class, init)

	@DefinedBy(CoreSearchableStyleable.voicePromptText::class)
	open var voicePromptText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun voicePromptText(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableStyleable.voicePromptText::class, init)

	@DefinedBy(CoreSearchableStyleable.voiceSearchMode::class)
	open var voiceSearchMode: Any? by GenericFlagDelegate<CoreSearchableStyleable.VoiceSearchModeFlag>(CoreSearchableStyleable.VoiceSearchModeFlag::class)

}

open class CoreSearchableActionKeyStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

// SKIPPING keycode

	@DefinedBy(CoreSearchableActionKeyStyleable.queryActionMsg::class)
	open var queryActionMsg: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun queryActionMsg(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableActionKeyStyleable.queryActionMsg::class, init)

	@DefinedBy(CoreSearchableActionKeyStyleable.suggestActionMsg::class)
	open var suggestActionMsg: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun suggestActionMsg(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableActionKeyStyleable.suggestActionMsg::class, init)

	@DefinedBy(CoreSearchableActionKeyStyleable.suggestActionMsgColumn::class)
	open var suggestActionMsgColumn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun suggestActionMsgColumn(init: StringAttribute.() -> Unit)
		= initAttr(CoreSearchableActionKeyStyleable.suggestActionMsgColumn::class, init)

}

open class CoreMenuStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

}

open class CoreMenuGroupStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreMenuGroupStyleable.checkableBehavior::class)
	open var checkableBehavior: Any? by GenericEnumDelegate<CoreMenuGroupStyleable.CheckableBehaviorEnum>(CoreMenuGroupStyleable.CheckableBehaviorEnum::class)

	@DefinedBy(CoreTextViewStyleable.enabled::class)
	open var enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.enabled::class, init)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreMenuGroupStyleable.menuCategory::class)
	open var menuCategory: Any? by GenericEnumDelegate<CoreMenuGroupStyleable.MenuCategoryEnum>(CoreMenuGroupStyleable.MenuCategoryEnum::class)

	@DefinedBy(CoreMenuGroupStyleable.orderInCategory::class)
	open var orderInCategory: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun orderInCategory(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreMenuGroupStyleable.orderInCategory::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreMenuItemStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreMenuItemStyleable.actionLayout::class)
	open var actionLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.actionLayout::class, init)

	@DefinedBy(CoreMenuItemStyleable.actionProviderClass::class)
	open var actionProviderClass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionProviderClass(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.actionProviderClass::class, init)

	@DefinedBy(CoreMenuItemStyleable.actionViewClass::class)
	open var actionViewClass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun actionViewClass(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.actionViewClass::class, init)

	@DefinedBy(CoreMenuItemStyleable.alphabeticModifiers::class)
	open var alphabeticModifiers: Any? by GenericFlagDelegate<CoreMenuItemStyleable.AlphabeticModifiersFlag>(CoreMenuItemStyleable.AlphabeticModifiersFlag::class)

	@DefinedBy(CoreMenuItemStyleable.alphabeticShortcut::class)
	open var alphabeticShortcut: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun alphabeticShortcut(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.alphabeticShortcut::class, init)

	@DefinedBy(CoreMenuItemStyleable.checkable::class)
	open var checkable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun checkable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.checkable::class, init)

	@DefinedBy(CoreCompoundButtonStyleable.checked::class)
	open var checked: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun checked(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreCompoundButtonStyleable.checked::class, init)

	@DefinedBy(CoreMenuItemStyleable.contentDescription::class)
	open var contentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contentDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.contentDescription::class, init)

	@DefinedBy(CoreTextViewStyleable.enabled::class)
	open var enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.enabled::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreMenuItemStyleable.iconTint::class)
	open var iconTint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun iconTint(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.iconTint::class, init)

	@DefinedBy(CoreMenuItemStyleable.iconTintMode::class)
	open var iconTintMode: Any? by GenericEnumDelegate<CoreMenuItemStyleable.IconTintModeEnum>(CoreMenuItemStyleable.IconTintModeEnum::class)

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreMenuGroupStyleable.menuCategory::class)
	open var menuCategory: Any? by GenericEnumDelegate<CoreMenuGroupStyleable.MenuCategoryEnum>(CoreMenuGroupStyleable.MenuCategoryEnum::class)

	@DefinedBy(CoreMenuItemStyleable.numericModifiers::class)
	open var numericModifiers: Any? by GenericFlagDelegate<CoreMenuItemStyleable.NumericModifiersFlag>(CoreMenuItemStyleable.NumericModifiersFlag::class)

	@DefinedBy(CoreMenuItemStyleable.numericShortcut::class)
	open var numericShortcut: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun numericShortcut(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.numericShortcut::class, init)

	@DefinedBy(CoreViewStyleable.onClick::class)
	open var onClick: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun onClick(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.onClick::class, init)

	@DefinedBy(CoreMenuGroupStyleable.orderInCategory::class)
	open var orderInCategory: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun orderInCategory(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreMenuGroupStyleable.orderInCategory::class, init)

	@DefinedBy(CoreMenuItemStyleable.showAsAction::class)
	open var showAsAction: Any? by GenericFlagDelegate<CoreMenuItemStyleable.ShowAsActionFlag>(CoreMenuItemStyleable.ShowAsActionFlag::class)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

	@DefinedBy(CoreMenuItemStyleable.titleCondensed::class)
	open var titleCondensed: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleCondensed(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.titleCondensed::class, init)

	@DefinedBy(CoreMenuItemStyleable.tooltipText::class)
	open var tooltipText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipText(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.tooltipText::class, init)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreAppWidgetProviderInfoStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.autoAdvanceViewId::class)
	open var autoAdvanceViewId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun autoAdvanceViewId(init: StringAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.autoAdvanceViewId::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.configure::class)
	open var configure: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun configure(init: StringAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.configure::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.initialKeyguardLayout::class)
	open var initialKeyguardLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun initialKeyguardLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.initialKeyguardLayout::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.initialLayout::class)
	open var initialLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun initialLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.initialLayout::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.minResizeHeightclass::class)
	open var minResizeHeightclass: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minResizeHeightclass(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.minResizeHeightclass::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.minResizeWidthclass::class)
	open var minResizeWidthclass: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minResizeWidthclass(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.minResizeWidthclass::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.previewImage::class)
	open var previewImage: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun previewImage(init: StringAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.previewImage::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.resizeMode::class)
	open var resizeMode: Any? by GenericFlagDelegate<CoreAppWidgetProviderInfoStyleable.ResizeModeFlag>(CoreAppWidgetProviderInfoStyleable.ResizeModeFlag::class)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.updatePeriodMillis::class)
	open var updatePeriodMillis: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun updatePeriodMillis(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreAppWidgetProviderInfoStyleable.updatePeriodMillis::class, init)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.widgetCategory::class)
	open var widgetCategory: Any? by GenericFlagDelegate<CoreAppWidgetProviderInfoStyleable.WidgetCategoryFlag>(CoreAppWidgetProviderInfoStyleable.WidgetCategoryFlag::class)

	@DefinedBy(CoreAppWidgetProviderInfoStyleable.widgetFeatures::class)
	open var widgetFeatures: Any? by GenericFlagDelegate<CoreAppWidgetProviderInfoStyleable.WidgetFeaturesFlag>(CoreAppWidgetProviderInfoStyleable.WidgetFeaturesFlag::class)

}

open class CoreWallpaperPreviewInfoStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreWallpaperPreviewInfoStyleable.staticWallpaperPreview::class)
	open var staticWallpaperPreview: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun staticWallpaperPreview(init: StringAttribute.() -> Unit)
		= initAttr(CoreWallpaperPreviewInfoStyleable.staticWallpaperPreview::class, init)

}

open class CoreDeviceAdminStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDrawableStyleable.visible::class)
	open var visible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun visible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDrawableStyleable.visible::class, init)

}

open class CoreAccountAuthenticatorStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAccountAuthenticatorStyleable.accountPreferencesclass::class)
	open var accountPreferencesclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun accountPreferencesclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreAccountAuthenticatorStyleable.accountPreferencesclass::class, init)

	@DefinedBy(CoreAccountAuthenticatorStyleable.accountType::class)
	open var accountType: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun accountType(init: StringAttribute.() -> Unit)
		= initAttr(CoreAccountAuthenticatorStyleable.accountType::class, init)

	@DefinedBy(CoreAccountAuthenticatorStyleable.customTokensclass::class)
	open var customTokensclass: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun customTokensclass(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAccountAuthenticatorStyleable.customTokensclass::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreAccountAuthenticatorStyleable.smallIconclass::class)
	open var smallIconclass: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun smallIconclass(init: StringAttribute.() -> Unit)
		= initAttr(CoreAccountAuthenticatorStyleable.smallIconclass::class, init)

}

open class CoreSyncAdapterStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreAccountAuthenticatorStyleable.accountType::class)
	open var accountType: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun accountType(init: StringAttribute.() -> Unit)
		= initAttr(CoreAccountAuthenticatorStyleable.accountType::class, init)

	@DefinedBy(CoreSyncAdapterStyleable.allowParallelSyncsclass::class)
	open var allowParallelSyncsclass: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowParallelSyncsclass(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSyncAdapterStyleable.allowParallelSyncsclass::class, init)

	@DefinedBy(CoreSyncAdapterStyleable.contentAuthority::class)
	open var contentAuthority: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contentAuthority(init: StringAttribute.() -> Unit)
		= initAttr(CoreSyncAdapterStyleable.contentAuthority::class, init)

	@DefinedBy(CoreSyncAdapterStyleable.isAlwaysSyncableclass::class)
	open var isAlwaysSyncableclass: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isAlwaysSyncableclass(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSyncAdapterStyleable.isAlwaysSyncableclass::class, init)

	@DefinedBy(CoreInputMethodStyleable.settingsActivity::class)
	open var settingsActivity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun settingsActivity(init: StringAttribute.() -> Unit)
		= initAttr(CoreInputMethodStyleable.settingsActivity::class, init)

	@DefinedBy(CoreSyncAdapterStyleable.supportsUploadingclass::class)
	open var supportsUploadingclass: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun supportsUploadingclass(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSyncAdapterStyleable.supportsUploadingclass::class, init)

	@DefinedBy(CoreSyncAdapterStyleable.userVisibleclass::class)
	open var userVisibleclass: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun userVisibleclass(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSyncAdapterStyleable.userVisibleclass::class, init)

}

open class CoreIconStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(AndroidManifestDataStyleable.mimeType::class)
	open var mimeType: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun mimeType(init: StringAttribute.() -> Unit)
		= initAttr(AndroidManifestDataStyleable.mimeType::class, init)

}

open class CoreIconDefaultStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

}

open class CoreContactsDataKindStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreContactsDataKindStyleable.allContactsName::class)
	open var allContactsName: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun allContactsName(init: StringAttribute.() -> Unit)
		= initAttr(CoreContactsDataKindStyleable.allContactsName::class, init)

	@DefinedBy(CoreContactsDataKindStyleable.detailColumn::class)
	open var detailColumn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun detailColumn(init: StringAttribute.() -> Unit)
		= initAttr(CoreContactsDataKindStyleable.detailColumn::class, init)

	@DefinedBy(CoreContactsDataKindStyleable.detailSocialSummary::class)
	open var detailSocialSummary: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun detailSocialSummary(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreContactsDataKindStyleable.detailSocialSummary::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(AndroidManifestDataStyleable.mimeType::class)
	open var mimeType: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun mimeType(init: StringAttribute.() -> Unit)
		= initAttr(AndroidManifestDataStyleable.mimeType::class, init)

	@DefinedBy(CoreContactsDataKindStyleable.summaryColumn::class)
	open var summaryColumn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun summaryColumn(init: StringAttribute.() -> Unit)
		= initAttr(CoreContactsDataKindStyleable.summaryColumn::class, init)

}

open class CoreSlidingTabStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

}

open class CoreGlowPadViewStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGlowPadViewStyleable.directionDescriptions::class)
	open var directionDescriptions: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun directionDescriptions(init: StringAttribute.() -> Unit)
		= initAttr(CoreGlowPadViewStyleable.directionDescriptions::class, init)

	@DefinedBy(CoreGlowPadViewStyleable.targetDescriptions::class)
	open var targetDescriptions: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun targetDescriptions(init: StringAttribute.() -> Unit)
		= initAttr(CoreGlowPadViewStyleable.targetDescriptions::class, init)

}

open class CoreLockPatternViewStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreLockPatternViewStyleable.aspect::class)
	open var aspect: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun aspect(init: StringAttribute.() -> Unit)
		= initAttr(CoreLockPatternViewStyleable.aspect::class, init)

	@DefinedBy(CoreLockPatternViewStyleable.errorColor::class)
	open var errorColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun errorColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreLockPatternViewStyleable.errorColor::class, init)

	@DefinedBy(CoreLockPatternViewStyleable.pathColor::class)
	open var pathColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pathColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreLockPatternViewStyleable.pathColor::class, init)

	@DefinedBy(CoreLockPatternViewStyleable.regularColor::class)
	open var regularColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun regularColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreLockPatternViewStyleable.regularColor::class, init)

	@DefinedBy(CoreLockPatternViewStyleable.successColor::class)
	open var successColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun successColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreLockPatternViewStyleable.successColor::class, init)

}

open class CoreVoiceEnrollmentApplicationStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreVoiceEnrollmentApplicationStyleable.searchKeyphrase::class)
	open var searchKeyphrase: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchKeyphrase(init: StringAttribute.() -> Unit)
		= initAttr(CoreVoiceEnrollmentApplicationStyleable.searchKeyphrase::class, init)

	@DefinedBy(CoreVoiceEnrollmentApplicationStyleable.searchKeyphraseId::class)
	open var searchKeyphraseId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun searchKeyphraseId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreVoiceEnrollmentApplicationStyleable.searchKeyphraseId::class, init)

	@DefinedBy(CoreVoiceEnrollmentApplicationStyleable.searchKeyphraseRecognitionFlags::class)
	open var searchKeyphraseRecognitionFlags: Any? by GenericFlagDelegate<CoreVoiceEnrollmentApplicationStyleable.SearchKeyphraseRecognitionFlagsFlag>(CoreVoiceEnrollmentApplicationStyleable.SearchKeyphraseRecognitionFlagsFlag::class)

	@DefinedBy(CoreVoiceEnrollmentApplicationStyleable.searchKeyphraseSupportedLocales::class)
	open var searchKeyphraseSupportedLocales: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun searchKeyphraseSupportedLocales(init: StringAttribute.() -> Unit)
		= initAttr(CoreVoiceEnrollmentApplicationStyleable.searchKeyphraseSupportedLocales::class, init)

}

open class CorePointerStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePointerStyleable.pointerIconAlias::class)
	open var pointerIconAlias: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconAlias(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconAlias::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconAllScroll::class)
	open var pointerIconAllScroll: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconAllScroll(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconAllScroll::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconArrow::class)
	open var pointerIconArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconArrow(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconArrow::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconCell::class)
	open var pointerIconCell: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconCell(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconCell::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconContextMenu::class)
	open var pointerIconContextMenu: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconContextMenu(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconContextMenu::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconCopy::class)
	open var pointerIconCopy: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconCopy(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconCopy::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconCrosshair::class)
	open var pointerIconCrosshair: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconCrosshair(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconCrosshair::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconGrab::class)
	open var pointerIconGrab: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconGrab(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconGrab::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconGrabbing::class)
	open var pointerIconGrabbing: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconGrabbing(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconGrabbing::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconHand::class)
	open var pointerIconHand: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconHand(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconHand::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconHelp::class)
	open var pointerIconHelp: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconHelp(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconHelp::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconHorizontalDoubleArrow::class)
	open var pointerIconHorizontalDoubleArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconHorizontalDoubleArrow(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconHorizontalDoubleArrow::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconNodrop::class)
	open var pointerIconNodrop: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconNodrop(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconNodrop::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconSpotAnchor::class)
	open var pointerIconSpotAnchor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconSpotAnchor(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconSpotAnchor::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconSpotHover::class)
	open var pointerIconSpotHover: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconSpotHover(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconSpotHover::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconSpotTouch::class)
	open var pointerIconSpotTouch: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconSpotTouch(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconSpotTouch::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconText::class)
	open var pointerIconText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconText(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconText::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconTopLeftDiagonalDoubleArrow::class)
	open var pointerIconTopLeftDiagonalDoubleArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconTopLeftDiagonalDoubleArrow(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconTopLeftDiagonalDoubleArrow::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconTopRightDiagonalDoubleArrow::class)
	open var pointerIconTopRightDiagonalDoubleArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconTopRightDiagonalDoubleArrow(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconTopRightDiagonalDoubleArrow::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconVerticalDoubleArrow::class)
	open var pointerIconVerticalDoubleArrow: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconVerticalDoubleArrow(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconVerticalDoubleArrow::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconVerticalText::class)
	open var pointerIconVerticalText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconVerticalText(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconVerticalText::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconWait::class)
	open var pointerIconWait: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconWait(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconWait::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconZoomIn::class)
	open var pointerIconZoomIn: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconZoomIn(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconZoomIn::class, init)

	@DefinedBy(CorePointerStyleable.pointerIconZoomOut::class)
	open var pointerIconZoomOut: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun pointerIconZoomOut(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerStyleable.pointerIconZoomOut::class, init)

}

open class CorePointerIconStyle2 : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CorePointerIconStyleable.bitmap::class)
	open var bitmap: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun bitmap(init: StringAttribute.() -> Unit)
		= initAttr(CorePointerIconStyleable.bitmap::class, init)

	@DefinedBy(CorePointerIconStyleable.hotSpotX::class)
	open var hotSpotX: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun hotSpotX(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePointerIconStyleable.hotSpotX::class, init)

	@DefinedBy(CorePointerIconStyleable.hotSpotY::class)
	open var hotSpotY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun hotSpotY(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePointerIconStyleable.hotSpotY::class, init)

}

open class CoreStorageStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStorageStyleable.allowMassStorage::class)
	open var allowMassStorage: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowMassStorage(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.allowMassStorage::class, init)

	@DefinedBy(CoreStorageStyleable.emulated::class)
	open var emulated: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun emulated(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.emulated::class, init)

	@DefinedBy(CoreStorageStyleable.maxFileSize::class)
	open var maxFileSize: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun maxFileSize(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.maxFileSize::class, init)

	@DefinedBy(CoreStorageStyleable.mountPoint::class)
	open var mountPoint: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun mountPoint(init: StringAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.mountPoint::class, init)

	@DefinedBy(CoreStorageStyleable.mtpReserve::class)
	open var mtpReserve: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun mtpReserve(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.mtpReserve::class, init)

	@DefinedBy(CoreStorageStyleable.primary::class)
	open var primary: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun primary(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.primary::class, init)

	@DefinedBy(CoreStorageStyleable.removable::class)
	open var removable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun removable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.removable::class, init)

	@DefinedBy(CoreStorageStyleable.storageDescription::class)
	open var storageDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun storageDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreStorageStyleable.storageDescription::class, init)

}

open class CoreKeyboardLayoutStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyboardLayoutStyleable.keyboardLayout::class)
	open var keyboardLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyboardLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardLayoutStyleable.keyboardLayout::class, init)

	@DefinedBy(ManifestStyleable.label::class)
	open var label: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun label(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.label::class, init)

	@DefinedBy(CoreKeyboardLayoutStyleable.locale::class)
	open var locale: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun locale(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardLayoutStyleable.locale::class, init)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

	@DefinedBy(CoreKeyboardLayoutStyleable.productId::class)
	open var productId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun productId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreKeyboardLayoutStyleable.productId::class, init)

	@DefinedBy(CoreKeyboardLayoutStyleable.vendorId::class)
	open var vendorId: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun vendorId(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreKeyboardLayoutStyleable.vendorId::class, init)

}

open class CorePagedViewStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePagedViewStyleable.pageSpacing::class)
	open var pageSpacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun pageSpacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePagedViewStyleable.pageSpacing::class, init)

	@DefinedBy(CorePagedViewStyleable.scrollIndicatorPaddingLeft::class)
	open var scrollIndicatorPaddingLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun scrollIndicatorPaddingLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePagedViewStyleable.scrollIndicatorPaddingLeft::class, init)

	@DefinedBy(CorePagedViewStyleable.scrollIndicatorPaddingRight::class)
	open var scrollIndicatorPaddingRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun scrollIndicatorPaddingRight(init: DimensionAttribute.() -> Unit)
		= initAttr(CorePagedViewStyleable.scrollIndicatorPaddingRight::class, init)

}

open class CoreKeyguardGlowStripViewStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreKeyguardGlowStripViewStyleable.dotSize::class)
	open var dotSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dotSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyguardGlowStripViewStyleable.dotSize::class, init)

	@DefinedBy(CoreKeyguardGlowStripViewStyleable.glowDot::class)
	open var glowDot: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun glowDot(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyguardGlowStripViewStyleable.glowDot::class, init)

	@DefinedBy(CoreKeyguardGlowStripViewStyleable.leftToRight::class)
	open var leftToRight: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun leftToRight(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreKeyguardGlowStripViewStyleable.leftToRight::class, init)

	@DefinedBy(CoreKeyguardGlowStripViewStyleable.numDots::class)
	open var numDots: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun numDots(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreKeyguardGlowStripViewStyleable.numDots::class, init)

}

open class CoreEdgeEffectStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.colorEdgeEffect::class)
	open var colorEdgeEffect: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorEdgeEffect(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorEdgeEffect::class, init)

}

open class CoreResolverDrawerLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreResolverDrawerLayoutStyleable.maxCollapsedHeight::class)
	open var maxCollapsedHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxCollapsedHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.maxCollapsedHeight::class, init)

	@DefinedBy(CoreResolverDrawerLayoutStyleable.maxCollapsedHeightSmall::class)
	open var maxCollapsedHeightSmall: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxCollapsedHeightSmall(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.maxCollapsedHeightSmall::class, init)

	@DefinedBy(CoreImageViewStyleable.maxWidth::class)
	open var maxWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreImageViewStyleable.maxWidth::class, init)

	@DefinedBy(CoreResolverDrawerLayoutStyleable.showAtTop::class)
	open var showAtTop: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showAtTop(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.showAtTop::class, init)

}

open class CoreResolverDrawerLayout_LayoutParamsStyle2 : CoreViewGroup_MarginLayoutStyle2 {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_alwaysShow::class)
	open var layout_alwaysShow: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alwaysShow(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_alwaysShow::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_hasNestedScrollIndicator::class)
	open var layout_hasNestedScrollIndicator: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_hasNestedScrollIndicator(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_hasNestedScrollIndicator::class, init)

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_ignoreOffset::class)
	open var layout_ignoreOffset: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_ignoreOffset(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_ignoreOffset::class, init)

}

open class CoreMessagingLinearLayoutStyle2 : CoreViewGroupStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreGalleryStyleable.spacing::class)
	open var spacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun spacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGalleryStyleable.spacing::class, init)

}

open class CoreDateTimeViewStyle2 : CoreTextViewStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreDateTimeViewStyleable.showRelative::class)
	open var showRelative: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showRelative(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDateTimeViewStyleable.showRelative::class, init)

}

open class CoreLightingStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.ambientShadowAlpha::class)
	open var ambientShadowAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun ambientShadowAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.ambientShadowAlpha::class, init)

	@DefinedBy(CoreThemeStyleable.lightRadius::class)
	open var lightRadius: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightRadius(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightRadius::class, init)

	@DefinedBy(CoreThemeStyleable.lightY::class)
	open var lightY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightY::class, init)

	@DefinedBy(CoreThemeStyleable.lightZ::class)
	open var lightZ: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun lightZ(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.lightZ::class, init)

	@DefinedBy(CoreThemeStyleable.spotShadowAlpha::class)
	open var spotShadowAlpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun spotShadowAlpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.spotShadowAlpha::class, init)

}

open class CoreRestrictionEntryStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CorePreferenceStyleable.defaultValue::class)
	open var defaultValue: Any? by GenericDelegate(Boolean::class,BooleanContainer::class,Float::class,FloatContainer::class,Int::class,IntegerContainer::class,String::class,StringContainer::class)
	open fun defaultValue(init: BooleanAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.defaultValue::class, init)

	@DefinedBy(ManifestStyleable.description::class)
	open var description: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun description(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.description::class, init)

	@DefinedBy(CoreStyleable.entries::class)
	open var entries: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entries(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.entries::class, init)

	@DefinedBy(CoreListPreferenceStyleable.entryValues::class)
	open var entryValues: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun entryValues(init: StringAttribute.() -> Unit)
		= initAttr(CoreListPreferenceStyleable.entryValues::class, init)

	@DefinedBy(CorePreferenceStyleable.key::class)
	open var key: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun key(init: StringAttribute.() -> Unit)
		= initAttr(CorePreferenceStyleable.key::class, init)

	@DefinedBy(CoreRestrictionEntryStyleable.restrictionType::class)
	open var restrictionType: Any? by GenericEnumDelegate<CoreRestrictionEntryStyleable.RestrictionTypeEnum>(CoreRestrictionEntryStyleable.RestrictionTypeEnum::class)

	@DefinedBy(CoreMenuItemStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(CoreMenuItemStyleable.title::class, init)

}

open class CoreActivityTaskDescriptionStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreThemeStyleable.colorBackground::class)
	open var colorBackground: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorBackground(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorBackground::class, init)

	@DefinedBy(CoreThemeStyleable.colorPrimary::class)
	open var colorPrimary: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun colorPrimary(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.colorPrimary::class, init)

	@DefinedBy(CoreWindowStyleable.navigationBarColor::class)
	open var navigationBarColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationBarColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.navigationBarColor::class, init)

	@DefinedBy(CoreWindowStyleable.statusBarColor::class)
	open var statusBarColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun statusBarColor(init: StringAttribute.() -> Unit)
		= initAttr(CoreWindowStyleable.statusBarColor::class, init)

}

open class CoreShortcutStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreTextViewStyleable.enabled::class)
	open var enabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun enabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.enabled::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(CoreShortcutStyleable.shortcutDisabledMessage::class)
	open var shortcutDisabledMessage: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shortcutDisabledMessage(init: StringAttribute.() -> Unit)
		= initAttr(CoreShortcutStyleable.shortcutDisabledMessage::class, init)

	@DefinedBy(CoreShortcutStyleable.shortcutId::class)
	open var shortcutId: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shortcutId(init: StringAttribute.() -> Unit)
		= initAttr(CoreShortcutStyleable.shortcutId::class, init)

	@DefinedBy(CoreShortcutStyleable.shortcutLongLabel::class)
	open var shortcutLongLabel: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shortcutLongLabel(init: StringAttribute.() -> Unit)
		= initAttr(CoreShortcutStyleable.shortcutLongLabel::class, init)

	@DefinedBy(CoreShortcutStyleable.shortcutShortLabel::class)
	open var shortcutShortLabel: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shortcutShortLabel(init: StringAttribute.() -> Unit)
		= initAttr(CoreShortcutStyleable.shortcutShortLabel::class, init)

}

open class CoreShortcutCategoriesStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(ManifestStyleable.name::class)
	open var name: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun name(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.name::class, init)

}

open class CoreFontFamilyFontStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFontFamilyFontStyleable.font::class)
	open var font: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun font(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyFontStyleable.font::class, init)

	@DefinedBy(CoreFontFamilyFontStyleable.fontStyle::class)
	open var fontStyle: Any? by GenericEnumDelegate<CoreFontFamilyFontStyleable.FontStyleEnum>(CoreFontFamilyFontStyleable.FontStyleEnum::class)

	@DefinedBy(CoreFontFamilyFontStyleable.fontVariationSettings::class)
	open var fontVariationSettings: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontVariationSettings(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyFontStyleable.fontVariationSettings::class, init)

	@DefinedBy(CoreFontFamilyFontStyleable.fontWeight::class)
	open var fontWeight: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun fontWeight(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreFontFamilyFontStyleable.fontWeight::class, init)

	@DefinedBy(CoreFontFamilyFontStyleable.ttcIndex::class)
	open var ttcIndex: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun ttcIndex(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreFontFamilyFontStyleable.ttcIndex::class, init)

}

open class CoreFontFamilyStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreFontFamilyStyleable.fontProviderAuthority::class)
	open var fontProviderAuthority: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontProviderAuthority(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyStyleable.fontProviderAuthority::class, init)

	@DefinedBy(CoreFontFamilyStyleable.fontProviderCerts::class)
	open var fontProviderCerts: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontProviderCerts(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyStyleable.fontProviderCerts::class, init)

	@DefinedBy(CoreFontFamilyStyleable.fontProviderPackage::class)
	open var fontProviderPackage: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontProviderPackage(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyStyleable.fontProviderPackage::class, init)

	@DefinedBy(CoreFontFamilyStyleable.fontProviderQuery::class)
	open var fontProviderQuery: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontProviderQuery(init: StringAttribute.() -> Unit)
		= initAttr(CoreFontFamilyStyleable.fontProviderQuery::class, init)

}

open class CoreRecyclerViewStyle2 : CoreViewGroupStyle2 {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroupStyleable.descendantFocusability::class)
	open override var descendantFocusability: Any? by GenericEnumDelegate<CoreViewGroupStyleable.DescendantFocusabilityFlag>(CoreViewGroupStyleable.DescendantFocusabilityFlag::class)

	@DefinedBy(CoreRecyclerViewStyleable.layoutManager::class)
	open var layoutManager: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layoutManager(init: StringAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.layoutManager::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreRecyclerViewStyleable.reverseLayout::class)
	open var reverseLayout: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun reverseLayout(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.reverseLayout::class, init)

	@DefinedBy(CoreRecyclerViewStyleable.spanCount::class)
	open var spanCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun spanCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.spanCount::class, init)

	@DefinedBy(CoreRecyclerViewStyleable.stackFromEnd::class)
	open var stackFromEnd: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun stackFromEnd(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.stackFromEnd::class, init)

}

open class CoreNotificationThemeStyle2 : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreNotificationThemeStyleable.notificationHeaderAppNameVisibility::class)
	open var notificationHeaderAppNameVisibility: Any? by GenericEnumDelegate<CoreNotificationThemeStyleable.NotificationHeaderAppNameVisibilityEnum>(CoreNotificationThemeStyleable.NotificationHeaderAppNameVisibilityEnum::class)

	@DefinedBy(CoreNotificationThemeStyleable.notificationHeaderIconSize::class)
	open var notificationHeaderIconSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun notificationHeaderIconSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreNotificationThemeStyleable.notificationHeaderIconSize::class, init)

	@DefinedBy(CoreNotificationThemeStyleable.notificationHeaderStyle::class)
	open var notificationHeaderStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun notificationHeaderStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreNotificationThemeStyleable.notificationHeaderStyle::class, init)

	@DefinedBy(CoreNotificationThemeStyleable.notificationHeaderTextAppearance::class)
	open var notificationHeaderTextAppearance: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun notificationHeaderTextAppearance(init: StringAttribute.() -> Unit)
		= initAttr(CoreNotificationThemeStyleable.notificationHeaderTextAppearance::class, init)

}

fun <T : CoreThemeStyle2> T.extralarge(init: T.() -> Unit) {
    conditionalBag(ExtraLarge(), init)
}
fun <T : CoreThemeStyle2> T.version(version: Int, init: T.() -> Unit) {
    conditionalBag(PlatformVersion(version), init)
}
