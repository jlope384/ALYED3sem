package HDT4;

import java.util.ArrayList;

public class StackArrayList<T> implements IStackADT<T> {
    private ArrayList<T> elements;

    public StackArrayList() {
        this.elements = new ArrayList<>();
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