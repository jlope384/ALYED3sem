/**
 * Esta interfaz representa una pila genérica.
 * Una pila es una estructura de datos que sigue el principio LIFO (Last In, First Out),
 * lo que significa que el último elemento agregado es el primero en ser eliminado.
 * 
 * @param <T> el tipo de elementos que se almacenarán en la pila
 */
public interface IStack<T>{

    /**
     * Devuelve la cantidad de elementos en la pila.
     * 
     * @return la cantidad de elementos en la pila
     */
    int size();

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false de lo contrario
     */
    boolean isEmpty();

    /**
     * Agrega un elemento a la parte superior de la pila.
     * 
     * @param value el elemento a agregar
     */
    void push(T value);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     * 
     * @return el elemento en la parte superior de la pila
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     * 
     * @return el elemento en la parte superior de la pila
     */
    T peek();

}