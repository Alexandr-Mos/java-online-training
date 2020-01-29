package my.home.project.task1;

import java.util.ArrayList;

public class UsersBase {
	private ArrayList<User> usersBase;
	public static final String FILE_NAME = "users.txt";
	
	public UsersBase(ArrayList<User> usersBase) {
		this.usersBase = usersBase;
	}

	public ArrayList<User> getUsersBase() {
		return usersBase;
	}

	public void setUsersBase(ArrayList<User> usersBase) {
		this.usersBase = usersBase;
	}

	@Override
	public String toString() {
		return "UsersBase " + usersBase;
	}

}
