package com.philiphagenbruch.comcave.scjp.p20170725;

import java.util.Random;

public class AufgabeGeometriePolymorphie {

    public static void main(final String[] args) {
        final Random rand = new Random();

        final int c = 100;
        final Shape[] shapes = new Shape[c];

        for (int i = 0; i < c; i++) {
// @formatter:off
            shapes[i] = rand.nextBoolean()
                    ? new Circle(rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10) + 1)
                    : new Rectangle(rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10) + 1);
// @formatter:on
        }

        printSurfaces(shapes);
    }

    public static void printSurfaces(final Shape[] shapes) {
        for (final Shape e : shapes) {
            System.out.println(e.getSurface());
        }
    }

}
