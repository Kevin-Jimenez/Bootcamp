package com.company;

public class ArraysMain {
    public static void main(String[] args) {
        String name1 = "Nombre 1";
        String name2 = "Nombre 2";
        String name3 = "Nombre 3";

        String[] names = new String[3];
        String[] names2 = new String[]{name1,name2,name3};
        int[] numbers  = new int[5];

        //agregar
        names[0] = name1;
        names[1] = name1;
        names[2] = name2;


        for (int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

    }
}
