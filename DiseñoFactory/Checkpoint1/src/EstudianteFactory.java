class EstudianteFactory implements SistemaUniversitarioFactory {
    public Usuario crearUsuario() {
        return new Estudiante();
    }
}