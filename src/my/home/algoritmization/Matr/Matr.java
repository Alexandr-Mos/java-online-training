package my.home.algoritmization.Matr;

public class Matr {
	// заполнение матрицы случайными числами
	static void fill(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = (int) Math.round(Math.random() * 18 - 9);
			}
		}
	}

	// заполнение матрицы случайными положительными числами
	static void fillWithPositiveNumbers(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = (int) Math.round(Math.random() * 9);
			}
		}
	}

	
	static void fillTo15(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = (int) Math.round(Math.random() * 15);
			}
		}
	}

	static void print(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print(matr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void print(double[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.printf("%8.2f", matr[i][j]);
			}
			System.out.println();
		}
	}
}
