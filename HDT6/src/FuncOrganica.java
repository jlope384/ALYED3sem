package HDT6.src;

public class FuncOrganica implements IHash{
    @Override
    public String CreateHash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash += input.charAt(i);
        }
        return Integer.toString(hash);
    }
}
