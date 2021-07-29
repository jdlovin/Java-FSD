package com.jdlovin.day2;

interface T1{
    void print();
}

interface T2{
    void display();
}

class Test21 implements T1, T2{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void display() {
        System.out.println("Displaying...");
    }
}

public class Demo21 {
    public static void main(String[] args) {

    }
}
