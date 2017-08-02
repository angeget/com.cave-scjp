package com.philiphagenbruch.comcave.scjp.p20170801;

import com.philiphagenbruch.comcave.scjp.p20170801.Building.Room;

public class AufgabeInnereKlasse {

    public static void main(final String[] args) {
        final Building building = new Building("Hauptstr.", 45, 3, 10);
        final Room room = building.getRoom(0, 2);
        System.out.println(room);
    }

}
