package com.jdlovin.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args) throws IOException {
        //it will first check do we have a file by this name
        //or it will create a new file
        FileWriter fw = new FileWriter("paper_mario64.txt",true);
        fw.write(100);
        fw.write("Hello there");
        fw.write("\n");
        char[] c1 = {'a','b','c'};
        fw.write(c1);

        fw.flush();
        fw.close();


    }
}
