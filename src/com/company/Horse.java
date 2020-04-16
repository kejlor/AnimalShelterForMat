package com.company;

public class Horse implements Animal {

    int age;
    String name;

    public Horse(int age, String name) {
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
        return "Prrrrrrr";
    }

    @Override
    public String name() {
        return name;
    }

    public void ride(){
        System.out.println("You can ride a horse and be very fast!");
    }
}
