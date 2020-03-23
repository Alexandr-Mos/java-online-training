package my.home.oop.task4;

public class Treasure {
	private int id;
	private String name;
	private int cost;
	private static int counter = 0;

	public Treasure(String name, int cost) {
		incCounter();
		this.id = getCounter();
		this.name = name;
		this.cost = cost;
	}

	private static void incCounter() {
		counter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static int getCounter() {
		return counter;
	}

	public int compareTo(Treasure t) {
		return Integer.valueOf(this.getCost()).compareTo(Integer.valueOf(t.getCost()));
	}

	@Override
	public String toString() {
		return "Treasure [id=" + id + ", \tname=" + name + ", \tcost=" + cost + "]";
	}

}
