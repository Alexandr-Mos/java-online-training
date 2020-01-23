package my.home.classes.composition.comp04;

import java.util.ArrayList;

public class Client {
	private String name;
	private String address;
	private ArrayList<BankAccount> accounts;
	
	public Client(String name, String address) {
		this.name = name;
		this.address = address;
		accounts = new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", accounts=" + accounts + "]";
	}

	
}
