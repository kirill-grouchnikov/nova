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

// ****************************************************************
// Menu XML inflation.
// ****************************************************************
// Base attributes that are available to all Menu objects.
@UseAndroidNamespace
abstract class CoreMenuStyleable : BaseStyleable

// Base attributes that are available to all groups.
@UseAndroidNamespace
abstract class CoreMenuGroupStyleable : BaseStyleable {
    // The ID of the group.
    @Reuse(CoreViewStyleable.id::class)
    class id

    enum class MenuCategoryEnum(val value: Int) : StyleableEnum {
        // Items are part of a container.
        container(0x00010000),
        // Items are provided by the system.
        system(0x00020000),
        // Items are user-supplied secondary (infrequently used).
        secondary(0x00030000),
        // Items are alternative actions.
        alternative(0x00040000)
    }

    // The category applied to all items within this group.
    // (This will be or'ed with the orderInCategory attribute.)
    @EnumValue(MenuCategoryEnum::class)
    @UseAndroidNamespace
    class menuCategory

    // The order within the category applied to all items within this group.
    // (This will be or'ed with the category attribute.)
    @IntegerValue
    @UseAndroidNamespace
    class orderInCategory

    enum class CheckableBehaviorEnum(val value: Int) : StyleableEnum {
        // The items are not checkable.
        none(0),
        // The items are all checkable.
        all(1),
        // The items are checkable and there will only be a single checked item in
        // this group.
        single(2)
    }

    // Whether the items are capable of displaying a check mark.
    @EnumValue(CheckableBehaviorEnum::class)
    @UseAndroidNamespace
    class checkableBehavior

    // Whether the items are shown/visible.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    // Whether the items are enabled.
    @Reuse(CoreTextViewStyleable.enabled::class)
    class enabled
}

// Base attributes that are available to all Item objects.
@UseAndroidNamespace
abstract class CoreMenuItemStyleable : BaseStyleable {
    // The ID of the item.
    @Reuse(CoreViewStyleable.id::class)
    class id

    // The category applied to the item.
    // (This will be or'ed with the orderInCategory attribute.)
    @Reuse(CoreMenuGroupStyleable.menuCategory::class)
    class menuCategory

    // The order within the category applied to the item.
    // (This will be or'ed with the category attribute.)
    @Reuse(CoreMenuGroupStyleable.orderInCategory::class)
    class orderInCategory

    // The title associated with the item.
    @StringValue
    @UseAndroidNamespace
    class title

    // The condensed title associated with the item.  This is used in situations where the
    // normal title may be too long to be displayed.
    @StringValue
    @UseAndroidNamespace
    class titleCondensed

    // The icon associated with this item.  This icon will not always be shown, so
    // the title should be sufficient in describing this item.
    @Reuse(ManifestStyleable.icon::class)
    class icon

    // Tint to apply to the icon.
    @ColorValue
    @UseAndroidNamespace
    class iconTint

    enum class IconTintModeEnum(val value: Int) : StyleableEnum {
        // The tint is drawn on top of the icon.
        // [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc]
        src_over(3),
        // The tint is masked by the alpha channel of the icon. The icon’s
        // color channels are thrown out. [Sa * Da, Sc * Da]
        src_in(5),
        // The tint is drawn above the icon, but with the icon’s alpha
        // channel masking the result. [Da, Sc * Da + (1 - Sa) * Dc]
        src_atop(9),
        // Multiplies the color and alpha channels of the icon with those of
        // the tint. [Sa * Da, Sc * Dc]
        multiply(14),
        // [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc]
        screen(15),
        // Combines the tint and icon color and alpha channels, clamping the
        // result to valid color values. Saturate(S + D)
        add(16)
    }

    // Blending mode used to apply the icon tint.
    @EnumValue(IconTintModeEnum::class)
    @UseAndroidNamespace
    class iconTintMode

    // The alphabetic shortcut key.  This is the shortcut when using a keyboard
    // with alphabetic keys.
    @StringValue
    @UseAndroidNamespace
    class alphabeticShortcut

    enum class AlphabeticModifiersFlag(val value: Long) : StyleableFlag {
        META(0x10000),
        CTRL(0x1000),
        ALT(0x02),
        SHIFT(0x1),
        SYM(0x4),
        FUNCTION(0x8)
    }

    // The alphabetic modifier key. This is the modifier when using a keyboard
    // with alphabetic keys. The values should be kept in sync with KeyEvent
    @FlagValue(AlphabeticModifiersFlag::class)
    @UseAndroidNamespace
    class alphabeticModifiers

    // The numeric shortcut key.  This is the shortcut when using a numeric (for example,
    // 12-key) keyboard.
    @StringValue
    @UseAndroidNamespace
    class numericShortcut

    enum class NumericModifiersFlag(val value: Long) : StyleableFlag {
        META(0x10000),
        CTRL(0x1000),
        ALT(0x02),
        SHIFT(0x1),
        SYM(0x4),
        FUNCTION(0x8)
    }

    // The numeric modifier key. This is the modifier when using a numeric (for example,
    // 12-key) keyboard. The values should be kept in sync with KeyEvent
    @FlagValue(NumericModifiersFlag::class)
    @UseAndroidNamespace
    class numericModifiers

    // Whether the item is capable of displaying a check mark.
    @BooleanValue
    @UseAndroidNamespace
    class checkable

    // Whether the item is checked.  Note that you must first have enabled checking with
    // the checkable attribute or else the check mark will not appear.
    @Reuse(CoreCompoundButtonStyleable.checked::class)
    class checked

    // Whether the item is shown/visible.
    @Reuse(CoreDrawableStyleable.visible::class)
    class visible

    // Whether the item is enabled.
    @Reuse(CoreTextViewStyleable.enabled::class)
    class enabled

    // Name of a method on the Context used to inflate the menu that will be
    // called when the item is clicked.
    @Reuse(CoreViewStyleable.onClick::class)
    class onClick

    enum class ShowAsActionFlag(val value: Long) : StyleableFlag {
        // Never show this item in an action bar, show it in the overflow menu instead.
        // Mutually exclusive with "ifRoom" and "always".
        never(0),
        // Show this item in an action bar if there is room for it as determined
        // by the system. Favor this option over "always" where possible.
        // Mutually exclusive with "never" and "always".
        ifRoom(1),
        // Always show this item in an actionbar, even if it would override
        // the system's limits of how much stuff to put there. This may make
        // your action bar look bad on some screens. In most cases you should
        // use "ifRoom" instead. Mutually exclusive with "ifRoom" and "never".
        always(2),
        // When this item is shown as an action in the action bar, show a text
        // label with it even if it has an icon representation.
        withText(4),
        // This item's action view collapses to a normal menu
        // item. When expanded, the action view takes over a
        // larger segment of its container.
        collapseActionView(8)
    }

    // How this item should display in the Action Bar, if present.
    @FlagValue(ShowAsActionFlag::class)
    @UseAndroidNamespace
    class showAsAction

    // An optional layout to be used as an action view.
    // See {@link android.view.MenuItem#setActionView(android.view.View)}
    // for more info.
    @ReferenceValue
    @UseAndroidNamespace
    class actionLayout

    // The name of an optional View class to instantiate and use as an
    // action view. See {@link android.view.MenuItem#setActionView(android.view.View)}
    // for more info.
    @StringValue
    @UseAndroidNamespace
    class actionViewClass

    // The name of an optional ActionProvider class to instantiate an action view
    // and perform operations such as default action for that menu item.
    // See {@link android.view.MenuItem#setActionProvider(android.view.ActionProvider)}
    // for more info.
    @StringValue
    @UseAndroidNamespace
    class actionProviderClass

    // The content description associated with the item.
    @StringValue
    @UseAndroidNamespace
    class contentDescription

    // The tooltip text associated with the item.
    @StringValue
    @UseAndroidNamespace
    class tooltipText
}