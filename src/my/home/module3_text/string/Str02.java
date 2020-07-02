package my.home.module3_text.string;

/*В строке вставить после каждого символа 'a' символ 'b'.*/

public class Str02 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("a, AaAaaAAA, Sparta");

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a') {
				sb.insert(i + 1, 'b');
				i++;
			}
		}
		System.out.println(sb);
	}

}
