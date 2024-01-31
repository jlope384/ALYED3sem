import java.util.ArrayList;

public class Calculator implements ICalculator {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int division(int n1, int n2) throws Exception {
        return n1 / n2;
    }

    @Override
    public int residue(int n1, int n2) throws Exception {
        return n1 % n2;
    }

    @Override
    public ArrayList<String> read(String CharactersString) throws Exception {
        ArrayList<String> operatorAndOperand = new ArrayList<String>();
        String[] partes = CharactersString.split(" ");

        for (String parte : partes) {
            operatorAndOperand.add(parte);
        }

        return operatorAndOperand;
    }

    @Override
    public int result(ArrayList<String> elements) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'result'");
    }

}
