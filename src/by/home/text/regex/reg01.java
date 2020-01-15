package by.home.text.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class reg01 {
	
	public static void main(String[] args) {
		String story = "Жил-был!!!!! принц, он хотел взять себе в жены принцессу, да только настоящую принцессу. Вот он и объехал весь свет, искал такую, да повсюду было что-то не то; принцесс было полно, а вот настоящие ли они, этого он никак не мог распознать до конца, всегда с ними было что-то не в порядке. Вот и воротился он домой и очень горевал: уж так ему хотелось настоящую принцессу.\r\n" + 
				"Как-то ввечеру разыгралась страшная буря; сверкала молния, гремел гром, дождь лил как из ведра, ужас что такое! И вдруг в городские ворота постучали, и старый король пошел отворять.\r\n" + 
				"У ворот стояла принцесса. Боже мой, на кого она была похожа от дождя и непогоды! Вода стекала с ее волос и платья, стекала прямо в носки башмаков и вытекала из пяток, а она говорила, что она настоящая принцесса.";
		
		for (String s : splitWords(story)) {
			System.out.println(s);
		}
		System.out.println("---------");
		for (String s : splitSentences(story)) {
			System.out.println(s);
		}
		System.out.println("------------");
		for (String s : splitParagr(story)) {
			System.out.println(s);
		}
		
	}
	
	//public static String sortParagr(String str) {
		
	//}
	
	public static String[] splitParagr(String str) {
		Pattern pattern = Pattern.compile("\r\n");
		return pattern.split(str);
	}
	
	public static String[] splitSentences(String str) {
		Pattern pattern = Pattern.compile("\\b(\\.+|!\\?|!+|\\?+)\\s*");
		return pattern.split(str);
	}
	
	public static String[] splitWords(String str) {
		Pattern pattern = Pattern.compile("\\s*\\b(\\s|,|\\.+|!\\?|!+|\\?+|;|:|-|—)\\s*"); //разделяем опираясь на конец слова, после которого идут знаки разделения слов
		return pattern.split(str);
	}

}
