package org.ativ_o.ativ_o;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tradutor.fxml"));
        AnchorPane root = loader.load();

        // Cria a cena
        Scene scene = new Scene(root, 400, 300);

        // Configura o palco (janela) e exibe
        primaryStage.setTitle("Tradutor Inglês-Português");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

