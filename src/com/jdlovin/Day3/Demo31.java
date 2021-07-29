package com.jdlovin.Day3;

import java.io.FileOutputStream;

public class Demo31 {
    public static void main(String[] args) {
        // Try block to check for exception
        try (FileOutputStream stream = new FileOutputStream("C:\\Users\\jdlov\\OneDrive\\Desktop\\Revature\\Example\\test.txt")) {
            // custom string input
            String data = "Hello Bob";
            //convert string to bytes
            byte[] arr = data.getBytes();
            //text written in the file
            stream.write(arr);
            //catch block to handle exception
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Resources are closed");
    }
}
