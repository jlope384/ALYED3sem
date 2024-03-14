package HDT6.test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Map;

public class MapFactoryTest {
    @Test
    public void testCreateHashMap() {
        Map<String, Estudiante> map = MapFactory.createMap(1);
        assertTrue(map instanceof HashMap);
    }

    @Test
    public void testCreateTreeMap() {
        Map<String, Estudiante> map = MapFactory.createMap(2);
        assertTrue(map instanceof TreeMap);
    }

    @Test
    public void testCreateLinkedHashMap() {
        Map<String, Estudiante> map = MapFactory.createMap(3);
        assertTrue(map instanceof LinkedHashMap);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidMap() {
        MapFactory.createMap(4);
    }
}

