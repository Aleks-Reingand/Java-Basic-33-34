package com.telran.berlin.homework.simple_string;


public class SimpleStringMain {
    public static void main(String[] args) {
        /*
        1 Создайте строку через new - I study Basic Java!
        2 Напишите метод, который принимает в качестве параметра строку,
            передайте в этот метод строку, которую создали в п.1
        3 Распечатать последний символ строки. Используем метод String.charAt().
        4 Проверить, содержит ли ваша строка подстроку “Java”.
            Используем метод String.contains().
        5 Заменить все символы “а” на “о”.
        6 Преобразуйте строку к верхнему регистру.
        7 Преобразуйте строку к нижнему регистру.
        8 Вырезать строку Java c помощью метода String.substring().
         */

        String str1 = "str";
        String str = new String("I study Basic Java!");

        printString(str);
        printString(str1);

        System.out.println("last symbol = " + str.charAt(str.length() - 1));
        System.out.println(str.contains("java"));
        System.out.println("replace 'a' to 'o' = " + str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.length() - 5, str.length() - 1));
    }

    public static void printString(String str) {
        System.out.println(str);
    }


}
