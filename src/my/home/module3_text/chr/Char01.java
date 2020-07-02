package my.home.module3_text.chr;

import java.util.Arrays;

/*Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

public class Char01 {

	public static void main(String[] args) {
		String[] fields = { "camelCase", "firstName", "justThreeWords", "word" };

		for (int i = 0; i < fields.length; i++) {
			char[] chars = fields[i].toCharArray();

			for (int j = 0; j < chars.length; j++) {

				if (chars[j] >= 65 && chars[j] <= 90) {
					chars = expandCharArray(chars, 1);
					chars[j] = (char) (chars[j] + 32);
					chars = moveChars(j, chars);
					chars[j] = '_';
				}

			}

			fields[i] = new String(chars);
		}

		System.out.println(Arrays.toString(fields));
	}

	public static char[] moveChars(int fromIndex, char[] array) {
		for (int i = array.length - 1; i > fromIndex; i--) {
			array[i] = array[i - 1];
		}
		return array;
	}

	public static char[] expandCharArray(char[] array, int addSize) {
		return Arrays.copyOf(array, array.length + addSize);
	}

}
