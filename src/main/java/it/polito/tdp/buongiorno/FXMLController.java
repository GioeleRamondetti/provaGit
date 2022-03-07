package it.polito.tdp.buongiorno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label txtMessaggio;

    @FXML
    private TextField txtNome;

    @FXML
    void handleBuongiorno(ActionEvent event) {
    	System.out.println("bottone premuto");
    	String nome=txtNome.getText();
    	if(nome.length()==0) {
    		System.out.println("inserire nome");
    	}else {
    		txtMessaggio.setText("buongiorno"+" "+nome+".");
    		txtMessaggio.setText("");
    	}
    }

}
