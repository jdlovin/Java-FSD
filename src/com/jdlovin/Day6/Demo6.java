package com.jdlovin.Day6;

interface ICar {
    void getCarModel();

    void getCarColor();
}

class BMW implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("M3");
    }

    @Override
    public void getCarColor() {
        System.out.println("Blue");
    }
}

class Ford implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("F-150");
    }

    @Override
    public void getCarColor() {
        System.out.println("White");
    }
}

class CarFactory {
    public static ICar getCarInstance(int id) {
        switch (id) {
            case 1:
                return new BMW();
            case 2:
                return new Ford();
            default:
                return null;
        }
    }
}

public class Demo6 {
    public static void main(String[] args) {
        ICar car = CarFactory.getCarInstance(2);
        car.getCarColor();
        car.getCarModel();
    }

}
