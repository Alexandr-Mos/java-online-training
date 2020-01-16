package my.home.algoritmization.Matr;

import java.util.Scanner;

public class Matr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] matr = new double[n][n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = Math.sin((i*i-j*j)*1.0/n);
                if (matr[i][j] > 0) {
                    count++;
                }
            }
        }
        Matr.print(matr,n,n);
        System.out.println("Количество положительных элементов: " + count);
    }
}
