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
    }

    @Override
    public void toogleAMFM() {
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
    }

    @Override
    public void previousFrequency() {
        currentFrecuency -= 0.2;
    }

    @Override
    public float getCurrentFrequency() {
        return currentFrecuency;
    }

    @Override
    public void setFavFrequency(int button) {
        setFavFrequency(button);
    }

    @Override
    public float getFavFrequency(int button) {
        return getFavFrequency(button);
    }
}
