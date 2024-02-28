package HDT4;

public interface IListStack<T> extends IStackADT<T> {
    void insert(T data);
    T delete();
    T get(int index);
    int size();
    boolean isEmpty();
}
