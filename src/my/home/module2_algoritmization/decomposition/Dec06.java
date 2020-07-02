package my.home.module2_algoritmization.decomposition;

import java.util.Scanner;

/* Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми*/

public class Dec06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("Введите 3 числа >>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (NOD3(a, b, c) == 1) {
			System.out.println("Числа взаимно простые");
		} else {
			System.out.println("Числа не взаимно простые");
		}
	}

	public static int NOD3(int a, int b, int c) {
		return NOD(a, NOD(b, c));
	}

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
