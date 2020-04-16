package com.company;

public class Dog implements Animal {

    int age;
    String name;

    public Dog(int age, String name) {
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
        return "Woof woof";
    }

    @Override
    public String name() {
        return name;
    }
}
