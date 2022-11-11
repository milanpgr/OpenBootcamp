package com.company;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();

        holaMundo("jairo");

        String hola = devolverHola();
        System.out.println("hola");

    }
        public static void holaMundo() {
            System.out.println("Hola mundo");
            System.out.println("Hola mundo");
        }

        private static void holaMundo (String name){
            System.out.println("hola " + name);
        }

        public static String devolverHola() {
            return "hola milan";
        }
}
