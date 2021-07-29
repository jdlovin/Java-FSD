package com.jdlovin.Day3;

public class Demo4 {
    public static void main(String[] args) {

        String s1 = "Hobbs";
        String s2 = "Hobbs";
        String s3 = new String("Hobbs");

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
    }
}
