package my.home.module2_algoritmization.sorting;

import java.util.Arrays;

/*Сортировка обменами. Дана последовательность чисел
a1 <= a2 <= ... <= an.Требуется переставить числа в порядке возрастания. 
Для этого сравниваются два соседних числа  a(i) и a(i+1). 
Если a(i) > a(i+1), то делается перестановка. Так продолжается до тех пор, 
пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

public class Sorting4 {

	public static void main(String[] args) {
		int[] mas = { -9, -5, -3, -1, 0, 0, 2, 5, 7, 9, 12, 20, 29, 30 };

		boolean isSorted = false;
		int buf;
		int count = 0;

		while (!isSorted) {
			isSorted = true;
			
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					isSorted = false;
					
					buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
					
					count++;
				}
			}
		}
		
		System.out.println("Количество перестановок: " + count);
		System.out.println(Arrays.toString(mas));
	}

}
