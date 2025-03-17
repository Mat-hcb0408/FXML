package com.ativ_k.ativ_k;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcJurosCompostos_Controller {
    @FXML
    private TextField capital;

    @FXML
    private TextField taxaJuros;

    @FXML
    private TextField meses;

    @FXML
    private Label montante;

    @FXML
    protected void calcular(){
        try {

            double capit = Double.parseDouble(capital.getText());
            double juros = Double.parseDouble(taxaJuros.getText())/100;
            int tempo = Integer.parseInt(meses.getText());

            double result = capit*Math.pow((1+juros),tempo);
            montante.setText(String.format("Montante final = R$%.2f",result));


        } catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO!");
            alert.setHeaderText("NENHUM VALOR INSERIDO!");
            alert.setContentText("Insira um valor valido.");
            alert.showAndWait();

            capital.setText("");
            taxaJuros.setText("");
            meses.setText("");
        }
    }
}

