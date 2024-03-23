/**
 * The HashFactory class is responsible for creating instances of different hash functions based on the provided value string.
 */
public class HashFactory {
    /**
     * Creates an instance of a hash function based on the provided value string.
     *
     * @param valueString the value string representing the type of hash function to create
     * @return an instance of the specified hash function
     * @throws IllegalArgumentException if the provided value string is not a valid hash function type
     */
    public static IHash CreateHash(String valueString) {
        switch (valueString.toLowerCase()) {
            case "organica":
                return new FuncOrganica();
            case "md5":
                return new FuncMD5();
            case "sha-1":
                return new FSHA1();
            default:
                throw new IllegalArgumentException("Tipo de función hash no válido: " + valueString);
        }
    }
}
