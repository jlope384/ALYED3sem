package HDT4;

import java.util.Vector;

public class StackVector<T> implements IStackADT<T> {
    private Vector<T> elements;

    public StackVector() {
        this.elements = new Vector<>();
    }

    @Override
    public void push(T item) {
        elements.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elements.get(elements.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }
}