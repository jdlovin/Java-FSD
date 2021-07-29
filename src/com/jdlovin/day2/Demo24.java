package com.jdlovin.day2;

interface Automobile{
    void print();
    void gasMilage();
    interface SUV {
        void offRoad();

    }
    interface Coupe {
        void speed();
    }
}

class AudiCoupe implements Automobile.Coupe {

    @Override
    public void speed() {
        System.out.println("Its fast");
    }
}

class AudiSUV implements Automobile.SUV {

    @Override
    public void offRoad() {
        System.out.println("Not much of a off-road, maybe your gravel driveway will be ok");
    }
}

public class Demo24 {
    public static void main(String[] args) {
        Automobile audiQ3 = new Automobile() {
            @Override
            public void print() {
                System.out.println("Has great features");
            }

            @Override
            public void gasMilage() {
                System.out.println("Great gas mileage");
            }
        };

    }
}
