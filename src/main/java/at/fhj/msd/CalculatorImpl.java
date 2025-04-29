package at.fhj.msd;

/**
 * Implementation of the ICalculator interface.
 */
public class CalculatorImpl implements ICalculator {

    /**
     * Default constructor.
     */
    public CalculatorImpl() {}

    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double divide(double number1, double number2) {
        double quotient = number1 / number2;
        if (Double.isNaN(quotient) || Double.isInfinite(quotient))
            throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");
        return quotient;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double factorial(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
