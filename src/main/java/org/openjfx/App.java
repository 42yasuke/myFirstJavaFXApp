package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private static int HEIGHT = 600;
    private static int WEIGHT = 800;

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPaneRoot = FXMLLoader.load(getClass().getResource("Layout.fxml"));

        stage.setTitle("My first JavaFX app");

        scene = new Scene(borderPaneRoot, WEIGHT, HEIGHT);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}