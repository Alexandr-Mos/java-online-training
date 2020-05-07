package my.home.class_and_object.simple_class.cl10;

public class Airline {
	private String destination;
	private Plane plane;
	private long depatureTime;
	private Day day;
	private int flightNumber;
	private static int counter;
	
	public Airline(String destination, Plane plane, long depatureTime, Day day) {
		this.destination = destination;
		this.plane = plane;
		this.depatureTime = depatureTime;
		this.day = day;
		this.flightNumber = ++Airline.counter;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public long getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(long depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", plane=" + plane
				+ ", depatureTime=" + depatureTime + ", day=" + day + "]";
	}
	
	

}
