package eval

import kotlinx.html.InputType
import kotlinx.html.TagConsumer
import kotlinx.html.input
import org.w3c.dom.Element

fun TagConsumer<Element>.pathspecInput(): Element = input {
    type = InputType.text
    placeholder = "pathspec..."
    autoFocus = true
    required = true
}
