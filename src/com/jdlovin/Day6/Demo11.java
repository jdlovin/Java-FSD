package com.jdlovin.Day6;

interface MultipleStatements {
    String print (String message);
}

interface AnothaOne {
    String print (String message);
}

public class Demo11 {
    public static void main(String[] args) {
        MultipleStatements statements = (message) -> {
            String str1 = "Statement 1, ";
            String str2 = "Statement 2, ";
            String str3 = "Statement 3";
            return str1 + str2 + str3;
        };

        System.out.println(statements.print("Hello"));

        AnothaOne anothaOne = (message) -> {
            String word = "Anotha One, ";
            String word2 = "and anotha one, ";
            String word3 = "and anotha one";
            return word + word2 + word3;
        };
        System.out.println(anothaOne.print("DJ Khaled"));
    }
}
