package eval

import kotlinx.browser.document
import kotlinx.dom.createElement
import org.w3c.dom.Element

val InputContainer: (Element) -> Element = { child: Element ->
    document.createElement("div") {
        className = "input-container"

        appendChild(child)
    }
}
