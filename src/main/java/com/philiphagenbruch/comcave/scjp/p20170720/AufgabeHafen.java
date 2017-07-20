package com.philiphagenbruch.comcave.scjp.p20170720;

public class AufgabeHafen {

    public static void main(final String[] args) {
        final Port port = new Port();

        for (int i = 0; i < 12; i++) {
            port.land(i, new Port.Ship());
        }

        System.out.println(port);
    }

}
