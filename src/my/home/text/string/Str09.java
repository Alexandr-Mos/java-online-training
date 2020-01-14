package my.home.text.string;

public class Str09 {
	
	public static void main(String[] args) {
		String str = "Some TeXt:)";
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
