import kotlinx.browser.document
import eval.PathspecInput
import eval.TestCaseInput

fun main() {
    document.body!!.apply {
        appendChild(PathspecInput)
        appendChild(TestCaseInput)
    }
}
