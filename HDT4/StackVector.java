package HDT4;

import java.util.Vector;

/**
 * Esta clase representa una implementación de una pila utilizando un Vector.
 * Implementa la interfaz IStackADT<T>.
 *
 * @param <T> el tipo de elementos que se almacenarán en la pila.
 */
public class StackVector<T> implements IStackADT<T> {
    private Vector<T> elements;

    /**
     * Crea una nueva instancia de StackVector.
     * Inicializa el vector de elementos.
     */
    public StackVector() {
        this.elements = new Vector<>();
    }

    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param item el elemento a agregar.
     */
    @Override
    public void push(T item) {
        elements.add(item);
    }

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     * Si la pila está vacía, lanza una excepción IllegalStateException.
     *
     * @return el elemento en la parte superior de la pila.
     * @throws IllegalStateException si la pila está vacía.
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements.remove(elements.size() - 1);
    }

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     * Si la pila está vacía, lanza una excepción IllegalStateException.
     *
     * @return el elemento en la parte superior de la pila.
     * @throws IllegalStateException si la pila está vacía.
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements.get(elements.size() - 1);
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Devuelve el número de elementos en la pila.
     *
     * @return el número de elementos en la pila.
     */
    @Override
    public int size() {
        return elements.size();
    }
}