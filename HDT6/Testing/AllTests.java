import java.util.Map;

import org.junit.Test;

public class AllTests {

    @Test
    public void testFSHA1() {
        FSHA1 fsha1 = new FSHA1();
        assertEquals("2ef7bde608ce5404e97d5f042f95f89f1c232871", fsha1.createHash("Hello, World!"));
    }

    @Test
    public void testFuncMD5() {
        FuncMD5 funcMD5 = new FuncMD5();
        assertEquals("5d41402abc4b2a76b9719d911017c592", funcMD5.createHash("hello"));
    }

    @Test
    public void testFuncOrganica() {
        FuncOrganica funcOrganica = new FuncOrganica();
        assertEquals("532", funcOrganica.createHash("hello"));
    }

    @Test
    public void testLectorArchivo() {
        IHash mockHashFactory = new IHash() {
            @Override
            public String createHash(String input) {
                return input; // Use the input as the hash for testing purposes
            }
        };

        LectorArchivo lectorArchivo = new LectorArchivo();

        Map<String, Estudiante> estudiantes = lectorArchivo.leerEstudiantes("estudiantes.json", mockHashFactory);

        assertEquals(2, estudiantes.size());
        assertTrue(estudiantes.containsKey("email1@example.com"));
        assertTrue(estudiantes.containsKey("email2@example.com"));

        Estudiante estudiante1 = estudiantes.get("email1@example.com");
        assertEquals("Estudiante 1", estudiante1.getNombre());
        assertEquals(123456789, estudiante1.getPhone());
        assertEquals("email1@example.com", estudiante1.getEmail());
        assertEquals(12345, estudiante1.getPostalZip());
        assertEquals("Country 1", estudiante1.getCountry());

        Estudiante estudiante2 = estudiantes.get("email2@example.com");
        assertEquals("Estudiante 2", estudiante2.getNombre());
        assertEquals(987654321, estudiante2.getPhone());
        assertEquals("email2@example.com", estudiante2.getEmail());
        assertEquals(54321, estudiante2.getPostalZip());
        assertEquals("Country 2", estudiante2.getCountry());
    }
}
