package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Arrays;
import java.util.Collections;

public class AufgabeComparablePerson {

    public static void main(final String[] args) {
        final Person[] persons = new Person[] {
                new Person("Paul", "Smith", 1946),
                new Person("Paul", "Black", 1967),
                new Person("Paul", "Black", 1959),
                new Person("John", "Smith", 1580),
                new Person("John", "Black", 1951),
                new Person("John", "Black", 1967)
        };

        for (final Person p : persons) {
            System.out.println(p);
        }

        System.out.println();

        Arrays.sort(persons);

        for (final Person p : persons) {
            System.out.println(p);
        }

        System.out.println();

        Arrays.sort(persons, Collections.reverseOrder());

        for (final Person p : persons) {
            System.out.println(p);
        }

    }

}
