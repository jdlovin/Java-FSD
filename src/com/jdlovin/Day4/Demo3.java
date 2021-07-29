package com.jdlovin.Day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Rivian");
        cars.add("Lotus");
        cars.add("Fisker");

        //before sorting
        System.out.println("Before..");
        for (String car: cars
             ) {
            System.out.println(car);
        }

        //After sorting
        System.out.println("After...");
        Collections.sort(cars);
        for(String car: cars){
            System.out.println(car);
        }
    }
}
