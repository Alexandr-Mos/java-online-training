package my.home.text.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jdk.nashorn.api.tree.ForInLoopTree;

/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */

public class reg01 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "Жил-был принц! Он хотел взять себе в жены принцессу, да только настоящую принцессу. Вот он и объехал весь свет, искал такую, да повсюду было что-то не то; принцесс было полно, а вот настоящие ли они, этого он никак не мог распознать до конца, всегда с ними было что-то не в порядке. Вот и воротился он домой и очень горевал: уж так ему хотелось настоящую принцессу.\r\n" + 
				"Как-то ввечеру разыгралась страшная буря; сверкала молния, гремел гром, дождь лил как из ведра, ужас что такое! И вдруг в городские ворота постучали, и старый король пошел отворять.\r\n" + 
				"У ворот стояла принцесса. Боже мой, на кого она была похожа от дождя и непогоды! Вода стекала с ее волос и платья, стекала прямо в носки башмаков и вытекала из пяток, а она говорила, что она настоящая принцесса.\r\n" +
				"\"Ну, это мы разузнаем!\" — подумала старая королева, но ничего не сказала, а пошла в опочивальню, сняла с кровати все тюфяки и подушки и положила на доски горошину, а потом взяла двадцать тюфяков и положила их на горошину, а на тюфяки еще двадцать перин из гагачьего пуха.";
		ArrayList<ArrayList<ArrayList<String>>> story = new ArrayList<ArrayList<ArrayList<String>>>();
		
		for (String paragr : splitParagr(string)) {
			ArrayList<ArrayList<String>> paragrList = new ArrayList<ArrayList<String>>();
			for (String sentence : splitSentences(paragr)) {
				ArrayList<String> wordsList = new ArrayList<>();
				
				for (String word: splitWords(sentence)) {
					wordsList.add(word);
				}
				paragrList.add(wordsList);
			}
			story.add(paragrList);
		}
		Comparator<ArrayList<ArrayList<String>>> arrayComparator = new Comparator<ArrayList<ArrayList<String>>>() {
			public int compare(ArrayList<ArrayList<String>> arr1, ArrayList<ArrayList<String>> arr2) {
				return Integer.valueOf(arr1.size()).compareTo(Integer.valueOf(arr2.size()));
			}
		};
		Collections.sort(story, arrayComparator);
		for(ArrayList<ArrayList<String>> arr : story) {
			System.out.println(arr);
		}
		
		Comparator<String> wordComparator = new Comparator<String>() {
			public int compare(String arr1, String arr2) {
				return Integer.valueOf(arr1.length()).compareTo(Integer.valueOf(arr2.length()));
			}
		};
		
		for(ArrayList<ArrayList<String>> par : story) {
			for(ArrayList<String> sen : par) {
				Collections.sort(sen, wordComparator);
			}
		}
		System.out.println(story);
		
		for(ArrayList<ArrayList<String>> par : story) {
			for(ArrayList<String> sen : par) {
				Collections.sort(sen);
			}
		}
		System.out.println(story.get(1).get(0));
		
		
		
		//Story story = new Story(new Paragraph[splitParagr(string).length]);
		/*
		for (String s : splitParagr(string)) {
			
		}
		System.out.println("---------");
		for (String s : splitSentences(string)) {
			System.out.println(s);
		}
		System.out.println("------------");
		for (String s : splitWords(string)) {
			System.out.println(s);
		}
		*/
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
		Pattern pattern = Pattern.compile("\\b(\\s+|,|\\.+|!\\?|\\?!|!+|\\?+|;|:|-|—)\\s*"); //разделяем опираясь на конец слова, после которого идут знаки разделения слов
		//Pattern pattern = Pattern.compile("\\b\\w"); //разделяем опираясь на конец слова, после которого идут знаки разделения слов
		return pattern.split(str);
	}

}
