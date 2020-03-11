package my.home.text.string;

import java.util.Scanner;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/

public class Str09 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите строку");
		String str = scanner.nextLine();
		int lowerCase = 0;
		int upperCase = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				upperCase++;
			} else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				lowerCase++;
			}
		}
		
		System.out.printf("Прописных - %s, строчных - %s", upperCase, lowerCase);
	}

}
