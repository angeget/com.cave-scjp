package com.philiphagenbruch.comcave.scjp.p20170719;

import java.util.Random;

public class AufgabeGeometrie {

    public static void main(final String[] args) {

        final Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(new Rect(rand.nextInt(20) + 1, rand.nextInt(20) + 1).toString());
        }

        System.out.println("\n" + new Circle(5).toString());
    }

}
