package my.home.classes.composition.comp03;

public class City {
	private String name;
	
	public City(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
