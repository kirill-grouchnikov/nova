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

// This is the basic set of layout attributes that are common to all
// layout managers.  These attributes are specified with the rest of
// a view's normal attributes (such as {@link android.R.attr#background},
// but will be parsed by the view's parent and ignored by the child.
// <p>The values defined here correspond to the base layout attribute
// class {@link android.view.ViewGroup.LayoutParams}.
@UseAndroidNamespace
abstract class CoreViewGroup_LayoutStyleable : BaseStyleable {
    enum class LayoutWidthEnum(val value: Int) : StyleableEnumAndDimension {
        // The view should be as big as its parent (minus padding).
        // This constant is deprecated starting from API Level 8 and
        // is replaced by {@code match_parent}.
        fill_parent(-1),
        // The view should be as big as its parent (minus padding).
        // Introduced in API Level 8.
        match_parent(-1),
        // The view should be only big enough to enclose its content (plus padding).
        wrap_content(-2)
    }

    // Specifies the basic width of the view.  This is a required attribute
    // for any view inside of a containing layout manager.  Its value may
    // be a dimension (such as "12dip") for a constant width or one of
    // the special constants.
    @EnumAndDimensionValue(LayoutWidthEnum::class)
    @UseAndroidNamespace
    class layout_width

    enum class LayoutHeightEnum(val value: Int) : StyleableEnumAndDimension {
        // The view should be as big as its parent (minus padding).
        // This constant is deprecated starting from API Level 8 and
        // is replaced by {@code match_parent}.
        fill_parent(-1),
        // The view should be as big as its parent (minus padding).
        // Introduced in API Level 8.
        match_parent(-1),
        // The view should be only big enough to enclose its content (plus padding).
        wrap_content(-2)
    }

    // Specifies the basic height of the view.  This is a required attribute
    // for any view inside of a containing layout manager.  Its value may
    // be a dimension (such as "12dip") for a constant width or one of
    // the special constants.
    @EnumAndDimensionValue(LayoutHeightEnum::class)
    @UseAndroidNamespace
    class layout_height
}

// This is the basic set of layout attributes for layout managers that
// wish to place margins around their child views.
// These attributes are specified with the rest of
// a view's normal attributes (such as {@link android.R.attr#background},
// but will be parsed by the view's parent and ignored by the child.
// <p>The values defined here correspond to the base layout attribute
// class {@link android.view.ViewGroup.MarginLayoutParams}.
@UseAndroidNamespace
abstract class CoreViewGroup_MarginLayoutStyleable : CoreViewGroup_LayoutStyleable() {
    @Reuse(CoreViewGroup_LayoutStyleable.layout_width::class)
    class layout_width

    @Reuse(CoreViewGroup_LayoutStyleable.layout_height::class)
    class layout_height

    //  Specifies extra space on the left, top, right and bottom
    // sides of this view.  If both layout_margin and any of layout_marginLeft,
    // layout_marginRight, layout_marginStart, layout_marginEnd,
    // layout_marginTop, and layout_marginBottom are
    // also specified, the layout_margin value will take precedence over the
    // edge-specific values. This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_margin

    //  Specifies extra space on the left side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginLeft

    //  Specifies extra space on the top side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginTop

    //  Specifies extra space on the right side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginRight

    //  Specifies extra space on the bottom side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginBottom

    //  Specifies extra space on the start side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginStart

    //  Specifies extra space on the end side of this view.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginEnd

    //  Specifies extra space on the left and right sides of this view.
    // Specifying layout_marginHorizontal is equivalent to specifying
    // layout_marginLeft and layout_marginRight.
    // If both layout_marginHorizontal and either/both of layout_marginLeft
    // and layout_marginRight are also specified, the layout_marginHorizontal
    // value will take precedence over the
    // edge-specific values. Also, layout_margin will always take precedence over
    // any of these values, including layout_marginHorizontal.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginHorizontal

    //  Specifies extra space on the top and bottom sides of this view.
    // Specifying layout_marginVertical is equivalent to specifying
    // layout_marginTop and layout_marginBottom with that same value.
    // If both layout_marginVertical and either/both of layout_marginTop and
    // layout_marginBottom are also specified, the layout_marginVertical value
    // will take precedence over the edge-specific values.
    // Also, layout_margin will always take precedence over
    // any of these values, including layout_marginVertical.
    // This space is outside this view's bounds.
    // Margin values should be positive.
    @DimensionValue
    @UseAndroidNamespace
    class layout_marginVertical
}

@UseAndroidNamespace
abstract class CoreAbsoluteLayout_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    @DimensionValue
    @UseAndroidNamespace
    class layout_x

    @DimensionValue
    @UseAndroidNamespace
    class layout_y
}

@UseAndroidNamespace
abstract class CoreLinearLayout_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    @Reuse(CoreViewGroup_LayoutStyleable.layout_width::class)
    class layout_width

    @Reuse(CoreViewGroup_LayoutStyleable.layout_height::class)
    class layout_height

    // Indicates how much of the extra space in the LinearLayout is
    // allocated to the view associated with these LayoutParams. Specify
    // 0 if the view should not be stretched. Otherwise the extra pixels
    // will be pro-rated among all views whose weight is greater than 0.
    @FloatValue
    @UseAndroidNamespace
    class layout_weight

    // Gravity specifies how a component should be placed in its group of cells.
    // The default is {@link android.view.Gravity#TOP}.
    // See {@link android.widget.LinearLayout#setGravity(int)}.
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@UseAndroidNamespace
abstract class CoreGridLayout_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    // The row boundary delimiting the top of the group of cells
    // occupied by this view.
    @IntegerValue
    @UseAndroidNamespace
    class layout_row

    // The row span: the difference between the top and bottom
    // boundaries delimiting the group of cells occupied by this view.
    // The default is one.
    // See {@link android.widget.GridLayout.Spec}.
    @IntegerValue
    @IntegerMinValue(1)
    @UseAndroidNamespace
    class layout_rowSpan

    // The relative proportion of vertical space that should be allocated to this view
    // during excess space distribution.
    @FloatValue
    @UseAndroidNamespace
    class layout_rowWeight

    // The column boundary delimiting the left of the group of cells
    // occupied by this view.
    @Reuse(CoreTableRow_CellStyleable.layout_column::class)
    class layout_column

    // The column span: the difference between the right and left
    // boundaries delimiting the group of cells occupied by this view.
    // The default is one.
    // See {@link android.widget.GridLayout.Spec}.
    @IntegerValue
    @UseAndroidNamespace
    @IntegerMinValue(1)
    class layout_columnSpan

    // The relative proportion of horizontal space that should be allocated to this view
    // during excess space distribution.
    @FloatValue
    @UseAndroidNamespace
    class layout_columnWeight

    // Gravity specifies how a component should be placed in its group of cells.
    // The default is LEFT | BASELINE.
    // See {@link android.widget.GridLayout.LayoutParams#setGravity(int)}.
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@UseAndroidNamespace
abstract class CoreFrameLayout_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@UseAndroidNamespace
abstract class CoreRelativeLayout_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    // Positions the right edge of this view to the left of the given anchor view ID.
    // Accommodates right margin of this view and left margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_toLeftOf

    // Positions the left edge of this view to the right of the given anchor view ID.
    // Accommodates left margin of this view and right margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_toRightOf

    // Positions the bottom edge of this view above the given anchor view ID.
    // Accommodates bottom margin of this view and top margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_above

    // Positions the top edge of this view below the given anchor view ID.
    // Accommodates top margin of this view and bottom margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_below

    // Positions the baseline of this view on the baseline of the given anchor view ID.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignBaseline

    // Makes the left edge of this view match the left edge of the given anchor view ID.
    // Accommodates left margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignLeft

    // Makes the top edge of this view match the top edge of the given anchor view ID.
    // Accommodates top margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignTop

    // Makes the right edge of this view match the right edge of the given anchor view ID.
    // Accommodates right margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignRight

    // Makes the bottom edge of this view match the bottom edge of the given anchor view ID.
    // Accommodates bottom margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignBottom

    // If true, makes the left edge of this view match the left edge of the parent.
    // Accommodates left margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentLeft

    // If true, makes the top edge of this view match the top edge of the parent.
    // Accommodates top margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentTop

    // If true, makes the right edge of this view match the right edge of the parent.
    // Accommodates right margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentRight

    // If true, makes the bottom edge of this view match the bottom edge of the parent.
    // Accommodates bottom margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentBottom

    // If true, centers this child horizontally and vertically within its parent.
    @BooleanValue
    @UseAndroidNamespace
    class layout_centerInParent

    // If true, centers this child horizontally within its parent.
    @BooleanValue
    @UseAndroidNamespace
    class layout_centerHorizontal

    // If true, centers this child vertically within its parent.
    @BooleanValue
    @UseAndroidNamespace
    class layout_centerVertical

    // If set to true, the parent will be used as the anchor when the anchor cannot be
    // be found for layout_toLeftOf, layout_toRightOf, etc.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignWithParentIfMissing

    // Positions the end edge of this view to the start of the given anchor view ID.
    // Accommodates end margin of this view and start margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_toStartOf

    // Positions the start edge of this view to the end of the given anchor view ID.
    // Accommodates start margin of this view and end margin of anchor view.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_toEndOf

    // Makes the start edge of this view match the start edge of the given anchor view ID.
    // Accommodates start margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignStart

    // Makes the end edge of this view match the end edge of the given anchor view ID.
    // Accommodates end margin.
    @ReferenceValue
    @UseAndroidNamespace
    class layout_alignEnd

    // If true, makes the start edge of this view match the start edge of the parent.
    // Accommodates start margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentStart

    // If true, makes the end edge of this view match the end edge of the parent.
    // Accommodates end margin.
    @BooleanValue
    @UseAndroidNamespace
    class layout_alignParentEnd
}

@UseAndroidNamespace
abstract class CoreVerticalSlider_LayoutStyleable : CoreViewGroup_LayoutStyleable() {
    @FloatValue
    @UseAndroidNamespace
    class layout_scale
}

@UseAndroidNamespace
abstract class CoreToolbar_LayoutParamsStyleable : CoreActionBar_LayoutParamsStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@UseAndroidNamespace
abstract class CoreActionBar_LayoutParamsStyleable : CoreViewGroup_MarginLayoutStyleable() {
    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity
}

@UseAndroidNamespace
abstract class CoreResolverDrawerLayout_LayoutParamsStyleable : CoreViewGroup_MarginLayoutStyleable() {
    @BooleanValue
    @UseAndroidNamespace
    class layout_alwaysShow

    @BooleanValue
    @UseAndroidNamespace
    class layout_ignoreOffset

    @Reuse(CoreStyleable.gravity::class)
    class layout_gravity

    @BooleanValue
    @UseAndroidNamespace
    class layout_hasNestedScrollIndicator
}
