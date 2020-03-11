package my.home.algoritmization.Arr;

import java.util.Scanner;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

public class arr10 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Ошибка! Введите еще раз");
			n = scanner.nextInt();
		}

		// заполнение массива
		System.out.println("Исходный массив");
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 20);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// Сдвиг элементов
		for (int i = 1; i < mas.length; i++) {
			for (int j = i; j < mas.length - 1; j++) {
				mas[j] = mas[j + 1];
				mas[j + 1] = 0;
			}
		}

		System.out.println("Результат");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
	
}
