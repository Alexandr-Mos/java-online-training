package my.home.module3_text.chr;

/*Замените в строке все вхождения 'word' на 'letter'.*/

public class Char02 {
	
	public static void main(String[] args) {
		String s = "Word, word, wOrd, word! word";
		char[] chars = s.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			if(isWord(i, chars)) {
				chars = replaceWord(i, chars);
			}
		}
		
		s = new String(chars);
		System.out.println(s);
	}
	
	public static boolean isWord(int fromIndex, char[] array) {
		char[] word = {'w', 'o', 'r', 'd'};
		
		for (int i = 0; i < word.length; i++) {
			if(fromIndex + i >= array.length || word[i] != array[fromIndex + i]) {
				return false;
			}
		}
		return true;
	}
	
	public static char[] replaceWord(int index, char[] array) {
		array = expandCharArray(array, 2);
		array = moveChars(index, 2, array);
		char[] letter = {'l', 'e', 't', 't', 'e', 'r'};
		for(int i = 0; i < letter.length; i++) {
			array[i + index] = letter[i];
		}
		return array;
		
	}
	
	public static char[] moveChars(int fromIndex, int distance, char[] array) {
		for(int i = array.length-1; i > fromIndex + distance ; i--) {
			array[i] = array[i-distance];
		}
		return array;
	}
	
	public static char[] expandCharArray(char[] array, int addSize) {
		char[] newArray = new char[array.length + addSize];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
}
