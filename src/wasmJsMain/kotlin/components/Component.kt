package components

open class Component protected constructor() {
    companion object {
        fun registerAll() {
            Pathspec.register()
            TestCases.register()
        }
    }

    open fun register() {}
}
