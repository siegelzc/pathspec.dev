package eval

import kotlinx.browser.document
import org.w3c.dom.HTMLTextAreaElement

val TestCaseInput: HTMLTextAreaElement by lazy {
    val element = document.createElement("textarea") as HTMLTextAreaElement
    element.apply {
        placeholder = "test cases.."
        rows = 10
        required = true
    }
}
