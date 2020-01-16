package my.home.algoritmization.Matr;

public class Matr11 {
    public static void main(String[] args) {
        int[][] matr = new int[10][20];
        Matr.fillTo15(matr,10,20);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 15; j++) {
                if (matr[i][j] == 5){
                    count++;
                }
            }
            if (count >= 3){
                System.out.println("Строка " + (i+1));
            }
        }
    }
}
