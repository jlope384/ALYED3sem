import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws Exception {
        IStack stack = new StackWithVector<>();
        ICalculator calculator = new Calculator();
        String file = "../datos.txt";

        String CharactersString;
        int result = 0;
        CharactersString = readFile(file);

        System.out.println("BIENVENIDO");
        System.out.println("La cadena de texto a operar es: " + CharactersString);

        for (String elemento : calculator.read(CharactersString)) {

            if (elemento.matches("\\d+")) { // La expresión regular "\\d+" verifica si la cadena contiene solo dígitos
                System.out.println(elemento + " es un número");
                stack.push(elemento);

            } else {
                // Si no es un número, asumimos que es un operador
                switch (elemento) {
                    case "+":
                        System.out.println("Encontrado operador de suma");
                        // Realizar acción para el operador de suma
                        break;
                    case "-":
                        System.out.println("Encontrado operador de resta");
                        // Realizar acción para el operador de resta
                        break;
                    case "*":
                        System.out.println("Encontrado operador de multiplicación");
                        // Realizar acción para el operador de multiplicación
                        break;
                    case "/":
                        System.out.println("Encontrado operador de división");
                        // Realizar acción para el operador de división
                        break;
                    case "%":
                        System.out.println("Encontrado operador de módulo");
                        // Realizar acción para el operador de módulo
                        break;
                    default:
                        System.out.println("Operador desconocido: " + elemento);
                        break;
                }
            }
        }

        System.out.println("El resultado es: " + Integer.toString(result));

    }

    private static String readFile(String archivo) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = lector.readLine()) != null) {
                content.append(line);
            }

            lector.close();

            String CharactersString = content.toString();
            return CharactersString;
        } catch (IOException e) {
            return "Error al leer el archivo: " + e.getMessage();
        }
    }

}
