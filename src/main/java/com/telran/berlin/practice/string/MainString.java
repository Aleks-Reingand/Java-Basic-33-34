package com.telran.berlin.practice.string;

import com.telran.berlin.game.hero.Elf;

public class MainString {
    public static void main(String[] args) {

        double d = 4.5;
        Double f = 4.5;

        int n = 3;
        Integer num = 3;

        test(n);

        String name;
        Elf hero;


        name = "Aleks"; // create new String


        hero = new Elf();

        System.out.println(hero);

        Elf elf2 = new Elf();



        System.out.println(elf2);


        String str1 = "str1";
        String str2 = str1;
        str2 = "r";
        str1.charAt(0);




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
}
