/**
 * The Estudiante class represents a student with their personal information.
 */
public class Estudiante {
    private String nombre;
    private int phone; 
    private String email;
    private int postalZip;
    private String country;

    /**
     * Constructs a new Estudiante object with the specified personal information.
     * 
     * @param nombre the name of the student
     * @param phone the phone number of the student
     * @param email the email address of the student
     * @param postalZip the postal zip code of the student
     * @param country the country of the student
     */
    public Estudiante(String nombre, int phone, String email, int postalZip, String country) {
        this.nombre = nombre;
        this.phone = phone;
        this.email = email;
        this.postalZip = postalZip;
        this.country = country;
    }

    /**
     * Returns the name of the student.
     * 
     * @return the name of the student
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the name of the student.
     * 
     * @param nombre the name of the student
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Returns the phone number of the student.
     * 
     * @return the phone number of the student
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the student.
     * 
     * @param phone the phone number of the student
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Returns the email address of the student.
     * 
     * @return the email address of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the student.
     * 
     * @param email the email address of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the postal zip code of the student.
     * 
     * @return the postal zip code of the student
     */
    public int getPostalZip() {
        return postalZip;
    }

    /**
     * Sets the postal zip code of the student.
     * 
     * @param postalZip the postal zip code of the student
     */
    public void setPostalZip(int postalZip) {
        this.postalZip = postalZip;
    }

    /**
     * Returns the country of the student.
     * 
     * @return the country of the student
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the student.
     * 
     * @param country the country of the student
     */
    public void setCountry(String country) {
        this.country = country;
    }
}