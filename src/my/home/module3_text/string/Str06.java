package my.home.module3_text.string;

/* Из заданной строки получить новую, повторив каждый символ дважды.*/

public class Str06 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(" Какая-то строка ");
		
		for (int i = 0; i < sb.length(); i += 2) {
			sb.insert(i+1, sb.charAt(i));
		}
		System.out.println(sb);
	}

}
