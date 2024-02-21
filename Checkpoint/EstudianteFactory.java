class EstudianteFactory implements UsuarioFactory {
    public Estudiante crearEstudiante() {
        return new Estudiante();
    }
    public Docente crearDocente() {
        return null; // No aplicable para estudiantes
    }
    public PersonalAdministrativo crearPersonalAdministrativo() {
        return null; // No aplicable para estudiantes
    }
    public AuditorExterno crearAuditorExterno() {
        return null; // No aplicable para estudiantes
    }
}