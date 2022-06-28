package com.telran.berlin.game.hero;

import com.telran.berlin.game.constant.Constant;

public class Elf {

    private long id;

    private String name;
    private boolean gender;
    private int level;
    private int fortune;

    private int power;

    private int charisma;

    private int magic;

    public Elf() {

    }

    public Elf(long id) {
        this.id = id;
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
    }

    /*public Elf(long id, int power, int charisma, int magic) {
        this.id = id;
        this.power = power;
        this.charisma = charisma;
        this.magic = magic;
    }*/


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }
}
