import java.io.*;
import java.util.List;

public class CSVDataSource implements IDataSource {
    
    @Override
    public File saveStudents(List<IUsuario> students, String path) {
        try {
            File file = new File(path+".csv");
            FileWriter writer = new FileWriter(file);

            // Escribir encabezados al archivo CSV
            writer.write("ID,First Name,Last Name\n");

            // Escribir cada estudiante al archivo CSV
            for (IUsuario student : students) {
                writer.write(String.format("%d,%s,%s\n", student.getId(), student.getFirstName(), student.getLastName()));
            }

            writer.close();
            return file;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
