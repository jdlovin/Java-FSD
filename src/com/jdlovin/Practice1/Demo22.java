package com.jdlovin.Practice1;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public boolean benefits;

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee extends Employee{
    public int annualSalary;
}

class PartTimeEmployee extends Employee{
    public int hourlyPay;
}

public class Demo22 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.annualSalary = 50_000;
        fte.firstName = "Phil";
        fte.lastName = "Kessel";
        fte.benefits = true;

        fte.getFullName();

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.benefits = false;
        pte.firstName = "Lil";
        pte.lastName = "Wayne";

        pte.getFullName();

    }
}
