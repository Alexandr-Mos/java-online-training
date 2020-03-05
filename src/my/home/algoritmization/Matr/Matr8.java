package my.home.algoritmization.Matr;

import java.util.Scanner;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

public class Matr8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matr = new int[10][10];
		int k;
		int p;
		Matr.fill(matr, 10, 10);
		Matr.print(matr, 10, 10);

		System.out.println("Введите номера столбцов для замены >>");
		k = scanner.nextInt();
		p = scanner.nextInt();
		while (k < 1 || k > 10 || p < 1 || p > 10) {
			System.out.println("Неправильные значения, введите еще раз >>");
			k = scanner.nextInt();
			p = scanner.nextInt();
		}

		int buf;
		for (int i = 0; i < 10; i++) {
			buf = matr[i][k - 1];
			matr[i][k - 1] = matr[i][p - 1];
			matr[i][p - 1] = buf;
		}

		System.out.println("Результат:");
		Matr.print(matr, 10, 10);
	}

}
