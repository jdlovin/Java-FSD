package com.jdlovin.ThursdayExcer;
//
//# Linked List
//        1. Write a Java program to append the specified element to the end of a linked list.
//        2. Write a Java program to iterate through all elements in a linked list.
//        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
//        4. Write a Java program to iterate a linked list in reverse order.
//        5. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class theLinks {
    public static void main(String[] args) {
       LinkedList<String> tbLightning = new LinkedList<>();
        tbLightning.add("Brayden Point");
        tbLightning.add("Nikita Kucherov");
        tbLightning.add("Victor Hedman");
        tbLightning.add("Andre Palat");

        //Number 1
        System.out.println("Part 1");
        System.out.println();
        tbLightning.addLast("Steven Stamkos");
        System.out.println(tbLightning);


        //Number 2
        System.out.println("Part 2");
        for (String players: tbLightning) {
            System.out.println(players);
        }

        //Number 3
        System.out.println("Part 3");

        Iterator tbIter = tbLightning.listIterator(2);
        while(tbIter.hasNext()){
            System.out.println(tbIter.next());
        }

        //Number 4
        System.out.println("Part 4");

        Iterator revIter = tbLightning.descendingIterator();
        while(revIter.hasNext()){
            System.out.println(revIter.next());
        }
        //Number 5
        System.out.println("Part 5");

        tbLightning.add(2,"Alex Killorn");
        System.out.println(tbLightning);

    }
}
