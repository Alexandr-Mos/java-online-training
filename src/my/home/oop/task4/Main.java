package my.home.oop.task4;

import java.util.Scanner;

public class Main {
	private static String help = "Список команд (регистр не важен):\r\n"
			+ "[showAll] - Показать все \r\n"
			+ "[mostExpensive] - Показать самое дорогое\r\n"
			+ "[add] [name] [cost] - Добавить\r\n"
			+ "[remove] [id] - Удалить\r\n"
			+ "[sublist] [min] [max] - Показать в пределах стоимости\r\n";

	public static void main(String[] args) {
		System.out.println("ДРАКОН И ЕГО СОКРОВИЩА!");
		Dragon dragon = new Dragon("Смауг");
		dragon.setTreasures(Dragon.generateTreasures());
		
		System.out.println("Все доступные команды по команде [help]");
		System.out.println("Введите команду...");
		Scanner scanner = new Scanner(System.in);
		String[] command = scanner.nextLine().toLowerCase().split(" ");
		
		while (!command[0].equals("exit")) {
			TreasureManager manager = new TreasureManager();
			manager.setDragon(dragon);
			
			switch (command[0]) {
			case "help":
				System.out.println(Main.help);
				break;
			case "showall":
				manager.showAll();
				break;
			case "mostexpensive":
				manager.mostExpensive();
				break;
			case "add":
				manager.add(command);
				break;
			case "remove":
				manager.remove(command);
				break;
			case "sublist":
				manager.sublist(command);
				break;
			default:
				System.out.println("Такая команда не найдена :(");
				break;
			}
			command = scanner.nextLine().toLowerCase().split(" ");
		}
		
		System.out.println("Программа завершена");
		scanner.close();
	}

}
