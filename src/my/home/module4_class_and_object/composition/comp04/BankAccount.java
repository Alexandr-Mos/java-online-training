package my.home.module4_class_and_object.composition.comp04;

import java.math.BigDecimal;

public class BankAccount {
	private Client owner;
	private long accountNumber;
	private boolean isBlocked;
	private BigDecimal money;
	
	public BankAccount(Client client, long accountNumber) {
		this.owner = client;
		this.accountNumber = accountNumber;
		this.isBlocked = false;
		this.money = new BigDecimal(0).setScale(2);
	}
	
	public BigDecimal getMoneyValue() {
		return money;
	}
	
	public void addMoney(BigDecimal value) {
		if (isBlocked) {
			System.out.println("Cant add money/Account is blocked");
			return;
		}
		
		this.money = this.money.add(value);
	}
	
	public void reduceMoney(BigDecimal value) {
		if (isBlocked) {
			System.out.println("Cant reduce money/Account is blocked");
			return;
		}
		
		this.money = this.money.subtract(value);
	}
	
	public boolean isBlocked() {
		return this.isBlocked;
	}
	
	public void block() {
		this.isBlocked = true;
	}
	
	public void unBlock() {
		this.isBlocked = false;
	}

	public Client getOwner() {
		return owner;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "\nBankAccount [owner=" + owner.getName() + ", accountNumber=" + accountNumber + ", isBlocked=" + isBlocked
				+ ", money=" + money + "]";
	}

	
	
	
}