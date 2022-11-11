package com.company.Arrays;

public class Moto {

    String name = "Moto kawasaki";

    public Moto(){}
    public Moto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name='" + name + '\'' +
                '}';
    }
}
