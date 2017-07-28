package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Arrays;

public class AufgabeSortierenAutos {

    public static void main(final String[] args) {
        final Car[] cars = new Car[] {
                new Car("Lada", "Taiga", 2005),
                new Car("Trabant", "P 601", 1964),
                new Car("Audi", "A3", 1970)
        };

        Arrays.sort(cars, new CarComparator());

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

}
