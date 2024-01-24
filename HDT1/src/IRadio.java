/**
 * Interfaz que define la funcionalidad de una radio.
 */

public interface IRadio {

    /**
     * Obtiene el estado de la radio (encendido o apagado).
     *
     * @return True si la radio está encendida, False si está apagada.
     */

    public boolean getState(); 

    /**
     * Alterna el estado de encendido/apagado de la radio.
     */

    public void tooglePowerOffOn(); 
    /**
     * Alterna entre las bandas AM y FM.
     */

    public void toogleAMFM(); 
    /**
     * Obtiene el estado actual de la banda (AM o FM).
     *
     * @return True si la radio está en AM, False si está en FM.
     */

    public boolean getStateAMFM(); 

    /**
     * Cambia a la siguiente frecuencia.
     */

    public void nextFrequency(); 

    /**
     * Cambia a la frecuencia anterior.
     */

    public void previousFrequency();
    /**
     * Obtiene la frecuencia actual.
     *
     * @return La frecuencia actual de la radio.
     */

    public float getCurrentFrequency();

    /**
     * Guarda la frecuencia actual en un botón favorito.
     *
     * @param button Número del botón (0-9) en el que se guardará la frecuencia.
     */

    public void setFavFrequency(int button); 

    /**
     * Obtiene la frecuencia guardada en un botón favorito.
     *
     * @param button Número del botón (0-9) del que se obtendrá la frecuencia.
     * @return La frecuencia guardada en el botón especificado.
     */

    public float getFavFrequency(int button); // Llama frecuencia
}