package dom

@Suppress("unused")
enum class InputType(val domValue: String) {
    BUTTON("button"),
    CHECKBOX("checkbox"),
    COLOR("color"),
    DATE("date"),
    DATETIME_LOCAL("datetime-local"),
    EMAIL("email"),
    FILE("file"),
    HIDDEN("hidden"),
    IMAGE("image"),
    MONTH("month"),
    NUMBER("number"),
    PASSWORD("password"),
    RADIO("radio"),
    RANGE("range"),
    RESET("reset"),
    SEARCH("search"),
    SUBMIT("submit"),
    TEL("tel"),
    TEXT("text"),
    TIME("time"),
    URL("url"),
    WEEK("week"),

    @Deprecated(
        "Deprecated by major web browsers",
        replaceWith = ReplaceWith("DATETIME_LOCAL"),
        level = DeprecationLevel.ERROR
    )
    DATETIME("datetime")
}
