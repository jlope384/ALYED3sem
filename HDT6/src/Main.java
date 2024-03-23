import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Selección del tipo de mapa
        System.out.println("Seleccione el tipo de mapa:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int mapOption = scanner.nextInt();
        Map<String, Estudiante> map = MapFactory.createMap(mapOption);

        // Selección del tipo de función hash
        System.out.println("Seleccione el tipo de función hash:");
        System.out.println("MD5");
        System.out.println("SHA-1");
        System.out.println("Orgánica");
        scanner.nextLine(); // Limpiar el buffer
        String hashOption = scanner.nextLine();
        IHash hashFunction = HashFactory.CreateHash(hashOption);

        LectorArchivo lectorArchivo = new LectorArchivo();
        Map<String, Estudiante> estudiantes = lectorArchivo.leerEstudiantes("estudiantes.json", hashFunction);

        // Almacenar estudiantes en el mapa utilizando sus nombres como claves
        for (Estudiante estudiante : estudiantes.values()) {
            map.put(estudiante.getEmail(), estudiante);
        }

        // Búsqueda de estudiantes
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Buscar estudiante por email");
            System.out.println("2. Buscar estudiante por nacionalidad");
            System.out.println("3. Salir");
            int searchOption = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (searchOption) {
                case 1:
                    System.out.println("Ingrese el correo electronico del estudiante:");
                    String email = scanner.nextLine();
                    Estudiante estudiante = map.get(email);
                    if (estudiante != null) {
                        System.out.println("Estudiante encontrado: " + estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la nacionalidad:");
                    String nacionalidad = scanner.nextLine();
                    String hashKey = hashFunction.CreateHash(nacionalidad);
                    List<Estudiante> estudiantesNacionalidad = new ArrayList<>();
                    for (Estudiante e : estudiantes.values()) {
                        if (hashFunction.CreateHash(e.getCountry()).equals(hashKey)) {
                            estudiantesNacionalidad.add(e);
                        }
                    }
                    if (!estudiantesNacionalidad.isEmpty()) {
                        System.out.println("Estudiantes con nacionalidad " + nacionalidad + ":");
                        for (Estudiante e : estudiantesNacionalidad) {
                            System.out.println(e);
                        }
                    } else {
                        System.out.println("No se encontraron estudiantes con esa nacionalidad.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
