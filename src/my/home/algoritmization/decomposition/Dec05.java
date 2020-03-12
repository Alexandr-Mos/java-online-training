package my.home.algoritmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Dec05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n >>");
		int n = scanner.nextInt();
		while (n < 2) {
			System.out.println("Введите n больше 2 >>");
			n = scanner.nextInt();
		}

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 20);
		}
		System.out.println(Arrays.toString(mas));

		System.out.println(find2max(mas));
		

	}

	public static int find2max(int[] mas) {
		Arrays.sort(mas);
		
		int first = mas[mas.length - 1];
		int second = mas[mas.length - 1];
		
		for (int i = mas.length - 1; i >= 0; i--) {
			if (mas[i] < first) {
				second = mas[i];
				break;
			}
		}
		
		return second;
	}

}
