package com.jdlovin.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int menuSelection = -1;
        while(menuSelection != 6) {
            System.out.println("*****************************************************************");
            System.out.println("Welcome to the calculator");
            System.out.println("*****************************************************************");
            System.out.println("Please select an option by type the numerical value");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. EMI Calculator");
            System.out.println("6. Quit");
            Scanner menuScan = new Scanner(System.in);
            System.out.println();
            System.out.println("Please choose");
            if(menuScan.hasNextInt());
            menuSelection = menuScan.nextInt();

            switch(menuSelection) {
                case 1:
                    // Addition
                    System.out.println("Addition");
                    Scanner numScanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Whats the first number?");
                    double num1 = numScanner.nextInt();
                    System.out.println("Whats the second number?");
                    Scanner numScanner2 = new Scanner(System.in);
                    double num2 = numScanner2.nextInt();
                    System.out.println("Answer");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    //Subtraction
                    System.out.println("Subtraction");
                    Scanner subScanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Whats the first number?");
                    double sub1 = subScanner.nextInt();
                    System.out.println("Whats the second number?");
                    Scanner subScanner2 = new Scanner(System.in);
                    double sub2 = subScanner2.nextInt();
                    System.out.println("Answer");
                    System.out.println(sub1 - sub2);
                    break;
                case 3:
                    //Multiplication
                    System.out.println("Multiplication");
                    Scanner mulScanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Whats the first number?");
                    double mul1 = mulScanner.nextInt();
                    System.out.println("Whats the second number?");
                    Scanner mulScanner2 = new Scanner(System.in);
                    double mul2 = mulScanner2.nextInt();
                    System.out.println("Answer");
                    System.out.println(mul1 * mul2);
                    break;
                case 4:
                    //Division
                    System.out.println("Division");
                    Scanner divScanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Whats the first number?");
                    double div1 = divScanner.nextInt();
                    System.out.println("Whats the second number?");
                    Scanner divScanner2 = new Scanner(System.in);
                    double div2 = divScanner2.nextInt();
                    System.out.println("Answer");
                    System.out.println(div1 / div2);
                    break;
                case 5:
                    //EMI calc
                    System.out.println("EMI Calculator");
                    Scanner emiScanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("What is the Loan Amount?");
                    double emiP = emiScanner.nextInt();
                    System.out.println("Whats the rate of interest?");
                    Scanner emiScanner2 = new Scanner(System.in);
                    double emiR = emiScanner2.nextInt();
                    System.out.println("Tenure");
                    Scanner emiScanner3 = new Scanner(System.in);
                    double emiN = emiScanner3.nextInt();
                    System.out.println("EMI calculation");
                    System.out.println(emiP * (emiR/100) * ((1 + emiR) * emiN)/(((1+emiR)*emiN) -1));
                    break;
                case 6:
                    //Quit?
                    break;



            }
        }
    }
}
