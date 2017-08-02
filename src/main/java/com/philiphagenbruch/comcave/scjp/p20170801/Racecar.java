package com.philiphagenbruch.comcave.scjp.p20170801;

public class Racecar {

    public class Driver {

        private final String firstName;
        private final String lastName;

        public Driver(final String firstName, final String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }

    }

    public class Engine {

        private final Racecar racecar;
        private final String type;

        public Engine(final Racecar racecar, final String type) {
            this.racecar = racecar;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Motor " + type + " in car " + racecar.manufacturer;
        }

    }

    private final String manufacturer;

    private Driver driver;
    private Engine engine;

    public Racecar(final String manufacturer) {
        this.manufacturer = manufacturer;
        this.engine = new Engine(this, "Type1");
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setDriver(final Driver driver) {
        this.driver = driver;
    }

    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Racecar " + manufacturer + ", driver " + driver;
    }

}
