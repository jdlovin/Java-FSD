package com.jdlovin.Day6;

interface Rapper {
    void getRapperName();

    void getNumChains();
}

class TwoChains implements Rapper {

    @Override
    public void getRapperName() {
        System.out.println("2 Chainz");
    }

    @Override
    public void getNumChains() {
        System.out.println("This person has: " + 2 + " chains");
    }
}

class RickRoss implements Rapper {

    @Override
    public void getRapperName() {
        System.out.println("Rick Ross");
    }

    @Override
    public void getNumChains() {
        System.out.println("Has no chains");
    }
}

class RapFactory {
    public static Rapper getRapInstance(int id) {
        switch (id) {
            case 1:
                return new TwoChains();
            case 2:
                return new RickRoss();
            default:
                return null;
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Rapper rapper = RapFactory.getRapInstance(2);

        rapper.getNumChains();
        rapper.getRapperName();
    }
}
