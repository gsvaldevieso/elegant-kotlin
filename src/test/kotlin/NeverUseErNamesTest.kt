import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NeverUseErNamesTest {
    @Test
    fun `should format a cash using a cash formatter`() {
        val cashFormatter = CashFormatter(12)
        assertEquals("$ 12", cashFormatter.format())
    }

    @Test
    fun `should format a cash in usd currency using the cash class`() {
        val cash = Cash(12)
        assertEquals("$ 12", cash.usd())
    }
}
