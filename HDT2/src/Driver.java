/**
 * @see Reader
 * @see FileReader
 * @see InputStreamReader
 * @since 1.1
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws Exception {
        IStack<String> stack = new StackWithVector<>();
        ICalculator calculator =  new Calculator();
        //SI NO FUNCIONA, INTENTAR CON PATH : "../datos.txt" o a "HDT2\\datos.txt"
        String file = "../datos.txt";

        String CharactersString;
        int result=0;
        CharactersString = readFile(file);

        System.out.println("BIENVENIDO");
        System.out.println("La cadena de texto a operar es: " + CharactersString);

        


        for (String elemento : calculator.read(CharactersString)) {

            if (elemento.matches("\\d+")) { // La expresión regular "\\d+" verifica si la cadena contiene solo dígitos (codigo generado con ayuda de inteligencia artificial)
                stack.push(elemento);

            } else {
                // Si no es un número, asumimos que es un operador
                switch (elemento) {
                    case "+":
                        int n1 = Integer.parseInt(stack.peek());
                        stack.pop();                        
                        int n2 = Integer.parseInt(stack.peek());
                        stack.pop();

                        result = calculator.add(n1, n2);

                        stack.push(Integer.toString(result));

                        break;
                    case "-":
                        n1 = Integer.parseInt(stack.peek());
                        stack.pop();
                        n2 = Integer.parseInt(stack.peek());
                        stack.pop();

                        result = calculator.substraction(n1, n2);

                        stack.push(Integer.toString(result));

                        break;
                    case "*":
                        n1 = Integer.parseInt(stack.peek());
                        stack.pop();
                        n2 = Integer.parseInt(stack.peek());
                        stack.pop();

                        result = calculator.multiplication(n1, n2);

                        stack.push(Integer.toString(result));

                        break;
                    case "/":
                        n1 = Integer.parseInt(stack.peek());
                        stack.pop();
                        n2 = Integer.parseInt(stack.peek());
                        stack.pop();

                        result = calculator.division(n1, n2);

                        stack.push(Integer.toString(result));
                        break;
                    case "%":
                        n1 = Integer.parseInt(stack.peek());
                        stack.pop();
                        n2 = Integer.parseInt(stack.peek());
                        stack.pop();

                        result = calculator.residue(n1, n2);

                        stack.push(Integer.toString(result));
                        break;
                    default:
                        System.out.println("Operador desconocido: " + elemento);
                        break;
                }
            }
        }        

        
        System.out.println("El resultado es: "+ stack.peek());        
    }

    private static String readFile(String archivo){
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
            return "Error al leer el archivo: "+e.getMessage();
        }
    }
}