import java.io.File;
import java.util.List;

public interface IDataSource {
    public File saveStudents(List<IUsuario> students, String path);
}
