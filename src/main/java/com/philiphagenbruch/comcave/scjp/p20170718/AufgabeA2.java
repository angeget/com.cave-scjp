package com.philiphagenbruch.comcave.scjp.p20170718;

public class AufgabeA2 {

    public static void main(final String[] args) {
        final int x = 3, y = 4;
        int r = 1;
        for (int i = 0; i < y; i++) {
            r *= x;
        }
        System.out.println(r);
    }

}
