/**
 * Esta clase representa una implementación de una lista doblemente enlazada que también
 * cumple con la interfaz de una pila. Permite insertar elementos al final de la lista,
 * eliminar el último elemento, obtener un elemento en una posición específica, obtener
 * el tamaño de la lista, verificar si está vacía, agregar elementos a la pila, eliminar
 * el último elemento de la pila y obtener el último elemento de la pila sin eliminarlo.
 *
 * @param <T> el tipo de elementos que se almacenarán en la lista
 */
package HDT4;

public class Doble<T> implements IListStack<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Clase interna que representa un nodo en una lista doblemente enlazada.
     *
     * @param <T> el tipo de dato almacenado en el nodo.
     */
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        /**
         * Crea un nuevo nodo con el dato especificado.
         *
         * @param data el dato a almacenar en el nodo.
         */
        Node(T data) {
            this.data = data;
        }
    }

    // Métodos de la interfaz IListStack
    @Override
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    // Método para eliminar el último elemento de la lista
    @Override
    public T delete() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T deletedData = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return deletedData;
    }
    // Método para obtener un elemento en una posición específica
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    // Método para obtener el tamaño de la lista
    @Override
    public int size() {
        return size;
    }
    // Método para verificar si la lista está vacía
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // Métodos de la interfaz Stack
    @Override
    public void push(T item) {
        insert(item);
    }
    // Método para eliminar el último elemento de la pila
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return delete();
    }
    // Método para obtener el último elemento de la pila sin eliminarlo
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tail.data;
    }
}

