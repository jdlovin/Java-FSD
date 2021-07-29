package com.jdlovin.Day4;

import java.util.HashSet;
import java.util.Iterator;

public class Demo9 {
    public static void main(String[] args) {
        //create HashSet and add elements
        HashSet<String> set = new HashSet<>();
        set.add("Hyundai");
        set.add("Ford");
        set.add("Honda");
        set.add(null);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove()
        set.remove(null);
        System.out.println(set);
    }
}
