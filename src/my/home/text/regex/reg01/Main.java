package my.home.text.regex.reg01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.home.text.regex.reg01.Paragraph;

/* 
Cоздать приложение, разбирающее текст (текст хранится в строке) и 
позволяющее выполнять с текстом три различных операции: 
   - отсортировать абзацы по количеству предложений; 
   - в каждом предложении отсортировать слова по длине;
   - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
а в случае равенства – по алфавиту.
 */

public class Main {
	
	public static void main(String[] args) {
		String string = "Жил-был принц! Он хотел взять себе в жены принцессу, да только настоящую принцессу. Вот он и объехал весь свет, искал такую, да повсюду было что-то не то. Принцесс было полно, а вот настоящие ли они, этого он никак не мог распознать до конца, всегда с ними было что-то не в порядке. Вот и воротился он домой и очень горевал: уж так ему хотелось настоящую принцессу.\r\n" + 
						"Как-то ввечеру разыгралась страшная буря; сверкала молния, гремел гром, дождь лил как из ведра, ужас что такое! И вдруг в городские ворота постучали, и старый король пошел отворять.\r\n" + 
						"У ворот стояла принцесса. Боже мой, на кого она была похожа от дождя и непогоды! Вода стекала с ее волос и платья, стекала прямо в носки башмаков и вытекала из пяток, а она говорила, что она настоящая принцесса.\r\n" +
						"\"Ну, это мы разузнаем!\" — подумала старая королева. Но ничего не сказала, а пошла в опочивальню. Сняла с кровати все тюфяки и подушки и положила на доски горошину, а потом взяла двадцать тюфяков и положила их на горошину, а на тюфяки еще двадцать перин из гагачьего пуха.";
		ArrayList<Paragraph> story = new ArrayList<Paragraph>();
		
		for (String paragrStr : splitParagr(string)) {
			Paragraph paragraph = new Paragraph();
			
			for (String sentenceStr : splitSentences(paragrStr)) {
				Sentence sentence = new Sentence(splitWords(sentenceStr));
				
				paragraph.getSentences().add(sentence);
			}
			story.add(paragraph);
		}
		
		                                                                    
	
		System.out.println("--Сортировка параграфов по количеству предложений--");
		sortParagr(story);
		for(Paragraph arr : story) {
			System.out.println(arr);
		}
		System.out.println("--Сортировка слов по длине--");
		sortWords(story);
		for(Paragraph arr : story) {
			System.out.println(arr);
		}
		String chr = "а"; // кириллица
		System.out.printf("--Сортировка слов по количеству вхождений \'%s\' и алфавиту--\r\n", chr);
		sortByChar(story, chr);
		for(Paragraph arr : story) {
			System.out.println(arr);
		}
		System.out.println("---------");
		
		
	}
	
	public static void sortParagr(ArrayList<Paragraph> story) {
		Comparator<Paragraph> parComparator = (par1, par2) -> 
											  Integer.valueOf(par1.getSentences().size()).
											  compareTo(Integer.valueOf(par2.getSentences().size()));
		
		Collections.sort(story, parComparator);
	}
	
	public static void sortWords(ArrayList<Paragraph> story) {              
		Comparator<Word> wordComparator = (w1, w2) -> Integer.valueOf(w1.getValue().length()).
											compareTo(Integer.valueOf(w2.getValue().length()));
		
		for(Paragraph par : story) {
			for(Sentence sen : par.getSentences()) {
				Collections.sort(sen.getWords(), wordComparator);
			}
		}
	}
	
	public static void sortByChar(ArrayList<Paragraph> story, String ch) {
		Comparator<Word> comparator = (w1, w2) -> w1.compareTo(w2);
		//comparator.thenComparing((w1, w2) -> w2.getValue().compareTo(w1.getValue()));
		Pattern pattern = Pattern.compile(ch);
		Matcher matcher = null;
		
		for(Paragraph par : story) {
			for(Sentence sen : par.getSentences()) {				
				for(Word wrd : sen.getWords()) {
					matcher = pattern.matcher(wrd.getValue());
					while(matcher.find()) {
						wrd.incrementMatches();
					}
				}
				Collections.sort(sen.getWords(), comparator);
				Collections.reverse(sen.getWords());
			}
		}
	}
	
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
