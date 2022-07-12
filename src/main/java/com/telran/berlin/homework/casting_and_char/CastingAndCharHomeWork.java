package com.telran.berlin.homework.casting_and_char;

import java.util.Scanner;

public class CastingAndCharHomeWork {
    public static void main(String[] args) {
        double count = 3.9;
        String cups = "cups";

        // 1. Выведите на экран строку "3 cups", полученную из числа 3.9 и строки "cups", используя преобразования типов, и конкатенацию.
        System.out.println((int) count + " " + cups);

        // 2. Выведите на экран строку "4 cups", полученную из числа 3.9 и строки "cups", используя округление, и конкатенацию.
        System.out.println(Math.round(count) + " " + cups);

        // 3. Используя переменные только типа данных char вывести в консоль "Hello Aleks" (в треугольных скобках должно быть ваше имя)
        char space = ' ';
        char h = 'h';
        char o = 'o';
        char a = 'a';
        char l = 'l';
        char e = 'e';
        char k = 'k';
        char s = 's';
        System.out.println("" + Character.toUpperCase(h) + e + l + l + o + space + Character.toUpperCase(a) + l + e + k + s);

        /* 4. Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки, и брала только те, в которых ровно M орешков.
              Также известно, что для пропитания зимой ей необходимо не менее K орешков. Определите, хватит ли на зиму орешков белочке.
              Используйте Scanner для ввода N, M, K. Используйте if-else для вывода: если хватит на зиму, то выведите в консоль YES, иначе NO.
              пример: N = 3, M = 2, K = 1 - вывод YES; N = 4, M = 5, K = 21 - вывод NO;
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of cones:");
        int cones = scanner.nextInt();

        System.out.print("enter the number of nuts: ");
        int nuts = scanner.nextInt();

        System.out.print("enter the number of nuts for the winter: ");
        int winterCones = scanner.nextInt();

        scanner.close();

        int result = cones * nuts;
        if (result >= winterCones) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /* 5. Напишите метод, который принимает в качестве параметра любую строку. Выведите в консоль первый символ из этой строки.
            Используйте <строка из параметра>.charAt(0);
            String str = "Roman";
            firstCharInString(str);
         */

        String str = "any string";
        getFirstLetter(str);
    }

    public static void getFirstLetter(String str) {
        System.out.println(str.charAt(0));
    }
}
