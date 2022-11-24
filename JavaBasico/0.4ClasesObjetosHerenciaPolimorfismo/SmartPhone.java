package Tema4;

public class SmartPhone extends SmartDevice{

    String bluetooth;

    public SmartPhone() {

    }

    public SmartPhone(Double pantalla, String procesador, int ram, int almacenamiento, int camara, int bateria, String sistemaOperativo, String bluetooth) {
        super(pantalla, procesador, ram, almacenamiento, camara, bateria, sistemaOperativo);
        this.bluetooth = bluetooth;

    }
}
