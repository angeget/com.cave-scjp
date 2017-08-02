package com.philiphagenbruch.comcave.scjp.p20170801;

import com.philiphagenbruch.comcave.scjp.p20170801.Racecar.Driver;

public class AufgabeAuto {

    public static void main(final String[] args) {
        final Racecar rc = new Racecar("Mercedes");
        final Driver dr = rc.new Driver("M.", "Schuhmacher");

        rc.setDriver(dr);

        System.out.println(rc);
        System.out.println(rc.getEngine());
    }

}
