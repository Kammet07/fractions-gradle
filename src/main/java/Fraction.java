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
        int lcm = lcm(getDenominator(), other.getDenominator());
        int n1 = lcm / denominator * numerator;
        int n2 = lcm / other.getDenominator() * other.getNumerator();

        return createNormalised(n1 + n2, lcm);
    }

    @Override
    public IFraction minus(IFraction other) {
        int lcm = lcm(getDenominator(), other.getDenominator());
        int n1 = lcm / denominator * numerator;
        int n2 = lcm / other.getDenominator() * other.getNumerator();

        return createNormalised(n1 - n2, lcm);
    }

    @Override
    public IFraction times(IFraction other) {
        int timesNumerator = numerator * other.getNumerator();
        int timesDenominator = denominator * other.getDenominator();

        return createNormalised(timesNumerator, timesDenominator);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int timesNumerator = numerator * other.getDenominator();
        int timesDenominator = denominator * other.getNumerator();

        return createNormalised(timesNumerator, timesDenominator);
    }

    private static Fraction createNormalised(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    private static Integer gcd(Integer i1, Integer i2) {
        return i2 == 0 ? i1 : gcd(i2, i1 % i2);
    }

    private static Integer lcm(Integer i1, Integer i2) {
        if (i1 == 0 || i2 == 0) return 0;
        else {
            int gcd = gcd(i1, i2);
            return Math.abs(i1 * i2) / gcd;
        }
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);

        System.out.println(fraction1.plus(fraction2).getNumerator() + "|" + fraction1.plus(fraction2).getDenominator());
        System.out.println(fraction1.minus(fraction2).getNumerator() + "|" + fraction1.minus(fraction2).getDenominator());
        System.out.println(createNormalised(5, 1071).getNumerator() + "|" + createNormalised(5, 1071).getDenominator());

    }
}
