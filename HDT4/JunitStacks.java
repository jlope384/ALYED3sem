package HDT4;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitStacks {

    @Test
    public void testDobleStack() {
        IListStack<Integer> dobleStack = new Doble<>();
        assertTrue(dobleStack.isEmpty());
        assertEquals(0, dobleStack.size());

        // Insertar elementos
        dobleStack.insert(1);
        dobleStack.insert(2);
        dobleStack.insert(3);

        // Verificar tamaño y no vacío
        assertFalse(dobleStack.isEmpty());
        assertEquals(3, dobleStack.size());

        // Obtener elementos en posiciones específicas
        assertEquals(1, (int) dobleStack.get(0));
        assertEquals(2, (int) dobleStack.get(1));
        assertEquals(3, (int) dobleStack.get(2));

        // Eliminar último elemento de la lista
        assertEquals(3, (int) dobleStack.delete());
        assertEquals(2, (int) dobleStack.delete());
        assertEquals(1, (int) dobleStack.delete());

        // Verificar tamaño y vacío
        assertTrue(dobleStack.isEmpty());
        assertEquals(0, dobleStack.size());
    }

    @Test
    public void testStackArrayList() {
        IStackADT<String> stackArrayList = new StackArrayList<>();
        assertTrue(stackArrayList.isEmpty());
        assertEquals(0, stackArrayList.size());

        // Agregar elementos
        stackArrayList.push("A");
        stackArrayList.push("B");
        stackArrayList.push("C");

        // Verificar tamaño y no vacío
        assertFalse(stackArrayList.isEmpty());
        assertEquals(3, stackArrayList.size());

        // Pop y peek
        assertEquals("C", stackArrayList.pop());
        assertEquals("B", stackArrayList.pop());
        assertEquals("A", stackArrayList.peek());

        // Verificar tamaño y no vacío
        assertFalse(stackArrayList.isEmpty());
        assertEquals(1, stackArrayList.size());
    }

    @Test
    public void testStackVector() {
        IStackADT<Double> stackVector = new StackVector<>();
        assertTrue(stackVector.isEmpty());
        assertEquals(0, stackVector.size());

        // Agregar elementos
        stackVector.push(10.5);
        stackVector.push(20.3);
        stackVector.push(30.8);

        // Verificar tamaño y no vacío
        assertFalse(stackVector.isEmpty());
        assertEquals(3, stackVector.size());

        // Pop y peek
        assertEquals(30.8, stackVector.pop(), 0.001);
        assertEquals(20.3, stackVector.pop(), 0.001);
        assertEquals(10.5, stackVector.peek(), 0.001);

        // Verificar tamaño y no vacío
        assertFalse(stackVector.isEmpty());
        assertEquals(1, stackVector.size());
    }
}
