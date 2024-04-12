/**
 * The PriorityQueue interface represents a collection of elements that can be
 * added and removed based on their priority. The elements are ordered in such
 * a way that the highest priority element is always at the front of the queue.
 *
 * @param <T> the type of elements in the priority queue
 */
public interface PriorityQueue<T> {
    /**
     * Adds the specified element to the priority queue.
     *
     * @param element the element to be added
     * @return true if the element was successfully added, false otherwise
     */
    boolean add(T element);

    /**
     * Removes and returns the highest priority element from the priority queue.
     *
     * @return the highest priority element, or null if the queue is empty
     */
    T remove();

    /**
     * Checks if the priority queue is empty.
     *
     * @return true if the priority queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the priority queue.
     *
     * @return the number of elements in the priority queue
     */
    int size();
}