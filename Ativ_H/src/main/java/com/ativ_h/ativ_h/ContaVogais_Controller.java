package com.ativ_h.ativ_h;

    import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.Locale;


    public class ContaVogais_Controller {
        @FXML
        TextField text;
        @FXML
        Label result;

        public void contador() {
            String texto=text.getText().toLowerCase();
            int cont=0;
            for (int i=0;i< text.getLength();i++){
                char vog=texto.charAt(i);
                if (vog =='a'||vog =='e'||vog =='i'||vog =='o' ||vog=='u') {
                    cont++;
                }
            }
            result.setText("Quantidade de vogais: " + cont);
        }
    }
