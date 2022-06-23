package com.telran.berlin.practice.variables_2;

import com.telran.berlin.practice.introduction_1.Dog;

public class Main {
    public static void main(String[] args) {
        VariablesMain.main2();
        System.out.println("static var = " + VariablesMain.getVar());
        VariablesMain.var = 15;

        VariablesMain variable1 = new VariablesMain();
        variable1.setVar2(3);
        System.out.println(variable1.getVar2());

        VariablesMain variable2 = new VariablesMain();
        System.out.println(variable2.getVar2());

        System.out.println("static var = " + VariablesMain.getVar());


        Dog dog = new Dog();
        dog.setAge(Util.age);
        dog.setName(Util.name);

        Dog dog1 = new Dog();
        dog1.setAge(Util.age);
        dog1.setName(Util.name);


    }
}
