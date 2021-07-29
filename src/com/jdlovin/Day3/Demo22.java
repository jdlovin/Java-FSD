package com.jdlovin.Day3;

public class Demo22 {

    public static void main(String[] args) {
        //Case 1: Exception not occur
        try {
            int c = 10/5;
            System.out.println(c);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Case 1: finally block reached");
        }

        //Case 2: Exception occurred but wasn't handled
        try{
            int c = 10/0;
            System.out.println(c);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally caught case 2 block");
        }

        //Case 3: Exception occurred and handled with care ;)
        try{
            int c= 10/0;
            System.out.println(c);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Case 3: finally block reached");
        }

    }
}
