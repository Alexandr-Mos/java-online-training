package my.home.algoritmization.matrix;

/* Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Matr12 {

	public static void main(String[] args) {
		int[][] matr = new int[10][10];
		Matr.fill(matr);
		Matr.print(matr);

		boolean isSorted;

		for (int i = 0; i < matr.length; i++) {
			isSorted = false;

			while (!isSorted) {
				isSorted = true;

				for (int j = 0; j < matr[i].length - 1; j++) {

					if (matr[i][j] > matr[i][j + 1]) { // для сортировки в обратном порядке поменять знак
						isSorted = false;
						int buf = matr[i][j];
						matr[i][j] = matr[i][j + 1];
						matr[i][j + 1] = buf;

					}

				}
			}

		}

		System.out.println("Результат:");
		Matr.print(matr);
	}

}
