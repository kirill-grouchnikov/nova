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
import dev.android.playground.nova.core.framework.themes.*

open class CoreStyle : BaseBag("style") {
    fun asReference(): StringContainer {
        return StringContainer("@style/" + this.myName)
    }

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

	@DefinedBy(CoreViewGroupStyleable.addStatesFromChildren::class)
	open var addStatesFromChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun addStatesFromChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.addStatesFromChildren::class, init)

	@DefinedBy(CoreStyleable.alignmentMode::class)
	open var alignmentMode: Any? by GenericEnumDelegate<AlignmentMode>(AlignmentMode::class)

	@DefinedBy(CoreSlidingDrawerStyleable.allowSingleTap::class)
	open var allowSingleTap: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowSingleTap(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.allowSingleTap::class, init)

	@DefinedBy(CoreButtonBarLayoutStyleable.allowStacking::class)
	open var allowStacking: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowStacking(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreButtonBarLayoutStyleable.allowStacking::class, init)

	@DefinedBy(CoreTextViewStyleable.allowUndo::class)
	open var allowUndo: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun allowUndo(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.allowUndo::class, init)

	@DefinedBy(CoreViewStyleable.alpha::class)
	open var alpha: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun alpha(init: FloatAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.alpha::class, init)

	@DefinedBy(CoreViewGroupStyleable.alwaysDrawnWithCache::class)
	open var alwaysDrawnWithCache: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun alwaysDrawnWithCache(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.alwaysDrawnWithCache::class, init)

	@DefinedBy(CoreViewAnimatorStyleable.animateFirstView::class)
	open var animateFirstView: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateFirstView(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.animateFirstView::class, init)

	@DefinedBy(CoreViewGroupStyleable.animateLayoutChanges::class)
	open var animateLayoutChanges: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateLayoutChanges(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.animateLayoutChanges::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.animateOnClick::class)
	open var animateOnClick: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animateOnClick(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.animateOnClick::class, init)

	@DefinedBy(CoreViewGroupStyleable.animationCache::class)
	open var animationCache: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun animationCache(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.animationCache::class, init)

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

	@DefinedBy(CoreViewFlipperStyleable.autoStart::class)
	open var autoStart: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoStart(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.autoStart::class, init)

	@DefinedBy(CoreTextViewStyleable.autoText::class)
	open var autoText: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun autoText(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.autoText::class, init)

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

	@DefinedBy(CoreLinearLayoutStyleable.baselineAligned::class)
	open var baselineAligned: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun baselineAligned(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.baselineAligned::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.baselineAlignedChildIndex::class)
	open var baselineAlignedChildIndex: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun baselineAlignedChildIndex(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.baselineAlignedChildIndex::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.bottomOffset::class)
	open var bottomOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun bottomOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.bottomOffset::class, init)

	@DefinedBy(CoreTextViewStyleable.breakStrategy::class)
	open var breakStrategy: Any? by GenericEnumDelegate<CoreTextViewStyleable.BreakStrategyEnum>(CoreTextViewStyleable.BreakStrategyEnum::class)

	@DefinedBy(CoreTextViewStyleable.bufferType::class)
	open var bufferType: Any? by GenericEnumDelegate<CoreTextViewStyleable.BufferTypeEnum>(CoreTextViewStyleable.BufferTypeEnum::class)

	@DefinedBy(CoreTextViewStyleable.capitalize::class)
	open var capitalize: Any? by GenericEnumDelegate<CoreTextViewStyleable.CapitalizeEnum>(CoreTextViewStyleable.CapitalizeEnum::class)

	@DefinedBy(CoreRadioGroupStyleable.checkedButton::class)
	open var checkedButton: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun checkedButton(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRadioGroupStyleable.checkedButton::class, init)

	@DefinedBy(CoreViewStyleable.clickable::class)
	open var clickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.clickable::class, init)

	@DefinedBy(CoreViewGroupStyleable.clipChildren::class)
	open var clipChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clipChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.clipChildren::class, init)

	@DefinedBy(CoreViewGroupStyleable.clipToPadding::class)
	open var clipToPadding: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun clipToPadding(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.clipToPadding::class, init)

	@DefinedBy(CoreTableLayoutStyleable.collapseColumns::class)
	open var collapseColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.collapseColumns::class, init)

	@DefinedBy(CoreGridLayoutStyleable.columnCount::class)
	open var columnCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun columnCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.columnCount::class, init)

	@DefinedBy(CoreGridLayoutStyleable.columnOrderPreserved::class)
	open var columnOrderPreserved: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun columnOrderPreserved(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.columnOrderPreserved::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.content::class)
	open var content: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun content(init: StringAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.content::class, init)

	@DefinedBy(CoreViewStyleable.contentDescription::class)
	open var contentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun contentDescription(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.contentDescription::class, init)

	@DefinedBy(CoreViewStyleable.contextClickable::class)
	open var contextClickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun contextClickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.contextClickable::class, init)

	@DefinedBy(CoreTextViewStyleable.cursorVisible::class)
	open var cursorVisible: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun cursorVisible(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.cursorVisible::class, init)

	@DefinedBy(CoreViewStyleable.defaultFocusHighlightEnabled::class)
	open var defaultFocusHighlightEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun defaultFocusHighlightEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.defaultFocusHighlightEnabled::class, init)

	@DefinedBy(CoreViewGroupStyleable.descendantFocusability::class)
	open var descendantFocusability: Any? by GenericEnumDelegate<CoreViewGroupStyleable.DescendantFocusabilityFlag>(CoreViewGroupStyleable.DescendantFocusabilityFlag::class)

	@DefinedBy(CoreTextViewStyleable.digits::class)
	open var digits: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun digits(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.digits::class, init)

	@DefinedBy(CoreListViewStyleable.divider::class)
	open var divider: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun divider(init: StringAttribute.() -> Unit)
		= initAttr(CoreListViewStyleable.divider::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.dividerPadding::class)
	open var dividerPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun dividerPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.dividerPadding::class, init)

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

	@DefinedBy(CoreViewStyleable.drawingCacheQuality::class)
	open var drawingCacheQuality: Any? by GenericEnumDelegate<CoreViewStyleable.DrawingCacheQualityEnum>(CoreViewStyleable.DrawingCacheQualityEnum::class)

	@DefinedBy(CoreViewStyleable.duplicateParentState::class)
	open var duplicateParentState: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun duplicateParentState(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.duplicateParentState::class, init)

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

	@DefinedBy(CoreViewStyleable.elevation::class)
	open var elevation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun elevation(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.elevation::class, init)

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

	@DefinedBy(CoreViewFlipperStyleable.flipInterval::class)
	open var flipInterval: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun flipInterval(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreViewFlipperStyleable.flipInterval::class, init)

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

	@DefinedBy(CoreStyleable.fontFamily::class)
	open var fontFamily: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFamily(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.fontFamily::class, init)

	@DefinedBy(CoreTextAppearanceStyleable.fontFeatureSettings::class)
	open var fontFeatureSettings: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun fontFeatureSettings(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextAppearanceStyleable.fontFeatureSettings::class, init)

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

	@DefinedBy(CoreTextClockStyleable.format12Hour::class)
	open var format12Hour: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun format12Hour(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.format12Hour::class, init)

	@DefinedBy(CoreTextClockStyleable.format24Hour::class)
	open var format24Hour: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun format24Hour(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.format24Hour::class, init)

	@DefinedBy(CoreTextViewStyleable.freezesText::class)
	open var freezesText: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun freezesText(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.freezesText::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(CoreSlidingDrawerStyleable.handle::class)
	open var handle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun handle(init: StringAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.handle::class, init)

	@DefinedBy(CoreViewStyleable.hapticFeedbackEnabled::class)
	open var hapticFeedbackEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun hapticFeedbackEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.hapticFeedbackEnabled::class, init)

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

	@DefinedBy(CoreViewStyleable.id::class)
	open var id: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun id(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.id::class, init)

	@DefinedBy(CoreRelativeLayoutStyleable.ignoreGravity::class)
	open var ignoreGravity: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun ignoreGravity(init: StringAttribute.() -> Unit)
		= initAttr(CoreRelativeLayoutStyleable.ignoreGravity::class, init)

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

	@DefinedBy(CoreViewStyleable.importantForAccessibility::class)
	open var importantForAccessibility: Any? by GenericEnumDelegate<CoreViewStyleable.ImportantForAccessibilityEnum>(CoreViewStyleable.ImportantForAccessibilityEnum::class)

	@DefinedBy(CoreViewStyleable.importantForAutofill::class)
	open var importantForAutofill: Any? by GenericFlagDelegate<CoreViewStyleable.ImportantForAutofillFlag>(CoreViewStyleable.ImportantForAutofillFlag::class)

	@DefinedBy(CoreViewAnimatorStyleable.inAnimation::class)
	open var inAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun inAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.inAnimation::class, init)

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

	@DefinedBy(CoreViewStyleable.isScrollContainer::class)
	open var isScrollContainer: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun isScrollContainer(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.isScrollContainer::class, init)

	@DefinedBy(CoreTextViewStyleable.justificationMode::class)
	open var justificationMode: Any? by GenericEnumDelegate<CoreTextViewStyleable.JustificationModeEnum>(CoreTextViewStyleable.JustificationModeEnum::class)

	@DefinedBy(CoreViewStyleable.keepScreenOn::class)
	open var keepScreenOn: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun keepScreenOn(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.keepScreenOn::class, init)

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

	@DefinedBy(CoreViewStyleable.keyboardNavigationCluster::class)
	open var keyboardNavigationCluster: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun keyboardNavigationCluster(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.keyboardNavigationCluster::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.keyboardViewStyle::class)
	open var keyboardViewStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun keyboardViewStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.keyboardViewStyle::class, init)

	@DefinedBy(CoreViewStyleable.labelFor::class)
	open var labelFor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun labelFor(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.labelFor::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.labelTextSize::class)
	open var labelTextSize: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun labelTextSize(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.labelTextSize::class, init)

	@DefinedBy(CoreViewStyleable.layerType::class)
	open var layerType: Any? by GenericEnumDelegate<CoreViewStyleable.LayerTypeEnum>(CoreViewStyleable.LayerTypeEnum::class)

	@DefinedBy(CoreViewGroupStyleable.layoutAnimation::class)
	open var layoutAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layoutAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.layoutAnimation::class, init)

	@DefinedBy(CoreViewStyleable.layoutDirection::class)
	open var layoutDirection: Any? by GenericEnumDelegate<CoreViewStyleable.LayoutDirectionEnum>(CoreViewStyleable.LayoutDirectionEnum::class)

	@DefinedBy(CoreRecyclerViewStyleable.layoutManager::class)
	open var layoutManager: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun layoutManager(init: StringAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.layoutManager::class, init)

	@DefinedBy(CoreViewGroupStyleable.layoutMode::class)
	open var layoutMode: Any? by GenericEnumDelegate<CoreViewGroupStyleable.LayoutModeFlag>(CoreViewGroupStyleable.LayoutModeFlag::class)

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

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_alwaysShow::class)
	open var layout_alwaysShow: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_alwaysShow(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_alwaysShow::class, init)

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

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_hasNestedScrollIndicator::class)
	open var layout_hasNestedScrollIndicator: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_hasNestedScrollIndicator(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_hasNestedScrollIndicator::class, init)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)
	open fun layout_height(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_height::class, init)

	@DefinedBy(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_ignoreOffset::class)
	open var layout_ignoreOffset: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun layout_ignoreOffset(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayout_LayoutParamsStyleable.layout_ignoreOffset::class, init)

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

	@DefinedBy(CoreLinearLayout_LayoutStyleable.layout_weight::class)
	open var layout_weight: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun layout_weight(init: FloatAttribute.() -> Unit)
		= initAttr(CoreLinearLayout_LayoutStyleable.layout_weight::class, init)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
	open var layout_width: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutWidthEnum>(CoreViewGroup_LayoutStyleable.LayoutWidthEnum::class, Dimension::class, DimensionContainer::class)
	open fun layout_width(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_width::class, init)

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

	@DefinedBy(CoreViewStyleable.longClickable::class)
	open var longClickable: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun longClickable(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.longClickable::class, init)

	@DefinedBy(CoreAdapterViewAnimatorStyleable.loopViews::class)
	open var loopViews: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun loopViews(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreAdapterViewAnimatorStyleable.loopViews::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.majorWeightMax::class)
	open var majorWeightMax: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun majorWeightMax(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.majorWeightMax::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.majorWeightMin::class)
	open var majorWeightMin: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun majorWeightMin(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.majorWeightMin::class, init)

	@DefinedBy(CoreTextViewStyleable.marqueeRepeatLimit::class)
	open var marqueeRepeatLimit: Any? by GenericEnumDelegate<CoreTextViewStyleable.MarqueeRepeatLimitEnum>(CoreTextViewStyleable.MarqueeRepeatLimitEnum::class, Int::class, IntegerContainer::class)

	@DefinedBy(CoreResolverDrawerLayoutStyleable.maxCollapsedHeight::class)
	open var maxCollapsedHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxCollapsedHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.maxCollapsedHeight::class, init)

	@DefinedBy(CoreResolverDrawerLayoutStyleable.maxCollapsedHeightSmall::class)
	open var maxCollapsedHeightSmall: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxCollapsedHeightSmall(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.maxCollapsedHeightSmall::class, init)

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

	@DefinedBy(CoreFrameLayoutStyleable.measureAllChildren::class)
	open var measureAllChildren: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun measureAllChildren(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreFrameLayoutStyleable.measureAllChildren::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.measureWithLargestChild::class)
	open var measureWithLargestChild: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun measureWithLargestChild(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.measureWithLargestChild::class, init)

	@DefinedBy(CoreTextViewStyleable.minEms::class)
	open var minEms: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun minEms(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.minEms::class, init)

	@DefinedBy(CoreProgressBarStyleable.minHeight::class)
	open var minHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minHeight::class, init)

	@DefinedBy(CoreTextViewStyleable.minLines::class)
	open var minLines: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun minLines(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.minLines::class, init)

	@DefinedBy(CoreProgressBarStyleable.minWidth::class)
	open var minWidth: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun minWidth(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreProgressBarStyleable.minWidth::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.minorWeightMax::class)
	open var minorWeightMax: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minorWeightMax(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.minorWeightMax::class, init)

	@DefinedBy(CoreWeightedLinearLayoutStyleable.minorWeightMin::class)
	open var minorWeightMin: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun minorWeightMin(init: FloatAttribute.() -> Unit)
		= initAttr(CoreWeightedLinearLayoutStyleable.minorWeightMin::class, init)

	@DefinedBy(CoreTwoLineListItemStyleable.mode::class)
	open var mode: Any? by GenericEnumDelegate<CoreTwoLineListItemStyleable.ModeEnum>(CoreTwoLineListItemStyleable.ModeEnum::class)

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

	@DefinedBy(CoreTextViewStyleable.numeric::class)
	open var numeric: Any? by GenericFlagDelegate<CoreTextViewStyleable.NumericFlag>(CoreTextViewStyleable.NumericFlag::class)

	@DefinedBy(CoreViewStyleable.onClick::class)
	open var onClick: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun onClick(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.onClick::class, init)

	@DefinedBy(CoreStyleable.orientation::class)
	open var orientation: Any? by GenericEnumDelegate<Orientation>(Orientation::class)

	@DefinedBy(CoreViewAnimatorStyleable.outAnimation::class)
	open var outAnimation: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun outAnimation(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewAnimatorStyleable.outAnimation::class, init)

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

	@DefinedBy(CoreTextViewStyleable.password::class)
	open var password: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun password(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.password::class, init)

	@DefinedBy(CoreViewGroupStyleable.persistentDrawingCache::class)
	open var persistentDrawingCache: Any? by GenericFlagDelegate<CoreViewGroupStyleable.PersistentDrawingCacheFlag>(CoreViewGroupStyleable.PersistentDrawingCacheFlag::class)

	@DefinedBy(CoreTextViewStyleable.phoneNumber::class)
	open var phoneNumber: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun phoneNumber(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.phoneNumber::class, init)

	@DefinedBy(CoreViewStyleable.pointerIcon::class)
	open var pointerIcon: Any? by GenericEnumDelegate<CoreViewStyleable.PointerIconEnum>(CoreViewStyleable.PointerIconEnum::class)

	@DefinedBy(CoreKeyboardViewStyleable.popupLayout::class)
	open var popupLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun popupLayout(init: StringAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.popupLayout::class, init)

	@DefinedBy(CoreTextViewStyleable.privateImeOptions::class)
	open var privateImeOptions: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun privateImeOptions(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.privateImeOptions::class, init)

	@DefinedBy(CoreViewStyleable.requiresFadingEdge::class)
	open var requiresFadingEdge: Any? by GenericFlagDelegate<CoreViewStyleable.RequiresFadingEdgeFlag>(CoreViewStyleable.RequiresFadingEdgeFlag::class)

	@DefinedBy(CoreRecyclerViewStyleable.reverseLayout::class)
	open var reverseLayout: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun reverseLayout(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.reverseLayout::class, init)

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

	@DefinedBy(CoreGridLayoutStyleable.rowCount::class)
	open var rowCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun rowCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.rowCount::class, init)

	@DefinedBy(CoreGridLayoutStyleable.rowOrderPreserved::class)
	open var rowOrderPreserved: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun rowOrderPreserved(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.rowOrderPreserved::class, init)

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

	@DefinedBy(CoreTextViewStyleable.scrollHorizontally::class)
	open var scrollHorizontally: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun scrollHorizontally(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.scrollHorizontally::class, init)

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

	@DefinedBy(CoreResolverDrawerLayoutStyleable.showAtTop::class)
	open var showAtTop: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showAtTop(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreResolverDrawerLayoutStyleable.showAtTop::class, init)

	@DefinedBy(CoreLinearLayoutStyleable.showDividers::class)
	open var showDividers: Any? by GenericFlagDelegate<CoreLinearLayoutStyleable.ShowDividersFlag>(CoreLinearLayoutStyleable.ShowDividersFlag::class)

	@DefinedBy(CoreDateTimeViewStyleable.showRelative::class)
	open var showRelative: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun showRelative(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreDateTimeViewStyleable.showRelative::class, init)

	@DefinedBy(CoreTableLayoutStyleable.shrinkColumns::class)
	open var shrinkColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun shrinkColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.shrinkColumns::class, init)

	@DefinedBy(CoreTextViewStyleable.singleLine::class)
	open var singleLine: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun singleLine(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.singleLine::class, init)

	@DefinedBy(CoreViewStyleable.soundEffectsEnabled::class)
	open var soundEffectsEnabled: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun soundEffectsEnabled(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.soundEffectsEnabled::class, init)

	@DefinedBy(CoreGalleryStyleable.spacing::class)
	open var spacing: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun spacing(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreGalleryStyleable.spacing::class, init)

	@DefinedBy(CoreRecyclerViewStyleable.spanCount::class)
	open var spanCount: Any? by GenericDelegate(Int::class,IntegerContainer::class)
	open fun spanCount(init: IntegerAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.spanCount::class, init)

	@DefinedBy(CoreViewGroupStyleable.splitMotionEvents::class)
	open var splitMotionEvents: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun splitMotionEvents(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.splitMotionEvents::class, init)

	@DefinedBy(CoreRecyclerViewStyleable.stackFromEnd::class)
	open var stackFromEnd: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun stackFromEnd(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreRecyclerViewStyleable.stackFromEnd::class, init)

	@DefinedBy(CoreViewStyleable.stateListAnimator::class)
	open var stateListAnimator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun stateListAnimator(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.stateListAnimator::class, init)

	@DefinedBy(CoreTableLayoutStyleable.stretchColumns::class)
	open var stretchColumns: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun stretchColumns(init: StringAttribute.() -> Unit)
		= initAttr(CoreTableLayoutStyleable.stretchColumns::class, init)

	@DefinedBy(CoreViewStyleable.tag::class)
	open var tag: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tag(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.tag::class, init)

	@DefinedBy(CoreTextViewStyleable.text::class)
	open var text: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun text(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.text::class, init)

	@DefinedBy(CoreViewStyleable.textAlignment::class)
	open var textAlignment: Any? by GenericEnumDelegate<CoreViewStyleable.TextAlignmentEnum>(CoreViewStyleable.TextAlignmentEnum::class)

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

	@DefinedBy(CoreStyleable.textCursorDrawable::class)
	open var textCursorDrawable: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textCursorDrawable(init: StringAttribute.() -> Unit)
		= initAttr(CoreStyleable.textCursorDrawable::class, init)

	@DefinedBy(CoreViewStyleable.textDirection::class)
	open var textDirection: Any? by GenericEnumDelegate<CoreViewStyleable.TextDirectionEnum>(CoreViewStyleable.TextDirectionEnum::class)

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

	@DefinedBy(CoreThemeStyleable.textEditSuggestionHighlightStyle::class)
	open var textEditSuggestionHighlightStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun textEditSuggestionHighlightStyle(init: StringAttribute.() -> Unit)
		= initAttr(CoreThemeStyleable.textEditSuggestionHighlightStyle::class, init)

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

	@DefinedBy(ManifestStyleable.theme::class)
	open var theme: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun theme(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.theme::class, init)

	@DefinedBy(CoreTextClockStyleable.timeZone::class)
	open var timeZone: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun timeZone(init: StringAttribute.() -> Unit)
		= initAttr(CoreTextClockStyleable.timeZone::class, init)

	@DefinedBy(CoreViewStyleable.tooltipText::class)
	open var tooltipText: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun tooltipText(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.tooltipText::class, init)

	@DefinedBy(CoreSlidingDrawerStyleable.topOffset::class)
	open var topOffset: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun topOffset(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreSlidingDrawerStyleable.topOffset::class, init)

	@DefinedBy(CoreViewGroupStyleable.touchscreenBlocksFocus::class)
	open var touchscreenBlocksFocus: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun touchscreenBlocksFocus(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.touchscreenBlocksFocus::class, init)

	@DefinedBy(CoreViewStyleable.transformPivotX::class)
	open var transformPivotX: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun transformPivotX(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.transformPivotX::class, init)

	@DefinedBy(CoreViewStyleable.transformPivotY::class)
	open var transformPivotY: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun transformPivotY(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.transformPivotY::class, init)

	@DefinedBy(CoreViewGroupStyleable.transitionGroup::class)
	open var transitionGroup: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun transitionGroup(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreViewGroupStyleable.transitionGroup::class, init)

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

	@DefinedBy(CoreStyleable.typeface::class)
	open var typeface: Any? by GenericEnumDelegate<Typeface>(Typeface::class)

	@DefinedBy(CoreGridLayoutStyleable.useDefaultMargins::class)
	open var useDefaultMargins: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun useDefaultMargins(init: BooleanAttribute.() -> Unit)
		= initAttr(CoreGridLayoutStyleable.useDefaultMargins::class, init)

	@DefinedBy(CoreKeyboardViewStyleable.verticalCorrection::class)
	open var verticalCorrection: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun verticalCorrection(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreKeyboardViewStyleable.verticalCorrection::class, init)

	@DefinedBy(CoreViewStyleable.verticalScrollbarPosition::class)
	open var verticalScrollbarPosition: Any? by GenericEnumDelegate<CoreViewStyleable.VerticalScrollbarPositionEnum>(CoreViewStyleable.VerticalScrollbarPositionEnum::class)

	@DefinedBy(CoreViewStyleable.visibility::class)
	open var visibility: Any? by GenericEnumDelegate<CoreViewStyleable.VisibilityEnum>(CoreViewStyleable.VisibilityEnum::class)

	@DefinedBy(CoreLinearLayoutStyleable.weightSum::class)
	open var weightSum: Any? by GenericDelegate(Float::class,FloatContainer::class)
	open fun weightSum(init: FloatAttribute.() -> Unit)
		= initAttr(CoreLinearLayoutStyleable.weightSum::class, init)

	@DefinedBy(CoreTextViewStyleable.width::class)
	open var width: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun width(init: DimensionAttribute.() -> Unit)
		= initAttr(CoreTextViewStyleable.width::class, init)

}

fun style(name: String, parentName: String? = null, parentStyle: CoreStyle? = null,
        init: CoreStyle.() -> Unit): CoreStyle {
    initializeCoreDictionary()
    val style = CoreStyle()
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
