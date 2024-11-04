package device_control;

public abstract class Device {
    protected Control control;

    public Device(Control control){
        this.control = control;
    }

    public abstract void operate();
    public abstract void adjustIntensity(int level);
}
