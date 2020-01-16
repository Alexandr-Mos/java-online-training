package my.home.algoritmization.Matr;

public class Matr9 {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fillPos(matr,10,10);
        int sumArr;
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < 10; i++) {
            sumArr = 0;
            for (int j = 0; j < 10; j++) {
                sumArr += matr[j][i];
            }
            if (sumArr > maxSum){
                maxSum = sumArr;
                maxSumIndex = i;
            }
        }
        System.out.println("Столбец с максимальной суммой: " + (maxSumIndex+1));
    }
}
