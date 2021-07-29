package com.jdlovin.Day3;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "Bobby"; // creating string using java string literal
        char ch[] = {'H','e','l','l','o'};

        String s2 = new String(ch); //converting char array to string
        String s3 = new String("Bowdin");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
