package my.home.module2_algoritmization.matrix;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class Matr13 {
	
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        Matr.fill(matr);
        Matr.print(matr);
        
        boolean isSorted;
        
        for (int i = 0; i < matr.length; i++) {
            isSorted = false;
            
            while (!isSorted){
                isSorted = true;
                
                for (int j = 0; j < matr[i].length - 1; j++) {

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
        Matr.print(matr);
    }
    
}
