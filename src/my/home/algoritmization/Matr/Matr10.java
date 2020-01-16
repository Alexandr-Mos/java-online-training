package my.home.algoritmization.Matr;

public class Matr10 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);
        for (int i = 0; i < 10; i++) {
            if (matr[i][i] > 0) {
                System.out.println(matr[i][i]);
            }
        }
    }
}
