package com.jdlovin.Day4;

import java.util.Iterator;
import java.util.TreeSet;

//Will organize it in ascending oder
public class Demo11 {
    public static void main(String[] args) {
        //create TreeSet and add element
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Tom");
        treeSet.add("Todd");
        treeSet.add("Tim");
        treeSet.add("Tobby");

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        TreeSet<Integer> numSet = new TreeSet<>();
        numSet.add(1);
        numSet.add(4);
        numSet.add(3);
        numSet.add(5);

        Iterator<Integer> iterator1 = numSet.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
