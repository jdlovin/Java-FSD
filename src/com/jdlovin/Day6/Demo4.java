package com.jdlovin.Day6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player implements Comparable<Player>{
    int jerseyNum;
    String name;
    int age;

    @Override
    public String toString() {
        return "Player{" +
                "jerseyNum=" + jerseyNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Player(int jerseyNum, String name, int age){
        this.age = age;
        this.jerseyNum = jerseyNum;
        this.name = name;
    }

    @Override
    public int compareTo(Player other) {
        if(jerseyNum > other.jerseyNum)
            return 1;
        else if (jerseyNum< other.jerseyNum)
            return -1;
        else
            return 0;
    }
}

class SortByName implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if(o1.age > o2.age)
            return 1;
        else if (o1.age < o2.age)
            return -1;
        else
            return 0;
    }
}


public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(14, "Joao Felix", 21));
        players.add(new Player(7, "Luis Suarez", 34));
        players.add(new Player(12, "Koke", 28));

        System.out.println("Before sorting...");
        for(Player player: players) {
            System.out.println(player);
        }

        Collections.sort(players);
        System.out.println("After sorting...");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
