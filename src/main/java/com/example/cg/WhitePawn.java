package com.example.cg;

import javafx.scene.shape.Rectangle;

public class WhitePawn extends Pawn{
    private Rectangle wPawn;
    private int startRow;
    private int startCol;
    boolean canTake = true;

    public WhitePawn() {
        super();
        startRow = 0;
        startCol = 0;
        wPawn = new Rectangle();
    }

    public WhitePawn(int xLoc, int yLoc, int Rectangle) {
        super(xLoc, yLoc);
        startRow = xLoc;
        startCol = yLoc;
        wPawn = new Rectangle();
    }

    public Rectangle getwPawn() {
        return this.wPawn;
    }

    /**
     * If at starting position, then the pawn can move either forward once,
     * or twice, otherwise only once. Also, if the pawn is in taking position,
     * allow the pawn to attack diagonally.
     * @param xLoc
     * @param yLoc
     */
    public void whitePawnMove(int xLoc, int yLoc) {
        if(isAtStart(xLoc, yLoc)) {
            super.pawnMove(xLoc, yLoc);
        }
        else if(canTake == true) { // create a way that the pawn can move diagonally to take
            super.pawnMove(xLoc, yLoc);
        }
        else {
            super.pawnMove(xLoc, yLoc);
        }
    }

    public boolean isAtStart(int xLoc, int yLoc){
        if(xLoc == startRow && yLoc == startCol) {
            return true;
        }
        return false;
    }

}
