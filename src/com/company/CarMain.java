package com.company;

public class CarMain {
    public static void main(String[] args) {
        String color="Gris";
        int modelo=2022;
        String marca="Ford Explorer";

        Car obj = new Car(color,modelo,marca);
        obj.acelerar(80);
        System.out.println(obj.toString());

        ElectricCar ec = new ElectricCar("Rojo",2018,"Chevrolet","100 Horas");
        ec.acelerar(67);//sobre escritura de metodos, la funcion acelerar esta en la clase car peor la usamos en carro mecanico
        System.out.println(ec.toString());

        MecanicCar mc = new MecanicCar("Blanco",2019,"BMW","50 PH");
        mc.acelerar(10);
        System.out.println(mc.toString());
    }
}
