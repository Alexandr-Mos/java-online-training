package my.home.algoritmization.array;

import java.util.Scanner;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них. */

public class Array09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите n");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Ошибка! Введите еще раз");
			n = scanner.nextInt();
		}

		int[] mas = new int[n]; // исходный массив
		int[] mas2 = new int[n]; // массив для записи количества совпадений
		
		System.out.println("Исходный массив");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 3);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// считаем количество совпадений и записываем в mas2
		int counter;
		int counterMax = Integer.MIN_VALUE;
		for (int i = 0; i < mas.length; i++) {
			counter = 1;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					counter++;
				}
			}
			mas2[i] = counter;
			if (counter > counterMax) {
				counterMax = counter;
			}
		}

		// находим максимальные совпадения и выбираем минимальное число
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < mas2.length; i++) {
			if (mas2[i] == counterMax && mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("Результат: " + min);

	}

}
