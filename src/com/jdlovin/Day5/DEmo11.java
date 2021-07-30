package com.jdlovin.Day5;

class Table2{
    public void printTable(int number){
        //sync block
        synchronized (this) {
            for(int i = 0; i <= 10; i++){
                System.out.println(number * i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TableThread extends Thread {
    Table2 table;
    public TableThread(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(3);
    }
}

class TableThread2 extends Thread {
    Table2 table;
    public TableThread2(Table2 table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(10);
    }
}

public class DEmo11 {
    public static void main(String[] args) {
        Table2 table2 = new Table2();
        TableThread tableThread = new TableThread(table2);
        TableThread2 tableThread2 = new TableThread2(table2);

        tableThread.start();
        tableThread2.start();
    }
}
