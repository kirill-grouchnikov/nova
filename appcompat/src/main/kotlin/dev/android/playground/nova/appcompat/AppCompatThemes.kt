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
import dev.android.playground.nova.core.framework.manual.CoreActionModeStyle
import dev.android.playground.nova.core.framework.manual.CoreTheme
import dev.android.playground.nova.core.framework.manual.CoreToolbarStyle

open class AppCompatTheme: CoreTheme() {
    @DefinedBy(AppCompatThemeStyleable.windowActionModeOverlay::class)
    override var windowActionModeOverlay: Boolean? by BooleanDelegate()
    override fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.windowActionModeOverlay::class, init)

    @DefinedBy(AppCompatThemeStyleable.actionMenuTextColor::class)
    override var actionMenuTextColor: StringContainer? by StringValueDelegate()
    override fun actionMenuTextColor(init: StringAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.actionMenuTextColor::class, init)

    @DefinedBy(AppCompatActionModeStyle::class)
    override var actionModeStyle: CoreActionModeStyle? by InlineStyleDelegate()
    fun actionModeStyle(init: AppCompatActionModeStyle.() -> Unit)
            = initInlineStyle(AppCompatActionModeStyle(), "actionModeStyle", init)

    @DefinedBy(AppCompatToolbarStyle::class)
    override var toolbarStyle: CoreToolbarStyle? by InlineStyleDelegate()
    fun toolbarStyle(init: AppCompatToolbarStyle.() -> Unit)
            = initInlineStyle(AppCompatToolbarStyle(), "toolbarStyle", init)
}

fun theme(name: String, parent: String, init: AppCompatTheme.() -> Unit): AppCompatTheme {
    val theme = AppCompatTheme()
    theme.init()
    theme.myName = name
    theme.parentName = parent
    theme.addToDictionary()
    return theme
}

fun theme(name: String, parent: ParentCondition, init: AppCompatTheme.() -> Unit): AppCompatTheme {
    val theme = AppCompatTheme()
    theme.init()
    theme.myName = name
    theme.parentCondition = parent
    theme.addToDictionary()
    return theme
}
