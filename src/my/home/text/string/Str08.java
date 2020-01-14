package my.home.text.string;

public class Str08 {
	
	public static void main(String[] args) {
		String str = "";
		String[] mas = str.split(" ");
		int maxLen = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].length() > maxLen) {
				maxLen = mas[i].length();
				maxIndex = i;
			}
		}
		System.out.println(mas[maxIndex]);
	}

}