import java.util.ArrayList;

public interface ICalculator {
    // Definición de la interfaz ICalculator
    public int add(int n1, int n2); // Suma

    public int subtraction(int n1, int n2); // Resta

    public int multiplication(int n1, int n2); // Multiplicación

    public int division(int n1, int n2); // División

    public int residue(int n1, int n2); // Residuo (módulo)

    public ArrayList<Character> read(String CharactersString);

    public int result(ArrayList<Character> elements);
}
