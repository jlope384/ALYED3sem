class Estudiante {}
class Docente {}
class PersonalAdministrativo {}
class AuditorExterno {}

interface UsuarioFactory {
    Estudiante crearEstudiante();
    Docente crearDocente();
    PersonalAdministrativo crearPersonalAdministrativo();
    AuditorExterno crearAuditorExterno();
}