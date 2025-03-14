package com.ativ_e.ativ_e;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class HelloController {
    @FXML
    private TextField usuario;

    @FXML
    private TextField senha;

    public void verificarLogin(){
        if (usuario.getText().isEmpty() || senha.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Não há caracteres!!!");
            alert.setHeaderText("Digite algo para saber quantos caracteres tem.");
            alert.showAndWait();
            return;
        }

        if (usuario.getText().equals("admin")||senha.getText().equals("1234")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Deu Certo!!!");
            alert.setHeaderText("Login Bem Sucedido.");
            alert.showAndWait();
            usuario.setText("");
            senha.setText("");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Algo Deu Errado!!!");
            alert.setHeaderText("Nome de Usuario ou Senha Incorreto.");
            alert.showAndWait();
            usuario.setText("");
            senha.setText("");
        }

    }


}
