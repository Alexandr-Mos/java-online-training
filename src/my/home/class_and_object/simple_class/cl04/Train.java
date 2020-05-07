package my.home.class_and_object.simple_class.cl04;

public class Train {
	private String destination;
	private int number;
	private long departureTime;

	public Train(String destination, int number, long departureTime) {
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(long departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", departureTime=" + departureTime + "]";
	}

}
