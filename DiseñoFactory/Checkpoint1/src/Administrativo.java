class Administrativo implements Usuario {
    public void mostrarOpciones() {
        System.out.println("1. Crear Cursos, Docentes y Estudiantes");
        System.out.println("2. Asignar estudiante a curso");
        System.out.println("3. Asignar catedrático a curso");
        System.out.println("4. Asignar pago a catedrático");
        System.out.println("5. Resumen de Notas y Resumen de Pagos de Estudiantes");
    }
}