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

// **************************************************************
// Dealing with attributes that have values specific to certain
// configurations (resource qualifiers)
// **************************************************************

interface ResourceQualifier {
    fun render(builder: StringBuilder)
}

// We will need to support all qualifiers from
// https://developer.android.com/guide/topics/resources/providing-resources.html#table2
class Landscape : ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-land")
    }
}

class SmallestWidth(private val width: Int) : ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-sw" + width + "dp")
    }
}

class Night : ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-night")
    }
}

class PlatformVersion(private val version: Int) : ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-v$version")
    }
}

class Small: ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-small")
    }
}

class Normal: ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-normal")
    }
}

class Large: ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-large")
    }
}

class ExtraLarge: ResourceQualifier {
    override fun render(builder: StringBuilder) {
        builder.append("-xlarge")
    }
}

class Default : ResourceQualifier {
    override fun render(builder: StringBuilder) {
    }
}


