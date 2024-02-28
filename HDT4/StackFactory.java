package HDT4;

/**
 * The StackFactory class provides static methods to create different types of stacks.
 */
public class StackFactory {
    /**
     * Creates a stack based on the specified stack type and list type.
     *
     * @param stackType the type of stack to create (e.g., "arraylist", "vector", "list")
     * @param listType  the type of list to use when creating a stack of type "list" (e.g., "simples", "dobles")
     * @return a stack of the specified type
     * @throws IllegalArgumentException if the stack type or list type is invalid
     */
    public static <T> IStackADT<T> createStack(String stackType, String listType) {
        switch (stackType.toLowerCase()) {
            case "arraylist":
                return new StackArrayList<>();
            case "vector":
                return new StackVector<>();
            case "list":
                if (listType.equalsIgnoreCase("simples")) {
                    return new Simple<>();
                } else if (listType.equalsIgnoreCase("dobles")) {
                    return new Doble<>();
                } else {
                    throw new IllegalArgumentException("Tipo de lista no válido: " + listType);
                }
            default:
                throw new IllegalArgumentException("Tipo de pila no válido: " + stackType);
        }
    }

    /**
     * Creates a stack based on the specified stack type.
     *
     * @param stackType the type of stack to create (e.g., "arraylist", "vector")
     * @return a stack of the specified type
     * @throws IllegalArgumentException if the stack type is invalid
     */
    public static <T> IStackADT<T> createStack(String stackType) {
        switch (stackType.toLowerCase()) {
            case "arraylist":
                return new StackArrayList<>();
            case "vector":
                return new StackVector<>();
            default:
                throw new IllegalArgumentException("Tipo de pila no válido: " + stackType);
        }
    }
}