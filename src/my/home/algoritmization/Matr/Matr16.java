package my.home.algoritmization.Matr;

import java.util.Scanner;

/*
Магическая константа М = n(n*n+1)/2
 */
/*
Здравствуйте. Вопрос по задаче 2.2.16 (магические квадраты). Вы, в предыдущих ответах на вопросы, говорили, что эту задачу надо решать через перебор всех перестановок в матрице. С матрицей 3х3 компьютер справляется, с матрицей 4х4 вариантов становится слишком много и, по моим подсчётам, компьютер должен трудится 10 суток чтобы их перебрать. Не говоря уже о бОльших матрицах. Вопрос: так всё и задумывалось?

я реализовал так как говорили на вебинаре, берем линейный массив всех чисел квадрата от 1 до n^2, через n выражаем все номера элементов в матрице n x n, и записываем соответствующие правила проверки рядов, столбцов и диагоналей на сумму. Потом свапаем любые 2 элемента в линейном массиве до тех пор пока не появится магический квадрат, n=3 и 4 ищет быстро, 5 долго, 6 не пробовал.
*/

public class Matr16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n*n];
        int[][] matr = new int[n][n];

        for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
        
        boolean isMagic = false;
        
        while (!isMagic) {
        	swap(array);
        	isMagic = isMagic(array, matr);
        }
        
        for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				System.out.print(matr[i][j] + " ");
			}
			System.out.println();
		}
        
    }
    
    //меняем местами 2 случайные ячейки
    public static void swap(int[] array) {
    	int a;
    	int b;
    	a = (int) (Math.random() * array.length);
    	b = (int) (Math.random() * array.length);
    	int temp;
    	temp = array[a];
    	array[a] = array[b];
    	array[b] = temp;
    }
    
    //преобразовываем линейный массив в матрицу и проверяем суммы
    public static boolean isMagic(int[] array, int[][] matr) {
    	int c = 0;
    	for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				matr[i][j] = array[c];
				c++;
			}
		}
    	return chekSum(matr);
    }
    
    //проверяем суммы строк, столбцов, диагоналей
    public static boolean chekSum(int[][] matr) {
    	int magicConst = matr.length * (matr.length * matr.length + 1) / 2;
    	int sum = 0;
    	
    	for (int i = 0; i < matr.length; i++) {
    		for (int j = 0; j < matr[i].length; j++) {
    			sum += matr[i][j];
			}
			if (sum != magicConst) {
				return false;
			}
			sum = 0;
		}
    	sum = 0;
    	for (int i = 0; i < matr.length; i++) {
    		for (int j = 0; j < matr[i].length; j++) {
    			sum += matr[j][i];
			}
			if (sum != magicConst) {
				return false;
			}
			sum = 0;
		}
    	sum = 0;
    	for (int i = 0; i < matr.length; i++) {
    		sum += matr[i][i];
		}
    	if (sum != magicConst) {
			return false;
		}
    	sum = 0;
    	for (int i = 0; i < matr.length; i++) {
    		sum += matr[i][matr.length - i - 1];
		}
    	if (sum != magicConst) {
			return false;
		}
    	
    	return true;
    }
}
