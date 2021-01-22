package sk.rajnoha.EntranceSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainWindowController {

    
    @FXML
    private Button printHuraButton;

    @FXML
    void initialize() {
    	//kontrolny vypis kebz sa chcelo nieco pokazit
    	System.out.println("na overenie ci zinicializovalo");
    	printHuraButton.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
					
			
			@Override
			public void handle(ActionEvent event) {			
				System.out.println("Ale funguje");
			}
		});
			
			
    }
}
