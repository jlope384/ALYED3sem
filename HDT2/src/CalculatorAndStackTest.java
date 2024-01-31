import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class CalculatorAndStackTest {
    @Test
    public void testStackOperations() {
        // Crear una pila y realizar operaciones básicas
        IStack<Integer> stack = new StackWithVector<>();
        
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());

        // Agregar elementos a la pila
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());

        // Verificar el método peek
        assertEquals(Integer.valueOf(3), stack.peek());

        // Verificar el método pop
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(2, stack.size());

        // Verificar el estado final de la pila
        assertFalse(stack.isEmpty());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testCalculatorOperations() throws Exception {
        // Crear una calculadora
        ICalculator calculator = new Calculator();

        // Realizar operaciones básicas
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-1, calculator.substraction(1, 2));
        assertEquals(6, calculator.multiplication(2, 3));
        assertEquals(2, calculator.division(6, 3));
        assertEquals(1, calculator.residue(5, 2));

        // Verificar la conversión de cadena a lista de elementos
        ArrayList<String> elements = calculator.read("1 + 2 * 3");
        assertEquals(5, elements.size());
        assertEquals("1", elements.get(0));
        assertEquals("+", elements.get(1));
        assertEquals("2", elements.get(2));
        assertEquals("*", elements.get(3));
        assertEquals("3", elements.get(4));

        // Resolver la lista de elementos
        assertEquals(7, calculator.solve(elements));
    }
}
