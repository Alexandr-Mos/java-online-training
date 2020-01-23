package my.home.classes.composition.comp03;

public class Region {
	private City city;
	private double area;
	
	public Region(City city, double area) {
		this.city = city;
		this.area = area;
	}
	
	public City getCity() {
		return this.city;
	}
	
	public double getArea() {
		return this.area;
	}

	@Override
	public String toString() {
		return city + " region";
	}
	
}
