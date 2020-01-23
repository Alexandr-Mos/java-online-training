package my.home.classes.composition.comp01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
	private ArrayList<Word> sentence = new ArrayList<Word>();
	
	public Sentence(String sentence) {
		Matcher matcher = Pattern.compile("[^ ]+").matcher(sentence);
		
		while (matcher.find()) {
			this.sentence.add(new Word(matcher.group()));
		}
	}
	
	public void addWord(Word word) {
		sentence.add(word);
	}
	
	public ArrayList<Word> getSentence() {
		return sentence;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		for (Word w : sentence) {
			sb.append(w.toString());
			sb.append(" ");
		}
		return sb.toString();
	}
	
}
