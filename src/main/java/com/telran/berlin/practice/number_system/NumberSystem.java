package com.telran.berlin.practice.number_system;

import java.util.logging.Logger;

public class NumberSystem {
    public static void main(String[] args) {
        int a = 0b11110100; // binary format prefix 0b...... (0-1)
        int b = 0364; // okto format prefix 0..... (0-7)
        int c = 244; // decimal format (0-9)
        int d = 0xF4; // hex format prefix 0x...... (0-9,A,B,C,D,E,F)
        long g = 0x2147483647L;

//        String s = "0x141D12";

        // char , double, long, float, short
        // 123
        // byte = -127 +128

        // int = -2147483648 +2147483647

        // 2147483647

//        String s1 = Integer.toHexString(c);
//        System.out.println("int to hex = " + Integer.toHexString(0b11));
//        System.out.println("int to hex = " + Integer.toHexString(b));


        System.out.println("Binary = " + a);
        System.out.println("Okto = " + b);
        System.out.println("Decimal = " + c);
        System.out.println("Hex = " + d);
        System.out.println("String hex = " + g);
    }
}
