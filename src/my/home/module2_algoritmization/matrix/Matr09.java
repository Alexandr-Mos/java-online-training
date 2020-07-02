package my.home.module2_algoritmization.matrix;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class Matr09 {

	public static void main(String[] args) {
		int[][] matr = new int[5][5];
		Matr.fillWithPositiveNumbers(matr);
		Matr.print(matr);
		int sumArr = 0;
		int maxSum = 0;
		int maxSumIndex = 0;

		for (int i = 0; i < matr.length; i++) {
			sumArr = 0;
			for (int j = 0; j < matr[i].length; j++) {
				sumArr += matr[j][i];
			}
			if (sumArr > maxSum) {
				maxSum = sumArr;
				maxSumIndex = i;
			}
		}

		System.out.println("Столбец с максимальной суммой: " + (maxSumIndex + 1));
	}

}
