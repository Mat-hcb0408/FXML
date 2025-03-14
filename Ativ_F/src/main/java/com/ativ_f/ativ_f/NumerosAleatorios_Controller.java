package com.ativ_f.ativ_f;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Random;

public class NumerosAleatorios_Controller {

    @FXML
    private Label result;

    @FXML
    private TextField min;

    @FXML
    private TextField max;

    @FXML
    Button gerar;

    @FXML
    private void gerarNum() {

        {
            int minimo = Integer.parseInt(min.getText());
            int maximo = Integer.parseInt(max.getText());

            if (minimo > maximo) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setTitle("ERRO!");
                msg.setHeaderText("ENTRADAS INVÁLIDAS!");
                msg.showAndWait();
                return;
            }


            try {
                Random random = new Random();
                int randomNum = random.nextInt(maximo - minimo + 1) + minimo;
                result.setText("Número:" + randomNum);

            } catch (NumberFormatException e) {
                Alert msg = new Alert(Alert.AlertType.ERROR);
                msg.setTitle("ERRO!");
                msg.setHeaderText("ENTRADAS INVÁLIDAS!");
                msg.showAndWait();
            }
        }
    }
}