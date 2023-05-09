import java.math.BigDecimal

/**
 * ..encapsulate four objects or less.
 * If you need to encapsulate more, there is something wrong with the class,
 * and it needs refactoring.
 **/
class EncapsulateAsLittleAsPossible {

    //dowdy way
    data class DowdyOrder(
        private val description: String,
        private val price: BigDecimal,
        private val quantity: Int,
        private val name: String,
        private val email: String,
        private val street: String,
        private val city: String,
        private val state: String,
        private val zip: String
    )

    //elegant way
    data class Order(
        private val item: Item,
        private val customer: Customer,
        private val shipping: Address
    )

    data class Item(
        private val description: String,
        private val price: BigDecimal,
        private val quantity: Int
    )

    data class Customer(
        private val name: String,
        private val email: String
    )

    data class Address(
        private val street: String,
        private val city: String,
        private val state: String,
        private val zip: String
    )
}
