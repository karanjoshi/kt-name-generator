package generator

class AndroidGenerator : BaseGenerator() {
    override val layoutLiteral: String = "activity"
    override val controllerLiteral: String = "Activity"
    override val modelLiteral: String = "Model"

    override fun getLayoutName(screenName: String): String {
        return "${layoutLiteral}_${super.getLayoutName(screenName).replace(" ", "_")}".toLowerCase()

    }

    override fun getControllerName(screenName: String): String {
        return "${convertToCamelCase(super.getControllerName(screenName))}$controllerLiteral"
    }

    override fun getModelName(screenName: String): String {
        return "${convertToCamelCase(super.getModelName(screenName))}$modelLiteral"
    }
}