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
package dev.android.playground.nova.core.framework

import dev.android.playground.nova.core.base.StyleableEnum
import dev.android.playground.nova.core.base.StyleableFlag

// Enum for the text style
enum class TextStyle(val value: Long) : StyleableFlag {
    normal(0),
    bold(1),
    italic(2)
}

// Enum for the typeface
enum class Typeface(val value: Int) : StyleableEnum {
    normal(0),
    sans(1),
    serif(2),
    monospace(3)
}

enum class Ellipsize(val value: Int) : StyleableEnum {
    none(0),
    start(1),
    middle(2),
    end(3),
    marquee(4)
}

enum class InputType(val value: Long) : StyleableFlag {
    // There is no content type.  The text is not editable.
    none(0x00000000),

    // Just plain old text.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_NORMAL }.
    text(0x00000001),

    // Can be combined with <var>text</var> and its variations to
    //request capitalization of all characters.  Corresponds to
    //{@link android.text.InputType#TYPE_TEXT_FLAG_CAP_CHARACTERS }.
    textCapCharacters(0x00001001),

    // Can be combined with <var>text</var> and its variations to
    //request capitalization of the first character of every word.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_CAP_WORDS }.
    textCapWords(0x00002001),

    // Can be combined with <var>text</var> and its variations to
    // request capitalization of the first character of every sentence.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_CAP_SENTENCES }.
    textCapSentences(0x00004001),

    // Can be combined with <var>text</var> and its variations to
    // request auto-correction of text being input.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_AUTO_CORRECT }.
    textAutoCorrect(0x00008001),

    // Can be combined with <var>text</var> and its variations to
    // specify that this field will be doing its own auto-completion and
    // talking with the input method appropriately.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_AUTO_COMPLETE }.
    textAutoComplete(0x00010001),

    // Can be combined with <var>text</var> and its variations to
    // allow multiple lines of text in the field.  If this flag is not set,
    // the text field will be constrained to a single line.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_MULTI_LINE }.
    textMultiLine(0x00020001),

    // Can be combined with <var>text</var> and its variations to
    // indicate that though the regular text view should not be multiple
    // lines, the IME should provide multiple lines if it can.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_IME_MULTI_LINE }.
    textImeMultiLine(0x00040001),

    // Can be combined with <var>text</var> and its variations to
    // indicate that the IME should not show any
    // dictionary-based word suggestions.  Corresponds to
    // {@link android.text.InputType#TYPE_TEXT_FLAG_NO_SUGGESTIONS }.
    textNoSuggestions(0x00080001),

    // Text that will be used as a URI.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_URI }.
    textUri(0x00000011),

    // Text that will be used as an e-mail address.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_EMAIL_ADDRESS }.
    textEmailAddress(0x00000021),

    // Text that is being supplied as the subject of an e-mail.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_EMAIL_SUBJECT }.
    textEmailSubject(0x00000031),

    // Text that is the content of a short message.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_SHORT_MESSAGE }.
    textShortMessage(0x00000041),

    // Text that is the content of a long message.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_LONG_MESSAGE }.
    textLongMessage(0x00000051),

    // Text that is the name of a person.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_PERSON_NAME }.
    textPersonName(0x00000061),

    // Text that is being supplied as a postal mailing address.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_POSTAL_ADDRESS }.
    textPostalAddress(0x00000071),

    // Text that is a password.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_PASSWORD }.
    textPassword(0x00000081),

    // Text that is a password that should be visible.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_VISIBLE_PASSWORD }.
    textVisiblePassword(0x00000091),

    // Text that is being supplied as text in a web form.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_WEB_EDIT_TEXT }.
    textWebEditText(0x000000a1),

    // Text that is filtering some other data .  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_FILTER }.
    textFilter(0x000000b1),

    // Text that is for phonetic pronunciation, such as a phonetic name
    // field in a contact entry.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_PHONETIC }.
    textPhonetic(0x000000c1),

    // Text that will be used as an e-mail address on a web form.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS }.
    textWebEmailAddress(0x000000d1),

    // Text that will be used as a password on a web form.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_TEXT } |
    // {@link android.text.InputType#TYPE_TEXT_VARIATION_WEB_PASSWORD }.
    textWebPassword(0x000000e1),

    // A numeric only field.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_NUMBER } |
    // {@link android.text.InputType#TYPE_NUMBER_VARIATION_NORMAL }.
    number(0x00000002),

    // Can be combined with <var>number</var> and its other options to
    // allow a signed number.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_NUMBER } |
    // {@link android.text.InputType#TYPE_NUMBER_FLAG_SIGNED }.
    numberSigned(0x00001002),

    // Can be combined with <var>number</var> and its other options to
    // allow a decimal (fractional) number.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_NUMBER } |
    // {@link android.text.InputType#TYPE_NUMBER_FLAG_DECIMAL }.
    numberDecimal(0x00002002),

    // A numeric password field.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_NUMBER } |
    // {@link android.text.InputType#TYPE_NUMBER_VARIATION_PASSWORD }.
    numberPassword(0x00000012),

    // For entering a phone number.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_PHONE }.
    phone(0x00000003),

    // For entering a date and time.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_DATETIME } |
    // {@link android.text.InputType#TYPE_DATETIME_VARIATION_NORMAL }.
    datetime(0x00000004),

    // For entering a date.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_DATETIME } |
    // {@link android.text.InputType#TYPE_DATETIME_VARIATION_DATE }.
    date(0x00000014),

    // For entering a time.  Corresponds to
    // {@link android.text.InputType#TYPE_CLASS_DATETIME } |
    // {@link android.text.InputType#TYPE_DATETIME_VARIATION_TIME }.
    time(0x00000024)
}

enum class ImeOptions(val value: Long) : StyleableFlag {
    // There are no special semantics associated with this editor.
    normal(0x00000000),

    // There is no specific action associated with this editor, let the
    // editor come up with its own if it can.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_NULL }.
    actionUnspecified(0x00000000),

    // This editor has no action associated with it.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_NONE }.
    actionNone(0x00000001),

    // The action key performs a "go"
    // operation to take the user to the target of the text they typed.
    // Typically used, for example, when entering a URL.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_GO }.
    actionGo(0x00000002),

    // The action key performs a "search"
    // operation, taking the user to the results of searching for the text
    // the have typed (in whatever context is appropriate).
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_SEARCH }.
    actionSearch(0x00000003),

    // The action key performs a "send"
    // operation, delivering the text to its target.  This is typically used
    // when composing a message.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_SEND }.
    actionSend(0x00000004),

    // The action key performs a "next"
    // operation, taking the user to the next field that will accept text.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_NEXT }.
    actionNext(0x00000005),

    // The action key performs a "done"
    // operation, closing the soft input method.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_DONE }.
    actionDone(0x00000006),

    // The action key performs a "previous"
    // operation, taking the user to the previous field that will accept text.
    // Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_ACTION_PREVIOUS }.
    actionPrevious(0x00000007),

    // Used to request that the IME should not update any personalized data such as typing
    // history and personalized language model based on what the user typed on this text
    // editing object. Typical use cases are:
    // <ul>
    // <li>When the application is in a special mode, where user's activities are expected
    // to be not recorded in the application's history. Some web browsers and chat
    // applications may have this kind of modes.</li>
    // <li>When storing typing history does not make much sense.  Specifying this flag in
    // typing games may help to avoid typing history from being filled up with words that
    // the user is less likely to type in their daily life.  Another example is that when
    // the application already knows that the expected input is not a valid word (e.g. a
    // promotion code that is not a valid word in any natural language).</li>
    // </ul>
    // <p>Applications need to be aware that the flag is not a guarantee, and some IMEs may
    // not respect it.</p>
    flagNoPersonalizedLearning(0x1000000),

    // Used to request that the IME never go
    // into fullscreen mode.  Applications need to be aware that the flag is not
    // a guarantee, and not all IMEs will respect it.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NO_FULLSCREEN }.
    flagNoFullscreen(0x2000000),

    // Like flagNavigateNext, but
    // specifies there is something interesting that a backward navigation
    // can focus on.  If the user selects the IME's facility to backward
    // navigate, this will show up in the application as an actionPrevious
    // at {@link android.view.inputmethod.InputConnection#performEditorAction(int)
    // InputConnection.performEditorAction(int)}.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NO_FULLSCREEN }.
    flagNavigatePrevious(0x4000000),

    // Used to specify that there is something
    // interesting that a forward navigation can focus on. This is like using
    // actionNext, except allows the IME to be multiline (with
    // an enter key) as well as provide forward navigation.  Note that some
    // IMEs may not be able to do this, especially when running on a small
    // screen where there is little space.  In that case it does not need to
    // present a UI for this option.  Like actionNext, if the
    //  user selects the IME's facility to forward navigate, this will show up
    // in the application at {@link android.view.inputmethod.InputConnection#performEditorAction(int)
    // InputConnection.performEditorAction(int)}.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NAVIGATE_NEXT }.
    flagNavigateNext(0x8000000),

    // Used to specify that the IME does not need
    // to show its extracted text UI.  For input methods that may be fullscreen,
    // often when in landscape mode, this allows them to be smaller and let part
    // of the application be shown behind.  Though there will likely be limited
    // access to the application available from the user, it can make the
    // experience of a (mostly) fullscreen IME less jarring.  Note that when
    // this flag is specified the IME may <em>not</em> be set up to be able
    // to display text, so it should only be used in situations where this is
    // not needed.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NO_EXTRACT_UI }.
    flagNoExtractUi(0x10000000),

    // Used in conjunction with a custom action, this indicates that the
    // action should not be available as an accessory button when the
    // input method is full-screen.
    // Note that by setting this flag, there can be cases where the action
    // is simply never available to the user.  Setting this generally means
    // that you think showing text being edited is more important than the
    // action you have supplied.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NO_ACCESSORY_ACTION }.
    flagNoAccessoryAction(0x20000000),

    // Used in conjunction with a custom action,
    // this indicates that the action should not be available in -line as
    // a replacement for the "enter" key.  Typically this is
    // because the action has such a significant impact or is not recoverable
    // enough that accidentally hitting it should be avoided, such as sending
    // a message.    Note that
    // {@link android.widget.TextView } will
    // automatically set this flag for you on multi-line text views.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_NO_ENTER_ACTION }.
    flagNoEnterAction(0x40000000),

    // Used to request that the IME should be capable of inputting ASCII
    // characters.  The intention of this flag is to ensure that the user
    // can type Roman alphabet characters in a
    // {@link android.widget.TextView }
    // used for, typically, account ID or password input.  It is expected that IMEs
    // normally are able to input ASCII even without being told so (such IMEs
    // already respect this flag in a sense), but there could be some cases they
    // aren't when, for instance, only non-ASCII input languagaes like Arabic,
    // Greek, Hebrew, Russian are enabled in the IME.  Applications need to be
    // aware that the flag is not a guarantee, and not all IMEs will respect it.
    // However, it is strongly recommended for IME authors to respect this flag
    // especially when their IME could end up with a state that has only non-ASCII
    // input languages enabled.
    // <p>Corresponds to
    // {@link android.view.inputmethod.EditorInfo#IME_FLAG_FORCE_ASCII }.
    flagForceAscii(0x80000000)
}

enum class Gravity(val value: Long) : StyleableFlag {
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
    end(0x00800005)
}

enum class AutoLink(val value: Long) : StyleableFlag {
    // Match no patterns (default).
    none(0x00),

    // Match Web URLs.
    web(0x01),

    // Match email addresses.
    email(0x02),

    // Match phone numbers.
    phone(0x04),

    // Match map addresses.
    map(0x08),

    // Match all patterns (equivalent to web|email|phone|map).
    all(0x0f)
}

enum class LayoutGravity(val value: Long) : StyleableFlag {
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
    end(0x00800005)
}

enum class Orientation(val value: Int) : StyleableEnum {
    horizontal(0),
    vertical(1)
}

enum class AlignmentMode(val value: Int) : StyleableEnum {
    // Align the bounds of the children.
    // See {@link android.widget.GridLayout#ALIGN_BOUNDS }.
    alignBounds(0),

    // Align the margins of the children.
    //See {@link android.widget.GridLayout#ALIGN_MARGINS }.
    alignMargins(1)
}

// This enum provides the same keycode values as can be found in
// {@link android.view.KeyEvent}.
enum class Keycode(val value: Int) : StyleableEnum {
    KEYCODE_UNKNOWN(0),
    KEYCODE_SOFT_LEFT(1),
    KEYCODE_SOFT_RIGHT(2),
    KEYCODE_HOME(3),
    KEYCODE_BACK(4),
    KEYCODE_CALL(5),
    KEYCODE_ENDCALL(6),
    KEYCODE_0(7),
    KEYCODE_1(8),
    KEYCODE_2(9),
    KEYCODE_3(10),
    KEYCODE_4(11),
    KEYCODE_5(12),
    KEYCODE_6(13),
    KEYCODE_7(14),
    KEYCODE_8(15),
    KEYCODE_9(16),
    KEYCODE_STAR(17),
    KEYCODE_POUND(18),
    KEYCODE_DPAD_UP(19),
    KEYCODE_DPAD_DOWN(20),
    KEYCODE_DPAD_LEFT(21),
    KEYCODE_DPAD_RIGHT(22),
    KEYCODE_DPAD_CENTER(23),
    KEYCODE_VOLUME_UP(24),
    KEYCODE_VOLUME_DOWN(25),
    KEYCODE_POWER(26),
    KEYCODE_CAMERA(27),
    KEYCODE_CLEAR(28),
    KEYCODE_A(29),
    KEYCODE_B(30),
    KEYCODE_C(31),
    KEYCODE_D(32),
    KEYCODE_E(33),
    KEYCODE_F(34),
    KEYCODE_G(35),
    KEYCODE_H(36),
    KEYCODE_I(37),
    KEYCODE_J(38),
    KEYCODE_K(39),
    KEYCODE_L(40),
    KEYCODE_M(41),
    KEYCODE_N(42),
    KEYCODE_O(43),
    KEYCODE_P(44),
    KEYCODE_Q(45),
    KEYCODE_R(46),
    KEYCODE_S(47),
    KEYCODE_T(48),
    KEYCODE_U(49),
    KEYCODE_V(50),
    KEYCODE_W(51),
    KEYCODE_X(52),
    KEYCODE_Y(53),
    KEYCODE_Z(54),
    KEYCODE_COMMA(55),
    KEYCODE_PERIOD(56),
    KEYCODE_ALT_LEFT(57),
    KEYCODE_ALT_RIGHT(58),
    KEYCODE_SHIFT_LEFT(59),
    KEYCODE_SHIFT_RIGHT(60),
    KEYCODE_TAB(61),
    KEYCODE_SPACE(62),
    KEYCODE_SYM(63),
    KEYCODE_EXPLORER(64),
    KEYCODE_ENVELOPE(65),
    KEYCODE_ENTER(66),
    KEYCODE_DEL(67),
    KEYCODE_GRAVE(68),
    KEYCODE_MINUS(69),
    KEYCODE_EQUALS(70),
    KEYCODE_LEFT_BRACKET(71),
    KEYCODE_RIGHT_BRACKET(72),
    KEYCODE_BACKSLASH(73),
    KEYCODE_SEMICOLON(74),
    KEYCODE_APOSTROPHE(75),
    KEYCODE_SLASH(76),
    KEYCODE_AT(77),
    KEYCODE_NUM(78),
    KEYCODE_HEADSETHOOK(79),
    KEYCODE_FOCUS(80),
    KEYCODE_PLUS(81),
    KEYCODE_MENU(82),
    KEYCODE_NOTIFICATION(83),
    KEYCODE_SEARCH(84),
    KEYCODE_MEDIA_PLAY_PAUSE(85),
    KEYCODE_MEDIA_STOP(86),
    KEYCODE_MEDIA_NEXT(87),
    KEYCODE_MEDIA_PREVIOUS(88),
    KEYCODE_MEDIA_REWIND(89),
    KEYCODE_MEDIA_FAST_FORWARD(90),
    KEYCODE_MUTE(91),
    KEYCODE_PAGE_UP(92),
    KEYCODE_PAGE_DOWN(93),
    KEYCODE_PICTSYMBOLS(94),
    KEYCODE_SWITCH_CHARSET(95),
    KEYCODE_BUTTON_A(96),
    KEYCODE_BUTTON_B(97),
    KEYCODE_BUTTON_C(98),
    KEYCODE_BUTTON_X(99),
    KEYCODE_BUTTON_Y(100),
    KEYCODE_BUTTON_Z(101),
    KEYCODE_BUTTON_L1(102),
    KEYCODE_BUTTON_R1(103),
    KEYCODE_BUTTON_L2(104),
    KEYCODE_BUTTON_R2(105),
    KEYCODE_BUTTON_THUMBL(106),
    KEYCODE_BUTTON_THUMBR(107),
    KEYCODE_BUTTON_START(108),
    KEYCODE_BUTTON_SELECT(109),
    KEYCODE_BUTTON_MODE(110),
    KEYCODE_ESCAPE(111),
    KEYCODE_FORWARD_DEL(112),
    KEYCODE_CTRL_LEFT(113),
    KEYCODE_CTRL_RIGHT(114),
    KEYCODE_CAPS_LOCK(115),
    KEYCODE_SCROLL_LOCK(116),
    KEYCODE_META_LEFT(117),
    KEYCODE_META_RIGHT(118),
    KEYCODE_FUNCTION(119),
    KEYCODE_SYSRQ(120),
    KEYCODE_BREAK(121),
    KEYCODE_MOVE_HOME(122),
    KEYCODE_MOVE_END(123),
    KEYCODE_INSERT(124),
    KEYCODE_FORWARD(125),
    KEYCODE_MEDIA_PLAY(126),
    KEYCODE_MEDIA_PAUSE(127),
    KEYCODE_MEDIA_CLOSE(128),
    KEYCODE_MEDIA_EJECT(129),
    KEYCODE_MEDIA_RECORD(130),
    KEYCODE_F1(131),
    KEYCODE_F2(132),
    KEYCODE_F3(133),
    KEYCODE_F4(134),
    KEYCODE_F5(135),
    KEYCODE_F6(136),
    KEYCODE_F7(137),
    KEYCODE_F8(138),
    KEYCODE_F9(139),
    KEYCODE_F10(140),
    KEYCODE_F11(141),
    KEYCODE_F12(142),
    KEYCODE_NUM_LOCK(143),
    KEYCODE_NUMPAD_0(144),
    KEYCODE_NUMPAD_1(145),
    KEYCODE_NUMPAD_2(146),
    KEYCODE_NUMPAD_3(147),
    KEYCODE_NUMPAD_4(148),
    KEYCODE_NUMPAD_5(149),
    KEYCODE_NUMPAD_6(150),
    KEYCODE_NUMPAD_7(151),
    KEYCODE_NUMPAD_8(152),
    KEYCODE_NUMPAD_9(153),
    KEYCODE_NUMPAD_DIVIDE(154),
    KEYCODE_NUMPAD_MULTIPLY(155),
    KEYCODE_NUMPAD_SUBTRACT(156),
    KEYCODE_NUMPAD_ADD(157),
    KEYCODE_NUMPAD_DOT(158),
    KEYCODE_NUMPAD_COMMA(159),
    KEYCODE_NUMPAD_ENTER(160),
    KEYCODE_NUMPAD_EQUALS(161),
    KEYCODE_NUMPAD_LEFT_PAREN(162),
    KEYCODE_NUMPAD_RIGHT_PAREN(163),
    KEYCODE_VOLUME_MUTE(164),
    KEYCODE_INFO(165),
    KEYCODE_CHANNEL_UP(166),
    KEYCODE_CHANNEL_DOWN(167),
    KEYCODE_ZOOM_IN(168),
    KEYCODE_ZOOM_OUT(169),
    KEYCODE_TV(170),
    KEYCODE_WINDOW(171),
    KEYCODE_GUIDE(172),
    KEYCODE_DVR(173),
    KEYCODE_BOOKMARK(174),
    KEYCODE_CAPTIONS(175),
    KEYCODE_SETTINGS(176),
    KEYCODE_TV_POWER(177),
    KEYCODE_TV_INPUT(178),
    KEYCODE_STB_POWER(179),
    KEYCODE_STB_INPUT(180),
    KEYCODE_AVR_POWER(181),
    KEYCODE_AVR_INPUT(182),
    KEYCODE_PROG_GRED(183),
    KEYCODE_PROG_GREEN(184),
    KEYCODE_PROG_YELLOW(185),
    KEYCODE_PROG_BLUE(186),
    KEYCODE_APP_SWITCH(187),
    KEYCODE_BUTTON_1(188),
    KEYCODE_BUTTON_2(189),
    KEYCODE_BUTTON_3(190),
    KEYCODE_BUTTON_4(191),
    KEYCODE_BUTTON_5(192),
    KEYCODE_BUTTON_6(193),
    KEYCODE_BUTTON_7(194),
    KEYCODE_BUTTON_8(195),
    KEYCODE_BUTTON_9(196),
    KEYCODE_BUTTON_10(197),
    KEYCODE_BUTTON_11(198),
    KEYCODE_BUTTON_12(199),
    KEYCODE_BUTTON_13(200),
    KEYCODE_BUTTON_14(201),
    KEYCODE_BUTTON_15(202),
    KEYCODE_BUTTON_16(203),
    KEYCODE_LANGUAGE_SWITCH(204),
    KEYCODE_MANNER_MODE(205),
    KEYCODE_3D_MODE(206),
    KEYCODE_CONTACTS(207),
    KEYCODE_CALENDAR(208),
    KEYCODE_MUSIC(209),
    KEYCODE_CALCULATOR(210),
    KEYCODE_ZENKAKU_HANKAKU(211),
    KEYCODE_EISU(212),
    KEYCODE_MUHENKAN(213),
    KEYCODE_HENKAN(214),
    KEYCODE_KATAKANA_HIRAGANA(215),
    KEYCODE_YEN(216),
    KEYCODE_RO(217),
    KEYCODE_KANA(218),
    KEYCODE_ASSIST(219),
    KEYCODE_BRIGHTNESS_DOWN(220),
    KEYCODE_BRIGHTNESS_UP(221),
    KEYCODE_MEDIA_AUDIO_TRACK(222),
    KEYCODE_MEDIA_SLEEP(223),
    KEYCODE_MEDIA_WAKEUP(224),
    KEYCODE_PAIRING(225),
    KEYCODE_MEDIA_TOP_MENU(226),
    KEYCODE_11(227),
    KEYCODE_12(228),
    KEYCODE_LAST_CHANNEL(229),
    KEYCODE_TV_DATA_SERVICE(230),
    KEYCODE_VOICE_ASSIST(231),
    KEYCODE_TV_RADIO_SERVICE(232),
    KEYCODE_TV_TELETEXT(233),
    KEYCODE_TV_NUMBER_ENTRY(234),
    KEYCODE_TV_TERRESTRIAL_ANALOG(235),
    KEYCODE_TV_TERRESTRIAL_DIGITAL(236),
    KEYCODE_TV_SATELLITE(237),
    KEYCODE_TV_SATELLITE_BS(238),
    KEYCODE_TV_SATELLITE_CS(239),
    KEYCODE_TV_SATELLITE_SERVICE(240),
    KEYCODE_TV_NETWORK(241),
    KEYCODE_TV_ANTENNA_CABLE(242),
    KEYCODE_TV_INPUT_HDMI_1(243),
    KEYCODE_TV_INPUT_HDMI_2(244),
    KEYCODE_TV_INPUT_HDMI_3(245),
    KEYCODE_TV_INPUT_HDMI_4(246),
    KEYCODE_TV_INPUT_COMPOSITE_1(247),
    KEYCODE_TV_INPUT_COMPOSITE_2(248),
    KEYCODE_TV_INPUT_COMPONENT_1(249),
    KEYCODE_TV_INPUT_COMPONENT_2(250),
    KEYCODE_TV_INPUT_VGA_1(251),
    KEYCODE_TV_AUDIO_DESCRIPTION(252),
    KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP(253),
    KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN(254),
    KEYCODE_TV_ZOOM_MODE(255),
    KEYCODE_TV_CONTENTS_MENU(256),
    KEYCODE_TV_MEDIA_CONTEXT_MENU(257),
    KEYCODE_TV_TIMER_PROGRAMMING(258),
    KEYCODE_HELP(259),
    KEYCODE_NAVIGATE_PREVIOUS(260),
    KEYCODE_NAVIGATE_NEXT(261),
    KEYCODE_NAVIGATE_IN(262),
    KEYCODE_NAVIGATE_OUT(263),
    KEYCODE_STEM_PRIMARY(264),
    KEYCODE_STEM_1(265),
    KEYCODE_STEM_2(266),
    KEYCODE_STEM_3(267),
    KEYCODE_DPAD_UP_LEFT(268),
    KEYCODE_DPAD_DOWN_LEFT(269),
    KEYCODE_DPAD_UP_RIGHT(270),
    KEYCODE_DPAD_DOWN_RIGHT(271),
    KEYCODE_MEDIA_SKIP_FORWARD(272),
    KEYCODE_MEDIA_SKIP_BACKWARD(273),
    KEYCODE_MEDIA_STEP_FORWARD(274),
    KEYCODE_MEDIA_STEP_BACKWARD(275),
    KEYCODE_SOFT_SLEEP(276),
    KEYCODE_CUT(277),
    KEYCODE_COPY(278),
    KEYCODE_PASTE(279),
    KEYCODE_SYSTEM_NAVIGATION_UP(280),
    KEYCODE_SYSTEM_NAVIGATION_DOWN(281),
    KEYCODE_SYSTEM_NAVIGATION_LEFT(282),
    KEYCODE_SYSTEM_NAVIGATION_RIGHT(283),
    KEYCODE_ALL_APPS(284)
}

enum class Layout_ChildType(val value: Int) : StyleableEnum {
    // No special behavior. Layout will proceed as normal. -->
    none(0),
    // Widget container.
    // This will be resized in response to certain events. -->
    widget(1),
    // Security challenge container.
    // This will be dismissed/shown in response to certain events,
    // possibly obscuring widget elements. -->
    challenge(2),
    // User switcher.
    // This will consume space from the total layout area. -->
    userSwitcher(3),
    // Scrim. This will block access to child views that
    // come before it in the child list in bouncer mode. -->
    scrim(4),
    // The home for widgets. All widgets will be descendents of this. -->
    widgets(5),
    // This is a handle that is used for expanding the
    // security challenge container when it is collapsed. -->
    expandChallengeHandle(6),
    // Delete drop target.  This will be the drop target to delete pages. -->
    pageDeleteDropTarget(7),
}




