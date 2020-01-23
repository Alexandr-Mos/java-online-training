package my.home.classes.composition.comp02;

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
