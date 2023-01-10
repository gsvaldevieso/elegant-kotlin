/** a class should be named by what he is, not what he does. */
class NeverUseErNames {
    //dowdy way
    class CashFormatter(private val dollars: Int) {
        fun format() = "$ ${this.dollars}"
    }

    //elegant way
    class Cash(private val dollars: Int) {
        fun usd() = "$ ${this.dollars}"
    }
}

