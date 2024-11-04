package device_control;

public class InfraRedControl implements Control{
    @Override
    public void turnOn() {
        System.out.println("Dispositivo ligado via Infravermelho.");
    }

    @Override
    public void turnOff() {
        System.out.println("Dispositivo desligado via Infravermelho.");
    }

    @Override
    public void setIntensity(int level) {
        System.out.println("Intensidade ajustada para " + level + " via Infravermelho.");
    }
}
