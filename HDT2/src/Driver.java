import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws Exception {
        String file = "../datos.txt";

        String CharactersString;
        int result=0;
        CharactersString = readFile(file);

        System.out.println("BIENVENIDO");
        System.out.println("La cadena de texto a operar es: " + CharactersString);

        

        System.out.println("El resultado es: "+ Integer.toString(result));











        
        
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
