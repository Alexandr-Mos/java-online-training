package my.home.text.string;

/* Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.*/

public class Str10 {
	
	public static void main(String[] args) {
		String str = "Первое предложение. Второе предложение! Тертье предложение? Не совсем предложение";
		int sentences = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
				sentences++;
			}
		}
		
		System.out.println("Предложений: " + sentences);
	}

}
