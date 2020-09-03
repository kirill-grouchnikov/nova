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
package dev.android.playground.nova.appcompat.generated

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.*
import dev.android.playground.nova.core.framework.styleables.*
import dev.android.playground.nova.appcompat.styleables.*
import dev.android.playground.nova.core.framework.generated.*

open class AppCompatBaseStyle : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(AppCompatBaseStyleable.homeAsUpIndicator::class)
	open var homeAsUpIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeAsUpIndicator(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatBaseStyleable.homeAsUpIndicator::class, init)

	@DefinedBy(AppCompatBaseStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatBaseStyleable.title::class, init)

}

open class AppCompatActionModeStyle : InlineStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.background::class)
	open var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(CoreActionBarStyleable.backgroundSplit::class)
	open var backgroundSplit: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundSplit(init: StringAttribute.() -> Unit)
		= initAttr(CoreActionBarStyleable.backgroundSplit::class, init)

	@DefinedBy(AppCompatActionModeStyleable.closeItemLayout::class)
	open var closeItemLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun closeItemLayout(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionModeStyleable.closeItemLayout::class, init)

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

open class AppCompatActionBarStyle : CoreViewGroupStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewStyleable.background::class)
	open override var background: Any? by GenericDelegate(String::class,StringContainer::class)
	open override fun background(init: StringAttribute.() -> Unit)
		= initAttr(CoreViewStyleable.background::class, init)

	@DefinedBy(AppCompatActionBarStyleable.backgroundSplit::class)
	open var backgroundSplit: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundSplit(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.backgroundSplit::class, init)

	@DefinedBy(AppCompatActionBarStyleable.backgroundStacked::class)
	open var backgroundStacked: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun backgroundStacked(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.backgroundStacked::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetEnd::class)
	open var contentInsetEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetEnd::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetEndWithActions::class)
	open var contentInsetEndWithActions: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEndWithActions(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetEndWithActions::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetLeft::class)
	open var contentInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetLeft::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetRight::class)
	open var contentInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetRight::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetStart::class)
	open var contentInsetStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStart(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetStart::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetStartWithNavigation::class)
	open var contentInsetStartWithNavigation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStartWithNavigation(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetStartWithNavigation::class, init)

	@DefinedBy(AppCompatActionBarStyleable.customNavigationLayout::class)
	open var customNavigationLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun customNavigationLayout(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.customNavigationLayout::class, init)

	@DefinedBy(AppCompatActionBarStyleable.displayOptions::class)
	open var displayOptions: Any? by GenericFlagDelegate<AppCompatActionBarStyleable.DisplayOptionsFlag>(AppCompatActionBarStyleable.DisplayOptionsFlag::class)

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

	@DefinedBy(AppCompatActionBarStyleable.hideOnContentScroll::class)
	open var hideOnContentScroll: Any? by GenericDelegate(Boolean::class,BooleanContainer::class)
	open fun hideOnContentScroll(init: BooleanAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.hideOnContentScroll::class, init)

	@DefinedBy(AppCompatBaseStyleable.homeAsUpIndicator::class)
	open var homeAsUpIndicator: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeAsUpIndicator(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatBaseStyleable.homeAsUpIndicator::class, init)

	@DefinedBy(AppCompatActionBarStyleable.homeLayout::class)
	open var homeLayout: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun homeLayout(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.homeLayout::class, init)

	@DefinedBy(ManifestStyleable.icon::class)
	open var icon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun icon(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.icon::class, init)

	@DefinedBy(AppCompatActionBarStyleable.indeterminateProgressStyle::class)
	open var indeterminateProgressStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun indeterminateProgressStyle(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.indeterminateProgressStyle::class, init)

	@DefinedBy(AppCompatActionBarStyleable.itemPadding::class)
	open var itemPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun itemPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.itemPadding::class, init)

	@DefinedBy(ManifestStyleable.logo::class)
	open var logo: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logo(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.logo::class, init)

	@DefinedBy(AppCompatActionBarStyleable.navigationMode::class)
	open var navigationMode: Any? by GenericEnumDelegate<AppCompatActionBarStyleable.NavigationModeEnum>(AppCompatActionBarStyleable.NavigationModeEnum::class)

	@DefinedBy(CoreToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle.() -> Unit)
		= initInlineStyle(CoreThemeStyle(), "popupTheme", init)

	@DefinedBy(AppCompatActionBarStyleable.progressBarPadding::class)
	open var progressBarPadding: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun progressBarPadding(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.progressBarPadding::class, init)

	@DefinedBy(CoreThemeStyleable.progressBarStyle::class)
	open var progressBarStyle: CoreProgressBarStyle? by InlineStyleDelegate()
	open fun progressBarStyle(init: CoreProgressBarStyle.() -> Unit)
		= initInlineStyle(CoreProgressBarStyle(), "progressBarStyle", init)

	@DefinedBy(AppCompatActionBarStyleable.subtitle::class)
	open var subtitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitle(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.subtitle::class, init)

	@DefinedBy(AppCompatActionBarStyleable.subtitleTextStyle::class)
	open var subtitleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.subtitleTextStyle::class, init)

	@DefinedBy(AppCompatBaseStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatBaseStyleable.title::class, init)

	@DefinedBy(AppCompatActionBarStyleable.titleTextStyle::class)
	open var titleTextStyle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleTextStyle(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.titleTextStyle::class, init)

}

open class CoreProgressBarStyle : CoreViewStyle {
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

open class CoreViewStyle : CoreWidgetStyle {
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

open class CoreWidgetStyle : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

}

open class CoreViewGroupStyle : CoreViewStyle {
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

open class CoreViewGroup_LayoutStyle : InlineStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)
	open fun layout_height(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_height::class, init)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
	open var layout_width: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutWidthEnum>(CoreViewGroup_LayoutStyleable.LayoutWidthEnum::class, Dimension::class, DimensionContainer::class)
	open fun layout_width(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_width::class, init)

}

open class AppCompatActionBar_LayoutParamsStyle : CoreViewGroup_MarginLayoutStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

open class CoreViewGroup_MarginLayoutStyle : CoreViewGroup_LayoutStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
	open override var layout_height: Any? by GenericEnumDelegate<CoreViewGroup_LayoutStyleable.LayoutHeightEnum>(CoreViewGroup_LayoutStyleable.LayoutHeightEnum::class, Dimension::class, DimensionContainer::class)
	open override fun layout_height(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_height::class, init)

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
	open override fun layout_width(init: StyleableEnumAndDimensionAttribute.() -> Unit)
		= initAttr(CoreViewGroup_LayoutStyleable.layout_width::class, init)

}

open class AppCompatToolbarStyle : CoreViewGroupStyle {
	constructor() : super("style")
	constructor(name : String) : super(name)

	@DefinedBy(AppCompatToolbarStyleable.buttonGravity::class)
	open var buttonGravity: Any? by GenericFlagDelegate<AppCompatToolbarStyleable.ButtonGravityFlag>(AppCompatToolbarStyleable.ButtonGravityFlag::class)

	@DefinedBy(AppCompatToolbarStyleable.collapseContentDescription::class)
	open var collapseContentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseContentDescription(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.collapseContentDescription::class, init)

	@DefinedBy(AppCompatToolbarStyleable.collapseIcon::class)
	open var collapseIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun collapseIcon(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.collapseIcon::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetEnd::class)
	open var contentInsetEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetEnd::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetEndWithActions::class)
	open var contentInsetEndWithActions: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetEndWithActions(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetEndWithActions::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetLeft::class)
	open var contentInsetLeft: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetLeft(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetLeft::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetRight::class)
	open var contentInsetRight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetRight(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetRight::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetStart::class)
	open var contentInsetStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStart(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetStart::class, init)

	@DefinedBy(AppCompatActionBarStyleable.contentInsetStartWithNavigation::class)
	open var contentInsetStartWithNavigation: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun contentInsetStartWithNavigation(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.contentInsetStartWithNavigation::class, init)

	@DefinedBy(CoreStyleable.gravity::class)
	open var gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

	@DefinedBy(ManifestStyleable.logo::class)
	open var logo: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logo(init: StringAttribute.() -> Unit)
		= initAttr(ManifestStyleable.logo::class, init)

	@DefinedBy(AppCompatToolbarStyleable.logoDescription::class)
	open var logoDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun logoDescription(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.logoDescription::class, init)

	@DefinedBy(AppCompatToolbarStyleable.maxButtonHeight::class)
	open var maxButtonHeight: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun maxButtonHeight(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.maxButtonHeight::class, init)

	@DefinedBy(AppCompatToolbarStyleable.navigationContentDescription::class)
	open var navigationContentDescription: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationContentDescription(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.navigationContentDescription::class, init)

	@DefinedBy(AppCompatToolbarStyleable.navigationIcon::class)
	open var navigationIcon: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun navigationIcon(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.navigationIcon::class, init)

	@DefinedBy(AppCompatToolbarStyleable.popupTheme::class)
	open var popupTheme: CoreThemeStyle? by InlineStyleDelegate()
	open fun popupTheme(init: CoreThemeStyle.() -> Unit)
		= initInlineStyle(CoreThemeStyle(), "popupTheme", init)

	@DefinedBy(AppCompatActionBarStyleable.subtitle::class)
	open var subtitle: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitle(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatActionBarStyleable.subtitle::class, init)

	@DefinedBy(AppCompatToolbarStyleable.subtitleTextAppearance::class)
	open var subtitleTextAppearance: CoreTextAppearanceStyle? by InlineStyleDelegate()
	open fun subtitleTextAppearance(init: CoreTextAppearanceStyle.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle(), "subtitleTextAppearance", init)

	@DefinedBy(AppCompatToolbarStyleable.subtitleTextColor::class)
	open var subtitleTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun subtitleTextColor(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.subtitleTextColor::class, init)

	@DefinedBy(AppCompatBaseStyleable.title::class)
	open var title: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun title(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatBaseStyleable.title::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleMargin::class)
	open var titleMargin: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMargin(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleMargin::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleMarginBottom::class)
	open var titleMarginBottom: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginBottom(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleMarginBottom::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleMarginEnd::class)
	open var titleMarginEnd: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginEnd(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleMarginEnd::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleMarginStart::class)
	open var titleMarginStart: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginStart(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleMarginStart::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleMarginTop::class)
	open var titleMarginTop: Any? by GenericDelegate(Dimension::class,DimensionContainer::class)
	open fun titleMarginTop(init: DimensionAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleMarginTop::class, init)

	@DefinedBy(AppCompatToolbarStyleable.titleTextAppearance::class)
	open var titleTextAppearance: CoreTextAppearanceStyle? by InlineStyleDelegate()
	open fun titleTextAppearance(init: CoreTextAppearanceStyle.() -> Unit)
		= initInlineStyle(CoreTextAppearanceStyle(), "titleTextAppearance", init)

	@DefinedBy(AppCompatToolbarStyleable.titleTextColor::class)
	open var titleTextColor: Any? by GenericDelegate(String::class,StringContainer::class)
	open fun titleTextColor(init: StringAttribute.() -> Unit)
		= initAttr(AppCompatToolbarStyleable.titleTextColor::class, init)

}

open class CoreTextAppearanceStyle : InlineStyle {
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

open class AppCompatToolbar_LayoutParamsStyle : AppCompatActionBar_LayoutParamsStyle {
	constructor() : super("")
	constructor(name : String) : super(name)

	@DefinedBy(CoreStyleable.gravity::class)
	open override var layout_gravity: Any? by GenericFlagDelegate<Gravity>(Gravity::class)

}

fun <T : CoreThemeStyle> T.extralarge(init: T.() -> Unit) {
    conditionalBag(ExtraLarge(), init)
}
fun <T : CoreThemeStyle> T.version(version: Int, init: T.() -> Unit) {
    conditionalBag(PlatformVersion(version), init)
}
