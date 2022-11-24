package Tema4;

public class SmartDevice {

        //Atributos
        Double pantalla;
        String procesador;
        int ram;
        int almacenamiento;
        int camara;
        int bateria;
        String sistemaOperativo;

        //Constructores
        public SmartDevice(){

        }

        public SmartDevice(Double pantalla, String procesador, int ram, int almacenamiento, int camara, int bateria, String sistemaOperativo){
                this.pantalla = pantalla;
                this.procesador = procesador;
                this.ram = ram;
                this.almacenamiento = almacenamiento;
                this.camara = camara;
                this.bateria = bateria;
                this.sistemaOperativo = sistemaOperativo;
        }

        public SmartDevice(Double pantalla, int bateria) {
                this.pantalla = pantalla;
                this.bateria = bateria;

        }
}
