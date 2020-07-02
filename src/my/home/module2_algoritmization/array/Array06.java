package my.home.module2_algoritmization.array;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/

public class Array06 {
	
	public static void main(String[] args) {
		double[] mas = new double[10000];
		for (int i = 0; i < 10000; i++) {
			mas[i] = i;
		}
		
		double sum = 0;
		boolean isPrime;
		int number;
		for (int i = 1; i < mas.length; i++) { // простые числа начинаются с 2
			number = i + 1; // порядковый номер начинается с 1, а массив с 0. Поэтому + 1
			
			// проверка на простое число
			isPrime = true;
			for (int j = 2; j <= number / 2; j++) { 
				if (number % j == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) { 
				sum += mas[i];
				System.out.println(mas[i]);
			}
		}
		System.out.println("Sum = " + sum);
	}

}
