package generator


abstract class BaseGenerator {

    abstract val layoutLiteral: String
    abstract val controllerLiteral: String
    abstract val modelLiteral: String

    protected fun convertToCamelCase(screenName: String): String {
        return screenName.split(" ").map { it.trim().capitalize() }.joinToString("")
    }

    private fun removeNoiseFromScreenName(screenName: String): String {
        val name = Regex("([^a-zA-Z ]+?)").replace(screenName, "")
            .trim()
        if (name.isEmpty())
            throw IllegalArgumentException("screenName should have at least one character")
        return name
    }

    open fun getLayoutName(screenName: String): String = removeNoiseFromScreenName(screenName)
    open fun getControllerName(screenName: String): String = removeNoiseFromScreenName(screenName)
    open fun getModelName(screenName: String): String = removeNoiseFromScreenName(screenName)

}