package com.ativ_c.ativ_d;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Ativ_D_Controller {

    @FXML
    private TextField text;

    @FXML
    private TextField invertText;

    @FXML
    Button invert;

    public void invert() {
        invert.setOnAction(invert.getOnAction());{

            invertText.setEditable(false);//nao consegue editar o texto invertido

            if (text.getText().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO!");
            alert.setHeaderText("Campo vazio");
            alert.showAndWait();
        }else{
            String txt = text.getText();
            StringBuilder sb = new StringBuilder(txt);
            sb.reverse();

            invertText.setText(sb.toString());
            }
        }
    }
}
