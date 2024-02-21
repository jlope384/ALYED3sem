import java.util.Scanner;

class Administrativo implements IUsuario {
    private String firstName;
    private String lastName;
    private int id;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Bienvenido Administrativo");
            System.out.println("1. Crear Cursos");
            System.out.println("2. Asignar estudiante a curso");
            System.out.println("3. Asignar catedratico a curso");
            System.out.println("4. Asignar pago a catedrático");
            System.out.println("5. Resumen de Notas y Resumen de Pagos de Estudiantes.");
            System.out.println("6. Salir");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Crear cursos");
                    break;
                case 2:
                    System.out.println("Asignar estudiante a curso");
                    break;
                case 3:
                    System.out.println("Asignar catedratico a curso");
                    break;
                case 4:
                    System.out.println("Asignar pago a catedrático");
                    break;
                case 5:
                    System.out.println("Resumen de Notas y Resumen de Pagos de Estudiantes.");
                    break;
                
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }
}