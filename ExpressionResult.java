import java.util.regex.Pattern;

public class ExpressionResult {
    private String expression;
    private double result;

    // Default constructor
    public ExpressionResult() {
        this("0");
    }

    // Parameterized constructor
    public ExpressionResult(String expression) {
        this.expression = expression;
        this.result = evaluate(expression);
    }

    // Static method to evaluate the expression
    public static double evaluate(String expression) {
        String[] elements = expression.split("(?=[-+*/^])|(?<=[-+*/^])");
        double result = Integer.parseInt(elements[0]);

        for (int i = 1; i < elements.length; i += 2) {
            String operator = elements[i];
            int operand = Integer.parseInt(elements[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                case "^":
                    result = (int) Math.pow(result, operand);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }

    // toString method to format the output
    public String toString() {
        return expression + " = " + result;
    }
}
