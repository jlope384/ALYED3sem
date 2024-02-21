class AuditorExternoFactory implements SistemaUniversitarioFactory {
    public Usuario crearUsuario() {
        return new AuditorExterno();
    }
}