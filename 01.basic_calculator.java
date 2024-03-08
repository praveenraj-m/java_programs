import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        // Read the first number from the user input
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        // Read the second number from the user input
        double num2 = scanner.nextDouble();

        // Display the result of addition
        System.out.println("Addition: " + add(num1, num2));
        // Display the result of subtraction
        System.out.println("Subtraction: " + subtract(num1, num2));
        // Display the result of multiplication
        System.out.println("Multiplication: " + multiply(num1, num2));
        // Display the result of division
        System.out.println("Division: " + divide(num1, num2));
    }

    // Basic Calculator Functions

    // Function to add two numbers
    static double add(double x, double y) {
        return x + y;
    }

    // Function to subtract two numbers
    static double subtract(double x, double y) {
        return x - y;
    }

    // Function to multiply two numbers
    static double multiply(double x, double y) {
        return x * y;
    }

    // Function to divide two numbers
    static double divide(double x, double y) {
        // Check if the divisor is not zero to avoid division by zero
        if (y != 0) {
            return x / y;
        } else {
            // Display an error message if division by zero is attempted
            System.out.println("Cannot divide by zero");
            // Return a special value for an undefined result
            return Double.NaN; // Not a Number
        }
    }
}
