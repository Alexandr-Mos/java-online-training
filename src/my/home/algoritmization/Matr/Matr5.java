package my.home.algoritmization.Matr;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 * 1 1 1 1 1 1
 * 2 2 2 2 2 0
 * 3 3 3 3 0 0
 * . . . . . . 
 * */

public class Matr5 {

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

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				matr[i][j] = i + 1;
			}
		}
		Matr.print(matr, n, n);

	}

}
