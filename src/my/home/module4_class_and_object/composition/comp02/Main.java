package my.home.module4_class_and_object.composition.comp02;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car("Toyota");
		car.go(30);
		car.fillFuel(100);
		car.go(30);
		car.stop();
		car.getModel();
		car.changeWheel("left-back", new Wheel("left-back-new"));
	}
}
