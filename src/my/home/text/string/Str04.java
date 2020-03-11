package my.home.text.string;

/*С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/

public class Str04 {
	
	public static void main(String[] args) {
		String str = "информатика";
		
		System.out.println(str.charAt(7) + str.substring(3, 5) + str.charAt(7));
	}

}
