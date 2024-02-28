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

    @Override
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

     // Métodos de la interfaz Stack
     @Override
    public void push(T item) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public T pop() {
        throw new UnsupportedOperationException("Unimplemented");
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}


