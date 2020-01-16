package my.home.algoritmization.Matr;

import java.util.Scanner;

public class Matr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matr = new int[n][n];
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i; j++) {
                matr[i][j] = 1;
            }
        }
        for (int i = n-1; i >= n/2; i--) {
            for (int j = n-1-i; j < n-(n-1-i); j++) {
                matr[i][j] = 1;
            }
        }
        Matr.print(matr,n,n);
    }
}
