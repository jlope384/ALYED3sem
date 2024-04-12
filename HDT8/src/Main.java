import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArbolBinario<Proceso> colaPrioridad = new ArbolBinario<>();

        // Intentar leer el archivo y agregar procesos a la cola de prioridad
        try (BufferedReader br = new BufferedReader(new FileReader("src/procesos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String usuario = partes[1];
                    int nice = Integer.parseInt(partes[2]);
                    Proceso proceso = new Proceso(nombre, usuario, nice);
                    colaPrioridad.add(proceso);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar procesos retirados en orden de prioridad
        while (!colaPrioridad.isEmpty()) {
            Proceso proceso = colaPrioridad.remove();
            System.out.println(proceso);
        }
    }
}