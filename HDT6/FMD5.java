package HDT6;

public class FMD5 implements IHash{

    public String CreateHash(String valueString) {
        return "MD5: " + valueString;
    }
}