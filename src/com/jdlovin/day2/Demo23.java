package com.jdlovin.day2;

interface Pimp{
    void shout();
    static void pimpHand(){
        System.out.println("*uses backhand*");
    }
}

class Gator implements Pimp{

    @Override
    public void shout() {
        System.out.println("Gator needs some walking around money");
    }
}

public class Demo23 {
    public static void main(String[] args) {
        Gator gator = new Gator();
        Pimp bigMike = new Pimp() {
            @Override
            public void shout() {
                System.out.println("Big mike in the house");
            }
        };
        gator.shout();
        Pimp.pimpHand();
        bigMike.shout();
    }
}
