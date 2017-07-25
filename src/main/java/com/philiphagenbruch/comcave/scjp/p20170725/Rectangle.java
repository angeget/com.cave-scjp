package com.philiphagenbruch.comcave.scjp.p20170725;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(final int width, final int height, final int posX, final int posY) {
        super(posX, posY);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getSurface() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

}
