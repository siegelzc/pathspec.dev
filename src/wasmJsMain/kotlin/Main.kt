import eval.pathspecInput
import eval.testCaseInput
import kotlinx.browser.document
import kotlinx.html.dom.append
import kotlinx.html.js.div

fun main() {
    document.body!!.append {
        div(classes = "input-container") {
            pathspecInput()
            testCaseInput()
        }
    }
}
