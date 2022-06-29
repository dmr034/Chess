package com.example.cg;

import javafx.scene.shape.Rectangle;

public class BlackPawn extends Pawn{
    private Rectangle bPawn; // The pawn
    private int startRow;
    private int startCol;
    boolean canTake = true;

    public BlackPawn() {
        super();
        startRow = 0;
        startCol = 0;
        bPawn = new Rectangle();
    }

    public BlackPawn(int xLoc, int yLoc, Rectangle thePawn) {
        super(xLoc, yLoc);
        startRow = xLoc;
        startCol = yLoc;
        this.bPawn = thePawn;
    }

    /**
     * If at starting position, then the pawn can move either forward once,
     * or twice, otherwise only once. Also, if the pawn is in taking position,
     * allow the pawn to attack diagonally.
     * @param xLoc
     * @param yLoc
     */
    public void blackPawnMove(int xLoc, int yLoc) {
        super.pawnMove(xLoc, yLoc);
    }

    /**
     * If the pawn is at it's location that it started at, return true
     * @param xLoc
     * @param yLoc
     * @return
     */
    public boolean isAtStart(int xLoc, int yLoc){
        if(xLoc == startRow && yLoc == startCol) {
            return true;
        }
        return false;
    }
}
