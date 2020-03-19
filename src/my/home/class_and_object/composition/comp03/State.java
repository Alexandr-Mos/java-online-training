package my.home.class_and_object.composition.comp03;

import java.util.ArrayList;

public class State {
	private Region capitalRegion;
	private ArrayList<Region> regions;
	
	public State(Region capitalRegion) {
		this.capitalRegion = capitalRegion;
		regions = new ArrayList<Region>();
		regions.add(capitalRegion);
	}
	
	public double getArea() {
		double area = 0;
		
		for(Region r : regions) {
			area += r.getArea();
		}
		return area;
	}
	
	public void addRegion(Region region) {
		regions.add(region);
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
