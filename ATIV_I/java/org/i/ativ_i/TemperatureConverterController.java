package org.i.ativ_i;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TemperatureConverterController {

    @FXML
    private TextField celsiusField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button convertButton;

    @FXML
    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;

            // Exibir no Label
            resultLabel.setText(String.format("Fahrenheit: %.2f°F", fahrenheit));

            // Exibir no Alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Conversão Concluída");
            alert.setHeaderText(null);
            alert.setContentText("Temperatura em Fahrenheit: " + String.format("%.2f°F", fahrenheit));
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Digite um número válido!");
            alert.showAndWait();
        }
    }
}
