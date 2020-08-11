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

// ==========================
// ValueAnimator class attributes
// ==========================

@UseAndroidNamespace
abstract class CoreAnimatorStyleable : BaseStyleable {
    // Defines the interpolator used to smooth the animation movement in time.
    @Reuse(CoreProgressBarStyleable.interpolator::class)
    class interpolator

    // Amount of time (in milliseconds) for the animation to run.
    @Reuse(CoreAnimationDrawableItemStyleable.duration::class)
    class duration

    // Delay in milliseconds before the animation runs, once start time is reached.
    @Reuse(CoreAnimationStyleable.startOffset::class)
    class startOffset

    // Defines how many times the animation should repeat. The default value is 0.
    @Reuse(CoreAnimationStyleable.repeatCount::class)
    class repeatCount

    // Defines the animation behavior when it reaches the end and the repeat count is
    // greater than 0 or infinite. The default value is restart.
    @Reuse(CoreAnimationStyleable.repeatMode::class)
    class repeatMode

    // Value the animation starts from.
    @FloatValue
    @IntegerValue
    @ColorValue
    @DimensionValue
    @StringValue
    @UseAndroidNamespace
    class valueFrom

    // Value the animation animates to.
    @FloatValue
    @IntegerValue
    @ColorValue
    @DimensionValue
    @StringValue
    @UseAndroidNamespace
    class valueTo

    enum class ValueTypeEnum(val value: Int) : StyleableEnum {
        // The given values are floats. This is the default value if valueType is
        // unspecified. Note that if any value attribute has a color value
        // (beginning with "#"), then this attribute is ignored and the color values are
        // interpreted as integers.
        floatType(0),
        // values are integers.
        intType(1),
        // values are paths defined as strings.
        // This type is used for path morphing in AnimatedVectorDrawable.
        pathType(2),
        // values are colors, which are integers starting with "#".
        colorType(3)
    }

    // The type of valueFrom and valueTo.
    @EnumValue(ValueTypeEnum::class)
    @UseAndroidNamespace
    class valueType

    // Placeholder for a deleted attribute. This should be removed before M release.
    @SkipForDSL
    @IntegerValue
    @UseAndroidNamespace
    class removeBeforeMRelease
}

@UseAndroidNamespace
abstract class CorePropertyValuesHolderStyleable : BaseStyleable {
    @Reuse(CoreAnimatorStyleable.valueType::class)
    class valueType

    @Reuse(CorePropertyAnimatorStyleable.propertyName::class)
    class propertyName

    @Reuse(CoreAnimatorStyleable.valueFrom::class)
    class valueFrom

    @Reuse(CoreAnimatorStyleable.valueTo::class)
    class valueTo
}

@UseAndroidNamespace
abstract class CoreKeyframeStyleable : BaseStyleable {
    @Reuse(CoreAnimatorStyleable.valueType::class)
    class valueType

    @Reuse(ManifestStyleable.name::class)
    class value

    @FloatValue
    @UseAndroidNamespace
    class fraction

    // Defines a per-interval interpolator for this keyframe. This interpolator will be used
    // to interpolate between this keyframe and the previous keyframe.
    @Reuse(CoreProgressBarStyleable.interpolator::class)
    class interpolator
}

// ==========================
// ObjectAnimator class attributes
// ==========================

@UseAndroidNamespace
abstract class CorePropertyAnimatorStyleable : BaseStyleable {
    // Name of the property being animated.
    @StringValue
    @UseAndroidNamespace
    class propertyName

    // Name of the property being animated as the X coordinate of the pathData.
    @StringValue
    @UseAndroidNamespace
    class propertyXName

    // Name of the property being animated as the Y coordinate of the pathData.
    @StringValue
    @UseAndroidNamespace
    class propertyYName

    // The path used to animate the properties in the ObjectAnimator.
    @Reuse(CoreVectorDrawablePathStyleable.pathData::class)
    class pathData
}

// ==========================
// AnimatorSet class attributes
// ==========================

@UseAndroidNamespace
abstract class CoreAnimatorSetStyleable : BaseStyleable {
    enum class OrderingEnum(val value: Int) : StyleableEnum {
        // child animations should be played together.
        together(0),
        // child animations should be played sequentially, in the same order as the xml.
        sequentially(1),
    }

    // Name of the property being animated.
    @EnumValue(OrderingEnum::class)
    @UseAndroidNamespace
    class ordering
}