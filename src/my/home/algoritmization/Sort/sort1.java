package my.home.algoritmization.Sort;

import java.util.Arrays;
import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/

public class sort1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] mas1 = { 1, 23, 1, 2, 3, 12, 44, 1 };
		int[] mas2 = { 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
		int k;

		System.out.println("Mas1 = " + Arrays.toString(mas1));
		System.out.println("Mas2 = " + Arrays.toString(mas2));
		System.out.print("Enter k >>");

		k = scanner.nextInt();
		while (k < 0 || k > mas1.length) {
			System.out.print("Error! Enter k >> ");
			k = scanner.nextInt();
		}

		int[] rezultat = new int[mas1.length + mas2.length];

		int z = 0;

		for (int i = 0; i < rezultat.length; i++) {
			if (i == k) {
				for (int j = 0; j < mas2.length; j++) {
					rezultat[i] = mas2[j];
					i++;
				}
				i--; // главный цикл (i) увеличит переменную в конце итерации
			} else {
				rezultat[i] = mas1[z];
				z++;
			}
		}

		System.out.println(Arrays.toString(rezultat));
	}

}
