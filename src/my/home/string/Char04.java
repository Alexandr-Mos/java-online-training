package my.home.string;

public class Char04 {

	public static void main(String[] args) {
		String s = "123 2 sdfs45 qwe123rty9! 1";
		char[] chars = s.toCharArray();
		int count = 0;
		for (int i = 0; i < chars.length; ) {
			if (isDigit(chars[i])) {
				 count++;
				 i += getLenOfNumber(i, chars);
			} else {
				 i++;
			}
		}
		System.out.println(count);
	}
	
	public static int getLenOfNumber(int begin, char[] array) {
		int len = 0;
		int i = begin;
		while (i < array.length && isDigit(array[i])) {
			len++;
			i++;
		}
		return len;
	}
	
	public static boolean isDigit(char c) {
		return c >= 48 && c <= 57 ? true : false;
	}
}
