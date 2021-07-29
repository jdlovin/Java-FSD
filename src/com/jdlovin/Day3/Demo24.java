package com.jdlovin.Day3;

public class Demo24 {
    public static void main(String[] args) {
        try {
            doThis();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doThis() throws Exception {
        doThisInstead();
    }

    private static void doThisInstead() throws Exception {
        actuallyYouShouldDoThis();
    }
    private static void actuallyYouShouldDoThis() throws Exception {
        throw new Exception();
    }
}
