package my.home.algoritmization.Matr;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class Matr3 {
	
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr);
        Matr.print(matr);
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
