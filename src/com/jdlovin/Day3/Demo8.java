package com.jdlovin.Day3;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Welcome to Astro World";
        System.out.println(message.substring(0, 7)); //Welcome

        System.out.println("Original Message: " + message);
        System.out.println("Substring starting from index 7: " + message.substring(7));
        System.out.println("Substring starting from index 0 to 7: "+ message.substring(0,7));

        String str = new String("Welcome Agent 47");
        System.out.println(str);
        System.out.println(str.substring(8));
    }
}
