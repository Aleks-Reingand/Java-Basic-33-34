package com.telran.berlin.prictice;

public class Main {
    public static void main(String[] args) {
        // boolean - Логический тип данных представляет только (true, false) - один бит
        boolean a = false;
        boolean b = true;
        boolean c = true;

        // byte - представляет собой число (-128 to 127) - 8 bits.
        byte age = 2;
        String dogAge = "Dog age = ";

        System.out.println(dogAge + age);

        // short - представляет собой число (-32 768 до 32 767) – 16 bits
        short short1 = 2;

        System.out.println(dogAge + short1);

        // int - представляет собой число (-2147483648 до 2147483647) – 32 bits.
        int int1 = 2;

        System.out.println(dogAge + int1 + " " + age);

        // long – большое целое число (-9223372036854775808 до 9223372036854775807) – 64 bits.
        long long1 = 4444444444444787L;

        // float - число с плавающей запятой (до 7 десятичных цифр) – 32 bits.
        // double - число с плавающей запятой (до 16 десятичных цифр) – 64 bits.

        float float1 = 9.0f;
        double double1 = 2.5;

        float1 = 126;

        // char - символ Unicode (от '\u0000' (0) до '\uffff' (65535)) – 16 bits. ASCII
        char sharick = 'g';
        char f = 'f';
        char L = 'L';
        char one = '1';
        char two = '2';

        Dog myDog = new Dog();
        myDog.setBreed("kolli");

        System.out.println(myDog.getBreed());

    }
}