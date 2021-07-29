package com.jdlovin.Day4;
/*
1. Write a Java program to associate the specified value with the specified key in a HashMap.
2. Write a Java program to count the number of key-value (size) mappings in a map.
3. Write a Java program to copy all of the mappings from the specified map to another map.

 */

import java.util.HashMap;
import java.util.Map;

public class Excer2 {
    public static void main(String[] args) {
        Map<Integer, String> bankAccount = new HashMap<>();
        bankAccount.put(90210, "Freddie Gibbs");
        bankAccount.put(34560, "Fred Flintstone");
        bankAccount.put(42434, "Homer Simpson");
        bankAccount.put(34236, "Sammy Sosa");

        for(Map.Entry entry: bankAccount.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }

        System.out.println("Collection size: " + bankAccount.size());

        Map<Integer, String> newBankAccount = new HashMap<>(bankAccount);

        System.out.println("New collection size: " + newBankAccount.size());
    }

}
