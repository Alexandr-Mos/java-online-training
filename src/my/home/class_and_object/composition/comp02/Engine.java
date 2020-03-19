package my.home.class_and_object.composition.comp02;

public class Engine {
	private int levelFuel;
	
	public Engine() {
		this.levelFuel = 0;
	}
	
	public void start() {
		if (levelFuel <= 0) {
			System.out.println("Low fuel :(");
			return;
		}
		System.out.println("Engine started!");
		System.out.println("wrrrrr.....");
	}
	
	public void stop() {
		System.out.println("Engine stopped!");
	}
	
	public void setSpeed(int kmh) {
		System.out.println("Going at speed " + kmh + " km/h");
	}

	public int getLevelFuel() {
		return levelFuel;
	}

	public void setLevelFuel(int levelFuel) {
		this.levelFuel = levelFuel;
	}

	@Override
	public String toString() {
		return "Engine [levelFuel=" + levelFuel + "]";
	}

}
