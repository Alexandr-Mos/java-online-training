package my.home.text.string;

public class Str10 {
	
	public static void main(String[] args) {
		String str = "Первое предложение. Второе предложение! Тертье предложение?";
		int sentences = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
				sentences++;
			}
		}
		System.out.println("Предложений: " + sentences);
	}

}
