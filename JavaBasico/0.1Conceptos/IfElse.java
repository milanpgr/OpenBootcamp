package com.company;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 25;
        int number2 = 15;
        int number3 = 3000;
        int number4 = 1000;

        if (number1 < number2 && number2 > number3) {
            System.out.println("verdadero");
        } else if (number3 < number4) {
            System.out.println("elseIf");
        }else {
            System.out.println("no se cumple");
        }

        System.out.println("False");
    }
}
