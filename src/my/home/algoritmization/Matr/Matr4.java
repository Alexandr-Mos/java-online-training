package my.home.algoritmization.Matr;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
1  2   3  ... n
n n-1 n-2 ... 1
1  2   3  ... n
n n-1 n-2 ... 1
...............
*/

public class Matr4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите четное n >>");
		int n = scanner.nextInt();
		while ((n % 2) != 0 || n < 2 ) {
			System.out.println("Ошибка! Введите n >>");
			n = scanner.nextInt();
		}

		int[][] matr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					matr[i][j] = j + 1;
				} else {
					matr[i][j] = n - j;
				}
			}
		}
		
		Matr.print(matr, n, n);
	}

}
