package com.telran.berlin.homework.method_practice;

public class MethodHomeWork {
    /*
    - enter 2 words, use a scanner consisting of an even number of letters (check for the number of letters in the word).
    Get a word consisting of the first half of the first word and the second half of the second word. print to console.

    - Implement the program that prints to screen the results of addition, subtraction, multiplication and division of two numbers.
    Each of the arithmetic operations should be implemented as a separate method.

    - implement the method that convert the given amount in EUR to amount in USD

    - * Write a program that calculates how many extra calories there will be if you’ll buy a pizza with a diameter of 28 cm instead of a pizza with a diameter of 24 cm.
    To solve this, let's assume that each square centimeter of pizza is 40 calories.
     */

    public void concatTwoHalvesOfWord(String wordOne, String wordTwo) {
        if (wordOne.length() % 2 != 0) {
            System.out.println("The first word is wrong length, read the rules!");
            return;
        }
        if (wordTwo.length() % 2 != 0) {
            System.out.println("The second word is wrong length, read the rules!");
            return;
        }
        // TODO Aleks duplicate code, move the length check to a separate method

        System.out.println(wordOne.substring(0, wordOne.length() / 2) + wordTwo.substring(wordTwo.length() / 2));
    }

    public int calculateTwoNumber(int num1, int num2, char mathOperation) {
        if (mathOperation == '+') {
            return addition(num1, num2);
        }
        if (mathOperation == '-') {
            return subtraction(num1, num2);
        }
        if (mathOperation == '*') {
            return multiplication(num1, num2);
        }
        if (mathOperation == '/') {
            return division(num1, num2);
        } else {
            System.out.println("Error: did not recognize the mathematical operation");
            return -1;
        }
    }

    public static final String USD = "usd"; // this is an example, you need to define a constant from above in your class

    public double conversionEuroToUsd(double amount) {
        double exchange = getExchange(USD);
        return amount * exchange;
    }

    public static final double CALORIES_PER_SQUARE_CENTIMETER = 40; // this is an example, you need to define a constant from above in your class
    public double getExtraCalories(int pizza1, int pizza2) {
        // S=PI*r^2
        // S=PI*d^2/4
        // S=L^2/(PI*4)
        return (Math.pow(pizza1 / 2, 2) * Math.PI - (Math.pow(pizza2 / 2, 2) * Math.PI)) * CALORIES_PER_SQUARE_CENTIMETER;
    }


    // TODO Aleks create a class of Utilities and a helper methods implement in it.

    private double getExchange(String currency) {
        double exchange = 0.0;
        if (currency.equals("usd")) {
            // go to DB or service
            exchange = 1.03;
        }

        return exchange;
    }

    private int addition(int num1, int num2) {
        return num1 + num2;
    }

    private int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    private int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    private int division(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Can't divide by '0'");
            return -1;
        }
    }

}
