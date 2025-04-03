package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalculatorImpl implements ICalculator {

    private static final Logger logger = LogManager.getLogger(CalculatorImpl.class);

    /**
     * Easy Calculator for first steps in test automation for Educational Usage
     */
    public CalculatorImpl() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#add(java.lang.double, java.lang.double)
     */
    @Override
    public double add(double number1, double number2) {
        double result = number1 + number2;
        logger.info("Adding {} + {} = {}", number1, number2, result);
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#minus(java.lang.double, java.lang.double)
     */
    @Override
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#divide(java.lang.double, java.lang.double)
     */
    @Override
    public double divide(double number1, double number2) {
        double quotient = number1 / number2;
        if (Double.isNaN(quotient) || Double.isInfinite(quotient)) {
            logger.error("Division by zero: {} / {}", number1, number2);
            throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");
        }
        logger.info("Dividing {} / {} = {}", number1, number2, quotient);
        return quotient;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#multiply(java.lang.double, java.lang.double)
     */
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
