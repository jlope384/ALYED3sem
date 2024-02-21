import java.util.Scanner;

class Auditor implements IUsuario {
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
            System.out.println("Bienvenido Auditor");
            System.out.println("1. Revisar notas");
            System.out.println("2. Revisar cuotas de estudiantes");
            System.out.println("3. Revisar pagos a docentes");
            System.out.println("4. Salir");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Revisar notas");
                    break;
                case 2:
                    System.out.println("Pagos");
                    break;
                case 3:
                    System.out.println("Historial de pagos");
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }
}