import org.junit.Assert
import org.junit.Test

class TestMultiplication {
    @Test
    fun testTimesSimple() {
        val fraction = TestUtils.createFraction(2, 3)
        val result = fraction * NotImplementedFraction(5, 7)
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }

    @Test
    fun testTimesNormalisation() {
        val fraction = TestUtils.createFraction(4, 6)
        val result = fraction * NotImplementedFraction(5, 7)
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }
}