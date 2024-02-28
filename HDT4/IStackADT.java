package HDT4;

public interface IStackADT<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
