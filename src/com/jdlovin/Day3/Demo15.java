package com.jdlovin.Day3;

public class Demo15 {
    public static void main(String[] args) {
        System.out.println("Performance Test");
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("2");
        for (int i = 0; i<100_000_000; i++ ){
            stringBuffer.append("Chainz");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Bobby");
        for (int i = 0; i<100_000_000; i++ ){
            stringBuilder.append("Chainz");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
