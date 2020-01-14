package my.home.text.string;

public class Str05 {
	
	public static void main(String[] args) {
		String str = "aAaaa bbab a zza";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ("a".equalsIgnoreCase(str.substring(i, i+1))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
