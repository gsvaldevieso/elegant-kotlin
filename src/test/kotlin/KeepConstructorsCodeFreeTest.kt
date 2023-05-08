import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.test.assertEquals

class KeepConstructorsCodeFreeTest {

    @Test
    fun `should calculate the order total amount`() {
        val items = listOf(
            KeepConstructorsCodeFree.Item(BigDecimal.ONE),
            KeepConstructorsCodeFree.Item(BigDecimal.TEN),
            KeepConstructorsCodeFree.Item(BigDecimal.TWO)
        )

        assertEquals(BigDecimal(13), KeepConstructorsCodeFree.Order(items).total())
    }

    @Test
    fun `should calculate the dowdy order total amount`() {
        val items = listOf(
            KeepConstructorsCodeFree.Item(BigDecimal.ONE),
            KeepConstructorsCodeFree.Item(BigDecimal.TEN),
            KeepConstructorsCodeFree.Item(BigDecimal.TWO)
        )

        assertEquals(BigDecimal(13), KeepConstructorsCodeFree.DowdyOrder(items).total())
    }
}