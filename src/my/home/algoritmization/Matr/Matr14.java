package my.home.algoritmization.Matr;

public class Matr14 {
    public static void main(String[] args) {
        int m = (int) Math.round(Math.random()*50+1);
        int n = (int) Math.round(Math.random()*50+1);
        int[][] matr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1 && j < m; j++) {
                matr[j][i] = 1;
            }
        }
        Matr.print(matr,m,n);
    }
}
