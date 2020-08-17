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

object ThemeDictionary {
    private val themeDefinitions = hashMapOf<String, HashMap<String, ThemeDefinition>>()
    private val appBags = hashMapOf<String, HashMap<String, BaseBag>>()
    private val appConditionalResources = hashMapOf<String, ArrayList<ResourceDefinition>>()

    private fun getThemeDefinition(conditional: StringCondition, themeName: String): ThemeDefinition? {
        return getThemeDefinition(getResourceQualifiers(conditional), themeName)
    }

    fun getThemeDefinition(resourceQualifiers: String, themeName: String): ThemeDefinition? {
        return themeDefinitions[resourceQualifiers]!![themeName]
    }

    fun putThemeDefinition(conditional: StringCondition, themeDefinition: ThemeDefinition) {
        putThemeDefinition(getResourceQualifiers(conditional), themeDefinition)
    }

    fun putThemeDefinition(resourceQualifiers: String, themeDefinition: ThemeDefinition) {
        if (!themeDefinitions.containsKey(resourceQualifiers)) {
            themeDefinitions[resourceQualifiers] = hashMapOf()
        }
        themeDefinitions[resourceQualifiers]!![themeDefinition.name] = themeDefinition
    }

    private fun getBag(conditional: StringCondition, bagName: String): BaseBag? {
        return getBag(getResourceQualifiers(conditional), bagName)
    }

    private fun getBag(resourceQualifiers: String, bagName: String): BaseBag? {
        return appBags[resourceQualifiers]!![bagName]
    }

    fun putBag(conditional: StringCondition, bag: BaseBag) {
        putBag(getResourceQualifiers(conditional), bag)
    }

    fun putBag(resourceQualifiers: String, bag: BaseBag) {
        if (!appBags.containsKey(resourceQualifiers)) {
            appBags[resourceQualifiers] = hashMapOf()
        }
        appBags[resourceQualifiers]!![bag.myName!!] = bag
    }

    private fun getResourcePrefix(attr: Attribute<out Any>): String {
        when (attr) {
            is BooleanRes -> return "@bool"
            is FloatRes -> return "@float"
            is StringRes -> return "@string"
            is StringAttribute -> return "@string"
            is ColorRes -> return "@color"
            is FontRes -> return "@font"
            is DimenRes -> return "@dimen"
            is DimensionAttribute -> return "@dimen"
            is StyleableEnumAndDimensionAttribute -> return "@dimen"
        }
        return "null"
    }

    private fun getResourceTag(attr: Attribute<out Any>): String {
        when (attr) {
            is BooleanRes -> return "bool"
            is FloatRes -> return "float"
            is StringRes -> return "string"
            is StringAttribute -> return "string"
            is ColorRes -> return "color"
            is FontRes -> return "font"
            is DimenRes -> return "dimen"
            is DimensionAttribute -> return "dimen"
            is StyleableEnumAndDimensionAttribute -> return "dimen"
        }
        return "null"
    }

    private fun getResourceQualifiers(conditional: BaseCondition<out Any>): String {
        val builder = StringBuilder()
        for (qualifier in conditional.conditions) {
            qualifier.render(builder)
        }
        return builder.toString()
    }

    fun resolve() {
        // Resolve parents for all app themes
        for ((resourceQualifier, themeList) in themeDefinitions) {
            for ((themeName, themeDefinition) in themeList) {
                if (themeDefinition !is AppThemeDefinition) {
                    continue
                }
                val parentThemeName = getBag(resourceQualifier, themeName)?.parentName
                if (parentThemeName != null) {
                    themeDefinition.parent = getThemeDefinition(resourceQualifier, parentThemeName)
                }
            }
        }

        // Generate parent widget styles for all app themes that have
        // conditional parents and define inline widget styles. Note that we're only doing this
        // for themes defined in the default resource qualifier (empty).
        for ((themeName, themeDefinition) in themeDefinitions[""]!!) {
            if (themeDefinition !is AppThemeDefinition) {
                continue
            }
            val theme = appBags[""]!![themeName]
            val hasConditionalParent = theme!!.isParentConditional()
            if (!hasConditionalParent) {
                continue
            }

            for (widgetStyle in themeDefinition.styles.values) {
                val themeInlineStyle = theme.getInlineStyle(widgetStyle.name)
                // Go over all parent conditions
                for (parentCondition in theme.parentCondition!!.conditionalValue) {
                    // Find the parent theme that was generated for this condition
                    val parentWidgetStyleDefinition = AppWidgetStyleDefinition(widgetStyle.name)
                    // Generate a name for this style (so it can be used in the final XML for both
                    // this style, and as the parent for any style that extends it)
                    parentWidgetStyleDefinition.generatedName = theme.conditionalParentName +
                            "_" + widgetStyle.name

                    val parentThemeDefinition = getThemeDefinition(parentCondition,
                            theme.conditionalParentName!!)
                    parentThemeDefinition?.addChildStyle(parentWidgetStyleDefinition)

                    // Clone the inline style from this theme, remove all the attributes
                    // and mark it to be skipped during the render pass of the parent theme.
                    // This will result in the cloned style being rendered only in the
                    // generated styles.xml file (and not as widget styles on themes in the
                    // generated themes.xml files)
                    val parentTheme = getBag(parentCondition, theme.conditionalParentName!!)
                    val themeInlineStyleClone = themeInlineStyle!!.clone() as InlineStyle
                    themeInlineStyleClone.resetAttributes()
                    themeInlineStyleClone.shouldSkipRender = true
                    parentTheme!!.styles.add(themeInlineStyleClone)
                }
            }
        }

        // Resolve parents for all widget styles in all app themes
        for ((resourceQualifier, themeList) in themeDefinitions) {
            for ((themeName, themeDefinition) in themeList) {
                if (themeDefinition !is AppThemeDefinition) {
                    continue
                }
                val theme = appBags[resourceQualifier]!![themeName]

                val parentThemeName = theme?.parentName
                if (parentThemeName != null) {
                    for (widgetStyle in themeDefinition.styles.values) {
                        val parentWidgetStyle = getThemeDefinition(resourceQualifier, parentThemeName)?.getChildStyleDefinition(widgetStyle.name)
                        widgetStyle.parent = parentWidgetStyle
                    }
                }
            }
        }

        // Resolve parents for all nested styles in all widget styles in all app themes
        for ((resourceQualifier, themeList) in themeDefinitions) {
            for ((themeName, themeDefinition) in themeList) {
                if (themeDefinition !is AppThemeDefinition) {
                    continue
                }
                val theme = appBags[resourceQualifier]!![themeName]

                val parentThemeName = theme?.parentName
                if (parentThemeName != null) {
                    for (widgetStyle in themeDefinition.styles.values) {
                        for (nestedStyle in widgetStyle.styles.values) {
                            val parentNestedStyle = getThemeDefinition(resourceQualifier, parentThemeName)?.getNestedStyleDefinition(widgetStyle.name, nestedStyle.name)
                            nestedStyle.parent = parentNestedStyle
                        }
                    }
                }
            }
        }

        // Generate names for all conditional attributes and place the values
        // in matching "buckets". Note that we're only doing this for themes defined in the
        // default resource qualifier (empty).
        for ((themeName, themeDefinition) in themeDefinitions[""]!!) {
            if (themeDefinition !is AppThemeDefinition) {
                continue
            }

            for (attribute in appBags[""]!![themeName]!!.attributes) {
                if (attribute.isConditional()) {
                    attribute.conditionalResourcePrefix = getResourcePrefix(attribute)
                    attribute.generatedConditionalResourceName = themeName + "_" +
                            attribute.name
                    for (conditional in attribute.conditionalValue) {
                        val resourceQualifiers = getResourceQualifiers(conditional)
                        if (!appConditionalResources.containsKey(resourceQualifiers)) {
                            appConditionalResources[resourceQualifiers] =
                                    arrayListOf()
                        }
                        appConditionalResources[resourceQualifiers]?.add(
                                ResourceDefinition(getResourceTag(attribute),
                                        attribute.generatedConditionalResourceName!!,
                                        attribute.conditionalResourcePrefix!!,
                                        conditional.value))
                    }
                }
            }
        }

        // Go over all themes with versioned buckets and create matching combined
        // themes (base attributes + base styles + version-specific attributes)
        for ((themeName, themeDefinition) in themeDefinitions[""]!!) {
            if (themeDefinition !is AppThemeDefinition) {
                continue
            }

            val theme = appBags[""]!![themeName]!!
            if (theme.hasConditionalBags()) {
                for ((resourceQualifier, attributeBag) in theme.getConditionalBags()) {
                    val combinedTheme = theme.clone() as BaseBag
                    combinedTheme.clearConditionalBags()
                    combinedTheme.addAttributesFrom(attributeBag)
                    putBag(StringCondition(resourceQualifier), combinedTheme)
                }
            }
        }
    }

    fun output(): Map<String, String> {
        val result = hashMapOf<String, String>()
        // Iterate over all app-defined themes and convert each one to the matching XML snippet
        // that will have the definition for that theme and all relevant styles defined in it
        for ((qualifier, themeList) in appBags) {
            val builder = StringBuilder()
            builder.append("<resources\n")
            builder.append("\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n")
            builder.append("\txmlns:tools=\"http://schemas.android.com/tools\" >\n")
            for (theme in themeList.values) {
                if (theme.shouldGoIntoThemesXml()) {
                    theme.outputTheme(builder, "   ")
                }
            }
            builder.append("</resources>\n")
            result["values$qualifier/generated_themes.xml"] = builder.toString()
        }

        // Iterate over all app-defined themes and generate matching XML snippets for all inline
        // styles
        for ((qualifier, themeList) in appBags) {
            val builder = StringBuilder()
            builder.append("<resources\n")
            builder.append("\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n")
            builder.append("\txmlns:tools=\"http://schemas.android.com/tools\" >\n")
            for (theme in themeList.values) {
                if (!theme.shouldGoIntoThemesXml()) {
                    theme.outputTheme(builder, "   ")
                }
                theme.outputStyles(builder, "   ")
            }
            builder.append("</resources>\n")
            result["values$qualifier/generated_styles.xml"] = builder.toString()
        }

        // Iterate over all app-defined resources that are conditional based on resource
        // qualifiers. These resources are stored in a map where each key is the combined
        // qualifier (such as -sw600dp-land, for example) and the value is the list of
        // data objects. Each object has the information on the specific resource - the XML
        // tag to use (string, color, etc), the resource name and the resource value.
        for ((qualifier, valueList) in appConditionalResources) {
            val builder = StringBuilder()
            builder.append("<resources\n")
            builder.append("\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n")
            builder.append("\txmlns:tools=\"http://schemas.android.com/tools\" >\n")
            for (value in valueList) {
                builder.append("    <" + value.tag + " name=\"" + value.name + "\">")
                value.value?.render(builder)
                builder.append("</" + value.tag + ">\n")
            }
            builder.append("</resources>\n")
            result["values$qualifier/generated_values.xml"] = builder.toString()
        }

        return result
    }
}

fun postInit(): Map<String, String> {
    ThemeDictionary.resolve()

    return ThemeDictionary.output()
}
