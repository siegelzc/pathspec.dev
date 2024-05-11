package components

import Store
import event.onChange
import kotlinx.browser.document
import org.w3c.dom.HTMLInputElement

object Pathspec : Component() {
    private val element: HTMLInputElement
        get() = (document.getElementById("pathspec")!! as HTMLInputElement)

    override fun register() {
        element.apply {
            onchange = onChange { value ->
                Store.pathspec = value
            }
        }
    }
}
