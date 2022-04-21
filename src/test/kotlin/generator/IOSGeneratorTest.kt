package generator

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class IOSGeneratorTest : BaseGeneratorTest() {
    override val nameGenerator: BaseGenerator = IOSGenerator()


    @Test
    fun testNameWithNumber() {
        val screenName = "Notification 1"
        assertEquals("NotificationView", nameGenerator.getLayoutName(screenName))
        assertEquals("NotificationViewModel", nameGenerator.getControllerName(screenName))
        assertEquals("NotificationModel", nameGenerator.getModelName(screenName))
    }

    @Test
    fun testNameWithSpecialCharacters() {
        val screenName = "\$plash screen"
        assertEquals("PlashScreenView", nameGenerator.getLayoutName(screenName))
        assertEquals("PlashScreenViewModel", nameGenerator.getControllerName(screenName))
        assertEquals("PlashScreenModel", nameGenerator.getModelName(screenName))
    }

}