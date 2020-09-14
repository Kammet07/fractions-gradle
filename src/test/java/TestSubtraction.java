import org.junit.Assert;
import org.junit.Test;


public class TestSubtraction {

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
}
