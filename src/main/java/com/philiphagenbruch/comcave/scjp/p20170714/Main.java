package com.philiphagenbruch.comcave.scjp.p20170714;

public class Main {

    public static void main(final String[] args) {
        System.out.println(Main.class.getPackage().getName());
        System.out.println("\nJava Datentypen");

        for (final Types t : Types.values()) {
            System.out.println("\n" + t.name());
            System.out.println("   Initialwert: " + t.getDefaultValue());
            System.out.println("   Boxing type: " + t.getBoxingType().getName());
        }

    }

}
