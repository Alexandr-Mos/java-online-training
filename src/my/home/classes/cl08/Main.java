package my.home.classes.cl08;

public class Main {

	public static void main(String[] args) {
		BankMembers bank = new BankMembers();
		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * (i + 80) + 10);
			Customer c = new Customer("Customer" + temp, "SecondName", "LastName");
			c.setCardNumber(temp * 12345);
			c.setBankAccNumber(temp * 456789);
			c.setAddress("Paris " + temp);
			bank.addMember(c);
		}
		
		bank.showAllMembers();
		System.out.println("---------");
		bank.showMebersByCard(256000, 640000);
		
	}

}
