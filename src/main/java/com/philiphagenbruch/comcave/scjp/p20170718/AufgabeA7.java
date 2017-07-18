package com.philiphagenbruch.comcave.scjp.p20170718;

public class AufgabeA7 {

    public static void main(final String[] args) {
        for (int i = 0; i <= 5; i++) {

            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print((char) ('A' + i - 1));

            }

            for (int j = 0; j <= 5; j++) {
                if (i == 0 && j > 0) {
                    System.out.print(j);
                } else if (i > 0 && j > 0) {
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }

}
