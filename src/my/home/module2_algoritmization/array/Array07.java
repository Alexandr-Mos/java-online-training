package my.home.module2_algoritmization.array;

/*Даны действительные числа а1,а2..а2n
Найти max(a1+a2n,a2+a2n-1...)*/

import java.util.Scanner;

public class Array07 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите n");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Неправильное число, введите снова");
			n = scanner.nextInt();
		}

		// заполнение массива случайными числами
		System.out.println("Массив: ");
		double[] mas = new double[2 * n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = Math.random() * 100 - 50;
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// поиск максимального элемента
		double max = Double.MIN_VALUE;

		for (int i = 0; i <= mas.length / 2; i++) {
			double sum;
			sum = mas[i] + mas[2 * n - (i + 1)];

			if (sum > max) {
				max = sum;
			}

		}

		System.out.println("Max = " + max);
	}
	
}
