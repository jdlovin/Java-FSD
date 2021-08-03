package com.jdlovin.Day7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing triangle...");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Cone {
    void draw() {
        System.out.println("Drawing cone....");
    }
}

class Test{
    public static void drawShape(List<? extends Shape> list){
        for(Shape shape : list){
            shape.draw();
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Test.drawShape(rectangleList);
        Test.drawShape(circleList);
//        Test.drawShape(coneList);

    }
}
