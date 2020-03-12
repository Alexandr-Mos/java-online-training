package my.home.algoritmization.decomposition;

import java.util.Scanner;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Dec12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k; // сумма цифр
		int n; // не больше

		System.out.println("Введите K >>");
		k = readInt(scanner);
		System.out.println("Введите N >>");
		n = readInt(scanner);

		int[] mas = getArray(k, n);

		System.out.println("Результат:");
		// System.out.println(Arrays.toString(mas));
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
		System.out.println("Длина массива: " + mas.length);
	}

	// получение массива
	public static int[] getArray(int k, int n) {
		int[] arr = new int[1000];
		int counter = 0;

		for (int i = 0; i <= n; i++) {
			if (sumOfDigits(i) == k) {
				arr[counter] = i;
				counter++;
				if (counter >= arr.length) {
					arr = setSizeOfArray(arr, arr.length + 1000);
				}
			}
		}

		arr = setSizeOfArray(arr, counter);

		return arr;
	}

	// подсчет суммы цифр
	public static int sumOfDigits(int n) {
		int sum = 0;

		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}

		return sum;
	}

	// Изменение размера массива
	public static int[] setSizeOfArray(int[] array, int newLength) {
		int[] newArray;
		try {
			newArray = new int[newLength];
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
			return array;
		}

		if (newLength > array.length) {
			newLength = array.length;
		}

		for (int i = 0; i < newLength; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}

	// Чтение целого числа(Integer) с клавиатуры
	public static int readInt(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("ERROR! Введите целое число!");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
