package my.home.project.task1;

public class EmailSender {
	private static EmailSender instance;
	
	private EmailSender() {
	}
	
	public static EmailSender getInstance() {
		if (instance == null) {
			instance = new EmailSender();
		}
		return instance;
	}
	
	public void sendToAdmins(String text) {}
	
	public void sendToAll(String text) {}
	
	public void sendToUsers(String text) {}
	
	public void sendToUser(String email, String text) {}
	
}
