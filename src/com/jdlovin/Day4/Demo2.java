package com.jdlovin.Day4;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mario");
        names.add("Luigi");
        names.add("Bowser");

        //get
        System.out.println(names.get(2));
        //set
        names.set(2, "Baby Bowser");
        for(String name: names){
            System.out.println(name);
        }
    }
}
