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

// Use <code>accessibility-service</code> as the root tag of the XML resource that
// describes an {@link android.accessibilityservice.AccessibilityService} service,
// which is referenced from its
// {@link android.accessibilityservice.AccessibilityService#SERVICE_META_DATA}
// meta-data entry.
@UseAndroidNamespace
abstract class CoreAccessibilityServiceStyleable : BaseStyleable {
    enum class AccessibilityEventTypesFlag(val value: Long) : StyleableFlag {
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_CLICKED } events.
        typeViewClicked(0x00000001),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_LONG_CLICKED } events.
        typeViewLongClicked(0x00000002),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_SELECTED } events.
        typeViewSelected(0x00000004),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_FOCUSED } events.
        typeViewFocused(0x00000008),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_TEXT_CHANGED } events.
        typeViewTextChanged(0x00000010),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_WINDOW_STATE_CHANGED } events.
        typeWindowStateChanged(0x00000020),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_NOTIFICATION_STATE_CHANGED } events.
        typeNotificationStateChanged(0x00000040),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_HOVER_ENTER } events.
        typeViewHoverEnter(0x00000080),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_HOVER_EXIT } events.
        typeViewHoverExit(0x00000100),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_TOUCH_EXPLORATION_GESTURE_START } events.
        typeTouchExplorationGestureStart(0x00000200),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_TOUCH_EXPLORATION_GESTURE_END } events.
        typeTouchExplorationGestureEnd(0x00000400),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_WINDOW_CONTENT_CHANGED } events.
        typeWindowContentChanged(0x00000800),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_SCROLLED } events.
        typeViewScrolled(0x000001000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_TEXT_SELECTION_CHANGED } events.
        typeViewTextSelectionChanged(0x000002000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_ANNOUNCEMENT } events.
        typeAnnouncement(0x00004000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_ACCESSIBILITY_FOCUSED } events.
        typeViewAccessibilityFocused(0x00008000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED } events.
        typeViewAccessibilityFocusCleared(0x00010000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY } events.
        typeViewTextTraversedAtMovementGranularity(0x00020000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_GESTURE_DETECTION_START } events.
        typeGestureDetectionStart(0x00040000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_GESTURE_DETECTION_END } events.
        typeGestureDetectionEnd(0x00080000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_TOUCH_INTERACTION_START } events.
        typeTouchInteractionStart(0x00100000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_TOUCH_INTERACTION_END } events.
        typeTouchInteractionEnd(0x00200000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_WINDOWS_CHANGED } events.
        typeWindowsChanged(0x00400000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_VIEW_CONTEXT_CLICKED } events.
        typeContextClicked(0x00800000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPE_ASSIST_READING_CONTEXT } events.
        typeAssistReadingContext(0x01000000),
        // Receives
        // {@link android.view.accessibility.AccessibilityEvent#TYPES_ALL_MASK } i.e. all events.
        typeAllMask(0xffffffff)
    }

    // The event types this service would like to receive as specified
    // in {@link android.view.accessibility.AccessibilityEvent}. This setting
    // can be changed at runtime by calling
    // {@link android.accessibilityservice.AccessibilityService#setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)
    //     android.accessibilityservice.AccessibilityService.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)}.
    @FlagValue(AccessibilityEventTypesFlag::class)
    @UseAndroidNamespace
    class accessibilityEventTypes

    // Comma separated package names from which this service would like to receive events (leave out for all packages).
    // {@link android.accessibilityservice.AccessibilityService#setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)
    //     android.accessibilityservice.AccessibilityService.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)}.
    @StringValue
    @UseAndroidNamespace
    class packageNames

    enum class AccessibilityFeedbackTypeFlag(val value: Long) : StyleableFlag {
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_SPOKEN } feedback.
        feedbackSpoken(0x00000001),
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_HAPTIC } feedback.
        feedbackHaptic(0x00000002),
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_AUDIBLE } feedback.
        feedbackAudible(0x00000004),
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_VISUAL } feedback.
        feedbackVisual(0x00000008),
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_GENERIC } feedback.
        feedbackGeneric(0x00000010),
        // Provides
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FEEDBACK_ALL_MASK } feedback.
        feedbackAllMask(0xffffffff)
    }

    // The feedback types this service provides as specified in {@link android.accessibilityservice.AccessibilityServiceInfo}. This setting
    // can be changed at runtime by calling {@link android.accessibilityservice.AccessibilityService#setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)
    //     android.accessibilityservice.AccessibilityService.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)}.
    @FlagValue(AccessibilityFeedbackTypeFlag::class)
    @UseAndroidNamespace
    class accessibilityFeedbackType

    // The minimal period in milliseconds between two accessibility events of the same type
    // are sent to this service. This setting can be changed at runtime by calling
    // {@link android.accessibilityservice.AccessibilityService#setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)
    //     android.accessibilityservice.AccessibilityService.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)}.
    @IntegerValue
    @UseAndroidNamespace
    class notificationTimeout

    enum class AccessibilityFlagsFlag(val value: Long) : StyleableFlag {
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#DEFAULT }.
        flagDefault(0x00000001),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_INCLUDE_NOT_IMPORTANT_VIEWS }.
        flagIncludeNotImportantViews(0x00000002),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REQUEST_TOUCH_EXPLORATION_MODE }.
        flagRequestTouchExplorationMode(0x00000004),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY }.
        // Not used by the framework.
        flagRequestEnhancedWebAccessibility(0x00000008),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REPORT_VIEW_IDS }.
        flagReportViewIds(0x00000010),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REQUEST_FILTER_KEY_EVENTS }.
        flagRequestFilterKeyEvents(0x00000020),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_RETRIEVE_INTERACTIVE_WINDOWS }.
        flagRetrieveInteractiveWindows(0x00000040),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_ENABLE_ACCESSIBILITY_VOLUME }.
        flagEnableAccessibilityVolume(0x00000080),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REQUEST_ACCESSIBILITY_BUTTON }.
        flagRequestAccessibilityButton(0x00000100),
        // Has flag
        // {@link android.accessibilityservice.AccessibilityServiceInfo#FLAG_REQUEST_FINGERPRINT_GESTURES }.
        flagRequestFingerprintGestures(0x00000200)
    }

    // Additional flags as specified in {@link android.accessibilityservice.AccessibilityServiceInfo}.
    // This setting can be changed at runtime by calling
    // {@link android.accessibilityservice.AccessibilityService#setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)
    //     android.accessibilityservice.AccessibilityService.setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo)}.
    @FlagValue(AccessibilityFlagsFlag::class)
    @UseAndroidNamespace
    class accessibilityFlags

    // Component name of an activity that allows the user to modify
    // the settings for this service. This setting cannot be changed at runtime.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Attribute whether the accessibility service wants to be able to retrieve the
    // active window content. This setting cannot be changed at runtime.
    @BooleanValue
    @UseAndroidNamespace
    class canRetrieveWindowContent

    // Attribute whether the accessibility service wants to be able to request touch
    // exploration mode in which touched items are spoken aloud and the UI can be
    // explored via gestures.
    // <p>
    // Required to allow setting the {@link android.accessibilityservice#AccessibilityServiceInfo#FLAG_REQUEST_TOUCH_EXPLORATION_MODE} flag.
    // </p>
    @BooleanValue
    @UseAndroidNamespace
    class canRequestTouchExplorationMode

    // Attribute whether the accessibility service wants to be able to request enhanced
    // web accessibility enhancements.
    // { @deprecated Not used by the framework }
    @BooleanValue
    @UseAndroidNamespace
    class canRequestEnhancedWebAccessibility

    // Attribute whether the accessibility service wants to be able to request to
    // filter key events.
    // <p>
    // Required to allow setting the {@link android.accessibilityservice#AccessibilityServiceInfo#FLAG_REQUEST_FILTER_KEY_EVENTS} flag.
    // </p>
    @BooleanValue
    @UseAndroidNamespace
    class canRequestFilterKeyEvents

    // Attribute whether the accessibility service wants to be able to control
    // display magnification.
    @BooleanValue
    @UseAndroidNamespace
    class canControlMagnification

    // Attribute whether the accessibility service wants to be able to perform gestures.
    @BooleanValue
    @UseAndroidNamespace
    class canPerformGestures

    // Attribute whether the accessibility service wants to be able to capture gestures from
    // the fingerprint sensor.
    // <p>
    // Required to allow setting the {@link android.accessibilityservice#AccessibilityServiceInfo#FLAG_REQUEST_FINGERPRINT_GESTURES} flag to have any effect.
    // </p>
    @BooleanValue
    @UseAndroidNamespace
    class canRequestFingerprintGestures

    // Short description of the accessibility service purpose or behavior.
    @Reuse(ManifestStyleable.description::class)
    class description

    // Brief summary of the accessibility service purpose or behavior.
    @Reuse(CorePreferenceHeaderStyleable.summary::class)
    class summary
}

// Use <code>print-service</code> as the root tag of the XML resource that
// describes an {@link android.printservice.PrintService} service, which is
// referenced from its {@link android.printservice.PrintService#SERVICE_META_DATA}
// meta-data entry.
@UseAndroidNamespace
abstract class CorePrintServiceStyleable : BaseStyleable {
    // Fully qualified
    // class name of an activity that allows the user to modify
    // the settings for this service.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Fully qualified
    // class name of an activity that allows the user to manually
    // add printers to this print service.
    @StringValue
    @UseAndroidNamespace
    class addPrintersActivity

    // Fully qualified
    // class name of an activity with advanced print options
    // specific to this print service.
    @StringValue
    @UseAndroidNamespace
    class advancedPrintOptionsActivity

    // The vendor name if this print service is vendor specific.
    @StringValue
    @UseAndroidNamespace
    class vendor
}

// Use <code>host-apdu-service</code> as the root tag of the XML resource that
// describes an
//  {@link android.nfc.cardemulation.HostApduService } service, which
//  is referenced from its
// {@link android.nfc.cardemulation.HostApduService#SERVICE_META_DATA }
//  entry.
@InnerStyleable(CoreAidGroupStyleable::class)
@UseAndroidNamespace
abstract class CoreHostApduServiceStyleable : BaseStyleable {
    // Short description of the functionality the service implements. This attribute
    // is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.description::class)
    class description

    // Whether the device must be unlocked before routing data to this service.
    // The default is false.
    @BooleanValue
    @UseAndroidNamespace
    class requireDeviceUnlock

    // A drawable that can be rendered in Android's system UI for representing
    // the service.
    @ReferenceValue
    @UseAndroidNamespace
    class apduServiceBanner

    // Component name of an activity that allows the user to modify
    // the settings for this service.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// Use <code>offhost-apdu-service</code> as the root tag of the XML resource that
// describes an {@link android.nfc.cardemulation.OffHostApduService }
// service, which is referenced from its
// {@link android.nfc.cardemulation.OffHostApduService#SERVICE_META_DATA } entry.
@InnerStyleable(CoreAidGroupStyleable::class)
@UseAndroidNamespace
abstract class CoreOffHostApduServiceStyleable : BaseStyleable {
    // Short description of the functionality the service implements. This attribute
    // is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.description::class)
    class description

    // A drawable that can be rendered in Android's system UI for representing
    // the service.
    @Reuse(CoreHostApduServiceStyleable.apduServiceBanner::class)
    class apduServiceBanner

    // Component name of an activity that allows the user to modify
    // the settings for this service.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}


// Specify one or more <code>aid-group</code> elements inside a
// <code>host-apdu-service</code> or <code>offhost-apdu-service</code>
// element to define a group of ISO7816 Application ID (AIDs) that
// your service can handle.
@UseAndroidNamespace
abstract class CoreAidGroupStyleable : BaseStyleable {
    // Short description of what the AID group implements. This attribute is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.description::class)
    class description

    // The category attribute will be used by the Android platform to present
    // multiple applications that register ISO 7816 Application IDs (AIDs) in the
    // same category uniformly.
    // Additionally, when a category is specified, Android will ensure that either
    // all AIDs in this group are routed to this application, or none at all.
    // This attribute is optional.
    @StringValue
    @UseAndroidNamespace
    class category
}

// Specify one or more <code>aid-filter</code> elements inside a
// <code>aid-group</code> element to specify an ISO7816 Application ID (AID)
// your service can handle.
@InnerStyleable(CoreAidGroupStyleable::class)
@UseAndroidNamespace
abstract class CoreAidFilterStyleable : BaseStyleable {
    // The ISO7816 Application ID. This attribute is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.name::class)
    class name
}

// Specify one or more <code>aid-prefix-filter</code> elements inside a
//  <code>aid-group</code> element to specify an ISO7816 Application ID (AID)
//  prefix your service can handle.
@InnerStyleable(CoreAidGroupStyleable::class)
@UseAndroidNamespace
abstract class CoreAidPrefixFilterStyleable : BaseStyleable {
    // The ISO7816 Application ID. This attribute is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.name::class)
    class name
}

// Use <code>host-nfcf-service</code> as the root tag of the XML resource that
// describes an {@link android.nfc.cardemulation.HostNfcFService} service, which
// is referenced from its {@link android.nfc.cardemulation.HostNfcFService#SERVICE_META_DATA}
// entry.
@InnerStyleable(CoreSystemCodeFilterStyleable::class,
        CoreNfcid2FilterStyleable::class,
        CoreT3tPmmFilterStyleable::class)
@UseAndroidNamespace
abstract class CoreHostNfcFServiceStyleable : BaseStyleable {
    // Short description of the functionality the service implements. This attribute
    // is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.description::class)
    class description
}

// Specify one or more <code>system-code-filter</code> elements inside a
// <code>host-nfcf-service</code> element to specify a System Code
// your service can handle.
@UseAndroidNamespace
abstract class CoreSystemCodeFilterStyleable : BaseStyleable {
    // The System Code. This attribute is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.name::class)
    class name
}

// Specify one or more <code>nfcid2-filter</code> elements inside a
// <code>host-nfcf-service</code> element to specify a NFCID2
// your service can handle.
@UseAndroidNamespace
abstract class CoreNfcid2FilterStyleable : BaseStyleable {
    // The NFCID2. This attribute is mandatory.
    @Mandatory
    @Reuse(ManifestStyleable.name::class)
    class name
}

// Specify one or more <code>t3tPmm-filter</code> elements inside a
// <code>host-nfcf-service</code> element to specify a LF_T3T_PMM.
@UseAndroidNamespace
abstract class CoreT3tPmmFilterStyleable : BaseStyleable {
    @Reuse(ManifestStyleable.name::class)
    class name
}

@UseAndroidNamespace
abstract class CoreInputMethodServiceStyleable : BaseStyleable {
    // Background to use for entire input method when it is being
    // shown in fullscreen mode with the extract view, to ensure
    // that it completely covers the application.  This allows,
    // for example, the candidate view to be hidden
    // while in fullscreen mode without having the application show through
    // behind it.
    @ReferenceValue
    @ColorValue
    @UseAndroidNamespace
    class imeFullscreenBackground

    // Animation to use when showing the fullscreen extract UI after
    // it had previously been hidden.
    @ReferenceValue
    @UseAndroidNamespace
    class imeExtractEnterAnimation

    // Animation to use when hiding the fullscreen extract UI after
    // it had previously been shown.
    @ReferenceValue
    @UseAndroidNamespace
    class imeExtractExitAnimation
}

// Use <code>wallpaper</code> as the root tag of the XML resource that
// describes an
// {@link android.service.wallpaper.WallpaperService}, which is
// referenced from its
// {@link android.service.wallpaper.WallpaperService#SERVICE_META_DATA}
// meta-data entry.  Described here are the attributes that can be
// included in that tag.
@UseAndroidNamespace
abstract class CoreWallpaperStyleable : BaseStyleable {
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Reference to the wallpaper's thumbnail bitmap.
    @ReferenceValue
    @UseAndroidNamespace
    class thumbnail

    // Name of the author and/or source/collection of this component, for example,
    // Art Collection, Picasso.
    @ReferenceValue
    @UseAndroidNamespace
    class author

    // Short description of the component's purpose or behavior.
    @Reuse(ManifestStyleable.description::class)
    class description

    // Uri that specifies a link for further context of this wallpaper, for example,
    // http://www.picasso.org.
    @ReferenceValue
    @UseAndroidNamespace
    class contextUri

    // Title of the uri that specifies a link for further context of this wallpaper,
    // for example, Explore collection.
    @ReferenceValue
    @UseAndroidNamespace
    class contextDescription

    // Whether to show any metadata when previewing the wallpaper. If this value is
    // set to true, any component that shows a preview of this live wallpaper should also show
    // accompanying information like the title, the description, the author and the context
    // description of this wallpaper so the user gets to know further information about this
    // wallpaper.
    @BooleanValue
    @UseAndroidNamespace
    class showMetadataInPreview
}

// Use <code>dream</code> as the root tag of the XML resource that
// describes an
// {@link android.service.dreams.DreamService}, which is
// referenced from its
// {@link android.service.dreams.DreamService#DREAM_META_DATA}
// meta-data entry.  Described here are the attributes that can be
// included in that tag.
@UseAndroidNamespace
abstract class CoreDreamStyleable : BaseStyleable {
    // Component name of an activity that allows the user to modify
    // the settings for this dream.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// Use <code>trust-agent</code> as the root tag of the XML resource that
// describes an {@link android.service.trust.TrustAgentService}, which is
// referenced from its {@link android.service.trust.TrustAgentService#TRUST_AGENT_META_DATA}
// meta-data entry.  Described here are the attributes that can be included in that tag.
@Hide
@SystemApi
@UseAndroidNamespace
abstract class CoreTrustAgentStyleable : BaseStyleable {
    // Component name of an activity that allows the user to modify
    // the settings for this trust agent.
    @SystemApi
    @Hide
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Title for a preference that allows that user to launch the
    // activity to modify trust agent settings.
    @SystemApi
    @Hide
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // Summary for the same preference as the title.
    @SystemApi
    @Hide
    @Reuse(CorePreferenceHeaderStyleable.summary::class)
    class summary

    // Whether trust agent can unlock a user profile
    @SystemApi
    @Hide
    @BooleanValue
    @UseAndroidNamespace
    class unlockProfile
}

// ===============================
// Autofill attributes
// ===============================
// Use <code>autofill-service</code> as the root tag of the XML resource that describes a
// {@link android.service.autofill.AutofillService}, which is referenced from its
// {@link android.service.autofill#SERVICE_META_DATA} meta-data entry.
@UseAndroidNamespace
abstract class CoreAutofillServiceStyleable : BaseStyleable {
    // Fully qualified class name of an activity that allows the user to modify
    // the settings for this service.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// ===============================
// Location package class attributes
// ===============================

// Use <code>injected-location-setting</code> as the root tag of the XML resource that
// describes an injected "Location services" setting. Note that the status value (subtitle)
// for the setting is specified dynamically by a subclass of SettingInjectorService.
@UseAndroidNamespace
abstract class CoreSettingInjectorServiceStyleable : BaseStyleable {
    // The title for the preference.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // The icon for the preference, should refer to all apps covered by the setting. Typically
    // a generic icon for the developer.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // The activity to launch when the setting is clicked on.
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// Use <code>recognition-service</code> as the root tag of the XML resource that
// describes a {@link android.speech.RecognitionService}, which is referenced from
// its {@link android.speech.RecognitionService#SERVICE_META_DATA} meta-data entry.
// Described here are the attributes that can be included in that tag.
@UseAndroidNamespace
abstract class CoreRecognitionServiceStyleable : BaseStyleable {
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// Use <code>voice-interaction-service</code> as the root tag of the XML resource that
// describes a {@link android.service.voice.VoiceInteractionService}, which is referenced from
// its {@link android.service.voice.VoiceInteractionService#SERVICE_META_DATA} meta-data entry.
// Described here are the attributes that can be included in that tag.
@UseAndroidNamespace
abstract class CoreVoiceInteractionServiceStyleable : BaseStyleable {
    // The service that hosts active voice interaction sessions.  This is required.
    @StringValue
    @UseAndroidNamespace
    class sessionService

    // The service that provides voice recognition.  This is required.  When the user
    // selects this voice interaction service, they will also be implicitly selecting
    // the component here for their recognition service.
    @StringValue
    @UseAndroidNamespace
    class recognitionService

    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Flag indicating whether this voice interaction service is capable of handling the
    // assist action.
    @BooleanValue
    @UseAndroidNamespace
    class supportsAssist

    // Flag indicating whether this voice interaction service is capable of being launched
    // from the keyguard.
    @BooleanValue
    @UseAndroidNamespace
    class supportsLaunchVoiceAssistFromKeyguard

    // Flag indicating whether this voice interaction service can handle local voice
    // interaction requests from an Activity. This flag is new in
    // {@link android.os.Build.VERSION_CODES#N} and not used in previous versions.
    @BooleanValue
    @UseAndroidNamespace
    class supportsLocalInteraction
}

// Use <code>tts-engine</code> as the root tag of the XML resource that
// describes a text to speech engine implemented as a subclass of
// {@link android.speech.tts.TextToSpeechService}.
// The XML resource must be referenced from its
// {@link android.speech.tts.TextToSpeech.Engine#SERVICE_META_DATA} meta-data
// entry.
@UseAndroidNamespace
abstract class CoreTextToSpeechEngineStyleable : BaseStyleable {
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity
}

// Use <code>tv-input</code> as the root tag of the XML resource that describes a
// {@link android.media.tv.TvInputService}, which is referenced from its
// {@link android.media.tv.TvInputService#SERVICE_META_DATA} meta-data entry.
// Described here are the attributes that can be included in that tag.
@InnerStyleable(CoreRatingSystemDefinitionStyleable::class,
        CoreRatingDefinitionStyleable::class)
@UseAndroidNamespace
abstract class CoreTvInputServiceStyleable : BaseStyleable {
    // Component name of an activity that allows the user to set up this service.
    @StringValue
    @UseAndroidNamespace
    class setupActivity

    // Component name of an activity that allows the user to modify the settings for this
    // service.
    @Deprecated("""This value is deprecated and not used by the framework starting from API
        level 26. Use setupActivity instead.""")
    @Reuse(CoreInputMethodStyleable.settingsActivity::class)
    class settingsActivity

    // Attribute whether the TV input service can record programs. This value can be changed
    // at runtime by calling
    // {@link android.media.tv.TvInputManager#updateTvInputInfo(android.media.tv.TvInputInfo)}.
    @BooleanValue
    @UseAndroidNamespace
    class canRecord

    // The number of tuners that the TV input service is associated with. This value can be
    // changed at runtime by calling
    // {@link android.media.tv.TvInputManager#updateTvInputInfo(android.media.tv.TvInputInfo)}.
    @IntegerValue
    @UseAndroidNamespace
    class tunerCount
}

// Attributes that can be used with <code>rating-system-definition</code> tags inside of the
// XML resource that describes TV content rating of a {@link android.media.tv.TvInputService},
// which is referenced from its
// {@link android.media.tv.TvInputManager#META_DATA_CONTENT_RATING_SYSTEMS}.
@UseAndroidNamespace
abstract class CoreRatingSystemDefinitionStyleable : BaseStyleable {
    // The unique name of the content rating system.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The title of the content rating system which is shown to the user.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // The short description of the content rating system.
    @Reuse(ManifestStyleable.description::class)
    class description

    // The country code associated with the content rating system, which consists of two
    // uppercase letters that conform to the ISO 3166 standard.
    @StringValue
    @UseAndroidNamespace
    class country
}

// Attributes that can be used with <code>rating-definition</code> tags inside of the XML
// resource that describes TV content rating of a {@link android.media.tv.TvInputService},
// which is referenced from its
// {@link android.media.tv.TvInputManager#META_DATA_CONTENT_RATING_SYSTEMS}.
@UseAndroidNamespace
abstract class CoreRatingDefinitionStyleable : BaseStyleable {
    // The unique name of the content rating.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The title of the content rating which is shown to the user.
    @Reuse(CoreMenuItemStyleable.title::class)
    class title

    // The short description of the content rating.
    @Reuse(ManifestStyleable.description::class)
    class description

    // The age associated with the content rating. The content of this rating is suitable for
    // people of this age or above.
    @IntegerValue
    @UseAndroidNamespace
    class contentAgeHint
}