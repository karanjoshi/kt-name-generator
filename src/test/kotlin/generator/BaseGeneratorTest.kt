package generator

import org.junit.Test
import kotlin.test.assertFailsWith

internal abstract class BaseGeneratorTest {

    abstract val nameGenerator: BaseGenerator

    @Test
    fun testNameWithOnlyIllegalCharacters() {
        val screenName = " @#_123"
        assertFailsWith(IllegalArgumentException::class, "empty screen name") {
            nameGenerator.getLayoutName(screenName)
        }
        assertFailsWith(IllegalArgumentException::class, "empty controller name") {
            nameGenerator.getControllerName(screenName)
        }
        assertFailsWith(IllegalArgumentException::class, "empty model name") {
            nameGenerator.getModelName(screenName)
        }
    }


}