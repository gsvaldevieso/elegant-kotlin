import org.junit.jupiter.api.Test

class MakeOneConstructorPrimaryTest {

    @Test
    fun `should instance a dowdy cash using multiple kinds of variables as argument`() {
        MakeOneConstructorPrimary.DowdyCash(24)
        MakeOneConstructorPrimary.DowdyCash(24.0f)
        MakeOneConstructorPrimary.DowdyCash("24")
    }

    @Test
    fun `should instance a cash using multiple kinds of variables as argument`() {
        MakeOneConstructorPrimary.Cash(24)
        MakeOneConstructorPrimary.Cash(24.0f)
        MakeOneConstructorPrimary.Cash("24")
    }
}
