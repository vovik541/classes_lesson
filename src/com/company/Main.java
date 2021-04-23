package com.company;

import java.util.Random;

public class Main {

    //OOP
    static void main(String[] args) throws Exception {
        Random random = new Random();
        random.nextInt();

        System.out.println("Animal:");
        Animal animal = new Animal();
        animal.saySomething();
        System.out.println(animal.getWeight());

        System.out.println("Dog:");
        Dog dog = new Dog();
        dog.saySomething();
        System.out.println(dog.getWeight());

        System.out.println("Cat:");
        Cat cat = new Cat();
        cat.saySomething();
        System.out.println(cat.getWeight());
        System.out.println(cat.getUniverseAge());

    }
}