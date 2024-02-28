package HDT4;

/**
 * This interface represents a stack data structure implemented using a list.
 * It extends the IStackADT interface and provides additional methods for inserting, deleting,
 * retrieving elements, and checking the size and emptiness of the stack.
 *
 * @param <T> the type of elements stored in the stack
 */
public interface IListStack<T> extends IStackADT<T> {
    /**
     * Inserts the specified element at the top of the stack.
     *
     * @param data the element to be inserted
     */
    void insert(T data);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element removed from the top of the stack
     */
    T delete();

    /**
     * Returns the element at the specified index in the stack.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    T get(int index);

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack
     */
    int size();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}
