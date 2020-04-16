package com.company;

import java.util.*;

public class AnimalShelter {

    public static void main(String[] args) {
//	schronisko dla zwierzat;
//	interfejs/klasa abstrakcyjna zwierze;
//	podklasy np. pies, kot, kon, krowa;
//	zdefiniowac ten interfejs, ktory bedzie implementowany przez zwierzeta;
//	metoda na interfejsie, cecha wspolna dla wszystkich zwierzat;
//	zrobic liste tych zwierzat;
//	i jakies operacje na tej liscie;
//	np. wypisanie typu zwierzecia, wywolanie metod w tym interfejsie;
//	zwierze ma wiek, napisac metode ktora pogrupuje zwierzeta wzgledem wieku;
//	Map<wiek, List<Zwierze>>;

    Animal dog = new Dog(1, "Max");
    Animal anotherDog = new Dog(3, "Leo");
    Animal cat = new Cat(5, "Katz");
    Animal horse = new Horse(10, "Hosea");
    Animal cow = new Cow(15, "Mjolk");

    System.out.println(dog.sound());

    Cow anotherCow = new Cow(11, "Mjolker");
    anotherCow.milkCow();

    List<Animal> animalList = new LinkedList<>();

    animalList.add(dog);
    animalList.add(anotherDog);
    animalList.add(cat);
    animalList.add(horse);
    animalList.add(cow);
    animalList.remove(cow);
    animalList.add(anotherCow);

        TreeMap<Integer, String> sortedAnimalListByAge = new TreeMap<>();
        sortedAnimalListByAge.put(dog.age(), dog.name());
        sortedAnimalListByAge.put(anotherDog.age(), anotherDog.name());
        sortedAnimalListByAge.put(cat.age(), cat.name());
        sortedAnimalListByAge.put(horse.age(), horse.name());
        sortedAnimalListByAge.put(cow.age(), cow.name());
        sortedAnimalListByAge.put(anotherCow.age(), anotherCow.name());

        Set<Map.Entry<Integer, String>> entries = sortedAnimalListByAge.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
