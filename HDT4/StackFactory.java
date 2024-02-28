package HDT4;

public class StackFactory {
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