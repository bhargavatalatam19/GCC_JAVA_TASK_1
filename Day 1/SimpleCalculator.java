import java.util.Scanner;

public class SimpleCalculator {
    // Method to perform basic arithmetic operations
    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b; 
            case '-': return a - b; 
            case '*': return a * b;
            case '/': return a / b; 
            default: throw new IllegalArgumentException("Invalid operator"); // Invalid operator
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Taking user input for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

// Taking user input for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
// Taking user input for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
// printing the result
        try {
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
