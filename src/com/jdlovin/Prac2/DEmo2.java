package com.jdlovin.Prac2;

import java.util.ArrayList;

public class DEmo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Timmy");
        arrayList.add("Paul");
        arrayList.add("Bob");

        //get the item
        System.out.println(arrayList.get(1));

        //set the item
        arrayList.set(1, "Paul Wall");
        for (String name: arrayList
             ) {
            System.out.println(name);

        }
    }
}
