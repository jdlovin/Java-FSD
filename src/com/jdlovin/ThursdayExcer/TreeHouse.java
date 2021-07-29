package com.jdlovin.ThursdayExcer;
/*
TreeSet
1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
2. Write a Java program to iterate through all elements in a tree set.
3. Write a Java program to add all the elements of a specified tree set to another tree set.
4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
5. Write a Java program to get the first and last elements in a tree set
 */


import java.util.Iterator;
import java.util.TreeSet;

public class TreeHouse {
    public static void main(String[] args) {
     TreeSet<String> color = new TreeSet<>();
     color.add("Blue");
     color.add("Pink");
     color.add("Brown");
     color.add("Green");


     //Part 1
        System.out.println(color);
        //Part 2
        System.out.println("Part 2");

        for(String colors: color){
            System.out.println(colors);

            TreeSet<String> moreColors = new TreeSet<>();
            moreColors.add("Black");
            //Part 3
            System.out.println("Part 3");
            System.out.println(moreColors);
            moreColors.addAll(color);
            System.out.println(moreColors);

            //Part 4
            System.out.println("Part 4");
            Iterator moreIter = moreColors.descendingIterator();
            while(moreIter.hasNext()){
                System.out.println(moreIter.next());
            }

            //Part 5
            System.out.println("Part 5");
            System.out.println(moreColors);
            System.out.println("Last: " + moreColors.last());
            System.out.println("First: " + moreColors.first());

//            can do either way
//            Iterator iterator = color.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }


        }


    }

}
