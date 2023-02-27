package com.example.countries_5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class HelloController {
// grouping toggled buttons
    @FXML
    private ToggleGroup group;
// assigning buttons names
    @FXML
    private ToggleButton germanyB;
    @FXML
    private ToggleButton indiaB;
    @FXML
    private ToggleButton lesothoB;
    @FXML
    private ToggleButton russiaB;
    @FXML
    private ToggleButton yemenB;
    @FXML
    private ToggleButton clearB;
// assigning HBox names
    @FXML
    private HBox color1;
    @FXML
    private HBox color2;
    @FXML
    private HBox color3;

// creating methods for each button
    @FXML
    void ls(ActionEvent event) {
        if (event.getSource().equals(lesothoB)){
            color1.setStyle("-fx-background-color: BLUE");
            color2.setStyle("-fx-background-color: WHITE");
            color3.setStyle("-fx-background-color: GREEN");
            label.setText("LESOTHO");
            label.setAlignment(Pos.CENTER);
        }
    }
    @FXML
    void in(ActionEvent event) {
        if (event.getSource().equals(indiaB)) {
            color1.setStyle("-fx-background-color: ORANGE");
            color2.setStyle("-fx-background-color: WHITE");
            color3.setStyle("-fx-background-color: GREEN");
            label.setText("INDIA");
            label.setAlignment(Pos.CENTER);
        }
    }
    @FXML
    void ge(ActionEvent event) {
        if (event.getSource().equals(germanyB)) {
            color1.setStyle("-fx-background-color: BLACK");
            color2.setStyle("-fx-background-color: RED");
            color3.setStyle("-fx-background-color: ORANGE");
            label.setText("GERMANY");
            label.setAlignment(Pos.CENTER);
        }
    }
    @FXML
    void ru(ActionEvent event) {
        if (event.getSource().equals(russiaB)) {
            color1.setStyle("-fx-background-color: WHITE");
            color2.setStyle("-fx-background-color: BLUE");
            color3.setStyle("-fx-background-color: RED");
            label.setText("RUSSIA");
            label.setAlignment(Pos.CENTER);
        }
    }
    @FXML
    void ye(ActionEvent event) {
        if (event.getSource().equals(yemenB)) {
            color1.setStyle("-fx-background-color: RED");
            color2.setStyle("-fx-background-color: WHITE");
            color3.setStyle("-fx-background-color: BLACK");
            label.setText("YEMEN");
            label.setAlignment(Pos.CENTER);
        }
    }
    @FXML
    void cl(ActionEvent event) {
        if (event.getSource().equals(clearB)){
            color1.setStyle("-fx-background-color: white");
            color2.setStyle("-fx-background-color: white");
            color3.setStyle("-fx-background-color: white");
            label.setText("");
        }
    }
    @FXML
    private Label label;
}