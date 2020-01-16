package my.home.algoritmization.Matr;

import java.util.Scanner;

public class Matr8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);
        int buf;
        for (int i = 0; i < 10; i++) {
            buf = matr[i][k-1];
            matr[i][k-1] = matr[i][p-1];
            matr[i][p-1] = buf;
        }
        System.out.println("Результат:");
        Matr.print(matr,10,10);
    }
}
