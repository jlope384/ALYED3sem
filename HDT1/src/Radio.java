/*Universidad del Valle 
@autores: Javier Lopez del Cid - 23415
Daniela Ramirez - 23
Luis Pedro Lira - 23
Hoja de Trabajo 1 - Radio
Algoritmos y Estructuras de Datos
Seccion 20
*/

public class Radio implements IRadio {
    private boolean isOn;
    private boolean isAM;
    private float currentFrequency;
    private float[] favoriteFrequencies = new float[10];

    public Radio() {
        this.isOn = false;
        this.isAM = true;
        this.currentFrequency = 530;
    }

    public boolean getState() {
        return this.isOn;
    }

    public void tooglePowerOffOn() {
        this.isOn = !this.isOn;
    }

    public void toogleAMFM() {
        this.isAM = !this.isAM;
        if (this.isAM) {
            this.currentFrequency = 530;
        } else {
            this.currentFrequency = 87.9f;
        }
    }

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
    }

    public void previousFrequency() {
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
    }

    public float getCurrentFrequency() {
        return this.currentFrequency;
    }

    public void setFavFrequency(int button) {
        this.favoriteFrequencies[button - 1] = this.currentFrequency;
    }

    public float getFavFrequency(int button) {
        return this.favoriteFrequencies[button-1];
    }
}
