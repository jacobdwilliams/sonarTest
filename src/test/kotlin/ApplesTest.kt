import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApplesTest {

    @Test
    fun testTakeBite() {
        var myApple = Apples()
        myApple.takeBite(60)
        assertEquals(40, myApple.qty)
    }
}