import org.junit.Assert
import org.junit.Test

class TestSubtraction {
    @Test
    fun testMinusSimple() {
        val fraction = TestUtils.createFraction(7, 9)
        val result = fraction - NotImplementedFraction(2, 5)
        Assert.assertEquals(17, result.numerator)
        Assert.assertEquals(45, result.denominator)
    }

    @Test
    fun testMinusNormalisation() {
        val fraction = TestUtils.createFraction(6, 4)
        val result = fraction - NotImplementedFraction(1, 2)
        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }
}