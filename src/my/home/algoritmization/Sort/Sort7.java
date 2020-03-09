package my.home.algoritmization.Sort;

import java.util.Arrays;

/*Пусть даны две неубывающие последовательности действительных чисел
a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1 <= b2 <=...<= bm в первую последовательность так, чтобы новая последовательность 
оставалась возрастающей.*/

public class Sort7 {
	
	public static void main(String[] args) {
		int[] mas1 = { -5,  0, 1, 2, 3, 12, 44, 100};
		int[] mas2 = { -8, -4, 1, 3, 4,  5, 10,  20, 21, 43, 99 };
		int[] rezultat = new int[mas1.length + mas2.length];
		int count = 0;

		for (int i = 0; i < mas2.length; i++) {
			// ищем место вставки
			int index = binSearch(mas1, 0, mas1.length, mas2[i]);

			// передвигаем элементы
			int buf = mas1[i];
			for (int k = i; k > index; k--) {
				mas1[k] = mas1[k - 1];
				count++;
			}

			// вставляем на освободившееся место
			mas[index] = buf;
			count++;

			// сдвигаем границу подпоследовательности, т.к. она увеличилась
			i++;
		}

		System.out.println("Количество перестановок: " + count);
		System.out.println(Arrays.toString(mas));
	}

	private static int binSearch(int[] mas, int sortedBegin, int soredEnd, int number) {
		int middle = (sortedBegin + soredEnd) / 2;

		if ((soredEnd - sortedBegin) / 2 == 0) {
			if (mas[middle] > number) {
				return middle;
			} else {
				return middle + 1;
			}
		}

		if (mas[middle] > number) {
			return binSearch(mas, sortedBegin, middle, number);
		} else {
			return binSearch(mas, middle, soredEnd, number);
		}
	}
}
