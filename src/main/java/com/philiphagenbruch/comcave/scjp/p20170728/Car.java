package com.philiphagenbruch.comcave.scjp.p20170728;

public class Car {

    private String manufacturer;
    private String model;
    private int year;

    public Car(final String manufacturer, final String model, final int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + "]";
    }

}
