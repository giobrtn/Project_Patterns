package device_control;

public class Ventilador extends Device{
    public Ventilador(Control control) {
        super(control);
    }

    @Override
    public void operate() {
        control.turnOn();
        System.out.println("Ventilador está em operação.");
    }

    @Override
    public void adjustIntensity(int level) {
        control.setIntensity(level);
        System.out.println("Velocidade do ventilador ajustada para " + level + ".");
    }
}
