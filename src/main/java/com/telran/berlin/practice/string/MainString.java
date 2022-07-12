package com.telran.berlin.practice.string;

import com.telran.berlin.game.hero.Elf;

public class MainString {
    public static void main(String[] args) {

        int sum1 = sum(2, 2); // 2 + 2
        int sum2 = sum(3, 3); // 3 + 3

        double d = 4.5;
        Double f = 4.5;

        int n = 3;
        Integer num = 3;

//        test(n);

        String name;
        Elf hero;


        name = "Aleks"; // create new String


        hero = new Elf();

//        System.out.println(hero);


//        System.out.println(elf2);


        String str1 = "str1";
        String str2 = str1;
        str2 = "r";
        str1.charAt(0);

        runCharAtMethod();
        runSubstringMethod();


        String s1 = "abc";
        String s2 = "abc";

        if (s1 == s2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        Elf elf2 = new Elf();
        elf2.setName("elf");

        Elf elf3 = new Elf();
        elf3.setName("elf");

        if (elf2 == elf3) {
            System.out.println("YES elf");
        } else {
            System.out.println("NO elf");
        }

        String s3 = new String("abc");
        String s4 = new String("abc");

        if (s3 == s4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if (s3.equals(s4)) {
            System.out.println("YES equals");
        } else {
            System.out.println("NO equals");
        }

        String number = "12";
        System.out.println("number = " + (number + 1));
        int intNum = Integer.parseInt(number);
        int res = intNum + 1;
        System.out.println("int resunt = " + res);
        String strRes = String.valueOf(res);
        System.out.println(strRes);

        String strRes2 = Integer.toString(res);

        if (strRes == strRes2) {
            System.out.println("YES res");
        } else {
            System.out.println("NO res");
        }

        if (strRes.equals(strRes2)) {
            System.out.println("YES res equals");
        } else {
            System.out.println("NO res equals");
        }

    }

    private static void runSubstringMethod() {
        String s1 = "telran I study here";
        System.out.println(s1.substring(2, 4));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(6, 10));
        System.out.println(s1.substring(0, 3));

        System.out.println(s1.length());

        int length = s1.length(); // count length for string
        System.out.println(s1.substring(length-3, length));
    }

    private static void runCharAtMethod() {
        String cat = "Myrka";
        String friend = cat + " my friend";
        System.out.println(friend);
        System.out.println(cat.charAt(0));
        System.out.println(cat);

        String dog = new String("dog");
        int length = cat.length();
        System.out.println("length str = " + length);

        System.out.println(cat.charAt(4));
    }

    public static void test(int l) {
        // created new int l = 3;
        int l2 = l;
        System.out.println(l2);
    }

    public static void test(float l) {
        // created new int l = 3;
        System.out.println(l);
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
