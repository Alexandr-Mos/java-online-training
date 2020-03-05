package my.home.algoritmization.Matr;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1 1 1 1
 * 0 1 1 1 1 0
 * 0 0 1 1 0 0
 * 0 0 1 1 0 0
 * 0 1 1 1 1 1
 * 1 1 1 1 1 1
 * ...........*/

public class Matr6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите четное n >>");
		int n = scanner.nextInt();
		while ((n % 2) != 0 || n < 2) {
			System.out.println("Ошибка! Введите n >>");
			n = scanner.nextInt();
		}

		int[][] matr = new int[n][n];

		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i; j++) {
				matr[i][j] = 1;
			}
		}

		for (int i = n - 1; i >= n / 2; i--) {
			for (int j = n - 1 - i; j < n - (n - 1 - i); j++) {
				matr[i][j] = 1;
			}
		}

		Matr.print(matr, n, n);
	}

}
