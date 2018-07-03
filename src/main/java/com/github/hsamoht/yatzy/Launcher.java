package com.github.hsamoht.yatzy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main entry point of the application
 */
public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));

        Scene scene = new Scene(root);

        stage.getIcons().add(new Image("yatzy/icons/app_icon64x64.png"));

        stage.setTitle("Yatzy!");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);
    }
}
