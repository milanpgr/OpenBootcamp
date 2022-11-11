package com.company;

public class Vehiculo {

    // para crear objetos primero debemos seguir los siguientes pasos
    // debemos asignar los siguientes elementos

    //Atributos
    String color;
    String modelo;
    String cilindraje;
    String marca;
    Double acelerar;
    Integer velocidad;
    //Constructores
    public Vehiculo (String color, String modelo, String cilindraje, String marca, Double acelerar){
        this.color = color;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.acelerar = acelerar;

    }
    //Comportamientos
    public void arrancar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }
}