package HDT6.src;

public class Estudiante {
    private String nombre;
    private int Phone; 
    private String email;
    private int postalZip;
    private String country;

    public Estudiante(String nombre, int Phone, String email, int postalZip, String country) {
        this.nombre = nombre;
        this.Phone = Phone;
        this.email = email;
        this.postalZip = postalZip;
        this.country = country;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPostalZip() {
        return postalZip;
    }

    public void setPostalZip(int postalZip) {
        this.postalZip = postalZip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
