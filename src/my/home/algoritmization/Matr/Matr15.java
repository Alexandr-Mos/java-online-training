package my.home.algoritmization.Matr;

public class Matr15 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matr[i][j] % 2 != 0) {
                    matr[i][j] = max;
                }
            }
        }
        System.out.println("Результат");
        Matr.print(matr,10,10);
    }
}
