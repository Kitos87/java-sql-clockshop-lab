package com.example.visualjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Watch Shop");
        stage.setScene(scene);
        stage.show();
        fxmlLoader.<HelloController>getController().event(BModel.build());
    }
    public static void main(String[] args) {
        launch();
    }
}