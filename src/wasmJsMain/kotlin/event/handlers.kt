package event

import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLTextAreaElement
import org.w3c.dom.events.Event
import org.w3c.dom.events.InputEvent

typealias StringHandler = (String) -> Unit
typealias EventHandler = (Event) -> Unit

fun HTMLInputElement.onChange(callback: StringHandler): EventHandler {
    return String.handler(callback)
}

fun HTMLTextAreaElement.onChange(callback: StringHandler): EventHandler {
    return String.handler(callback)
}

private external interface WithValue : JsAny {
    val value: String
}

private fun String.Companion.handler(callback: StringHandler): EventHandler {
    return { e: Event ->
        val inputEvent = e.unsafeCast<InputEvent>()
        val value = inputEvent.target?.unsafeCast<WithValue>()?.value ?: ""
        callback(value)
    }
}
