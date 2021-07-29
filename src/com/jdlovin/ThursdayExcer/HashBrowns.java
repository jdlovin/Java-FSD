package com.jdlovin.ThursdayExcer;

/*
# HashSet
1. Write a Java program to append the specified element to the end of a hash set.
2. Write a Java program to iterate through all elements in a hash list.
3. Write a Java program to get the number of elements in a hash set.
4. Write a Java program to empty an hash set.

 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(4235);
        number.add(423);
        number.add(325);
        number.add(56);
        number.add(43);

        //Number 1
        System.out.println(number);
        //It doesn't let you add it to the end since hash sets don't guarantee it to be last

        //Number 2
        System.out.println("Number 2");

        Iterator iterator = number.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Number 3
        System.out.println("Number 3");
        System.out.println("This set has " + number.size() + " elements");

        //Number 4
        System.out.println("Number 4");
        System.out.println("Before. . . ");
        System.out.println(number);
        number.removeAll(number);
        System.out.println("After. . . ");
        System.out.println(number);
    }
}
