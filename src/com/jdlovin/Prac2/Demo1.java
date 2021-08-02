package com.jdlovin.Prac2;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(21);
        theList.add(3);
        theList.add(5);
        theList.add(2);

        System.out.println(theList);

        Iterator listIterator = theList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
