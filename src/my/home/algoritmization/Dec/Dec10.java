package my.home.algoritmization.Dec;

import java.util.Arrays;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.*/

public class Dec10 {

	public static void main(String[] args) {
		int n = 1234545;
		
		int[] mas = intToArray(n);
		
		System.out.println(Arrays.toString(mas));
	}

	public static int[] intToArray(int n) {
		n = Math.abs(n);
		int copy = n;
		int length = 1;
		
		while (n > 9) {
			n = n / 10;
			length++;
		}
		
		int[] mas = new int[length];
		
		for (int i = mas.length - 1; i >= 0 ; i--) {
			mas[i] = copy % 10;
			copy = copy / 10;
		}
		
		return mas;
	}

}
