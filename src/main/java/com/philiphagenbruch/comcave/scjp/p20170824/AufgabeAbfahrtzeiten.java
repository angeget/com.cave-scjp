package com.philiphagenbruch.comcave.scjp.p20170824;

import java.util.TreeSet;

public class AufgabeAbfahrtzeiten {

    private static final Time[] TIMES = new Time[] {
            new Time(6, 12), new Time(6, 32), new Time(6, 52),
            new Time(7, 12), new Time(7, 32), new Time(7, 52),
            new Time(8, 12), new Time(8, 32), new Time(8, 52),
            new Time(9, 12), new Time(9, 32), new Time(9, 52),
            new Time(10, 12), new Time(10, 32), new Time(10, 52),
            new Time(11, 12), new Time(11, 32), new Time(11, 52),
            new Time(12, 12), new Time(12, 32), new Time(12, 52),
            new Time(13, 12), new Time(13, 32), new Time(13, 52),
            new Time(14, 12), new Time(14, 32), new Time(14, 52),
            new Time(15, 12), new Time(15, 32), new Time(15, 52),
            new Time(16, 12), new Time(16, 32), new Time(16, 52),
            new Time(17, 12), new Time(17, 32), new Time(17, 52),
            new Time(18, 12), new Time(18, 32), new Time(18, 52),
            new Time(19, 12), new Time(19, 32), new Time(19, 52),
            new Time(20, 12), new Time(20, 32), new Time(20, 52),
            new Time(21, 12), new Time(21, 32), new Time(21, 52),
            new Time(22, 12), new Time(22, 32), new Time(22, 52),
            new Time(23, 12), new Time(23, 32), new Time(23, 52)
    };

    public static void main(final String[] args) {
        final TreeSet<String> times = new TreeSet<>();

        for (final Time e : TIMES) {
            times.add(e.toString());
        }

        System.out.println("Abfahrtzeiten");
        System.out.println(" - erste nach 12:03: " + times.tailSet("12:03").first());
        System.out.println(" - erste vor 12:03: " + times.headSet("12:03").last());
        System.out.println(" - erste nach inkl. 17:12: " + times.tailSet("17:12", true).first());
        System.out.println(" - erste nach exkl. 17:12: " + times.tailSet("17:12", false).first());
        System.out.println(" - zwischen 12:00 und 13:00: " + times.subSet("12:00", false, "13:00", false));
        System.out.println(" - zwischen exkl. 11:52 und inkl. 13:12: " + times.subSet("11:52", false, "13:12", true));
        System.out.println(" - erste: " + times.first());
        System.out.println(" - letzte: " + times.last());
    }

}
