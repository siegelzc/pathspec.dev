package eval

import dom.InputType
import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement

val PathspecInput: Element by lazy {
    InputContainer(input)
}

internal val input = document.createElement("input") {
    this as HTMLInputElement

    type = InputType.TEXT.domValue
    placeholder = "pathspec..."
    autofocus = true
    required = true
}
