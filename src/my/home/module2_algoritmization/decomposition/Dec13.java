package my.home.module2_algoritmization.decomposition;

import java.util.Scanner;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/

public class Dec13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		while (n > Integer.MAX_VALUE / 2 || n <= 2) {
			System.out.printf("Введите N от 2 до %d >>\n", Integer.MAX_VALUE / 2);
			n = readInt(scanner);
		}

		System.out.println("Близнецы:");
		showPairs(n);
	}

	public static void showPairs(int n) {
		
		for (int i = n; i <= 2 * n - 2; i ++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println(i + " " + (i + 2));
				i += 2; // пропускаем числа между близнецами
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int readInt(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.println("ERROR! Введите целое число!");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
