import java.math.BigDecimal

/** Ihe initialization of an obiect must be "code-free" and must not touch the arguments. */
class KeepConstructorsCodeFree {

    //shared
    data class Item(val price: BigDecimal)

    //dowdy way
    class DowdyOrder() {
        private var total: BigDecimal = BigDecimal.ZERO

        constructor(items: List<Item>) : this() {
            this.total = items.fold(BigDecimal.ZERO) {
                    acc, item -> acc + item.price
            }
        }

        fun total() = this.total
    }

    //elegant way
    class Order(private val items: List<Item>) {
        fun total(): BigDecimal = items.fold(BigDecimal.ZERO) {
            acc, item -> acc + item.price
        }
    }
}