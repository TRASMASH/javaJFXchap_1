package com.lmdsio.javajfx_chap1;

import javafx.application.Platform;
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
    private int errorCount = 0;
    @FXML
    protected void onLoginButtonClick() {
        String login = loginField.getText();
        String password = passwordField.getText();
        if (!password.equals("mdp")) {
            errorCount++;
            loginText.setText("Identifiants incorrects " + errorCount +" /3");
            loginText.setStyle("-fx-text-fill: red");
            if (errorCount >= 3) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText("Trois erreurs de connexion consécutives");
                alert.setContentText("L'application va se fermer");
                alert.showAndWait();
                Platform.exit();

            }

        } else {
            loginText.setText("Veuillez saisir vos identifiants");
            loginText.setStyle("-fx-text-fill: green");
            loginText.setText("Hello " + login);
            errorCount = 0;
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