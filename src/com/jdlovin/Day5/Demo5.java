package com.jdlovin.Day5;

class ThreadDemoName extends Thread {
    public void run() {
        System.out.println("Thread is running....");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        ThreadDemoName demoName = new ThreadDemoName();
        ThreadDemoName demoName1 = new ThreadDemoName();

        System.out.println("Name of demoName: " + demoName.getName());
        System.out.println("Name of demoName1: " + demoName1.getName());

        demoName.start();
        demoName1.start();

        demoName.setName("Your bank account");
        demoName1.setName("Your crypto account");

        System.out.println("Name of demoName: " + demoName.getName());
        System.out.println("Name of demoName1: " + demoName1.getName());



    }
}
