/**
 * Esta clase implementa la interfaz IListStack y representa una implementación simple de una pila utilizando una lista enlazada.
 * Permite insertar, eliminar, obtener el tamaño, verificar si está vacía, hacer push, pop y peek.
 * @param <T> el tipo de dato de los elementos en la pila.
 */
package HDT4;

public class Simple<T> implements IListStack<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
    // Métodos de la interfaz IListStack
    @Override
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    // Método para eliminar el último elemento de la lista
    @Override
    public T delete() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T deletedData = head.data;
        head = head.next;
        size--;
        return deletedData;
    }

    // Método para obtener el último elemento de la lista
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

    // Método para obtener el último elemento de la pila
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return head.data;
    }
}
