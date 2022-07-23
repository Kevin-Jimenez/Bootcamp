package com.company;

public class Switch {

    public static void main(String[] args) {

        String weather = "sunny";

        switch(weather){
            case "sunny":
                System.out.println("Soleado");
                break;
            case "cloudy":
                System.out.println("Nublado");
                break;
            default:
                System.out.println("No se identifico el clima");
                break;
        }
    }
}
