package com.philiphagenbruch.comcave.scjp.p20170717;

public class AufgabeSwitchIf {

    private static final int ROT = 1;
    private static final int GELB = 2;
    private static final int GRUEN = 3;

    public static void main(String[] args) {

        args = new String[] { "3" };
        final int value = Integer.parseInt(args[0]);

        // switch

        switch (value) {
        case ROT:
            System.out.println("Rot. Bitte warten");
            break;
        case GELB:
            System.out.println("Gelb. Gleich get es los");
            break;
        case GRUEN:
            System.out.println("Gruen. Weg frei");
            break;
        default:
            System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }

        // if-elseif-else

        if (value == ROT) {
            System.out.println("Rot. Bitte warten");
        } else if (value == GELB) {
            System.out.println("Gelb. Gleich get es los");
        } else if (value == GRUEN) {
            System.out.println("Gruen. Weg frei");
        } else {
            System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }

    }

}
