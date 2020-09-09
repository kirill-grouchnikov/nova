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
package dev.android.playground.nova.appcompat.manual

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.manual.CoreActionModeStyleManual
import dev.android.playground.nova.core.framework.manual.CoreThemeManual
import dev.android.playground.nova.core.framework.manual.CoreToolbarStyleManual
import dev.android.playground.nova.core.framework.themes.initializeCoreDictionary

open class AppCompatThemeManual: CoreThemeManual() {
    @DefinedBy(AppCompatThemeStyleable.windowActionModeOverlay::class)
    override var windowActionModeOverlay: Boolean? by BooleanDelegate()
    override fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.windowActionModeOverlay::class, init)

    @DefinedBy(AppCompatThemeStyleable.actionMenuTextColor::class)
    override var actionMenuTextColor: StringContainer? by StringValueDelegate()
    override fun actionMenuTextColor(init: StringAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.actionMenuTextColor::class, init)

    @DefinedBy(AppCompatActionModeStyleManual::class)
    override var actionModeStyle: CoreActionModeStyleManual? by InlineStyleDelegate()
    fun actionModeStyle(init: AppCompatActionModeStyleManual.() -> Unit)
            = initInlineStyle(AppCompatActionModeStyleManual(), "actionModeStyle", init)

    @DefinedBy(AppCompatToolbarStyleManual::class)
    override var toolbarStyle: CoreToolbarStyleManual? by InlineStyleDelegate()
    fun toolbarStyle(init: AppCompatToolbarStyleManual.() -> Unit)
            = initInlineStyle(AppCompatToolbarStyleManual(), "toolbarStyle", init)
}

fun appCompatThemeManual(name: String, parent: String, init: AppCompatThemeManual.() -> Unit): AppCompatThemeManual {
    initializeCoreDictionary()
    val theme = AppCompatThemeManual()
    theme.init()
    theme.myName = name
    theme.parentName = parent
    theme.addToDictionary()
    return theme
}

fun appCompatThemeManual(name: String, parent: ParentCondition, init: AppCompatThemeManual.() -> Unit): AppCompatThemeManual {
    initializeCoreDictionary()
    val theme = AppCompatThemeManual()
    theme.init()
    theme.myName = name
    theme.parentCondition = parent
    theme.addToDictionary()
    return theme
}
