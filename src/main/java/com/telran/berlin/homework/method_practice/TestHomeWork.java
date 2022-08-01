package com.telran.berlin.homework.method_practice;

import java.text.DecimalFormat;

public class TestHomeWork {
    public static void main(String[] args) {
        MethodHomeWork homeWork = new MethodHomeWork();

        homeWork.concatTwoHalvesOfWord("four", "dour");

        System.out.println(homeWork.calculateTwoNumber(2,2,'+'));

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(homeWork.conversionEuroToUsd(22.3)));

        System.out.println(decimalFormat.format(homeWork.getExtraCalories(28, 24)));
    }
}
