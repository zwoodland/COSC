import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        double num1, num2, result;

        // Loop to continue prompting for operations until user exits
        while (true) {
            // Prompt user for operation
            System.out.println("Choose an operation (+, -, *, /, exit): ");
            operation = scanner.nextLine().trim();

            // Exit condition
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;  // Terminate the loop and end the program
            }

            // Validate operation input
            if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                System.out.println("Invalid operation. Please choose +, -, *, /, or exit.");
                continue;  // Re-prompt if the input is invalid
            }

            // Get two numbers from the user
            System.out.print("Enter the first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                System.out.print("Enter the first number: ");
            }
            num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                System.out.print("Enter the second number: ");
            }
            num2 = scanner.nextDouble();
            scanner.nextLine(); // Clear the buffer

            // Perform the chosen operation
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                default:
                    System.out.println("Unexpected error.");
                    break;
            }

            // Ask the user if they want to perform another operation
            System.out.println("Do you want to perform another operation? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
