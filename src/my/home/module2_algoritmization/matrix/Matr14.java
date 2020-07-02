package my.home.module2_algoritmization.matrix;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

public class Matr14 {

	public static void main(String[] args) {
		int m = (int) Math.round(Math.random() * 20 + 1);
		int n = (int) Math.round(Math.random() * 20 + 1);
		int[][] matr = new int[m][n];

		if (n > m) {
			System.out.printf("При размере %d(строки) на %d(столбцы) невозможно сформировать матрицу", m, n);
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1 && j < m; j++) {
				matr[j][i] = 1;
			}
		}

		Matr.print(matr);
	}

}
