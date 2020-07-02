package my.home.module1_first_level.cycle;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Cycle2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int h = scanner.nextInt();

		for (int i = a; i <= b; i += h) {
			if (i > 2) {
				System.out.print(i + " ");
			} else {
				System.out.print(-i + " ");
			}
		}
	}

}
