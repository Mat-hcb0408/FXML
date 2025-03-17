package com.example.ativ_m;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class SortearNomes_Controller {
    @FXML
    private Label result;

    @FXML
    private TextField nomes;

    @FXML
    protected void sortear() {
        Random random = new Random();
        String[] arrayNomes = nomes.getText().split(",");

        if (arrayNomes.length>1){
            result.setText(arrayNomes[random.nextInt(0, arrayNomes.length)]);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO!");
            alert.setHeaderText("APENAS UM OU MENOS DE UM NOME INSERIDO!");
            alert.setContentText("Insira mais de um nome.");
            alert.showAndWait();
        }
    }
}