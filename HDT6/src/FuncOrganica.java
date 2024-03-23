/**
 * This class implements the IHash interface and provides a method to create a hash value for a given input string.
 */
public class FuncOrganica implements IHash {
    /**
     * Creates a hash value for the given input string.
     *
     * @param input the input string for which the hash value needs to be created
     * @return the hash value as a string
     */
    @Override
    public String CreateHash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash += input.charAt(i);
        }
        return Integer.toString(hash);
    }
}
