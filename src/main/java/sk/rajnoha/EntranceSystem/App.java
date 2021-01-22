package sk.rajnoha.EntranceSystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class App extends Application
{
	public void start(Stage stage) throws Exception {
		Parent rootPane = FXMLLoader.load(
				getClass().getResource("MainWindow.fxml"));
		
		//Button button = new Button("stlač ma!");
		//button.setOnAction(new SysoutHandler());
		//setOnAction potrebuje EventHandler, a tu je podany ako interface- anonymna trieda
		//button.setOnAction(new EventHandler<ActionEvent>() {
			
		//	@Override
			//public void handle(ActionEvent event) {
			//	System.out.println("Anonymny klik");
				
			//}
		//});
		//AnchorPane rootPane = new AnchorPane();
		//rootPane.getChildren().add(button);
		//rootPane.setPrefSize(400, 300);
		Scene scene = new Scene(rootPane);
		stage.setTitle("Hello World");
		stage.setScene(scene);
		stage.show();
		}
    public static void main( String[] args )
    {
        launch(args);
    }
}
