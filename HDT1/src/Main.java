import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n" + "1. Encender/Apagar el radio");
            System.out.println("2. Cambiar a AM/FM");
            System.out.println("3. Siguiente frecuencia");
            System.out.println("4. Frecuencia anterior");
            System.out.println("5. Guardar frecuencia actual como favorita");
            System.out.println("6. Obtener frecuencia favorita");
            System.out.println("7. Desconectar el Radio");
            System.out.print("Seleccione una opción: \n");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    radio.tooglePowerOffOn();
                   if (radio.getState()) 
                        System.out.println("El radio está encendido \n");
                    else 
                        System.out.println("El radio está apagado \n");
                    break;
                case 2:
                    radio.toogleAMFM();
                    if (radio.getStateAMFM()) 
                        System.out.println("El radio está en AM \n");
                    else 
                        System.out.println("El radio está en FM \n");
                    break;
                case 3:
                    radio.nextFrequency();
                    System.out.println("La frecuencia actual es " + radio.getCurrentFrequency() + "\n");
                    break;
                case 4:
                    radio.previousFrequency();
                    System.out.println("La frecuencia actual es " + radio.getCurrentFrequency() + "\n");
                    break;
                case 5:
                    System.out.print("Ingrese el número del botón (0-9) para guardar su frecuencia: " + "\n");
                    int button = scanner.nextInt();
                    radio.setFavFrequency(button);
                    System.out.println("La frecuencia actual ha sido guardada en el botón " + button + "\n");
                    break;
                case 6:
                    System.out.print("Ingrese el número del botón (0-9) para obtener su frecuencia: \n");
                    button = scanner.nextInt();
                    System.out.println("La frecuencia guardada en el botón " + button + " es " + radio.getFavFrequency(button) + "\n");
                    break;
                case 7:
                    System.out.println("Power off. \n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo. \n");
            }
        }
    }
}