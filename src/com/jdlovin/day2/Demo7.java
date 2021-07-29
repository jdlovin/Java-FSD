package com.jdlovin.day2;

abstract class Calc2 {
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }
    public void subNumber(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
    }

    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
}

class Test4 extends Calc2{

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: "+ (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: " + (num1/num2));
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Test4 bob = new Test4();
        bob.divNumber(10,2);
        bob.addNumber(5,4);
        bob.mulNumber(7,8);
        bob.subNumber(0,45);
    }
}
