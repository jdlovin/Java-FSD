package com.jdlovin.Prac2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(32355);
        nums.add(53523);
        nums.add(5543);
        nums.add(643);
        nums.add(32);

        //before sort
        System.out.println("Before sorting...");
        for ( int number: nums
             ) {
            System.out.println(number);
        }

        //after sorting
        Collections.sort(nums);
        System.out.println("After sorting...");
        Iterator iterator = nums.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
