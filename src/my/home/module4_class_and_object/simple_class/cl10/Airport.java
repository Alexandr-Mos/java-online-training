package my.home.module4_class_and_object.simple_class.cl10;

import java.util.ArrayList;

public class Airport {
	private ArrayList<Airline> airlines;
	
	public Airport() {
		airlines = new ArrayList<Airline>();
	}
	
	public void addAirlane(Airline airline) {
		airlines.add(airline);
	}
	
	public ArrayList<Airline> getPlaneBy(String destination) {
		ArrayList<Airline> planes = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if (a.getDestination().toLowerCase().equals(destination.toLowerCase())) {
				planes.add(a);
			}
		}
		return planes;
	}
	
	public ArrayList<Airline> getPlaneBy(Day day) {
		ArrayList<Airline> planes = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if (a.getDay().equals(day)) {
				planes.add(a);
			}
		}
		return planes;
	}
	
	public ArrayList<Airline> getPlaneBy(Day day, long afterTime) {
		ArrayList<Airline> planes = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if (a.getDay().equals(day) && a.getDepatureTime() > afterTime) {
				planes.add(a);
			}
		}
		return planes;
	}

	@Override
	public String toString() {
		return "Airport [airlines=" + airlines + "]";
	}

	
}
