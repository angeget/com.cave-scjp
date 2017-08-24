package com.philiphagenbruch.comcave.scjp.p20170824;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AufgabeSet {

    static Person[] PERSONS = new Person[] {
            new Person("John", "Doe", 30),
            new Person("John", "Doe", 40),
            new Person("Jane", "Doe", 30),
            new Person("Jane", "Doe", 40)

    };

    public static void main(final String[] args) {
        final Set<Person> personSet = new HashSet<>();

        for (final Person e : PERSONS) {
            personSet.add(e);
            personSet.add(e);
        }

        System.out.println(personSet.size());

        final Set<Person> personTreeSet = new TreeSet<>();

        for (final Person e : personSet) {
            personTreeSet.add(e);
        }

        for (final Person e : personTreeSet) {
            System.out.println(e);
        }

    }

}
