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
package dev.android.playground.nova.core.framework.manual

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.Gravity
import dev.android.playground.nova.core.framework.Orientation
import dev.android.playground.nova.core.framework.TextStyle
import dev.android.playground.nova.core.framework.Typeface
import dev.android.playground.nova.core.framework.styleables.*

@UseAndroidNamespace
open class CoreActionModeStyle : InlineStyle("actionModeStyle") {
    @DefinedBy(CoreActionModeStyleable.titleTextStyle::class)
    open var titleTextStyle: TextAppearance? by InlineStyleDelegate()
    open fun titleTextStyle(init: TextAppearance.() -> Unit) =
            initInlineStyle(TextAppearance(), "titleTextStyle", init)

    @DefinedBy(CoreActionModeStyleable.subtitleTextStyle::class)
    open var subtitleTextStyle: TextAppearance? by InlineStyleDelegate()
    open fun subtitleTextStyle(init: TextAppearance.() -> Unit) =
            initInlineStyle(TextAppearance(), "subtitleTextStyle", init)

    @DefinedBy(CoreActionModeStyleable.background::class)
    open var background: StringContainer? by StringValueDelegate()
    open fun background(init: ColorAttribute.() -> Unit) =
            initAttr(CoreActionModeStyleable.background::class, init)

    @DefinedBy(CoreActionModeStyleable.backgroundSplit::class)
    open var backgroundSplit: StringContainer? by StringValueDelegate()
    open fun backgroundSplit(init: ColorAttribute.() -> Unit) =
            initAttr(CoreActionModeStyleable.backgroundSplit::class, init)

    @DefinedBy(CoreActionModeStyleable.height::class)
    open var height: Dimension? by DimensionValueDelegate()
    open fun height(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreActionModeStyleable.height::class, init)

    @DefinedBy(CoreActionModeStyleable.closeItemLayout::class)
    open var closeItemLayout: StringContainer? by StringValueDelegate()
    open fun closeItemLayout(init: LayoutAttribute.() -> Unit) =
            initAttr(CoreActionModeStyleable.closeItemLayout::class, init)

}

@UseAndroidNamespace
open class CoreToolbarStyle : InlineStyle("toolbarStyle") {
    @DefinedBy(TextAppearance::class)
    open var titleTextAppearance: TextAppearance? by InlineStyleDelegate()
    open fun titleTextAppearance(init: TextAppearance.() -> Unit)
            = initInlineStyle(TextAppearance(), "titleTextAppearance", init)

    @DefinedBy(TextAppearance::class)
    open var subtitleTextAppearance: TextAppearance? by InlineStyleDelegate()
    open fun subtitleTextAppearance(init: TextAppearance.() -> Unit)
            = initInlineStyle(TextAppearance(), "subtitleTextAppearance", init)

    @DefinedBy(CoreToolbarStyleable.title::class)
    open var title: StringContainer? by StringValueDelegate()
    open fun title(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.title::class, init)

    @DefinedBy(CoreToolbarStyleable.subtitle::class)
    open var subtitle: StringContainer? by StringValueDelegate()
    open fun subtitle(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.subtitle::class, init)

    @DefinedBy(CoreToolbarStyleable.gravity::class)
    var gravity: List<Enum<Gravity>>? by StyleableFlagDelegate()

    @DefinedBy(CoreToolbarStyleable.titleMargin::class)
    open var titleMargin: Dimension? by DimensionValueDelegate()
    open fun titleMargin(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleMargin::class, init)

    @DefinedBy(CoreToolbarStyleable.titleMarginStart::class)
    open var titleMarginStart: Dimension? by DimensionValueDelegate()
    open fun titleMarginStart(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleMarginStart::class, init)

    @DefinedBy(CoreToolbarStyleable.titleMarginEnd::class)
    open var titleMarginEnd: Dimension? by DimensionValueDelegate()
    open fun titleMarginEnd(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleMarginEnd::class, init)

    @DefinedBy(CoreToolbarStyleable.titleMarginTop::class)
    open var titleMarginTop: Dimension? by DimensionValueDelegate()
    open fun titleMarginTop(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleMarginTop::class, init)

    @DefinedBy(CoreToolbarStyleable.titleMarginBottom::class)
    open var titleMarginBottom: Dimension? by DimensionValueDelegate()
    open fun titleMarginBottom(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleMarginBottom::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetStart::class)
    open var contentInsetStart: Dimension? by DimensionValueDelegate()
    open fun contentInsetStart(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetStart::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetEnd::class)
    open var contentInsetEnd: Dimension? by DimensionValueDelegate()
    open fun contentInsetEnd(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetEnd::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetLeft::class)
    open var contentInsetLeft: Dimension? by DimensionValueDelegate()
    open fun contentInsetLeft(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetLeft::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetRight::class)
    open var contentInsetRight: Dimension? by DimensionValueDelegate()
    open fun contentInsetRight(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetRight::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetStartWithNavigation::class)
    open var contentInsetStartWithNavigation: Dimension? by DimensionValueDelegate()
    open fun contentInsetStartWithNavigation(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetStartWithNavigation::class, init)

    @DefinedBy(CoreToolbarStyleable.contentInsetEndWithActions::class)
    open var contentInsetEndWithActions: Dimension? by DimensionValueDelegate()
    open fun contentInsetEndWithActions(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.contentInsetEndWithActions::class, init)

    @DefinedBy(CoreToolbarStyleable.maxButtonHeight::class)
    open var maxButtonHeight: Dimension? by DimensionValueDelegate()
    open fun maxButtonHeight(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.maxButtonHeight::class, init)

    @DefinedBy(CoreToolbarStyleable.buttonGravity::class)
    var buttonGravity: List<Enum<CoreToolbarStyleable.ButtonGravityFlag>>? by StyleableFlagDelegate()

    @DefinedBy(CoreToolbarStyleable.collapseIcon::class)
    open var collapseIcon: StringContainer? by StringValueDelegate()
    open fun collapseIcon(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.collapseIcon::class, init)

    @DefinedBy(CoreToolbarStyleable.collapseContentDescription::class)
    open var collapseContentDescription: StringContainer? by StringValueDelegate()
    open fun collapseContentDescription(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.collapseContentDescription::class, init)

    @DefinedBy(CoreToolbarStyleable.popupTheme::class)
    open var popupTheme: StringContainer? by StringValueDelegate()
    open fun popupTheme(init: ThemeAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.popupTheme::class, init)

    @DefinedBy(CoreToolbarStyleable.navigationIcon::class)
    open var navigationIcon: StringContainer? by StringValueDelegate()
    open fun navigationIcon(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.navigationIcon::class, init)

    @DefinedBy(CoreToolbarStyleable.navigationContentDescription::class)
    open var navigationContentDescription: StringContainer? by StringValueDelegate()
    open fun navigationContentDescription(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.navigationContentDescription::class, init)

    @DefinedBy(CoreToolbarStyleable.logo::class)
    open var logo: StringContainer? by StringValueDelegate()
    open fun logo(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.logo::class, init)

    @DefinedBy(CoreToolbarStyleable.logoDescription::class)
    open var logoDescription: StringContainer? by StringValueDelegate()
    open fun logoDescription(init: StringAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.logoDescription::class, init)

    @DefinedBy(CoreToolbarStyleable.titleTextColor::class)
    open var titleTextColor: StringContainer? by StringValueDelegate()
    open fun titleTextColor(init: ColorAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.titleTextColor::class, init)

    @DefinedBy(CoreToolbarStyleable.subtitleTextColor::class)
    open var subtitleTextColor: StringContainer? by StringValueDelegate()
    open fun subtitleTextColor(init: ColorAttribute.() -> Unit) =
            initAttr(CoreToolbarStyleable.subtitleTextColor::class, init)

    @DefinedBy(CoreViewStyleable.background::class)
    open var background: StringContainer? by StringValueDelegate()
    open fun background(init: ColorAttribute.() -> Unit) =
            initAttr(CoreViewStyleable.background::class, init)

}

@UseAndroidNamespace
class TextAppearance : InlineStyle("") {
    @DefinedBy(CoreTextAppearanceStyleable.textColor::class)
    var textColor: StringContainer? by StringValueDelegate()
    fun textColor(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textColor::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textSize::class)
    var textSize: Dimension? by DimensionValueDelegate()
    fun textSize(init: DimensionAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textSize::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textStyle::class)
    var textStyle: List<Enum<TextStyle>>? by StyleableFlagDelegate()

    @DefinedBy(Typeface::class)
    var typeface: Typeface? by StyleableEnumDelegate()

    @DefinedBy(CoreTextAppearanceStyleable.fontFamily::class)
    var fontFamily: StringContainer? by StringValueDelegate()
    fun fontFamily(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.fontFamily::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textColorHighlight::class)
    var textColorHighlight: StringContainer? by StringValueDelegate()
    fun textColorHighlight(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textColorHighlight::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textColorHint::class)
    var textColorHint: StringContainer? by StringValueDelegate()
    fun textColorHint(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textColorHint::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textColorLink::class)
    var textColorLink: StringContainer? by StringValueDelegate()
    fun textColorLink(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textColorLink::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.textAllCaps::class)
    var textAllCaps: Boolean? by BooleanDelegate()
    fun textAllCaps(init: BooleanAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.textAllCaps::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.shadowColor::class)
    var shadowColor: StringContainer? by StringValueDelegate()
    fun shadowColor(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.shadowColor::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.shadowDx::class)
    var shadowDx: Float? by FloatDelegate()
    fun shadowDx(init: FloatAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.shadowDx::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.shadowDy::class)
    var shadowDy: Float? by FloatDelegate()
    fun shadowDy(init: FloatAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.shadowDy::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.shadowRadius::class)
    var shadowRadius: Float? by FloatDelegate()
    fun shadowRadius(init: FloatAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.shadowRadius::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.elegantTextHeight::class)
    var elegantTextHeight: Boolean? by BooleanDelegate()
    fun elegantTextHeight(init: BooleanAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.elegantTextHeight::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.letterSpacing::class)
    var letterSpacing: Float? by FloatDelegate()
    fun letterSpacing(init: FloatAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.letterSpacing::class, init)

    @DefinedBy(CoreTextAppearanceStyleable.fontFeatureSettings::class)
    var fontFeatureSettings: StringContainer? by StringValueDelegate()
    fun fontFeatureSettings(init: StringAttribute.() -> Unit) =
            initAttr(CoreTextAppearanceStyleable.fontFeatureSettings::class, init)
}

open class CoreStyle : BaseBag("style") {
    fun asReference(): StringContainer {
        return StringContainer("@style/" + this.myName)
    }

    @DefinedBy(CoreViewGroup_LayoutStyleable.layout_width::class)
    var layoutWidth: Dimension? by DimensionValueDelegate()
    fun layoutWidth(init: DimensionAttribute.() -> Unit)
            = initAttr(CoreViewGroup_LayoutStyleable.layout_width::class, init)

    @DefinedBy(CoreViewGroup_LayoutStyleable.layout_height::class)
    var layoutHeight: Dimension? by DimensionValueDelegate()
    fun layoutHeight(init: DimensionAttribute.() -> Unit)
            = initAttr(CoreViewGroup_LayoutStyleable.layout_height::class, init)

    @DefinedBy(CoreStyleable.gravity::class)
    var gravity: List<Enum<Gravity>>? by StyleableFlagDelegate()

    @DefinedBy(CoreStyleable.gravity::class)
    var layoutGravity: List<Enum<Gravity>>? by StyleableFlagDelegate()

    @DefinedBy(CoreStyleable.orientation::class)
    var orientation: Orientation? by StyleableEnumDelegate()

    @DefinedBy(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class)
    open var windowDrawsSystemBarBackgrounds: Boolean? by BooleanDelegate()
    open fun windowDrawsSystemBarBackgrounds(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class, init)

    @DefinedBy(CoreThemeStyleable.windowTranslucentStatus::class)
    open var windowTranslucentStatus: Boolean? by BooleanDelegate()
    open fun windowTranslucentStatus(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreThemeStyleable.windowTranslucentStatus::class, init)

    @DefinedBy(CoreWindowStyleable.windowLightStatusBar::class)
    open var windowLightStatusBar: Boolean? by BooleanDelegate()
    open fun windowLightStatusBar(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreWindowStyleable.windowLightStatusBar::class, init)

    @DefinedBy(CoreWindowStyleable.statusBarColor::class)
    open var statusBarColor: StringContainer? by StringValueDelegate()
    open fun statusBarColor(init: StringAttribute.() -> Unit) =
            initAttr(CoreWindowStyleable.statusBarColor::class, init)

    @DefinedBy(CoreThemeStyleable.windowActionModeOverlay::class)
    open var windowActionModeOverlay: Boolean? by BooleanDelegate()
    open fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreThemeStyleable.windowActionModeOverlay::class, init)

    @DefinedBy(CoreWindowStyleable.navigationBarColor::class)
    var navigationBarColor: StringContainer? by StringValueDelegate()
    fun navigationBarColor(init: StringAttribute.() -> Unit)
            = initAttr(CoreWindowStyleable.navigationBarColor::class, init)

    @DefinedBy(CoreThemeStyleable.actionMenuTextColor::class)
    open var actionMenuTextColor: StringContainer? by StringValueDelegate()
    open fun actionMenuTextColor(init: StringAttribute.() -> Unit)
            = initAttr(CoreThemeStyleable.actionMenuTextColor::class, init)

    @DefinedBy(CoreActionModeStyle::class)
    open var actionModeStyle: CoreActionModeStyle? by InlineStyleDelegate()
    open fun actionModeStyle(init: CoreActionModeStyle.() -> Unit)
            = initInlineStyle(CoreActionModeStyle(), "actionModeStyle", init)

    @DefinedBy(CoreToolbarStyle::class)
    open var toolbarStyle: CoreToolbarStyle? by InlineStyleDelegate()
    fun toolbarStyle(init: CoreToolbarStyle.() -> Unit)
            = initInlineStyle(CoreToolbarStyle(), "toolbarStyle", init)
}

fun <T : CoreStyle> T.extralarge(init: T.() -> Unit) {
    conditionalBag(ExtraLarge(), init)
}

fun <T : CoreStyle> T.version(version: Int, init: T.() -> Unit) {
    conditionalBag(PlatformVersion(version), init)
}
