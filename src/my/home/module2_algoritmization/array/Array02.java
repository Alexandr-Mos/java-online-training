package my.home.module2_algoritmization.array;

import java.util.Scanner;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

public class Array02 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double z = scanner.nextDouble();
		double[] mas = { 1.2, 2.4, 3.6, 4.0, 5.2, 6.4, 7.6, 8.8, 10.0 };
		
		//замена чисел и подсчет количества замен
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
			System.out.print(mas[i] + " ");
		}

		System.out.println("\n" + count);
	}
	
}
