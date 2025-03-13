package com.ativ_b.ativ_b;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.util.Optional;

public class Ativ_B_Controller {
    public Label instructionText;
    @FXML
    private TextField number;
    @FXML
    private Label result;
    @FXML
    protected void verify(){
        try {
            double num=Double.parseDouble(number.getText());

            if (num%2==0){
                result.setText(num+" é par!");
            } else {
                result.setText(num+" é ímpar!");
            }
        }catch (NumberFormatException e){
            Alert alerta=new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("ERRO");
            alerta.setHeaderText("ENTRADA INVÁLIDA!");
            alerta.setContentText("A entrada inserida foi inválida!");
            alerta.showAndWait();

            number.setText("");
        }
    }

}