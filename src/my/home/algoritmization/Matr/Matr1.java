package my.home.algoritmization.Matr;

/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. */

public class Matr1 {

	public static void main(String[] args) {
		int[][] matr = new int[5][10];
		Matr.fill(matr, 5, 10);
		
		System.out.println("Столбцы:");
		
		for (int j = 0; j < 10; j++) {
			// проверка условия
			if (j % 2 == 0 && matr[0][j] > matr[matr.length - 1][j]) {
				// вывод на экран
				for (int i = 0; i < matr.length; i++) {
					System.out.print(matr[i][j] + " ");
				}
				System.out.println();
				
			}
			
		}
	}

}
