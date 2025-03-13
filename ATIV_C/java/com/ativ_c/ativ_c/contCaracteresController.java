package com.ativ_c.ativ_c;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class contCaracteresController {
    @FXML
    private TextField caracteres;

    @FXML
    private Label cont;

    @FXML
    public void contador(){


        if (caracteres.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Não há caracteres!!!");
            alert.setHeaderText("Digite algo para saber quantos caracteres tem.");
            alert.showAndWait();
            return;
        }

        cont.setText("A quantidade de Caracteres é: " + caracteres.getText().length());

    }
}