package my.home.classes.composition.comp03;

import java.util.ArrayList;

public class State {
	private Region capitalRegion;
	private ArrayList<Region> regions;
	
	public State(Region capitalRegion) {
		this.capitalRegion = capitalRegion;
		regions = new ArrayList<Region>();
	}
	
	public void addRegion(Region region) {
		regions.add(region)
	}
	
	public Region getCapitalRegion() {
		return this.capitalRegion;
	}
	
	public ArrayList<Region> getRegions(){
		return this.regions;
	}

	@Override
	public String toString() {
		return "State [capitalRegion=" + capitalRegion + ", regions=" + regions + "]";
	}
	
	

}
