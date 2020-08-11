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

// Use specific transition subclass names as the root tag of the XML resource that
// describes a {@link android.transition.Transition Transition},
// such as <code>changeBounds</code>, <code>fade</code>, and <code>transitionSet</code>.
@InnerStyleable(CoreTransitionTargetStyleable::class,
        CoreArcMotionStyleable::class,
        CorePatternPathMotionStyleable::class)
@UseAndroidNamespace
abstract class CoreTransitionStyleable : BaseStyleable {
    // Amount of time (in milliseconds) that the transition should run.
    @Reuse(CoreAnimationDrawableItemStyleable.duration::class)
    class duration

    // Delay in milliseconds before the transition starts.
    @IntegerValue
    @UseAndroidNamespace
    class startDelay

    // Interpolator to be used in the animations spawned by this transition.
    @Reuse(CoreProgressBarStyleable.interpolator::class)
    class interpolator

    // The match order to use for the transition. This is a comma-separated
    // list of values, containing one or more of the following:
    // id, itemId, name, instance. These correspond to
    // {@link android.transition.Transition#MATCH_ID},
    // {@link android.transition.Transition#MATCH_ITEM_ID},
    // {@link android.transition.Transition#MATCH_NAME}, and
    // {@link android.transition.Transition#MATCH_INSTANCE}, respectively.
    // This corresponds to {@link android.transition.Transition#setMatchOrder(int...)}.
    @StringValue
    @UseAndroidNamespace
    class matchOrder
}

@Hide("For internal use only. Use only as directed.")
@UseAndroidNamespace
abstract class CoreEpicenterTranslateClipRevealStyleable : CoreVisibilityTransitionStyleable() {
    @ReferenceValue
    @UseAndroidNamespace
    class interpolatorX

    @ReferenceValue
    @UseAndroidNamespace
    class interpolatorY

    @ReferenceValue
    @UseAndroidNamespace
    class interpolatorZ
}

// Use <code>fade</code>as the root tag of the XML resource that
// describes a {@link android.transition.Fade Fade} transition.
// The attributes of the {@link android.R.styleable#Transition Transition}
// resource are available in addition to the specific attributes of Fade
// described here.
@UseAndroidNamespace
abstract class CoreFadeStyleable : CoreVisibilityTransitionStyleable() {
    enum class FadingModeEnum(val value: Int) : StyleableEnum {
        // Fade will only fade appearing items in.
        fade_in(1),
        // Fade will only fade disappearing items out.
        fade_out(2),
        // Fade will fade appearing items in and disappearing items out.
        fade_in_out(3)
    }

    // Equivalent to <code>transitionVisibilityMode</code>, fadingMode works only
    // with the Fade transition.
    @EnumValue(FadingModeEnum::class)
    @UseAndroidNamespace
    class fadingMode
}

// Use <code>slide</code>as the root tag of the XML resource that
// describes a {@link android.transition.Slide Slide} transition.
// The attributes of the {@link android.R.styleable#Transition Transition}
// resource are available in addition to the specific attributes of Slide
// described here.
@UseAndroidNamespace
abstract class CoreSlideStyleable : CoreVisibilityTransitionStyleable() {
    enum class SlideEdgeEnum(val value: Int) : StyleableEnum {
        // Slide to and from the left edge of the Scene.
        left(0x03),
        // Slide to and from the top edge of the Scene.
        top(0x30),
        // Slide to and from the right edge of the Scene.
        right(0x05),
        // Slide to and from the bottom edge of the Scene.
        bottom(0x50),
        // Slide to and from the x-axis position at the start of the Scene root.
        start(0x00800003),
        // Slide to and from the x-axis position at the end of the Scene root.
        end(0x00800005)
    }

    // Indicates what shape to fill with a gradient.
    @EnumValue(SlideEdgeEnum::class)
    @UseAndroidNamespace
    class slideEdge
}

// Use with {@link android.transition.Visibility} transitions, such as
// <code>slide</code>, <code>explode</code>, and <code>fade</code> to mark which
// views are supported.
@UseAndroidNamespace
abstract class CoreVisibilityTransitionStyleable : CoreTransitionStyleable() {
    enum class TransitionVisibilityModeFlag(val value: Long) : StyleableFlag {
        // Only appearing Views will be supported.
        mode_in(1),
        // Only disappearing Views will be supported.
        mode_out(2)
    }

    // Changes whether the transition supports appearing and/or disappearing Views.
    // Corresponds to {@link android.transition.Visibility#setMode(int)}.
    @FlagValue(TransitionVisibilityModeFlag::class)
    @UseAndroidNamespace
    class transitionVisibilityMode
}

// Use <code>target</code> as the root tag of the XML resource that
// describes a {@link android.transition.Transition#addTarget(int)
//     targetId} of a transition. There can be one or more targets inside
// a <code>targets</code> tag, which is itself inside an appropriate
// {@link android.R.styleable#Transition Transition} tag.
@UseAndroidNamespace
abstract class CoreTransitionTargetStyleable : BaseStyleable {
    // The id of a target on which this transition will animate changes.
    @ReferenceValue
    @UseAndroidNamespace
    class targetId

    // The id of a target to exclude from this transition.
    @ReferenceValue
    @UseAndroidNamespace
    class excludeId

    // The fully-qualified name of the Class to include in this transition.
    @Reuse(ManifestIntentStyleable.targetClass::class)
    class targetClass

    // The fully-qualified name of the Class to exclude from this transition.
    @StringValue
    @UseAndroidNamespace
    class excludeClass

    // The transitionName of the target on which this transition will animation changes.
    @StringValue
    @UseAndroidNamespace
    class targetName

    // The transitionName of the target to exclude from this transition.
    @StringValue
    @UseAndroidNamespace
    class excludeName
}

// Use <code>set</code> as the root tag of the XML resource that
// describes a {@link android.transition.TransitionSet
//     TransitionSet} transition.
@UseAndroidNamespace
abstract class CoreTransitionSetStyleable : BaseStyleable {
    enum class TransitionOrderingEnum(val value: Int) : StyleableEnum {
        // child transitions should be played together.
        together(0),
        // child transitions should be played sequentially, in the same order
        // as the xml.
        sequential(1)
    }

    @EnumValue(TransitionOrderingEnum::class)
    @UseAndroidNamespace
    class transitionOrdering
}

// Use <code>changeTransform</code> as the root tag of the XML resource that
// describes a {@link android.transition.ChangeTransform} transition.
@UseAndroidNamespace
abstract class CoreChangeTransformStyleable : CoreTransitionStyleable() {
    // A parent change should use an overlay or affect the transform of the
    // transitionining View. Default is true. Corresponds to
    // {@link android.transition.ChangeTransform#setReparentWithOverlay(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class reparentWithOverlay

    // Tells ChangeTransform to track parent changes. Default is true. Corresponds to
    // {@link android.transition.ChangeTransform#setReparent(boolean)}.
    @BooleanValue
    @UseAndroidNamespace
    class reparent
}

// Use <code>changeBounds</code>as the root tag of the XML resource that
// describes a {@link android.transition.ChangeBounds} transition.
// The attributes of the {@link android.R.styleable#Transition Transition}
// resource are available in addition to the specific attributes of ChangeBounds
// described here.
@UseAndroidNamespace
abstract class CoreChangeBoundsStyleable : CoreTransitionStyleable() {
    // Resize the view by adjusting the clipBounds rather than changing the
    // dimensions of the view itself. The default value is false.
    @BooleanValue
    @UseAndroidNamespace
    class resizeClip
}

// Use <code>transitionManager</code> as the root tag of the XML resource that
// describes a {@link android.transition.TransitionManager
//     TransitionManager}.
@UseAndroidNamespace
abstract class CoreTransitionManagerStyleable : BaseStyleable {
    // The id of a transition to be used in a particular scene change.
    @ReferenceValue
    @UseAndroidNamespace
    class transition

    // The originating scene in this scene change.
    @ReferenceValue
    @UseAndroidNamespace
    class fromScene

    // The destination scene in this scene change.
    @ReferenceValue
    @UseAndroidNamespace
    class toScene
}

// Use <code>arcMotion</code> as the root tag of the XML resource that
// describes a {@link android.transition.ArcMotion}. This must be used
// within a transition with which the PathMotion should be associated.
@UseAndroidNamespace
abstract class CoreArcMotionStyleable : BaseStyleable {
    // The minimum arc angle in degrees between the start and end points when
    // they are close to horizontal.
    @FloatValue
    @UseAndroidNamespace
    class minimumHorizontalAngle

    // The minimum arc angle in degrees between the start and end points when
    // they are close to vertical.
    @FloatValue
    @UseAndroidNamespace
    class minimumVerticalAngle

    // The maximum arc angle in degrees between the start and end points.
    @FloatValue
    @UseAndroidNamespace
    class maximumAngle
}

// Use <code>patternPathMotion</code> as the root tag of the XML resource that
// describes a {@link android.transition.PatternPathMotion}. This must be used
// within a transition with which the PathMotion should be associated.
@UseAndroidNamespace
abstract class CorePatternPathMotionStyleable : BaseStyleable {
    // The path string describing the pattern to use for the PathPathMotion.
    @StringValue
    @UseAndroidNamespace
    class patternPathData
}