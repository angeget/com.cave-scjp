package com.philiphagenbruch.comcave.scjp.p20170725;

public abstract class Shape {

    private int posX;
    private int posY;

    public Shape(final int posX, final int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public abstract double getSurface();

    public void move(final int posX, final int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void setPosX(final int posX) {
        this.posX = posX;
    }

    public void setPosY(final int posY) {
        this.posY = posY;
    }

}
