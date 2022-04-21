import generator.AndroidGenerator
import generator.FlutterGenerator
import generator.IOSGenerator

fun main(args: Array<String>) {
    if (args.isEmpty() || args.size < 2)
        throw IllegalArgumentException("Please provide technology and screen name")
    val technology = args[0]
    val screeName = args[1]
    val nameGenerator = when (technology) {
        "android" -> AndroidGenerator()
        "iOS" -> IOSGenerator()
        "flutter" -> FlutterGenerator()
        else -> throw UnsupportedOperationException("Technology not supported yet")
    }
    println("Layout ==> ${nameGenerator.getLayoutName(screeName)}")
    println("Controller ==> ${nameGenerator.getControllerName(screeName)}")
    println("Model ==> ${nameGenerator.getModelName(screeName)}")
}