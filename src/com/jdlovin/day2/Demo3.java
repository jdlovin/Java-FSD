package com.jdlovin.day2;

class Bank{
    public int getRateOfInterest(){
        return 0;
    }
}

class BoA extends Bank{
    public int getRateOfInterest() {
        return 20;
    }
}

class Chase extends Bank{
    public int getRateOfInterest() {
        return 30;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        BoA bankOfA = new BoA();
        Chase chaseBank = new Chase();
        System.out.println(chaseBank.getRateOfInterest());
        System.out.println(bankOfA.getRateOfInterest());
    }
}
