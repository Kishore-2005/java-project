package com.example.javapro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("job portal");
        stage.setScene(scene);
        stage.show();
    }

    public static void reroute(final ActionEvent event, final String path, final String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(path));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        try {
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }



    public static void main(String[] args) {
        launch();
    }
}