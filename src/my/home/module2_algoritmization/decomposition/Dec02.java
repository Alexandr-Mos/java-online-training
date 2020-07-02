package my.home.module2_algoritmization.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел*/

public class Dec02 {

	public static void main(String[] args) {
		System.out.println(NOD4(78, 294, 570, 36));
	}

	public static int NOD4(int a, int b, int c, int d) {
		return NOD(d, NOD(c, NOD(a, b)));
	}

	// алгоритм Евклида
	public static int NOD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

}
