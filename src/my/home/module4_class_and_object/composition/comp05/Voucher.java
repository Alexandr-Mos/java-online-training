package my.home.module4_class_and_object.composition.comp05;

public class Voucher {
	private String place;
	private Type type;
	private int days;
	private Transport transport;
	private Food food;
	private int price;
	
	public Voucher(String place, Type type) {
		this.place = place;
		this.type = type;
	}

	public int getDays() {
		return days;
	}

	public Voucher setDays(int days) {
		this.days = days;
		return this;
	}

	public Transport getTransport() {
		return transport;
	}

	public Voucher setTransport(Transport transport) {
		this.transport = transport;
		return this;
	}

	public Food getFood() {
		return food;
	}

	public Voucher setFood(Food food) {
		this.food = food;
		return this;
	}

	public int getPrice() {
		return price;
	}
	
	public String getPlace() {
		return this.place;
	}
	
	public Type getType() {
		return this.type;
	}

	public Voucher setPrice(int price) {
		this.price = price;
		return this;
	}

	@Override
	public String toString() {
		return "Voucher [place=" + place 
				+ ", type=" + type 
				+ ", days=" + days 
				+ ", transport=" + transport 
				+ ", food=" + food 
				+ ", price=" + price + "]";
	}
	
	

}
