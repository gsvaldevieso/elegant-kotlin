import org.junit.jupiter.api.Test
import java.math.BigDecimal

class EncapsulateAsLittleAsPossibleTest {

    @Test
    fun `should create a dowdy order instance`() {
        EncapsulateAsLittleAsPossible.DowdyOrder(
            "Widget",
            BigDecimal("12.99"),
            2,
            "John Doe",
            "johndoe@example.com",
            "123 Main St",
            "Anytown",
            "CA",
            "12345"
        )
    }

    @Test
    fun `should create a order instance`() {
        val item = EncapsulateAsLittleAsPossible.Item("Widget", BigDecimal("12.99"), 2)
        val customer = EncapsulateAsLittleAsPossible.Customer("John Doe", "johndoe@example.com")
        val shipping = EncapsulateAsLittleAsPossible.Address("123 Main St", "Anytown", "CA", "12345")

        EncapsulateAsLittleAsPossible.Order(item, customer, shipping)
    }
}