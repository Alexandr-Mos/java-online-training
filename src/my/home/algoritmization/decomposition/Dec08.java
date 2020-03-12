package my.home.algoritmization.decomposition;

import java.util.Arrays;

/* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

public class Dec08 {

	public static void main(String[] args) {
		int k = 3;
		int m = 6;
		int[] mas = new int[10];

		if (k < 0 || m > mas.length || m - k != 3) {
			System.out.println("Неправильно выбран диапазон");
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 20);
		}
		System.out.println(Arrays.toString(mas));

		System.out.println(sum(k - 1, m - 1, mas));

	}

	public static int sum(int k, int m, int[] mas) {
		int sum = 0;
		for (int i = k; i < m; i++) {
			sum += mas[i];
		}
		return sum;
	}

}
