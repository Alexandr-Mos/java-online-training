package my.home.classes.composition.comp04;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Client c1  = new Client("c1", "Paris");
		Client c2  = new Client("c2", "Warshaw");
		Client c3  = new Client("c3", "London");
		Client c4  = new Client("c4", "Berlin");
		BankAccount ac1 = new BankAccount(c1, 111111);
		c1.addAccount(ac1);
		BankAccount ac2 = new BankAccount(c1, 111112);
		c1.addAccount(ac2);
		BankAccount ac3 = new BankAccount(c1, 111113);
		c1.addAccount(ac3);
		
		ac1.addMoney(new BigDecimal(1000000));
		ac2.reduceMoney(new BigDecimal(-500000));
		ac3.reduceMoney(new BigDecimal(-500001));
		
		BankAccount ac4 = new BankAccount(c2, 222222);
		ac4.addMoney(new BigDecimal(123456));
		c2.addAccount(ac4);
	}

}
