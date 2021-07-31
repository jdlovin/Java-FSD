package com.jdlovin.Day5;

import java.io.File;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args) {
        File file = new File("db","luigi.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
    }
}
