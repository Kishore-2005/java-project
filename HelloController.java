package com.example.javapro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.javapro.HelloApplication.reroute;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button;



    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button button4;

    @FXML
    public void onclick(ActionEvent event)throws IOException {
        reroute(event, "exit.fxml", "thank you");
    }

    @FXML
    public void onclick1(ActionEvent event)throws IOException {
        reroute(event, "userlogin.fxml", "welcome");
    }

    @FXML
    public void onclick4(ActionEvent event)throws IOException {
        reroute(event, "searchjobs.fxml", "looking for job");
    }

    @FXML
    public void onclick2(ActionEvent event)throws IOException {
        reroute(event, "post.fxml", "looking for job");
    }

}