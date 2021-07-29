package com.jdlovin.day2;

abstract class Test10{
    public abstract void display1();
}

abstract class Test20 extends Test10{
    public abstract void display2();
}

abstract class Test30 extends Test10{
    @Override
    public void display1() {
        System.out.println("Body of the abstract method");
    }
}

class Output extends Test20{

    @Override
    public void display1() {
        System.out.println("display1");
    }

    @Override
    public void display2() {
        System.out.println("display2");
    }
}

public class Demo5 {
    public static void main(String[] args) {

    }
}
