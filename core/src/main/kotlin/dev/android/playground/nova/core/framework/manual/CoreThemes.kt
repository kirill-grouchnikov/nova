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
import dev.android.playground.nova.core.framework.styleables.*

open class CoreTheme : BaseBag("style") {
    override fun shouldGoIntoThemesXml(): Boolean {
        return true
    }

    @DefinedBy(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class)
//    open var windowDrawsSystemBarBackgrounds: Boolean? by BooleanDelegate()
    open var windowDrawsSystemBarBackgrounds: Any? by GenericDelegate(Boolean::class)
    open fun windowDrawsSystemBarBackgrounds(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreWindowStyleable.windowDrawsSystemBarBackgrounds::class, init)

    @DefinedBy(CoreThemeStyleable.windowTranslucentStatus::class)
    open var windowTranslucentStatus: Boolean? by BooleanDelegate()
    open fun windowTranslucentStatus(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreThemeStyleable.windowTranslucentStatus::class, init)

    @DefinedBy(CoreWindowStyleable.windowLightStatusBar::class)
    open var windowLightStatusBar: Any? by GenericDelegate(Boolean::class, BooleanContainer::class)
    open fun windowLightStatusBar(init: BooleanAttribute.() -> Unit)
            = initAttr(CoreWindowStyleable.windowLightStatusBar::class, init)

    @DefinedBy(CoreViewStyleable.focusable::class)
//    open var focusable: StyleableEnumAndBooleanContainer<CoreViewStyleable.FocusableEnum>?
//            by StyleableEnumAndBooleanDelegate()
//    open var focusable: BooleanContainer? by BooleanAttributeExtraDelegate()
    open var focusable: Any? by GenericEnumDelegate<CoreViewStyleable.FocusableEnum>(
            CoreViewStyleable.FocusableEnum::class, Boolean::class, BooleanContainer::class)

    @DefinedBy(CoreWindowStyleable.statusBarColor::class)
//    open var statusBarColor: StringContainer? by StringValueDelegate()
    open var statusBarColor: Any? by GenericDelegate(StringContainer::class)
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

    @DefinedBy(CoreActionModeStyleable::class)
    open var actionModeStyle: CoreActionModeStyle? by InlineStyleDelegate()
    open fun actionModeStyle(init: CoreActionModeStyle.() -> Unit)
            = initInlineStyle(CoreActionModeStyle(), "actionModeStyle", init)

    @DefinedBy(CoreToolbarStyleable::class)
    open var toolbarStyle: CoreToolbarStyle? by InlineStyleDelegate()
    open fun toolbarStyle(init: CoreToolbarStyle.() -> Unit)
            = initInlineStyle(CoreToolbarStyle(), "toolbarStyle", init)
}

fun <T : CoreTheme> T.extralarge(init: T.() -> Unit) {
    conditionalBag(ExtraLarge(), init)
}

fun <T : CoreTheme> T.version(version: Int, init: T.() -> Unit) {
    conditionalBag(PlatformVersion(version), init)
}


fun style(name: String, parentName: String? = null, parentStyle: CoreStyle? = null,
          init: CoreStyle.() -> Unit): CoreStyle {
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

fun theme(name: String, parent: String, init: CoreTheme.() -> Unit): CoreTheme {
    val theme = CoreTheme()
    theme.init()
    theme.myName = name
    theme.parentName = parent
    theme.addToDictionary()
    return theme
}

fun theme(name: String, parent: ParentCondition, init: CoreTheme.() -> Unit): CoreTheme {
    val theme = CoreTheme()
    theme.init()
    theme.myName = name
    theme.parentCondition = parent
    theme.addToDictionary()
    return theme
}

