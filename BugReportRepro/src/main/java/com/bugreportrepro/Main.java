package com.bugreportrepro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Test.fxml")));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Bug Report!");
            primaryStage.setResizable(false);
            primaryStage.setMaximized(false);
            primaryStage.setWidth(1300);
            primaryStage.setHeight(800);
            primaryStage.setX(250);
            primaryStage.setY(150);
            primaryStage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main() {
        launch();
    }
}