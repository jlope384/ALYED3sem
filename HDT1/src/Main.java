<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Encender/Apagar el radio");
=======
/*Universidad del Valle 
@autores: Javier Lopez del Cid - 23415
Daniela Ramirez - 23053
Luis Pedro Lira - 23669
Hoja de Trabajo 1 - Radio
Algoritmos y Estructuras de Datos
Seccion 20
*/

import java.util.Scanner;

/**
 * Clase principal que contiene el método main para interactuar con la radio.
 */

public class Main {

    /**
     * Método principal que interactúa con el usuario para controlar la radio.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */

    public static void main(String[] args) {
        // Crear una instancia de la clase Radio
        Radio radio = new Radio();
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle principal para la interacción con el usuario
        while (true) {
            // Mostrar opciones al usuario
            System.out.println("\n" + "1. Encender/Apagar el radio");
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
            System.out.println("2. Cambiar a AM/FM");
            System.out.println("3. Siguiente frecuencia");
            System.out.println("4. Frecuencia anterior");
            System.out.println("5. Guardar frecuencia actual como favorita");
            System.out.println("6. Obtener frecuencia favorita");
            System.out.println("7. Desconectar el Radio");
<<<<<<< HEAD
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
                    System.out.println(
                            "La frecuencia guardada en el botón " + button + " es " + radio.getFavFrequency(button));
                    break;
                case 7:
                    System.out.println("Power off.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
=======
            System.out.print("Seleccione una opción: \n");

            // Leer la opción del usuario
            int option = scanner.nextInt();

            // Realizar acciones según la opción seleccionada
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
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
            }
        }
    }
}