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
    }
}
