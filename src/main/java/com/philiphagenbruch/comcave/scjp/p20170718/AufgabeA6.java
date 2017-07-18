package com.philiphagenbruch.comcave.scjp.p20170718;

public class AufgabeA6 {

    public static void main(final String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(
                        (i == 0 || i == 4 || j == 0 || j == 4) ? "*" : " ");
            }
            System.out.println();
        }
    }

}
