package com.example.javapro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.javapro.HelloApplication.reroute;


public class search {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Label label1;



    @FXML
    private Label label2;

    @FXML
    private Label label3;
    @FXML
    private Label label4;

    @FXML
    public void onclick7(ActionEvent event)throws IOException {
        reroute(event, "hello-view.fxml", "job portal");
    }
    @FXML
    public void onclick6(ActionEvent event)throws IOException {
        welcomeText.setText("TITLE : design engineering");
        label1.setText("DESCRIPTION : need for engineer");
        label2.setText("TITLE : DOCTOR");
        label3.setText("DESCRIPTION : need a doctor");
        label4.setText("TITLE: software engineer");



    }




}
