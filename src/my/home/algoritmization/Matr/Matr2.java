package my.home.algoritmization.Matr;

public class Matr2 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);

        System.out.println("Диагональ 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(matr[i][i] + " ");
        }
        System.out.println();
        System.out.println("Диагональ 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print(matr[9-i][i] + " ");
        }
    }
}