package com.jdlovin.Practice1;

class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Book2 book = new Book2("Hustlers Anthemn", "OutKast",200);
        book.printInfo();
    }
}
