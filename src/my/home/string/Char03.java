package my.home.string;

public class Char03 {
	public static void main(String[] args) {
		String s = "Pr0st0e pr3d10zhen13";
		char[] chars = s.toCharArray();
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if(isDigit(chars[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isDigit(char c) {
		return c >= 48 && c <= 57 ? true : false;
	}
}
