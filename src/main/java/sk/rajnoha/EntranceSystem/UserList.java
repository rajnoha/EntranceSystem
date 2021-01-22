package sk.rajnoha.EntranceSystem;
import java.util.ArrayList;
import java.util.List;

public class UserList {
	private List<User> users = new ArrayList<User>();

	public void addUser(User user) {
		users.add(user);
	}

//	overenie platnosti cipu
	public boolean validate(String chipId) {
		for(User u: users ){
			if(chipId.equals(u.getChipId())) {
			if(!u.isActive()) {
				return false;
			}
				return true;
			}
		}
		return false;
	}
	/**
	 * deaktivacia podla mena nie je vhodna, mozu byt dvaja s rovnakym menom
	 */
	public void deactivate(String chipId) {
		for(User u: users ){
			if(chipId.equals(u.getChipId()))
			{
				u.setActive(false);

			}
		}
	}
}
