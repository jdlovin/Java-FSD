package com.jdlovin.Day7;

import com.sun.org.apache.xpath.internal.operations.Bool;

class Calculator2<T>{
    public boolean areEqual(T a, T b){
        if(a.equals(b))
            return true;
        else
            return false;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Calculator2<String> cal = new Calculator2<>();

        cal.areEqual("A","B");

        Calculator2<Integer> cal2 = new Calculator2<>();
        cal2.areEqual(3,3);

        Calculator2<Boolean> cal3 = new Calculator2<>();
        cal3.areEqual(true, true);


    }
}
