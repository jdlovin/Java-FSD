package com.jdlovin.Prac2;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Steph", "g@gamil.com");
        Student student2 = new Student(45, "Phil", "phil@gmail.com");

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(student2);
        arrayList.add(student1);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
