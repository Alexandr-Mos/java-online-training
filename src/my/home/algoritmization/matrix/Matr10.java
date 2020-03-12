package my.home.algoritmization.matrix;

/*Найти положительные элементы главной диагонали квадратной матрицы*/

public class Matr10 {

	public static void main(String[] args) {
		int[][] matr = new int[5][5];
		Matr.fill(matr);
		Matr.print(matr);
		
		System.out.println("Положительные элементы главной диагонали:");
		for (int i = 0; i < matr.length; i++) {
			if (matr[i][i] > 0) {
				System.out.print(matr[i][i] + " ");
			}
		}
	}

}
