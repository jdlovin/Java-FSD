package com.jdlovin.Day3;

public class Demo3 {
    public static void main(String[] args) {

        String s1 = "Bugs";
        String s2 = "Bugs";
        String s3 = new String("Bugs");
        String s4 = "Daffy";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false, well its a diff name so obvi

    }
}
