class DocenteFactory implements SistemaUniversitarioFactory {
    public Usuario crearUsuario() {
        return new Docente();
    }
}