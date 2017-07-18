package com.philiphagenbruch.comcave.scjp.p20170718;

public class AufgabeA3 {

    public static void main(final String[] args) {
        final int x = 3, y = 4;
        int r = 1;
        int i = 0;
        while (i < y) {
            r *= x;
            i++;
        }
        System.out.println(r);
    }

}
