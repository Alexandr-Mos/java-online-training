package my.home.classes.cl04;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainsList = new ArrayList<Train>();
		trainsList.add(new Train("Berlin", 345, 2001L));
		trainsList.add(new Train("Minsk", 234, 2200L));
		trainsList.add(new Train("Minsk", 123, 1635L));
		trainsList.add(new Train("Moskow", 567, 1330L));
		trainsList.add(new Train("Minsk", 456, 0000L));
		
		sortByNumber(trainsList);
		System.out.println(trainsList);
		
		System.out.println(trainInfo(567, trainsList));
		
		sortByDestination(trainsList);
		System.out.println(trainsList);
		
	}
	
	public static void sortByDestination(ArrayList<Train> list) {
		Comparator<Train> com = (t1, t2) -> t1.getDestination().toLowerCase()
				                            .compareTo(t2.getDestination().toLowerCase());
		com = com.thenComparing((t1, t2) -> Long.valueOf(t1.getDepartureTime())
									  .compareTo(Long.valueOf(t2.getDepartureTime())));
		list.sort(com);
	}
	
	public static String trainInfo(int number, ArrayList<Train> list) {
		for (Train t : list) {
			if (t.getNumber() == number) {
				return "Пункт назначения: " + t.getDestination() 
				       + ", Время отправления: " + t.getDepartureTime();
			}
		}
		
		return "Поезд с таким номером не найден :(";
	}
	
	public static void sortByNumber(ArrayList<Train> list) {
		Comparator<Train> com = (t1, t2) -> Integer.valueOf(t1.getNumber())
				                            .compareTo(t2.getNumber());
		list.sort(com);
	}

}
