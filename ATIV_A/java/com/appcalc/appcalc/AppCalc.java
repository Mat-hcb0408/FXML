package com.appcalc.appcalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppCalc extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppCalc.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 450);
        stage.setTitle("Calculadora Simples!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}