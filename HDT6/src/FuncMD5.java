import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * This class implements the IHash interface and provides a method to create an MD5 hash from a given input string.
 */
public class FuncMD5 implements IHash {
    /**
     * Creates an MD5 hash from the given input string.
     *
     * @param input the input string to create the hash from
     * @return the MD5 hash as a string
     */
    @Override
    public String CreateHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
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