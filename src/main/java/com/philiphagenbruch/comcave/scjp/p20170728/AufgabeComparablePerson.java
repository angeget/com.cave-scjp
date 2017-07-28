package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Arrays;
import java.util.Collections;

public class AufgabeComparablePerson {

    public static void main(final String[] args) {
        final Person[] persons = new Person[] {
                new Person("Paul", "Smith"),
                new Person("Paul", "Black"),
                new Person("John", "Smith"),
                new Person("John", "Black"),
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
