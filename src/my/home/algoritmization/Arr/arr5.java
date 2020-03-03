package my.home.algoritmization.Arr;

/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i*/

public class arr5 {

	public static void main(String[] args) {
		int[] mas = { -2, 2, 78, 65, 12, 0, -45, -23, -74, 1, 12, 8, 13 };
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > (i+1)) {
				System.out.println(" ai: " + mas[i] + " i: " + (i+1));
			}
		}
	}
	
}
