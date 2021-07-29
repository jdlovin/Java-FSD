package com.jdlovin.day2;

class Parent{
    public void greeting(String name){
        System.out.println("Welcome "+ name);
    }
}

class Child extends Parent {
    public void greeting(String name){
        System.out.println("G'day "+ name);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        child.greeting("Bob");

        parent.greeting("phil");

    }
}
