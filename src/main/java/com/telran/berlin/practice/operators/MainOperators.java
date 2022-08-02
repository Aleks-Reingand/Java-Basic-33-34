package com.telran.berlin.practice.operators;

public class MainOperators {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        int var3 = 5;

        System.out.println("var1 == var2 " + (var1 == var2));
        System.out.println("var1 == var3 " + (var1 == var3));

        System.out.println("var1 != var2 " + (var1 != var2));
        System.out.println("var1 != var3 " + (var1 != var3));

        System.out.println("var1 > var2 " + (var1 > var2));
        System.out.println("var1 < var2 " + (var1 < var2));

        System.out.println("var1 >= var2 " + (var1 >= var2)); // 5 > 10 or 5 == 10
        System.out.println("var1 <= var2 " + (var1 <= var2)); // 5 < 10 or 5 == 10

        int a = 1;
        int b = 2;
        int c = 5;

        if ((a < b) && (b == c)) { // 1 < 2 = true AND 2 == 5 = false
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
