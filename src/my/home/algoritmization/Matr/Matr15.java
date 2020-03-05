package my.home.algoritmization.Matr;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/

public class Matr15 {
	
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr);
        Matr.print(matr);
        
        // поиск максимального элемента
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                }
            }
        }
        
        // замена нечетных элементов на максимальный
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matr[i][j] % 2 != 0) {
                    matr[i][j] = max;
                }
            }
        }
        
        System.out.println("Результат:");
        Matr.print(matr);
    }
    
}
