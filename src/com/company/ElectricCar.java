package com.company;

public class ElectricCar extends  Car{
    String bateria;

    public ElectricCar(String color, int modelo, String marca,String bateria){
        super(color, modelo, marca);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "bateria='" + bateria + '\'' +
                "} " + super.toString();
    }
}
