package my.home.algoritmization.array;

/*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы*/

public class Array04 {
	
	public static void main(String[] args) {
		double[] mas = { -1.5465, -74879, 0, 465.2, 55.2154, 0, -0.24546 };
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int max_index = 0;
		int min_index = 0;
		double buff = 0;
		
		//находим индексы максимального и минимального элементов
		System.out.print("Исходный массив: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				max_index = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				min_index = i;
			}
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		
		//меняем найденные элементы местами
		buff = mas[max_index];
		mas[max_index] = mas[min_index];
		mas[min_index] = buff;
		
		//вывод на экран результата
		System.out.print("Результат: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
	
}
