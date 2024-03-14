import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorJSON {

    public List<Estudiante> leerEstudiantes(String nombreArchivo) {
        List<Estudiante> estudiantes = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Estudiante
            Estudiante[] estudiantesArray = objectMapper.readValue(new File(nombreArchivo), Estudiante[].class);
            for (Estudiante estudiante : estudiantesArray) {
                estudiantes.add(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }
}