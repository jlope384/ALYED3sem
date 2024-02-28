package HDT4;

import java.util.ArrayList;

/**
 * This abstract class represents a stack data structure.
 * It provides common methods and functionality for stack implementations.
 *
 * @param <T> the type of elements in the stack
 */
public abstract class AbstractStack<T> implements IStackADT<T> {
    protected ArrayList<T> elementos;

    /**
     * Constructs an empty stack.
     */
    public AbstractStack() {
        this.elementos = new ArrayList<>();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack
     */
    @Override
    public int size() {
        return this.elementos.size();
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to be added
     */
    @Override
    public void push(T element) {
        this.elementos.add(element);
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     */
    @Override
    public T pop() {
        return this.elementos.remove(this.elementos.size() - 1);
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     */
    @Override
    public T peek() {
        return this.elementos.get(this.elementos.size() - 1);
    }

    /**
     * Returns a string representation of the stack.
     *
     * @return a string representation of the stack
     */
    @Override
    public String toString() {
        return "AbstractStack{" + "elementos=" + elementos + '}';
    }
}
