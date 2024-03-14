package HDT6.test;

import org.junit.Test;
import static org.junit.Assert.*;
public class HashFunctionTest {

    @Test
    public void testCreateHash() {
        System.out.println("CreateHash");
        String input = "Hola";
        FuncMD5 instance = new FuncMD5();
        String expResult = "6d6f6e6f6c6f6c61";
        String result = instance.CreateHash(input);
        assertEquals(expResult, result);
    }
}