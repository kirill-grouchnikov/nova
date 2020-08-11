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
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import java.io.PrintWriter
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

fun main(args: Array<String>) {
    generateAttrs()
}

val versionMapping: MutableMap<String, Int> = hashMapOf()

val attributeVersions: MutableMap<String, Int> = hashMapOf()
val attributeGroups: MutableMap<String, MutableList<String>> = hashMapOf()

var scannedStyleableClasses: MutableSet<KClass<out BaseStyleable>> = HashSet()

fun scanForStyleables(klass: KClass<out BaseStyleable>) {
    val stylesToScan: MutableSet<KClass<out BaseStyleable>> = HashSet()

    for (attributeClass in klass.nestedClasses) {
        if ((attributeClass.annotations.find { it.annotationClass == SkipForDSL::class }) != null) {
            continue
        }

        if (attributeClass.isSubclassOf(Enum::class)) {
            continue
        }

        val isInlineable =
                (attributeClass.annotations.find { it.annotationClass == Inlineable::class } != null)
        if (isInlineable) {// || isReused) {
            val inlineableClass = getInlineableClass(attributeClass)
            if (inlineableClass != null) {
                stylesToScan.add(inlineableClass)
            }
            continue
        }

        // TODO - strip Core / Styleable in a better way
        val className = klass.simpleName!!.substring(4, klass.simpleName!!.length - 9)
        val fullAttributeName = className + "_" + attributeClass.simpleName
        if (!attributeGroups["styleable"]!!.contains(fullAttributeName)) {
            attributeGroups["styleable"]!!.add(fullAttributeName)
        }
    }
    val layoutStyleableClass = getLayoutStyleableClass(klass)
    if (layoutStyleableClass != null) {
        stylesToScan.add(layoutStyleableClass)
    }

    stylesToScan.addAll(getInnerStyleableClasses(klass))

    val superStyleableClass = getStyleableSuperClass(klass)
    if (superStyleableClass != null) {
        stylesToScan.add(superStyleableClass)
    }

    for (styleToScan in stylesToScan) {
        if (scannedStyleableClasses.contains(styleToScan)) {
            continue
        }
        scannedStyleableClasses.add(styleToScan)

        scanForStyleables(styleToScan)
    }

}

fun generateAttrs() {
    versionMapping["1"] = 1
    versionMapping["2"] = 2
    versionMapping["3"] = 3
    versionMapping["4"] = 4
    versionMapping["5"] = 5
    versionMapping["6"] = 6
    versionMapping["7"] = 7
    versionMapping["8"] = 8
    versionMapping["9"] = 9
    versionMapping["10"] = 10
    versionMapping["11"] = 11
    versionMapping["12"] = 12
    versionMapping["13"] = 13
    versionMapping["14"] = 14
    versionMapping["15"] = 15
    versionMapping["16"] = 16
    versionMapping["17"] = 17
    versionMapping["18"] = 18
    versionMapping["19"] = 19
    versionMapping["20"] = 20
    versionMapping["21"] = 21
    versionMapping["22"] = 22
    versionMapping["M"] = 23
    versionMapping["N"] = 24
    versionMapping["NMR1"] = 25
    versionMapping["O"] = 26
    versionMapping["OMR1"] = 27

    val xlmFile: File = File("/Volumes/android/pi-dev/frameworks/base/core/res/res/values/public.xml")
    val xmlDoc: Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xlmFile)

    xmlDoc.documentElement.normalize()

    println("Root Node:" + xmlDoc.documentElement.nodeName)

    var currentSdkLevel: Int = 0
    val nodeList: NodeList = xmlDoc.documentElement.childNodes
    for (i in 0..nodeList.length - 1) {
        val node = nodeList.item(i)
        if (node.nodeType == Node.COMMENT_NODE) {
            if (node.nodeValue.contains("version") && node.nodeValue.contains("platform")) {
                //println(node.nodeValue)
                val versionCommentSplit = node.nodeValue.split(" ")
                val versionIndex = versionCommentSplit.indexOf("version")
                if (versionMapping.containsKey(versionCommentSplit[versionIndex + 1] + versionCommentSplit[versionIndex + 2])) {
                    currentSdkLevel = versionMapping[versionCommentSplit[versionIndex + 1] + versionCommentSplit[versionIndex + 2]]!!
                } else if (versionMapping.containsKey(versionCommentSplit[versionIndex + 1])) {
                    currentSdkLevel = versionMapping[versionCommentSplit[versionIndex + 1]]!!
                }
                //println("FOR LEVEL $currentSdkLevel")
            }
        }

        if ((node.nodeType == Node.ELEMENT_NODE) && (node.nodeName == "public")) {
            val attributeType = node.attributes.getNamedItem("type").nodeValue
            val attributeName = node.attributes.getNamedItem("name").nodeValue
            attributeVersions[attributeName] = currentSdkLevel
            if (!attributeGroups.containsKey(attributeType)) {
                attributeGroups[attributeType] = arrayListOf()
            }
            attributeGroups[attributeType]!!.add(attributeName)
        }

    }

    attributeGroups["styleable"] = arrayListOf()
    for (topStyleable in topStyleables) {
        scanForStyleables(topStyleable)
    }

    File("/Users/kirillg/Playground/src/generated").mkdirs()

    val writerAttrs = PrintWriter("/Users/kirillg/Playground/src/generated/CoreAttrs.kt")
    writerAttrs.println("package theme.core")
    writerAttrs.println()
    writerAttrs.println("import theme.*")
    writerAttrs.println("import theme.base.*")
    writerAttrs.println("import theme.core.*")
    writerAttrs.println()

    writerAttrs.println("object android {")
    writerAttrs.println("    object anim")
    writerAttrs.println("    object animator")
    writerAttrs.println("    object array")
    writerAttrs.println("    object attr")
    writerAttrs.println("    object bool")
    writerAttrs.println("    object color")
    writerAttrs.println("    object dimen")
    writerAttrs.println("    object drawable")
    writerAttrs.println("    object fraction")
    writerAttrs.println("    object id")
    writerAttrs.println("    object integer")
    writerAttrs.println("    object interpolator")
    writerAttrs.println("    object layout")
    writerAttrs.println("    object menu")
    writerAttrs.println("    object mipmap")
    writerAttrs.println("    object plurals")
    writerAttrs.println("    object raw")
    writerAttrs.println("    object string")
    writerAttrs.println("    object style")
    writerAttrs.println("    object styleable")
    writerAttrs.println("    object transition")
    writerAttrs.println("    object xml")
    writerAttrs.println("}")

    for (attributeType in attributeGroups.keys.sorted()) {
        for (attributeName in attributeGroups[attributeType]!!.sorted()) {
            //println("${attributeVersions[attributeName]} $attributeType.$attributeName")

            val sdkVersion = attributeVersions[attributeName]
            if ((sdkVersion != null) && (sdkVersion > 1)) {
                writerAttrs.println("@RequiresApiLevel($sdkVersion)")
            }
            val attributeOutputName = attributeName.replace('.', '_')
            writerAttrs.println("val android.$attributeType.$attributeOutputName: StringContainer")
            writerAttrs.println("        get() = StringContainer(\"@android:$attributeType/$attributeOutputName\")")
        }
        writerAttrs.println()
    }
    writerAttrs.close()
}