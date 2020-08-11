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

// Base attributes that are available to all Drawable objects.
@InnerStyleable(CoreDrawableStatesStyleable::class)
@UseAndroidNamespace
abstract class CoreDrawableStyleable : BaseStyleable {
    // Provides initial visibility state of the drawable; the default
    // value is false.  See
    // {@link android.graphics.drawable.Drawable#setVisible}.
    @BooleanValue
    @UseAndroidNamespace
    class visible

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).  See
    // {@link android.graphics.drawable.Drawable#setAutoMirrored}.
    @BooleanValue
    @UseAndroidNamespace
    class autoMirrored
}

// Drawable class used to wrap other drawables.
@UseAndroidNamespace
abstract class CoreDrawableWrapperStyleable : BaseStyleable {
    // The wrapped drawable.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Drawable used to render several states. Each state is represented by
// a child drawable.
@InnerStyleable(CoreStateListDrawableItemStyleable::class,
        CoreStateListAnimatorItemStyleable::class)
@UseAndroidNamespace
abstract class CoreStateListDrawableStyleable : CoreDrawableStyleable() {
    // Indicates whether the drawable should be initially visible.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    // If true, allows the drawable's padding to change based on the
    // current state that is selected.  If false, the padding will
    // stay the same (based on the maximum padding of all the states).
    // Enabling this feature requires that the owner of the drawable
    // deal with performing layout when the state changes, which is
    // often not supported.
    @BooleanValue
    @UseAndroidNamespace
    class variablePadding

    // If true, the drawable's reported internal size will remain
    // constant as the state changes; the size is the maximum of all
    // of the states.  If false, the size will vary based on the
    // current state.
    @BooleanValue
    @UseAndroidNamespace
    class constantSize

    // Enables or disables dithering of the bitmap if the bitmap does not have the
    // same pixel configuration as the screen (for instance: a ARGB 8888 bitmap with
    // an RGB 565 screen).
    @BooleanValue
    @UseAndroidNamespace
    class dither

    // Amount of time (in milliseconds) to fade in a new state drawable.
    @IntegerValue
    @UseAndroidNamespace
    class enterFadeDuration

    // Amount of time (in milliseconds) to fade out an old state drawable.
    @IntegerValue
    @UseAndroidNamespace
    class exitFadeDuration

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored
}


// Drawable used to render several states with animated transitions. Each state
// is represented by a child drawable with an optional keyframe ID.
@InnerStyleable(CoreAnimatedStateListDrawableItemStyleable::class,
        CoreAnimatedStateListDrawableTransitionStyleable::class)
@UseAndroidNamespace
abstract class CoreAnimatedStateListDrawableStyleable : CoreDrawableStyleable() {
    // Indicates whether the drawable should be initially visible.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    // If true, allows the drawable's padding to change based on the
    // current state that is selected.  If false, the padding will
    // stay the same (based on the maximum padding of all the states).
    // Enabling this feature requires that the owner of the drawable
    // deal with performing layout when the state changes, which is
    // often not supported.
    @Reuse(CoreStateListDrawableStyleable.variablePadding::class)
    class variablePadding

    // If true, the drawable's reported internal size will remain
    // constant as the state changes; the size is the maximum of all
    // of the states.  If false, the size will vary based on the
    // current state.
    @Reuse(CoreStateListDrawableStyleable.constantSize::class)
    class constantSize

    // Enables or disables dithering of the bitmap if the bitmap does not have the
    // same pixel configuration as the screen (for instance: a ARGB 8888 bitmap with
    // an RGB 565 screen).
    @Reuse(CoreStateListDrawableStyleable.dither::class)
    class dither

    // Amount of time (in milliseconds) to fade in a new state drawable.
    @Reuse(CoreStateListDrawableStyleable.enterFadeDuration::class)
    class enterFadeDuration

    // Amount of time (in milliseconds) to fade out an old state drawable.
    @Reuse(CoreStateListDrawableStyleable.exitFadeDuration::class)
    class exitFadeDuration

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored
}

// Represents a single state inside a StateListDrawable.
@UseAndroidNamespace
abstract class CoreStateListDrawableItemStyleable : BaseStyleable {
    // Reference to a drawable resource to use for the state. If not
    // given, the drawable must be defined by the first child tag.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Transition used to animate between states with keyframe IDs.
@UseAndroidNamespace
abstract class CoreAnimatedStateListDrawableItemStyleable : BaseStyleable {
    // Reference to a drawable resource to use for the frame.  If not
    // given, the drawable must be defined by the first child tag.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable

    // Keyframe identifier for use in specifying transitions.
    @Reuse(CoreViewStyleable.id::class)
    class id
}

// Transition used to animate between states with keyframe IDs.
@UseAndroidNamespace
abstract class CoreAnimatedStateListDrawableTransitionStyleable : BaseStyleable {
    // Keyframe identifier for the starting state.
    @ReferenceValue
    @UseAndroidNamespace
    class fromId

    // Keyframe identifier for the ending state.
    @ReferenceValue
    @UseAndroidNamespace
    class toId

    // Reference to a animation drawable resource to use for the frame.  If not
    // given, the animation drawable must be defined by the first child tag.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable

    // Whether this transition is reversible.
    @BooleanValue
    @UseAndroidNamespace
    class reversible
}


// Drawable used to render several animated frames.
@InnerStyleable(CoreAnimationDrawableItemStyleable::class)
@UseAndroidNamespace
abstract class CoreAnimationDrawableStyleable : CoreDrawableStyleable() {
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    @Reuse(CoreStateListDrawableStyleable.variablePadding::class)
    class variablePadding

    // If true, the animation will only run a single time and then
    // stop.  If false (the default), it will continually run,
    // restarting at the first frame after the last has finished.
    @BooleanValue
    @UseAndroidNamespace
    class oneshot
}

// Represents a single frame inside an AnimationDrawable.
@UseAndroidNamespace
abstract class CoreAnimationDrawableItemStyleable : BaseStyleable {
    // Amount of time (in milliseconds) to display this frame.
    @IntegerValue
    @UseAndroidNamespace
    class duration

    // Reference to a drawable resource to use for the frame.  If not
    // given, the drawable must be defined by the first child tag.
    @ReferenceValue
    @UseAndroidNamespace
    class drawable
}

// Attributes that can be assigned to a StateListAnimator item.
@UseAndroidNamespace
abstract class CoreStateListAnimatorItemStyleable : BaseStyleable {
    @Reuse(CoreLayoutAnimationStyleable.animation::class)
    class animation
}

// Attributes that can be assigned to a ColorStateList item.
@UseAndroidNamespace
abstract class CoreColorStateListItemStyleable : BaseStyleable {
    // Base color for this state.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color

    // Alpha multiplier applied to the base color.
    @Reuse(CoreViewStyleable.alpha::class)
    class alpha
}

// Drawable used to render according to the animation scale. Esp. when it is 0 due to battery
// saver mode. It should contain one animatable drawable and one static drawable.
@Hide
@InnerStyleable(CoreAnimationScaleListDrawableItemStyleable::class)
@UseAndroidNamespace
abstract class CoreAnimationScaleListDrawableStyleable : CoreDrawableStyleable()

// Attributes that can be assigned to a AnimationScaleListDrawable item.
@Hide
@UseAndroidNamespace
abstract class CoreAnimationScaleListDrawableItemStyleable : BaseStyleable {
    // Reference to a drawable resource to use for the state. If not
    // given, the drawable must be defined by the first child tag.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Drawable used to render a geometric shape, with a gradient or a solid color.
@InnerStyleable(CoreGradientDrawableSizeStyleable::class,
        CoreGradientDrawableGradientStyleable::class,
        CoreGradientDrawableSolidStyleable::class,
        CoreGradientDrawableStrokeStyleable::class,
        CoreDrawableCornersStyleable::class,
        CoreGradientDrawablePaddingStyleable::class)
@UseAndroidNamespace
abstract class CoreGradientDrawableStyleable : CoreDrawableStyleable() {
    // Indicates whether the drawable should intially be visible.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    // Enables or disables dithering.
    @Reuse(CoreStateListDrawableStyleable.dither::class)
    class dither

    enum class ShapeEnum(val value: Int) : StyleableEnum {
        // Rectangle shape, with optional rounder corners.
        rectangle(0),
        // Oval shape.
        oval(1),
        // Line shape.
        line(2),
        // Ring shape.
        ring(3)
    }

    // Indicates what shape to fill with a gradient.
    @EnumValue(ShapeEnum::class)
    @UseAndroidNamespace
    class shape

    // Inner radius of the ring expressed as a ratio of the ring's width. For instance,
    // if innerRadiusRatio=9, then the inner radius equals the ring's width divided by 9.
    // This value is ignored if innerRadius is defined. Default value is 9.
    @FloatValue
    @UseAndroidNamespace
    class innerRadiusRatio

    // Thickness of the ring expressed as a ratio of the ring's width. For instance,
    // if thicknessRatio=3, then the thickness equals the ring's width divided by 3.
    // This value is ignored if innerRadius is defined. Default value is 3.
    @FloatValue
    @UseAndroidNamespace
    class thicknessRatio

    // Inner radius of the ring. When defined, innerRadiusRatio is ignored.
    @DimensionValue
    @UseAndroidNamespace
    class innerRadius

    // Thickness of the ring. When defined, thicknessRatio is ignored.
    @DimensionValue
    @UseAndroidNamespace
    class thickness

    // Whether the drawable level value (see
    // {@link android.graphics.drawable.Drawable#getLevel()}) is used to scale the shape.
    // Scaling behavior depends on the shape type. For "ring", the angle is scaled from 0 to
    // 360. For all other types, there is no effect. The default value is true.
    @Reuse(CoreGradientDrawableGradientStyleable.useLevel::class)
    class useLevel

    // If set, specifies the color to apply to the drawable as a tint. By default,
    // no tint is applied. May be a color state list.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tint

    // When a tint color is set, specifies its Porter-Duff blending mode. The
    // default value is src_in, which treats the drawable as an alpha mask.
    @Reuse(CoreImageViewStyleable.tintMode::class)
    class tintMode

    // Left optical inset.
    @Hide("Until optical insets are fully supported.")
    @Reuse(CoreVectorDrawableStyleable.opticalInsetLeft::class)
    class opticalInsetLeft

    // Top optical inset.
    @Hide("Until optical insets are fully supported.")
    @Reuse(CoreVectorDrawableStyleable.opticalInsetTop::class)
    class opticalInsetTop

    // Right optical inset.
    @Hide("Until optical insets are fully supported.")
    @Reuse(CoreVectorDrawableStyleable.opticalInsetRight::class)
    class opticalInsetRight

    // Bottom optical inset.
    @Hide("Until optical insets are fully supported.")
    @Reuse(CoreVectorDrawableStyleable.opticalInsetBottom::class)
    class opticalInsetBottom
}

// Used to specify the size of the shape for GradientDrawable.
@UseAndroidNamespace
abstract class CoreGradientDrawableSizeStyleable : BaseStyleable {
    // Width of the gradient shape.
    @Reuse(CoreTextViewStyleable.width::class)
    class width

    // Height of the gradient shape.
    @Reuse(CoreTextViewStyleable.height::class)
    class height
}

// Used to describe the gradient used to fill the shape of a GradientDrawable.
@UseAndroidNamespace
abstract class CoreGradientDrawableGradientStyleable : BaseStyleable {
    // Start color of the gradient.
    @ColorValue
    @UseAndroidNamespace
    class startColor

    // Optional center color. For linear gradients, use centerX or centerY to place the center
    // color.
    @ColorValue
    @UseAndroidNamespace
    class centerColor

    // End color of the gradient.
    @ColorValue
    @UseAndroidNamespace
    class endColor

    // Whether the drawable level value (see
    // {@link android.graphics.drawable.Drawable#getLevel()}) is used to scale the gradient.
    // Scaling behavior varies based on gradient type. For "linear", adjusts the ending
    // position along the gradient's axis of orientation. For "radial", adjusts the outer
    // radius. For "sweep", adjusts the ending angle. The default value is false.
    @BooleanValue
    @UseAndroidNamespace
    class useLevel

    // Angle of the gradient, used only with linear gradient. Must be a multiple of 45 in the
    // range [0, 315].
    @FloatValue
    @UseAndroidNamespace
    class angle

    enum class TypeEnum(val value: Int) : StyleableEnum {
        // Linear gradient extending across the center point.
        linear(0),
        // Radial gradient extending from the center point outward.
        radial(1),
        // Sweep (or angular) gradient sweeping counter-clockwise around the center point.
        sweep(2)
    }

    // Type of gradient. The default type is linear.
    @EnumValue(TypeEnum::class)
    @UseAndroidNamespace
    class type

    // X-position of the center point of the gradient within the shape as a fraction of the
    // width. The default value is 0.5.
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class centerX

    // Y-position of the center point of the gradient within the shape as a fraction of the
    // height. The default value is 0.5.
    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class centerY

    // Radius of the gradient, used only with radial gradient. May be an explicit dimension
    // or a fractional value relative to the shape's minimum dimension.
    @FloatValue
    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class gradientRadius
}


// Used to fill the shape of GradientDrawable with a solid color.
@UseAndroidNamespace
abstract class CoreGradientDrawableSolidStyleable : BaseStyleable {
    // Solid color for the gradient shape.
    @ColorValue
    @UseAndroidNamespace
    class color
}

// Used to describe the optional stroke of a GradientDrawable.
@UseAndroidNamespace
abstract class CoreGradientDrawableStrokeStyleable : BaseStyleable {
    // Width of the gradient shape's stroke.
    @Reuse(CoreTextViewStyleable.width::class)
    class width

    // Color of the gradient shape's stroke.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color

    // Length of a dash in the stroke.
    @DimensionValue
    @UseAndroidNamespace
    class dashWidth

    // Gap between dashes in the stroke.
    @DimensionValue
    @UseAndroidNamespace
    class dashGap
}

// Describes the corners for the rectangle shape of a GradientDrawable.
// This can be used to render rounded corners.
@UseAndroidNamespace
abstract class CoreDrawableCornersStyleable : BaseStyleable {
    // Defines the radius of the four corners.
    @DimensionValue
    @UseAndroidNamespace
    class radius

    // Radius of the top left corner.
    @DimensionValue
    @UseAndroidNamespace
    class topLeftRadius

    // Radius of the top right corner.
    @DimensionValue
    @UseAndroidNamespace
    class topRightRadius

    // Radius of the bottom left corner.
    @DimensionValue
    @UseAndroidNamespace
    class bottomLeftRadius

    // Radius of the bottom right corner.
    @DimensionValue
    @UseAndroidNamespace
    class bottomRightRadius
}

// Used to specify the optional padding of a GradientDrawable.
@UseAndroidNamespace
abstract class CoreGradientDrawablePaddingStyleable : BaseStyleable {
    // Amount of left padding inside the gradient shape.
    @DimensionValue
    @UseAndroidNamespace
    class left

    // Amount of top padding inside the gradient shape.
    @DimensionValue
    @UseAndroidNamespace
    class top

    // Amount of right padding inside the gradient shape.
    @DimensionValue
    @UseAndroidNamespace
    class right

    // Amount of bottom padding inside the gradient shape.
    @DimensionValue
    @UseAndroidNamespace
    class bottom
}

// Drawable used to render several drawables stacked on top of each other.
// Each child drawable can be controlled individually.
@InnerStyleable(CoreLayerDrawableItemStyleable::class)
@UseAndroidNamespace
abstract class CoreLayerDrawableStyleable : CoreDrawableStyleable() {

    enum class OpacityEnum(val value: Int) : StyleableEnum {
        // Indicates that the layer is opaque and contains no transparent
        // nor translucent pixels.
        opaque(-1),
        // The layer is completely transparent (no pixel will be drawn).
        transparent(-2),
        // The layer has translucent pixels.
        translucent(-3)
    }

    // Indicates the opacity of the layer. This can be useful to allow the
    // system to enable drawing optimizations. The default value is
    // translucent.
    @EnumValue(OpacityEnum::class)
    @UseAndroidNamespace
    class opacity

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored

    enum class PaddingModeEnum(val value: Int) : StyleableEnum {
        // Nest each layer inside the padding of the previous layer.
        nest(0),
        // Stack each layer directly atop the previous layer.
        stack(1)
    }

    // Indicates how layer padding should affect the bounds of subsequent layers.
    // The default padding mode value is nest.
    @EnumValue(PaddingModeEnum::class)
    @UseAndroidNamespace
    class paddingMode


    // Explicit top padding. Overrides child padding.
    @Reuse(CoreViewStyleable.paddingTop::class)
    class paddingTop

    // Explicit bottom padding. Overrides child padding.
    @Reuse(CoreViewStyleable.paddingBottom::class)
    class paddingBottom

    // Explicit left padding. Overrides child padding.
    @Reuse(CoreViewStyleable.paddingLeft::class)
    class paddingLeft

    // Explicit right padding. Overrides child padding.
    @Reuse(CoreViewStyleable.paddingRight::class)
    class paddingRight

    // Explicit start padding. Overrides child padding. Takes precedence
    // over absolute padding (for example, left when layout direction is LTR).
    @Reuse(CoreViewStyleable.paddingStart::class)
    class paddingStart

    // Explicit end padding. Overrides child padding. Takes precedence
    // over absolute padding (for example, right when layout direction is LTR).
    @Reuse(CoreViewStyleable.paddingEnd::class)
    class paddingEnd
}


// Describes an item (or child) of a LayerDrawable.
@UseAndroidNamespace
abstract class CoreLayerDrawableItemStyleable : BaseStyleable {
    // Left inset to apply to the layer.
    @Reuse(CoreGradientDrawablePaddingStyleable.left::class)
    class left

    // Top inset to apply to the layer.
    @Reuse(CoreGradientDrawablePaddingStyleable.top::class)
    class top

    // Right inset to apply to the layer.
    @Reuse(CoreGradientDrawablePaddingStyleable.right::class)
    class right

    // Bottom inset to apply to the layer.
    @Reuse(CoreGradientDrawablePaddingStyleable.bottom::class)
    class bottom

    // Start inset to apply to the layer. Overrides {@code left} or
    // {@code right} depending on layout direction.
    @DimensionValue
    @UseAndroidNamespace
    class start

    // End inset to apply to the layer. Overrides {@code left} or
    // {@code right} depending on layout direction.
    @DimensionValue
    @UseAndroidNamespace
    class end

    // Width of the layer. Defaults to the layer's intrinsic width.
    @Reuse(CoreTextViewStyleable.width::class)
    class width

    // Height of the layer. Defaults to the layer's intrinsic height.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // Gravity used to align the layer within its container. If no value
    // is specified, the default behavior depends on whether an explicit
    // width or height has been set, If no dimension is set, gravity in
    // that direction defaults to {@code fill_horizontal} or
    // {@code fill_vertical}; otherwise, it defaults to {@code left} or
    // {@code top}.
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Drawable used to render the layer.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable

    // Identifier of the layer. This can be used to retrieve the layer
    // from a drawable container.
    @Reuse(CoreViewStyleable.id::class)
    class id
}

@UseAndroidNamespace
abstract class CoreLevelListDrawableItemStyleable : BaseStyleable {
    // The minimum level allowed for this item.
    @IntegerValue
    @UseAndroidNamespace
    class minLevel

    // The maximum level allowed for this item.
    @IntegerValue
    @UseAndroidNamespace
    class maxLevel

    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Drawable used to rotate another drawable.
@UseAndroidNamespace
abstract class CoreRotateDrawableStyleable : CoreDrawableStyleable() {
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    @FloatValue
    @UseAndroidNamespace
    class fromDegrees

    @FloatValue
    @UseAndroidNamespace
    class toDegrees

    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class pivotX

    @FloatValue
    @FractionValue
    @UseAndroidNamespace
    class pivotY

    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

@UseAndroidNamespace
abstract class CoreAnimatedRotateDrawableStyleable : CoreDrawableStyleable() {
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    @IntegerValue
    @UseAndroidNamespace
    class frameDuration

    @IntegerValue
    @UseAndroidNamespace
    class framesCount

    @Reuse(CoreRotateDrawableStyleable.pivotX::class)
    class pivotX

    @Reuse(CoreRotateDrawableStyleable.pivotY::class)
    class pivotY

    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}


// Drawable used to render the Material progress indicator.
@UseAndroidNamespace
abstract class CoreMaterialProgressDrawableStyleable : CoreDrawableStyleable() {
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    @Reuse(CoreGradientDrawableStyleable.thickness::class)
    class thickness

    @Reuse(CoreGradientDrawableStyleable.innerRadius::class)
    class innerRadius

    @Reuse(CoreTextViewStyleable.width::class)
    class width

    @Reuse(CoreTextViewStyleable.height::class)
    class height

    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color
}

// Drawable used to wrap and inset another drawable.
@UseAndroidNamespace
abstract class CoreInsetDrawableStyleable : CoreDrawableStyleable() {
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable

    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class inset

    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class insetLeft

    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class insetRight

    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class insetTop

    @FractionValue
    @DimensionValue
    @UseAndroidNamespace
    class insetBottom
}

// Drawable used to draw bitmaps.
@UseAndroidNamespace
abstract class CoreBitmapDrawableStyleable : CoreDrawableStyleable() {
    // Identifier of the bitmap file. This attribute is mandatory.
    @Reuse(CoreImageViewStyleable.src::class)
    class src

    // Enables or disables antialiasing. Antialiasing can be used to smooth the
    // edges of a bitmap when rotated. Default value is false.
    @BooleanValue
    @UseAndroidNamespace
    class antialias

    // Enables or disables bitmap filtering. Filtering is used when the bitmap is
    // shrunk or stretched to smooth its apperance. Default value is true.
    @BooleanValue
    @UseAndroidNamespace
    class filter

    // Enables or disables dithering of the bitmap if the bitmap does not have the
    // same pixel configuration as the screen (for instance: a ARGB 8888 bitmap with
    // an RGB 565 screen). Default value is true.
    @Reuse(CoreStateListDrawableStyleable.dither::class)
    class dither

    // Defines the gravity for the bitmap. The gravity indicates where to position
    // the drawable in its container if the bitmap is smaller than the container.
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    enum class TileModeEnum(val value: Int) : StyleableEnum {
        // Do not tile the bitmap. This is the default value.
        disabled(-1),
        // Replicates the edge color.
        clamp(0),
        // Repeats the bitmap in both direction.
        repeat(1),
        // Repeats the shader's image horizontally and vertically, alternating
        //    mirror images so that adjacent images always seam.
        mirror(2),
    }

    // Defines the tile mode. When the tile mode is enabled, the bitmap is repeated.
    // Gravity is ignored when the tile mode is enabled. Default value is "disabled".
    @EnumValue(TileModeEnum::class)
    @UseAndroidNamespace
    class tileMode

    enum class TileModeXEnum(val value: Int) : StyleableEnum {
        // Do not tile the bitmap. This is the default value.
        disabled(-1),
        // Replicates the edge color.
        clamp(0),
        // Repeats the bitmap horizontally.
        repeat(1),
        // Repeats the shader's image horizontally, alternating
        // mirror images so that adjacent images always seam.
        mirror(2),
    }

    // Defines the horizontal tile mode. When the tile mode is enabled, the bitmap is repeated.
    // Gravity is ignored when the tile mode is enabled. Default value is "disabled".
    @EnumValue(TileModeXEnum::class)
    @UseAndroidNamespace
    class tileModeX

    enum class TileModeYEnum(val value: Int) : StyleableEnum {
        // Do not tile the bitmap. This is the default value.
        disabled(-1),
        // Replicates the edge color.
        clamp(0),
        // Repeats the bitmap vertically.
        repeat(1),
        // Repeats the shader's image vertically, alternating
        // mirror images so that adjacent images always seam.
        mirror(2),
    }

    // Defines the vertical tile mode. When the tile mode is enabled, the bitmap is repeated.
    // Gravity is ignored when the tile mode is enabled. Default value is "disabled".
    @EnumValue(TileModeYEnum::class)
    @UseAndroidNamespace
    class tileModeY

    // Enables or disables the mipmap hint. See
    // {@link android.graphics.Bitmap#setHasMipMap(boolean)} for more information.
    // Default value is false.
    @BooleanValue
    @UseAndroidNamespace
    class mipMap

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored

    @Reuse(CoreImageViewStyleable.tint::class)
    class tint

    enum class TintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the drawable.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the drawable. The drawable’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the drawable, but with the drawable’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the drawable with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and drawable color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16),
    }

    // When a tint color is set, specifies its Porter-Duff blending mode. The
    // default value is src_in, which treats the drawable as an alpha mask.
    @EnumValue(TintModeEnum::class)
    @UseAndroidNamespace
    class tintMode

    // Specifies the alpha multiplier to apply to the base drawable.
    @Reuse(CoreViewStyleable.alpha::class)
    class alpha
}

// Drawable used to draw 9-patches.
@UseAndroidNamespace
abstract class CoreNinePatchDrawableStyleable : CoreDrawableStyleable() {
    // Identifier of the bitmap file. This attribute is mandatory.
    @Reuse(CoreImageViewStyleable.src::class)
    class src

    // Enables or disables dithering of the bitmap if the bitmap does not have the
    // same pixel configuration as the screen (for instance: a ARGB 8888 bitmap with
    // an RGB 565 screen).
    @Reuse(CoreStateListDrawableStyleable.dither::class)
    class dither

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored

    // If set, specifies the color to apply to the drawable as a tint. By default,
    // no tint is applied. May be a color state list.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tint

    // When a tint color is set, specifies its Porter-Duff blending mode. The
    // default value is src_in, which treats the drawable as an alpha mask.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tintMode

    // Specifies the alpha multiplier to apply to the base drawable.
    @Reuse(CoreViewStyleable.alpha::class)
    class alpha
}

// Drawable used to draw a single color.
@UseAndroidNamespace
abstract class CoreColorDrawableStyleable : CoreDrawableStyleable() {
    // The color to use.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color
}

// Drawable used to draw adaptive icons with foreground and background layers.
@UseAndroidNamespace
abstract class CoreAdaptiveIconDrawableLayerStyleable : BaseStyleable {
    // The drawable to use for the layer.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Drawable used to show animated touch feedback.
@UseAndroidNamespace
abstract class CoreRippleDrawableStyleable : CoreDrawableStyleable() {
    // The color to use for ripple effects. This attribute is required.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color

    // The radius of the ripple when fully expanded. By default, the
    // radius is computed based on the size of the ripple's container.
    @Reuse(CoreDrawableCornersStyleable.radius::class)
    class radius
}

@UseAndroidNamespace
abstract class CoreScaleDrawableStyleable : CoreDrawableStyleable() {
    // Scale width, expressed as a percentage of the drawable's bound. The value's
    // format is XX%. For instance: 100%, 12.5%, etc.
    @StringValue
    @UseAndroidNamespace
    class scaleWidth

    // Scale height, expressed as a percentage of the drawable's bound. The value's
    // format is XX%. For instance: 100%, 12.5%, etc.
    @StringValue
    @UseAndroidNamespace
    class scaleHeight

    enum class ScaleGravityFlag(val value: Long) : StyleableFlag {
        // Push object to the top of its container, not changing its size.
        top(0x30),
        // Push object to the bottom of its container, not changing its size.
        bottom(0x50),
        // Push object to the left of its container, not changing its size.
        left(0x03),
        // Push object to the right of its container, not changing its size.
        right(0x05),
        // Place object in the vertical center of its container, not changing its size.
        center_vertical(0x10),
        // Grow the vertical size of the object if needed so it completely fills its container.
        fill_vertical(0x70),
        // Place object in the horizontal center of its container, not changing its size.
        center_horizontal(0x01),
        // Grow the horizontal size of the object if needed so it completely fills its container.
        fill_horizontal(0x07),
        // Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
        center(0x11),
        // Grow the horizontal and vertical size of the object if needed so it completely fills its container.
        fill(0x77),
        // Additional option that can be set to have the top and/or bottom edges of
        // the child clipped to its container's bounds.
        // The clip will be based on the vertical gravity: a top gravity will clip the bottom
        // edge, a bottom gravity will clip the top edge, and neither will clip both edges.
        clip_vertical(0x80),
        // Additional option that can be set to have the left and/or right edges of
        // the child clipped to its container's bounds.
        // The clip will be based on the horizontal gravity: a left gravity will clip the right
        // edge, a right gravity will clip the left edge, and neither will clip both edges.
        clip_horizontal(0x08),
        // Push object to the beginning of its container, not changing its size.
        start(0x00800003),
        // Push object to the end of its container, not changing its size.
        end(0x00800005),
    }

    // Specifies where the drawable is positioned after scaling. The default value is
    // left.
    @FlagValue(ScaleGravityFlag::class)
    @UseAndroidNamespace
    class scaleGravity

    // Specifies the initial drawable level in the range 0 to 10000.
    @IntegerValue
    @UseAndroidNamespace
    class level

    // Reference to a drawable resource to draw with the specified scale.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable

    // Use the drawable's intrinsic width and height as minimum size values.
    // Useful if the target drawable is a 9-patch or otherwise should not be scaled
    // down beyond a minimum size.
    @BooleanValue
    @UseAndroidNamespace
    class useIntrinsicSizeAsMinimum
}

@UseAndroidNamespace
abstract class CoreClipDrawableStyleable : CoreDrawableStyleable() {
    enum class ClipOrientationFlag(val value: Long) : StyleableFlag {
        // Clip the drawable horizontally.
        horizontal(1),
        // Clip the drawable vertically.
        vertical(2),
    }

    // The orientation for the clip.
    @FlagValue(ClipOrientationFlag::class)
    @UseAndroidNamespace
    class clipOrientation

    // Specifies where to clip within the drawable. The default value is
    // left.
    @Reuse(CoreStyleable.gravity::class)
    class gravity

    // Reference to a drawable resource to draw with the specified scale.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Defines the padding of a ShapeDrawable.
@UseAndroidNamespace
abstract class CoreShapeDrawablePaddingStyleable : BaseStyleable {
    // Left padding.
    @Reuse(CoreGradientDrawablePaddingStyleable.left::class)
    class left

    // Top padding.
    @Reuse(CoreGradientDrawablePaddingStyleable.top::class)
    class top

    // Right padding.
    @Reuse(CoreGradientDrawablePaddingStyleable.right::class)
    class right

    // Bottom padding.
    @Reuse(CoreGradientDrawablePaddingStyleable.bottom::class)
    class bottom
}

// Drawable used to draw shapes.
@InnerStyleable(CoreShapeDrawablePaddingStyleable::class)
@UseAndroidNamespace
abstract class CoreShapeDrawableStyleable : CoreDrawableStyleable() {
    // Defines the color of the shape.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color

    // Defines the width of the shape.
    @Reuse(CoreTextViewStyleable.width::class)
    class width

    // Defines the height of the shape.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // Enables or disables dithering.
    @Reuse(CoreStateListDrawableStyleable.dither::class)
    class dither

    // If set, specifies the color to apply to the drawable as a tint. By default,
    // no tint is applied. May be a color state list.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tint

    // When a tint color is set, specifies its Porter-Duff blending mode. The
    // default value is src_in, which treats the drawable as an alpha mask.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tintMode
}

// Drawable used to draw vector paths.
@InnerStyleable(CoreVectorDrawableGroupStyleable::class,
        CoreVectorDrawablePathStyleable::class,
        CoreVectorDrawableClipPathStyleable::class,
        CoreGradientColorStyleable::class)
@UseAndroidNamespace
abstract class CoreVectorDrawableStyleable : CoreDrawableStyleable() {
    // If set, specifies the color to apply to the drawable as a tint. By default,
    // no tint is applied. May be a color state list.
    @Reuse(CoreImageViewStyleable.tint::class)
    class tint

    // When a tint color is set, specifies its Porter-Duff blending mode. The
    // default value is src_in, which treats the drawable as an alpha mask.
    @Reuse(CoreImageViewStyleable.tintMode::class)
    class tintMode

    // Indicates if the drawable needs to be mirrored when its layout direction is
    // RTL (right-to-left).
    @Reuse(CoreDrawableStyleable.autoMirrored::class)
    class autoMirrored

    // The intrinsic width of the Vector Drawable.
    @Reuse(CoreTextViewStyleable.width::class)
    class width

    // The intrinsic height of the Vector Drawable.
    @Reuse(CoreTextViewStyleable.height::class)
    class height

    // The width of the canvas the drawing is on.
    @FloatValue
    @UseAndroidNamespace
    class viewportWidth

    // The height of the canvas the drawing is on.
    @FloatValue
    @UseAndroidNamespace
    class viewportHeight

    // The name of this vector drawable.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The opacity of the whole vector drawable, as a value between 0
    // (completely transparent) and 1 (completely opaque).
    @Reuse(CoreViewStyleable.alpha::class)
    class alpha

    // Left optical inset.
    @Hide("Until optical insets are fully supported.")
    @DimensionValue
    @UseAndroidNamespace
    class opticalInsetLeft

    // Top optical inset.
    @Hide("Until optical insets are fully supported.")
    @DimensionValue
    @UseAndroidNamespace
    class opticalInsetTop

    // Right optical inset.
    @Hide("Until optical insets are fully supported.")
    @DimensionValue
    @UseAndroidNamespace
    class opticalInsetRight

    // Bottom optical inset.
    @Hide("Until optical insets are fully supported.")
    @DimensionValue
    @UseAndroidNamespace
    class opticalInsetBottom
}

// Defines the group used in VectorDrawables.
@UseAndroidNamespace
abstract class CoreVectorDrawableGroupStyleable : BaseStyleable {
    // The name of this group.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The amount to rotate the group.
    @Reuse(CoreViewStyleable.rotation::class)
    class rotation

    // The X coordinate of the center of rotation of a group.
    @Reuse(CoreRotateDrawableStyleable.pivotX::class)
    class pivotX

    // The Y coordinate of the center of rotation of a group.
    @Reuse(CoreRotateDrawableStyleable.pivotY::class)
    class pivotY

    // The amount to translate the group on X coordinate.
    @FloatValue
    @UseAndroidNamespace
    class translateX

    // The amount to translate the group on Y coordinate.
    @FloatValue
    @UseAndroidNamespace
    class translateY

    // The amount to scale the group on X coordinate.
    @Reuse(CoreViewStyleable.scaleX::class)
    class scaleX

    // The amount to scale the group on X coordinate.
    @Reuse(CoreViewStyleable.scaleY::class)
    class scaleY
}

// Defines the path used in VectorDrawables.
@UseAndroidNamespace
abstract class CoreVectorDrawablePathStyleable : BaseStyleable {
    // The name of this path.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The width a path stroke.
    @FloatValue
    @UseAndroidNamespace
    class strokeWidth

    // The color to stroke the path if not defined implies no stroke.
    @ColorValue
    @UseAndroidNamespace
    class strokeColor

    // The opacity of a path stroke, as a value between 0 (completely transparent)
    // and 1 (completely opaque).
    @FloatValue
    @UseAndroidNamespace
    class strokeAlpha

    // The color to fill the path if not defined implies no fill.
    @ColorValue
    @UseAndroidNamespace
    class fillColor

    // The alpha of the path fill, as a value between 0 (completely transparent)
    // and 1 (completely opaque).
    @FloatValue
    @UseAndroidNamespace
    class fillAlpha

    // The specification of the operations that define the path.
    @StringValue
    @UseAndroidNamespace
    class pathData

    // The fraction of the path to trim from the start from 0 to 1.
    @FloatValue
    @UseAndroidNamespace
    class trimPathStart

    // The fraction of the path to trim from the end from 0 to 1 .
    @FloatValue
    @UseAndroidNamespace
    class trimPathEnd

    // Shift trim region (allows visible region to include the start and end) from 0 to 1.
    @FloatValue
    @UseAndroidNamespace
    class trimPathOffset

    enum class StrokeLineCapEnum(val value: Int) : StyleableEnum {
        butt(0),
        round(1),
        square(2)
    }

    // sets the linecap for a stroked path.
    @EnumValue(StrokeLineCapEnum::class)
    @UseAndroidNamespace
    class strokeLineCap

    enum class StrokeLineJoinEnum(val value: Int) : StyleableEnum {
        miter(0),
        round(1),
        bevel(2)
    }

    // sets the lineJoin for a stroked path.
    @EnumValue(StrokeLineJoinEnum::class)
    @UseAndroidNamespace
    class strokeLineJoin

    // sets the Miter limit for a stroked path.
    @FloatValue
    @UseAndroidNamespace
    class strokeMiterLimit

    enum class FillTypeEnum(val value: Int) : StyleableEnum {
        nonZero(0),
        evenOdd(1)
    }

    // sets the fillType for a path. It is the same as SVG's "fill-rule" properties.
    // For more details, see https://www.w3.org/TR/SVG/painting.html#FillRuleProperty.
    @EnumValue(FillTypeEnum::class)
    @UseAndroidNamespace
    class fillType

}

// Defines the clip path used in VectorDrawables.
@UseAndroidNamespace
abstract class CoreVectorDrawableClipPathStyleable : BaseStyleable {
    // The Name of this path.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The specification of the operations that define the path.
    @Reuse(CoreVectorDrawablePathStyleable.pathData::class)
    class pathData
}

// Define the AnimatedVectorDrawable.
@InnerStyleable(CoreAnimatedVectorDrawableTargetStyleable::class)
@UseAndroidNamespace
abstract class CoreAnimatedVectorDrawableStyleable : CoreDrawableStyleable() {
    // The static vector drawable.
    @Reuse(CoreAnimationDrawableItemStyleable.drawable::class)
    class drawable
}

// Defines the target used in the AnimatedVectorDrawable.
@UseAndroidNamespace
abstract class CoreAnimatedVectorDrawableTargetStyleable : BaseStyleable {
    // The name of the target path, group or vector drawable.
    @Reuse(ManifestStyleable.name::class)
    class name

    // The animation for the target path, group or vector drawable.
    @Reuse(CoreLayoutAnimationStyleable.animation::class)
    class animation
}

// Used to describe the gradient for fill or stroke in a path of VectorDrawable.
@InnerStyleable(CoreGradientColorItemStyleable::class)
@UseAndroidNamespace
abstract class CoreGradientColorStyleable : BaseStyleable {
    // Start color of the gradient.
    @Reuse(CoreGradientDrawableGradientStyleable.startColor::class)
    class startColor

    // Optional center color.
    @Reuse(CoreGradientDrawableGradientStyleable.centerColor::class)
    class centerColor

    // End color of the gradient.
    @Reuse(CoreGradientDrawableGradientStyleable.endColor::class)
    class endColor

    // Type of gradient. The default type is linear.
    @Reuse(CoreGradientDrawableGradientStyleable.type::class)
    class type

    // Only applied to RadialGradient
    // Radius of the gradient, used only with radial gradient.
    @Reuse(CoreGradientDrawableGradientStyleable.gradientRadius::class)
    class gradientRadius

    // Only applied to SweepGradient / RadialGradient
    // X coordinate of the center of the gradient within the path.
    @Reuse(CoreGradientDrawableGradientStyleable.centerX::class)
    class centerX

    // Y coordinate of the center of the gradient within the path.
    @Reuse(CoreGradientDrawableGradientStyleable.centerY::class)
    class centerY

    // LinearGradient specific
    // X coordinate of the start point origin of the gradient.
    // Defined in same coordinates as the path itself
    @FloatValue
    @UseAndroidNamespace
    class startX

    // Y coordinate of the start point of the gradient within the shape.
    // Defined in same coordinates as the path itself
    @FloatValue
    @UseAndroidNamespace
    class startY

    // X coordinate of the end point origin of the gradient.
    // Defined in same coordinates as the path itself
    @FloatValue
    @UseAndroidNamespace
    class endX

    // Y coordinate of the end point of the gradient within the shape.
    // Defined in same coordinates as the path itself
    @FloatValue
    @UseAndroidNamespace
    class endY

    // Defines the tile mode of the gradient. SweepGradient don't support tiling.
    @Reuse(CoreBitmapDrawableStyleable.tileMode::class)
    class tileMode
}

// Describes an item of a GradientColor. Minimally need 2 items to define the gradient
// Colors defined in <item> override the simple color attributes such as
// "startColor / centerColor / endColor" are ignored.
@UseAndroidNamespace
abstract class CoreGradientColorItemStyleable : BaseStyleable {
    // The offset (or ratio) of this current color item inside the gradient.
    // The value is only meaningful when it is between 0 and 1.
    @FloatValue
    @UseAndroidNamespace
    class offset

    // The current color for the offset inside the gradient.
    @Reuse(CoreGradientDrawableSolidStyleable.color::class)
    class color
}