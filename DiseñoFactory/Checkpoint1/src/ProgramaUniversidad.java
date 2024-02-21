import java.util.Scanner;

public class ProgramaUniversidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de usuario (Estudiante/Docente/Administrativo/AuditorExterno): ");
        String tipoUsuario = scanner.nextLine().toLowerCase();

        SistemaUniversitarioFactory factory;

        scanner.close();

        // Crear la fábrica según el tipo de usuario
        switch (tipoUsuario) {
            case "estudiante":
                factory = new EstudianteFactory();
                break;
            case "docente":
                factory = new DocenteFactory();
                break;
            case "administrativo":
                factory = new AdministrativoFactory();
                break;
            case "auditorexterno":
                factory = new AuditorExternoFactory();
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
                return;
        }

        // Crear el usuario utilizando la fábrica correspondiente
        Usuario usuario = factory.crearUsuario();

        // Mostrar opciones al usuario
        usuario.mostrarOpciones();
    }
}