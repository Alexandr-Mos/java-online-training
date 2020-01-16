package my.home.algoritmization.Matr;

public class Matr3 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);
        int k = 3;
        int p = 7;

        System.out.println("Строка:");
        for (int i = 0; i < 10; i++) {
            System.out.print(matr[k-1][i] + " ");
        }
        System.out.println();
        System.out.println("Столбец:");
        for (int i = 0; i < 10; i++) {
            System.out.print(matr[i][p-1] + " ");
        }
    }
}
