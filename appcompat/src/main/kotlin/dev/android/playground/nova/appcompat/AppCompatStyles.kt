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
import dev.android.playground.nova.core.framework.manual.CoreStyle
import dev.android.playground.nova.core.framework.manual.CoreToolbarStyle
import dev.android.playground.nova.core.framework.manual.TextAppearance

class AppCompatToolbarStyle : CoreToolbarStyle() {
    @DefinedBy(TextAppearance::class)
    override var titleTextAppearance: TextAppearance? by InlineStyleDelegate()
    override fun titleTextAppearance(init: TextAppearance.() -> Unit)
            = initInlineStyle(TextAppearance(), "titleTextAppearance", init)
}

class AppCompatActionModeStyle: CoreActionModeStyle() {
    @DefinedBy(ActionModeStyleable.titleTextStyle::class)
    override var titleTextStyle: TextAppearance? by InlineStyleDelegate()
    override fun titleTextStyle(init: TextAppearance.() -> Unit) =
            initInlineStyle(TextAppearance(), "titleTextStyle", init)

    @DefinedBy(ActionModeStyleable.subtitleTextStyle::class)
    override var subtitleTextStyle: TextAppearance? by InlineStyleDelegate()
    override fun subtitleTextStyle(init: TextAppearance.() -> Unit) =
            initInlineStyle(TextAppearance(), "subtitleTextStyle", init)

    @DefinedBy(ActionModeStyleable.background::class)
    override var background: StringContainer? by StringValueDelegate()
    override fun background(init: ColorAttribute.() -> Unit) =
            initAttr(ActionModeStyleable.background::class, init)

    @DefinedBy(ActionModeStyleable.backgroundSplit::class)
    override var backgroundSplit: StringContainer? by StringValueDelegate()
    override fun backgroundSplit(init: ColorAttribute.() -> Unit) =
            initAttr(ActionModeStyleable.backgroundSplit::class, init)

    @DefinedBy(ActionModeStyleable.height::class)
    override var height: Dimension? by DimensionValueDelegate()
    override fun height(init: DimensionAttribute.() -> Unit) =
            initAttr(ActionModeStyleable.height::class, init)

    @DefinedBy(ActionModeStyleable.closeItemLayout::class)
    override var closeItemLayout: StringContainer? by StringValueDelegate()
    override fun closeItemLayout(init: LayoutAttribute.() -> Unit) =
            initAttr(ActionModeStyleable.closeItemLayout::class, init)

}

open class AppCompatStyle: CoreStyle() {
    @DefinedBy(AppCompatThemeStyleable.windowActionModeOverlay::class)
    override var windowActionModeOverlay: Boolean? by BooleanDelegate()
    override fun windowActionModeOverlay(init: BooleanAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.windowActionModeOverlay::class, init)

    @DefinedBy(AppCompatThemeStyleable.actionMenuTextColor::class)
    override var actionMenuTextColor: StringContainer? by StringValueDelegate()
    override fun actionMenuTextColor(init: StringAttribute.() -> Unit)
            = initAttr(AppCompatThemeStyleable.actionMenuTextColor::class, init)
}

fun style(name: String, parentName: String? = null, parentStyle: AppCompatStyle? = null,
          init: AppCompatStyle.() -> Unit): AppCompatStyle {
    val style = AppCompatStyle()
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
