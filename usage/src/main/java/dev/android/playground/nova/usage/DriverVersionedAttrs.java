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
package dev.android.playground.nova.usage;

import dev.android.playground.nova.core.base.DictionaryKt;

import java.util.Map;

public class DriverVersionedAttrs {
    public static void main(String... args) {
        System.out.println("Hello");

        VersionedAttrsKt.versionedAttrs();

        // And now we can run the post-init step that resolves all themes / styles and
        // outputs them in the XML format
        Map<String, String> result = DictionaryKt.postInit();
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println("*** " + entry.getKey() + " ***");
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
}
