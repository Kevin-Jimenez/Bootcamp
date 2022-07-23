package com.company;

public class Car {
    //atribtuos
    private String color;
    private int modelo;
    private String marca;
    int velocidad = 0;

    public Car(String color, int modelo, String marca){
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void acelerar(int cantidad){
        if(cantidad > 0 && cantidad <=120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", modelo=" + modelo +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
