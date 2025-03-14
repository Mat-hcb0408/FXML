package org.g.ativ_g;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class VerifyPalindromoController {


    @FXML
    private TextField palavra;

    @FXML
    private Label resposta;


    public void verificarPalindromo(){
        if (palavra.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Não há caracteres!!!");
            alert.setHeaderText("Digite algo para saber se a palavra é um Palindromo.");
            alert.showAndWait();
            return;
        }

        String texto = palavra.getText().replaceAll("\\s+", "").toLowerCase(); // Remove espaços e converte para minusculas
        String reverso = new StringBuilder(texto).reverse().toString();

        if (texto.equals(reverso)) {
            resposta.setText("É um palíndromo!");
        } else {
            resposta.setText("Não é um palíndromo.");
        }
    }

}
