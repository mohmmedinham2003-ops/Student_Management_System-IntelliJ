package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btn01;

    @FXML
    private Button btn02;

    @FXML
    private Button btn03;

    @FXML
    private Button btnSubmit;

    @FXML
    void btn01OnAction(ActionEvent event) {
        System.out.println("btn1 clicked");
    }

    @FXML
    void btn02OnAction(ActionEvent event) {
        System.out.println("btn2 clicked");

    }

    @FXML
    void btn03OnAction(ActionEvent event) {
        System.out.println("btn3 clicked");

    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        //

}
