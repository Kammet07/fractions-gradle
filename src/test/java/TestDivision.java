import org.junit.Assert;
import org.junit.Test;


public class TestDivision {

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
