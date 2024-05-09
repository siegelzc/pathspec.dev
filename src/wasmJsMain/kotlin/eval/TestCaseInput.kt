package eval

import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLTextAreaElement

val TestCaseInput: Element by lazy {
    InputContainer(textarea)
}

internal val textarea = document.createElement("textarea") {
    this as HTMLTextAreaElement

    placeholder = "test cases.."
    rows = 10
    required = true
}
