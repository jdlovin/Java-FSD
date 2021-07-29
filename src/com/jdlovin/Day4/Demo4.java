package com.jdlovin.Day4;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(29);
        nums.add(3);
        nums.add(2);
        nums.add(5);

        //for
        for(int i=0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

    }
}
