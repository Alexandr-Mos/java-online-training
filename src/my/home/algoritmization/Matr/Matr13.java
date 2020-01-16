package my.home.algoritmization.Matr;

public class Matr13 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr,10,10);
        for (int i = 0; i < 10; i++) {
            boolean isSorted = false;
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < 9; j++) {

                    if (matr[j][i] < matr[j+1][i]) { //для сортировки в обратном порядке поменять знак
                        isSorted = false;
                        int buf = matr[j][i];
                        matr[j][i] = matr[j+1][i];
                        matr[j+1][i] = buf;

                    }
                }
            }
        }
        System.out.println("Результат:");
        Matr.print(matr,10,10);
    }
}
