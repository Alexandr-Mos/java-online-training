package my.home.text.chr;

import java.util.Arrays;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/

public class Char05 {

	public static void main(String[] args) {
		String s = " Gues  how   many      spaces  !  ";
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length - 1;) {
			if (chars[i] == ' ' && chars[i + 1] == ' ') {
				chars = moveChars(i, 1, chars);
			} else {
				i++;
			}
		}

		if (chars[0] == ' ') {
			chars = moveChars(0, 1, chars);
		}

		if (chars[chars.length - 1] == ' ') {
			chars = Arrays.copyOf(chars, chars.length - 1);
		}

		s = new String(chars);
		System.out.println("-" + s + "-");

	}

	public static char[] moveChars(int fromIndex, int distance, char[] array) {
		for (int i = fromIndex; i < array.length - distance; i++) {
			array[i] = array[i + distance];
		}
		return Arrays.copyOf(array, array.length - distance);
	}

}