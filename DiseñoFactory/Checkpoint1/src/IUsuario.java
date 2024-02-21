public interface IUsuario {

    String getFirstName() ;
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);
    int getId();
    void setId(int id);

    void showOptions();
}