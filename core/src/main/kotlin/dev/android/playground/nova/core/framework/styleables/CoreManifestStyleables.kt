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
package dev.android.playground.nova.core.framework.styleables

import dev.android.playground.nova.core.base.*

@UseAndroidNamespace
abstract class ManifestStyleable : BaseStyleable {

    // The overall theme to use for an activity.  Use with either the
    // application tag (to supply a default theme for all activities) or
    // the activity tag (to supply a specific theme for that activity).
    // <p>This automatically sets
    // your activity's Context to use this theme, and may also be used
    // for "starting" animations prior to the activity being launched (to
    // better match what the activity actually looks like).  It is a reference
    // to a style resource defining the theme.  If not set, the default
    // system theme will be used.
    @ReferenceValue
    @UseAndroidNamespace
    class theme

    // A user-legible name for the given item.  Use with the
    // application tag (to supply a default label for all application
    // components), or with the activity, receiver, service, or instrumentation
    // tag (to supply a specific label for that component).  It may also be
    // used with the intent-filter tag to supply a label to show to the
    // user when an activity is being selected based on a particular Intent.
    // <p>The given label will be used wherever the user sees information
    // about its associated component; for example, as the name of a
    // main activity that is displayed in the launcher.  You should
    // generally set this to a reference to a string resource, so that
    // it can be localized, however it is also allowed to supply a plain
    // string for quick and dirty programming.
    @ReferenceValue
    @StringValue
    @UseAndroidNamespace
    class label

    // A Drawable resource providing a graphical representation of its
    // associated item.  Use with the
    // application tag (to supply a default icon for all application
    // components), or with the activity, receiver, service, or instrumentation
    // tag (to supply a specific icon for that component).  It may also be
    // used with the intent-filter tag to supply an icon to show to the
    // user when an activity is being selected based on a particular Intent.
    // <p>The given icon will be used to display to the user a graphical
    // representation of its associated component; for example, as the icon
    // for main activity that is displayed in the launcher.  This must be
    // a reference to a Drawable resource containing the image definition.
    @StringValue
    @UseAndroidNamespace
    class icon

    // A Drawable resource providing a graphical representation of its
    // associated item.  Use with the
    // application tag (to supply a default round icon for all application
    // components), or with the activity, receiver, service, or instrumentation
    // tag (to supply a specific round icon for that component).  It may also be
    // used with the intent-filter tag to supply a round icon to show to the
    // user when an activity is being selected based on a particular Intent.
    // <p>The given round icon will be used to display to the user a graphical
    // representation of its associated component; for example, as the round icon
    // for main activity that is displayed in the launcher.  This must be
    // a reference to a Drawable resource containing the image definition.
    @ReferenceValue
    @UseAndroidNamespace
    class roundIcon

    // A Drawable resource providing an extended graphical banner for its
    // associated item. Use with the application tag (to supply a default
    // banner for all application activities), or with the activity, tag to
    // supply a banner for a specific activity.
    // <p>The given banner will be used to display to the user a graphical
    // representation of an activity in the Leanback application launcher.
    // Since banners are displayed only in the Leanback launcher, they should
    // only be used with activities (and applications) that support Leanback
    // mode. These are activities that handle Intents of category
    // {@link android.content.Intent#CATEGORY_LEANBACK_LAUNCHER
    // Intent.CATEGORY_LEANBACK_LAUNCHER}.
    // <p>This must be a reference to a Drawable resource containing the image definition.
    @ReferenceValue
    @UseAndroidNamespace
    class banner

    // A Drawable resource providing an extended graphical logo for its
    // associated item. Use with the application tag (to supply a default
    // logo for all application components), or with the activity, receiver,
    // service, or instrumentation tag (to supply a specific logo for that
    // component). It may also be used with the intent-filter tag to supply
    // a logo to show to the user when an activity is being selected based
    // on a particular Intent.
    // <p>The given logo will be used to display to the user a graphical
    // representation of its associated component; for example as the
    // header in the Action Bar. The primary differences between an icon
    // and a logo are that logos are often wider and more detailed, and are
    // used without an accompanying text caption. This must be a reference
    // to a Drawable resource containing the image definition.
    @StringValue
    @UseAndroidNamespace
    class logo

    // Name of the activity to be launched to manage application's space on
    // device. The specified activity gets automatically launched when the
    // application's space needs to be managed and is usually invoked
    // through user actions. Applications can thus provide their own custom
    // behavior for managing space for various scenarios like out of memory
    // conditions. This is an optional attribute and
    // applications can choose not to specify a default activity to
    // manage space.
    @StringValue
    @UseAndroidNamespace
    class manageSpaceActivity

    // Option to let applications specify that user data can/cannot be
    // cleared. This flag is turned on by default.
    // <em>This attribute is usable only by applications
    // included in the system image. Third-party apps cannot use it.</em>
    @BooleanValue
    @UseAndroidNamespace
    class allowClearUserData

    // Option to indicate this application is only for testing purposes.
    // For example, it may expose functionality or data outside of itself
    // that would cause a security hole, but is useful for testing.  This
    // kind of application can not be installed without the
    // INSTALL_ALLOW_TEST flag, which means only through adb install.
    @BooleanValue
    @UseAndroidNamespace
    class testOnly

    // A unique name for the given item.  This must use a Java-style naming
    // convention to ensure the name is unique, for example
    // "com.mycompany.MyName".
    @StringValue
    @UseAndroidNamespace
    class name

    // Descriptive text for the associated data.
    @ReferenceValue
    @UseAndroidNamespace
    class description

    // The name of the application package that an Instrumentation object
    // will run against.
    @StringValue
    @UseAndroidNamespace
    class targetPackage

    // Flag to control special persistent mode of an application.  This should
    // not normally be used by applications; it requires that the system keep
    // your application running at all times.
    @BooleanValue
    @UseAndroidNamespace
    class persistent
}

@UseAndroidNamespace
abstract class AndroidManifestMetaDataStyleable : BaseStyleable {
    @Reuse(ManifestStyleable.name::class)
    class name

    // Concrete value to assign to this piece of named meta-data .
    // The data can later be retrieved from the meta data Bundle
    // through
    // { @link android.os.Bundle#getString Bundle.getString },
    // { @link android.os.Bundle#getInt Bundle.getInt },
    // { @link android.os.Bundle#getBoolean Bundle.getBoolean },
    // or
    // { @link android.os.Bundle#getFloat Bundle.getFloat } depending
    // on the type used here.
    @StringValue
    @IntegerValue
    @ColorValue
    @FloatValue
    @BooleanValue
    class value

    // Resource identifier to assign to this piece of named meta-data .
    // The resource identifier can later be retrieved from the meta data
    // Bundle through
    // { @link android.os.Bundle#getInt Bundle.getInt }.
    @ReferenceValue
    @UseAndroidNamespace
    class resource
}


// Attributes that can be supplied in an AndroidManifest.xml
// <code>grant-uri-permission</code> tag, a child of the
// {@link #AndroidManifestProvider provider} tag, describing a specific
// URI path that can be granted as a permission.  This tag can be
// specified multiple time to supply multiple paths.
@UseAndroidNamespace
abstract class AndroidManifestGrantUriPermissionStyleable : BaseStyleable {
    // Specify a URI path that must exactly match, as per
    // {@link android.os.PatternMatcher} with
    // {@link android.os.PatternMatcher#PATTERN_LITERAL}.
    @StringValue
    @UseAndroidNamespace
    class path

    // Specify a URI path that must be a prefix to match, as per
    // {@link android.os.PatternMatcher} with
    // {@link android.os.PatternMatcher#PATTERN_PREFIX}.
    @StringValue
    @UseAndroidNamespace
    class pathPrefix

    // Specify a URI path that matches a simple pattern, as per
    // {@link android.os.PatternMatcher} with
    // {@link android.os.PatternMatcher#PATTERN_SIMPLE_GLOB}.
    // Note that because '\' is used as an escape character when
    // reading the string from XML (before it is parsed as a pattern),
    // you will need to double-escape: for example a literal "*" would
    // be written as "\\*" and a literal "\" would be written as
    // "\\\\".  This is basically the same as what you would need to
    // write if constructing the string in Java code.
    @StringValue
    @UseAndroidNamespace
    class pathPattern
}

// Attributes that can be supplied in an AndroidManifest.xml
// <code>data</code> tag, a child of the
// {@link #AndroidManifestIntentFilter intent-filter} tag, describing
// the types of data that match.  This tag can be specified multiple
// times to supply multiple data options, as described in the
// {@link android.content.IntentFilter} class.  Note that all such
// tags are adding options to the same IntentFilter so that, for example,
// <code>&lt;data android:scheme="myscheme" android:host="me.com" /&gt;</code>
// is equivalent to <code>&lt;data android:scheme="myscheme" /&gt;
// &lt;data android:host="me.com" /&gt;</code>.
@UseAndroidNamespace
abstract class AndroidManifestDataStyleable : BaseStyleable {
    // Specify a MIME type that is handled, as per
    // {@link android.content.IntentFilter#addDataType
    //     IntentFilter.addDataType()}.
    // <p><em>Note: MIME type matching in the Android framework is
    // case-sensitive, unlike formal RFC MIME types.  As a result,
    // MIME types here should always use lower case letters.</em></p>
    @StringValue
    @UseAndroidNamespace
    class mimeType

    // Specify a URI scheme that is handled, as per
    // {@link android.content.IntentFilter#addDataScheme
    //     IntentFilter.addDataScheme()}.
    // <p><em>Note: scheme matching in the Android framework is
    // case-sensitive, unlike the formal RFC.  As a result,
    // schemes here should always use lower case letters.</em></p>
    @StringValue
    @UseAndroidNamespace
    class scheme

    // Specify a URI scheme specific part that must exactly match, as per
    // {@link android.content.IntentFilter#addDataSchemeSpecificPart
    //     IntentFilter.addDataSchemeSpecificPart()} with
    // {@link android.os.PatternMatcher#PATTERN_LITERAL}.
    @StringValue
    @UseAndroidNamespace
    class ssp

    // Specify a URI scheme specific part that must be a prefix to match, as per
    // {@link android.content.IntentFilter#addDataSchemeSpecificPart
    //     IntentFilter.addDataSchemeSpecificPart()} with
    // {@link android.os.PatternMatcher#PATTERN_PREFIX}.
    @StringValue
    @UseAndroidNamespace
    class sspPrefix

    // Specify a URI scheme specific part that matches a simple pattern, as per
    // {@link android.content.IntentFilter#addDataSchemeSpecificPart
    //     IntentFilter.addDataSchemeSpecificPart()} with
    // {@link android.os.PatternMatcher#PATTERN_SIMPLE_GLOB}.
    // Note that because '\' is used as an escape character when
    // reading the string from XML (before it is parsed as a pattern),
    // you will need to double-escape: for example a literal "*" would
    // be written as "\\*" and a literal "\" would be written as
    // "\\\\".  This is basically the same as what you would need to
    // write if constructing the string in Java code.
    @StringValue
    @UseAndroidNamespace
    class sspPattern

    // Specify a URI authority host that is handled, as per
    // {@link android.content.IntentFilter#addDataAuthority
    //     IntentFilter.addDataAuthority()}.
    // <p><em>Note: host name matching in the Android framework is
    // case-sensitive, unlike the formal RFC.  As a result,
    // host names here should always use lower case letters.</em></p>
    @StringValue
    @UseAndroidNamespace
    class host

    // Specify a URI authority port that is handled, as per
    // {@link android.content.IntentFilter#addDataAuthority
    //     IntentFilter.addDataAuthority()}.  If a host is supplied
    // but not a port, any port is matched.
    @StringValue
    @UseAndroidNamespace
    class port

    // Specify a URI path that must exactly match, as per
    // {@link android.content.IntentFilter#addDataPath
    //     IntentFilter.addDataPath()} with
    // {@link android.os.PatternMatcher#PATTERN_LITERAL}.
    @Reuse(path::class)
    class path

    // Specify a URI path that must be a prefix to match, as per
    // {@link android.content.IntentFilter#addDataPath
    //     IntentFilter.addDataPath()} with
    // {@link android.os.PatternMatcher#PATTERN_PREFIX}.
    @Reuse(pathPrefix::class)
    class pathPrefix

    // Specify a URI path that matches a simple pattern, as per
    // {@link android.content.IntentFilter#addDataPath
    //     IntentFilter.addDataPath()} with
    // {@link android.os.PatternMatcher#PATTERN_SIMPLE_GLOB}.
    // Note that because '\' is used as an escape character when
    // reading the string from XML (before it is parsed as a pattern),
    // you will need to double-escape: for example a literal "*" would
    // be written as "\\*" and a literal "\" would be written as
    // "\\\\".  This is basically the same as what you would need to
    // write if constructing the string in Java code.
    @Reuse(pathPattern::class)
    class pathPattern

    // Specify a URI path that matches an advanced pattern, as per
    // {@link android.content.IntentFilter#addDataPath
    //     IntentFilter.addDataPath()} with
    // {@link android.os.PatternMatcher#PATTERN_ADVANCED_GLOB}.
    // Note that because '\' is used as an escape character when
    // reading the string from XML (before it is parsed as a pattern),
    // you will need to double-escape: for example a literal "*" would
    // be written as "\\*" and a literal "\" would be written as
    // "\\\\".  This is basically the same as what you would need to
    // write if constructing the string in Java code.
    class pathAdvancedPattern
}

// Declaration of an {@link android.content.Intent} object in XML.  May
// also include zero or more {@link #IntentCategory <category>} and
// {@link #Extra <extra>} tags.
@UseAndroidNamespace
abstract class ManifestIntentStyleable : BaseStyleable {
    // The action name to assign to the Intent, as per
    // {@link android.content.Intent#setAction Intent.setAction()}.
    @StringValue
    @UseAndroidNamespace
    class action

    // The data URI to assign to the Intent, as per
    // {@link android.content.Intent#setData Intent.setData()}.
    // <p><em>Note: scheme and host name matching in the Android framework is
    // case-sensitive, unlike the formal RFC.  As a result,
    // URIs here should always be normalized to use lower case letters
    // for these elements (as well as other proper Uri normalization).</em></p>
    @StringValue
    @UseAndroidNamespace
    class data

    // The MIME type name to assign to the Intent, as per
    // {@link android.content.Intent#setType Intent.setType()}.
    // <p><em>Note: MIME type matching in the Android framework is
    // case-sensitive, unlike formal RFC MIME types.  As a result,
    // MIME types here should always use lower case letters.</em></p>
    class mimeType

    // The package part of the ComponentName to assign to the Intent, as per
    // {@link android.content.Intent#setComponent Intent.setComponent()}.
    @Reuse(ManifestStyleable.targetPackage::class)
    class targetPackage

    // The class part of the ComponentName to assign to the Intent, as per
    // {@link android.content.Intent#setComponent Intent.setComponent()}.
    @StringValue
    @UseAndroidNamespace
    class targetClass
}