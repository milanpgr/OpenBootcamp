package com.company.Arrays;


import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {


        List<String>nombres = new ArrayList<>();

        nombres.add("Nombres 1");
        nombres.add("Nombres 2");
        nombres.add("Nombres 3");
        nombres.add("Nombres 4");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }


        List<Moto> moto = new ArrayList<>();


        moto.add(new Moto("Kawasaki"));
        moto.add(new Moto("susuki"));
        moto.add(new Moto("Akt"));


        System.out.println(moto);
    }
}
