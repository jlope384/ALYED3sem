public class Proceso implements Comparable<Proceso> {
    private String nombre;
    private String usuario;
    private int nice;

    public Proceso(String nombre, String usuario, int nice) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nice = nice;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getNice() {
        return nice;
    }

    public int calcularPrioridad() {
        return 120 + nice;
    }

    @Override
    public int compareTo(Proceso otro) {
        // Comparar procesos por su prioridad
        return Integer.compare(calcularPrioridad(), otro.calcularPrioridad());
    }

    @Override
    public String toString() {
        return nombre + ", " + usuario + ", " + "PR:" + calcularPrioridad() + ", nice:" + nice;
    }
}