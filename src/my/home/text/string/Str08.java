package my.home.text.string;

import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/

public class Str08 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите строку >>");
		String str = scanner.nextLine();
		
		String[] mas = str.split(" ");
		int maxIndex = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].length() > mas[maxIndex].length()) {
				maxIndex = i;
			}
		}
		System.out.println("Самое длинное слово: " + mas[maxIndex]);
	}

}