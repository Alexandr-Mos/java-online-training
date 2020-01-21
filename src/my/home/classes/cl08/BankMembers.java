package my.home.classes.cl08;

import java.util.ArrayList;
import java.util.Comparator;

public class BankMembers {
	private ArrayList<Customer> members;
	
	public BankMembers() {
		this.members = new ArrayList<Customer>();
	}
	
	public void addMember(Customer c) {
		this.members.add(c);
	}
	
	public void showAllMembers() {
		Comparator<Customer> com = (c1 ,c2) -> c1.getLastName().toLowerCase().compareTo(c2.getLastName().toLowerCase());
		com = com.thenComparing((c1 ,c2) -> c1.getFirstName().toLowerCase().compareTo(c2.getFirstName().toLowerCase()));
		com = com.thenComparing((c1, c2) -> c1.getSecondName().toLowerCase().compareTo(c2.getSecondName().toLowerCase()));
		this.members.sort(com);
		for (Customer c : members) {
			System.out.println(c);
		}
	}
	
	public void showMebersByCard(long from, long to) {
		for (Customer c : members) {
			if (c.getCardNumber() >= from && c.getCardNumber() <= to) {
				System.out.println(c);
			}
		}
	}

}
