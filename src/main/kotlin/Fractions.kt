import kotlin.math.abs

class Fraction(override val numerator: Int, override val denominator: Int) : IFraction {

    override operator fun plus(other: IFraction): IFraction {
        val lcm = lcm(denominator, other.denominator)
        val n1 = lcm / denominator * numerator
        val n2: Int = lcm / other.denominator * other.numerator
        return createNormalised(n1 + n2, lcm)
    }

    override operator fun minus(other: IFraction): IFraction {
        val lcm = lcm(denominator, other.denominator)
        val n1 = lcm / denominator * numerator
        val n2: Int = lcm / other.denominator * other.numerator
        return createNormalised(n1 - n2, lcm)
    }

    override operator fun times(other: IFraction): IFraction {
        val timesNumerator: Int = numerator * other.numerator
        val timesDenominator: Int = denominator * other.denominator
        return createNormalised(timesNumerator, timesDenominator)
    }

    override operator fun div(other: IFraction): IFraction {
        val timesNumerator: Int = numerator * other.denominator
        val timesDenominator: Int = denominator * other.numerator
        return createNormalised(timesNumerator, timesDenominator)
    }




    override fun toString(): String {
        return "Fraction $numerator|$denominator"
    }

    companion object {
        private fun createNormalised(numerator: Int, denominator: Int): Fraction {
            val gcd = gcd(numerator, denominator)
            return Fraction(numerator / gcd, denominator / gcd)
        }

        private fun gcd(i1: Int, i2: Int): Int {
            return if (i2 == 0) i1 else gcd(i2, i1 % i2)
        }

        private fun lcm(i1: Int, i2: Int): Int {
            return if (i1 == 0 || i2 == 0) 0 else {
                val gcd = gcd(i1, i2)
                abs(i1 * i2) / gcd
            }
        }
    }

    init {
        if (denominator == 0) throw ArithmeticException("Cannot Divide by 0")
    }
}