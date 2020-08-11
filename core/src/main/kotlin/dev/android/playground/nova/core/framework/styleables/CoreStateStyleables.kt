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
// State attributes          
// ==========================

// Set of framework-provided states that may be specified on a Drawable. Actual usage of
// states may vary between view implementations, as documented on the individual state
// attributes.
@UseAndroidNamespace
abstract class CoreDrawableStatesStyleable : BaseStyleable {
    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view has input focus.
    @BooleanValue
    @UseAndroidNamespace
    class state_focused

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view's window has input focus.
    @BooleanValue
    @UseAndroidNamespace
    class state_window_focused

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view is enabled.
    @BooleanValue
    @UseAndroidNamespace
    class state_enabled

    // State identifier indicating that the object <var>may</var> display a check mark. See
    // {@link android.R.attr#state_checked} for the identifier that indicates whether it is
    // actually checked.
    @BooleanValue
    @UseAndroidNamespace
    class state_checkable

    // State identifier indicating that the object is currently checked.  See
    // {@link android.R.attr#state_checkable} for an additional identifier that can indicate
    // if any object may ever display a check, regardless of whether state_checked is
    // currently set.
    @BooleanValue
    @UseAndroidNamespace
    class state_checked

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view (or one of its parents) is currently selected.
    @BooleanValue
    @UseAndroidNamespace
    class state_selected

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when the user is pressing down in a view.
    @BooleanValue
    @UseAndroidNamespace
    class state_pressed

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or its parent has been "activated" meaning the user has currently
    // marked it as being of interest.  This is an alternative representation of
    // state_checked for when the state should be propagated down the view hierarchy.
    @BooleanValue
    @UseAndroidNamespace
    class state_activated

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or drawable is considered "active" by its host. Actual usage may vary
    // between views. Consult the host view documentation for details.
    @BooleanValue
    @UseAndroidNamespace
    class state_active

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or drawable is considered "single" by its host. Actual usage may vary
    // between views. Consult the host view documentation for details.
    @BooleanValue
    @UseAndroidNamespace
    class state_single

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or drawable is in the first position in an ordered set. Actual usage
    // may vary between views. Consult the host view documentation for details.
    @BooleanValue
    @UseAndroidNamespace
    class state_first

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or drawable is in the middle position in an ordered set. Actual usage
    // may vary between views. Consult the host view documentation for details.
    @BooleanValue
    @UseAndroidNamespace
    class state_middle

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a view or drawable is in the last position in an ordered set. Actual usage
    // may vary between views. Consult the host view documentation for details.
    @BooleanValue
    @UseAndroidNamespace
    class state_last

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // indicating that the Drawable is in a view that is hardware accelerated.
    // This means that the device can at least render a full-screen scaled
    // bitmap with one layer of text and bitmaps composited on top of it
    // at 60fps.  When this is set, the colorBackgroundCacheHint will be
    // ignored even if it specifies a solid color, since that optimization
    // is not needed.
    @BooleanValue
    @UseAndroidNamespace
    class state_accelerated

    // State value for {@link android.graphics.drawable.StateListDrawable StateListDrawable},
    // set when a pointer is hovering over the view.
    @BooleanValue
    @UseAndroidNamespace
    class state_hovered

    // State for {@link android.graphics.drawable.StateListDrawable StateListDrawable}
    // indicating that the Drawable is in a view that is capable of accepting a drop of
    // the content currently being manipulated in a drag-and-drop operation.
    @BooleanValue
    @UseAndroidNamespace
    class state_drag_can_accept

    // State for {@link android.graphics.drawable.StateListDrawable StateListDrawable}
    // indicating that a drag operation (for which the Drawable's view is a valid recipient)
    // is currently positioned over the Drawable.
    @BooleanValue
    @UseAndroidNamespace
    class state_drag_hovered

    // State for {@link android.graphics.drawable.StateListDrawable StateListDrawable}
    // indicating that a View has accessibility focus.
    @BooleanValue
    @UseAndroidNamespace
    class state_accessibility_focused
}

@UseAndroidNamespace
abstract class CoreViewDrawableStatesStyleable : BaseStyleable {
    @Reuse(CoreDrawableStatesStyleable.state_pressed::class)
    class state_pressed

    @Reuse(CoreDrawableStatesStyleable.state_focused::class)
    class state_focused

    @Reuse(CoreDrawableStatesStyleable.state_selected::class)
    class state_selected

    @Reuse(CoreDrawableStatesStyleable.state_window_focused::class)
    class state_window_focused

    @Reuse(CoreDrawableStatesStyleable.state_enabled::class)
    class state_enabled

    @Reuse(CoreDrawableStatesStyleable.state_activated::class)
    class state_activated

    @Reuse(CoreDrawableStatesStyleable.state_accelerated::class)
    class state_accelerated

    @Reuse(CoreDrawableStatesStyleable.state_hovered::class)
    class state_hovered

    @Reuse(CoreDrawableStatesStyleable.state_drag_can_accept::class)
    class state_drag_can_accept

    @Reuse(CoreDrawableStatesStyleable.state_drag_hovered::class)
    class state_drag_hovered
}

// State array representing a menu item that is currently checked.
@UseAndroidNamespace
abstract class CoreMenuItemCheckedStateStyleable : BaseStyleable {
    @Reuse(CoreDrawableStatesStyleable.state_checkable::class)
    class state_checkable

    @Reuse(CoreDrawableStatesStyleable.state_checked::class)
    class state_checked
}

// State array representing a menu item that is checkable but is not currently checked.
@UseAndroidNamespace
abstract class CoreMenuItemUncheckedStateStyleable : BaseStyleable {
    @Reuse(CoreDrawableStatesStyleable.state_checkable::class)
    class state_checkable
}

// State array representing a menu item that is currently focused and checked.
@UseAndroidNamespace
abstract class CoreMenuItemCheckedFocusedStateStyleable : BaseStyleable {
    @Reuse(CoreDrawableStatesStyleable.state_checkable::class)
    class state_checkable

    @Reuse(CoreDrawableStatesStyleable.state_checked::class)
    class state_checked

    @Reuse(CoreDrawableStatesStyleable.state_focused::class)
    class state_focused
}

// State array representing a menu item that is focused and checkable but is not currently checked.
@UseAndroidNamespace
abstract class CoreMenuItemUncheckedFocusedStateStyleable : BaseStyleable {
    @Reuse(CoreDrawableStatesStyleable.state_checkable::class)
    class state_checkable

    @Reuse(CoreDrawableStatesStyleable.state_focused::class)
    class state_focused
}

// State array representing an expandable list child's indicator.
@UseAndroidNamespace
abstract class CoreExpandableListChildIndicatorStateStyleable : BaseStyleable {
    // State identifier indicating the child is the last child within its group.
    @Reuse(CoreDrawableStatesStyleable.state_last::class)
    class state_last
}

// State array representing an expandable list group's indicator.
@UseAndroidNamespace
abstract class CoreExpandableListGroupIndicatorStateStyleable : BaseStyleable {
    // State identifier indicating the group is expanded.
    @BooleanValue
    @UseAndroidNamespace
    class state_expanded

    // State identifier indicating the group is empty (has no children).
    @BooleanValue
    @UseAndroidNamespace
    class state_empty
}

@UseAndroidNamespace
abstract class CorePopupWindowBackgroundStateStyleable : BaseStyleable {
    // State identifier indicating the popup will be above the anchor.
    @BooleanValue
    @UseAndroidNamespace
    class state_above_anchor
}

@UseAndroidNamespace
abstract class CoreTextViewMultiLineBackgroundStateStyleable : BaseStyleable {
    // State identifier indicating a TextView has a multi-line layout.
    @BooleanValue
    @UseAndroidNamespace
    class state_multiline
}