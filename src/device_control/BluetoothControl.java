package device_control;

public class BluetoothControl implements Control{
    @Override
    public void turnOn() {
        System.out.println("Dispositivo ligado via Bluetooth");
    }

    @Override
    public void turnOff() {
        System.out.println("Despositivo desligado via Bluetooth");
    }

    @Override
    public void setIntensity(int level) {
        System.out.println("Intensidade ajustada para " + level + "via Bluetooth");
    }
}
