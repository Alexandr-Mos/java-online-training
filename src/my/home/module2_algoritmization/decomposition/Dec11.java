package my.home.module2_algoritmization.decomposition;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр*/

public class Dec11 {

	public static void main(String[] args) {
		int a = 1243420;
		int b = 235453;

		System.out.println(witchLonger(a, b));
	}

	public static int witchLonger(int a, int b) {
		if (getLengthOfNumber(a) > getLengthOfNumber(b)) {
			return a;
		} else if (getLengthOfNumber(a) == getLengthOfNumber(b)) {
			return 0;
		} else {
			return b;
		}
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

}
