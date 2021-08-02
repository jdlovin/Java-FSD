package com.jdlovin.Prac2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Tim");
        list.add("Rickard");
        list.add("Alyssa");
        list.add("Megan");
        list.add("Steph");
        System.out.println(list);

        System.out.println(list.get(1)); //Richard

        list.add(1,"Dick");
        System.out.println(list);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Hannah");
        newList.add("Sam");

        newList.addAll(list);

        System.out.println(newList);

        newList.remove("Hannah");

        System.out.println(newList);
    }
}
