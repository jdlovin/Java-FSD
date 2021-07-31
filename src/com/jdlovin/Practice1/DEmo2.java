package com.jdlovin.Practice1;

public class DEmo2 {
    public static void main(String[] args) {

        int a = 30;
        int x = 65;
        int g = 22;
//        boolean t = true;
//        boolean h = fasle;

        //arithmatic operators
        System.out.println(a / g); //divide
        System.out.println(g + x); //addition
        System.out.println(x - x); //sub
        System.out.println(a * x); //multiply like A$AP

        //Relational operators < >
        //logical operators && acts as an 'and'
        System.out.println(a<x && g<a ); //true

        //Logical operator OR ||
        System.out.println(a < g || a < x); //

        int max = (a < x) ? a : g;
        System.out.println(max);

    }
}
