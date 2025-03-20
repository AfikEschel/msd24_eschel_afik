package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Afik Eschel");
        
        // Create an instance of CalculatorImpl
        ICalculator calculator = new CalculatorImpl();

        // Perform basic operations
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.minus(10, 4));
        System.out.println("Multiplication: " + calculator.multiply(7, 6));
        
        try {
            System.out.println("Division: " + calculator.divide(20, 4));
            System.out.println("Division by zero: " + calculator.divide(10, 0)); // Will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
