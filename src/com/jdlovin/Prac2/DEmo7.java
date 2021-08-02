package com.jdlovin.Prac2;

import java.util.Iterator;
import java.util.LinkedList;

public class DEmo7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Paul");
        names.add("Tim");
        names.add("Bob");

        Iterator phil = names.iterator();
        while(phil.hasNext()){
            System.out.println(phil.next());
        }


    }
}
