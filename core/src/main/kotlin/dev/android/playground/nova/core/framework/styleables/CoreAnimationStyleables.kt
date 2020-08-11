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
abstract class CoreAnimationStyleable : BaseStyleable {
    // Defines the interpolator used to smooth the animation movement in time.
    @Reuse(CoreProgressBarStyleable.interpolator::class)
    class interpolator

    // When set to true, the value of fillBefore is taken into account.
    @BooleanValue
    @UseAndroidNamespace
    class fillEnabled

    // When set to true or when fillEnabled is not set to true, the animation transformation
    // is applied before the animation has started. The default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class fillBefore

    // When set to true, the animation transformation is applied after the animation is
    // over. The default value is false. If fillEnabled is not set to true and the
    // animation is not set on a View, fillAfter is assumed to be true.-->
    @BooleanValue
    @UseAndroidNamespace
    class fillAfter

    // Amount of time (in milliseconds) for the animation to run.
    @Reuse(CoreAnimationDrawableItemStyleable.duration::class)
    class duration

    // Delay in milliseconds before the animation runs, once start time is reached.
    @IntegerValue
    @UseAndroidNamespace
    class startOffset

    enum class RepeatCountEnum(val value: Int) : StyleableEnumAndInteger {
        infinite(-1)
    }

    // Defines how many times the animation should repeat. The default value is 0.
    @EnumAndIntegerValue(RepeatCountEnum::class)
    @UseAndroidNamespace
    class repeatCount

    enum class RepeatModeEnum(val value: Int) : StyleableEnum {
        // The animation starts again from the beginning.
        restart(1),
        // The animation plays backward.
        reverse(2)
    }

    // Defines the animation behavior when it reaches the end and the repeat count is
    // greater than 0 or infinite. The default value is restart.
    @EnumValue(RepeatModeEnum::class)
    @UseAndroidNamespace
    class repeatMode

    enum class ZAdjustmentEnum(val value: Int) : StyleableEnum {
        // The content being animated be kept in its current Z order.
        normal(0),
        // The content being animated is forced on top of all other
        // content for the duration of the animation.
        top(1),
        // The content being animated is forced under all other
        // content for the duration of the animation.
        bottom(-1)
    }

    // Allows for an adjustment of the Z ordering of the content being
    // animated for the duration of the animation.  The default value is normal.
    @EnumValue(ZAdjustmentEnum::class)
    @UseAndroidNamespace
    class zAdjustment

    // Special background behind animation.  Only for use with window
    // animations.  Can only be a color, and only black.  If 0, the
    // default, there is no background.
    @Reuse(CoreViewStyleable.background::class)
    class background

    // Special option for window animations: if this window is on top
    // of a wallpaper, don't animate the wallpaper with it.
    @BooleanValue
    @UseAndroidNamespace
    class detachWallpaper
}

@UseAndroidNamespace
abstract class CoreAnimationSetStyleable : BaseStyleable {
    @BooleanValue
    @UseAndroidNamespace
    class shareInterpolator

    @Reuse(CoreAnimationStyleable.fillBefore::class)
    class fillBefore

    @Reuse(CoreAnimationStyleable.fillAfter::class)
    class fillAfter

    @Reuse(CoreAnimationDrawableItemStyleable.duration::class)
    class duration

    @Reuse(CoreAnimationStyleable.startOffset::class)
    class startOffset

    @Reuse(CoreAnimationStyleable.repeatMode::class)
    class repeatMode
}

@UseAndroidNamespace
abstract class CoreRotateAnimationStyleable : CoreAnimationStyleable() {
    @Reuse(CoreRotateDrawableStyleable.fromDegrees::class)
    class fromDegrees

    @Reuse(CoreRotateDrawableStyleable.toDegrees::class)
    class toDegrees

    @Reuse(CoreRotateDrawableStyleable.pivotX::class)
    class pivotX

    @Reuse(CoreRotateDrawableStyleable.pivotY::class)
    class pivotY
}

@UseAndroidNamespace
abstract class CoreScaleAnimationStyleable : CoreAnimationStyleable() {
    @FloatValue
    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class fromXScale

    @FloatValue
    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class toXScale

    @FloatValue
    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class fromYScale

    @FloatValue
    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class toYScale

    @Reuse(CoreRotateDrawableStyleable.pivotX::class)
    class pivotX

    @Reuse(CoreRotateDrawableStyleable.pivotY::class)
    class pivotY
}

@UseAndroidNamespace
abstract class CoreTranslateAnimationStyleable : CoreAnimationStyleable() {
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class fromXDelta

    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class toXDelta

    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class fromYDelta

    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class toYDelta
}

@UseAndroidNamespace
abstract class CoreAlphaAnimationStyleable : CoreAnimationStyleable() {
    @FloatValue
    @UseAndroidNamespace
    class fromAlpha

    @FloatValue
    @UseAndroidNamespace
    class toAlpha
}

@UseAndroidNamespace
abstract class CoreLayoutAnimationStyleable : CoreAnimationStyleable() {
    // Fraction of the animation duration used to delay the beginning of
    // the animation of each child.
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class delay

    // Animation to use on each child.
    @ReferenceValue
    @UseAndroidNamespace
    class animation

    enum class AnimationOrderEnum(val value: Int) : StyleableEnum {
        // Animations are started in the natural order.
        normal(0),
        // Animations are started in the reverse order.
        reverse(1),
        // Animations are started randomly.
        random(2),
    }

    // The order in which the animations will be started.
    @EnumValue(AnimationOrderEnum::class)
    @UseAndroidNamespace
    class animationOrder

    // Interpolator used to interpolate the delay between the start of
    // each animation.
    @Reuse(CoreProgressBarStyleable.interpolator::class)
    class interpolator
}

@UseAndroidNamespace
abstract class CoreGridLayoutAnimationStyleable : CoreAnimationStyleable() {
    // Fraction of the animation duration used to delay the beginning of
    // the animation of each column.
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class columnDelay

    // Fraction of the animation duration used to delay the beginning of
    // the animation of each row.
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class rowDelay

    enum class DirectionFlag(val value: Long) : StyleableFlag {
        // Animates columns from left to right.
        left_to_right(0x0),
        // Animates columns from right to left.
        right_to_left(0x1),
        // Animates rows from top to bottom.
        top_to_bottom(0x0),
        // Animates rows from bottom to top.
        bottom_to_top(0x2)
    }

    // Direction of the animation in the grid.
    @FlagValue(DirectionFlag::class)
    @UseAndroidNamespace
    class direction

    enum class DirectionPriorityEnum(val value: Int) : StyleableEnum {
        // Rows and columns are animated at the same time.
        none(0),
        // Columns are animated first.
        column(1),
        // Rows are animated first.
        row(2)
    }

    // Priority of the rows and columns. When the priority is none,
    // both rows and columns have the same priority. When the priority is
    // column, the animations will be applied on the columns first. The same
    // goes for rows.
    @EnumValue(DirectionPriorityEnum::class)
    @UseAndroidNamespace
    class directionPriority

}

@UseAndroidNamespace
abstract class CoreAccelerateInterpolatorStyleable : BaseStyleable {
    // This is the amount of deceleration to add when easing in.
    @FloatValue
    @UseAndroidNamespace
    class factor
}

@UseAndroidNamespace
abstract class CoreDecelerateInterpolatorStyleable : BaseStyleable {
    // This is the amount of acceleration to add when easing out.
    @Reuse(CoreAccelerateInterpolatorStyleable.factor::class)
    class factor
}

@UseAndroidNamespace
abstract class CoreCycleInterpolatorStyleable : BaseStyleable {
    @FloatValue
    @UseAndroidNamespace
    class cycles
}

@UseAndroidNamespace
abstract class CoreAnticipateInterpolatorStyleable : BaseStyleable {
    // This is the amount of tension.
    @FloatValue
    @UseAndroidNamespace
    class tension
}

@UseAndroidNamespace
abstract class CoreOvershootInterpolatorStyleable : BaseStyleable {
    // This is the amount of tension.
    @Reuse(CoreAnticipateInterpolatorStyleable.tension::class)
    class tension
}

@UseAndroidNamespace
abstract class CoreAnticipateOvershootInterpolatorStyleable : BaseStyleable {
    // This is the amount of tension.
    @Reuse(CoreAnticipateInterpolatorStyleable.tension::class)
    class tension

    // This is the amount by which to multiply the tension.
    @FloatValue
    @UseAndroidNamespace
    class extraTension
}

@UseAndroidNamespace
abstract class CorePathInterpolatorStyleable : BaseStyleable {
    // The x coordinate of the first control point of the cubic Bezier.
    @FloatValue
    @UseAndroidNamespace
    class controlX1

    // The y coordinate of the first control point of the cubic Bezier.
    @FloatValue
    @UseAndroidNamespace
    class controlY1

    // The x coordinate of the second control point of the cubic Bezier.
    @FloatValue
    @UseAndroidNamespace
    class controlX2

    // The y coordinate of the second control point of the cubic Bezier.
    @FloatValue
    @UseAndroidNamespace
    class controlY2

    // The control points defined as a path.
    // When pathData is defined, then both of the control points of the
    // cubic Bezier will be ignored.
    @Reuse(CoreVectorDrawablePathStyleable.pathData::class)
    class pathData
}