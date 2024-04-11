public interface PriorityQueue<T> {
    boolean add(T element);
    T remove();
    boolean isEmpty();
    int size();
}