package Tema4;

public class SmartWatch extends SmartDevice{


    public SmartWatch() {

    }
    String sensor;
    public SmartWatch(Double pantalla,int bateria, String sensor) {
        super(pantalla, bateria);
        this.sensor = sensor;
    }
}

