package com.jdlovin.Prac2;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Stacy");
        names.add("Steph");

        for(int i = 0; i<names.size(); i++ ){
            System.out.println(names.get(i));
        }
    }
}
