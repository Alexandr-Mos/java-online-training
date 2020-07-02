package my.home.module2_algoritmization.sorting;

import java.util.Arrays;

/* Сортировка выбором. Дана последовательность чисел
a1 <= a2 <= ... <= an.
Требуется переставить элементы так, чтобы они были расположены по убыванию. 
Для этого в массиве, начиная с первого, выбирается наибольший элемент 
и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, 
эта процедура повторяется. Написать алгоритм сортировки выбором.*/

public class Sorting3 {

	public static void main(String[] args) {
		int[] mas = { -9, -5, -3, -1, 0, 0, 2, 5, 7, 9, 12, 20, 29, 30 };
		int count = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			int maxIndex = i;
			
			for (int j = i; j < mas.length; j++) {
				if (mas[j] > mas[maxIndex]) {
					maxIndex = j;
				}
			}
			
			int buf = mas[i];
			mas[i] = mas[maxIndex];
			mas[maxIndex] = buf;
			
			count++;
		}
		
		System.out.println("Количество перестановок: " + count);
		System.out.println(Arrays.toString(mas));
	}

}
