import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLDataSource implements IDataSource {

    private XmlMapper xmlMapper;

    public XMLDataSource() {
        this.xmlMapper = new XmlMapper();
    }

    @Override
    public File saveStudents(List<IUsuario> students, String path) {
        File file = new File(path + ".xml");
        try {
            xmlMapper.writeValue(file, students);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }


    public List<IUsuario> readStudents(String path) {
        try {
            return xmlMapper.readValue(new File(path), xmlMapper.getTypeFactory().constructCollectionType(List.class, IUsuario.class));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
