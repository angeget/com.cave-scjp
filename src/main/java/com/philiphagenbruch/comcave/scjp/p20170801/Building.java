package com.philiphagenbruch.comcave.scjp.p20170801;

import java.util.ArrayList;
import java.util.List;

public class Building {

    public class Floor {

        private final Building building;
        private final int number;
        private final List<Room> rooms;

        public Floor(final Building building, final int number, final int roomCount) {
            this.building = building;
            this.number = number;
            this.rooms = new ArrayList<>(roomCount);

            for (int i = 0; i < roomCount; i++) {
                rooms.add(new Room(this, i));
            }
        }

    }

    public class Room {

        private final Floor floor;
        private final int number;

        public Room(final Floor floor, final int number) {
            this.floor = floor;
            this.number = number;
        }

        @Override
        public String toString() {
            return new StringBuilder("Room ")
                    .append(floor.number).append(".")
                    .append(number).append(" / ")
                    .append(floor.building.street).append(" ")
                    .append(floor.building.houseNumber).toString();
        }

    }

    private final String street;
    private final int houseNumber;
    private final List<Floor> floors;

    public Building(final String street, final int houseNumber, final int floorCount, final int numRoomsPerFloor) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.floors = new ArrayList<>(floorCount);

        for (int i = 0; i < floorCount; i++) {
            floors.add(new Floor(this, i, numRoomsPerFloor));
        }
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Room getRoom(final int floor, final int room) {
        Room r = null;

        try {
            r = floors.get(floor).rooms.get(room);
        } catch (NullPointerException | IndexOutOfBoundsException e) {}

        return r;
    }

    public String getStreet() {
        return street;
    }

}
