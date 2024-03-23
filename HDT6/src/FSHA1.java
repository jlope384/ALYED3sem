import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * This class implements the IHash interface and provides a method to create a SHA-1 hash of a given input string.
 */
public class FSHA1 implements IHash {
    /**
     * Creates a SHA-1 hash of the input string.
     *
     * @param input the input string to be hashed
     * @return the SHA-1 hash of the input string
     */
    @Override
    public String CreateHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder result = new StringBuilder();
            for (byte b : hashBytes) {
                result.append(String.format("%02x", b));
            }
            return result.toString();   
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
