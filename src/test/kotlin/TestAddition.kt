import org.junit.Assert
import org.junit.Test

class TestAddition {
    @Test
    fun testPlusSimple() {
        val fraction = TestUtils.createFraction(3, 5)
        val result = fraction + NotImplementedFraction(3, 5)
        Assert.assertEquals(6, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    @Test
    fun testPlusNormalisation() {
        val fraction = TestUtils.createFraction(1, 2)
        val result = fraction + NotImplementedFraction(1, 2)
        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }
}