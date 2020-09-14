public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int lowestCommonMultiple = findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int numerator1 = lowestCommonMultiple / denominator * numerator;
        int numerator2 = lowestCommonMultiple / other.getDenominator() * other.getNumerator();

        return new Fraction(numerator1 + numerator2, lowestCommonMultiple);
    }

    @Override
    public IFraction minus(IFraction other) {
        int lowestCommonMultiple = findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int numerator1 = lowestCommonMultiple / denominator * numerator;
        int numerator2 = lowestCommonMultiple / other.getDenominator() * other.getNumerator();

        return new Fraction(numerator1 - numerator2, lowestCommonMultiple);
    }

    @Override
    public IFraction times(IFraction other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        throw new UnsupportedOperationException();
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }

    private static Integer findGreatestCommonDenominator(Integer i1, Integer i2) {
        if (i1 < i2) return findGreatestCommonDenominator(i2, i1);
        if (i2 == 0) return i1;
        return findGreatestCommonDenominator(i2, i1 % i2);
    }

    private static Integer findLowestCommonMultiple(Integer i1, Integer i2) {
        if (i1 == 0 || i2 == 0) return 0;
        else {
            int gcd = findGreatestCommonDenominator(i1, i2);
            return Math.abs(i1 * i2) / gcd;
        }
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);

        System.out.println(fraction1.plus(fraction2).getNumerator() + "|" + fraction1.plus(fraction2).getDenominator());
        System.out.println(fraction1.minus(fraction2).getNumerator() + "|" + fraction1.minus(fraction2).getDenominator());

    }
}
