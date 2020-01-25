package my.home.oop.task2;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.addProduct("Молоко", 2.20, 1);
		payment.addProduct("Хлеб", 1.15, 2);
		payment.addProduct("Сахар", 1.00, 3);
		payment.addProduct("Печенье", 3.0, 1);
		
		System.out.println(payment);

	}

}
