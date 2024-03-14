package HDT6.src;

public class HashFactory {
    public static IHash CreateHash(String valueString) {
        switch (valueString.toLowerCase()) {
            case "organica":    
                return new FuncOrganica();
            case "md5":
                return new FuncMD5();
            //case "sha-1":
                //break; // Add return statement for "sha-1" case
            default:
                throw new IllegalArgumentException("Tipo de función hash no válido: " + valueString);
        }
    }
}
