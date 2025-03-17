package org.ativ_m.ativ_m;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Timer;
import java.util.TimerTask;

public class TemporizadorSimplesController {

    private int interval;
    private Timer timer;

    @FXML
    private TextField tempo;

    @FXML
    private Label resultado;

    @FXML
    public void cont() {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();

        try {

            interval = Integer.parseInt(tempo.getText());
        } catch (NumberFormatException e) {
            resultado.setText("Please enter a valid number");
            return;
        }


        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                Platform.runLater(() -> resultado.setText(String.valueOf(setInterval())));
            }
        }, delay, period);
    }

    private int setInterval() {
        if (interval == 1) {
            timer.cancel();
            Platform.runLater(() -> resultado.setText("Time's up!"));
        }
        return --interval;
    }
}
