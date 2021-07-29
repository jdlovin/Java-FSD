package com.jdlovin.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Mario");
        myList.add("Luigi");
        myList.add("Peach");

        Iterator iterator = myList.iterator();
        //hasNext() will check if iterator has the element
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //print the element and move the cursor to the next element
        }

        System.out.println("For Each loop");

        for(String name: myList){
            System.out.println(name);
        }
    }
}
