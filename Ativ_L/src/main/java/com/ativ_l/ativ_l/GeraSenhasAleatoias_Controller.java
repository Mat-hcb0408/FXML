package com.ativ_l.ativ_l;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class GeraSenhasAleatoias_Controller {
    @FXML
    private TextField tamanho;

    @FXML
    private TextField senha;

    @FXML
    protected void gerar() {
        try {
            int size = Integer.parseInt(tamanho.getText());
            Random random=new Random();
            StringBuilder novaSenha=new StringBuilder();

            if (size < 4) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERRO!");
                alert.setHeaderText("Tamanho invalido!");
                alert.setContentText("A senha deve ter no mínimo 4 caracteres.");
                alert.showAndWait();

            }else{
                for (int i=0;i<size;i++){
                    novaSenha.append(random.nextInt(10));
                }
                senha.setText(novaSenha.toString());
            }

        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO!");
            alert.setHeaderText("VALOR NUMÉRICO INVALIDO!");
            alert.setContentText("Insira um valor numérico valido.");
            alert.showAndWait();

        }
    }
}