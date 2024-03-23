public class HashFactory {
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
