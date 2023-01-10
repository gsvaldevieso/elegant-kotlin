/** place this initialization into only one ctor and call it a "primary" one. */
class MakeOneConstructorPrimary {

    //dowdy way
    class DowdyCash {

        private var dollars: Int = 0

        constructor(dollars: String) {
            this.dollars = dollars.toInt()
        }

        constructor(dollars: Float) {
            this.dollars = dollars.toInt()
        }

        constructor(dollars: Int) {
            this.dollars = dollars
        }
    }

    //elegant way
    class Cash(private val dollars: Int) {

        constructor(dollars: Float): this(dollars.toInt())
        constructor(dollars: String): this(dollars.toInt())
    }
}
