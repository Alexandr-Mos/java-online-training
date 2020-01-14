package my.home.text.string;

public class Str01 {
	
	public static void main(String[] args) {
		String str = " 1  2   3    4     5      6";
		int i = 0;
		int max = Integer.MIN_VALUE;
		
		while (i < str.length()) {
			if (str.charAt(i) == ' ') {
				int len = getLenOfSpc(i, str);
				
				if (len > max) {
					max = len;
				}
				i += len;
			} else {
				i++;
			}
		}
		System.out.println(max);
	}
	
	public static int getLenOfSpc(int i, String str) {
		int len = 0;
		
		while (i < str.length() && str.charAt(i) == ' ') {
			len++;
			i++;
		}
		return len;
	}
	
}
