package com.example.cg;

import javafx.scene.shape.Rectangle;

public class BlackPawn extends Pawn{
    private Rectangle bPawn; // The pawn
    boolean isAtStart = true;
    boolean canTake = true;

    public BlackPawn() {
        super();
        bPawn = new Rectangle();
    }

    public BlackPawn(int xLoc, int yLoc, int Rectangle) {
        super(xLoc, yLoc);
        bPawn = new Rectangle();
    }

    /**
     * If at starting position, then the pawn can move either forward once,
     * or twice, otherwise only once. Also, if the pawn is in taking position,
     * allow the pawn to attack diagonally.
     * @param xLoc
     * @param yLoc
     */
    public void blackPawnMove(int xLoc, int yLoc) {
        if(isAtStart == true) {
            super.pawnMove(xLoc, yLoc);
            isAtStart = false;
        }
        else if(canTake == true) { // create a way that the pawn can move diagonally to take
            super.pawnMove(xLoc, yLoc);
        }
        else {
            super.pawnMove(xLoc, yLoc);
        }
    }
}
