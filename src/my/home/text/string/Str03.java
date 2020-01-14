package my.home.text.string;

public class Str03 {
	
	public static void main(String[] args) {
		String str = "йцу уцй";
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		if (str.equals(sb.toString())) {
			System.out.println("Палидром");
		} else {
			System.out.println("Обычная строка");
		}
	}

}
