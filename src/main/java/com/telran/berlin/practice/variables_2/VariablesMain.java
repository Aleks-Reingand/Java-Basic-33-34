package com.telran.berlin.practice.variables_2;


public class VariablesMain {

    public static int var = 5;
    public int var2 = 5;

    public static void main2() {
        int abc = 3;
        System.out.println("#9 abc: " + abc);
    }

    public void main3() {
        int abc = 3;
        System.out.println("abc: " + abc);
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public static int getVar() {
        return var;
    }
}
