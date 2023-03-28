package com.devxschool;

public class Problem5 {
    /**
     * Given a string, print true if the string starts with "hi" and false otherwise.
     * Below are some Strings you can test
     * hint use substring function and if statements
     */
    public static void main(String[] args) {
        String string1 = "Hi";
        String string2 = "This string does not start with Hi";
        String string3 = " Hi";
        String string4 = "Hi123";
        //TODO write program below
        if (string1.startsWith("Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string2.startsWith("This string does not start with Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string3.startsWith(" Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string4.startsWith("Hi12")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
