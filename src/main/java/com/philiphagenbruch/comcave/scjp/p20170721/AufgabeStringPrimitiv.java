package com.philiphagenbruch.comcave.scjp.p20170721;

public class AufgabeStringPrimitiv {

    public static void main(final String[] args) {
        final char[] s = "Java ist toll".toCharArray();
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }

}
