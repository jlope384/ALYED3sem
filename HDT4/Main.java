package HDT4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de pila (arraylist, vector o list): ");
        String stackType = scanner.nextLine();

        IStackADT<Double> stack;
        if (stackType.equalsIgnoreCase("list")) {
            System.out.println("Seleccione el tipo de lista (simples o dobles): ");
            String listType = scanner.nextLine();
            stack = StackFactory.createStack(stackType, listType);
        } else {
            stack = StackFactory.createStack(stackType);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                double result = evaluateExpression(line.trim(), stack);
                System.out.println("Expresión: " + line.trim());
                System.out.println("Resultado: " + result);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static double evaluateExpression(String expression, IStackADT<Double> stack) {
        String postfixExpression = ShuntingYard.infixToPostfix(expression);
        return ShuntingYard.evaluatePostfix(postfixExpression, stack);
    }
}