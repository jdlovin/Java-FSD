package com.jdlovin.Day4;

/*
1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

2. Write a Java program to iterate through all elements in a array list.

3. Write a Java program to insert an element into the array list at the first position.

4. Write a Java program to retrieve an element (at a specified index) from a given array list.

5. Write a Java program to update specific array element by given element.

6. Write a Java program to remove the third element from a array list.

7. Write a Java program to search an element in a array list.

8. Write a Java program to sort a given array list.

9. Write a Java program to copy one array list into another.

 */

import java.util.*;

public class Excer1 {
    public static void main(String[] args) {
        LinkedList<String> someColors = new LinkedList<>();
        someColors.add("Blue");
        someColors.add("Yellow");
        someColors.add("Purple");
        someColors.add("Black");

        //Part 1
        System.out.println("Part 1");
        System.out.println(someColors);

        //Part 2
        System.out.println("Part 2");

        for (String someColor : someColors) {
            System.out.println(someColor);
        }

        //Part 3
        System.out.println("Part 3");

        someColors.add(0,"Pink");
        System.out.println(someColors);

        //Part 4
        System.out.println("Part 4");

        System.out.println(someColors.get(1)); //returns Blue

        //Part 5 - Come back to it
        System.out.println("Part 5");

        someColors.set(2, "Black");
        System.out.println(someColors);

        //Part 6
        System.out.println("Part 6");

        someColors.remove(2);
        System.out.println(someColors); //removed yellow

        //Part 7
        System.out.println("Part 7");

        someColors.contains("Blue");
        System.out.println(someColors);

        //Part 8
        System.out.println("Part 8");

        ArrayList<Integer> theseNums = new ArrayList<>();
        theseNums.add(5);
        theseNums.add(4);
        theseNums.add(56);
        theseNums.add(69);
        theseNums.add(1);
        theseNums.add(59);

        Collections.sort(theseNums);
        System.out.println(theseNums);

        //Part 9
        System.out.println("Part 9");

        ArrayList<Integer> squad = new ArrayList<>();
        squad.add(88);
        squad.add(21);

        theseNums.addAll(squad);
        System.out.println(theseNums);





    }
}
