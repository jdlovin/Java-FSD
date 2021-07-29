package com.jdlovin;

class Album {
    public String artist;
    public String albumName;
    public int price;

    public void printInfo() {
        System.out.println("Album: Title = " + albumName + ", Artist = " + artist + ", Price = " + price);
    }
}

public class Dry {
    public static void main(String[] args) {
        Album theCarterFour = new Album();
        theCarterFour.artist = "Lil Wayne";
        theCarterFour.albumName = "The Carter IV";
        theCarterFour.price = 20;

        Album album2 = new Album();
        album2.artist = "Nas";
        album2.albumName = "Insert title name here";
        album2.price = 50;

        theCarterFour.printInfo();
        album2.printInfo();
    }

}
