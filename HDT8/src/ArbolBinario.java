public class ArbolBinario<T extends Comparable<T>> implements PriorityQueue<T> {
    private java.util.Vector<T> data;

    public ArbolBinario() {
        data = new java.util.Vector<>();
    }
    
    @Override
    public boolean add(T value) {
        data.add(value);
        int index = data.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (data.get(index).compareTo(data.get(parentIndex)) >= 0) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
        return true;
    }
    
    @Override
    public T remove() {
        if (data.isEmpty()) return null;
        T result = data.get(0);
        T last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            heapifyDown(0);
        }
        return result;
    }

    private void heapifyDown(int index) {
        while (index < data.size() / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int minChild = leftChild;
            if (rightChild < data.size() && data.get(rightChild).compareTo(data.get(leftChild)) < 0) {
                minChild = rightChild;
            }
            if (data.get(index).compareTo(data.get(minChild)) <= 0) break;
            swap(index, minChild);
            index = minChild;
        }
    }
    
    private void swap(int i, int j) {
        T temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
    
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    } 
    
    @Override
    public int size() {
        return data.size();
    }
}
