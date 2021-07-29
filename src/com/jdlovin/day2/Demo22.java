package com.jdlovin.day2;

interface Drawable{
    void draw();

    default void print(){
        System.out.println("Printing....");
    }
}

class Squa implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing....");
    }
}

public class Demo22 {
    public static void main(String[] args) {
        Squa squObj = new Squa();
        squObj.draw();
        squObj.print();
    }
}
