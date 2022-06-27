package com.example.cg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private HelloController chessController;

    private HelloModel chessModel;
    @Override
    public void start(Stage stage) throws IOException {
        this.chessController = new HelloController();
        this.chessModel = new HelloModel();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Chess");
        stage.setScene(scene);
        stage.show();


        this.chessController = fxmlLoader.getController();
        this.chessController.setModel(this.chessModel);
        //this.chessController.onBPawn1MouseClicked(event -> {

        //}
    }

    public static void main(String[] args) {
        launch();
    }
}