package eval

import kotlinx.html.TagConsumer
import kotlinx.html.js.textArea
import org.w3c.dom.Element

fun TagConsumer<Element>.testCaseInput(): Element = textArea {
    rows = 10.toString()
    placeholder = "test cases.."
    required = true
}
