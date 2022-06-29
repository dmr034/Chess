package com.example.cg;

import java.util.ArrayList;

public class HelloModel {
    private HelloController theController;
    private HelloApplication theApplication;

    private ArrayList<BlackPawn> BlackPawns;
    private ArrayList<WhitePawn> WhitePawns;

    public ArrayList<BlackPawn> getBlackPawns() {
        return BlackPawns;
    }

    public void setBlackPawns(ArrayList<BlackPawn> blackPawns) {

        BlackPawns = blackPawns;
    }

    public ArrayList<WhitePawn> getWhitePawns() {
        return WhitePawns;
    }

    public void setWhitePawns(ArrayList<WhitePawn> whitePawns) {
        WhitePawns = whitePawns;
    }

    public boolean checkBPawnInStartLocation(BlackPawn blackPawn) {
        if(blackPawn.isAtStart(blackPawn.xLocation, blackPawn.yLocation)) {
            return false;
        }
        return true;
    }

    public boolean checkWPawnInStartLocation(WhitePawn whitePawn) {
        if(whitePawn.isAtStart != true) {
            return false;
        }
        return true;
    }
}

