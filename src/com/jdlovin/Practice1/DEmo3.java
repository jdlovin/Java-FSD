package com.jdlovin.Practice1;

public class DEmo3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a++); //5
        System.out.println(a); //6
        System.out.println(--a); //5
        System.out.println(a); //5
        System.out.println(++b); //11

        //a++ will increase the value once called again
        //++a will increase the value right away
    }
}
