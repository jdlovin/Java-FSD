package com.jdlovin.Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mario");
        names.add("Luigi");
        names.add("Toad");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
