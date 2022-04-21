package generator

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class FlutterGeneratorTest : BaseGeneratorTest() {
    override val nameGenerator: BaseGenerator = FlutterGenerator()


    @Test
    fun testNameWithNumber() {
        val screenName = "Notification 1"
        assertEquals("notification_screen", nameGenerator.getLayoutName(screenName))
        assertEquals("notification_controller", nameGenerator.getControllerName(screenName))
        assertEquals("notification_model", nameGenerator.getModelName(screenName))
    }


    @Test
    fun testNameWithSpecialCharacters() {
        val screenName = "\$plash screen"
        assertEquals("plash_screen", nameGenerator.getLayoutName(screenName))
        assertEquals("plash_controller", nameGenerator.getControllerName(screenName))
        assertEquals("plash_model", nameGenerator.getModelName(screenName))
    }

}