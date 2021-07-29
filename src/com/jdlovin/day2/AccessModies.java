package com.jdlovin.day2;

class Assassin{
    private int id;
    private String name;
    private int passMark = 75;


    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id < 2)
            throw new Exception("ID is not valid");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == "")
            throw new Exception("Name cannot be blank");
        this.name = name;
    }

    public int getPassMark() {
        return passMark;
    }
}

public class AccessModies {
    public static void main(String[] args) throws Exception {
        Assassin jamesBond = new Assassin();
        jamesBond.setId(7);
        jamesBond.setName("James Bond");
        System.out.println("Id = 00" + jamesBond.getId() + ", Name: " + jamesBond.getName() + ", Passmark: " + jamesBond.getPassMark());

    }
}
