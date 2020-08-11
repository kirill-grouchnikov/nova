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

// *****************************************************************
// Support for Searchable activities.
// *****************************************************************

// Searchable activities and applications must provide search configuration information
// in an XML file, typically called searchable.xml.  This file is referenced in your manifest.
// For a more in-depth discussion of search configuration, please refer to
// {@link android.app.SearchManager}.
@UseAndroidNamespace
abstract class CoreSearchableStyleable : BaseStyleable {
    @Deprecated("""This is deprecated.</strong><br/>The default
    application icon is now always used, so this attribute is
    obsolete.""")
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // This is the user-displayed name of the searchable activity.  <i>Required
    // attribute.</i>
    @Reuse(ManifestStyleable.label::class)
    class label

    // If supplied, this string will be displayed as a hint to the user.  <i>Optional
    // attribute.</i>
    @Reuse(CoreTextViewStyleable.hint::class)
    class hint

    // If supplied, this string will be displayed as the text of the "Search" button.
    // <i>Optional attribute.</i>
    @Deprecated("""This will create a non-standard UI appearance, because the search bar UI is
        changing to use only icons for its buttons.""")
    @StringValue
    @UseAndroidNamespace
    class searchButtonText

    @Reuse(CoreStyleable.inputType::class)
    class inputType

    @Reuse(CoreStyleable.imeOptions::class)
    class imeOptions

    enum class SearchModeFlag(val value: Long) : StyleableFlag {
        // If set, this flag enables the display of the search target (label) within the
        // search bar.  If neither bad mode is selected, no badge will be shown.
        showSearchLabelAsBadge(0x04),
        @Deprecated("""This is deprecated.</strong><br/>The default
            application icon is now always used, so this option is
            obsolete.""")
        showSearchIconAsBadge(0x08),
        // If set, this flag causes the suggestion column SUGGEST_COLUMN_INTENT_DATA to
        // be considered as the text for suggestion query rewriting.  This should only
        // be used when the values in SUGGEST_COLUMN_INTENT_DATA are suitable for user
        // inspection and editing - typically, HTTP/HTTPS Uri's.
        queryRewriteFromData(0x10),
        // If set, this flag causes the suggestion column SUGGEST_COLUMN_TEXT_1 to
        // be considered as the text for suggestion query rewriting.  This should be used
        // for suggestions in which no query text is provided and the SUGGEST_COLUMN_INTENT_DATA
        // values are not suitable for user inspection and editing.
        queryRewriteFromText(0x20)
    }

    // Additional features are controlled by mode bits in this field.  Omitting
    // this field, or setting to zero, provides default behavior.  <i>Optional attribute.</i>
    @FlagValue(SearchModeFlag::class)
    @UseAndroidNamespace
    class searchMode

    enum class VoiceSearchModeFlag(val value: Long) : StyleableFlag {
        // If set, display a voice search button.  This only takes effect if voice search is
        // available on the device.
        showVoiceSearchButton(0x01),
        // If set, the voice search button will take the user directly to a built-in
        // voice web search activity.  Most applications will not use this flag, as it
        // will take the user away from the activity in which search was invoked.
        launchWebSearch(0x02),
        // If set, the voice search button will take the user directly to a built-in
        // voice recording activity.  This activity will prompt the user to speak,
        // transcribe the spoken text, and forward the resulting query
        // text to the searchable activity, just as if the user had typed it into
        // the search UI and clicked the search button.
        launchRecognizer(0x04)
    }

    // Voice search features are controlled by mode bits in this field.  Omitting
    // this field, or setting to zero, provides default behavior.
    // If showVoiceSearchButton is set, then launchWebSearch or launchRecognizer must
    // also be set.  <i>Optional attribute.</i>
    @FlagValue(VoiceSearchModeFlag::class)
    @UseAndroidNamespace
    class voiceSearchMode

    // If provided, this specifies the language model that should be used by the
    // voice recognition system.  See
    // {@link android.speech.RecognizerIntent#EXTRA_LANGUAGE_MODEL } for more information.
    // If not provided, the default value
    // {@link android.speech.RecognizerIntent#LANGUAGE_MODEL_FREE_FORM } will be used.
    @StringValue
    @UseAndroidNamespace
    class voiceLanguageModel

    // If provided, this specifies a prompt that will be displayed during voice input.
    @StringValue
    @UseAndroidNamespace
    class voicePromptText

    // If provided, this specifies the spoken language to be expected, and that it will be
    // different than the one set in the {@link java.util.Locale#getDefault()}.
    @StringValue
    @UseAndroidNamespace
    class voiceLanguage

    // If provided, enforces the maximum number of results to return, including the "best"
    // result which will always be provided as the SEARCH intent's primary query.  Must be one
    // or greater.  If not provided, the recognizer will choose how many results to return.
    @IntegerValue
    @UseAndroidNamespace
    class voiceMaxResults

    // If provided, this is the trigger indicating that the searchable activity
    // provides suggestions as well.  The value must be a fully-qualified content provider
    // authority (for example, "com.example.android.apis.SuggestionProvider") and should match
    // the "android:authorities" tag in your content provider's manifest entry.  <i>Optional
    // attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSuggestAuthority

    // If provided, this will be inserted in the suggestions query Uri, after the authority
    // you have provide but before the standard suggestions path. <i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSuggestPath

    // If provided, suggestion queries will be passed into your query function
    // as the <i>selection</i> parameter.  Typically this will be a WHERE clause for your
    // database, and will contain a single question mark, which represents the actual query
    // string that has been typed by the user.  If not provided, then the user query text
    // will be appended to the query Uri (after an additional "/".)  <i>Optional
    // attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSuggestSelection

    // If provided, and not overridden by an action in the selected suggestion, this
    // string will be placed in the action field of the {@link android.content.Intent Intent}
    // when the user clicks a suggestion.  <i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSuggestIntentAction

    // If provided, and not overridden by an action in the selected suggestion, this
    // string will be placed in the data field of the {@link android.content.Intent Intent}
    // when the user clicks a suggestion.  <i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSuggestIntentData

    // If provided, this is the minimum number of characters needed to trigger
    // search suggestions. The default value is 0. <i>Optional attribute.</i>
    @IntegerValue
    @UseAndroidNamespace
    class searchSuggestThreshold

    // If provided and <code>true</code>, this searchable activity will be
    // included in any global lists of search targets.
    // The default value is <code>false</code>. <i>Optional attribute.</i>.
    @BooleanValue
    @UseAndroidNamespace
    class includeInGlobalSearch

    // If provided and <code>true</code>, this searchable activity will be invoked for all
    // queries in a particular session. If set to <code>false</code> and the activity
    // returned zero results for a query, it will not be invoked again in that session for
    // supersets of that zero-results query. For example, if the activity returned zero
    // results for "bo", it would not be queried again for "bob".
    // The default value is <code>false</code>. <i>Optional attribute.</i>.
    @BooleanValue
    @UseAndroidNamespace
    class queryAfterZeroResults

    // If provided, this string will be used to describe the searchable item in the
    // searchable items settings within system search settings. <i>Optional
    // attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class searchSettingsDescription

    // If provided and <code>true</code>, URLs entered in the search dialog while searching
    // within this activity would be detected and treated as URLs (show a 'go' button in the
    // keyboard and invoke the browser directly when user launches the URL instead of passing
    // the URL to the activity). If set to <code>false</code> any URLs entered are treated as
    // normal query text.
    // The default value is <code>false</code>. <i>Optional attribute.</i>.
    @BooleanValue
    @UseAndroidNamespace
    class autoUrlDetect
}

// In order to process special action keys during search, you must define them using
// one or more "ActionKey" elements in your Searchable metadata.  For a more in-depth
// discussion of action code handling, please refer to {@link android.app.SearchManager}.
@UseAndroidNamespace
abstract class CoreSearchableActionKeyStyleable : BaseStyleable {
    // This attribute denotes the action key you wish to respond to.  Note that not
    // all action keys are actually supported using this mechanism, as many of them are
    // used for typing, navigation, or system functions.  This will be added to the
    // {@link android.content.Intent#ACTION_SEARCH ACTION_SEARCH} intent that is passed to your
    // searchable activity.  To examine the key code, use
    // {@link android.content.Intent#getIntExtra getIntExtra(SearchManager.ACTION_KEY)}.
    // <p>Note, in addition to the keycode, you must also provide one or more of the action
    // specifier attributes.  <i>Required attribute.</i>
    class keycode

    // If you wish to handle an action key during normal search query entry, you
    // must define an action string here.  This will be added to the
    // {@link android.content.Intent#ACTION_SEARCH ACTION_SEARCH} intent that is passed to your
    // searchable activity.  To examine the string, use
    // {@link android.content.Intent#getStringExtra getStringExtra(SearchManager.ACTION_MSG)}.
    // <i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class queryActionMsg

    // If you wish to handle an action key while a suggestion is being displayed <i>and
    // selected</i>, there are two ways to handle this.  If <i>all</i> of your suggestions
    // can handle the action key, you can simply define the action message using this
    // attribute.  This will be added to the
    // {@link android.content.Intent#ACTION_SEARCH ACTION_SEARCH} intent that is passed to your
    // searchable activity.  To examine the string, use
    // {@link android.content.Intent#getStringExtra getStringExtra(SearchManager.ACTION_MSG)}.
    // <i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class suggestActionMsg

    // If you wish to handle an action key while a suggestion is being displayed <i>and
    // selected</i>, but you do not wish to enable this action key for every suggestion,
    // then you can use this attribute to control it on a suggestion-by-suggestion basis.
    // First, you must define a column (and name it here) where your suggestions will include
    // the action string.  Then, in your content provider, you must provide this column, and
    // when desired, provide data in this column.
    // The search manager will look at your suggestion cursor, using the string
    // provided here in order to select a column, and will use that to select a string from
    // the cursor.  That string will be added to the
    // {@link android.content.Intent#ACTION_SEARCH ACTION_SEARCH} intent that is passed to
    // your searchable activity.  To examine the string, use
    // {@link android.content.Intent#getStringExtra
    //   getStringExtra(SearchManager.ACTION_MSG)}.  <i>If the data does not exist for the
    // selection suggestion, the action key will be ignored.</i><i>Optional attribute.</i>
    @StringValue
    @UseAndroidNamespace
    class suggestActionMsgColumn
}