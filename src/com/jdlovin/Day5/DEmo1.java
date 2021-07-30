package com.jdlovin.Day5;

class MultiThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("This thread is running . . .");
    }
}

public class DEmo1 {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.start();
    }
}
