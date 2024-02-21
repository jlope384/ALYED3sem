//Lector y escritor de archivos JSON para usuarios realizado con ChatGPT, en clase se indico que se podia realizar con ayuda de IA.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDataSource implements IDataSource {

    private ObjectMapper objectMapper;

    public JSONDataSource() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public File saveStudents(List<IUsuario> students, String path) {
        File file = new File(path + ".json");

        try {
            objectMapper.writeValue(file, students);
        } catch (JsonGenerationException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }        
    
    public List<IUsuario> readStudents(String path) {
        try {
            return objectMapper.readValue(new File(path), objectMapper.getTypeFactory().constructCollectionType(List.class, IUsuario.class));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
