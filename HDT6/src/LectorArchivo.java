import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.io.IOException;


public class LectorArchivo {
    public Map<String, Estudiante> leerEstudiantes(String nombreArchivo, IHash hashFactory) {
        Map<String, Estudiante> estudiantes = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(new File("C:\\Users\\jlope\\OneDrive\\Documentos\\UVG\\3erSemestre\\Algoritmos y estructura\\ALYED3sem\\HDT6\\src\\estudiantes.json"));
            for (JsonNode estudianteNode : rootNode) {
                String nombre = estudianteNode.get("name").asText();
                int phone = estudianteNode.get("phone").asInt();
                String email = estudianteNode.get("email").asText();
                int postalZip = estudianteNode.get("postalZip").asInt();
                String country = estudianteNode.get("country").asText();

                // Utilizar el nombre como clave para la búsqueda individual de estudiantes
                String key = hashFactory.CreateHash(email);

                if (!estudiantes.containsKey(key)) {
                    estudiantes.put(key, new Estudiante(nombre, phone, email, postalZip, country));
                } else {
                    System.out.println(" " + email + " ya existe en el archivo");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}
