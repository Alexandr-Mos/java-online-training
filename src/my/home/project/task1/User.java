package my.home.project.task1;

public class User {
	private String email;
	private String password;
	private boolean isAdmin;
	
	public User() {
		
	}
	
	public User(String email, String password, boolean isAdmin) {
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", isAdmin=" + isAdmin + "]";
	}
	
	

}
