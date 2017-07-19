package com.philiphagenbruch.comcave.scjp.p20170719;

public class Rect {

    private int width;
    private int height;

    public Rect() {}

    public Rect(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + width + " " + height;
    }

}
