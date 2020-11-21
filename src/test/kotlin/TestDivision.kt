import org.junit.Assert
import org.junit.Test

class TestDivision {
    @Test
    fun testDividedBySimple() {
        val fraction = TestUtils.createFraction(4, 1)
        val result = fraction / NotImplementedFraction(3, 1)
        Assert.assertEquals(4, result.numerator)
        Assert.assertEquals(3, result.denominator)
    }

    @Test
    fun testDividedByNormalisation() {
        val fraction = TestUtils.createFraction(4, 6)
        val result = fraction / NotImplementedFraction(7, 5)
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }
}