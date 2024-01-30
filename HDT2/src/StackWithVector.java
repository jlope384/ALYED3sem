    import java.util.Vector;

    public class StackWithVector<T> implements IStack<T>{
        private Vector<T> stack;

        //Constuctor para inicializar el vector y mostrar que no hay elementos en la pila
        public StackWithVector() {
            stack = new Vector<T>();
        }

        @Override
        public int size() {
            return stack.size();
        }

        @Override
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        @Override
        public void push(T value) {
            stack.add(value);
        }

        @Override
        public T pop() {
            T tempValue = null;
            if (!isEmpty()) {
                tempValue= stack.remove(stack.size() - 1);
            }
            else{
                throw new IllegalStateException("La pila está vacía");
            }

            return tempValue;
        }

        @Override
        public T peek() {
            T tempValue = null;
            if (!isEmpty()) {
                tempValue= stack.get(stack.size() - 1);
            }
            else{
                throw new IllegalStateException("La pila está vacía");
            }

            return tempValue;
        }
        
    }
