# What if

## Scenario 1

What if you could define a style at runtime like this:

```kotlin
// DSL snippet for the new style that will be applied when
// our button is clicked.
val buttonStyleAfterClick = style(scope = CoreButtonStyleable::class) {
    background = "#409FF000"
    textColor = colorStateList {
        item(pressed = true) {
            color = "#ffff00ff"
        }
        item {
            color = "#ff0000ff"
        }
    }
    textAllCaps = false
}
```

Then define the layout like this:

```kotlin
// DSL snippet for the initial activity content
val content = linearLayout {
    layout_width = LayoutWidth.match_parent
    layout_height = LayoutHeight.match_parent
    orientation = Orientation.vertical
    padding = 8.dp

    val button = button {
        id = R.id.button
        layout_width = LayoutWidth.match_parent
        layout_height = 64.dp

        // "Embedded" color state list for the button's text color
        textColor = colorStateList {
            item(pressed = true) {
                color = "#ffff0000"
            }
            item {
                color = "#ff000000"
            }
        }

        text = "Click me!"
    }
}

// Call the extension setContentView to build the view hierarchy
setContentView(content)
```

And also change the button's style at runtime when it's clicked:

```kotlin
// Click listener for the button
button.onClickListener = View.OnClickListener {
    // Make a copy of the style DSL snippet so that we can modify it
    // without affecting other usages
    val styleCopy = buttonStyleAfterClick.copy()

    // Update the style copy with new text
    styleCopy.text = "After click!"

    // Apply this tweaked style to the button
    styleCopy.applyTo(it)
}
```

## Scenario 2

Or maybe, starting from a simple view model that counts up:

```kotlin
class MainActivityViewModel : ViewModel() {
    private val _countData: MutableLiveData<Int> = MutableLiveData()
    val countData: LiveData<Int> = _countData

    init {
        _countData.value = 0
    }

    fun increaseCount() {
        _countData.value = _countData.value!! + 1
    }
}
```

Then define the initial layout at runtime:
```kotlin
// DSL snippet for the initial activity content
val content = linearLayout {
    layout_width = LayoutWidth.match_parent
    layout_height = LayoutHeight.match_parent
    orientation = Orientation.vertical
    padding = 8.dp

    val button = button {
        id = R.id.button
        layout_width = LayoutWidth.match_parent
        layout_height = 64.dp

        // "Embedded" color state list for the button's text color
        textColor = colorStateList {
            item(pressed = true) {
                color = "#ffff0000"
            }
            item(focused = true) {
                color = "#ff0000ff"
            }
            item {
                color = "#ff000000"
            }
        }
    }
}
```

And wire the button to change its text whenever the model content changes:
```kotlin
// Call the extension setContentView to build the view hierarchy
val contentView = setContentView(content)

// Get the built android.widget.Button
val buttonWidget = contentView.findViewById<Button>(R.id.button)

// Get the view model and wire ourselves to observe the changes to
// the model content to update the button text
dataModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
    dataModel.countData.observe(this,
        Observer { value -> buttonWidget.text = "Go " + value })
```

And when the button is clicked, add a new text view to the hierarchy that is styled dynamically based on our model:
```kotlin
// Click listener for the button
button.onClickListener = View.OnClickListener {
    // DSL snippet for generating a new TextView
    val newChild = textView {
        layout_width = LayoutWidth.match_parent
        layout_height = 64.dp
        text = "Tap " + dataModel.countData.value
        // "Copy" the color from the button
        textColor = if (dataModel.countData.value!! < 5) button.textColor else "#FF00FF00"
        background = "#400090FF"
        padding = 8.dp
    }
    newChild.onClickListener = View.OnClickListener {
        Toast.makeText(it.context, "Clicked " + (it as TextView).text, Toast.LENGTH_SHORT).show()
    }
    it.parent.addView(newChild)

    // Update our data model
    dataModel.increaseCount()
}
```
