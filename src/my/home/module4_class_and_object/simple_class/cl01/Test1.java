package my.home.module4_class_and_object.simple_class.cl01;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

public class Test1 {
	private int a;
	private int b;

	public void print() {
		System.out.println("Test1 [a=" + a + ", b=" + b + "]");
	}

	public int getSum() {
		return a + b;
	}

	public int getMax() {
		return a > b ? a : b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
