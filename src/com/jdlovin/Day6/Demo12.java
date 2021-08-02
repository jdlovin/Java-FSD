package com.jdlovin.Day6;

import java.util.ArrayList;
import java.util.Collections;

class Customer {
    public int id;
    public String name;
    public int age;

    public Customer(int id, String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo12 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(2, "Phil", 20));
        customers.add(new Customer(1, "Bob", 41));
        customers.add(new Customer(3, "Sarah", 94));

        System.out.println("before sorting...");
        for(Customer customer: customers){
            System.out.println(customer);
        }

        Collections.sort(customers, (c2, c3) -> {
            return c2.name.compareTo(c3.name);
        });
        System.out.println("After sorting...");
        for(Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
