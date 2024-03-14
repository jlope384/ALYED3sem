package HDT6.src;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {

    public List<Estudiante> leerEstudiantes(String nombreArchivo) {
        List<Estudiante> estudiantes = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Estudiante
            estudiantes = objectMapper.readValue(new File(nombreArchivo), objectMapper.getTypeFactory().constructCollectionType(List.class, Estudiante.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}  
