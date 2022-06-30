package com.telran.berlin.practice.scanner;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int number = sc.nextInt();
//        System.out.println("Thank you! You entered a number " + number);
//        System.out.println("Enter the number:");
//        int number2 = sc.nextInt();
//        System.out.println("sum = " + (number + number2));

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Enter the age:");
        int age = 0;

        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("Sorry, but this is wrong format age!");
        }

        System.out.println("Enter the mobile phone: 123456789");
        long phone = sc.nextLong();

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Mobile phone = " + phone);

        sc.close();
    }
}
