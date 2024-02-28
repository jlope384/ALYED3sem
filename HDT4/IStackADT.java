package HDT4;

/**
 * Esta interfaz representa una pila genérica.
 * Define las operaciones básicas que se pueden realizar en una pila.
 *
 * @param <T> el tipo de elementos que se almacenarán en la pila
 */
public interface IStackADT<T> {
    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param element el elemento a agregar
     */
    void push(T element);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return el elemento en la parte superior de la pila
     * @throws EmptyStackException si la pila está vacía
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return el elemento en la parte superior de la pila
     * @throws EmptyStackException si la pila está vacía
     */
    T peek();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario
     */
    boolean isEmpty();

    /**
     * Devuelve el número de elementos en la pila.
     *
     * @return el número de elementos en la pila
     */
    int size();
}
