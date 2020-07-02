package my.home.module2_algoritmization.decomposition;

import java.util.Arrays;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

public class Dec04 {
	
	public static void main(String[] args) {
		int[][] dots = { { 2, 4 }, { 2, 3 }, { 0, 6 }, { 10, 10 }, { 100, 100 }, { 0, 0 }, { 0, -1 } };
		
		maxDist(dots);
	}

	public static void maxDist(int[][] dots) {
		double maxDist = 0;
		double temp = 0;
		int dotA = 0;
		int dotB = 0;
		
		for (int i = 0; i < dots.length; i++) {
			for (int j = 0; j < dots.length; j++) {
				temp = distAB(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
				if (temp > maxDist) {
					maxDist = temp;
					dotA = i;
					dotB = j;
				}
			}
		}
		System.out.println(
				"Максимальное расстояние между" + Arrays.toString(dots[dotA]) + " и " + Arrays.toString(dots[dotB]));
	}

	// находим расстояние между 2-мя точками
	public static double distAB(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(Math.abs(x1 - x), 2) + Math.pow(Math.abs(y1 - y), 2));
	}
	
}