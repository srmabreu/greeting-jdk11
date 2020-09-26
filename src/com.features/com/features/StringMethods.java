package com.features;

import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        // isBlank()
        System.out.println("  ".isBlank());
        // Cause NullPointerException
        String str = null;
        // System.out.println(str.isBlank());

        // lines()
        String str1 = "JD\nJD\nJD";
        System.out.println(str1);
        System.out.println(str1.lines().collect(Collectors.toList()));

        // strip()
        String str2 = " JD ";
        System.out.print("Start");
        System.out.print(str2.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str2.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str2.stripTrailing());
        System.out.println("End");

        // repeat(int)
        String str3 = "=".repeat(3);
        System.out.println(str3);
    }

}
