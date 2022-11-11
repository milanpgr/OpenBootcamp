package com.company;

public class TryCatchCapsuleError {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();// si esta linea de codigo la convertimos en comentario, no se imprimiria el error en pantalla.
        }

        System.out.println("fin");
    }

}


