<<<<<<< HEAD
public class Radio implements IRadio {

    private boolean isOn;

    @Override
    public boolean getState() {
        return isOn;
    }

    private boolean isAM;

    @Override
    public void tooglePowerOffOn() {
        isOn = !isOn;
=======
/*Universidad del Valle 
@autores: Javier Lopez del Cid - 23415
Daniela Ramirez - 23053
Luis Pedro Lira - 23669
Hoja de Trabajo 1 - Radio
Algoritmos y Estructuras de Datos
Seccion 20
*/

/**
 * Clase que implementa la interfaz IRadio y representa una radio.
 */

public class Radio implements IRadio {
    private boolean isOn;
    private boolean isAM;
    private float currentFrequency;
    private float[] favoriteFrequencies = new float[10];

    /**
     * Constructor que inicializa una instancia de Radio con valores predeterminados.
     */

    public Radio() {
        this.isOn = false;
        this.isAM = true;
        this.currentFrequency = 530;
    }

    @Override
    public boolean getState() {
        return this.isOn;
    }

    @Override
    public void tooglePowerOffOn() {
        this.isOn = !this.isOn;
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }

    @Override
    public void toogleAMFM() {
<<<<<<< HEAD
        isAM = !isAM;
    }

    private float currentFrecuency = 0.0f;

    @Override
    public boolean getStateAMFM() {
        return isAM;
    }

    @Override
    public void nextFrequency() {
        currentFrecuency += 0.2;
=======
        this.isAM = !this.isAM;
        if (this.isAM) {
            this.currentFrequency = 530;
        } else {
            this.currentFrequency = 87.9f;
        }
    }

    @Override
    public boolean getStateAMFM() {
        return this.isAM;
    }

    public void nextFrequency() {
        if (this.isAM) {
            if (this.currentFrequency == 1610) {
                this.currentFrequency = 530;
            } else {
                this.currentFrequency += 10;
            }
        } else {
            if (this.currentFrequency == 107.9f) {
                this.currentFrequency = 87.9f;
            } else {
                this.currentFrequency += 0.2f;
            }
        }
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }

    @Override
    public void previousFrequency() {
<<<<<<< HEAD
        currentFrecuency -= 0.2;
=======
        if (this.isAM) {
            if (this.currentFrequency == 530) {
                this.currentFrequency = 1610;
            } else {
                this.currentFrequency -= 10;
            }
        } else {
            if (this.currentFrequency == 87.9f) {
                this.currentFrequency = 107.9f;
            } else {
                this.currentFrequency -= 0.2f;
            }
        }
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }

    @Override
    public float getCurrentFrequency() {
<<<<<<< HEAD
        return currentFrecuency;
=======
        return this.currentFrequency;
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }

    @Override
    public void setFavFrequency(int button) {
<<<<<<< HEAD
        setFavFrequency(button);
=======
        this.favoriteFrequencies[button - 1] = this.currentFrequency;
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }

    @Override
    public float getFavFrequency(int button) {
<<<<<<< HEAD
        return getFavFrequency(button);
=======
        return this.favoriteFrequencies[button-1];
>>>>>>> 59d0195035b4e4d973edb2b78681a674eadcab3b
    }
}
