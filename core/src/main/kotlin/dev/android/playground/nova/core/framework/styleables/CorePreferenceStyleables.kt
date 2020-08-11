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
abstract class CorePreferenceFrameLayoutStyleable : CoreFrameLayoutStyleable() {
    // Padding to use at the top of the prefs content.
    @DimensionValue
    @UseAndroidNamespace
    class borderTop

    // Padding to use at the bottom of the prefs content.
    @DimensionValue
    @UseAndroidNamespace
    class borderBottom

    // Padding to use at the left of the prefs content.
    @DimensionValue
    @UseAndroidNamespace
    class borderLeft

    // Padding to use at the right of the prefs content.
    @DimensionValue
    @UseAndroidNamespace
    class borderRight
}

@UseAndroidNamespace
abstract class CorePreferenceFrameLayout_LayoutStyleable : BaseStyleable {
    // Padding to use at the top of the prefs content.
    @BooleanValue
    @UseAndroidNamespace
    class layout_removeBorders
}

// ****************************************************************
// Preferences framework.
// ****************************************************************

// Base attributes available to PreferenceGroup.
@UseAndroidNamespace
abstract class CorePreferenceGroupStyleable : CorePreferenceStyleable() {
    // Whether to order the Preference under this group as they appear in the XML file.
    // If this is false, the ordering will follow the Preference order attribute and
    // default to alphabetic for those without the order attribute.
    @BooleanValue
    @UseAndroidNamespace
    class orderingFromXml
}

// Attribute for a header describing the item shown in the top-level list
// from which the selects the set of preference to dig in to.
@UseAndroidNamespace
abstract class CorePreferenceHeaderStyleable : BaseStyleable {
    //  Identifier value for the header.
    @Reuse(CoreViewStyleable.id::class)
    class id

    // The title of the item that is shown to the user.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // The summary for the item.
    @StringValue
    @UseAndroidNamespace
    class summary

    // The title for the bread crumb of this item.
    @StringValue
    @UseAndroidNamespace
    class breadCrumbTitle

    // The short title for the bread crumb of this item.
    @StringValue
    @UseAndroidNamespace
    class breadCrumbShortTitle

    // An icon for the item.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // The fragment that is displayed when the user selects this item.
    @StringValue
    @UseAndroidNamespace
    class fragment
}

// WARNING:  If adding attributes to Preference, make sure it does not conflict
// with a View's attributes.  Some subclasses (for example, EditTextPreference)
// proxy all attributes to its EditText widget.

// Base attributes available to Preference.
@UseAndroidNamespace
abstract class CorePreferenceStyleable : BaseStyleable {
    // The optional icon for the preference.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // The key to store the Preference value.
    @StringValue
    @UseAndroidNamespace
    class key

    // The title for the Preference. In API 25 and earlier, this value is read as a
    // plain string with styling information stripped.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // The summary for the Preference. In API 25 and earlier, this value is read as a
    // plain string with styling information stripped.
    @Reuse(CorePreferenceHeaderStyleable.summary::class)
    class summary

    // The order for the Preference (lower values are to be ordered first). If this is not
    // specified, the default ordering will be alphabetic.
    @IntegerValue
    @UseAndroidNamespace
    class order

    // When used inside of a modern PreferenceActivity, this declares
    // a new PreferenceFragment to be shown when the user selects this item.
    @Reuse(CorePreferenceHeaderStyleable.fragment::class)
    class fragment

    // The layout for the Preference in a PreferenceActivity screen. This should
    // rarely need to be changed, look at widgetLayout instead.
    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    // The layout for the controllable widget portion of a Preference. This is inflated
    // into the layout for a Preference and should be used more frequently than
    // the layout attribute. For example, a checkbox preference would specify
    // a custom layout (consisting of just the CheckBox) here.
    @ReferenceValue
    @UseAndroidNamespace
    class widgetLayout

    // Whether the Preference is enabled.
    @Reuse(CoreTextViewStyleable.enabled::class)
    class enabled

    // Whether the Preference is selectable.
    @BooleanValue
    @UseAndroidNamespace
    class selectable

    // The key of another Preference that this Preference will depend on.  If the other
    // Preference is not set or is off, this Preference will be disabled.
    @StringValue
    @UseAndroidNamespace
    class dependency

    // Whether the Preference stores its value to the storage.
    @Reuse(ManifestStyleable.persistent::class)
    class persistent

    // The default value for the preference, which will be set either if persistence
    // is off or persistence is on and the preference is not found in the persistent
    // storage.
    @StringValue
    @BooleanValue
    @IntegerValue
    @ReferenceValue
    @FloatValue
    @UseAndroidNamespace
    class defaultValue

    // Whether the view of this Preference should be disabled when
    // this Preference is disabled.
    @BooleanValue
    @UseAndroidNamespace
    class shouldDisableView

    // Whether the preference has enabled to have its view recycled when used in the list
    // view. This is true by default.
    @BooleanValue
    @UseAndroidNamespace
    class recycleEnabled

    // Whether to use single line for the preference title text. By default, preference title
    // will be constrained to one line, so the default value of this attribute is true.
    @BooleanValue
    @UseAndroidNamespace
    class singleLineTitle

    // Whether the space for the preference icon view will be reserved. By default, preference
    // icon view visibility will be set to GONE when there is no icon provided, so the default
    // value of this attribute is false.
    @BooleanValue
    @UseAndroidNamespace
    class iconSpaceReserved
}

// Base attributes available to CheckBoxPreference.
@UseAndroidNamespace
abstract class CoreCheckBoxPreferenceStyleable : CorePreferenceStyleable() {
    // The summary for the Preference in a PreferenceActivity screen when the
    // CheckBoxPreference is checked. If separate on/off summaries are not
    // needed, the summary attribute can be used instead.
    @StringValue
    @UseAndroidNamespace
    class summaryOn

    // The summary for the Preference in a PreferenceActivity screen when the
    // CheckBoxPreference is unchecked. If separate on/off summaries are not
    // needed, the summary attribute can be used instead.
    @StringValue
    @UseAndroidNamespace
    class summaryOff

    // The state (true for on, or false for off) that causes dependents to be disabled. By default,
    // dependents will be disabled when this is unchecked, so the value of this preference is false.
    @BooleanValue
    @UseAndroidNamespace
    class disableDependentsState
}

// Base attributes available to DialogPreference.
@UseAndroidNamespace
abstract class CoreDialogPreferenceStyleable : CorePreferenceStyleable() {
    // The title in the dialog.
    @StringValue
    @UseAndroidNamespace
    class dialogTitle

    // The message in the dialog. If a dialogLayout is provided and contains
    // a TextView with ID android:id/message, this message will be placed in there.
    @StringValue
    @UseAndroidNamespace
    class dialogMessage

    // The icon for the dialog.
    @ReferenceValue
    @UseAndroidNamespace
    class dialogIcon

    // The positive button text for the dialog. Set to @null to hide the positive button.
    @StringValue
    @UseAndroidNamespace
    class positiveButtonText

    // The negative button text for the dialog. Set to @null to hide the negative button.
    @StringValue
    @UseAndroidNamespace
    class negativeButtonText

    // A layout to be used as the content View for the dialog. By default, this shouldn't
    // be needed. If a custom DialogPreference is required, this should be set. For example,
    // the EditTextPreference uses a layout with an EditText as this attribute.
    @ReferenceValue
    @UseAndroidNamespace
    class dialogLayout
}

// Base attributes available to ListPreference.
@UseAndroidNamespace
abstract class CoreListPreferenceStyleable : CoreDialogPreferenceStyleable() {
    // The human-readable array to present as a list. Each entry must have a corresponding
    // index in entryValues.
    @Reuse(CoreStyleable.entries::class)
    class entries

    // The array to find the value to save for a preference when an entry from
    // entries is selected. If a user clicks on the second item in entries, the
    // second item in this array will be saved to the preference.
    @ReferenceValue
    @UseAndroidNamespace
    class entryValues
}

@UseAndroidNamespace
abstract class CoreMultiSelectListPreferenceStyleable : CoreDialogPreferenceStyleable() {
    // The human-readable array to present as a list. Each entry must have a corresponding
    // index in entryValues.
    @Reuse(CoreStyleable.entries::class)
    class entries

    // The array to find the value to save for a preference when an entry from
    // entries is selected. If a user clicks the second item in entries, the
    // second item in this array will be saved to the preference.
    @Reuse(CoreListPreferenceStyleable.entryValues::class)
    class entryValues
}

// Base attributes available to RingtonePreference.
@UseAndroidNamespace
abstract class CoreRingtonePreferenceStyleable : CorePreferenceStyleable() {

    enum class RingtoneTypeFlag(val value: Long) : StyleableFlag {
        // Ringtones.
        ringtone(1),
        // Notification sounds.
        notification(2),
        // Alarm sounds.
        alarm(4),
        // All available ringtone sounds.
        all(7)
    }

    // Which ringtone type(s) to show in the picker.
    @FlagValue(RingtoneTypeFlag::class)
    @UseAndroidNamespace
    class ringtoneType

    // Whether to show an item for a default sound.
    @BooleanValue
    @UseAndroidNamespace
    class showDefault

    // Whether to show an item for 'Silent'.
    @BooleanValue
    @UseAndroidNamespace
    class showSilent
}

// Base attributes available to VolumePreference.
@UseAndroidNamespace
abstract class CoreVolumePreferenceStyleable : CoreDialogPreferenceStyleable() {
    enum class StreamTypeEnum(val value: Int) : StyleableEnum {
        voice(0),
        system(1),
        ring(2),
        music(3),
        alarm(4)
    }

    // Different audio stream types.
    @EnumValue(StreamTypeEnum::class)
    @UseAndroidNamespace
    class streamType
}


@UseAndroidNamespace
abstract class CoreSwitchPreferenceStyleable : CorePreferenceStyleable() {
    // The summary for the Preference in a PreferenceActivity screen when the
    // SwitchPreference is checked. If separate on/off summaries are not
    // needed, the summary attribute can be used instead.
    @Reuse(CoreCheckBoxPreferenceStyleable.summaryOn::class)
    class summaryOn

    // The summary for the Preference in a PreferenceActivity screen when the
    // SwitchPreference is unchecked. If separate on/off summaries are not
    // needed, the summary attribute can be used instead.
    @Reuse(CoreCheckBoxPreferenceStyleable.summaryOff::class)
    class summaryOff

    // The text used on the switch itself when in the "on" state.
    // This should be a very SHORT string, as it appears in a small space.
    @StringValue
    @UseAndroidNamespace
    class switchTextOn

    // The text used on the switch itself when in the "off" state.
    // This should be a very SHORT string, as it appears in a small space.
    @StringValue
    @UseAndroidNamespace
    class switchTextOff

    // The state (true for on, or false for off) that causes dependents to be disabled. By default,
    // dependents will be disabled when this is unchecked, so the value of this preference is false.
    @Reuse(CoreCheckBoxPreferenceStyleable.disableDependentsState::class)
    class disableDependentsState
}

@UseAndroidNamespace
abstract class CoreSeekBarPreferenceStyleable : CorePreferenceStyleable() {
    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    // Attribute indicating whether the slider within this preference can be adjusted, that is
    // pressing left/right keys when this preference is focused will move the slider accordingly
    // (for example, inline adjustable preferences). False, if the slider within the preference is
    // read-only and cannot be adjusted. By default, the seekbar is adjustable.
    @BooleanValue
    @UseAndroidNamespace
    class adjustable

    // Flag indicating whether the TextView next to the seekbar that shows the current seekbar value will be
    // displayed. If true, the view is VISIBLE; if false, the view will be GONE. By default, this view is VISIBLE.
    @BooleanValue
    @UseAndroidNamespace
    class showSeekBarValue
}

// Base attributes available to PreferenceFragment.
@UseAndroidNamespace
abstract class CorePreferenceFragmentStyleable : CoreFragmentStyleable() {
    // The layout for the PreferenceFragment. This should rarely need to be changed.
    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    @Reuse(CoreListViewStyleable.divider::class)
    class divider
}

// Base attributes available to PreferenceScreen.
@UseAndroidNamespace
abstract class CorePreferenceScreenStyleable : CorePreferenceGroupStyleable() {
    // The layout for the PreferenceScreen. This should rarely need to be changed.
    @ReferenceValue
    @UseAndroidNamespace
    class screenLayout

    @Reuse(CoreListViewStyleable.divider::class)
    class divider
}

// Base attributes available to PreferenceActivity.
@UseAndroidNamespace
abstract class CorePreferenceActivityStyleable : BaseStyleable {
    // The layout for the Preference Activity. This should rarely need to be changed.
    @Reuse(CoreViewStubStyleable.layout::class)
    class layout

    // The layout for the Preference Header. This should rarely need to be changed.
    @ReferenceValue
    @UseAndroidNamespace
    class headerLayout

    // true if the Icon view will be removed when there is none and thus not showing
    // the fixed margins.
    @BooleanValue
    @UseAndroidNamespace
    class headerRemoveIconIfEmpty
}