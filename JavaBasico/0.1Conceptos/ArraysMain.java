package com.company.Arrays;

public class ArraysMain {
    public static void main(String[] args) {


        String nombres1 = "Tatiana";
        String nombres2 = "Esteban";
        String nombres3 = "Fabiola";
        String nombres4 = "Jairo";

        //Creacion de arrays, Forma practica de crear arrays, e implementar bucles for
        String[] nombres = new String[4];

        nombres[0] = nombres1;
        nombres[1] = nombres2;
        nombres[2] = nombres3;
        nombres[3] = nombres4;

        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
