package sk.rajnoha.EntranceSystem;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EntranceMainController {
	private List<User> users = new ArrayList<User>();

	public EntranceMainController() {
		User u = new User();
		u.setMeno("jano");
		u.setChipId("123456");
		users.add(u);
		u = new User();
		u.setChipId("47568");
		u.setMeno("Kamil");
		users.add(u);

	}

	@FXML
	private ListView<User> usersListView;

	@FXML
	private TextField chipIdTextField;

	@FXML
	private TextField nametextfield;

	@FXML
	private Button addButton;

	private UserFxModel editeUser = new UserFxModel();

	@FXML
	void initialize() {

// prepojenie textfildov/chlievikov s modelom.Ked sa nieco vpise, editeUser sa
// hned zmeni. Zmeni sa aj bez stlacenia tlacidla.
		chipIdTextField.textProperty().bindBidirectional(editeUser.chipIdProperty());
		nametextfield.textProperty().bindBidirectional(editeUser.nameProperty());

// userListView podhadzujem jeho model
		usersListView.setItems(FXCollections.observableArrayList(users));

		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
// ulozit noveho pouzivatela
// vezmem model userListView a ked tam pridam noveho usra,ObservableArrayList
// bude informovat svojich posluchacov + listView aby sa prekreslil
				usersListView.getItems().add(editeUser.getUser());
			}
		});

	}

}
