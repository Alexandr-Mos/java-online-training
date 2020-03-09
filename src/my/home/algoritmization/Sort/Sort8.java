package my.home.algoritmization.Sort;

import java.util.Arrays;

/*Даны дроби
p1/q1, p2/q2, ... pn/qm (pi qi, - натуральные). 
Составить программу, которая приводит эти дроби к общему знаменателю 
и упорядочивает их в порядке возрастания.*/

public class Sort8 {

	public static void main(String[] args) {
		int[] mas1 = { 3, 6, 2,  8, 4, 2, 9, 13, 28};
		int[] mas2 = { 4, 2, 7, 7, 6, 2, 7,  3, 14};
		int NOK = mas2[0];
		
		for (int i = 1; i < mas2.length; i++) {
			NOK = NOK(NOK, mas2[i]);
		}
		
		for (int i = 0; i < mas2.length; i++) {
			mas1[i] = (NOK / mas2[i]) * mas1[i];
			mas2[i] = NOK;
		}
		
		int maxIndex = 0;
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[maxIndex] < mas1[i]) {
				int buf = mas1[maxIndex];
				mas1[maxIndex] = mas1[i];
				mas1[i] = mas1[maxIndex];
				
				buf = mas2[maxIndex];
				mas2[maxIndex] = mas2[i];
				mas2[i] = mas2[maxIndex];
				
				maxIndex = i;
				***********
			}
		}
		
		System.out.println(NOK);
		System.out.println(Arrays.toString(mas1));
		System.out.println(Arrays.toString(mas2));
	}
	
	public static int NOK(int a, int b) {
		return a * b / NOD(a, b);
	}

	// алгоритм Евклида
	public static int NOD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

}
