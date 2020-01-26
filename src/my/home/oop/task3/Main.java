package my.home.oop.task3;

public class Main {

	public static void main(String[] args) {
		Calendar cl = new Calendar(2020);
		cl.addHoliday(31, Month.DECEMBER, DayOfWeek.FRIDAY, "Новый год");
		cl.addHoliday(8, Month.MARCH, DayOfWeek.TUESDAY, "Международный женский день");
		cl.addHoliday(1, Month.SEPTEMBER, DayOfWeek.MONDAY, "День знаний");
		
		System.out.println(cl);

	}

}
