package my.home.module3_text.string;

/*Проверить, является ли заданное слово палиндромом.*/

public class Str03 {
	
	public static void main(String[] args) {
		String str = "йцу уцй";
		StringBuilder sb = new StringBuilder("йцу уцй");
		
		sb.reverse();
		
		if (str.equals(sb.toString())) {
			System.out.println("Палидром");
		} else {
			System.out.println("Обычная строка");
		}
	}

}
