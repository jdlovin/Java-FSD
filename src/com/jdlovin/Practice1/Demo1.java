package com.jdlovin.Practice1;

public class Demo1 {
    static int z = 100; //static variable - its in memory
    int x = 10; //instance variable - not shared amongst other instances

    public void addNumber(){
        int d =10; //cant be static
        int a = 10; //local variable
        int b = 20; //local variable
        System.out.println(a + b);
    }



}
