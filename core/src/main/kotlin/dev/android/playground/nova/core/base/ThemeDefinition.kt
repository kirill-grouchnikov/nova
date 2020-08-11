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
package dev.android.playground.nova.core.base

import dev.android.playground.nova.core.framework.styleables.CoreThemeStyleable

open class ThemeDefinition(override val name: String, open var themeParent: ThemeDefinition?,
        var _hasAndroidNamespace : Boolean) :
        WidgetStyleDefinition(name, themeParent, CoreThemeStyleable::class) {
    init {
        hasAndroidNamespace = _hasAndroidNamespace
    }

    val nestedStyles = hashMapOf<String, WidgetStyleDefinition>()

    fun getChildStyleDefinition(styleName: String): WidgetStyleDefinition? {
        if (nullStyles.contains(styleName)) {
            return null
        }

        val fromHere = styles[styleName]
        if (fromHere != null) {
            return fromHere
        }
        // Do we have redirection (with ?attr/)
        val attrRedirection = attrRedirectionStyles[styleName]
        if (attrRedirection != null) {
            return getChildStyleDefinition(attrRedirection)
        }
        return themeParent?.getChildStyleDefinition(styleName)
    }

    fun getNestedStyleDefinition(topStyleName: String, vararg styleNames: String): WidgetStyleDefinition? {
        val topStyle = getChildStyleDefinition(topStyleName)
        if (topStyle == null) {
            return topStyle
        }
        var result = topStyle
        for (styleName in styleNames) {
            result = result!!.getStyleDefinition(styleName)
            if (result == null) {
                return null;
            }
        }
        return result
    }

    fun addChildStyle(style: WidgetStyleDefinition) {
        styles.put(style.name, style)
    }
}

data class AppThemeDefinition(override val name: String) : ThemeDefinition(name, null, false) {
    fun populateFromThemeStyles(theme: BaseBag, prefix: String?) {
        for (c in theme.styles) {
            // For each widget style explicitly defined in this theme create a widget style object
            val appWidgetStyleDefinition = AppWidgetStyleDefinition(c.xmlTag)
            // Generate a name for this style (so it can be used in the final XML for both
            // this style, and as the parent for any style that extends it)
            appWidgetStyleDefinition.generatedName = prefix + "_" + c.xmlTag
            // And store this style on the theme definition
            this.styles.put(c.xmlTag, appWidgetStyleDefinition)

            for (nested in c.styles) {
                // For each widget style explicitly defined in this theme create a widget style object
                val nestedStyleDefinition = AppWidgetStyleDefinition(nested.xmlTag)
                // Generate a name for this style (so it can be used in the final XML for both
                // this style, and as the parent for any style that extends it)
                nestedStyleDefinition.generatedName = prefix + "_" + c.xmlTag + "_" + nested.xmlTag
                // And store this style on the theme definition
                this.nestedStyles.put(nested.xmlTag, nestedStyleDefinition)

                appWidgetStyleDefinition.styles.put(nested.xmlTag, nestedStyleDefinition)
            }
        }
    }
}
