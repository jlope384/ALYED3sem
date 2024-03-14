package HDT6.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashFunctionTest {

    @Test
    public void testOrganicaHash() {
        HashFunction hashFunction = HashFactory.createHashFunction("organica");
        assertEquals("OrganicaHash(test)", hashFunction.hash("test"));
    }

    @Test
    public void testMD5Hash() {
        HashFunction hashFunction = HashFactory.createHashFunction("md5");
        assertEquals("098f6bcd4621d373cade4e832627b4f6", hashFunction.hash("test"));
    }

    // Podrías agregar tests para SHA-1 si se implementa esa función hash
}

