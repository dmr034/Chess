package com.example.cg;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class HelloController {
    private HelloController theController;
    private HelloModel theModel;

    @FXML
    private Rectangle BPawn1;

    @FXML
    private Rectangle BPawn2;

    @FXML
    private Rectangle BPawn3;

    @FXML
    private Rectangle BPawn4;

    @FXML
    private Rectangle BPawn5;

    @FXML
    private Rectangle BPawn6;

    @FXML
    private Rectangle BPawn7;

    @FXML
    private Rectangle BPawn8;

    @FXML
    private Rectangle WPawn1;

    @FXML
    private Rectangle WPawn2;

    @FXML
    private Rectangle WPawn3;

    @FXML
    private Rectangle WPawn4;

    @FXML
    private Rectangle WPawn5;

    @FXML
    private Rectangle WPawn6;

    @FXML
    private Rectangle WPawn7;

    @FXML
    private Rectangle WPawn8;

    private ArrayList<BlackPawn> BlackPawns;
    private ArrayList<WhitePawn> WhitePawns;

    public void setTheModel(HelloModel theModel) {
        this.theModel = theModel;



        int i = 0;
        for(BlackPawn blackPawn : theModel.getBlackPawns()) {
            this.BlackPawns.add(blackPawn);
        }
    }

    /*
    When BPawn is clicked, give option to move forward.
    If BPawn is in starting position, then give option to move two spaces forward.
    If BPawn is within killing range of an enemy, allow player to move diagonally
    and take the opponent piece.
     */
    @FXML
    void onBPawn1MouseClicked(MouseEvent event) {
        //BPawn1.getOnMouseClicked(event);
    }

    @FXML
    void onBPawn2MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn3MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn4MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn5MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn6MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn7MouseClicked(MouseEvent event) {

    }

    @FXML
    void onBPawn8MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn1MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn2MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn3MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn4MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn5MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn6MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn7MouseClicked(MouseEvent event) {

    }

    @FXML
    void onWPawn8MouseClicked(MouseEvent event) {

    }


    /*
    Sets the model
     */
    public void setModel(HelloModel chessModel) {
        this.theModel = chessModel;

        BlackPawn BlackPawn1 = new BlackPawn((int)BPawn1.getX(), (int)BPawn1.getY(), this.BPawn1);
        BlackPawn BlackPawn2 = new BlackPawn((int)BPawn2.getX(), (int)BPawn2.getY(), this.BPawn2);
        BlackPawn BlackPawn3 = new BlackPawn((int)BPawn3.getX(), (int)BPawn3.getY(), this.BPawn3);
        BlackPawn BlackPawn4 = new BlackPawn((int)BPawn4.getX(), (int)BPawn4.getY(), this.BPawn4);
        BlackPawn BlackPawn5 = new BlackPawn((int)BPawn5.getX(), (int)BPawn5.getY(), this.BPawn5);
        BlackPawn BlackPawn6 = new BlackPawn((int)BPawn6.getX(), (int)BPawn6.getY(), this.BPawn6);
        BlackPawn BlackPawn7 = new BlackPawn((int)BPawn7.getX(), (int)BPawn7.getY(), this.BPawn7);
        BlackPawn BlackPawn8 = new BlackPawn((int)BPawn8.getX(), (int)BPawn8.getY(), this.BPawn8);


    }
}
