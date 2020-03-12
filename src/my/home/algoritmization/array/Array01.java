package my.home.algoritmization.array;

import java.util.Scanner;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

public class Array01 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите k >>");
		int k = scanner.nextInt();
		int[] mas = new int[1000];

		//заполнение массива числами
		for (int i = 1; i <= mas.length; i++) {
			mas[i - 1] = i;
		}
		
		//нахождение суммы
		long summ = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0)
				summ += mas[i];
		}
		
		System.out.println(summ);
	}
}
