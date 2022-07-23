package com.company;

public class MecanicCar extends Car{
    String cilindraje;

    public MecanicCar(String color, int modelo, String marca,String cilindraje){
        super(color,modelo,marca);
        this.cilindraje = cilindraje;
    }


    @Override
    public String toString() {
        return "MecanicCar{" +
                "cilindraje='" + cilindraje + '\'' +
                "} " + super.toString();
    }
}
