class AdministrativoFactory implements SistemaUniversitarioFactory {
    public Usuario crearUsuario() {
        return new Administrativo();
    }
}