import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


// Clase principal que maneja el sistema de login y las opciones de menú
public class SistemaUniversitario {
    private static Map<String, UsuarioFactory> usuarios = new HashMap<>();

    static {
        usuarios.put("estudiante", new EstudianteFactory());
        usuarios.put("docente", new DocenteFactory());
        usuarios.put("personal_administrativo", new PersonalAdministrativoFactory());
        usuarios.put("auditor_externo", new AuditorExternoFactory());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulación de inicio de sesión
        System.out.println("Ingrese su tipo de usuario (estudiante, docente, personal_administrativo, auditor_externo): ");
        String tipoUsuario = scanner.nextLine();

        // Validar tipo de usuario
        UsuarioFactory factory = usuarios.get(tipoUsuario);
        if (factory == null) {
            System.out.println("Tipo de usuario no válido");
            return;
        }

        // Crear instancia de usuario según el tipo
        switch (tipoUsuario) {
            case "estudiante":
                OpcionesEstudiante opcionesEstudiante = new OpcionesEstudiante();
                mostrarMenuEstudiante(opcionesEstudiante, scanner);
                break;
            case "docente":
                OpcionesDocente opcionesDocente = new OpcionesDocente();
                mostrarMenuDocente(opcionesDocente, scanner);
                break;
            case "personal_administrativo":
                OpcionesPersonalAdministrativo opcionesPersonalAdministrativo = new OpcionesPersonalAdministrativo();
                mostrarMenuPersonalAdministrativo(opcionesPersonalAdministrativo, scanner);
                break;
            case "auditor_externo":
                OpcionesAuditorExterno opcionesAuditorExterno = new OpcionesAuditorExterno();
                mostrarMenuAuditorExterno(opcionesAuditorExterno, scanner);
                break;
        }
    }

   // Métodos para mostrar menús según el tipo de usuario
   private static void mostrarMenuEstudiante(OpcionesEstudiante opcionesEstudiante, Scanner scanner) {
    System.out.println("Bienvenido estudiante");
    System.out.println("Seleccione una opción:");
    System.out.println("1. Consultar nota");
    System.out.println("2. Realizar pago");
    System.out.println("3. Consultar pagos");
    int opcion = scanner.nextInt();
    switch (opcion) {
        case 1:
            opcionesEstudiante.consultarNota();
            break;
        case 2:
            opcionesEstudiante.realizarPago();
            break;
        case 3:
            opcionesEstudiante.consultarPagos();
            break;
        default:
            System.out.println("Opción no válida");
    }
}

private static void mostrarMenuDocente(OpcionesDocente opcionesDocente, Scanner scanner) {
    System.out.println("Bienvenido docente");
    System.out.println("Seleccione una opción:");
    System.out.println("1. Ingresar notas");
    System.out.println("2. Cobrar pago");
    System.out.println("3. Historial de pagos");
    int opcion = scanner.nextInt();
    switch (opcion) {
        case 1:
            opcionesDocente.ingresarNotas();
            break;
        case 2:
            opcionesDocente.cobrarPago();
            break;
        case 3:
            opcionesDocente.historialPagos();
            break;
        default:
            System.out.println("Opción no válida");
    }
}

private static void mostrarMenuPersonalAdministrativo(OpcionesPersonalAdministrativo opcionesPersonalAdministrativo, Scanner scanner) {
    System.out.println("Bienvenido personal administrativo");
    System.out.println("Seleccione una opción:");
    System.out.println("1. Crear cursos");
    System.out.println("2. Asignar estudiante a curso");
    System.out.println("3. Asignar catedrático a curso");
    System.out.println("4. Asignar pago a catedrático");
    System.out.println("5. Resumen de Notas");
    System.out.println("6. Resumen de Pagos de Estudiantes");
    int opcion = scanner.nextInt();
    switch (opcion) {
        case 1:
            opcionesPersonalAdministrativo.crearCursos();
            break;
        case 2:
            opcionesPersonalAdministrativo.asignarEstudianteACurso();
            break;
        case 3:
            opcionesPersonalAdministrativo.asignarCatedraticoACurso();
            break;
        case 4:
            opcionesPersonalAdministrativo.asignarPagoACatedratico();
            break;
        case 5:
            opcionesPersonalAdministrativo.resumenNotas();
            break;
        case 6:
            opcionesPersonalAdministrativo.resumenPagosEstudiantes();
            break;
        default:
            System.out.println("Opción no válida");
    }
}

private static void mostrarMenuAuditorExterno(OpcionesAuditorExterno opcionesAuditorExterno, Scanner scanner) {
    System.out.println("Bienvenido Auditor Externo");
    System.out.println("Seleccione una opción:");
    System.out.println("1. Revisar notas");
    System.out.println("2. Revisar cuotas pagadas por estudiantes");
    System.out.println("3. Revisar pagos a docentes");
    int opcion = scanner.nextInt();
    switch (opcion) {
        case 1:
            opcionesAuditorExterno.revisarNotas();
            break;
        case 2:
            opcionesAuditorExterno.revisarCuotasPagadas();
            break;
        case 3:
            opcionesAuditorExterno.revisarPagosDocentes();
            break;
        default:
            System.out.println("Opción no válida");
    }
}
}
