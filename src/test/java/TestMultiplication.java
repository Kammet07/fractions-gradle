import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

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
}
