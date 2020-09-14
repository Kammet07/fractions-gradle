import org.junit.Assert;
import org.junit.Test;


public class TestAddition {

    @Test
    public void testPlusSimple() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.plus(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 6, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testPlusNormalisation() {
        var fraction = TestUtils.createFraction(1, 2);
        var result = fraction.plus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

    @Test
    public void testMinusSimple() {
        var fraction = TestUtils.createFraction(7, 9);
        var result = fraction.minus(new NotImplementedFraction(2, 5));

        Assert.assertEquals((Integer) 17, result.getNumerator());
        Assert.assertEquals((Integer) 45, result.getDenominator());
    }

    @Test
    public void testMinusNormalisation() {
        var fraction = TestUtils.createFraction(6, 4);
        var result = fraction.minus(new NotImplementedFraction(1, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }

    @Test
    public void testTimesSimple() {
        var fraction = TestUtils.createFraction(2, 3);
        var result = fraction.times(new NotImplementedFraction(5, 7));

        Assert.assertEquals((Integer) 10, result.getNumerator());
        Assert.assertEquals((Integer) 21, result.getDenominator());
    }

    @Test
    public void testTimesNormalisation() {
        var fraction = TestUtils.createFraction(4, 6);
        var result = fraction.times(new NotImplementedFraction(5, 7));

        Assert.assertEquals((Integer) 10, result.getNumerator());
        Assert.assertEquals((Integer) 21, result.getDenominator());
    }

    @Test
    public void testDividedBySimple() {
        var fraction = TestUtils.createFraction(12, 7);
        var result = fraction.dividedBy(new NotImplementedFraction(6, 11));

        Assert.assertEquals((Integer) 22, result.getNumerator());
        Assert.assertEquals((Integer) 7, result.getDenominator());
    }

    @Test
    public void testDividedByNormalisation() {
        var fraction = TestUtils.createFraction(4, 6);
        var result = fraction.dividedBy(new NotImplementedFraction(7, 5));

        Assert.assertEquals((Integer) 10, result.getNumerator());
        Assert.assertEquals((Integer) 21, result.getDenominator());
    }

}
