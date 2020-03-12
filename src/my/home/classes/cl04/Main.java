package my.home.classes.cl04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainsList = new ArrayList<Train>();
		trainsList.add(new Train("Berlin", 345, 2001L));
		trainsList.add(new Train("Minsk", 234, 2200L));
		trainsList.add(new Train("Minsk", 123, 1635L));
		trainsList.add(new Train("Moskow", 567, 1330L));
		trainsList.add(new Train("Minsk", 456, 0000L));

		sortByNumber(trainsList);
		
		System.out.println("Поезда:");
		for(Train t : trainsList) {
			System.out.println(t);
		}

		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		System.out.println("Поиск поезда по номеру");
		int number = readInt(scanner);
		System.out.println(trainInfo(number, trainsList));

		sortByDestination(trainsList);
		
		System.out.println("Сортировка по пункту назначения:");
		for(Train t : trainsList) {
			System.out.println(t);
		}

	}

	public static void sortByDestination(ArrayList<Train> list) {
		Comparator<Train> com = (t1, t2) -> t1.getDestination().toLowerCase()
				.compareTo(t2.getDestination().toLowerCase());
		com = com.thenComparing(
				(t1, t2) -> Long.valueOf(t1.getDepartureTime()).compareTo(Long.valueOf(t2.getDepartureTime())));
		list.sort(com);
	}

	public static void sortByNumber(ArrayList<Train> list) {
		Comparator<Train> com = (t1, t2) -> Integer.valueOf(t1.getNumber()).compareTo(t2.getNumber());
		list.sort(com);
	}

	public static String trainInfo(int number, ArrayList<Train> list) {
		for (Train t : list) {
			if (t.getNumber() == number) {
				return "Пункт назначения: " + t.getDestination() + ", Время отправления: " + t.getDepartureTime();
			}
		}

		return "Поезд с таким номером не найден :(";
	}
	
	public static int readInt(Scanner scanner) {
		System.out.println("Введите число >>");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Неправильный ввод! Введите число >>");
		}
		
		return scanner.nextInt();
	}

}
