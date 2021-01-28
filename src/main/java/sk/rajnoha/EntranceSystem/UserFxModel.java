package sk.rajnoha.EntranceSystem;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// kompletny model pouzivatela

public class UserFxModel {
	
	private StringProperty chipId = new SimpleStringProperty();
	private StringProperty name = new SimpleStringProperty();
	
	//v getroch a setroch trochu zmena, aby sa pristupovalo LEN k datam a nie celemu modelu, a cele to spolu je standard modelu
	
	public String getChipId() {
		return chipId.get();
	}
	public void setChipId(String chipId) {
		this.setChipId(chipId);
	}
	public StringProperty chipIdProperty() {      // nejaky speci geter na pocuvanie zmien vnutri modelu
		return chipId;
	}
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.setName(name);
	}
	
	public StringProperty nameProperty() {        //  nejaky speci geter na pocuvanie zmien vnutri modelu
		return name;
	}
	
	// generator obycajneho modelu usra(nie GUI) 
	public User getUser() {
		User user = new User();
		user.setChipId(getChipId());
		user.setMeno(getName());
		return user;
	}
}
