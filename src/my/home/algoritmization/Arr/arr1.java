package my.home.algoritmization.Arr;

import java.util.Scanner;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

public class arr1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
