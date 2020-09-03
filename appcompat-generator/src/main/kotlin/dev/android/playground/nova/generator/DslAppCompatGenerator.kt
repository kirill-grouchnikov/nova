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

import dev.android.playground.nova.appcompat.styleables.AppCompatActionBarStyleable
import dev.android.playground.nova.appcompat.styleables.AppCompatActionModeStyleable
import dev.android.playground.nova.appcompat.styleables.AppCompatBaseStyleable
import dev.android.playground.nova.appcompat.styleables.AppCompatToolbarStyleable
import dev.android.playground.nova.core.framework.styleables.CoreViewStyleable
import java.io.File
import java.io.PrintWriter
import kotlin.system.exitProcess

val appCompatTopStyleables = arrayOf(AppCompatBaseStyleable::class,
        AppCompatActionModeStyleable::class,
        AppCompatActionBarStyleable::class,
        AppCompatToolbarStyleable::class)

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

    val writerThemes = PrintWriter("$folderForThemesAndStyles/AppCompatThemes.kt")
    printCopyright(writerThemes)
    writerThemes.println("package dev.android.playground.nova.appcompat.generated")
    writerThemes.println()
    writerThemes.println("import dev.android.playground.nova.core.base.*")
    writerThemes.println("import dev.android.playground.nova.core.framework.*")
    writerThemes.println("import dev.android.playground.nova.core.framework.styleables.*")
    writerThemes.println("import dev.android.playground.nova.appcompat.styleables.*")
    writerThemes.println("import dev.android.playground.nova.core.framework.generated.*")
    writerThemes.println()
    renderAll(writerThemes, appCompatTopStyleables)

    writerThemes.println("fun <T : CoreThemeStyle> T.extralarge(init: T.() -> Unit) {")
    writerThemes.println("    conditionalBag(ExtraLarge(), init)")
    writerThemes.println("}")

    writerThemes.println("fun <T : CoreThemeStyle> T.version(version: Int, init: T.() -> Unit) {")
    writerThemes.println("    conditionalBag(PlatformVersion(version), init)")
    writerThemes.println("}")

    writerThemes.close()

    for (styleable in appCompatTopStyleables) {
        if (isStyleableOfAClass(styleable, CoreViewStyleable::class)) {
            scanForAttributes(styleable)
        }
    }

    val writerStyles = PrintWriter("$folderForThemesAndStyles/AppCompatStyles.kt")
    printCopyright(writerStyles)
    writerStyles.println("package dev.android.playground.nova.appcompat.generated")
    writerStyles.println()
    writerStyles.println("import dev.android.playground.nova.core.base.*")
    writerStyles.println("import dev.android.playground.nova.core.framework.*")
    writerStyles.println("import dev.android.playground.nova.core.framework.styleables.*")
    writerStyles.println("import dev.android.playground.nova.appcompat.styleables.*")
    writerStyles.println("import dev.android.playground.nova.core.framework.generated.*")
    writerStyles.println()
    writerStyles.println("open class AppCompatStyle : BaseBag(\"style\") {")
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


    println("Successfully created output files")
//    for (base in styleables) {
//        System.out.println(base.simpleName)
//    }

}
