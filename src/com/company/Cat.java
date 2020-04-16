package com.company;

public class Cat implements Animal {

    int age;
    String name;

    public Cat(int age, String name) {
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
        return "Meow meow";
    }

    @Override
    public String name() {
        return name;
    }
}
