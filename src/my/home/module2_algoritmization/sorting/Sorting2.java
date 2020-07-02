package my.home.module2_algoritmization.sorting;

import java.util.Arrays;

/*Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать.*/

public class Sorting2 {

	public static void main(String[] args) {
		int[] mas1 = { -5, 0, 1, 2, 3, 12, 44, 100 };
		int[] mas2 = { -8, -4, 1, 3, 4, 5, 10, 20, 21, 43, 99 };
		int[] rezultat = new int[mas1.length + mas2.length];

		int n = 0;
		int m = 0;

		for (int i = 0; i < rezultat.length; i++) {
			if (n < mas1.length && m < mas2.length && mas1[n] < mas2[m]) {
				rezultat[i] = mas1[n];
				n++;
			} else if (m < mas2.length && n < mas1.length && mas2[m] < mas1[n]) {
				rezultat[i] = mas2[m];
				m++;
			} else if (n < mas1.length) {
				rezultat[i] = mas1[n];
				n++;
			} else {
				rezultat[i] = mas2[m];
				m++;
			}
		}

		System.out.println(Arrays.toString(rezultat));
	}

}
