package my.home.class_and_object.simple_class.cl10;

import java.util.Collection;
import java.util.Collections;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

	Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
	Найти и вывести:
	a) список рейсов для заданного пункта назначения;
	b) список рейсов для заданного дня недели;
	c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {

	public static void main(String[] args) {
		Airport airport = new Airport();
		airport.addAirlane(new Airline("Berlin", Plane.A300, 1335, Day.MONDAY));
		airport.addAirlane(new Airline("Moskow", Plane.BOEING777, 905, Day.SATURDAY));
		airport.addAirlane(new Airline("Minsk", Plane.A310, 1305, Day.WEDNESDAY));
		airport.addAirlane(new Airline("Minsk", Plane.A310, 1405, Day.WEDNESDAY));
		airport.addAirlane(new Airline("London", Plane.A330, 1610, Day.THURSDAY));
		airport.addAirlane(new Airline("Kiev", Plane.BOEING767, 2355, Day.SUNDAY));
		airport.addAirlane(new Airline("Deli", Plane.BOEING767, 1740, Day.MONDAY));
		airport.addAirlane(new Airline("Berlin", Plane.BOEING747, 2045, Day.FRIDAY));
		airport.addAirlane(new Airline("Berlin", Plane.BOEING747, 100, Day.WEDNESDAY));
		
		System.out.println("Рейсы по пункту назначения:");
		for(Airline a: airport.getPlaneBy("Berlin")) {
			System.out.println(a);
		}

		System.out.println("Рейсы по дню недели:");
		for(Airline a: airport.getPlaneBy(Day.MONDAY)) {
			System.out.println(a);
		}
		
		System.out.println("Рейсы по дню недели и времени:");
		for(Airline a: airport.getPlaneBy(Day.WEDNESDAY, 1030)) {
			System.out.println(a);
		}
	}

}
