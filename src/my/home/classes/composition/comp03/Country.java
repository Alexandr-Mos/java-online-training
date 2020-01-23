package my.home.classes.composition.comp03;

import java.util.ArrayList;

public class Country {
	private ArrayList<State> states;
	private State capitalState;
	
	public Country(State capitalState) {
		this.capitalState = capitalState;
		this.states = new ArrayList<State>();
		states.add(capitalState);
	}
	
	public void addState(State state) {
		this.states.add(state);
	}
	
	public void getCapitalCity() {
		System.out.println("Capital city " + this.capitalState.getCapitalRegion().getCity());
	}
	
	public void getStatesNumber() {
		System.out.println("States: " + this.getStates().size());
	}
	
	public void getArea() {
		double fullArea = 0;
		
		for (State s : states) {
			for (Region r : s.getRegions()) {
				fullArea += r.getArea();
			}
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

	public State getCapitalState() {
		return capitalState;
	}

	public void setCapitalState(State capitalState) {
		this.capitalState = capitalState;
	}
	
	
	
	
	
	
}
