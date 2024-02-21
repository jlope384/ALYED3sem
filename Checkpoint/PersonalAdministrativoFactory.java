class PersonalAdministrativoFactory implements UsuarioFactory {
    public Estudiante crearEstudiante() {
        return new Estudiante();
    }
    public Docente crearDocente() {
        return new Docente();
    }
    public PersonalAdministrativo crearPersonalAdministrativo() {
        return new PersonalAdministrativo();
    }
    public AuditorExterno crearAuditorExterno() {
        return null; // No aplicable para personal administrativo
    }
}

