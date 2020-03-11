package my.home.algoritmization.Dec;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Dec17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = readInt(scanner);

		if (n < 0) {
			System.out.println("Количество шагов : infinity");
		} else {
			System.out.println("Количество шагов : " + getSteps(n));
		}
	}

	public static int getSteps(int n) {
		int steps = 0;

		while (n > 0) {
			n = n - getSumOfDigits(n);
			steps++;
		}

		return steps;
	}

	public static int getSumOfDigits(int n) {
		int sum = 0;

		while (n > 0) {
			sum += getLastDigit(n);
			n = removeLastDigit(n);
		}

		return sum;
	}

	public static int getLastDigit(int n) {
		return n % 10;
	}

	public static int removeLastDigit(int n) {
		return n / 10;
	}

	public static int readInt(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("ERROR! Введите целое число!");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
