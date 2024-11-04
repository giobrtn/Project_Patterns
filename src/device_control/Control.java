package device_control;

public interface Control {
    void turnOn();
    void turnOff();
    void setIntensity(int level);
}
