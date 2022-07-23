package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();
        persons.put("1","Kevin Jimenez");
        persons.put("2","Brayan Jimenez");
        persons.put("3","Deisy Salamanca");
        persons.put("4","Angus Salamanca");

        System.out.println(persons);
        //print keys
        for(String key: persons.keySet()){
            System.out.println(key);
        }
        //print values
        for (String value: persons.values()){
            System.out.println(value);
        }
        //print both keys and values
        for(Map.Entry<String, String> pair: persons.entrySet()){
            System.out.println(pair.getKey() +" "+pair.getValue());
        }
    }
}
