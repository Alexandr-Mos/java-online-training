package my.home.module2_algoritmization.decomposition;

import java.util.Scanner;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.*/

//Сделал не по условию.(Ошибка в определении числа Армстронга). По правильному определению числа Армстронга нужно складывать цифры возведеные в степень
public class Dec14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите k >>");
		int k = readInt(scanner);

		showAllArmstrNumb(k);
	}

	public static void showAllArmstrNumb(int k) {
		for (int i = 1; i <= k; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int n) {
		int sum = 0;
		int digit = 0;
		int copy = n;
		int length = getLengthOfNumber(n);

		while (n > 0) {
			digit = n % 10;
			sum += Math.pow(digit, length);
			n = n / 10;
		}

		return sum == copy;

	}

	public static int getLengthOfNumber(int num) {
		num = Math.abs(num);
		int counter = 1;

		while (num > 9) {
			counter++;
			num = num / 10;
		}

		return counter;

	}

	public static int readInt(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("ERROR! Введите целое число!");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
