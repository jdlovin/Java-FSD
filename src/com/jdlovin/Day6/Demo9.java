package com.jdlovin.Day6;

interface Hello{
    public String greeting();
}

interface Welcome{
    public String greeting(String name);
}

interface Calculation{
    public int addNumber(int a, int b);
}

interface Say{
    public void sayHello(String name);
}


public class Demo9 {
    public static void main(String[] args) {

        //without parameter
        Hello hello = () -> {
            return "Welcome";
        };

        Welcome welcome = (name) -> {
            return "Welcome " + name;
        };

    }
}
