package com.jdlovin.Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Toad");
        names.add("Wario");
        names.add("Peach");
        System.out.println(names);

        //adding element at a specific location
        names.add(2,"Mario");
        System.out.println(names);

        LinkedList<String> newNames = new LinkedList<>();
        newNames.add("Luigi");
        newNames.add("Bowser");

        names.addAll(newNames);
        System.out.println(names);

        names.addFirst("He was number 1");
        System.out.println(names);

        names.addLast("If you aint first, your last");
        System.out.println(names);

        names.add("Mario");
        names.add("Bowser");
        System.out.println(names);

        names.removeLastOccurrence("Bowser");
        System.out.println(names);

        names.removeFirstOccurrence("Mario");
        System.out.println(names);

        Iterator iterator = names.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
