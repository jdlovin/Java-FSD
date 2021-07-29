package com.jdlovin.day2;

abstract class Shape{
    public double width;
    public double height;
    public double radius;
    public float pie = 3.14f;

    public abstract void getArea();
}

class Rectangle extends Shape{
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println("rectangle is drawn...");
    }

    @Override
    public void getArea() {
        System.out.println(width * height);
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle is pretty round");
    }


    @Override
    public void getArea() {
        System.out.println(pie * radius * radius);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Rectangle rectanle = new Rectangle(30,20);
        Circle circle = new Circle(45.9);

        rectanle.getArea();
        rectanle.draw();

        circle.draw();
        circle.getArea();
    }
}
