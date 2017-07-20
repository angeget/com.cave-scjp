package com.philiphagenbruch.comcave.scjp.p20170720;

import java.util.Random;

public class AufgabeArrays {

    private static final Random RANDOM = new Random();

    public static int[] createArray(final int min, final int max, final int length) {
        final int[] r = new int[length];
        for (int i = 0; i < r.length; i++) {
            r[i] = RANDOM.nextInt(max - min) + min;
        }
        return r;
    }

    public static void main(final String[] args) {
        final int minBound = 10;
        printArray(
                createArray(RANDOM.nextInt(minBound), RANDOM.nextInt(20) + minBound, RANDOM.nextInt(100)));
    }

    public static void printArray(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
