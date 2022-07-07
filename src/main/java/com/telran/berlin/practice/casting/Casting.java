package com.telran.berlin.practice.casting;

import com.telran.berlin.game.constant.Constant;

public class Casting {
    public static void main(String[] args) {
//        int a = 5;
//        byte b = (byte) a;

//        int i = 100;
//        // automatic type conversion
//        long l = i;
//        // automatic type conversion
//        float f = l;
//
//
//        System.out.println("int value = " + i);
//        System.out.println("long value = " + l);
//        System.out.println("float value = " + f);
//
//        int a = 5;
//        byte b = (byte) a; // -128 -> 127
//        System.out.println(b);
//
//        a = 258; // 00000000 00000000 00000001 00000010 -> 00000010
//        b = (byte) a;
//        System.out.println(b);
//
//        double d = 74.9898;
//        int e = (int) d;
//        System.out.println(e);
//
//        float d1 = 74.9898f;
//        int e1 = Math.round(d1);
//        System.out.println(e1);

//        int a = 3;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println("double = " + c);
//
//        int s = 3;
//        float f = 4.7f;
//        float res = s + f;
//        System.out.println("float = " + res);
//
//        float w = 5.6f;
//        double g = 3.5;
//        double h = w + g;
//        System.out.println("float -> double = " + h);
//
//        int r = 7;
//        long l = 10;
//        long j = r + l;
//        System.out.println("long = " + j);
//
//        int k = 6;
//        float fg = 45.3f;
//        long df = 5;
//        double ty = 4.5;
//        double de = k + fg + df + ty;
//
//        byte rt = 34;
//        byte st = 67;
//        int sg = rt + st;

        char a = 'a';
        String b = "a";

        int c = a + 5;
        System.out.println("char = " + c);

        char ch = '9'; // dec = 51, hex = 33, oct = .., bin = 00
        System.out.println("char value = " + ch);

        int num = 3; // dec = 3, hex = .., oct = .., bin = 00

//        byte rt = 34;
//        byte st = 67;
//        int sg = rt + st;

        int f = '3' - '1'; // 51 - 48
        System.out.println("int value = " + f);

        // valueOf()
        int r = Integer.parseInt(String.valueOf(ch));
        System.out.println("int value from method valueOf() = " + r);

        double v = Double.parseDouble("2.5");
        System.out.println(v);
        System.out.println("2.5");

        int e = Character.getNumericValue(ch);
        System.out.println("int value from method getNumericValue() = " + e);


        String str = "3";
        System.out.println(str);

    }
}
