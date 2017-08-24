package com.philiphagenbruch.comcave.scjp.p20170824;

import java.util.Set;
import java.util.TreeSet;

public class AufgabeCoupledCollection {

    static Person[] PERSONS = new Person[] {
            new Person("John", "Doe", 30),
            new Person("John", "Doe", 40),
            new Person("John", "Dewy", 30),
            new Person("John", "Dewy", 40),
            new Person("Jane", "Doe", 30),
            new Person("Jane", "Doe", 40),
            new Person("Jane", "Dewy", 30),
            new Person("Jane", "Dewy", 40)
    };

    public static void main(final String[] args) {

        final TreeSet<Person> tree = new TreeSet<>();

        for (final Person e : PERSONS) {
            tree.add(e);
        }

        System.out.println("Elemente nach Hinzufügen:");
        printSet(tree);

        System.out.println("Headset bis (exkl.) \"Jane, Doe, 30\"");
        final Set<Person> head = tree.headSet(PERSONS[4]);
        printSet(head);

        System.out.println("Tailset ab (inkl.) \"John, Dewy, 30\"");
        final Set<Person> tail = tree.tailSet(PERSONS[2]);
        printSet(tail);

        System.out.println("Subset von (inkl.) \"Jane, Doe, 30\" bis (exkl.) \"John, Doe, 30\"");
        final Set<Person> sub = tree.subSet(PERSONS[4], PERSONS[0]);
        printSet(sub);

        System.out.println("Wenn wir das erste Element jedes Teilsets entfernen...");
        removeFirstElement(head);
        removeFirstElement(tail);
        removeFirstElement(sub);
        System.out.println("... werden auch die Elemente aus dem TreeSet entfernt:");
        printSet(tree);

    }

    private static void printSet(final Set<?> set) {
        for (final Object e : set) {
            System.out.print(" ");
            System.out.println(e);
        }
        System.out.println();
    }

    private static void removeFirstElement(final Set<?> set) {
        Object o = null;
        for (final Object e : set) {
            o = e;
            break;
        }
        set.remove(o);
    }

}
