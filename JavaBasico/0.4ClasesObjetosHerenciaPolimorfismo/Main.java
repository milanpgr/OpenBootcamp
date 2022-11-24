package Tema4;
    /*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     */

public class Main {

    public static void main(String[] args) {

        SmartDevice tecnologies = new SmartDevice(7.8,"MediaTek Helio G95",16,128,13,5000,"Android 11");
        System.out.println("Caracteristicas dispositivo inteligente");
        System.out.println(tecnologies.pantalla+ "' pulgadas");
        System.out.println(tecnologies.procesador);
        System.out.println(tecnologies.ram+"GB");
        System.out.println(tecnologies.almacenamiento+"GB de almacenamiento");
        System.out.println(tecnologies.camara+" MegaPixeles");
        System.out.println(tecnologies.bateria+" MA");
        System.out.println(tecnologies.sistemaOperativo+" MIUI 12");


        SmartPhone xiaomi10S = new SmartPhone(7.9,"MediaTek Helio G95",6, 64,64,5000,"Android 11 + MIUI 12","5.0");
        System.out.println("Xiaomi 10S Caracteristicas");
        System.out.println(xiaomi10S.pantalla+ "' pulgadas");
        System.out.println(xiaomi10S.procesador);
        System.out.println(xiaomi10S.ram+" GB");
        System.out.println(xiaomi10S.almacenamiento+" GB de almacenamiento");
        System.out.println(xiaomi10S.camara+" MegaPixeles");
        System.out.println(xiaomi10S.bateria+" MA");
        System.out.println(xiaomi10S.sistemaOperativo+" MIUI");
        System.out.println(xiaomi10S.bluetooth);


        SmartWatch amazfitBip3 = new SmartWatch(1.69,280,"BioTracker 2 PPG");
        System.out.println("Amazfit Bip3");
        System.out.println(amazfitBip3.pantalla+"' pulgadas");
        System.out.println(amazfitBip3.bateria+" mAh");
        System.out.println(amazfitBip3.sensor);


    }

}