package org.ativ_o.ativ_o;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class TradutorController {
    @FXML
    private TextField textoIngles;  // Campo de texto onde o usuário digita a palavra em inglês

    @FXML
    private Text resultadoTraducao;  // Label que exibe a tradução

    @FXML
    private Button traduzirButton;   // Botão para realizar a tradução

    private TradutorModel modelo;

    public TradutorController() {
        modelo = new TradutorModel();  // Inicializa o modelo de tradução
    }

    // Método chamado quando o botão "Traduzir" é clicado
    @FXML
    public void traduzir() {
        String palavraIngles = textoIngles.getText();  // Obtém o texto digitado pelo usuário
        String traducao = modelo.traduzir(palavraIngles);  // Chama o modelo para traduzir a palavra
        resultadoTraducao.setText("Tradução: " + traducao);  // Exibe a tradução no Text
    }
}

