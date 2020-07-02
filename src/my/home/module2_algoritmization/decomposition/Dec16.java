package my.home.module2_algoritmization.decomposition;

import java.util.Scanner;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class Dec16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите n от 1 до 9 >>");
		int n = readInt(scanner);
		while (n < 1 || n > 9) {
			System.out.println("Введите n от 1 до 9 >>");
			n = readInt(scanner);
		}

		int begin = (int) Math.pow(10, n - 1);
		int end = (int) (Math.pow(10, n) - 1);
		long sum = 0;

		for (int i = begin; i <= end; i++) {
			if (isFullOddNumber(i)) {
				sum += i;
			}
		}

		System.out.println("Sum : " + sum);
		System.out.println("Четные цифры : " + getEvensCount(sum));

	}

	public static int getEvensCount(long n) {
		int count = 0;
		while (n > 0) {
			if (!isOddDigit(getLastDigit(n))) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

	public static boolean isFullOddNumber(int n) {
		while (n > 0) {
			if (!isOddDigit(getLastDigit(n))) {
				return false;
			}
			n = n / 10;
		}
		return true;
	}

	public static boolean isOddDigit(long n) {
		return n % 2 != 0;
	}

	public static long getLastDigit(long n) {
		return n % 10;
	}

	public static int readInt(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("ERROR! Введите целое число!");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
