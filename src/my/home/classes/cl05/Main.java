package my.home.classes.cl05;

public class Main {

	public static void main(String[] args) {
		//инициализация по умолчанию
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
