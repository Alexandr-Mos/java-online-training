package my.home.text.string;

public class Str07 {
	
	public static void main(String[] args) {
		String str = "  abc cde def  ";
		
		str = str.replace(" ", "");
		for (int i = 0; i < str.length(); i++) {
			String beg = str.substring(0, i);
			String end = str.substring(i+1, str.length());
			String chr = str.substring(i, i + 1);
			
			if (end.contains(chr)) {
				end = end.replace(chr, "");
			}
			str = beg + chr + end;
		}
		System.out.println(str);
	}

}
