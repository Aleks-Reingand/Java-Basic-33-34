package com.telran.berlin.practice.casting;

public class Casting {
    public static void main(String[] args) {
//        int a = 5;
//        byte b = (byte) a;

        int i = 100;
        // automatic type conversion
        long l = i;
        // automatic type conversion
        float f = l;


        System.out.println("int value = " + i);
        System.out.println("long value = " + l);
        System.out.println("float value = " + f);

        int a = 5;
        byte b = (byte) a; // -128 -> 127
        System.out.println(b);

        a = 258; // 00000000 00000000 00000001 00000010 -> 00000010
        b = (byte) a;
        System.out.println(b);

        double d = 74.9898;
        int e = (int) d;
        System.out.println(e);

        float d1 = 74.9898f;
        int e1 = Math.round(d1);
        System.out.println(e1);


    }
}
