package my.home.algoritmization.Matr;

public class Matr1 {
    public static void main(String[] args) {
        int[][] matr = new int[5][10];
        Matr.fill(matr,5,10);
        System.out.println("Столбцы:");
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0 && matr[0][j] > matr[4][j]){
                for (int i = 0; i < 5; i++) {
                    System.out.print(matr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
