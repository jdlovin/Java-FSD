package com.jdlovin.Day5;

class Company {
    int item;
    boolean flag = false;
    //flag - false it is producer turn
    //flag - true it is consumer turn

   synchronized void produce(int item) throws InterruptedException {
       if (flag) {
           wait();
       }
       this.item = item;
       System.out.println("Produced: " + this.item);
       flag = true;
       notify();
   }

   synchronized int consume() throws InterruptedException {
       if (flag) {
           wait();
       }
       System.out.println("Consume: " + item);
       flag = false;
       notify();
       return this.item;
   }
}

class Producer extends Thread {
    Company company;

    Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i = 1;
        try {
            this.company.produce(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo14 {
    public static void main(String[] args) {

    }
}
