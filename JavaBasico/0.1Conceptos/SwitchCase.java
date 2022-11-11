package com.company;

public class SwitchCase {

    public static void main(String[] args) {

        String conceptosMatematicos = "resta";

        switch (conceptosMatematicos) {

            case "suma":
                System.out.println("la suma es el resultado de combinar dos valores.");
                break;
            case "resta":
                System.out.println("la resta es el resultado de sacar un valor de otro");
                break;
            default:
                System.out.println("fin de conceptos");

        }
    }
}
