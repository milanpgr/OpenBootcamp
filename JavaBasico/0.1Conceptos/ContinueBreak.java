package com.company;

public class ContinueBreak {

    public static void main(String[] args) {


        int number = 0;
        while (number < 10){
            number++;  //condicion o sumatorio
            if (number == 6)
                break; // break, rompe el flujo de ejecucion dando fin al bucle
                //continue = salta el valor 6 y continua a la siguiente interaccion

            System.out.println("Hola mundo "+ number);
        }
        System.out.println("termino");
    }
}
