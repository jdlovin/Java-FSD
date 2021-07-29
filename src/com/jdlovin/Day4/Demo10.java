package com.jdlovin.Day4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo10 {
    public static void main(String[] args) {

        //Wont keep it in the order that it was given
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //Will keep it in an organized order that it was given
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("One");
        set2.add("Two");
        set2.add("Three");
        set2.add("Four");
        set2.add("Five");

        Iterator<String> iterator1 = set2.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
