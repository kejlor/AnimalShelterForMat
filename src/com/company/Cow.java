package com.company;

public class Cow implements Animal {

    int age;
    String name;

    public Cow(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String sound() {
        return "Mooooooooooooo";
    }

    @Override
    public String name() {
        return name;
    }

    public void milkCow() {
        System.out.println("You are milking cow now!");
    }
}
