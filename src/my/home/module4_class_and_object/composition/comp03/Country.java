package my.home.module4_class_and_object.composition.comp03;

import java.util.ArrayList;

public class Country {
	private ArrayList<State> states;
	private City capitalCity;
	
	public Country(City capitalCity) {
		this.capitalCity = capitalCity;
		this.states = new ArrayList<State>();
	}
	
	public void addState(State state) {
		this.states.add(state);
	}
	
	public void getCapitalCity() {
		System.out.println("Capital city " + capitalCity);
	}
	
	public void getStatesNumber() {
		System.out.println("States: " + this.getStates().size());
	}
	
	public void getArea() {
		double fullArea = 0;
		
		for (State s : states) {
			fullArea += s.getArea();
		}
		System.out.println("Full area: " + fullArea);
	}
	
	public void getCapitalCitiesStates() {
		System.out.println("Capital cities of states: ");
		for (State s : this.getStates()) {
			System.out.println(s.getCapitalRegion().getCity());
		}
	}

	public ArrayList<State> getStates() {
		return states;
	}

	public void setStates(ArrayList<State> states) {
		this.states = states;
	}

	
	
	
	
	
	
}
