package com.philiphagenbruch.comcave.scjp.p20170721;

public class AufgabeStringStringBuilder {

    private static final int ITERATIONS = 1000000;

    @SuppressWarnings("unused")
    public static void main(final String[] args) {
        final String s1 = "Hello";
        final String s2 = " ";
        final String s3 = "Welt";

        long n = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            final String s = s1 + s2 + s3;
        }
        System.out.println("Concat: " + (System.currentTimeMillis() - n) + " ms");

        n = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            final String s = new StringBuilder(s1).append(s2).append(s3).toString();
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - n) + " ms");
    }

}
