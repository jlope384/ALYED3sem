import static org.junit.Assert.*;
import org.junit.Test;

public class RadioTest {

    @Test
    public void testTogglePowerOffOn() {
        Radio radio = new Radio();
        
        // Verificar que el estado inicial sea apagado
        assertFalse(radio.getState());

        // Encender el radio y verificar que el estado cambie a encendido
        radio.tooglePowerOffOn();
        assertTrue(radio.getState());

        // Apagar el radio y verificar que el estado cambie a apagado
        radio.tooglePowerOffOn();
        assertFalse(radio.getState());
    }

    @Test
    public void testToggleAMFM() {
        Radio radio = new Radio();

        // Verificar que el estado inicial sea AM
        assertTrue(radio.getStateAMFM());

        // Cambiar a FM y verificar que el estado cambie a FM
        radio.toogleAMFM();
        assertFalse(radio.getStateAMFM());

        // Cambiar de nuevo a AM y verificar que el estado cambie a AM
        radio.toogleAMFM();
        assertTrue(radio.getStateAMFM());
    }

    @Test
    public void testNextFrequency() {
        Radio radio = new Radio();

        // Verificar la frecuencia inicial en AM
        assertEquals(530, radio.getCurrentFrequency(), 0.01);

        // Avanzar la frecuencia en AM y verificar que se actualice correctamente
        radio.nextFrequency();
        assertEquals(540, radio.getCurrentFrequency(), 0.01);

        // Cambiar a FM y verificar la frecuencia inicial en FM
        radio.toogleAMFM();
        assertEquals(87.9, radio.getCurrentFrequency(), 0.01);

        // Avanzar la frecuencia en FM y verificar que se actualice correctamente
        radio.nextFrequency();
        assertEquals(88.1, radio.getCurrentFrequency(), 0.01);
    }


}
