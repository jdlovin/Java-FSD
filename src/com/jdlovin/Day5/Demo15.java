package com.jdlovin.Day5;

import java.io.File;
import java.io.IOException;

public class Demo15 {
    public static void main(String[] args) {

        File file = new File("mario.txt");
        System.out.println(file.exists());

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.exists());
    }
}
