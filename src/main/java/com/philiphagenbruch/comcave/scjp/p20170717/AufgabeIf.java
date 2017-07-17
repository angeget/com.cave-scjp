package com.philiphagenbruch.comcave.scjp.p20170717;

public class AufgabeIf {

    public static void main(final String[] args) {
        final double d = Math.random();
        System.out.println("Sie haben " + (d < 0.5D ? "verloren" : "gewonnen"));
    }

}
