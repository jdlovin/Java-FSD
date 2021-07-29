package com.jdlovin.Day3;

public class Demo2 {
    public static void main(String[] args) {

        String str = "Make it";
        str.concat("rain");
        System.out.println(str); //will print "Make it" ony bc strings are immutable object

        String str1 = "Make it ";
        str1 = str1.concat("rain");
        System.out.println(str1);
    }
}
