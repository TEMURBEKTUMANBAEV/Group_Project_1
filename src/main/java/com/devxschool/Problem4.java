package com.devxschool;

public class Problem4 {
    public static void main(String[] args) {
        /**
         *  TypeCasting
         *  You are given a double
         *  Your task is to store this value inside an integer and print the integer out
         *
         *  For reference:
         *  https://www.w3schools.com/java/java_type_casting.asp
         */
        double myDouble = 24.0001;
        System.out.println(myDouble);
        //TODO convert double to int
        int myInt = (int) myDouble; // type cast double to int
        System.out.println(myInt); // print the integer value
    }
}
