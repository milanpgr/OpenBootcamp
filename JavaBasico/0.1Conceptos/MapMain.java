package com.company.Arrays;


import java.util.HashMap;
import java.util.Map;


public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("12345i", "Francisco lopez");
        personas.put("54321i", "Michael Jackson");
        personas.put("34567i", "Anna");

        for(String key : personas.keySet()) {
            System.out.println(key);
        }

        for(String values : personas.values()) {
            System.out.println(values);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}




