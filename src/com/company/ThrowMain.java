package com.company;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {

        try{
            readNames();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
    }

/** Method that read names by cosole and verify than has long equals o heigher to 3
   *
 *  @throws NameFormatException
    */
    private static void readNames() throws NameFormatException{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please introduce your name: ");
        while (keyboard.hasNext()){
            System.out.println("Please introduce your name: ");
            String name = keyboard.nextLine();
            if(name.length() < 3){
                keyboard.close();
                throw new NameFormatException("The name should at least 4 characters");
            }
            System.out.println("Your name's: "+ name);
        }
        keyboard.close();
    }
}
