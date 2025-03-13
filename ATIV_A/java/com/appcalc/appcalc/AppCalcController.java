package com.appcalc.appcalc;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.util.Optional;

public class AppCalcController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label resultado;

    @FXML
    protected void ClickTeste(){

        try {
            // Converte os valores digitados para double
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());

            double result;

            // Alerta para o usuário
            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Resultado");
            msg.setHeaderText("Mensagem de Teste");
            msg.setContentText("Foi digitado os números: " + n1 + " - " + n2);

            ButtonType bttnSoma = new ButtonType("SOMAR");
            ButtonType bttnMulti = new ButtonType("MULTIPLICAR");
            ButtonType bttnSub = new ButtonType("SUBTRAIR");
            ButtonType bttnDiv = new ButtonType("DIVIDIR");
            ButtonType bttnCancelar = new ButtonType("CANCELAR");

            msg.getButtonTypes().setAll(bttnSoma, bttnSub, bttnMulti, bttnDiv, bttnCancelar);

            // Armazena qual botão foi clicado
            Optional<ButtonType> opt = msg.showAndWait();

            if (opt.isPresent()) {
                if (opt.get() == bttnSoma) {
                    result = n1 + n2;
                    resultado.setText("O resultado da Soma é: " + result);
                } else if (opt.get() == bttnMulti) {
                    result = n1 * n2;
                    resultado.setText("O resultado da Multiplicação é: " + result);
                } else if (opt.get() == bttnSub) {
                    result = n1 - n2;
                    resultado.setText("O resultado da Subtração é: " + result);
                } else if (opt.get() == bttnDiv) {
                    // Verificação de divisão por zero
                    if (n2 == 0) {
                        Alert divZeroAlert = new Alert(Alert.AlertType.ERROR);
                        divZeroAlert.setTitle("Erro");
                        divZeroAlert.setHeaderText("Divisão por Zero");
                        divZeroAlert.setContentText("Não é possível dividir por zero!");
                        divZeroAlert.showAndWait();
                    } else {
                        result = n1 / n2;
                        resultado.setText("O resultado da Divisão é: " + result);
                    }
                } else {
                    resultado.setText("");
                }
            }

            // Limpar resultado do label após 3 segundos
            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(event -> resultado.setText(""));
            pause.play();

        } catch (NumberFormatException e) {
            // Caso o usuário insira um valor inválido (não numérico)
            Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setTitle("Erro");
            msg.setHeaderText("Valor Inválido");
            msg.setContentText("O valor informado não é um número válido. Por favor, insira apenas números.");
            msg.showAndWait();
        }

        // Limpar os campos de texto
        num1.setText("");
        num2.setText("");
    }
}
