package generator

class IOSGenerator : BaseGenerator() {
    override val layoutLiteral: String = "View"
    override val controllerLiteral: String = "ViewModel"
    override val modelLiteral: String = "Model"

    override fun getLayoutName(screenName: String): String {
        return "${convertToCamelCase(super.getLayoutName(screenName))}$layoutLiteral"
    }

    override fun getControllerName(screenName: String): String {
        return "${convertToCamelCase(super.getControllerName(screenName))}$controllerLiteral"
    }

    override fun getModelName(screenName: String): String {
        return "${convertToCamelCase(super.getModelName(screenName))}$modelLiteral"
    }
}