package com.company;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int resilt = 5/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");

    }
}
