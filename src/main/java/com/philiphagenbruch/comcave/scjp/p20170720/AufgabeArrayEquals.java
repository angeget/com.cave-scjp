package com.philiphagenbruch.comcave.scjp.p20170720;

public class AufgabeArrayEquals {

    private static final int NR_OF_TESTS = 1000000000;

    public static boolean arraysEqualUsingFor(final int[] a1, final int[] a2) {
        if (a1 == null && a2 == null) return true;
        if (a1 == null || a2 == null) return false;
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }

        return true;
    }

    public static boolean arraysEqualUsingWhile(final int[] a1, final int[] a2) {
        if (a1 == null && a2 == null) return true;
        if (a1 == null || a2 == null) return false;
        if (a1.length != a2.length) return false;

        int i = 0;
        while (i < a1.length) {
            if (a1[i] != a2[i]) return false;
            i++;
        }

        return true;
    }

    public static void main(final String[] args) {

        final int[] a1 = { 0, 1, 2, 3, 4 };
        final int[] a2 = { 0, 1, 2, 3, 4 };

        {
            System.out.print("Test for, " + NR_OF_TESTS + " iterations: ");
            final long n = System.currentTimeMillis();
            for (int i = 0; i < NR_OF_TESTS; i++) {
                arraysEqualUsingFor(a1, a2);
            }
            System.out.println(System.currentTimeMillis() - n + " ms");
        }
        {
            System.out.print("Test while, " + NR_OF_TESTS + " iterations: ");
            final long n = System.currentTimeMillis();
            for (int i = 0; i < NR_OF_TESTS; i++) {
                arraysEqualUsingWhile(a1, a2);
            }
            System.out.println(System.currentTimeMillis() - n + " ms");
        }
    }

}
