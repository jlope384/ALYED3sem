package HDT6;

public class HashFactory {
    public static IHash CreateHash(String valueString) {
        switch (valueString.toLowerCase()) {
            case "organica":
                break;    
            //return new OrganicaHash();
            case "md5":
                return new FMD5();
            case "sha-1":
                break;
            default:
                throw new IllegalArgumentException("Tipo de función hash no válido: " + type);
        }
    }
}
