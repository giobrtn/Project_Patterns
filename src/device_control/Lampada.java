package device_control;

public class Lampada extends Device{
    public Lampada(Control control){
        super(control);
    }

    @Override
    public void operate(){
        control.turnOn();
        System.out.println("Lampada está em poeração");

    }

    @Override
    public void adjustIntensity(int level){
        control.setIntensity(level);
        System.out.println("Intensidade da lâmpada ajustada para" + level + ".");
    }
}
