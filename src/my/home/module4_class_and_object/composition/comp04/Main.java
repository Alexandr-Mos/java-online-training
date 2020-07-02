package my.home.module4_class_and_object.composition.comp04;

import java.math.BigDecimal;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Main {

	public static void main(String[] args) {
		Client c1  = new Client("c1", "Paris");
		Client c2  = new Client("c2", "Warshaw");
		
		
		BankAccount ac1 = new BankAccount(c1, 111111);
		BankAccount ac2 = new BankAccount(c1, 111112);
		BankAccount ac3 = new BankAccount(c1, 111113);
		
		c1.addAccount(ac1);
		c1.addAccount(ac2);
		c1.addAccount(ac3);
		
		System.out.println(c1);
		
		c1.printTotalMoney();
		System.out.println("---------------");
		
		ac1.addMoney(new BigDecimal(1000000.50));
		ac2.reduceMoney(new BigDecimal(500000));
		ac3.reduceMoney(new BigDecimal(500001));
		
		System.out.println(c1);
	
		c1.printTotalMoney();
		System.out.println("---------------");
		
		BankAccount ac4 = new BankAccount(c2, 222222);
		ac4.addMoney(new BigDecimal(123456));
		c2.addAccount(ac4);
		
		System.out.println(c2);
		
		
		c2.printTotalMoney();
		System.out.println("---------------");
		ac4.block();
		ac4.addMoney(new BigDecimal(1000000000));
		
		System.out.println(c2);
		c2.printTotalMoney();
	}

}
