package com.philiphagenbruch.comcave.scjp.p20170725;

public class AufgabePolymorphieTiere {

    public static void main(final String[] args) {
        final Cat cat = new Cat("Pussy", 10, false);
        final Dog dog = new Dog("Wussy", 1, true);
        print(cat);
        print(dog);
    }

    public static void print(final Animal animal) {
        System.out.println(animal.getClass().getSimpleName() + ". Name: " + animal.getName());
    }

}
