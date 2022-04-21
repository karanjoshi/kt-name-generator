package generator

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class AndroidGeneratorTest : BaseGeneratorTest() {
    override val nameGenerator: BaseGenerator = AndroidGenerator()


    @Test
    fun testNameWithNumber() {
        val screenName = "Notification 1"
        assertEquals("activity_notification", nameGenerator.getLayoutName(screenName))
        assertEquals("NotificationActivity", nameGenerator.getControllerName(screenName))
        assertEquals("NotificationModel", nameGenerator.getModelName(screenName))
    }

    @Test
    fun testNameWithSpecialCharacters() {
        val screenName = "\$plash screen"
        assertEquals("activity_plash_screen", nameGenerator.getLayoutName(screenName))
        assertEquals("PlashScreenActivity", nameGenerator.getControllerName(screenName))
        assertEquals("PlashScreenModel", nameGenerator.getModelName(screenName))
    }

}