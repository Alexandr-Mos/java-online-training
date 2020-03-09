package my.home.algoritmization.Sort;

import java.util.Arrays;

/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, 
то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и 
сдвигаются на один элемент назад. Составить алгоритм этой сортировки.*/

public class Sort6 {

	public static void main(String[] args) {
		double[] n = { 2.0, 20.0, 13.0, 5.5, 0.0, -0.1, -5.6, 1.1, -6.6, 0.5 };
		int count = 0;

		for (int i = 0; i < n.length - 1;) {
			if (n[i] <= n[i + 1]) {
				i++;
			} else {
				double buf = n[i];
				n[i] = n[i + 1];
				n[i + 1] = buf;

				count++;
				if (i > 0) {
					i--;
				}
			}
		}

		System.out.println("Количество перестановок: " + count);
		System.out.println(Arrays.toString(n));
	}

}
