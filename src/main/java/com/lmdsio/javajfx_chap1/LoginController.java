package com.lmdsio.javajfx_chap1;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    private Label loginText;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    protected void onLoginButtonClick() {
        String login = loginField.getText();
        String password = passwordField.getText();
        if (!password.equals("mdp")) {
            loginText.setText("Identifiants incorrects");
            loginText.setStyle("-fx-text-fill: red");
        } else {
            loginText.setText("Veuillez saisir vos identifiants");
            loginText.setStyle("-fx-text-fill: green");
            loginText.setText("Hello " + login);

        }

    }
    @FXML
    protected void onLogoutButtonClick(){
        loginField.clear();
        passwordField.clear();
        loginText.setText("Veuillez saisir vos identifiants");
        loginText.setStyle("-fx-text-fill: black");
    }
}