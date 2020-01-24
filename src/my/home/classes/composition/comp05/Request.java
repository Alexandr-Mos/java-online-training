package my.home.classes.composition.comp05;

public class Request {
	private Transport transport;
	private Food food;
	private int days;
	
	public Request(Transport transport, Food food, int days) {
		this.transport = transport;
		this.food = food;
		this.days = days;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Request [transport=" + transport + ", food=" + food + ", days=" + days + "]";
	}
	
	
}
