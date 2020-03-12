package my.home.algoritmization.matrix;

/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. */

public class Matr01 {

	public static void main(String[] args) {
		int[][] matr = new int[5][10];
		Matr.fill(matr);
		Matr.print(matr);

		System.out.println("Столбцы:");

		for (int j = 0; j < 10; j++) {
			if (j % 2 == 0 && matr[0][j] > matr[matr.length - 1][j]) {
				
				for (int i = 0; i < matr.length; i++) {
					System.out.print(matr[i][j] + " ");
				}
				System.out.println();

			}
		}
	}

}
