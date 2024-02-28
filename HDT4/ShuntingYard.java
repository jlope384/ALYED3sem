package HDT4;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * The ShuntingYard class provides methods for converting infix expressions to postfix notation
 * and evaluating postfix expressions using the Shunting Yard algorithm.
 */
public class ShuntingYard {
    private static final Map<Character, Integer> precedence = new HashMap<>();

    static {
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
    }

    /**
     * Converts an infix expression to postfix notation.
     *
     * @param infix the infix expression to convert
     * @return the postfix notation of the infix expression
     */
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // remove '('
            } else {
                while (!operatorStack.isEmpty() && precedence.getOrDefault(operatorStack.peek(), 0) >= precedence.get(c)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    /**
     * Evaluates a postfix expression and returns the result.
     *
     * @param postfix the postfix expression to evaluate
     * @param stack   the stack implementation to use for evaluation
     * @return the result of the postfix expression
     * @throws IllegalArgumentException if the postfix expression is invalid
     */
    public static double evaluatePostfix(String postfix, IStackADT<Double> stack) {

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result;
                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        return stack.pop();
    }
}
