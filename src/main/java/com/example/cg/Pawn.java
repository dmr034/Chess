package com.example.cg;

public class Pawn {
    protected int xLocation;
    protected int yLocation;

    public Pawn() {
        this.xLocation = 0;
        this.yLocation = 0;
    }

    public Pawn(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public void updateLocation(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public int getxLocation() {
        return this.xLocation;
    }

    public int getyLocation() {
        return this.yLocation;
    }

    /**
     * Update the location so the pawn can move.
     * @param xLocation
     * @param yLocation
     */
    public void pawnMove(int xLocation, int yLocation) {
        updateLocation(xLocation, yLocation);
    }
}
