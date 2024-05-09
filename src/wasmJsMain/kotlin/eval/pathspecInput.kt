package eval

import dom.InputType
import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement

fun Element.pathspecInput(): Element {
    append(pathspecInput)
    return pathspecInput
}

internal val pathspecInput = document.createElement("input") {
    this as HTMLInputElement

    type = InputType.TEXT.domValue
    placeholder = "pathspec..."
    autofocus = true
    required = true
}
