package my.home.algoritmization.Matr;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Matr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    matr[i][j] = j+1;
                } else {
                    matr[i][j] = 10-j;
                }
            }
        }
        Matr.print(matr,n,n);
    }
}
