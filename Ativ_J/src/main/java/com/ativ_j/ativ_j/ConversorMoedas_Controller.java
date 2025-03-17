package com.ativ_j.ativ_j;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.util.Optional;

public class ConversorMoedas_Controller {


    @FXML
    private TextField valorReais;

    @FXML
    private Label resultado;

    @FXML
    protected void convert() {
        try {

            double real = Double.parseDouble(valorReais.getText());
            double result = 0;

            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Opções de conversão");
            msg.setHeaderText("Deseja converter para qual moeda?");
            msg.setContentText("Escolha uma opção:");

            ButtonType bttnDolar = new ButtonType("DOLAR(USD)");
            ButtonType bttnEuro = new ButtonType("EURO(EUR)");
            ButtonType bttnYuan = new ButtonType("YUAN CHINES(CNY)");
            ButtonType bttnIene = new ButtonType("IENE JAPONES(JPY)");
            ButtonType bttnLibra = new ButtonType("LiBRA ESTERLINA(GBP)");

            msg.getButtonTypes().setAll(bttnDolar, bttnEuro, bttnYuan, bttnIene, bttnLibra);
            Optional<ButtonType> opt = msg.showAndWait();

            if (opt.isPresent()) {
                if (opt.get() == bttnDolar) {
                    result = real * 5.74;
                    resultado.setText(String.format("%.2f BRL = %.2f USD", real, result));
                } else if (opt.get() == bttnEuro) {
                    result = real * 6.24;
                    resultado.setText(String.format("%.2f BRL = %.2f EUR", real, result));
                } else if (opt.get() == bttnYuan) {
                    result = real * 1.26;
                    resultado.setText(String.format("%.2f BRL = %.2f CNY", real, result));
                } else if (opt.get() == bttnIene) {
                    result = real * 25.86;
                    resultado.setText(String.format("%.2f BRL = %.2f JPY", real, result));
                } else if (opt.get() == bttnLibra) {
                    result = real * 7.41;
                    resultado.setText(String.format("%.2f BRL = %.2f GBP", real, result));
                }
                }
                valorReais.setText("");
                PauseTransition pause = new PauseTransition(Duration.seconds(5));
                pause.setOnFinished(e -> resultado.setText(""));
                pause.play();

            }catch(NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERRO!");
                alert.setHeaderText("NENHUM VALOR NUMÉRICO INSERIDO!");
                alert.setContentText("Insira um valor numérico valido.");
                alert.showAndWait();

                valorReais.setText("");
            }
        }
    }
