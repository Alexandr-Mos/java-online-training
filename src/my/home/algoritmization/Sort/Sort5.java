package my.home.algoritmization.Sort;

import java.util.Arrays;

/*Сортировка вставками. Дана последовательность чисел a1,a2,...,an.
Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
Пусть a1,a2,...,ai - упорядоченная последовательность, т. е. a1 <= a2 <=...<= an. 
Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока 
все элементы от i + 1 до n не будут перебраны. 
	Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/

public class Sort5 {

	public static void main(String[] args) {
		           // 0  1  2  3  4  5   6  7   8  9  10
		int[] mas = { 1, 3, 3, 3, 5, 88, 2, 0, -5, 4, 11 };
		int i = 6; // индекс конца подпоследовательности
		int count = 0;

		for (int j = i; j < mas.length; j++) {
			// ищем место вставки
			int index = binSearch(mas, 0, i, mas[j]);

			// передвигаем элементы
			int buf = mas[j];
			for (int k = j; k > index; k--) {
				mas[k] = mas[k - 1];
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
