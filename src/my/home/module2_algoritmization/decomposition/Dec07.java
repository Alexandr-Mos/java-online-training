package my.home.module2_algoritmization.decomposition;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class Dec07 {

	public static void main(String[] args) {

		System.out.println(sumFactFrom1To9());

	}

	public static int sumFactFrom1To9() {
		int sum = 0;
		for (int i = 1; i <= 9; i += 2) {
			sum += fact(i);
		}
		return sum;
	}

	public static int fact(int n) {
		if (n <= 0) {
			return 0;
		}
			
		return n + fact(n - 1);
	}

}
