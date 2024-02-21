import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaUniversidad {
    public static void main(String[] args) {
        // Crear instancias de usuarios (puedes cargarlos desde un archivo CSV o base de datos)
        List<IUsuario> usuarios = new ArrayList<>();
        IUsuario estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.setFirstName("Juan");
        estudiante.setLastName("Pérez");
        usuarios.add(estudiante);
        IUsuario docente = new Docente();
        docente.setId(2);
        docente.setFirstName("María");
        docente.setLastName("González");
        usuarios.add(docente);
        IUsuario administrativo = new Administrativo();
        administrativo.setId(3);
        administrativo.setFirstName("Carlos");
        administrativo.setLastName("López");
        usuarios.add(administrativo);
        IUsuario auditor = new Auditor();
        auditor.setId(4);
        auditor.setFirstName("Ana");
        auditor.setLastName("Martínez");
        usuarios.add(auditor);
        // Mostrar opciones para cada usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su ID de usuario");
        int id = scanner.nextInt();
        IUsuario usuario = usuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
        if (usuario != null) {
            usuario.showOptions();
        } else {
            System.out.println("Usuario no encontrado");
        }
        scanner.close();
    }
}
