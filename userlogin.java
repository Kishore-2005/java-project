package com.example.javapro;
import java.util.Scanner;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.lang.String;

import java.io.IOException;

import static com.example.javapro.HelloApplication.reroute;

public class userlogin {
    @FXML
    private Label welcomeText;

    @FXML
    private  Button button3;

    @FXML
    private Button button2;

    @FXML
    private TextField text;

    @FXML
    private PasswordField pass;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onclick2(ActionEvent event)throws IOException {
        reroute(event, "userexit.fxml", "thank you");
    }

    @FXML
    public void onclick3(ActionEvent event)throws IOException {
        reroute(event, "hello-view.fxml", "job portal");
    }






    }









