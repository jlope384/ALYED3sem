/**
 * The IHash interface represents a hash function.
 * It provides a method to create a hash value for a given string.
 */
public interface IHash {
    
    /**
     * Creates a hash value for the given string.
     * 
     * @param valueString the string to be hashed
     * @return the hash value of the string
     */
    public String CreateHash(String valueString);
}
