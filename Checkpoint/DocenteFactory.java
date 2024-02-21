//Se implementa al docente
class DocenteFactory implements UsuarioFactory {
    public Estudiante crearEstudiante() {
        return null; // No aplicable para docentes
    }
    public Docente crearDocente() {
        return new Docente();
    }
    public PersonalAdministrativo crearPersonalAdministrativo() {
        return null; // No aplicable para docentes
    }
    public AuditorExterno crearAuditorExterno() {
        return null; // No aplicable para docentes
    }
}