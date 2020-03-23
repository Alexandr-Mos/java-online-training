package my.home.oop.task4;

import java.util.ArrayList;

public class Dragon {
	private String name;
	private ArrayList<Treasure> treasures;

	public Dragon(String name) {
		this.name = name;
	}

	public static ArrayList<Treasure> generateTreasures() {
		ArrayList<Treasure> treasures = new ArrayList<Treasure>();
		for (int i = 0; i < 100; i++) {
			int temp = (int) (Math.random() * 1000);
			treasures.add(new Treasure("Treasure" + temp, temp));
		}
		return treasures;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(ArrayList<Treasure> treasures) {
		this.treasures = treasures;
	}

	@Override
	public String toString() {
		return "Dragon [name=" + name + ", treasures=\r\n" + treasures + "]";
	}

}
