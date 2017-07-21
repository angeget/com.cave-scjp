package com.philiphagenbruch.comcave.scjp.p20170721;

import java.util.Random;

public class AufgabeStringSilben {

    private static final Random RAND = new Random();
    private static final String[] SYLLABLES = { "pa", "com", "hi", "phag", "gen", "co", "ca", "au", "ga", "ba", "ing", "il" };

    public static String generateName(final int syllables) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < syllables; i++) {
            sb.append(SYLLABLES[RAND.nextInt(SYLLABLES.length)]);
        }
        return sb.toString();
    }

    public static void main(final String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(generateName(RAND.nextInt(3) + 2));
        }
    }

}
