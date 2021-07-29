package com.jdlovin.Day3;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        String message = "Welcome, Agent 47";
        String[] result = message.split("\\,");
        System.out.println(Arrays.toString(result));
    }
}
