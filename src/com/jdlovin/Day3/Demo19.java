package com.jdlovin.Day3;

import java.util.EmptyStackException;

class EmployeeException extends Exception {

}

public class Demo19 {
    public static void main(String[] args) throws EmployeeException { //have to pass on the exception class
    throw new EmployeeException();
    }
}
