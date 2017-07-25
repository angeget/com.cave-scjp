package com.philiphagenbruch.comcave.scjp.p20170725;

public class Circle extends Shape {

    private int diameter;

    public Circle(final int diameter, final int posX, final int posY) {
        super(posX, posY);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public double getSurface() {
        return Math.PI * (Math.pow(diameter / 2, 2));
    }

    public void setDiameter(final int diameter) {
        this.diameter = diameter;
    }

}
