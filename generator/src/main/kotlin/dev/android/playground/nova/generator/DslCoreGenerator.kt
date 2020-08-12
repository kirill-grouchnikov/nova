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
package dev.android.playground.nova.generator

import dev.android.playground.nova.core.base.*
import dev.android.playground.nova.core.framework.styleables.*
import java.io.File
import java.io.PrintWriter
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.isSuperclassOf
import kotlin.reflect.full.superclasses
import kotlin.system.exitProcess

fun getAnnotationSource(attributeClass: KClass<*>): String {
    val reuse = (attributeClass.annotations.find { it.annotationClass == Reuse::class })
    if (reuse == null) {
        val split = attributeClass.qualifiedName!!.split('.')
        return split[split.lastIndex - 1] + "." + split[split.lastIndex]
    }
    return getAnnotationSource((reuse as Reuse).klass)
}

fun getEnumClassNameForRendering(enumClass: KClass<out StyleableEnum>): String {
//    return enumClass.simpleName!!
    val split = enumClass.qualifiedName!!.split('.')
    val last = split[split.lastIndex]
    val prev = split[split.lastIndex - 1]
    if (prev.endsWith("Styleable")) {
        return prev + "." + last
    } else {
        return last
    }
//    return enumClass.qualifiedName!!.substring(11)
}

fun getFlagClassNameForRendering(flagClass: KClass<out StyleableFlag>): String {
//    return enumClass.simpleName!!
    val split = flagClass.qualifiedName!!.split('.')
    val last = split[split.lastIndex]
    val prev = split[split.lastIndex - 1]
    if (prev.endsWith("Styleable")) {
        return prev + "." + last
    } else {
        return last
    }
//    return flagClass.qualifiedName!!.substring(11)
}

fun typeAnnotations(attributeClass: KClass<*>): List<Annotation> {
    val reuse = (attributeClass.annotations.find { it.annotationClass == Reuse::class })
    if (reuse != null) {
        return typeAnnotations((reuse as Reuse).klass)
    }
    return attributeClass.annotations
}

fun isBoolean(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == BooleanValue::class }) != null
}

fun isInteger(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == IntegerValue::class }) != null
}

fun isFloat(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == FloatValue::class }) != null
}

fun isLayout(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == LayoutValue::class }) != null
}

fun isColor(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == ColorValue::class }) != null
}

fun isReference(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == ReferenceValue::class }) != null
}

fun isString(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == StringValue::class }) != null
}

fun isDimension(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == DimensionValue::class }) != null
}

fun isEnum(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == EnumValue::class }) != null
}

fun isEnumAndInteger(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == EnumAndIntegerValue::class }) != null
}

fun isEnumAndBoolean(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == EnumAndBooleanValue::class }) != null
}

fun isEnumAndDimension(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == EnumAndDimensionValue::class }) != null
}

fun getEnumClass(attributeClass: KClass<*>): KClass<out StyleableEnum>? {
    val enumValueAnnotation = typeAnnotations(attributeClass).find { it.annotationClass == EnumValue::class }
    if (enumValueAnnotation == null) {
        return null
    }

    return (enumValueAnnotation as EnumValue).klass
}

fun getEnumAndIntegerClass(attributeClass: KClass<*>): KClass<out StyleableEnum>? {
    val enumValueAnnotation = typeAnnotations(attributeClass).find { it.annotationClass == EnumAndIntegerValue::class }
    if (enumValueAnnotation == null) {
        return null
    }

    return (enumValueAnnotation as EnumAndIntegerValue).klass
}

fun getEnumAndBooleanClass(attributeClass: KClass<*>): KClass<out StyleableEnum>? {
    val enumValueAnnotation = typeAnnotations(attributeClass).find { it.annotationClass == EnumAndBooleanValue::class }
    if (enumValueAnnotation == null) {
        return null
    }

    return (enumValueAnnotation as EnumAndBooleanValue).klass
}

fun getEnumAndDimensionClass(attributeClass: KClass<*>): KClass<out StyleableEnum>? {
    val enumValueAnnotation = typeAnnotations(attributeClass).find { it.annotationClass == EnumAndDimensionValue::class }
    if (enumValueAnnotation == null) {
        return null
    }

    return (enumValueAnnotation as EnumAndDimensionValue).klass
}

fun isFlag(attributeClass: KClass<*>): Boolean {
    return (typeAnnotations(attributeClass).find { it.annotationClass == FlagValue::class }) != null
}

fun getFlagClass(attributeClass: KClass<*>): KClass<out StyleableFlag>? {
    val flagValueAnnotation = typeAnnotations(attributeClass).find { it.annotationClass == FlagValue::class }
    if (flagValueAnnotation == null) {
        return null
    }

    return (flagValueAnnotation as FlagValue).klass
}

public data class AttributeRenderInfo(
        public val simpleAttributeClassName: String,
        public val simpleAttributeDelegate: String,
        public val complexAttributeClassName: String?,
        public val simpleAttributeDelegateInitializers: String? = null)


fun getAttributeRenderInfo(attributeClass: KClass<*>): AttributeRenderInfo? {
    val attributeDelegateInitializers: MutableList<String> = arrayListOf()
    if (isBoolean(attributeClass)) {
        attributeDelegateInitializers.add("Boolean::class")
        attributeDelegateInitializers.add("BooleanContainer::class")
    }
    if (isFloat(attributeClass)) {
        attributeDelegateInitializers.add("Float::class")
        attributeDelegateInitializers.add("FloatContainer::class")
    }
    if (isInteger(attributeClass)) {
        attributeDelegateInitializers.add("Int::class")
        attributeDelegateInitializers.add("IntegerContainer::class")
    }
    if (isColor(attributeClass) || isString(attributeClass) || isLayout(attributeClass) || isReference(attributeClass)) {
        attributeDelegateInitializers.add("String::class")
        attributeDelegateInitializers.add("StringContainer::class")
    }
    if (isDimension(attributeClass)) {
        attributeDelegateInitializers.add("Dimension::class")
        attributeDelegateInitializers.add("DimensionContainer::class")
    }
    val renderedDelegateInitializers = attributeDelegateInitializers.joinToString(",")

    if (isBoolean(attributeClass)) {
        return AttributeRenderInfo("Any", "GenericDelegate", "BooleanAttribute",
                renderedDelegateInitializers)
    }
    if (isFloat(attributeClass)) {
        return AttributeRenderInfo("Any", "GenericDelegate", "FloatAttribute",
                renderedDelegateInitializers)
    }
    if (isInteger(attributeClass)) {
        return AttributeRenderInfo("Any", "GenericDelegate", "IntegerAttribute",
                renderedDelegateInitializers)
    }
    if (isColor(attributeClass) || isString(attributeClass) || isLayout(attributeClass) || isReference(attributeClass)) {
        return AttributeRenderInfo("Any", "GenericDelegate", "StringAttribute",
                renderedDelegateInitializers)
    }
    if (isDimension(attributeClass)) {
        return AttributeRenderInfo("Any", "GenericDelegate", "DimensionAttribute",
                renderedDelegateInitializers)
    }
    if (isEnum(attributeClass)) {
        val enumClass = getEnumClass(attributeClass)
        val enumClassNameForRendering = getEnumClassNameForRendering(enumClass!!)
        return AttributeRenderInfo("Any", "GenericEnumDelegate<$enumClassNameForRendering>",
                null, "$enumClassNameForRendering::class")
    }
    if (isEnumAndInteger(attributeClass)) {
        val enumClass = getEnumAndIntegerClass(attributeClass)
        val enumClassNameForRendering = getEnumClassNameForRendering(enumClass!!)
        return AttributeRenderInfo("Any", "GenericEnumDelegate<$enumClassNameForRendering>",
                null, "$enumClassNameForRendering::class, Int::class, IntegerContainer::class")
    }
    if (isEnumAndBoolean(attributeClass)) {
        val enumClass = getEnumAndBooleanClass(attributeClass)
        val enumClassNameForRendering = getEnumClassNameForRendering(enumClass!!)
        return AttributeRenderInfo("Any", "GenericEnumDelegate<$enumClassNameForRendering>",
                null, "$enumClassNameForRendering::class, Boolean::class, BooleanContainer::class")
    }
    if (isEnumAndDimension(attributeClass)) {
        val enumClass = getEnumAndDimensionClass(attributeClass)
        val enumClassNameForRendering = getEnumClassNameForRendering(enumClass!!)
        return AttributeRenderInfo("Any", "GenericEnumDelegate<$enumClassNameForRendering>",
                null, "$enumClassNameForRendering::class, Dimension::class, DimensionContainer::class")
    }

    if (isFlag(attributeClass)) {
        val flagClass = getFlagClass(attributeClass)
        val flagClassNameForRendering = getFlagClassNameForRendering(flagClass!!)
        return AttributeRenderInfo("Any", "GenericFlagDelegate<$flagClassNameForRendering>",
                null, "$flagClassNameForRendering::class")
    }
    return null
}

fun getInlineableClass(fieldClass: KClass<*>): KClass<out BaseStyleable>? {
    val inlineableAnnotation = typeAnnotations(fieldClass).find { it.annotationClass == Inlineable::class }
    if (inlineableAnnotation == null) {
        return null
    }

    val inlineableClasses = (inlineableAnnotation as Inlineable).klass
    if (inlineableClasses.size == 0) {
        return null
    }
    return inlineableClasses[0]
}

fun getStyleableSuperClass(klass: KClass<*>): KClass<out BaseStyleable>? {
    val superclasses = klass.superclasses
    for (superclass in superclasses) {
        if (superclass.isSubclassOf(BaseStyleable::class) && !superclass.isSuperclassOf(BaseStyleable::class)) {
            return superclass as KClass<out BaseStyleable>
        }
    }
    return null
}

fun getLayoutStyleableClass(klass: KClass<*>): KClass<out BaseStyleable>? {
    val styleableAnnotation = (klass.annotations.find { it.annotationClass == LayoutStyleable::class })
    if (styleableAnnotation == null) {
        return null
    }
    return (styleableAnnotation as LayoutStyleable).klass
}

fun getInnerStyleableClasses(klass: KClass<*>): Array<out KClass<out BaseStyleable>> {
    val styleableAnnotation = (klass.annotations.find { it.annotationClass == InnerStyleable::class })
    if (styleableAnnotation == null) {
        return emptyArray()
    }
    return (styleableAnnotation as InnerStyleable).klass
}

fun isStyleableOfAClass(klass: KClass<*>, klassToCheck: KClass<out BaseStyleable>): Boolean {
    if (klass.equals(klassToCheck)) {
        return true
    }

    for (superclass in klass.superclasses) {
        if (isStyleableOfAClass(superclass, klassToCheck)) {
            return true
        }
    }

    return false
}

fun getOutputStyleClassName(klass: KClass<*>): String {
    return klass.simpleName!!.substring(0, klass.simpleName!!.length - 4) + "2"
}

fun renderAll(writer: PrintWriter, klass: Array<KClass<out BaseStyleable>>) {
    for (toRender in klass) {
        renderSingle(toRender, writer)
    }
}

fun renderSingle(klass: KClass<out BaseStyleable>, writer: PrintWriter) {
    val superStyleable = getStyleableSuperClass(klass)

    renderStyleableContent(klass, superStyleable,
            getOutputStyleClassName(klass),
            if (superStyleable != null) getOutputStyleClassName(superStyleable) else "InlineStyle",
            "style", writer)
}

val topStyleables = arrayOf(CoreThemeStyleable::class,
        CoreFragmentAnimationStyleable::class,
        CoreButtonBarLayoutStyleable::class,
        CoreViewTagStyleable::class,
        CoreIncludeStyleable::class,
        CoreActionMenuItemViewStyleable::class,
        CoreImageSwitcherStyleable::class,
        CoreTextClockStyleable::class,
        CoreGridLayoutStyleable::class,
        CoreViewFlipperStyleable::class,
        CoreAdapterViewFlipperStyleable::class,
        CoreRadioGroupStyleable::class,
        CoreTableLayoutStyleable::class,
        CoreTableRowStyleable::class,
        CoreTableRow_CellStyleable::class,
        CoreTextSwitcherStyleable::class,
        CoreTwoLineListItemStyleable::class,
        CoreSlidingDrawerStyleable::class,
        CorePreferenceFrameLayout_LayoutStyleable::class,
        CorePreferenceHeaderStyleable::class,
        CoreMultiSelectListPreferenceStyleable::class,
        CoreVolumePreferenceStyleable::class,
        CoreIconMenuViewStyleable::class,
        CoreAbsoluteLayout_LayoutStyleable::class,
        CoreVerticalSlider_LayoutStyleable::class,
        CoreWeightedLinearLayoutStyleable::class,
        CoreVoiceInteractionSessionStyleable::class,
        CoreKeyboardViewStyleable::class,
        CoreInputMethodStyleable::class,
        CoreSpellCheckerStyleable::class,
        CoreAccessibilityServiceStyleable::class,
        CorePrintServiceStyleable::class,
        CoreHostApduServiceStyleable::class,
        CoreOffHostApduServiceStyleable::class,
        CoreHostNfcFServiceStyleable::class,
        CoreInputMethodServiceStyleable::class,
        CoreWallpaperStyleable::class,
        CoreDreamStyleable::class,
        CoreTrustAgentStyleable::class,
        CoreAutofillServiceStyleable::class,
        CoreSettingInjectorServiceStyleable::class,
        CoreRecognitionServiceStyleable::class,
        CoreVoiceInteractionServiceStyleable::class,
        CoreTextToSpeechEngineStyleable::class,
        CoreTvInputServiceStyleable::class,
        CoreStateListDrawableStyleable::class,
        CoreBitmapDrawableStyleable::class,
        CoreAnimatedStateListDrawableStyleable::class,
        CoreAnimationDrawableStyleable::class,
        CoreAnimationScaleListDrawableStyleable::class,
        CoreGradientDrawableStyleable::class,
        CoreLayerDrawableStyleable::class,
        CoreRotateDrawableStyleable::class,
        CoreAnimatedRotateDrawableStyleable::class,
        CoreMaterialProgressDrawableStyleable::class,
        CoreInsetDrawableStyleable::class,
        CoreNinePatchDrawableStyleable::class,
        CoreColorDrawableStyleable::class,
        CoreRippleDrawableStyleable::class,
        CoreScaleDrawableStyleable::class,
        CoreClipDrawableStyleable::class,
        CoreShapeDrawableStyleable::class,
        CoreVectorDrawableStyleable::class,
        CoreLayoutAnimationStyleable::class,
        CoreRotateAnimationStyleable::class,
        CoreScaleAnimationStyleable::class,
        CoreTranslateAnimationStyleable::class,
        CoreAlphaAnimationStyleable::class,
        CoreGridLayoutAnimationStyleable::class,
        CoreAnimationSetStyleable::class,
        CoreAccelerateInterpolatorStyleable::class,
        CoreDecelerateInterpolatorStyleable::class,
        CoreCycleInterpolatorStyleable::class,
        CoreAnticipateInterpolatorStyleable::class,
        CoreOvershootInterpolatorStyleable::class,
        CoreAnticipateOvershootInterpolatorStyleable::class,
        CorePathInterpolatorStyleable::class,
        CoreDrawableWrapperStyleable::class,
        CoreColorStateListItemStyleable::class,
        CoreLevelListDrawableItemStyleable::class,
        CoreAdaptiveIconDrawableLayerStyleable::class,
        CoreTextViewAppearanceStyleable::class,
        CoreSelectionModeDrawablesStyleable::class,
        CoreSuggestionSpanStyleable::class,
        CoreInputExtrasStyleable::class,
        CoreEpicenterTranslateClipRevealStyleable::class,
        CoreFadeStyleable::class,
        CoreSlideStyleable::class,
        CoreTransitionSetStyleable::class,
        CoreChangeTransformStyleable::class,
        CoreChangeBoundsStyleable::class,
        CoreTransitionManagerStyleable::class,
        CoreAnimatorStyleable::class,
        CorePropertyValuesHolderStyleable::class,
        CoreKeyframeStyleable::class,
        CorePropertyAnimatorStyleable::class,
        CoreAnimatorSetStyleable::class,
        CoreViewDrawableStatesStyleable::class,
        CoreMenuItemCheckedStateStyleable::class,
        CoreMenuItemUncheckedStateStyleable::class,
        CoreMenuItemCheckedFocusedStateStyleable::class,
        CoreMenuItemUncheckedFocusedStateStyleable::class,
        CoreExpandableListChildIndicatorStateStyleable::class,
        CoreExpandableListGroupIndicatorStateStyleable::class,
        CorePopupWindowBackgroundStateStyleable::class,
        CoreTextViewMultiLineBackgroundStateStyleable::class,
        CoreSearchableStyleable::class,
        CoreSearchableActionKeyStyleable::class,
        CoreMenuStyleable::class,
        CoreMenuGroupStyleable::class,
        CoreMenuItemStyleable::class,
        CoreAppWidgetProviderInfoStyleable::class,
        CoreWallpaperPreviewInfoStyleable::class,
        CoreDeviceAdminStyleable::class,
        CoreAccountAuthenticatorStyleable::class,
        CoreSyncAdapterStyleable::class,
        CoreIconStyleable::class,
        CoreIconDefaultStyleable::class,
        CoreContactsDataKindStyleable::class,
        CoreSlidingTabStyleable::class,
        CoreGlowPadViewStyleable::class,
        CoreLockPatternViewStyleable::class,
        CoreVoiceEnrollmentApplicationStyleable::class,
        CorePointerStyleable::class,
        CoreStorageStyleable::class,
        CoreKeyboardLayoutStyleable::class,
        CorePagedViewStyleable::class,
        CoreKeyguardGlowStripViewStyleable::class,
        CoreEdgeEffectStyleable::class,
        CoreResolverDrawerLayoutStyleable::class,
        CoreMessagingLinearLayoutStyleable::class,
        CoreDateTimeViewStyleable::class,
        CoreLightingStyleable::class,
        CoreRestrictionEntryStyleable::class,
        CoreActivityTaskDescriptionStyleable::class,
        CoreShortcutStyleable::class,
        CoreShortcutCategoriesStyleable::class,
        CoreFontFamilyFontStyleable::class,
        CoreFontFamilyStyleable::class,
        CoreRecyclerViewStyleable::class,
        CoreNotificationThemeStyleable::class)

internal fun getInputArgument(args: Array<String>, argumentName: String?): String? {
    for (arg in args) {
        val split = arg.split("=").toTypedArray()
        if (split.size != 2) {
            println("Argument '$arg' unsupported")
            exitProcess(1)
        }
        if (split[0].compareTo(argumentName!!) == 0) {
            return split[1]
        }
    }
    return null
}

internal fun printCopyright(printWriter: PrintWriter) {
    printWriter.println("/*")
    printWriter.println(" * Copyright 2020 Google LLC")
    printWriter.println(" *")
    printWriter.println(" * Licensed under the Apache License, Version 2.0 (the \"License\");")
    printWriter.println(" * you may not use this file except in compliance with the License.")
    printWriter.println(" * You may obtain a copy of the License at")
    printWriter.println(" *")
    printWriter.println(" *     http://www.apache.org/licenses/LICENSE-2.0")
    printWriter.println(" *")
    printWriter.println(" * Unless required by applicable law or agreed to in writing, software")
    printWriter.println(" * distributed under the License is distributed on an \"AS IS\" BASIS,")
    printWriter.println(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.")
    printWriter.println(" * See the License for the specific language governing permissions and")
    printWriter.println(" * limitations under the License.")
    printWriter.println(" */")
}

fun main(args: Array<String>) {
    val folderForThemesAndStyles = getInputArgument(args, "mainOutputFolder")
    if (folderForThemesAndStyles == null) {
        exitProcess(1)
    }
    val folderForSampleUsage = getInputArgument(args, "sampleOutputFolder")
    if (folderForSampleUsage == null) {
        exitProcess(1)
    }

    File(folderForThemesAndStyles).mkdirs()

    val writerThemes = PrintWriter("$folderForThemesAndStyles/CoreThemes2.kt")
    printCopyright(writerThemes)
    writerThemes.println("package dev.android.playground.nova.core.framework.generated")
    writerThemes.println()
    writerThemes.println("import dev.android.playground.nova.core.base.*")
    writerThemes.println("import dev.android.playground.nova.core.framework.*")
    writerThemes.println("import dev.android.playground.nova.core.framework.styleables.*")
    writerThemes.println()
    renderAll(writerThemes, topStyleables)

    writerThemes.println("fun <T : CoreThemeStyle2> T.extralarge(init: T.() -> Unit) {")
    writerThemes.println("    conditionalBag(ExtraLarge(), init)")
    writerThemes.println("}")

    writerThemes.println("fun <T : CoreThemeStyle2> T.version(version: Int, init: T.() -> Unit) {")
    writerThemes.println("    conditionalBag(PlatformVersion(version), init)")
    writerThemes.println("}")

    writerThemes.close()

    for (styleable in topStyleables) {
        if (isStyleableOfAClass(styleable, CoreViewStyleable::class)) {
            scanForAttributes(styleable)
        }
    }

    val writerStyles = PrintWriter("$folderForThemesAndStyles/CoreStyles2.kt")
    printCopyright(writerStyles)
    writerStyles.println("package dev.android.playground.nova.core.framework.generated")
    writerStyles.println()
    writerStyles.println("import dev.android.playground.nova.core.base.*")
    writerStyles.println("import dev.android.playground.nova.core.framework.*")
    writerStyles.println("import dev.android.playground.nova.core.framework.styleables.*")
    writerStyles.println()
    writerStyles.println("open class CoreStyle2 : BaseBag(\"style\") {")
    writerStyles.println("    fun asReference(): StringContainer {")
    writerStyles.println("        return StringContainer(\"@style/\" + this.myName)")
    writerStyles.println("    }")
    writerStyles.println()
    for (attributeDefinition in allViewAttributes.toSortedMap().values) {
        renderRegularAttribute(writerStyles, attributeDefinition.first, "")
        writerStyles.println()
    }
    writerStyles.println("}")
    writerStyles.close()


    val writerSample = PrintWriter("$folderForSampleUsage/CoreSimpleGenerated.kt")

    printCopyright(writerSample)
    writerSample.println("package dev.android.playground.nova.usage")
    writerSample.println()

    writerSample.println("import dev.android.playground.nova.core.base.*")
    writerSample.println("import dev.android.playground.nova.core.framework.*")
    writerSample.println("import import dev.android.playground.nova.core.framework.styleables.*")
    writerSample.println("import import dev.android.playground.nova.core.framework.themes.*")
    writerSample.println()

    writerSample.println("fun style2(name: String, parentName: String? = null, parentStyle: CoreStyle2? = null,")
    writerSample.println("           init: CoreStyle2.() -> Unit): CoreStyle2 {")
    writerSample.println("    val style = CoreStyle2()")
    writerSample.println("    style.init()")
    writerSample.println("    style.myName = name")
    writerSample.println("    if ((parentName != null) && (parentStyle != null)) {")
    writerSample.println("        throw IllegalArgumentException(\"Should only specify one parent\")")
    writerSample.println("    }")
    writerSample.println("    if (parentName != null) {")
    writerSample.println("        style.parentName = parentName")
    writerSample.println("    } else if (parentStyle != null) {")
    writerSample.println("        style.parentName = parentStyle.myName")
    writerSample.println("    }")
    writerSample.println("    style.addToDictionary()")
    writerSample.println("    return style")
    writerSample.println("}")
    writerSample.println()

    writerSample.println("fun theme2(name: String, parent: String, init: CoreThemeStyle2.() -> Unit): CoreThemeStyle2 {")
    writerSample.println("    val theme = CoreThemeStyle2()")
    writerSample.println("    theme.init()")
    writerSample.println("    theme.myName = name")
    writerSample.println("    theme.parentName = parent")
    writerSample.println("    theme.addToDictionary()")
    writerSample.println("    return theme")
    writerSample.println("}")
    writerSample.println()

    writerSample.println("fun theme2(name: String, parent: ParentCondition, init: CoreThemeStyle2.() -> Unit): CoreThemeStyle2 {")
    writerSample.println("    val theme = CoreThemeStyle2()")
    writerSample.println("    theme.init()")
    writerSample.println("    theme.myName = name")
    writerSample.println("    theme.parentCondition = parent")
    writerSample.println("    theme.addToDictionary()")
    writerSample.println("    return theme")
    writerSample.println("}")
    writerSample.println()

    writerSample.println("fun simpleCoreGenerated() {")
    writerSample.println()
    writerSample.println("    theme2(name = \"MyMainTheme\", parent = \"Theme.Material\") {")
    writerSample.println("        // Simple attributes (can use primitive values or reference framework")
    writerSample.println("        // application resources)")
    writerSample.println("        windowActionModeOverlay = true")
    writerSample.println("        windowActionBarOverlay = bool.action_bar_overlay")
    writerSample.println("        actionMenuTextColor = android.color.background_light")
    writerSample.println()
    writerSample.println("        // Inline widget style (no need for a separate style object)")
    writerSample.println("        actionModeStyle {")
    writerSample.println("            background = color.action_mode_background")
    writerSample.println("            height = 48.dp")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Deeper nesting of styles")
    writerSample.println("        toolbarStyle {")
    writerSample.println("            titleTextAppearance {")
    writerSample.println("                textColor = android.color.holo_blue_dark")
    writerSample.println("            }")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Note that there is no need to specify explicit parent for inline styles")
    writerSample.println("        popupWindowStyle {")
    writerSample.println("            popupElevation = 2.dp")
    writerSample.println("            overlapAnchor = true")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Can specify only the specific attribute")
    writerSample.println("        buttonStyle {")
    writerSample.println("            backgroundTint = android.color.background_dark")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Can reference all resource types that are supported by the framework")
    writerSample.println("        windowAnimationStyle {")
    writerSample.println("            activityOpenEnterAnimation = android.anim.slide_in_left")
    writerSample.println("            activityCloseEnterAnimation = android.anim.slide_out_right")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Inline nesting also works for attributes that point to themes")
    writerSample.println("        dialogTheme {")
    writerSample.println("            colorBackground = android.color.background_light")
    writerSample.println("            windowMinWidthMinor = 600.dp")
    writerSample.println("        }")
    writerSample.println()
    writerSample.println("        // Conditionals on attributes")
    writerSample.println("        editTextColor {")
    writerSample.println("            baseline use android.color.primary_text_dark")
    writerSample.println("            landscape use android.color.primary_text_light")
    writerSample.println("            allOf(landscape, night) use android.color.secondary_text_dark")
    writerSample.println("        }")
    writerSample.println("    }")
    writerSample.println()
    writerSample.println("    style2(name = \"MyStyle\") {")
    writerSample.println("        layout_width = 100.dp")
    writerSample.println("        layout_height = CoreViewGroup_LayoutStyleable.LayoutHeightEnum.match_parent")
    writerSample.println("    }")
    writerSample.println()
    writerSample.println("}")
    writerSample.println()

    writerSample.println("fun main(args: Array<String>) {")
    writerSample.println("    initializeCoreDictionary()")
    writerSample.println("    simple()")
    writerSample.println("    for (entry in postInit()) {")
    writerSample.println("        System.out.println(\"*** \" + entry.key + \" ***\")")
    writerSample.println("        System.out.println(entry.value)")
    writerSample.println("        System.out.println()")
    writerSample.println("    }")
    writerSample.println()
    writerSample.println("}")

    writerSample.close()

    println("Successfully created output files")
//    for (base in styleables) {
//        System.out.println(base.simpleName)
//    }

}

fun scanForAttributes(klass: KClass<out BaseStyleable>) {
    //System.out.println("Scanning " + klass.simpleName)
    for (attributeClass in klass.nestedClasses) {
        if ((attributeClass.annotations.find { it.annotationClass == SkipForDSL::class }) != null) {
            continue
        }

        if (attributeClass.isSubclassOf(Enum::class)) {
            continue
        }

        val isInlineable =
                (attributeClass.annotations.find { it.annotationClass == Inlineable::class } != null)
//        val isReused =
//                (attributeClass.annotations.find { it.annotationClass == Reuse::class } != null)
        if (isInlineable) {// || isReused) {
            continue
        }

        val annotationSource = getAnnotationSource(attributeClass)

//        System.out.println("\tadding " + attributeClass.simpleName + " : " + annotationSource)
        if (allViewAttributes.containsKey(attributeClass.simpleName!!)) {
            // Check that we have consistent definitions
            val existingSource = allViewAttributes[attributeClass.simpleName!!]!!.second
            val newSource = annotationSource
            if (!existingSource.equals(annotationSource)) {
                throw IllegalStateException("Already contains attribute " + attributeClass.simpleName
                        + " defined by " + existingSource + " and new definition is from " + newSource)
            }
        }
        allViewAttributes.put(attributeClass.simpleName!!,
                Pair(attributeClass, annotationSource))
    }
    val layoutStyleableClass = getLayoutStyleableClass(klass)
    if (layoutStyleableClass != null) {
        scanForAttributes(layoutStyleableClass)
    }

    val superStyleableClass = getStyleableSuperClass(klass)
    if (superStyleableClass != null) {
        scanForAttributes(superStyleableClass)
    }
}

fun isOverriding(attributeClass: KClass<*>, superklass: KClass<out BaseStyleable>?): Boolean {
    if (superklass == null) {
        return false
    }

    val definedInSuper =
            (superklass.nestedClasses.find { it.simpleName == attributeClass.simpleName }) != null
    if (definedInSuper) {
        return true
    }

    // Need to continue going up the hierarchy (for example, View defines elevation, ViewGroup
    // extends View and then ActionBar extends ViewGroup and defines elevation "again")
    val anotherSuper = getStyleableSuperClass(superklass)
    return isOverriding(attributeClass, anotherSuper)
}

fun isInlineable(klass: KClass<*>): Boolean {
    val reuse = (klass.annotations.find { it.annotationClass == Reuse::class })
    if (reuse != null) {
        return isInlineable((reuse as Reuse).klass)
    }

    return (klass.annotations.find { it.annotationClass == Inlineable::class }) != null
}

var renderedClasses: MutableSet<KClass<out BaseStyleable>> = HashSet()

var allViewAttributes: MutableMap<String, Pair<KClass<*>, String>> = HashMap()

fun renderStyleableContent(klass: KClass<out BaseStyleable>, superklass: KClass<out BaseStyleable>?,
        styleClassname: String, superStyleClassname: String,
        inlineAttributeName: String,
        writer: PrintWriter) {

    val stylesToRender: MutableSet<KClass<out BaseStyleable>> = HashSet()

    writer.println("open class $styleClassname : $superStyleClassname {")
    writer.println("\tconstructor() : super(\"$inlineAttributeName\")")
    writer.println("\tconstructor(name : String) : super(name)")
    writer.println()

    for (attributeClass in klass.nestedClasses) {
        if ((attributeClass.annotations.find { it.annotationClass == SkipForDSL::class }) != null) {
            continue
        }

        if (attributeClass.isSubclassOf(Enum::class)) {
            continue
        }

        if (!isInlineable(attributeClass)) {
//        if ((attributeClass.annotations.find { it.annotationClass == Inlineable::class }) == null) {
            // Regular theme attribute
            val overriding = if (isOverriding(attributeClass, superklass)) " override" else ""

            renderRegularAttribute(writer, attributeClass, overriding)

//            if (renderTriple != null) {
//                writer.println("\t@DefinedBy($definedBy::class)")
//                writer.println("\topen$overriding var ${nested.simpleName}: ${renderTriple.first}? by ${renderTriple.second}()")
//                writer.println("\topen$overriding fun ${nested.simpleName}(init: ${renderTriple.third}.() -> Unit)")
//                writer.println("\t\t= initAttr($styleableName.${nested.simpleName}::class, init)")
//            } else {
//                val enumClass = getEnumClass(nested)
//                if (enumClass != null) {
//                    writer.println("\t@DefinedBy($definedBy::class)")
//                    writer.println("\topen$overriding var ${nested.simpleName}: ${enumClass.qualifiedName}? by StyleableEnumDelegate()")
//                } else {
//                    val flagClass = getFlagClass(nested)
//                    if (flagClass != null) {
//                        writer.println("\t@DefinedBy($definedBy::class)")
//                        writer.println("\topen$overriding var ${nested.simpleName}: List<Enum<${flagClass.qualifiedName}>>? by StyleableFlagDelegate()")
//                    } else {
//                        writer.println("// SKIPPING ${nested.simpleName}")
//                    }
//                }
//            }
        } else {
            val overriding = if (isOverriding(attributeClass, superklass)) " override" else ""

            // Inlineable widget style
            val inlineableClass = getInlineableClass(attributeClass)
            val definedBy = getAnnotationSource(attributeClass)
            if (inlineableClass != null) {
                stylesToRender.add(inlineableClass)
                val styleClassname = inlineableClass.simpleName!!.substring(0, inlineableClass.simpleName!!.length - 4) + "2"

                writer.println("\t@DefinedBy($definedBy::class)")
                writer.println("\topen$overriding var ${attributeClass.simpleName}: $styleClassname? by InlineStyleDelegate()")
                writer.println("\topen$overriding fun ${attributeClass.simpleName}(init: $styleClassname.() -> Unit)")
                writer.println("\t\t= initInlineStyle($styleClassname(), \"${attributeClass.simpleName}\", init)")
            }

        }
        writer.println()
    }

    writer.println("}")
    writer.println()

    // Also render the super class if it's present
    if (superklass != null) {
        stylesToRender.add(superklass)
    }

    val layoutStyleableClass = getLayoutStyleableClass(klass)
    if (layoutStyleableClass != null) {
        stylesToRender.add(layoutStyleableClass)
    }

    stylesToRender.addAll(getInnerStyleableClasses(klass))

    for (styleToRender in stylesToRender) {
        if (styleToRender == CoreThemeStyleable::class || renderedClasses.contains(styleToRender)) {
            continue
        }
        renderedClasses.add(styleToRender)

        val styleClassname = getOutputStyleClassName(styleToRender)
        val superStyleable = getStyleableSuperClass(styleToRender)
        val superStyleClassname =
                if (superStyleable != null) getOutputStyleClassName(superStyleable)
                else "InlineStyle"

        renderStyleableContent(styleToRender, superStyleable,
                styleClassname, superStyleClassname, "",
                writer)
    }
}

fun renderRegularAttribute(writer: PrintWriter, nested: KClass<*>, overriding: String) {
    // Regular theme attribute
    val renderInfo = getAttributeRenderInfo(nested)
    val definedBy = getAnnotationSource(nested)

    if (renderInfo != null) {
        writer.println("\t@DefinedBy($definedBy::class)")
        val simpleAttributeClassName = renderInfo.simpleAttributeClassName
        var simpleAttributeDelegateDefinition = renderInfo.simpleAttributeDelegate
        simpleAttributeDelegateDefinition += "("
        if (renderInfo.simpleAttributeDelegateInitializers != null) {
            simpleAttributeDelegateDefinition += renderInfo.simpleAttributeDelegateInitializers
        }
        simpleAttributeDelegateDefinition += ")"
        writer.println("\topen$overriding var ${nested.simpleName}: $simpleAttributeClassName? by $simpleAttributeDelegateDefinition")
        if (renderInfo.complexAttributeClassName != null) {
            writer.println("\topen$overriding fun ${nested.simpleName}(init: ${renderInfo.complexAttributeClassName}.() -> Unit)")
            writer.println("\t\t= initAttr($definedBy::class, init)")
        }
//        writer.println("\t\t= initAttr($styleableName.${nested.simpleName}::class, init)")
    } else {
        writer.println("// SKIPPING ${nested.simpleName}")
    }
//    else {
//        val enumClass = getEnumClass(nested)
//        if (enumClass != null) {
//            writer.println("\t@DefinedBy($definedBy::class)")
//            writer.println("\topen$overriding var ${nested.simpleName}: ${enumClass.qualifiedName}? by StyleableEnumDelegate()")
//        } else {
//            val flagClass = getFlagClass(nested)
//            if (flagClass != null) {
//                writer.println("\t@DefinedBy($definedBy::class)")
//                writer.println("\topen$overriding var ${nested.simpleName}: List<Enum<${flagClass.qualifiedName}>>? by StyleableFlagDelegate()")
//            } else {
//                writer.println("// SKIPPING ${nested.simpleName}")
//            }
//        }
//    }
}