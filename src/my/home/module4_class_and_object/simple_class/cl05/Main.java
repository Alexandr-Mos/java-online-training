package my.home.module4_class_and_object.simple_class.cl05;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class Main {

	public static void main(String[] args) {
		// инициализация по умолчанию
		Counter counter = new Counter();

		System.out.println("Увеличение");
		for (int i = 0; i < 15; i++) {
			System.out.print(counter.state() + " ");
			counter.increment();
		}
		System.out.println();

		System.out.println("Уменьшение");
		for (int i = 0; i < 15; i++) {
			System.out.print(counter.state() + " ");
			counter.decrement();
		}
		System.out.println();

		System.out.println("Инициализация");
		Counter counter2 = new Counter(8);
		System.out.println(counter2.state());

	}

}
