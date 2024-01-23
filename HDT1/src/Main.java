import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Encender/Apagar el radio");
            System.out.println("2. Cambiar a AM/FM");
            System.out.println("3. Siguiente frecuencia");
            System.out.println("4. Frecuencia anterior");
            System.out.println("5. Guardar frecuencia actual como favorita");
            System.out.println("6. Obtener frecuencia favorita");
            System.out.println("7. Desconectar el Radio");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    radio.tooglePowerOffOn();
                   if (radio.getState()) 
                        System.out.println("El radio está encendido");
                    else 
                        System.out.println("El radio está apagado");
                    break;
                case 2:
                    radio.toogleAMFM();
                    if (radio.getStateAMFM()) 
                        System.out.println("El radio está en AM");
                    else 
                        System.out.println("El radio está en FM");
                    break;
                case 3:
                    radio.nextFrequency();
                    System.out.println("La frecuencia actual es " + radio.getCurrentFrequency());
                    break;
                case 4:
                    radio.previousFrequency();
                    System.out.println("La frecuencia actual es " + radio.getCurrentFrequency());
                    break;
                case 5:
                    System.out.print("Ingrese el número del botón (0-9) para guardar su frecuencia: ");
                    int button = scanner.nextInt();
                    radio.setFavFrequency(button);
                    System.out.println("La frecuencia actual ha sido guardada en el botón " + button);
                    break;
                case 6:
                    System.out.print("Ingrese el número del botón (0-9) para obtener su frecuencia: ");
                    button = scanner.nextInt();
                    System.out.println("La frecuencia guardada en el botón " + button + " es " + radio.getFavFrequency(button));
                    break;
                case 7:
                    System.out.println("Power off.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}