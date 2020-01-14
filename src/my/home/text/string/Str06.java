package my.home.text.string;

public class Str06 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(" Какая-то строка ");
		
		for (int i = 0; i < sb.length(); i += 2) {
			sb.insert(i+1, sb.charAt(i));
		}
		System.out.println(sb);
	}

}
