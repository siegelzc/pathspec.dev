package eval

import dom.InputType
import kotlinx.browser.document
import org.w3c.dom.HTMLInputElement

val PathspecInput: HTMLInputElement by lazy {
    val element = document.createElement("input") as HTMLInputElement
    element.apply {
        type = InputType.TEXT.domValue
        placeholder = "pathspec..."
        autofocus = true
        required = true
    }
}
