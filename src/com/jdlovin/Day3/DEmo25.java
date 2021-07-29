package com.jdlovin.Day3;

//ArrayOutOfBoundException

public class DEmo25 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 45;

        try{
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
