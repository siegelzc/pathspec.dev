import kotlinx.browser.document
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLTextAreaElement
import org.w3c.dom.events.InputEvent

fun registerEventListeners() {
    pathspec()
    testCases()
}

internal fun pathspec() {
    document.getElementById("pathspec")!!.apply {
        this as HTMLInputElement
        onchange = { e ->
            val inputEvent = e.unsafeCast<InputEvent>()
            Store.pathspec = inputEvent.target?.unsafeCast<HTMLInputElement>()?.value ?: ""
        }
    }
}

internal fun testCases() {
    document.getElementById("test-cases")!!.apply {
        this as HTMLTextAreaElement
        onchange = { e ->
            val inputEvent = e.unsafeCast<InputEvent>()
            Store.testCases = inputEvent.target?.unsafeCast<HTMLTextAreaElement>()?.value ?: ""
        }
    }
}
