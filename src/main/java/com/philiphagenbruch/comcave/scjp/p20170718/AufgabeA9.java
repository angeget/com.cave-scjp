package com.philiphagenbruch.comcave.scjp.p20170718;

import java.util.Random;

public class AufgabeA9 {

    private static final Random RANDOM = new Random();

    public static void main(final String[] args) {
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            final int min = RANDOM.nextInt();
            printRandom(RANDOM.nextInt(10), min, RANDOM.nextInt(100) + min);
        }
    }

    public static void printRandom(final int repeat, final int min, final int max) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(RANDOM.nextInt(max - min + 1) + min);
        }
    }

}
