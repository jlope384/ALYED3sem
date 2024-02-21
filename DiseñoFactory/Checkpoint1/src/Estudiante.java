import java.util.Scanner;

class Estudiante implements IUsuario {
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
            System.out.println("Bienvenido Estudiante");
            System.out.println("1. Ver notas");
            System.out.println("2. Realizar pago");
            System.out.println("3. Consultar pago");
            System.out.println("4. Salir");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Notas");
                    break;
                case 2:
                    System.out.println("Realizar pago");
                    break;
                case 3:
                    System.out.println("Consular pago");
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

