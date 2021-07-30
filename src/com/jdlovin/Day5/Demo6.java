package com.jdlovin.Day5;

class ThreadPriorityDemo extends Thread {
    public void run() {
        System.out.println("Running this thread: " + Thread.currentThread().getName());
        System.out.println("Running thread priority: " + Thread.currentThread().getPriority());
    }
}

public class Demo6 {
    public static void main(String[] args) {
    ThreadPriorityDemo d1 = new ThreadPriorityDemo();
    ThreadPriorityDemo d2 = new ThreadPriorityDemo();
    d1.setPriority(Thread.MAX_PRIORITY);
    d2.setPriority(Thread.MIN_PRIORITY);
    d1.start();
    d2.start();
    }
}
