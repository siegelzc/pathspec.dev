package event

import Store
import kotlinx.browser.document
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLTextAreaElement

fun registerEventListeners() {
    pathspec()
    testCases()
}

private fun pathspec() {
    document.getElementById("pathspec")!!.apply {
        this as HTMLInputElement
        onchange = onChange { value ->
            Store.pathspec = value
        }
    }
}

private fun testCases() {
    document.getElementById("test-cases")!!.apply {
        this as HTMLTextAreaElement
        onchange = onChange { value ->
            Store.testCases = value
        }
    }
}
