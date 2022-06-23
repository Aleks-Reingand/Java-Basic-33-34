package com.telran.berlin.practice.variables_2;

public class Variable {


    private int var3;
    public void main1() {
        var3 = 3;
        int var1 = 10;
        System.out.println("main1: " + var1);
        var1 = 8;
        System.out.println(var1);
        System.out.println("var3 = " + var3);
    }

    public void main2() {
        int var = 10;
        System.out.println("main2: " + var);
        var = 3;
        var = 5;
        System.out.println(var);
    }

    public int getVar3() {
        return var3;
    }

    public void setVar3(int var3) {
        this.var3 = var3;
    }
}
