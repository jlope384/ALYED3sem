/**
 * Represents a process in a system.
 */
public class Proceso implements Comparable<Proceso> {
    private String nombre;
    private String usuario;
    private int nice;

    /**
     * Constructs a new Proceso object with the given nombre, usuario, and nice values.
     * 
     * @param nombre  the name of the process
     * @param usuario the user of the process
     * @param nice    the nice value of the process
     */
    public Proceso(String nombre, String usuario, int nice) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nice = nice;
    }

    /**
     * Returns the name of the process.
     * 
     * @return the name of the process
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Returns the user of the process.
     * 
     * @return the user of the process
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Returns the nice value of the process.
     * 
     * @return the nice value of the process
     */
    public int getNice() {
        return nice;
    }

    /**
     * Calculates and returns the priority of the process.
     * 
     * @return the priority of the process
     */
    public int calcularPrioridad() {
        return 120 + nice;
    }

    /**
     * Compares this process with another process based on their priorities.
     * 
     * @param otro the process to compare with
     * @return a negative integer, zero, or a positive integer if this process has a lower, equal, or higher priority than the other process
     */
    @Override
    public int compareTo(Proceso otro) {
        // Comparar procesos por su prioridad
        return Integer.compare(calcularPrioridad(), otro.calcularPrioridad());
    }

    /**
     * Returns a string representation of the process.
     * 
     * @return a string representation of the process
     */
    @Override
    public String toString() {
        return nombre + ", " + usuario + ", " + "PR:" + calcularPrioridad() + ", nice:" + nice;
    }
}