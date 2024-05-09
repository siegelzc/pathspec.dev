import eval.inputContainer
import eval.pathspecInput
import eval.testCaseInput
import kotlinx.browser.document

fun main() {
    document.body!!.apply {
        inputContainer().apply {
            pathspecInput()
            testCaseInput()
        }
    }
}
