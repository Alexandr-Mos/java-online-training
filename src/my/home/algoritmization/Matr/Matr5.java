package my.home.algoritmization.Matr;

import java.util.Scanner;

public class Matr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                matr[i][j] = i + 1;
            }
        }
        Matr.print(matr,n,n);

    }
}
