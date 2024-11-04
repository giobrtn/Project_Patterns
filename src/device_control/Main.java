package device_control;

public class Main {
    public static void main(String[] args) {
        Control bluetoothControl = new BluetoothControl();
        Device bluetoothLamp = new Lampada(bluetoothControl);
        bluetoothLamp.operate();
        bluetoothLamp.adjustIntensity(5);

        System.out.println();

        Control wifiControl = new WifiControl();
        Device wifiFan = new Ventilador(wifiControl);
        wifiFan.operate();
        wifiFan.adjustIntensity(3);

        System.out.println();

        Control irControl = new InfraRedControl();
        Device irLamp = new Lampada(irControl);
        irLamp.operate();
        irLamp.adjustIntensity(7);
    }
}