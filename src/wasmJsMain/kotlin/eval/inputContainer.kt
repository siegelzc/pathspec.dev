package eval

import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement

fun HTMLElement.inputContainer(): Element {
    append(inputContainer)
    return inputContainer
}

internal val inputContainer = document.createElement("div") {
    className = "input-container"
}
