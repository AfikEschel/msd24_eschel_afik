package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    private ICalculator calc;

    @BeforeEach
    void setUp() {
        calc = new CalculatorImpl();
    }

    // ----- ADDITION TESTS -----

    @Test
    @DisplayName("Add: 2.0 + 3.0 = 5.0")
    void testAddNormalValues() {
        assertEquals(5.0, calc.add(2.0, 3.0), 0.0001);
    }

    @Test
    @DisplayName("Add: 0.0 + 0.0 = 0.0")
    void testAddWithZero() {
        assertEquals(0.0, calc.add(0.0, 0.0), 0.0001);
    }

    @Test
    @DisplayName("Add: -2.0 + 3.0 = 1.0")
    void testAddWithNegative() {
        assertEquals(1.0, calc.add(-2.0, 3.0), 0.0001);
    }

    // ----- SUBTRACTION TESTS -----

    @Test
    @DisplayName("Subtract: 5.0 - 3.0 = 2.0")
    void testMinusNormalValues() {
        assertEquals(2.0, calc.minus(5.0, 3.0), 0.0001);
    }

    // ----- MULTIPLICATION TESTS -----

    @Test
    @DisplayName("Multiply: 4.0 * 2.5 = 10.0")
    void testMultiplyNormalValues() {
        assertEquals(10.0, calc.multiply(4.0, 2.5), 0.0001);
    }

    // ----- DIVISION TESTS -----

    @Test
    @DisplayName("Divide: 10.0 / 2.0 = 5.0")
    void testDivideNormalValues() {
        assertEquals(5.0, calc.divide(10.0, 2.0), 0.0001);
    }

    @Test
    @DisplayName("Divide by zero throws ArithmeticException")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10.0, 0.0));
    }

    @Test
    @DisplayName("Factorial of 5 should be 120")
    void testFactorialFive() {
      assertEquals(120.0, calc.factorial(5), 0.0001);
    }

    @Test
    @DisplayName("Factorial of 0 should be 1")
    void testFactorialZero() {
      assertEquals(1.0, calc.factorial(0), 0.0001);
    }

    @Test
    @DisplayName("Factorial of -1 should return 0")
    void testFactorialNegative() {
      assertEquals(0.0, calc.factorial(-1), 0.0001);
    }


}
