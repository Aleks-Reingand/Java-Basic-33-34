package com.telran.berlin.practice.introduction_1;

import com.telran.berlin.practice.variables_2.VariablesMain;

public class Dog {

    private long id;

    private String breed;
    private int age;
    private String name;

    public long getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = VariablesMain.getVar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
