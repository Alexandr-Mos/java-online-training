package my.home.module3_text.chr;

/*В строке найти количество цифр.*/

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
		
		System.out.println("Количество цифр: " + count);
	}
	
	public static boolean isDigit(char c) {
		return c >= 48 && c <= 57;
	}
	
}
