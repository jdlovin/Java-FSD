package com.jdlovin.day2;

class Calculation {
    public void test(){
        System.out.println("1st method");
    }

    public void test(String a){
        System.out.println("2nd Method");
    }

    public void test(int a, String b){
        System.out.println("3rd method");
    }

    public void test(String b, int a){
        System.out.println("4th method");
    }

    public void test(int a){
        System.out.println("5th method");
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.test();
        cal.test(3);
        cal.test("Hello");
        cal.test(69,"honey");
        cal.test("bae",88);

    }
}
