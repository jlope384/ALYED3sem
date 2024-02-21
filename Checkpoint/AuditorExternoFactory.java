//Se implementa al Auditor Externo
class AuditorExternoFactory implements UsuarioFactory {
    public Estudiante crearEstudiante() {
        return null; // No aplicable para auditores externos
    }
    public Docente crearDocente() {
        return null; // No aplicable para auditores externos
    }
    public PersonalAdministrativo crearPersonalAdministrativo() {
        return null; // No aplicable para auditores externos
    }
    public AuditorExterno crearAuditorExterno() {
        return new AuditorExterno();
    }
}