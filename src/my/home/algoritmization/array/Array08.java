package my.home.algoritmization.array;

import java.util.Scanner;

/*Дана последовательность целых чисел a1, a2, ... an
Образовать новую последовательность, выбросив из исходной те члены, 
которые равны min( a1, a2, ... an )*/

public class Array08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n");
		int n = scanner.nextInt();
		while (n < 1) {
			System.out.println("Неправильное n. Введите еще раз");
			n = scanner.nextInt();
		}

		// создаем и заполняем массив
		System.out.println("Исходный массив");
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 5);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// ищем минимальный элемент
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}

		// удаляем минимальные элементы
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == min) {

				for (int j = i; j < mas.length - (count + 1); j++) {
					mas[j] = mas[j + 1];
				}
				count++;
				i--;

			}
		}

		// при необходимости создаем новый массив с размером mas.length-count и
		// перезаписываем
		System.out.println("Количество совпадений " + count);
		System.out.println("Результат");
		for (int i = 0; i < mas.length - count; i++) {
			System.out.print(mas[i] + " ");
		}

	}

}
