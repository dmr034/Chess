package com.example.cg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
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

    @FXML
    private GridPane chessBoard;

    @FXML
    private Button startButton;

    private ArrayList<BlackPawn> BlackPawns;
    private ArrayList<WhitePawn> WhitePawns;

    public void setTheModel(HelloModel theModel) {
        this.theModel = theModel;



        int i = 0;
        for(BlackPawn blackPawn : theModel.getBlackPawns()) {
            this.BlackPawns.add(blackPawn);
        }
    }

    /**
     * Sets the Model
     * @param chessModel
     */
    public void setModel(HelloModel chessModel) {
        this.theModel = chessModel;


        chessBoard.setColumnIndex(BPawn1, 0);
        chessBoard.setRowIndex(BPawn1, 1);
        chessBoard.setColumnIndex(BPawn2, 1);
        chessBoard.setRowIndex(BPawn2, 1);
        chessBoard.setColumnIndex(BPawn3, 2);
        chessBoard.setRowIndex(BPawn3, 1);
        chessBoard.setColumnIndex(BPawn4, 3);
        chessBoard.setRowIndex(BPawn4, 1);
        chessBoard.setColumnIndex(BPawn5, 4);
        chessBoard.setRowIndex(BPawn5, 1);
        chessBoard.setColumnIndex(BPawn6, 5);
        chessBoard.setRowIndex(BPawn6, 1);
        chessBoard.setColumnIndex(BPawn7, 6);
        chessBoard.setRowIndex(BPawn7, 1);
        chessBoard.setColumnIndex(BPawn8, 7);
        chessBoard.setRowIndex(BPawn8, 1);

        BlackPawn BlackPawn1 = new BlackPawn(chessBoard.getRowIndex(BPawn1), chessBoard.getColumnIndex(BPawn1), this.BPawn1);
        BlackPawn BlackPawn2 = new BlackPawn(chessBoard.getRowIndex(BPawn2), chessBoard.getColumnIndex(BPawn2), this.BPawn2);
        BlackPawn BlackPawn3 = new BlackPawn(chessBoard.getRowIndex(BPawn3), chessBoard.getColumnIndex(BPawn3), this.BPawn3);
        BlackPawn BlackPawn4 = new BlackPawn(chessBoard.getRowIndex(BPawn4), chessBoard.getColumnIndex(BPawn4), this.BPawn4);
        BlackPawn BlackPawn5 = new BlackPawn(chessBoard.getRowIndex(BPawn5), chessBoard.getColumnIndex(BPawn1), this.BPawn5);
        BlackPawn BlackPawn6 = new BlackPawn(chessBoard.getRowIndex(BPawn6), chessBoard.getColumnIndex(BPawn1), this.BPawn6);
        BlackPawn BlackPawn7 = new BlackPawn(chessBoard.getRowIndex(BPawn7), chessBoard.getColumnIndex(BPawn1), this.BPawn7);
        BlackPawn BlackPawn8 = new BlackPawn(chessBoard.getRowIndex(BPawn8), chessBoard.getColumnIndex(BPawn1), this.BPawn8);

        this.BPawn1.setOnMouseClicked(event -> {
            // check for enemy diagonally up to left and right set canTake to true
            // highlight a box
            System.out.println("BPAWN1 was clicked");
            if (BlackPawn1.isAtStart(chessBoard.getRowIndex(BPawn1), chessBoard.getColumnIndex(BPawn1)) == true) {
                System.out.println(BlackPawn1.xLocation + "," + BlackPawn1.yLocation);
                BlackPawn1.blackPawnMove(chessBoard.getRowIndex(BPawn1)+2, chessBoard.getColumnIndex(BPawn1));
                System.out.println(BlackPawn1.xLocation + "," + BlackPawn1.yLocation);
            }
            else {
                BlackPawn1.blackPawnMove(chessBoard.getRowIndex(BPawn1)+1, chessBoard.getColumnIndex(BPawn1));
            }
        });

    }
}
