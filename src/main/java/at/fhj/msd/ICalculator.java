package at.fhj.msd;

/**
 * Interface for a simple calculator providing basic operations.
 */
public interface ICalculator {

    /**
     * Adds two numbers together.
     * @param number1 first number
     * @param number2 second number
     * @return the sum
     */
    double add(double number1, double number2);

    /**
     * Subtracts the second number from the first number.
     * @param number1 first number
     * @param number2 second number
     * @return the result
     */
    double minus(double number1, double number2);

    /**
     * Divides the first number by the second number.
     * @param number1 numerator
     * @param number2 denominator
     * @return the quotient
     * @throws ArithmeticException if division by zero
     */
    double divide(double number1, double number2);

    /**
     * Multiplies two numbers.
     * @param number1 first number
     * @param number2 second number
     * @return the product
     */
    double multiply(double number1, double number2);

    /**
     * Calculates the factorial of a number.
     * @param n the number
     * @return factorial value
     */
    double factorial(int n);
}
