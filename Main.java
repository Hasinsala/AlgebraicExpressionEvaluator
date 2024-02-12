import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user for an expression
            System.out.print("Enter an algebraic expression (or 'X' to exit): ");
            String userInput = scanner.nextLine();

            // Check if the user wants to exit
            if (userInput.equalsIgnoreCase("X")) {
                break;
            }

            // Create an ExpressionResult object for the given expression
            ExpressionResult expressionResult = new ExpressionResult(userInput);

            // Print the result using toString method
            System.out.println(expressionResult.toString());
        }

        // Close the scanner
        scanner.close();
    }
}
