package my.home.classes.cl10;

public class Airline {
	private String destination;
	private int flightNumber;
	private Plane plane;
	private long depatureTime;
	private Day day;
	
	public Airline() {
		
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

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
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
