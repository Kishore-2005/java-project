package com.example.javapro;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.javapro.HelloApplication.reroute;

public class post {

    @FXML
    private Button button;



    @FXML
    private Button button1;

    @FXML
    public void onclick(ActionEvent event)throws IOException {
        reroute(event, "hello-view.fxml", "job portal");
    }

    @FXML
    public void onclick1(ActionEvent event)throws IOException {
        reroute(event, "hello-view.fxml", "job portal");
    }
}
