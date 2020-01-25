package my.home.oop.task2;

import java.util.ArrayList;

public class Payment {
	private ArrayList<Product> list;
	private double fullPrice;
	
	public Payment() {
		this.list = new ArrayList<Product>();
		this.fullPrice = 0.0;
	}
	
	public void addProduct(String name, double price, int quantity) {
		this.list.add(new Product(name, price, quantity));
		this.fullPrice += (price * quantity);
	}
	
	
	
	@Override
	public String toString() {
		return "Payment " + list + "\r\nFull Price: " + this.fullPrice;
	}



	class Product {
		private String name;
		private double price;
		private int quantity;
		
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "\r\n\tProduct [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
		}
		
		
	}

}
