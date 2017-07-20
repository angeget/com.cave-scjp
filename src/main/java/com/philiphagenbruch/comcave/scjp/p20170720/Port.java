package com.philiphagenbruch.comcave.scjp.p20170720;

public class Port {

    public static class Ship {}

    private Ship[] ships = new Ship[100];

    public Ship depart(final int dock) {
        final Ship r = ships[dock];
        ships[dock] = null;
        return r;
    }

    public int docksFree() {
        int r = ships.length;
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] != null) {
                r--;
            }
        }
        return r;
    }

    public void land(final int dock, final Ship ship) {
        if (ships[dock] == null) {
            ships[dock] = ship;
        }
    }

    @Override
    public String toString() {
        return "Port: " + docksFree() + "/" + ships.length + " docks available";
    }

}
