package device_control;

public class WifiControl implements Control {
    @Override
    public void turnOn() {
        System.out.println("Dispositivo ligado via WiFi.");
    }

    @Override
    public void turnOff() {
        System.out.println("Dispositivo desligado via WiFi.");
    }

    @Override
    public void setIntensity(int level) {
        System.out.println("Intensidade ajustada para " + level + " via WiFi.");
    }
}
