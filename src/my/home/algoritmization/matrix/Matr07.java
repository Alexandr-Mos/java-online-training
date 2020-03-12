package my.home.algoritmization.matrix;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка N по правилу
 * A[I, J] = sin ((I*I - J*J) / N)
 * и подсчитать количество положительных элементов в ней.
 * */

public class Matr07 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n >>");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Введите n больше нуля >>");
			n = scanner.nextInt();
		}
		
		double[][] matr = new double[n][n];

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matr[i][j] = Math.sin((i * i - j * j) * 1.0 / n);
				if (matr[i][j] > 0) {
					count++;
				}
			}
		}
		
		Matr.print(matr);
		System.out.println("Количество положительных элементов: " + count);
	}
	
}
