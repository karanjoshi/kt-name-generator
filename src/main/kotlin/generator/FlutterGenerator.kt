package generator

class FlutterGenerator : BaseGenerator() {
    override val layoutLiteral: String = "screen"
    override val controllerLiteral: String = "controller"
    override val modelLiteral: String = "model"

    private fun removeScreenLiteralAtEnd(screenName: String): String {
        return screenName.replace("_$layoutLiteral", "")
    }


    override fun getLayoutName(screenName: String): String {
        val updatedName = removeScreenLiteralAtEnd(super.getLayoutName(screenName).replace(" ", "_"))
        return "${updatedName}_$layoutLiteral".toLowerCase()
    }

    override fun getControllerName(screenName: String): String {
        val updatedName = removeScreenLiteralAtEnd(super.getLayoutName(screenName).replace(" ", "_"))
        return "${updatedName}_$controllerLiteral".toLowerCase()
    }

    override fun getModelName(screenName: String): String {
        val updatedName = removeScreenLiteralAtEnd(super.getLayoutName(screenName).replace(" ", "_"))
        return "${updatedName}_$modelLiteral".toLowerCase()
    }
}