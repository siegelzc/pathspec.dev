package eval

import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element
import org.w3c.dom.HTMLTextAreaElement

fun Element.testCaseInput(): Element {
    append(testCaseInput)
    return testCaseInput
}

internal val testCaseInput = document.createElement("textarea") {
    this as HTMLTextAreaElement

    placeholder = "test cases.."
    rows = 10
    required = true
}
