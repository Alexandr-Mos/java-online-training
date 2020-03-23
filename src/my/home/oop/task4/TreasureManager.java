package my.home.oop.task4;

public class TreasureManager {
	private Dragon dragon;

	public TreasureManager() {
	}

	public void showAll() {
		for (Treasure t : dragon.getTreasures()) {
			System.out.println(t);
		}
	}

	public void mostExpensive() {
		int maxCost = Integer.MIN_VALUE;
		Treasure mostExpensive = null;

		for (Treasure t : dragon.getTreasures()) {
			if (maxCost < t.getCost()) {
				maxCost = t.getCost();
				mostExpensive = t;
			}
		}
		System.out.println("Самое дорогое сокровище:\t" + mostExpensive);
	}

	public void add(String[] command) {
		String name = "";
		int cost = 0;

		if (command.length < 3) {
			System.out.println("Неправильный формат команды");
			return;
		} else {
			try {
				name = command[1];
				cost = Integer.valueOf(command[2]);
			} catch (Exception e) {
				System.out.println("Неправильный формат введенных данных");
				return;
			}
		}
		dragon.getTreasures().add(new Treasure(name, cost));
	}

	public void remove(String[] command) {
		int id = -1;

		if (command.length < 2) {
			System.out.println("Неправильный формат команды");
			return;
		} else {
			try {
				id = Integer.valueOf(command[1]);
			} catch (Exception e) {
				System.out.println("Неправильный формат введенных данных");
				return;
			}
		}
		if (id != -1) {
			dragon.getTreasures().remove(id - 1);
		} else {
			System.out.println("Такого сокровища нет");
		}

	}

	public void sublist(String[] command) {
		int minCost = 0;
		int maxCost = 0;

		if (command.length < 3) {
			System.out.println("Команда введена не полностью");
			return;
		} else {
			try {
				minCost = Integer.valueOf(command[1]);
				maxCost = Integer.valueOf(command[2]);
			} catch (NumberFormatException e) {
				System.out.println("Неправильно введены числа");
				return;
			}
		}
		System.out.println("Найденные сокровища:");
		for (Treasure t : dragon.getTreasures()) {
			if (minCost <= t.getCost() && t.getCost() <= maxCost) {
				System.out.println(t);
			}
		}
	}

	public Dragon getDragon() {
		return dragon;
	}

	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}

}
