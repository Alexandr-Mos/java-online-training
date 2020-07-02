package my.home.module2_algoritmization.matrix;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

public class Matr11 {

	public static void main(String[] args) {
		int[][] matr = new int[10][20];
		int count;

		Matr.fillTo15(matr);
		Matr.print(matr);

		for (int i = 0; i < matr.length; i++) {
			count = 0;
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] == 5) {
					count++;
				}
			}

			if (count >= 3) {
				System.out.println("Строка " + (i + 1));
			}
		}
	}

}
