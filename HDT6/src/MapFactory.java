import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * The MapFactory class provides a static method to create different types of maps based on the given option.
 */
public class MapFactory {
    /**
     * Creates a map based on the given option.
     *
     * @param option the option to determine the type of map to create
     * @return a map of type HashMap, TreeMap, or LinkedHashMap based on the given option
     * @throws IllegalArgumentException if the option is not valid for creating a map
     */
    public static Map<String, Estudiante> createMap(int option) {
        switch (option) {
            case 1:
                return new HashMap<>();
            case 2:
                return new TreeMap<>();
            case 3:
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("Opción no válida para Map");
        }
    }
}

